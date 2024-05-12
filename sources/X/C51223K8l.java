package X;

import Y.AObserverS62S0101000_8;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;

/* renamed from: X.K8l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51223K8l implements KEW {
    public final /* synthetic */ EcSearchContainerFragment LIZ;

    public C51223K8l(EcSearchContainerFragment ecSearchContainerFragment) {
        this.LIZ = ecSearchContainerFragment;
    }

    @Override // X.KEW
    public final void LIZIZ(Fragment fragment) {
        if (C48054ItW.LIZ()) {
            this.LIZ.LJLLLLLL.LJLIL.removeObservers(fragment);
        }
    }

    @Override // X.KEW
    public final void LIZ(int i, Fragment fragment) {
        if (C48054ItW.LIZ()) {
            this.LIZ.LJLLLLLL.LJLIL.observe(fragment, new AObserverS62S0101000_8(i, fragment, 2));
        }
    }
}
