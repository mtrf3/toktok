package X;

import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.G7b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40995G7b extends AbstractC42152GgW<C76800UCe> {
    public final String LJLJJI = "Commerce Check";
    public final /* synthetic */ C40999G7f LJLJJL;

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return this.LJLJJI;
    }

    public C40995G7b(C40999G7f c40999G7f) {
        this.LJLJJL = c40999G7f;
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        o.LJIIIZ(nextStep, "nextStep");
        nextStep.LIZJ(this);
        C40999G7f c40999G7f = this.LJLJJL;
        AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(nextStep, this, 62);
        AqS154S0200000_7 aqS154S0200000_72 = new AqS154S0200000_7(nextStep, this, 63);
        c40999G7f.getClass();
        C40996G7c c40996G7c = new C40996G7c(aqS154S0200000_7, aqS154S0200000_72);
        c40996G7c.LIZ(new AqS173S0100000_7(c40999G7f, 217));
        c40996G7c.LIZ(new AqS173S0100000_7(c40999G7f, 218));
        c40996G7c.LIZ(new AqS173S0100000_7(c40996G7c, 227));
        C40997G7d c40997G7d = c40996G7c.LIZJ;
        if (c40997G7d != null) {
            c40997G7d.LIZLLL();
        }
    }
}
