package com.bytedance.effectcreatormobile.behaviour.container;

import X.C16880lQ;
import X.C1B3;
import X.C93677aUj;
import X.C93939aYx;
import X.C93970aZS;
import X.C93971aZT;
import X.C94048aai;
import X.C94190ad0;
import X.C94418agg;
import X.C94447ah9;
import X.EnumC93993aZp;
import X.InterfaceC06750Oh;
import X.InterfaceC93642aUA;
import X.InterfaceC93952aZA;
import X.InterfaceC93955aZD;
import X.InterfaceC93966aZO;
import Y.IDObserverS227S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import com.bytedance.effectcreatormobile.behaviour.BehaviourLiveData;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourContentFragment;
import com.bytedance.effectcreatormobile.behaviour.view.card.extra.CardObjectOffset;
import com.bytedance.effectcreatormobile.behaviour.view.card.extra.ICardObjectOffset;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class BehaviourContainerFragment extends BehaviourBaseFragment<C94190ad0> implements InterfaceC93966aZO, InterfaceC93952aZA, InterfaceC93642aUA {
    public static final /* synthetic */ int LJLJJI = 0;
    public final CardObjectOffset LJLJI = new CardObjectOffset();

    public final C94418agg Gl() {
        C94190ad0 Al = Al();
        if (Al != null) {
            return Al.LJLILLLLZI;
        }
        return null;
    }

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        FragmentManager fragmentManager;
        Object obj;
        if (!isVisible()) {
            return false;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        List<Fragment> LJJJJLI = childFragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        boolean z = false;
        for (Fragment fragment : LJJJJLI) {
            if (!(fragment instanceof InterfaceC93966aZO)) {
                obj = null;
            } else {
                obj = fragment;
            }
            InterfaceC93966aZO interfaceC93966aZO = (InterfaceC93966aZO) obj;
            if (interfaceC93966aZO != null && !fragment.isHidden()) {
                z = interfaceC93966aZO.LJIIJ();
            }
        }
        if (z) {
            return true;
        }
        C94418agg Gl = Gl();
        if (Gl == null) {
            return false;
        }
        if (Gl.LIZLLL()) {
            Gl.goBack();
            if (!Gl.LIZLLL() && (fragmentManager = getFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJJI(this);
                c1b3.LJI();
            }
            return true;
        }
        FragmentManager fragmentManager2 = getFragmentManager();
        if (fragmentManager2 == null) {
            return false;
        }
        C1B3 c1b32 = new C1B3(fragmentManager2);
        c1b32.LJJI(this);
        c1b32.LJI();
        return false;
    }

    @Override // X.InterfaceC93642aUA
    public final TextView f8() {
        C94418agg Gl = Gl();
        if (Gl != null) {
            return Gl.f8();
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C93970aZS LIZ = C93971aZT.LIZ();
        CardObjectOffset obj = this.LJLJI;
        LIZ.getClass();
        o.LJIIIZ(obj, "obj");
        LIZ.LIZ.remove(ICardObjectOffset.class, obj);
        ((LinkedHashMap) BehaviourContentFragment.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C93677aUj.LJII(2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C93677aUj.LJI(2);
        C94418agg Gl = Gl();
        if (Gl != null) {
            Gl.LJ();
        }
    }

    @Override // X.InterfaceC93952aZA
    public final InterfaceC93955aZD r5() {
        C94190ad0 Al = Al();
        if (Al != null) {
            return Al.LJLILLLLZI;
        }
        return null;
    }

    @Override // X.InterfaceC93642aUA
    public final TextView zg() {
        C94418agg Gl = Gl();
        if (Gl != null) {
            return Gl.zg();
        }
        return null;
    }

    @Override // X.InterfaceC93642aUA
    public final TextView zh() {
        Gl();
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final InterfaceC06750Oh Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.duz, viewGroup, false);
        if (LLLLIILL != null) {
            C94418agg c94418agg = (C94418agg) LLLLIILL;
            return new C94190ad0(c94418agg, c94418agg);
        }
        throw new NullPointerException("rootView");
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final void xl(View view, Bundle bundle) {
        Bundle arguments;
        C94418agg Gl;
        o.LJIIIZ(view, "view");
        FragmentManager it = getChildFragmentManager();
        C94418agg Gl2 = Gl();
        if (Gl2 != null) {
            o.LJIIIIZZ(it, "it");
            Gl2.setAdapter(new C94447ah9(it));
        }
        C93970aZS LIZ = C93971aZT.LIZ();
        CardObjectOffset obj = this.LJLJI;
        LIZ.getClass();
        o.LJIIIZ(obj, "obj");
        LIZ.LIZ.put(ICardObjectOffset.class, obj);
        if (bundle == null && (arguments = getArguments()) != null && (Gl = Gl()) != null) {
            Gl.LJII(arguments);
        }
        BehaviourImpl LIZIZ = C94048aai.LIZIZ();
        LiveData<EnumC93993aZp> liveData = null;
        if (LIZIZ != null) {
            liveData = LIZIZ.getPanelStateLiveData();
        }
        if ((liveData instanceof BehaviourLiveData) && liveData != null) {
            liveData.postValue(EnumC93993aZp.Show);
        }
        C94418agg Gl3 = Gl();
        if (Gl3 != null) {
            Gl3.setDismissListener(new IDqS423S0100000_42(this, 116));
        }
        C93939aYx.LIZ().getRenderModeData().observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 6));
    }
}
