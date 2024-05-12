package com.ss.android.ugc.aweme.legoImp.task;

import X.C35345Du1;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class CleanModel extends F9E {

    @InterfaceC65349Pkn("clean_alog")
    public final boolean cleanALog;

    @InterfaceC65349Pkn("clean_apm")
    public final boolean cleanApm;

    @InterfaceC65349Pkn("clean_npth")
    public final boolean cleanNpth;

    public CleanModel() {
        this(false, false, false, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.cleanALog), Boolean.valueOf(this.cleanApm), Boolean.valueOf(this.cleanNpth)};
    }

    public CleanModel(boolean z, boolean z2, boolean z3) {
        this.cleanALog = z;
        this.cleanApm = z2;
        this.cleanNpth = z3;
    }

    public CleanModel(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C35345Du1.LIZ : z, (i & 2) != 0 ? C35345Du1.LIZ : z2, (i & 4) != 0 ? C35345Du1.LIZ : z3);
    }
}
