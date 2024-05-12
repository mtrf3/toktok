package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PostRechargeRetentionParams {

    @InterfaceC65349Pkn("enabled")
    public boolean enabled;

    @InterfaceC65349Pkn("max_sheet_close_count")
    public long maxSheetCloseCount;

    @InterfaceC65349Pkn("retention_popup_cooldown")
    public long popupCooldown;

    @InterfaceC65349Pkn("retention_type")
    public int retentionType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PostRechargeRetentionParams() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 15
            r8 = 0
            r0 = r9
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.PostRechargeRetentionParams.<init>():void");
    }

    public PostRechargeRetentionParams(boolean z, int i, long j, long j2) {
        this.enabled = z;
        this.retentionType = i;
        this.popupCooldown = j;
        this.maxSheetCloseCount = j2;
    }

    public /* synthetic */ PostRechargeRetentionParams(boolean z, int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? i : 0, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0L : j2);
    }
}
