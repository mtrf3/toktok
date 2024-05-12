package Y;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;

/* loaded from: classes16.dex */
public class ACListenerS47S1100000_15 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS47S1100000_15 aCListenerS47S1100000_15, View view) {
        ((TwoStepVerificationDetailFragment) aCListenerS47S1100000_15.l1).vl(aCListenerS47S1100000_15.s0);
    }

    public static final void onClick$1(ACListenerS47S1100000_15 aCListenerS47S1100000_15, View view) {
        ((TwoStepVerificationDetailFragment) aCListenerS47S1100000_15.l1).vl(aCListenerS47S1100000_15.s0);
    }

    public static final void onClick$2(ACListenerS47S1100000_15 aCListenerS47S1100000_15, View view) {
        ((TwoStepVerificationDetailFragment) aCListenerS47S1100000_15.l1).vl(aCListenerS47S1100000_15.s0);
    }

    public ACListenerS47S1100000_15(TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, String str, int i) {
        this.$t = i;
        this.l1 = twoStepVerificationDetailFragment;
        this.s0 = str;
    }
}
