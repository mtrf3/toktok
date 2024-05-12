package X;

import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA8 implements InterfaceC51292KBc {
    public final /* synthetic */ EcSearchFragment LJLIL;
    public final /* synthetic */ C28019Az9 LJLILLLLZI;

    @Override // X.InterfaceC51292KBc
    public final boolean LLIIIZ() {
        if (this.LJLIL.mo49getActivity() == null) {
            return true;
        }
        return !C35O.LIZ(r1);
    }

    @Override // X.InterfaceC51292KBc
    public final K9C LLLILZLLLI() {
        return this.LJLIL.LLLILZLLLI();
    }

    @Override // X.InterfaceC51292KBc
    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC51292KBc
    public final C28019Az9 p() {
        return this.LJLILLLLZI;
    }

    public KA8(EcSearchFragment ecSearchFragment, C28019Az9 c28019Az9) {
        this.LJLIL = ecSearchFragment;
        this.LJLILLLLZI = c28019Az9;
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        String str;
        o.LJIIIZ(curPageState, "curPageState");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStateChangeEvent preState=");
        if (kau != null) {
            str = kau.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", curState=");
        LIZ.append(curPageState.name());
        X1D.LIZIZ(LIZ);
        if (curPageState == KAU.RESULT) {
            ((ImageView) this.LJLIL._$_findCachedViewById(R.id.bs_)).setVisibility(0);
        } else {
            ((ImageView) this.LJLIL._$_findCachedViewById(R.id.bs_)).setVisibility(8);
        }
    }
}
