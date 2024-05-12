package Y;

import X.C47550IlO;
import X.J9P;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;

/* loaded from: classes9.dex */
public class ACListenerS45S1100000_8 implements View.OnClickListener {
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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS45S1100000_8 aCListenerS45S1100000_8, View view) {
        SmartRouter.buildRoute(view.getContext(), aCListenerS45S1100000_8.s0).open();
        ((SearchCoinTaskManager) aCListenerS45S1100000_8.l1).getStatisticsManager().LIZ("ok");
    }

    public static final void onClick$1(ACListenerS45S1100000_8 aCListenerS45S1100000_8, View view) {
        J9P.LIZJ((Fragment) aCListenerS45S1100000_8.l1, aCListenerS45S1100000_8.s0, "search_freq_control", null, C47550IlO.LIZ);
    }

    public ACListenerS45S1100000_8(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
