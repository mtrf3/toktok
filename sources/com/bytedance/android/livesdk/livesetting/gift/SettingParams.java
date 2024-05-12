package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SettingParams {

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("first_fetch_delay")
    public long firstFetchDelay;

    @InterfaceC65349Pkn("force_predict_success")
    public boolean forcePredictSuccess;

    @InterfaceC65349Pkn("next_fetch_delay")
    public long nextFetchDelay;

    @InterfaceC65349Pkn("remove_fetch_after_panel_opened")
    public int removeFetchAfterPanelOpened;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SettingParams() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 31
            r9 = 0
            r0 = r10
            r4 = r2
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.SettingParams.<init>():void");
    }

    public SettingParams(int i, long j, long j2, int i2, boolean z) {
        this.enable = i;
        this.firstFetchDelay = j;
        this.nextFetchDelay = j2;
        this.removeFetchAfterPanelOpened = i2;
        this.forcePredictSuccess = z;
    }

    public /* synthetic */ SettingParams(int i, long j, long j2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 60L : j, (i3 & 4) == 0 ? j2 : 60L, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z);
    }
}
