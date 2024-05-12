package X;

import Y.IDObjectS331S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6G {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public View LIZIZ;

    public final void LIZ(ViewGroup viewGroup) {
        if (viewGroup.isAttachedToWindow()) {
            Iterator it = new IDObjectS331S0100000_10(viewGroup, 6).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (o.LJ(((View) it.next()).getTag(), "eclayer_tag")) {
                    z = true;
                }
            }
            if (z) {
                C16880lQ.LJLLL(this.LIZ, viewGroup);
            }
        }
    }
}
