package Y;

import X.ActivityC45651qj;
import X.OSZ;
import android.content.Intent;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.inbox.InboxChangeTabInterceptor;
import com.ss.android.ugc.aweme.profile.ProfileChangeTabInterceptor;

/* loaded from: classes10.dex */
public class AObserverS38S0400000_9 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS38S0400000_9 aObserverS38S0400000_9, Object obj) {
        OSZ osz = (OSZ) obj;
        if (osz != null && ((Boolean) osz.getFirst()).booleanValue() && ((Boolean) osz.getSecond()).booleanValue()) {
            ((InboxChangeTabInterceptor) aObserverS38S0400000_9.l0).LIZ((ActivityC45651qj) aObserverS38S0400000_9.l1, (Intent) aObserverS38S0400000_9.l2);
            ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS38S0400000_9.l3;
            scrollSwitchStateManager.getClass();
            scrollSwitchStateManager.LJLLLL.removeObserver(aObserverS38S0400000_9);
        }
    }

    public static final void onChanged$1(AObserverS38S0400000_9 aObserverS38S0400000_9, Object obj) {
        OSZ osz = (OSZ) obj;
        if (osz != null && ((Boolean) osz.getFirst()).booleanValue() && ((Boolean) osz.getSecond()).booleanValue()) {
            ((ProfileChangeTabInterceptor) aObserverS38S0400000_9.l0).LIZ((ActivityC45651qj) aObserverS38S0400000_9.l1, (Intent) aObserverS38S0400000_9.l2);
            ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS38S0400000_9.l3;
            scrollSwitchStateManager.getClass();
            scrollSwitchStateManager.LJLLLL.removeObserver(aObserverS38S0400000_9);
        }
    }

    public AObserverS38S0400000_9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
