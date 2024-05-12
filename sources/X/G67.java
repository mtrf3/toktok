package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G67 extends AbstractC42152GgW<C76800UCe> {
    public final /* synthetic */ G7K LJLJJI;

    @Override // X.AbstractC42152GgW
    public final void LIZIZ() {
    }

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Pre Sensitive Title Check";
    }

    @Override // X.AbstractC42152GgW
    public final void LIZLLL() {
    }

    public G67(G7K g7k) {
        this.LJLJJI = g7k;
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        o.LJIIIZ(nextStep, "nextStep");
        G7K g7k = this.LJLJJI;
        if (!g7k.LIZ) {
            nextStep.LIZIZ(this);
        } else {
            g7k.LIZIZ();
            nextStep.LIZIZ(this);
        }
    }
}
