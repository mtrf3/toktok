package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.JHo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48912JHo extends AbstractC49155JQx {
    public final InterfaceC48907JHj LIZLLL;
    public final InterfaceC48908JHk LJ;
    public int LJFF = 0;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C48914JHq.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C48913JHp.LJLIL);

    @Override // X.AbstractC49155JQx
    public final void LIZLLL() {
    }

    @Override // X.AbstractC49155JQx
    public final Rect LIZIZ() {
        View LJJIJIL;
        InterfaceC48907JHj interfaceC48907JHj = this.LIZLLL;
        if (interfaceC48907JHj != null && (LJJIJIL = interfaceC48907JHj.LJJIJIL()) != null) {
            LJJIJIL.getLocationOnScreen(LJI());
            ((Rect) this.LJII.getValue()).set(LJI()[0], LJI()[1], LJJIJIL.getWidth() + LJI()[0], LJJIJIL.getHeight() + LJI()[1]);
        }
        return (Rect) this.LJII.getValue();
    }

    @Override // X.AbstractC49155JQx
    public final void LIZJ() {
        InterfaceC48908JHk interfaceC48908JHk = this.LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.LLLLLJLJLL();
        }
    }

    public final int[] LJI() {
        return (int[]) this.LJI.getValue();
    }

    @Override // X.AbstractC49155JQx
    public final int LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC49155JQx
    public final void LJ(int i) {
        InterfaceC48908JHk interfaceC48908JHk;
        if (i == 0 && (interfaceC48908JHk = this.LJ) != null) {
            interfaceC48908JHk.LLLLII(150L);
        }
    }

    @Override // X.AbstractC49155JQx
    public final void LJFF(int i) {
        InterfaceC48908JHk interfaceC48908JHk;
        if (i == 0 && (interfaceC48908JHk = this.LJ) != null) {
            interfaceC48908JHk.LLLLII(0L);
        }
    }

    public C48912JHo(InterfaceC48907JHj interfaceC48907JHj, InterfaceC48908JHk interfaceC48908JHk) {
        this.LIZLLL = interfaceC48907JHj;
        this.LJ = interfaceC48908JHk;
    }
}
