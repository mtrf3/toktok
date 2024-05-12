package X;

import Y.ARunnableS50S0100000_14;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.Vmw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80770Vmw {
    public static final int LJIIJJI = ((Number) C34869DmL.LIZ.getValue()).intValue();
    public final InterfaceC80793VnJ LIZ;
    public final boolean LIZIZ = ((Boolean) C34458Dfi.LIZIZ.getValue()).booleanValue();
    public final boolean LIZJ = ((Boolean) C33991DVr.LIZIZ.getValue()).booleanValue();
    public final boolean LIZLLL = ((Boolean) C34458Dfi.LIZJ.getValue()).booleanValue();
    public boolean LJ = false;
    public boolean LJFF = false;
    public final Handler LJI = new Handler(C16880lQ.LLJJJJ());
    public VIQ LJII = VIQ.NOT_OPT;
    public boolean LJIIIIZZ = false;
    public int LJIIIZ = 0;
    public int LJIIJ = -1;

    public final boolean LIZ() {
        if (!this.LJFF) {
            return false;
        }
        if (this.LIZIZ) {
            return this.LJ;
        }
        if (!this.LIZLLL) {
            return false;
        }
        return true;
    }

    public final void LIZIZ() {
        if (!LIZ()) {
            return;
        }
        if (!this.LIZJ || Build.VERSION.SDK_INT < 24) {
            this.LJI.postDelayed(new ARunnableS50S0100000_14(this, 68), 300L);
        }
    }

    public final void LJ() {
        Object obj;
        if (!LIZ()) {
            return;
        }
        if (this.LJII == VIQ.WAIT_OPT) {
            this.LJII = VIQ.OPT_ING;
            int childCount = this.LIZ.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View LIZIZ = this.LIZ.LIZIZ(i);
                if (LIZIZ != null) {
                    if (this.LIZ.LJ(LIZIZ)) {
                        LIZJ(LIZIZ);
                    } else if (LIZ()) {
                        try {
                            C62822Ol8 c62822Ol8 = C36518EUw.LIZ;
                            Field field = (Field) c62822Ol8.getValue();
                            if (field != null) {
                                obj = field.get(LIZIZ);
                            } else {
                                obj = null;
                            }
                            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) obj).intValue();
                            Field field2 = (Field) c62822Ol8.getValue();
                            if (field2 != null) {
                                field2.set(LIZIZ, Integer.valueOf((intValue & (-13)) | 4));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public final void LJFF() {
        if (!LIZ()) {
            return;
        }
        VIQ viq = this.LJII;
        VIQ viq2 = VIQ.NOT_OPT;
        if (viq == viq2) {
            return;
        }
        this.LJII = viq2;
        int childCount = this.LIZ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View LIZIZ = this.LIZ.LIZIZ(i);
            if (LIZIZ != null) {
                LIZJ(LIZIZ);
            }
        }
    }

    public C80770Vmw(InterfaceC80793VnJ interfaceC80793VnJ) {
        this.LIZ = interfaceC80793VnJ;
    }

    public final void LIZJ(View view) {
        Object obj;
        if (!LIZ()) {
            return;
        }
        try {
            C62822Ol8 c62822Ol8 = C36518EUw.LIZ;
            Field field = (Field) c62822Ol8.getValue();
            if (field != null) {
                obj = field.get(view);
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Field field2 = (Field) c62822Ol8.getValue();
            if (field2 != null) {
                field2.set(view, Integer.valueOf(intValue & (-13)));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL(Window window, boolean z) {
        this.LJ = z;
        if (!z) {
            return;
        }
        if (window == null) {
            this.LJ = false;
        } else if (!this.LJIIIIZZ && this.LIZJ && Build.VERSION.SDK_INT >= 24) {
            this.LJIIIIZZ = true;
            window.addOnFrameMetricsAvailableListener(new WindowOnFrameMetricsAvailableListenerC80784VnA(this), this.LJI);
        }
    }
}
