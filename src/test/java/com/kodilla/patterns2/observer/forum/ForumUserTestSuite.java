package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic("Need help!!!");
        ForumTopic javaToolsForum = new JavaToolsForumTopic("Some tool question.");
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("Post no 1");
        javaHelpForum.addPost("Post no 2");
        javaToolsForum.addPost("Post no 3");
        javaHelpForum.addPost("Post no 4");
        javaToolsForum.addPost("Post no 5");

        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}