package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06260Mk {
    public static final C06250Mj LIZ = new ThreadLocal<PointF>() { // from class: X.0Mj
        @Override // java.lang.ThreadLocal
        public final PointF initialValue() {
            return new PointF();
        }
    };

    public static PointF LIZ(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int LIZJ(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float LIZIZ(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void LIZLLL(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2, InterfaceC34841Yi interfaceC34841Yi) {
        if (c263711t.LIZ(i, interfaceC34841Yi.getName())) {
            String name = interfaceC34841Yi.getName();
            c263711t2.getClass();
            C263711t c263711t3 = new C263711t(c263711t2);
            c263711t3.LIZ.add(name);
            C263711t c263711t4 = new C263711t(c263711t3);
            c263711t4.LIZIZ = interfaceC34841Yi;
            ((ArrayList) list).add(c263711t4);
        }
    }
}
