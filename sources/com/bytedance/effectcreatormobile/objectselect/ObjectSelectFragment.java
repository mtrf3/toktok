package com.bytedance.effectcreatormobile.objectselect;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.C93819aX1;
import X.C93939aYx;
import X.C94044aae;
import X.C94422agk;
import X.C94455ahH;
import X.EnumC93488aRg;
import X.InterfaceC93952aZA;
import X.InterfaceC93955aZD;
import X.InterfaceC93966aZO;
import Y.IDObserverS227S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectLiveData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ObjectSelectFragment extends Fragment implements InterfaceC93952aZA, InterfaceC93966aZO {
    public C94044aae LJLIL;

    @Override // X.InterfaceC93952aZA
    public final InterfaceC93955aZD r5() {
        C94044aae c94044aae = this.LJLIL;
        if (c94044aae != null) {
            return c94044aae.LJLILLLLZI;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        if (isHidden()) {
            C93939aYx.LIZ().getRenderModeData().observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 2));
            return false;
        }
        C94044aae c94044aae = this.LJLIL;
        if (c94044aae != null) {
            if (c94044aae.LJLILLLLZI.LIZLLL()) {
                C94044aae c94044aae2 = this.LJLIL;
                if (c94044aae2 != null) {
                    c94044aae2.LJLILLLLZI.goBack();
                    return true;
                }
                o.LJIJI("binding");
                throw null;
            }
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                return false;
            }
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this);
            c1b3.LJI();
            return false;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IObjectSelect LIZIZ = C93819aX1.LIZIZ();
        LiveData<EnumC93488aRg> liveData = null;
        if (LIZIZ != null) {
            liveData = LIZIZ.getPanelStateLiveData();
        }
        if (!(liveData instanceof ObjectSelectLiveData) || liveData == null) {
            return;
        }
        liveData.setValue(EnumC93488aRg.DISMISS);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3111095341020012955");
        if (c03880Dg.LIZJ(10501, "com/bytedance/effectcreatormobile/objectselect/ObjectSelectFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/effectcreatormobile/objectselect/ObjectSelectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        List<Fragment> LJJJJLI = childFragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        Iterator<Fragment> it = LJJJJLI.iterator();
        while (it.hasNext()) {
            it.next().onHiddenChanged(isHidden());
        }
        if (z) {
            IObjectSelect LIZIZ = C93819aX1.LIZIZ();
            LiveData<EnumC93488aRg> liveData = null;
            if (LIZIZ != null) {
                liveData = LIZIZ.getPanelStateLiveData();
            }
            if ((liveData instanceof ObjectSelectLiveData) && liveData != null) {
                liveData.setValue(EnumC93488aRg.DISMISS);
            }
        } else {
            LiveData<EnumC93488aRg> panelStateLiveData = C93819aX1.LIZ().getPanelStateLiveData();
            if (panelStateLiveData != null) {
                panelStateLiveData.setValue(EnumC93488aRg.SHOW);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectLiveData<com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect.PanelState>");
                c03880Dg.LIZIZ(10501, "com/bytedance/effectcreatormobile/objectselect/ObjectSelectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
                throw nullPointerException;
            }
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/effectcreatormobile/objectselect/ObjectSelectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LiveData<EnumC93488aRg> panelStateLiveData = C93819aX1.LIZ().getPanelStateLiveData();
        if (panelStateLiveData != null) {
            panelStateLiveData.setValue(EnumC93488aRg.SHOW);
            C94044aae c94044aae = this.LJLIL;
            if (c94044aae != null) {
                C94422agk c94422agk = c94044aae.LJLILLLLZI;
                FragmentManager childFragmentManager = getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                c94422agk.setAdapter(new C94455ahH(childFragmentManager));
                Bundle arguments = getArguments();
                if (arguments != null) {
                    C94044aae c94044aae2 = this.LJLIL;
                    if (c94044aae2 != null) {
                        c94044aae2.LJLILLLLZI.LJII(arguments);
                    } else {
                        o.LJIJI("binding");
                        throw null;
                    }
                }
                C94044aae c94044aae3 = this.LJLIL;
                if (c94044aae3 != null) {
                    c94044aae3.LJLILLLLZI.setDismissListener(new IDqS423S0100000_42(this, 32));
                    return;
                } else {
                    o.LJIJI("binding");
                    throw null;
                }
            }
            o.LJIJI("binding");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectLiveData<com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect.PanelState>");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvm, viewGroup, false);
        if (LLLLIILL != null) {
            C94422agk c94422agk = (C94422agk) LLLLIILL;
            this.LJLIL = new C94044aae(c94422agk, c94422agk);
            try {
                ViewTreeLifecycleOwner.set(c94422agk, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(c94422agk, this);
                C10A.LIZIZ(c94422agk, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                } else {
                    c29s = null;
                }
                C90903hW.LIZ(c29s);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return c94422agk;
        }
        throw new NullPointerException("rootView");
    }
}
