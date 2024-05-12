package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class US3 {
    public final Context LIZ;
    public final ActivityC45651qj LIZIZ;
    public InterfaceC70422pa LIZJ;
    public final USH LIZLLL;
    public final M4B LJ;
    public Bundle LJFF;

    public final InterfaceC55726Lty LIZ() {
        return UTK.LIZIZ.LIZ().LIZIZ(new C77210URy(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF));
    }

    public US3(Context context) {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = LJJIFFI;
        this.LIZJ = C48841JEv.LIZ(C78613UtF.LIZ);
        this.LIZLLL = new USH(0);
        this.LJ = new M4B(0);
    }

    public final void LIZIZ(InterfaceC88472Yns<? super Bundle, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        Bundle bundle = new Bundle();
        block.invoke(bundle);
        this.LJFF = bundle;
    }

    public final void LIZJ(InterfaceC88472Yns<? super USH, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        block.invoke(this.LIZLLL);
    }

    public final void LIZLLL(InterfaceC70422pa interfaceC70422pa) {
        o.LJIIIZ(interfaceC70422pa, "<set-?>");
        this.LIZJ = interfaceC70422pa;
    }

    public final void LJ(InterfaceC88472Yns<? super M4B, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        block.invoke(this.LJ);
    }
}
