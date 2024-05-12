package X;

import Y.ARunnableS18S0101000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wqg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83550Wqg extends C83546Wqc {
    public final InterfaceC88471Ynr<String, String, C76800UCe> LJIIJ;
    public final InterfaceC83485Wpd LJIIJJI;

    @Override // X.C83546Wqc
    public final void LIZ() {
        String str;
        InterfaceC83485Wpd interfaceC83485Wpd = this.LJIIJJI;
        if (interfaceC83485Wpd != null) {
            C83562Wqs c83562Wqs = this.LIZLLL;
            if (c83562Wqs == null || (str = c83562Wqs.LJ) == null) {
                str = "";
            }
            String currentInputText = this.LJIIIIZZ;
            o.LJIIIIZZ(currentInputText, "currentInputText");
            interfaceC83485Wpd.LJJIIJ(str, currentInputText);
        }
    }

    @Override // X.C83546Wqc
    public final void LIZJ(C83551Wqh c83551Wqh) {
        this.LIZ = c83551Wqh;
        c83551Wqh.setEffectTextChangeListener(new C83559Wqp(this));
    }

    @Override // X.C83546Wqc
    public final void LIZLLL(int i, String str) {
        this.LJFF.runOnUiThread(new ARunnableS18S0101000_14(i, this, 20));
    }

    public C83550Wqg(ActivityC45651qj activityC45651qj, C83589WrJ c83589WrJ, AqS196S0100000_14 aqS196S0100000_14) {
        super(activityC45651qj, c83589WrJ);
        this.LJIIJ = aqS196S0100000_14;
        this.LJIIJJI = null;
    }
}
