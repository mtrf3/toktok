package com.ss.android.ugc.aweme.im.service.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IMUserPortraitDelaySettingsModel extends F9E {

    @InterfaceC65349Pkn("im_user_portrait_long_delay")
    public final long longDelay;

    @InterfaceC65349Pkn("im_user_portrait_short_delay")
    public final long shortDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IMUserPortraitDelaySettingsModel() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.appsettings.IMUserPortraitDelaySettingsModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.shortDelay), Long.valueOf(this.longDelay)};
    }

    public IMUserPortraitDelaySettingsModel(long j, long j2) {
        this.shortDelay = j;
        this.longDelay = j2;
    }

    public /* synthetic */ IMUserPortraitDelaySettingsModel(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 8000L : j, (i & 2) != 0 ? 30000L : j2);
    }
}
