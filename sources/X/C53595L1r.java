package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.L1r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53595L1r {
    public final EnumC53596L1s LIZ;
    public final WeakReference<View> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53595L1r)) {
            return false;
        }
        C53595L1r c53595L1r = (C53595L1r) obj;
        return this.LIZ == c53595L1r.LIZ && o.LJ(this.LIZIZ, c53595L1r.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategorizedFeedView(category=");
        LIZ.append(this.LIZ);
        LIZ.append(", view=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C53595L1r(EnumC53596L1s category, WeakReference<View> weakReference) {
        o.LJIIIZ(category, "category");
        this.LIZ = category;
        this.LIZIZ = weakReference;
    }
}
