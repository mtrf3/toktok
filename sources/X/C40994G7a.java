package X;

import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.G7a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40994G7a extends AbstractC42152GgW<C76800UCe> {
    public final String LJLJJI = "Commerce Check";
    public final /* synthetic */ C40999G7f LJLJJL;

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return this.LJLJJI;
    }

    public C40994G7a(C40999G7f c40999G7f) {
        this.LJLJJL = c40999G7f;
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        o.LJIIIZ(nextStep, "nextStep");
        nextStep.LIZJ(this);
        this.LJLJJL.LIZ(new AqS154S0200000_7(nextStep, this, 60), new AqS154S0200000_7(nextStep, this, 61));
    }
}
