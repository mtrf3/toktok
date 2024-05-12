package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FEd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38631FEd extends AbstractC38635FEh implements InterfaceC38637FEj {
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 102));
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final FE3 LJIILL;

    @Override // X.InterfaceC38637FEj
    public final void LJFF() {
    }

    @Override // X.InterfaceC38637FEj
    public final void LJIIIZ() {
        LJIIL();
    }

    @Override // X.InterfaceC38637FEj
    public final void LIZIZ(View view) {
        o.LJIIJ(view, "view");
        int i = this.LJIIJ;
        if (i != -1) {
            view.setId(i);
        }
        int i2 = this.LJIIJJI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
    }

    @Override // X.InterfaceC38637FEj
    public final ViewGroup.LayoutParams LJ(ViewGroup viewParent) {
        Object LIZ;
        o.LJIIJ(viewParent, "viewParent");
        try {
            LIZ = viewParent.generateLayoutParams(LJIILL());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (ViewGroup.LayoutParams) LIZ;
    }

    @Override // X.AbstractC38635FEh
    public final void LJIIZILJ(AbstractC38635FEh abstractC38635FEh) {
        if (this.LJIIL.getValue() instanceof C38632FEe) {
            List<InterfaceC38628FEa> LIZ = ((InterfaceC38628FEa) this.LJIIL.getValue()).LIZ();
            if (LIZ != null) {
                for (InterfaceC38628FEa interfaceC38628FEa : LIZ) {
                    if (interfaceC38628FEa instanceof AbstractC38635FEh) {
                        ((AbstractC38635FEh) interfaceC38628FEa).LJIIZILJ(abstractC38635FEh);
                    } else {
                        throw new IllegalStateException("child must be AbsCachedViewCreator");
                    }
                }
                return;
            }
            return;
        }
        InterfaceC38628FEa interfaceC38628FEa2 = (InterfaceC38628FEa) this.LJIIL.getValue();
        if (interfaceC38628FEa2 instanceof AbstractC38635FEh) {
            AbstractC38635FEh abstractC38635FEh2 = (AbstractC38635FEh) interfaceC38628FEa2;
            abstractC38635FEh2.getClass();
            abstractC38635FEh2.LJIIIIZZ = this;
            abstractC38635FEh2.LJIIZILJ(abstractC38635FEh);
            return;
        }
        throw new IllegalStateException("includeRoot must be AbsCachedViewCreator");
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        o.LJIIJ(context, "context");
        throw new IllegalStateException("Cannot call IncludeViewCreator#createView().");
    }

    public C38631FEd(int i, String str, FE3 fe3) {
        this.LJIILIIL = i;
        this.LJIILJJIL = str;
        this.LJIILL = fe3;
    }
}
