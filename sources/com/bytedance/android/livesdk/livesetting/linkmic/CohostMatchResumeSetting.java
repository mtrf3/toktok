package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CohostMatchResumeSetting {

    @InterfaceC65349Pkn("enable_cohost_match_resume")
    public int enableMatchResume;

    @InterfaceC65349Pkn("max_app_exit_duration")
    public int maxAppExitDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CohostMatchResumeSetting() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.CohostMatchResumeSetting.<init>():void");
    }

    public CohostMatchResumeSetting(int i, int i2) {
        this.enableMatchResume = i;
        this.maxAppExitDuration = i2;
    }

    public /* synthetic */ CohostMatchResumeSetting(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 27 : i2);
    }
}
