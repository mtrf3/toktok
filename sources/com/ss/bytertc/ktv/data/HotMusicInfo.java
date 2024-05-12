package com.ss.bytertc.ktv.data;

/* loaded from: classes33.dex */
public class HotMusicInfo {
    public String hotName;
    public MusicHotType hotType;
    public MusicInfo[] musicInfos;

    public HotMusicInfo(MusicHotType musicHotType, String str, MusicInfo[] musicInfoArr) {
        this.hotType = musicHotType;
        this.hotName = str;
        this.musicInfos = musicInfoArr;
    }
}
