package X;

import android.app.Activity;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class G7I extends AbstractC42152GgW<C76800UCe> {
    public final Integer LJLJJI;
    public final Activity LJLJJL;
    public final String LJLJJLL;

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Privacy Confirmation Check";
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        Integer num;
        o.LJIIIZ(nextStep, "nextStep");
        G7J.LIZ = null;
        Integer num2 = this.LJLJJI;
        if (num2 != null && num2.intValue() != 1 && (((num = this.LJLJJI) == null || num.intValue() != 4) && a.LJFF().LJJII(this.LJLJJL))) {
            G7J.LIZ = GBZ.PRIVACY_DIALOG;
            nextStep.LIZJ(this);
            a.LJFF().LJJIFFI(this.LJLJJL, null, this.LJLJJLL, new AqS154S0200000_7(nextStep, this, 43), new AqS154S0200000_7(nextStep, this, 44));
            return;
        }
        nextStep.LIZIZ(this);
    }

    public G7I(Activity activity, String str, Integer num) {
        o.LJIIIZ(activity, "activity");
        this.LJLJJI = num;
        this.LJLJJL = activity;
        this.LJLJJLL = str;
    }
}
