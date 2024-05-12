package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JLL implements InterfaceC49154JQw {
    public final View LIZ;
    public final C62822Ol8 LIZIZ;
    public final Rect LIZJ;
    public final Rect LIZLLL;
    public int LJ;

    public void LJI() {
        this.LIZ.getLocationOnScreen(LJII());
        this.LIZLLL.left = LJII()[0];
        this.LIZLLL.top = LJII()[1];
        this.LIZLLL.right = this.LIZ.getWidth() + LJII()[0];
        this.LIZLLL.bottom = this.LIZ.getHeight() + LJII()[1];
        float height = this.LIZLLL.height();
        Rect rect = this.LIZJ;
        Rect rect2 = this.LIZLLL;
        int i = rect2.left;
        int i2 = rect2.top;
        rect.set(i, (int) ((0.0f * height) + i2), rect2.right, (int) ((height * 1.0f) + i2));
    }

    public final int[] LJII() {
        return (int[]) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC49154JQw
    public final int LIZ() {
        return this.LJ;
    }

    public JLL(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = C221108m2.LIZIZ(JLP.LJLIL);
        this.LIZJ = new Rect(0, 0, 0, 0);
        this.LIZLLL = new Rect(0, 0, 0, 0);
    }

    public static final boolean LJIIIZ(Rect rect) {
        if (rect.right > rect.left && rect.bottom > rect.top) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49154JQw
    public final boolean LIZIZ(Rect other) {
        float f;
        int i;
        int i2;
        o.LJIIIZ(other, "other");
        if (!LJIIIZ(other)) {
            return false;
        }
        if (this.LJ == 0) {
            f = ((r0.bottom - r2) / 2.0f) + this.LIZJ.top;
            i = other.top;
            i2 = other.bottom;
        } else {
            f = ((r0.right - r2) / 2.0f) + this.LIZJ.left;
            i = other.left;
            i2 = other.right;
        }
        if (f < i || f > i2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC49154JQw
    public final void LIZJ(int i) {
        this.LJ = i;
    }

    @Override // X.InterfaceC49154JQw
    public final boolean LIZLLL(Rect other) {
        float f;
        int i;
        int i2;
        o.LJIIIZ(other, "other");
        if (!LJIIIZ(other)) {
            return false;
        }
        if (this.LJ == 0) {
            f = ((other.bottom - r1) / 2.0f) + other.top;
            Rect rect = this.LIZJ;
            i = rect.top;
            i2 = rect.bottom;
        } else {
            f = ((other.right - r1) / 2.0f) + other.left;
            Rect rect2 = this.LIZJ;
            i = rect2.left;
            i2 = rect2.right;
        }
        if (f < i || f > i2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    @Override // X.InterfaceC49154JQw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC49155JQx LJ(java.util.Collection<? extends X.AbstractC49155JQx> r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JLL.LJ(java.util.Collection):X.JQx");
    }

    public static final boolean LJIIIIZZ(AbstractC49155JQx abstractC49155JQx, int i) {
        if (abstractC49155JQx == null || abstractC49155JQx.LIZ == i) {
            return false;
        }
        abstractC49155JQx.LIZ = i;
        return true;
    }

    public final float LJFF(float f, Rect rect) {
        int i;
        int i2;
        if (this.LJ == 0) {
            i = rect.top;
            i2 = rect.bottom;
        } else {
            i = rect.left;
            i2 = rect.right;
        }
        float f2 = i;
        if (f2 <= f && i2 >= f) {
            return 0.0f;
        }
        if (f2 > f) {
            return f2 - f;
        }
        return f - i2;
    }
}
