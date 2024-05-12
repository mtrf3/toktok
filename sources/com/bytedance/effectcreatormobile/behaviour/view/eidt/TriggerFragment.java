package com.bytedance.effectcreatormobile.behaviour.view.eidt;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C93410aQQ;
import X.C93643aUB;
import X.C93745aVp;
import X.C94067ab1;
import X.C94196ad6;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.TriggerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TriggerFragment extends BehaviourBaseFragment<C94196ad6> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C94067ab1 LJLJI = new C94067ab1(this);
    public final C62822Ol8 LJLJJI = C93745aVp.LIZJ(this, TriggerViewModel.class);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 10));
    public final InterfaceC93411aQR LJLJJLL = C93410aQQ.LIZJ().providePageLoadingView();
    public final InterfaceC93645aUD LJLJL;

    public final TriggerViewModel Gl() {
        return (TriggerViewModel) this.LJLJJI.getValue();
    }

    public TriggerFragment() {
        InterfaceC93645aUD provideStatusPage;
        provideStatusPage = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Large);
        this.LJLJL = provideStatusPage;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Gl().iv0();
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final InterfaceC06750Oh Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvg, viewGroup, false);
        int i = R.id.g8a;
        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
        if (frameLayout != null) {
            i = R.id.nox;
            RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.nox);
            if (recyclerView != null) {
                return new C94196ad6((FrameLayout) LLLLIILL, frameLayout, recyclerView);
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
        LinearLayoutManager linearLayoutManager;
        FrameLayout frameLayout2;
        o.LJIIIZ(view, "view");
        C94196ad6 Al = Al();
        if (Al != null && (recyclerView3 = Al.LJLJI) != null) {
            C94196ad6 Al2 = Al();
            if (Al2 != null && (frameLayout2 = Al2.LJLIL) != null && frameLayout2.getContext() != null) {
                linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.LLJJIII(1);
            } else {
                linearLayoutManager = null;
            }
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        C94196ad6 Al3 = Al();
        if (Al3 != null && (recyclerView2 = Al3.LJLJI) != null) {
            recyclerView2.setAdapter(this.LJLJI);
        }
        C94196ad6 Al4 = Al();
        if (Al4 != null && (recyclerView = Al4.LJLJI) != null) {
            recyclerView.setOverScrollMode(2);
        }
        C94196ad6 Al5 = Al();
        if (Al5 != null && (frameLayout = Al5.LJLILLLLZI) != null) {
            this.LJLJJLL.LIZ(C16880lQ.LLZIL(getContext()), frameLayout);
            this.LJLJL.LIZ(C16880lQ.LLZIL(getContext()), frameLayout);
        }
        Gl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 15));
        Gl().LJLJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 16));
        Gl().iv0();
    }
}
