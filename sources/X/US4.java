package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class US4 {
    public final Context LIZ;
    public final ActivityC45651qj LIZIZ;
    public EnumC56196M3s LIZJ;
    public InterfaceC70422pa LIZLLL;
    public final C77193URh LJ;
    public final USH LJFF;
    public final M4B LJI;

    public final InterfaceC70542pm LIZ() {
        return UTK.LIZIZ.LIZ().LIZ(new C77207URv(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, this.LJFF, this.LJI, null));
    }

    public US4(Context context) {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = LJJIFFI;
        this.LIZJ = EnumC56196M3s.UNKNOWN;
        this.LIZLLL = C48841JEv.LIZ(C78613UtF.LIZ);
        this.LJ = new C77193URh(0);
        this.LJFF = new USH(0);
        this.LJI = new M4B(0);
    }

    public final void LIZIZ(InterfaceC70422pa interfaceC70422pa) {
        o.LJIIIZ(interfaceC70422pa, "<set-?>");
        this.LIZLLL = interfaceC70422pa;
    }

    public final void LIZJ(EnumC56196M3s enumC56196M3s) {
        o.LJIIIZ(enumC56196M3s, "<set-?>");
        this.LIZJ = enumC56196M3s;
    }

    public final void LIZLLL(InterfaceC88472Yns<? super C77193URh, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        block.invoke(this.LJ);
    }

    public final void LJ(InterfaceC88472Yns<? super M4B, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        block.invoke(this.LJI);
    }
}
