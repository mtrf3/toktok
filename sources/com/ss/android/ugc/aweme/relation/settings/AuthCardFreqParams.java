package com.ss.android.ugc.aweme.relation.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AuthCardFreqParams extends F9E {

    @InterfaceC65349Pkn("max_auto_hide_days")
    public final int maxAutoHideDays;

    @InterfaceC65349Pkn("max_delete_count")
    public final int maxDeleteCount;

    @InterfaceC65349Pkn("max_delete_hide_days")
    public final int maxDeleteHideDays;

    @InterfaceC65349Pkn("max_exposure_count")
    public final int maxExposureCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuthCardFreqParams() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.settings.AuthCardFreqParams.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxExposureCount), Integer.valueOf(this.maxAutoHideDays), Integer.valueOf(this.maxDeleteHideDays), Integer.valueOf(this.maxDeleteCount)};
    }

    public AuthCardFreqParams(int i, int i2, int i3, int i4) {
        this.maxExposureCount = i;
        this.maxAutoHideDays = i2;
        this.maxDeleteHideDays = i3;
        this.maxDeleteCount = i4;
    }

    public /* synthetic */ AuthCardFreqParams(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 10 : i, (i5 & 2) != 0 ? 14 : i2, (i5 & 4) != 0 ? 14 : i3, (i5 & 8) != 0 ? 3 : i4);
    }
}
