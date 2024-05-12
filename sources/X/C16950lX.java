package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16950lX {
    public static InterfaceC20740re LIZ = null;
    public static boolean LIZIZ = true;

    public static View LIZ(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        return LIZIZ(context, i, viewGroup, z, i2, false);
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z, int i2, boolean z2) {
        View LJ;
        if (!LIZIZ) {
            if (z2) {
                return null;
            }
            return C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, viewGroup, z);
        }
        InterfaceC17000lc interfaceC17000lc = C17010ld.LIZ.get(i);
        if (interfaceC17000lc == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("layout id :");
            LIZ2.append(Integer.toHexString(i));
            LIZ2.append(" does not match any inflator, inflate with android.view.LayoutInflater");
            X1D.LIZIZ(LIZ2);
            if (LIZ != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            if (z2) {
                return null;
            }
            return C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, viewGroup, z);
        }
        try {
            if (!C35825E4f.LIZ()) {
                LJ = interfaceC17000lc.LJ(context, viewGroup, z);
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                LJ = interfaceC17000lc.LJ(context, viewGroup, z);
                C35825E4f.LIZIZ(i, SystemClock.elapsedRealtime() - elapsedRealtime, context, "x2c");
            }
            if (LIZ != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return LJ;
        } catch (Throwable th) {
            InterfaceC20740re interfaceC20740re = LIZ;
            if (interfaceC20740re != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
                ((FOP) ((C1VC) interfaceC20740re).LIZ).LIZ(th);
            }
            if (!C78598Ut0.LJLJI) {
                if (z2) {
                    return null;
                }
                return C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, viewGroup, z);
            }
            StringBuilder LJ2 = C7MY.LJ("the inflator with id: ", i, " inflated failed ");
            LJ2.append(th.getMessage());
            LJ2.append(" , inflate with android.view.LayoutInflater");
            X1D.LIZIZ(LJ2);
            throw new IllegalStateException(th);
        }
    }
}
