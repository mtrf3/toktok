package Y;

import X.C174406su;
import X.C27740Aue;
import X.C2U8;
import X.C8GG;
import X.EnumC177756yJ;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyNoticeAction;

/* loaded from: classes4.dex */
public class ACListenerS51S0000000_3 implements View.OnClickListener {
    public final int $t;

    public static final void onClick$1(ACListenerS51S0000000_3 aCListenerS51S0000000_3, View view) {
    }

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

    public ACListenerS51S0000000_3(int i) {
        this.$t = i;
    }

    public static final void onClick$0(ACListenerS51S0000000_3 aCListenerS51S0000000_3, View view) {
        if (C27740Aue.LJ(view).booleanValue()) {
            C2U8.LIZ(new C174406su(EnumC177756yJ.COMMENT_LIST));
        }
    }

    public static final void onClick$2(ACListenerS51S0000000_3 aCListenerS51S0000000_3, View view) {
    }

    public ACListenerS51S0000000_3(C8GG c8gg, PolicyNoticeAction policyNoticeAction, int i) {
        this.$t = i;
    }
}
