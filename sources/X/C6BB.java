package X;

import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.6BB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BB extends C6BD<C65A> implements InterfaceC159496Nt {
    @Override // X.InterfaceC159496Nt
    public final void LIZ() {
    }

    @Override // X.InterfaceC159496Nt
    public final void LIZIZ() {
        int i;
        C6BC c6bc = this.LIZIZ;
        float progress = c6bc.LIZ.getProgress();
        if (Build.VERSION.SDK_INT >= 26) {
            i = c6bc.LIZ.getMin();
        } else {
            i = 0;
        }
        float f = i;
        float max = c6bc.LIZ.getMax();
        float f2 = c6bc.LIZJ;
        float f3 = c6bc.LIZLLL;
        if (progress > f) {
            if (progress >= max) {
                f2 = f3;
            } else {
                f2 = C06420Na.LIZIZ(progress, f, f3, (max - progress) * f2) / (max - f);
            }
        }
        if (LIZLLL() / LIZJ() == f2) {
            return;
        }
        LJI(LIZJ() * f2);
    }

    @Override // X.C6BD
    public final float LIZJ() {
        return ((C65A) this.LIZ).getDefaultTextSize();
    }

    @Override // X.C6BD
    public final float LIZLLL() {
        if (((C65A) this.LIZ).getEditFontSize() > 0.0f) {
            return ((C65A) this.LIZ).getEditFontSize();
        }
        return super.LIZLLL();
    }

    @Override // X.C6BD
    public final void LJ() {
        super.LJ();
        ((C65A) this.LIZ).setFontTypeChangedListener(this);
    }

    @Override // X.C6BD
    public final void LJFF() {
        super.LJFF();
        ((C65A) this.LIZ).setFontTypeChangedListener(null);
    }

    @Override // X.C6BD
    public final void LJI(float f) {
        int LJJIIZ = O6R.LJJIIZ(f);
        if (LJJIIZ != ((C65A) this.LIZ).getEditFontSize()) {
            ((C65A) this.LIZ).setFontSize(LJJIIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6BB(C65A view, C6BC sizeHelper, C6BF c6bf) {
        super(view, sizeHelper, c6bf);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(sizeHelper, "sizeHelper");
    }
}
