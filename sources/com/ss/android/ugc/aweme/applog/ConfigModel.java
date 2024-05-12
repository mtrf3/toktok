package com.ss.android.ugc.aweme.applog;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ConfigModel extends F9E {

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("isolation_type")
    public final Set<String> isolationType;

    @InterfaceC65349Pkn("switch_bdtracker")
    public final boolean switchBdTracker;

    public ConfigModel() {
        this(false, false, null, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.switchBdTracker), Boolean.valueOf(this.enabled), this.isolationType};
    }

    public ConfigModel(boolean z, boolean z2, Set<String> isolationType) {
        o.LJIIIZ(isolationType, "isolationType");
        this.switchBdTracker = z;
        this.enabled = z2;
        this.isolationType = isolationType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConfigModel(boolean r3, boolean r4, java.util.Set r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r2 = this;
            r0 = r6 & 1
            java.lang.String r1 = "local_test"
            if (r0 == 0) goto Lf
            java.lang.String r0 = X.EF7.LJIILIIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L2c
            r3 = 1
        Lf:
            r0 = r6 & 2
            if (r0 == 0) goto L1c
            java.lang.String r0 = X.EF7.LJIILIIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L2a
            r4 = 1
        L1c:
            r0 = r6 & 4
            if (r0 == 0) goto L26
            java.lang.String r0 = "us"
            java.util.Set r5 = X.C77275UUl.LJII(r0)
        L26:
            r2.<init>(r3, r4, r5)
            return
        L2a:
            r4 = 0
            goto L1c
        L2c:
            r3 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.applog.ConfigModel.<init>(boolean, boolean, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
