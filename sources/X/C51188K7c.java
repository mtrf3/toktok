package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;

/* renamed from: X.K7c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51188K7c implements InterfaceC178696zp {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.InterfaceC178696zp
    public final int LIZIZ() {
        NextLiveData<Integer> hv0;
        Integer value;
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null || (hv0 = ecSearchStartViewModel.hv0()) == null || (value = hv0.getValue()) == null) {
            return -1;
        }
        return value.intValue();
    }

    public C51188K7c(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }
}
