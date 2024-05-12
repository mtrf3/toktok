package X;

import android.view.View;
import com.ss.android.ugc.aweme.roaming.NearbyRegionListFragment;

/* renamed from: X.LbE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC54564LbE implements View.OnClickListener {
    public static final ViewOnClickListenerC54564LbE LJLIL = new ViewOnClickListenerC54564LbE();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityC45651qj LJ = C1DG.LJ(view, "it.context");
        if (LJ == null) {
            return;
        }
        NearbyRegionListFragment.wl(new NearbyRegionListFragment(), LJ, C54566LbG.LJLIL);
    }
}
