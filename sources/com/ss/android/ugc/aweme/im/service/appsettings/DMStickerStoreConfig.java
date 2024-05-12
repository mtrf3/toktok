package com.ss.android.ugc.aweme.im.service.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DMStickerStoreConfig extends F9E {

    @InterfaceC65349Pkn("sticker_store_preload_delay")
    public final long delay;

    @InterfaceC65349Pkn("sticker_store_enable_flag")
    public final boolean enable;

    @InterfaceC65349Pkn("enable_video_sticker_origin_video_check")
    public final boolean videoCheck;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMStickerStoreConfig() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r4 = r1
            r0.<init>(r1, r2, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.appsettings.DMStickerStoreConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Long.valueOf(this.delay), Boolean.valueOf(this.videoCheck)};
    }

    public DMStickerStoreConfig(boolean z, long j, boolean z2) {
        this.enable = z;
        this.delay = j;
        this.videoCheck = z2;
    }

    public /* synthetic */ DMStickerStoreConfig(boolean z, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z2);
    }
}
