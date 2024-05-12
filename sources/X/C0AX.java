package X;

import android.view.View;
import android.view.ViewGroup;
import sun.misc.Unsafe;

/* renamed from: X.0AX, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0AX {
    public static /* synthetic */ boolean LIZJ(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static void LIZIZ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
    }

    public static void LIZ(ViewGroup viewGroup, View view, int i) {
        view.setTag(i, Integer.valueOf(viewGroup.hashCode()));
    }
}
