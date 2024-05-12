package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GiftHighTrafficDropMessageConfig {

    @InterfaceC65349Pkn("clear_percentage")
    public int clearPercentage;

    @InterfaceC65349Pkn("disable_skip_lower_combo")
    public int disableSkipLowerCombo;

    @InterfaceC65349Pkn("insert_big_gift_num")
    public int insertBigGiftNum;

    @InterfaceC65349Pkn("insertion_interval")
    public long insertInterval;

    @InterfaceC65349Pkn("insert_small_gift_num")
    public int insertSmallGiftNum;

    @InterfaceC65349Pkn("max_queue_length")
    public int maxQueueLength;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GiftHighTrafficDropMessageConfig() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 63
            r9 = 0
            r0 = r10
            r2 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageConfig.<init>():void");
    }

    public GiftHighTrafficDropMessageConfig(int i, int i2, long j, int i3, int i4, int i5) {
        this.maxQueueLength = i;
        this.clearPercentage = i2;
        this.insertInterval = j;
        this.insertBigGiftNum = i3;
        this.insertSmallGiftNum = i4;
        this.disableSkipLowerCombo = i5;
    }

    public /* synthetic */ GiftHighTrafficDropMessageConfig(int i, int i2, long j, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0L : j, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5);
    }
}
