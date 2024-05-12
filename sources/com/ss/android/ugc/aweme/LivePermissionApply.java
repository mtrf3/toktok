package com.ss.android.ugc.aweme;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LivePermissionApply extends F9E {

    @InterfaceC65349Pkn("enable_screenshot")
    public boolean enableLiveScreenshot;

    @InterfaceC65349Pkn("enable_third_party")
    public boolean enableLiveThirdParty;

    @InterfaceC65349Pkn("enable_live_video")
    public boolean enableLiveVideo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LivePermissionApply() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.LivePermissionApply.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableLiveThirdParty), Boolean.valueOf(this.enableLiveScreenshot), Boolean.valueOf(this.enableLiveVideo)};
    }

    public LivePermissionApply(boolean z, boolean z2, boolean z3) {
        this.enableLiveThirdParty = z;
        this.enableLiveScreenshot = z2;
        this.enableLiveVideo = z3;
    }

    public /* synthetic */ LivePermissionApply(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
