package com.ss.android.ugc.aweme.shortvideo.video2sticker.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Video2StickerImageQuality extends F9E {

    @InterfaceC65349Pkn("fps")
    public final int fps;

    @InterfaceC65349Pkn("res_width")
    public final int resWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Video2StickerImageQuality() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.video2sticker.settings.Video2StickerImageQuality.<init>():void");
    }

    public static /* synthetic */ Video2StickerImageQuality copy$default(Video2StickerImageQuality video2StickerImageQuality, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = video2StickerImageQuality.resWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = video2StickerImageQuality.fps;
        }
        return video2StickerImageQuality.copy(i, i2);
    }

    public final Video2StickerImageQuality copy(int i, int i2) {
        return new Video2StickerImageQuality(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.resWidth), Integer.valueOf(this.fps)};
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getResWidth() {
        return this.resWidth;
    }

    public Video2StickerImageQuality(int i, int i2) {
        this.resWidth = i;
        this.fps = i2;
    }

    public /* synthetic */ Video2StickerImageQuality(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 720 : i, (i3 & 2) != 0 ? 16 : i2);
    }
}
