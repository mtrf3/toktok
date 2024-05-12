package com.ss.android.ugc.aweme.plugin.progressbar;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewUserProgressModel$Stage {

    @InterfaceC65349Pkn("progress_bar_copy")
    public String progressBarCopy;

    @InterfaceC65349Pkn("range")
    public List<Integer> range;

    public NewUserProgressModel$Stage() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserProgressModel$Stage)) {
            return false;
        }
        NewUserProgressModel$Stage newUserProgressModel$Stage = (NewUserProgressModel$Stage) obj;
        return o.LJ(this.progressBarCopy, newUserProgressModel$Stage.progressBarCopy) && o.LJ(this.range, newUserProgressModel$Stage.range);
    }

    public final int hashCode() {
        String str = this.progressBarCopy;
        return this.range.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stage(progressBarCopy=");
        LIZ.append(this.progressBarCopy);
        LIZ.append(", range=");
        return C1NE.LIZIZ(LIZ, this.range, ')', LIZ);
    }

    public NewUserProgressModel$Stage(String str, List<Integer> range) {
        o.LJIIIZ(range, "range");
        this.progressBarCopy = str;
        this.range = range;
    }

    public NewUserProgressModel$Stage(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
