package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum PhotoSourceFromScene {
    DEFAULT(""),
    PUBLISH("publish");

    public final String desc;

    public static PhotoSourceFromScene valueOf(String str) {
        return (PhotoSourceFromScene) V0N.LJJJ(PhotoSourceFromScene.class, str);
    }

    public final String getDesc() {
        return this.desc;
    }

    PhotoSourceFromScene(String str) {
        this.desc = str;
    }
}
