package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommonAladdin {

    @InterfaceC65349Pkn("activity_level")
    public final String activityLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonAladdin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAladdin) && o.LJ(this.activityLevel, ((CommonAladdin) obj).activityLevel);
    }

    public final int hashCode() {
        String str = this.activityLevel;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonAladdin(activityLevel=");
        return q.LIZIZ(LIZ, this.activityLevel, ')', LIZ);
    }

    public CommonAladdin(String str) {
        this.activityLevel = str;
    }

    public /* synthetic */ CommonAladdin(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
