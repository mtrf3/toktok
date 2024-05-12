package com.ss.android.ugc.aweme.services.edit;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PromoteReplaceMusicRequest {

    @InterfaceC65349Pkn("item_id")
    public String itemID = "";

    @InterfaceC65349Pkn("original_music_id")
    public String originalMusicID = "";

    @InterfaceC65349Pkn("replace_music_request")
    public ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();

    @InterfaceC65349Pkn("retry_scene")
    public int retryScene;

    public final String getItemID() {
        return this.itemID;
    }

    public final String getOriginalMusicID() {
        return this.originalMusicID;
    }

    public final ReplaceMusicRequest getReplaceMusicRequest() {
        return this.replaceMusicRequest;
    }

    public final int getRetryScene() {
        return this.retryScene;
    }

    public final void setItemID(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.itemID = str;
    }

    public final void setOriginalMusicID(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.originalMusicID = str;
    }

    public final void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest) {
        o.LJIIIZ(replaceMusicRequest, "<set-?>");
        this.replaceMusicRequest = replaceMusicRequest;
    }

    public final void setRetryScene(int i) {
        this.retryScene = i;
    }
}
