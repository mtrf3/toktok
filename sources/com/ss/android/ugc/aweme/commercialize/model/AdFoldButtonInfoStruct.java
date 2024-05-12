package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdFoldButtonInfoStruct implements Serializable {

    @InterfaceC65349Pkn("disable_fold_cta")
    public final boolean disableFoldCTA;

    @InterfaceC65349Pkn("should_show")
    public final boolean shouldShow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdFoldButtonInfoStruct() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct.<init>():void");
    }

    public final boolean getDisableFoldCTA() {
        return this.disableFoldCTA;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public AdFoldButtonInfoStruct(boolean z, boolean z2) {
        this.shouldShow = z;
        this.disableFoldCTA = z2;
    }

    public /* synthetic */ AdFoldButtonInfoStruct(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
