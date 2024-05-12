package X;

import android.view.View;

/* renamed from: X.6bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163756bj {
    public static final InterfaceC45540Hu4 LIZ(View view) {
        WM7 LJI = C78598Ut0.LJI(view);
        if (LJI != null) {
            return LIZIZ(LJI);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final InterfaceC45540Hu4 LIZIZ(WM7 wm7) {
        Object obj;
        Object obj2 = null;
        if (wm7 == null || (obj = wm7.mActivity) == null) {
            return null;
        }
        if (obj instanceof InterfaceC163766bk) {
            ((InterfaceC163766bk) obj).LJLJL();
            Object LJIIL = C1XY.LJIIL(wm7);
            if (LJIIL != null) {
                if (LJIIL instanceof InterfaceC45540Hu4) {
                    obj2 = LJIIL;
                }
                return (InterfaceC45540Hu4) obj2;
            }
        }
        if (obj instanceof InterfaceC45540Hu4) {
            obj2 = obj;
        }
        return (InterfaceC45540Hu4) obj2;
    }
}
