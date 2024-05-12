package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BottomTab {

    @InterfaceC65349Pkn("bottom_tab_key")
    public final String bottomTabKey;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BottomTab) && o.LJ(this.bottomTabKey, ((BottomTab) obj).bottomTabKey);
    }

    public final int hashCode() {
        String str = this.bottomTabKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomTab(bottomTabKey=");
        return q.LIZIZ(LIZ, this.bottomTabKey, ')', LIZ);
    }

    public BottomTab(String str) {
        this.bottomTabKey = str;
    }
}
