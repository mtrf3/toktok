package X;

import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.utils.EcSearchSugMobHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBV implements InterfaceC51122K4o {
    public final /* synthetic */ EcAbstractSearchIntermediateFragmentNew LJLIL;

    public KBV(EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew) {
        this.LJLIL = ecAbstractSearchIntermediateFragmentNew;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String t = str;
        o.LJIIIZ(t, "t");
        EcSearchSugMobHelper ecSearchSugMobHelper = this.LJLIL.LJLLI;
        if (ecSearchSugMobHelper == null) {
            return;
        }
        ecSearchSugMobHelper.LJLILLLLZI = t;
    }
}
