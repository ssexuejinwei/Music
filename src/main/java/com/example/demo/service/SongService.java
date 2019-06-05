package com.example.demo.service;

import com.example.demo.entity.Song;
import com.example.demo.entity.comments;
import com.example.demo.entity.result.ResultEntity;

import java.util.ArrayList;

public interface SongService {
    boolean playSong(String songid,String userid);
    ArrayList<Song> getCommandSong(String userid);
    ArrayList<Song> getSongByNamePart(String name);
    ResultEntity getSingersInSong(String songid);
    ArrayList<comments> getCommentsInSong(String songid);
    ResultEntity getBoughtSongByUserId(String userid);
    Song getSongById(String songid);
    boolean commentSong(String words,String songid,String userid);
	String isSongBought(String songid, String albumid, String userid);
}
