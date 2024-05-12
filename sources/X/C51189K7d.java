package X;

import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;

/* renamed from: X.K7d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51189K7d implements KCU {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.KCU
    public final boolean E() {
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel != null) {
            return ecSearchStartViewModel.LJLIL;
        }
        return true;
    }

    @Override // X.KCU
    public final void LIZ() {
        KeyboardUtils.LIZIZ(this.LIZ.LJLJI);
        this.LIZ.LJLJI.setCursorVisible(false);
    }

    public C51189K7d(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }
}
