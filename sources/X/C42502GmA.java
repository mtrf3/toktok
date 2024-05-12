package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.GmA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42502GmA extends ViewOutlineProvider {
    public final Float LIZ;
    public final Float LIZIZ;
    public final Float LIZJ;
    public final Float LIZLLL;
    public final Float LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        int LIZ = C25870zv.LIZ(view, "view", outline, "outline");
        int height = view.getHeight();
        Float f2 = this.LIZ;
        if (f2 != null) {
            outline.setRoundRect(0, 0, LIZ, height, f2.floatValue());
            return;
        }
        Float f3 = this.LIZIZ;
        if (f3 != null || (f3 = this.LIZJ) != null || (f3 = this.LIZLLL) != null || (f3 = this.LJ) != null) {
            f = f3.floatValue();
        } else {
            f = 0.0f;
        }
        if (this.LJFF) {
            outline.setRoundRect(0, 0, LIZ, height + ((int) f), f);
            return;
        }
        if (this.LJII) {
            outline.setRoundRect(0, -((int) f), LIZ, height, f);
            return;
        }
        if (this.LJIIIIZZ) {
            outline.setRoundRect(0, 0, LIZ + ((int) f), height, f);
            return;
        }
        if (this.LJI) {
            outline.setRoundRect(-((int) f), 0, LIZ, height, f);
            return;
        }
        if (this.LJIIIZ) {
            int i = (int) f;
            outline.setRoundRect(0, 0, LIZ + i, height + i, f);
            return;
        }
        if (this.LJIIL) {
            int i2 = (int) f;
            outline.setRoundRect(0, -i2, LIZ + i2, height, f);
        } else if (this.LJIIJ) {
            int i3 = (int) f;
            outline.setRoundRect(-i3, 0, LIZ, height + i3, f);
        } else {
            if (!this.LJIIJJI) {
                return;
            }
            int i4 = -((int) f);
            outline.setRoundRect(i4, i4, LIZ, height, f);
        }
    }

    public C42502GmA(Float f, Float f2, Float f3, Float f4, Float f5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        if (f2 != null && o.LIZLLL(f2, f3)) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        if (f3 != null && o.LIZLLL(f3, f5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJI = z2;
        if (f4 != null && o.LIZLLL(f4, f5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJII = z3;
        if (f2 != null && o.LIZLLL(f2, f4)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LJIIIIZZ = z4;
        if (f2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LJIIIZ = z5;
        if (f3 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.LJIIJ = z6;
        if (f5 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.LJIIJJI = z7;
        this.LJIIL = f4 != null;
    }
}
