package com.ss.android.ugc.aweme.services.shoutout;

import X.HH1;

/* loaded from: classes8.dex */
public final class AVAnchorPublishStruct {
    public final String img;
    public final String keyword;
    public final String url;

    public final String getImg() {
        return this.img;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getUrl() {
        return this.url;
    }

    public AVAnchorPublishStruct(String str, String str2, String str3) {
        HH1.LIZ(str, "img", str2, "url", str3, "keyword");
        this.img = str;
        this.url = str2;
        this.keyword = str3;
    }
}
