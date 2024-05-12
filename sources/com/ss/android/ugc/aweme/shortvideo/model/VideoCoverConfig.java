package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoCoverConfig extends F9E {
    public final Bitmap.Config config;
    public final int displayHeight;
    public final int displayWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoCoverConfig() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 7
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig.<init>():void");
    }

    public static /* synthetic */ VideoCoverConfig copy$default(VideoCoverConfig videoCoverConfig, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoCoverConfig.displayWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = videoCoverConfig.displayHeight;
        }
        if ((i3 & 4) != 0) {
            config = videoCoverConfig.config;
        }
        return videoCoverConfig.copy(i, i2, config);
    }

    public final VideoCoverConfig copy(int i, int i2, Bitmap.Config config) {
        o.LJIIIZ(config, "config");
        return new VideoCoverConfig(i, i2, config);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.displayWidth), Integer.valueOf(this.displayHeight), this.config};
    }

    public VideoCoverConfig(int i, int i2, Bitmap.Config config) {
        o.LJIIIZ(config, "config");
        this.displayWidth = i;
        this.displayHeight = i2;
        this.config = config;
    }

    public /* synthetic */ VideoCoverConfig(int i, int i2, Bitmap.Config config, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? Bitmap.Config.ARGB_8888 : config);
    }
}
