package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiLiveUserApplyPermission extends F9E {

    @InterfaceC65349Pkn("applier_sort_gift_score_threshold")
    public long applierSortGiftScoreThreshold;

    @InterfaceC65349Pkn("applier_sort_setting")
    public long applierSortSetting;

    @InterfaceC65349Pkn("multi_live_apply_permission")
    public int multiLiveApplyPermission;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiLiveUserApplyPermission() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r4 = r2
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.multiLiveApplyPermission), Long.valueOf(this.applierSortSetting), Long.valueOf(this.applierSortGiftScoreThreshold)};
    }

    public MultiLiveUserApplyPermission(int i, long j, long j2) {
        this.multiLiveApplyPermission = i;
        this.applierSortSetting = j;
        this.applierSortGiftScoreThreshold = j2;
    }

    public /* synthetic */ MultiLiveUserApplyPermission(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2);
    }
}
