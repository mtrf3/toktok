package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DMAlbumSelectConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("max_media_count")
    public final int maxSelectCount;

    @InterfaceC65349Pkn("max_video_duration")
    public final int maxVideoDuration;

    @InterfaceC65349Pkn("show_safety_notice_time")
    public final int showSafetyNoticeTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMAlbumSelectConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.camera.config.DMAlbumSelectConfig.<init>():void");
    }

    public static /* synthetic */ DMAlbumSelectConfig copy$default(DMAlbumSelectConfig dMAlbumSelectConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dMAlbumSelectConfig.maxSelectCount;
        }
        if ((i4 & 2) != 0) {
            i2 = dMAlbumSelectConfig.maxVideoDuration;
        }
        if ((i4 & 4) != 0) {
            i3 = dMAlbumSelectConfig.showSafetyNoticeTime;
        }
        return dMAlbumSelectConfig.copy(i, i2, i3);
    }

    public final DMAlbumSelectConfig copy(int i, int i2, int i3) {
        return new DMAlbumSelectConfig(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxSelectCount), Integer.valueOf(this.maxVideoDuration), Integer.valueOf(this.showSafetyNoticeTime)};
    }

    public final int getMaxSelectCount() {
        return this.maxSelectCount;
    }

    public final int getMaxVideoDuration() {
        return this.maxVideoDuration;
    }

    public final int getShowSafetyNoticeTime() {
        return this.showSafetyNoticeTime;
    }

    public DMAlbumSelectConfig(int i, int i2, int i3) {
        this.maxSelectCount = i;
        this.maxVideoDuration = i2;
        this.showSafetyNoticeTime = i3;
    }

    public /* synthetic */ DMAlbumSelectConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 9 : i, (i4 & 2) != 0 ? 15000 : i2, (i4 & 4) != 0 ? 5 : i3);
    }
}
