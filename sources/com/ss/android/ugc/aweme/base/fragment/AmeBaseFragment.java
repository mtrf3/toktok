package com.ss.android.ugc.aweme.base.fragment;

import X.C16880lQ;
import X.C36922EeM;
import X.InterfaceC45040Hm0;
import X.KRB;
import X.X1D;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public abstract class AmeBaseFragment extends ComponentFragment implements InterfaceC45040Hm0 {
    public boolean isCommerce;

    @Override // X.InterfaceC45040Hm0
    public Analysis getAnalysis() {
        return null;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment
    public SparseArray<KRB> registerComponents() {
        return new SparseArray<>();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus LIZJ = EventBus.LIZJ();
        if (isRegisterEventBus() && LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current page：");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this) && isRegisterEventBus()) {
            LIZJ.LJIILJJIL(this);
        }
    }
}
