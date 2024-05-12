package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.1BA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BA implements InterfaceC10600bI {
    public final /* synthetic */ Fragment LIZ;

    public final void LIZ() {
        if (this.LIZ.getAnimatingAway() != null) {
            View animatingAway = this.LIZ.getAnimatingAway();
            this.LIZ.setAnimatingAway(null);
            animatingAway.clearAnimation();
        }
        this.LIZ.setAnimator(null);
    }

    public C1BA(Fragment fragment) {
        this.LIZ = fragment;
    }
}
