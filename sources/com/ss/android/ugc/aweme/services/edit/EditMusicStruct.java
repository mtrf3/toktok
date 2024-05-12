package com.ss.android.ugc.aweme.services.edit;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditMusicStruct {

    @InterfaceC65349Pkn("music_edit_scene")
    public int musicEditScene;

    @InterfaceC65349Pkn("music_id")
    public String musicID = "";

    @InterfaceC65349Pkn("music_volume")
    public String musicVolume = "";

    @InterfaceC65349Pkn("music_time_range")
    public MusicTimeStruct musicTime = new MusicTimeStruct();

    public final int getMusicEditScene() {
        return this.musicEditScene;
    }

    public final String getMusicID() {
        return this.musicID;
    }

    public final MusicTimeStruct getMusicTime() {
        return this.musicTime;
    }

    public final String getMusicVolume() {
        return this.musicVolume;
    }

    public final void setMusicEditScene(int i) {
        this.musicEditScene = i;
    }

    public final void setMusicID(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.musicID = str;
    }

    public final void setMusicTime(MusicTimeStruct musicTimeStruct) {
        o.LJIIIZ(musicTimeStruct, "<set-?>");
        this.musicTime = musicTimeStruct;
    }

    public final void setMusicVolume(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.musicVolume = str;
    }
}
