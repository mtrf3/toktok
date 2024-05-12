package com.ss.android.ugc.aweme.duetmode.ui;

import X.AbstractC51036K1g;
import X.C16880lQ;
import X.C51031K1b;
import X.KUR;
import X.KUY;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class DuetDiscoverAwemeListFragment extends DetailAwemeListFragment {
    public final Map<Integer, View> LLILLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final int Kl() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC191547fS
    public final void LJIIJJI() {
        C51031K1b<AbstractC51036K1g> c51031K1b = this.LJLJJL;
        if (c51031K1b != null) {
            c51031K1b.LJIILL(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void Ll() {
        TuxTextView xl = xl(R.string.hvg);
        C16880lQ.LJJJJI(xl, new ACListenerS29S0100000_9(this, 176));
        KUR kur = this.LJZI;
        KUY LIZ = KUY.LIZ(getContext());
        LIZ.LIZIZ(xl(R.string.hgk));
        LIZ.LIZJ(xl);
        kur.setBuilder(LIZ);
    }
}
