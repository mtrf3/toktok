package com.ss.android.ugc.aweme.services.publish;

import X.V0N;

/* loaded from: classes4.dex */
public enum AVPublishPageScene {
    MAIN("main"),
    EDIT_POST("edit_post");

    public final String pageScene;

    public static AVPublishPageScene valueOf(String str) {
        return (AVPublishPageScene) V0N.LJJJ(AVPublishPageScene.class, str);
    }

    public final String getPageScene() {
        return this.pageScene;
    }

    AVPublishPageScene(String str) {
        this.pageScene = str;
    }
}
