package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.4nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119904nC {
    public final int LIZ;
    public final View LIZIZ;

    public C119904nC() {
        this(3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C119904nC)) {
            return false;
        }
        C119904nC c119904nC = (C119904nC) obj;
        return this.LIZ == c119904nC.LIZ && o.LJ(this.LIZIZ, c119904nC.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        View view = this.LIZIZ;
        return i + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomInnerPushBanner(customArea=");
        LIZ.append(this.LIZ);
        LIZ.append(", customView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C119904nC(int i, View view) {
        this.LIZ = i;
        this.LIZIZ = view;
    }
}
