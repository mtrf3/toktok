package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class HashtagStruct implements Serializable {

    @InterfaceC65349Pkn("hashtag_id")
    public String hashtagId;

    @InterfaceC65349Pkn("hashtag_name")
    public String hashtagName;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    public HashtagStruct() {
        this.hashtagId = "";
        this.hashtagName = "";
        this.stickerId = "";
    }

    public String getHashtagId() {
        return this.hashtagId;
    }

    public String getHashtagName() {
        return this.hashtagName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public void setHashtagName(String str) {
        this.hashtagName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public HashtagStruct(String str, String str2) {
        this.stickerId = "";
        this.hashtagId = str;
        this.hashtagName = str2;
    }
}
