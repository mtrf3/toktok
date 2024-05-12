package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.91m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2301491m {
    public final View LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2301491m)) {
            return false;
        }
        C2301491m c2301491m = (C2301491m) obj;
        return o.LJ(this.LIZ, c2301491m.LIZ) && o.LJ(this.LIZIZ, c2301491m.LIZIZ);
    }

    public final int hashCode() {
        View view = this.LIZ;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        View view2 = this.LIZIZ;
        return hashCode + (view2 != null ? view2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoViewFrameInfo(rootView=");
        LIZ.append(this.LIZ);
        LIZ.append(", videoView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C2301491m(View view, View view2) {
        this.LIZ = view;
        this.LIZIZ = view2;
    }
}
