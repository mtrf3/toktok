package X;

import Y.IDObjectS331S0100000_10;
import Y.IDObjectS4S0101000_10;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6Q implements InterfaceC60061Nhh {
    public final ViewGroup LJLIL;
    public final View LJLILLLLZI;

    public O6Q(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, ViewGroup root) {
        o.LJIIIZ(root, "root");
        this.LJLIL = root;
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        Iterator it = new IDObjectS331S0100000_10(this.LJLIL, 5).iterator();
        while (true) {
            IDObjectS4S0101000_10 iDObjectS4S0101000_10 = (IDObjectS4S0101000_10) it;
            if (iDObjectS4S0101000_10.hasNext()) {
                if (o.LJ(iDObjectS4S0101000_10.next(), this.LJLILLLLZI) && this.LJLIL.isAttachedToWindow()) {
                    C16880lQ.LJLLL(this.LJLILLLLZI, this.LJLIL);
                }
            } else {
                EventCenter.LJ().LIZIZ("ec_layer_on_back", this);
                return;
            }
        }
    }
}
