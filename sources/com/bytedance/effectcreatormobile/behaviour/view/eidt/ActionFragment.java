package com.bytedance.effectcreatormobile.behaviour.view.eidt;

import X.AbstractC94370afu;
import X.AbstractC94372afw;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C93410aQQ;
import X.C93624aTs;
import X.C93643aUB;
import X.C93745aVp;
import X.C94065aaz;
import X.C94189acz;
import X.EnumC93477aRV;
import X.InterfaceC06750Oh;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import Y.IDObserverS227S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.ActionViewModel;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ActionFragment extends BehaviourBaseFragment<C94189acz> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C94065aaz LJLJI = new C94065aaz(this);
    public final C62822Ol8 LJLJJI = C93745aVp.LIZJ(this, ActionViewModel.class);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 9));
    public final InterfaceC93411aQR LJLJJLL = C93410aQQ.LIZJ().providePageLoadingView();
    public final InterfaceC93645aUD LJLJL;

    public final ActionViewModel Gl() {
        return (ActionViewModel) this.LJLJJI.getValue();
    }

    public final AbstractC94372afw Hl() {
        C93624aTs<AbstractC94370afu> c93624aTs;
        MutableLiveData<AbstractC94370afu> mutableLiveData;
        AbstractC94370afu value;
        EditViewModel editViewModel;
        C93624aTs<Integer> c93624aTs2;
        MutableLiveData<Integer> mutableLiveData2;
        Integer value2;
        EditViewModel editViewModel2 = (EditViewModel) this.LJLJJL.getValue();
        if (editViewModel2 != null && (c93624aTs = editViewModel2.LJLILLLLZI) != null && (mutableLiveData = c93624aTs.LIZ) != null && (value = mutableLiveData.getValue()) != null && (editViewModel = (EditViewModel) this.LJLJJL.getValue()) != null && (c93624aTs2 = editViewModel.LJLJJI) != null && (mutableLiveData2 = c93624aTs2.LIZ) != null && (value2 = mutableLiveData2.getValue()) != null) {
            int intValue = value2.intValue();
            List<AbstractC94372afw> LJI = value.LJI();
            if (intValue < LJI.size() && intValue >= 0) {
                return (AbstractC94372afw) ListProtector.get(LJI, intValue);
            }
        }
        return null;
    }

    public ActionFragment() {
        InterfaceC93645aUD provideStatusPage;
        provideStatusPage = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Large);
        this.LJLJL = provideStatusPage;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Gl().iv0(Hl());
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final InterfaceC06750Oh Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.duv, viewGroup, false);
        int i = R.id.g8a;
        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
        if (frameLayout != null) {
            i = R.id.nos;
            RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.nos);
            if (recyclerView != null) {
                return new C94189acz((FrameLayout) LLLLIILL, frameLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final void xl(View view, Bundle bundle) {
        FrameLayout frameLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        FrameLayout frameLayout2;
        o.LJIIIZ(view, "view");
        C94189acz Al = Al();
        if (Al != null && (recyclerView3 = Al.LJLJI) != null) {
            C94189acz Al2 = Al();
            if (Al2 != null && (frameLayout2 = Al2.LJLIL) != null) {
                frameLayout2.getContext();
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.LLJJIII(1);
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        C94189acz Al3 = Al();
        if (Al3 != null && (recyclerView2 = Al3.LJLJI) != null) {
            recyclerView2.setAdapter(this.LJLJI);
        }
        C94189acz Al4 = Al();
        if (Al4 != null && (recyclerView = Al4.LJLJI) != null) {
            recyclerView.setOverScrollMode(2);
        }
        C94189acz Al5 = Al();
        if (Al5 != null && (frameLayout = Al5.LJLILLLLZI) != null) {
            this.LJLJJLL.LIZ(C16880lQ.LLZIL(getContext()), frameLayout);
            this.LJLJL.LIZ(C16880lQ.LLZIL(getContext()), frameLayout);
        }
        Gl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 11));
        Gl().LJLJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 12));
        Gl().iv0(Hl());
    }
}
