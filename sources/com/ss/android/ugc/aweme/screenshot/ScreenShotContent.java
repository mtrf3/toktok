package com.ss.android.ugc.aweme.screenshot;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ScreenShotContent extends F9E {
    public final Object content;
    public final String imagePath;
    public final ScreenShotShareMobParam mobParam;

    public static /* synthetic */ ScreenShotContent copy$default(ScreenShotContent screenShotContent, String str, Object obj, ScreenShotShareMobParam screenShotShareMobParam, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = screenShotContent.imagePath;
        }
        if ((i & 2) != 0) {
            obj = screenShotContent.content;
        }
        if ((i & 4) != 0) {
            screenShotShareMobParam = screenShotContent.mobParam;
        }
        return screenShotContent.copy(str, obj, screenShotShareMobParam);
    }

    public final ScreenShotContent copy(String imagePath, Object content, ScreenShotShareMobParam mobParam) {
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(mobParam, "mobParam");
        return new ScreenShotContent(imagePath, content, mobParam);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imagePath, this.content, this.mobParam};
    }

    public final Object getContent() {
        return this.content;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final ScreenShotShareMobParam getMobParam() {
        return this.mobParam;
    }

    public ScreenShotContent(String imagePath, Object content, ScreenShotShareMobParam mobParam) {
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(mobParam, "mobParam");
        this.imagePath = imagePath;
        this.content = content;
        this.mobParam = mobParam;
    }
}
