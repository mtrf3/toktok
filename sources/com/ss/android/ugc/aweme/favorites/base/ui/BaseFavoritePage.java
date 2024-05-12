package com.ss.android.ugc.aweme.favorites.base.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C186627Uc;
import X.C213218Yj;
import X.C29S;
import X.C3C5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65776Prg;
import X.C76800UCe;
import X.C7VN;
import X.C7VO;
import X.C7VQ;
import X.C8VV;
import X.C8ZK;
import X.C90903hW;
import X.InterfaceC57784Mm4;
import X.OGG;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseFavoritePage extends BaseFragment implements OGG, C8ZK {
    public C7VQ LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public abstract String Al();

    public abstract int Gl();

    public abstract C65776Prg Hl();

    public abstract String Il();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract boolean xl();

    @Override // X.OGG
    public final View LJIJJ() {
        BasicFavoritePageAbilities basicFavoritePageAbilities;
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper()) || C16880lQ.LLJJIJIL(getViewLifecycleOwner().getLifecycle().getCurrentState(), Lifecycle.State.INITIALIZED) <= 0 || (basicFavoritePageAbilities = (BasicFavoritePageAbilities) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), BasicFavoritePageAbilities.class, null)) == null) {
            return null;
        }
        return basicFavoritePageAbilities.VN();
    }

    @Override // X.C8ZK
    public final void Od() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C7VO(this, null));
    }

    public String Dl(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(Gl());
        o.LJIIIIZZ(string, "context.getString(pageTitleRes)");
        return string;
    }

    public final C213218Yj Jl(Context context) {
        o.LJIIIZ(context, "context");
        return new C213218Yj(this, Dl(context), Al(), Il());
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C7VN(this, null));
    }

    public final C7VQ vl(Context context) {
        o.LJIIIZ(context, "context");
        C7VQ c7vq = this.LJLIL;
        if (c7vq != null) {
            return c7vq;
        }
        return wl(context);
    }

    public C7VQ wl(Context context) {
        o.LJIIIZ(context, "context");
        return new C7VQ(this, Jl(context));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 49));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bi9, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}
