package X;

import Y.AObjectS52S0101000_7;
import android.app.Activity;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G6W extends AbstractC42152GgW<C76800UCe> {
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Change Post Visibility Check";
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        o.LJIIIZ(nextStep, "nextStep");
        nextStep.LIZJ(this);
        C41010G7q.LJFF(this.LJLJJI, this.LJLJJL, new AqS96S0300000_7(nextStep, this, this.LJLJJLL, 6), new AqS154S0200000_7(nextStep, this, 37));
    }

    public G6W(Activity activity, boolean z, AObjectS52S0101000_7 aObjectS52S0101000_7) {
        this.LJLJJI = activity;
        this.LJLJJL = z;
        this.LJLJJLL = aObjectS52S0101000_7;
    }
}
