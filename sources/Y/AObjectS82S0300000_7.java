package Y;

import X.ActivityC45651qj;
import X.HZV;
import X.InterfaceC65784Pro;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;

/* loaded from: classes8.dex */
public class AObjectS82S0300000_7 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS82S0300000_7 aObjectS82S0300000_7) {
        OnStartEditDraftListener onStartEditDraftListener = (OnStartEditDraftListener) aObjectS82S0300000_7.l0;
        Intent intent = (Intent) aObjectS82S0300000_7.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObjectS82S0300000_7.l2;
        if (onStartEditDraftListener != null) {
            onStartEditDraftListener.onStart(intent);
        }
        HZV.LIZ().LJJII(activityC45651qj, intent);
        return null;
    }

    public static final Object invoke$1(AObjectS82S0300000_7 aObjectS82S0300000_7) {
        OnStartEditDraftListener onStartEditDraftListener = (OnStartEditDraftListener) aObjectS82S0300000_7.l0;
        Intent intent = (Intent) aObjectS82S0300000_7.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObjectS82S0300000_7.l2;
        if (onStartEditDraftListener != null) {
            onStartEditDraftListener.onStart(intent);
        }
        HZV.LIZ().LJIIJJI(activityC45651qj, intent);
        return null;
    }

    public AObjectS82S0300000_7(OnStartEditDraftListener onStartEditDraftListener, Intent intent, ActivityC45651qj activityC45651qj, int i) {
        this.$t = i;
        this.l0 = onStartEditDraftListener;
        this.l1 = intent;
        this.l2 = activityC45651qj;
    }
}
