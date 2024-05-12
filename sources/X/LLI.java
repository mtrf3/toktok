package X;

import X.LLI;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS4S0301000_3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabAlphaController;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LLI implements LNV {
    public FragmentTabHost LIZ;
    public TabChangeManager LIZIZ;
    public ScrollSwitchStateManager LIZJ;

    @Override // X.LNV
    public final View LIZ(AbsFragment fragment, LayoutInflater inflater) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(inflater, "inflater");
        C62822Ol8 c62822Ol8 = C35138Dqg.LIZ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            i = R.layout.azs;
        } else {
            i = R.layout.azr;
        }
        View LIZLLL = C16970lZ.LIZLLL(fragment.mo49getActivity(), i);
        if (!((Boolean) c62822Ol8.getValue()).booleanValue()) {
            fragment.mo49getActivity();
            o.LJII(LIZLLL, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewStub viewStub = (ViewStub) LIZLLL.findViewById(R.id.nfk);
            if (viewStub != null) {
                viewStub.inflate();
            }
        }
        FragmentTabHost fragmentTabHost = (FragmentTabHost) LIZLLL.findViewById(R.id.gci);
        this.LIZ = fragmentTabHost;
        if (fragmentTabHost != null) {
            fragmentTabHost.setHideWhenTabChanged(true);
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        o.LJI(mo49getActivity);
        this.LIZJ = C84193Sd.LIZ(mo49getActivity);
        return LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.LNV
    public final void LIZIZ(AbsFragment fragment, View view) {
        View view2;
        FragmentTabHost fragmentTabHost;
        TabWidget tabWidget;
        o.LJIIIZ(fragment, "fragment");
        TabAlphaController LIZ = LLJ.LIZ();
        if (LIZ != null) {
            fragment.getLifecycle().addObserver(LIZ);
        }
        FragmentTabHost fragmentTabHost2 = this.LIZ;
        if (fragmentTabHost2 != null) {
            fragmentTabHost2.LIZLLL(fragment.mo49getActivity(), fragment.getChildFragmentManager());
        }
        FragmentTabHost fragmentTabHost3 = this.LIZ;
        if (fragmentTabHost3 != null && (tabWidget = fragmentTabHost3.getTabWidget()) != null) {
            tabWidget.setVisibility(8);
        }
        if ((fragment instanceof LLH) && (fragmentTabHost = this.LIZ) != null) {
            fragmentTabHost.setOnTabSwitchListener((LLH) fragment);
        }
        TabChangeManager LIZ2 = C116694i1.LIZ(fragment.mo49getActivity());
        this.LIZIZ = LIZ2;
        if (LIZ2 != null) {
            LIZ2.LJLIL = this.LIZ;
            LIZ2.LJLLI = fragment.getChildFragmentManager();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZJ;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LJLLLLLL = new MutableLiveData<Fragment>() { // from class: com.ss.android.ugc.aweme.homepage.MainPageFragmentProxy$onViewCreated$2
                @Override // androidx.lifecycle.LiveData
                public Fragment getValue() {
                    TabChangeManager tabChangeManager = LLI.this.LIZIZ;
                    if (tabChangeManager != null) {
                        return tabChangeManager.mv0();
                    }
                    return null;
                }
            };
        }
        TabChangeManager tabChangeManager = this.LIZIZ;
        if (tabChangeManager != null) {
            tabChangeManager.LJLLILLLL = new LLF(this);
        }
        if ((fragment instanceof LLE) && tabChangeManager != null) {
            tabChangeManager.hv0((LLE) fragment);
        }
        C56662Kg.LIZ().LIZJ("method_main_page_add_tab_duration", false);
        C56662Kg.LIZ().LJFF("method_main_page_add_tab_duration", false);
        FragmentTabHost fragmentTabHost4 = this.LIZ;
        if (fragmentTabHost4 != null) {
            fragmentTabHost4.post(new ARunnableS45S0100000_9(fragment, 50));
        }
        if (view != null) {
            view2 = view.findViewById(R.id.arm);
        } else {
            view2 = null;
        }
        if (fragment.isViewValid()) {
            C57092Lx.LIZ.getClass();
            if (view2 != null) {
                C38816FLg.LIZJ(new ARunnableS4S0301000_3(1, view2, null, null, 1));
            }
        }
        C8VV.LIZ(fragment, false, new AqS175S0100000_9(fragment, 94));
    }
}
