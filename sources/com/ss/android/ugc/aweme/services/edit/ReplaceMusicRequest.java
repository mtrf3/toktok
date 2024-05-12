package com.ss.android.ugc.aweme.services.edit;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReplaceMusicRequest {

    @InterfaceC65349Pkn("original_vid")
    public String originalVid;

    @InterfaceC65349Pkn("voice_volume")
    public Integer voiceVolume;

    @InterfaceC65349Pkn("item_id")
    public String itemID = "";

    @InterfaceC65349Pkn("new_music_info")
    public EditMusicStruct editMusicStruct = new EditMusicStruct();

    @InterfaceC65349Pkn("creation_id")
    public String creationId = "";

    @InterfaceC65349Pkn("music_id")
    public String musicId = "";

    public final String getCreationId() {
        return this.creationId;
    }

    public final EditMusicStruct getEditMusicStruct() {
        return this.editMusicStruct;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getOriginalVid() {
        return this.originalVid;
    }

    public final Integer getVoiceVolume() {
        return this.voiceVolume;
    }

    public final void setCreationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.creationId = str;
    }

    public final void setEditMusicStruct(EditMusicStruct editMusicStruct) {
        o.LJIIIZ(editMusicStruct, "<set-?>");
        this.editMusicStruct = editMusicStruct;
    }

    public final void setItemID(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.itemID = str;
    }

    public final void setMusicId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.musicId = str;
    }

    public final void setOriginalVid(String str) {
        this.originalVid = str;
    }

    public final void setVoiceVolume(Integer num) {
        this.voiceVolume = num;
    }
}
