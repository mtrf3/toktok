package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.0PI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PI {
    public static final C0PI LIZIZ;
    public final C0PE LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            LIZIZ = C56022Hu.LJIJ;
        } else {
            LIZIZ = C0PE.LIZJ;
        }
    }

    public final WindowInsets LIZIZ() {
        C0PE c0pe = this.LIZ;
        if (c0pe instanceof C30651If) {
            return ((C30651If) c0pe).LIZLLL;
        }
        return null;
    }

    public final int hashCode() {
        C0PE c0pe = this.LIZ;
        if (c0pe == null) {
            return 0;
        }
        return c0pe.hashCode();
    }

    public C0PI() {
        this.LIZ = new C0PE(this);
    }

    public C0PI(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C56022Hu(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.LIZ = new C2BF(this, windowInsets);
        } else if (i >= 28) {
            this.LIZ = new C48321v2(this, windowInsets);
        } else {
            this.LIZ = new C41371jp(this, windowInsets);
        }
    }

    public final C06920Oy LIZ(int i) {
        return this.LIZ.LJFF(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PI)) {
            return false;
        }
        return Objects.equals(this.LIZ, ((C0PI) obj).LIZ);
    }

    public static C0PI LIZJ(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0PI c0pi = new C0PI(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c0pi.LIZ.LJIILL(C0P1.LIZ(view));
            c0pi.LIZ.LIZLLL(view.getRootView());
        }
        return c0pi;
    }
}
