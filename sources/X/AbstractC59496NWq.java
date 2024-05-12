package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* renamed from: X.NWq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59496NWq implements GHC, NMO {
    public final Activity LJLIL;

    public AbstractC59496NWq(Activity activity) {
        this.LJLIL = activity;
    }

    @Override // X.NMO
    public final void enable(boolean z) {
        if (z) {
            ComponentCallbacks2 componentCallbacks2 = this.LJLIL;
            if (componentCallbacks2 instanceof C34X) {
                ((C34X) componentCallbacks2).registerActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        ComponentCallbacks2 componentCallbacks22 = this.LJLIL;
        if (!(componentCallbacks22 instanceof C34X)) {
            return;
        }
        ((C34X) componentCallbacks22).unRegisterActivityOnKeyDownListener(this);
    }
}
