package com.ss.android.ugc.aweme.feed.assem.music;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerShowIntervalTimeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class MusicCapsuleConfig extends F9E {

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("interval")
    public final long interval;

    @InterfaceC65349Pkn("left_strategy")
    public final int leftStrategy;

    @InterfaceC65349Pkn("music_cover_threshold")
    public final float musicCoverThreshold;

    @InterfaceC65349Pkn("music_shoot_threshold")
    public final float musicShootThreshold;

    @InterfaceC65349Pkn("right_strategy")
    public final int rightStrategy;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicCapsuleConfig() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r8 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r0 = r12
            r2 = r1
            r5 = r1
            r6 = r3
            r9 = r8
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.MusicCapsuleConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.leftStrategy), Integer.valueOf(this.rightStrategy), Long.valueOf(this.duration), Integer.valueOf(this.count), Long.valueOf(this.interval), Float.valueOf(this.musicCoverThreshold), Float.valueOf(this.musicShootThreshold)};
    }

    public MusicCapsuleConfig(int i, int i2, long j, int i3, long j2, float f, float f2) {
        this.leftStrategy = i;
        this.rightStrategy = i2;
        this.duration = j;
        this.count = i3;
        this.interval = j2;
        this.musicCoverThreshold = f;
        this.musicShootThreshold = f2;
    }

    public /* synthetic */ MusicCapsuleConfig(int i, int i2, long j, int i3, long j2, float f, float f2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) == 0 ? i2 : 0, (i4 & 4) != 0 ? 3L : j, (i4 & 8) != 0 ? 3 : i3, (i4 & 16) != 0 ? LiveInsertStickerShowIntervalTimeSetting.DEFAULT : j2, (i4 & 32) != 0 ? 0.0f : f, (i4 & 64) == 0 ? f2 : 0.0f);
    }
}
