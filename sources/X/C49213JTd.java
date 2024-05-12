package X;

import android.view.View;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JTd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49213JTd implements JQY<Float> {
    public float LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public View LJLJJI;

    @Override // X.JQY
    public final void LIZ() {
    }

    @Override // X.JQY
    public final Float LJIIIZ() {
        float f;
        if (C49967JjH.LIZIZ() && C46446IKs.LJLJLJ) {
            int[] iArr = new int[2];
            View view = this.LJLJJI;
            if (view != null) {
                view.getLocationOnScreen(iArr);
                float f2 = iArr[1];
                if (this.LJLJJI != null) {
                    f = (r0.getHeight() * 0.45f) + f2;
                } else {
                    o.LJIJI("rvContainer");
                    throw null;
                }
            } else {
                o.LJIJI("rvContainer");
                throw null;
            }
        } else {
            f = this.LJLILLLLZI;
        }
        return Float.valueOf(f);
    }

    @Override // X.JQY
    public final Float LJIIJJI() {
        float f;
        if (C49967JjH.LIZIZ() && C46446IKs.LJLJLJ) {
            int[] iArr = new int[2];
            View view = this.LJLJJI;
            if (view != null) {
                view.getLocationOnScreen(iArr);
                float f2 = iArr[1];
                if (this.LJLJJI != null) {
                    f = (r0.getHeight() * 0.15f) + f2;
                } else {
                    o.LJIJI("rvContainer");
                    throw null;
                }
            } else {
                o.LJIJI("rvContainer");
                throw null;
            }
        } else {
            f = this.LJLIL;
        }
        return Float.valueOf(f);
    }

    @Override // X.JQY
    public final boolean LJII() {
        return this.LJLJI;
    }

    @Override // X.JQY
    public final void LJ(View mHostContainer) {
        o.LJIIIZ(mHostContainer, "mHostContainer");
        Object parent = mHostContainer.getParent().getParent().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        this.LJLJJI = (View) parent;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 524);
        View view = this.LJLJJI;
        if (view != null) {
            if (view.getHeight() <= 0) {
                View view2 = this.LJLJJI;
                if (view2 != null) {
                    JVD.LIZIZ(view2, new AqS158S0100000_8(aqS158S0100000_8, 523));
                    return;
                } else {
                    o.LJIJI("rvContainer");
                    throw null;
                }
            }
            aqS158S0100000_8.invoke();
            return;
        }
        o.LJIJI("rvContainer");
        throw null;
    }
}
