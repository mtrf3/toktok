package com.bytedance.ies.cutsame.source.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoItem {
    public String content;
    public String algorithm = "";

    @InterfaceC65349Pkn("video_conf")
    public String jsonResult = "";

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final void setAlgorithm(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.algorithm = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setJsonResult(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.jsonResult = str;
    }
}
