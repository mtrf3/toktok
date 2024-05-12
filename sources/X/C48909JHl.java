package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.JHl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48909JHl extends AbstractC49155JQx {
    public InterfaceC65784Pro<? extends InterfaceC48907JHj> LIZLLL;
    public InterfaceC65784Pro<? extends InterfaceC48908JHk> LJ;
    public InterfaceC65784Pro<Integer> LJFF;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C48911JHn.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C48910JHm.LJLIL);

    @Override // X.AbstractC49155JQx
    public final void LIZLLL() {
    }

    @Override // X.AbstractC49155JQx
    public final int LIZ() {
        InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJFF;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro.invoke().intValue();
        }
        return 0;
    }

    @Override // X.AbstractC49155JQx
    public final Rect LIZIZ() {
        View view;
        InterfaceC48907JHj invoke;
        InterfaceC65784Pro<? extends InterfaceC48907JHj> interfaceC65784Pro = this.LIZLLL;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            view = invoke.LJJIJIL();
        } else {
            view = null;
        }
        if (view != null) {
            view.getLocationOnScreen(LJI());
            ((Rect) this.LJII.getValue()).set(LJI()[0], LJI()[1], view.getWidth() + LJI()[0], view.getHeight() + LJI()[1]);
        } else {
            ((Rect) this.LJII.getValue()).set(0, 0, 0, 0);
        }
        return (Rect) this.LJII.getValue();
    }

    @Override // X.AbstractC49155JQx
    public final void LIZJ() {
        InterfaceC48908JHk invoke;
        InterfaceC65784Pro<? extends InterfaceC48908JHk> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            invoke.LLLLLJLJLL();
        }
    }

    public final int[] LJI() {
        return (int[]) this.LJI.getValue();
    }

    @Override // X.AbstractC49155JQx
    public final void LJ(int i) {
        InterfaceC48908JHk invoke;
        InterfaceC65784Pro<? extends InterfaceC48908JHk> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            invoke.LLLLII(0L);
        }
    }

    @Override // X.AbstractC49155JQx
    public final void LJFF(int i) {
        InterfaceC48908JHk invoke;
        InterfaceC65784Pro<? extends InterfaceC48908JHk> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            invoke.LLLLII(0L);
        }
    }
}
