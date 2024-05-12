package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.bottomsheet;

import X.ASQ;
import X.ASX;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C214738bl;
import X.C29S;
import X.C3C5;
import X.C40443Fu3;
import X.C4C5;
import X.C4GU;
import X.C65352Pkq;
import X.C71745SDt;
import X.C73305Spp;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.KL2;
import X.LFH;
import X.O6R;
import X.SYL;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import Y.IDrS41S0100000_1;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.list.GiphyCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GifChoosePanelBottomSheet extends Hilt_GifChoosePanelBottomSheet {
    public static final /* synthetic */ int LJLLJ = 0;
    public C4C5 LJLJJI;
    public View LJLJJL;
    public SYL LJLJJLL;
    public ProgressBar LJLJL;
    public TuxTextView LJLJLJ;
    public TuxIconView LJLJLLL;
    public C73305Spp LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C214738bl LJLLI = C71745SDt.LIZ(this, C65352Pkq.LIZ(GiphyViewModel.class), new AqS151S0100000_1((InterfaceC65784Pro) new AqS151S0100000_1((Fragment) this, 101), 102), null);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final GiphyViewModel vl() {
        return (GiphyViewModel) this.LJLLI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        GiphyViewModel vl = vl();
        vl.LJLLILLLL = Long.valueOf(vl.LJLJI.now());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        SYL syl = this.LJLJJLL;
        if (syl != null) {
            C0A2 layoutManager = syl.getLayoutManager();
            if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                staggeredGridLayoutManager.LLJJIJIL(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
                SYL syl2 = this.LJLJJLL;
                if (syl2 != null) {
                    syl2.LJJJJZI();
                    return;
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        if (this.LJLJJI == null) {
            ASQ.LJ(this, ASX.LIZ);
            return;
        }
        vl().LJLLL = this.LJLJJI;
        View findViewById = view.findViewById(R.id.jik);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.searchlessWidget)");
        this.LJLJJL = findViewById;
        View findViewById2 = view.findViewById(R.id.bf9);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.closeButton)");
        this.LJLJLLL = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.isf);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.recyclerView)");
        this.LJLJJLL = (SYL) findViewById3;
        View findViewById4 = view.findViewById(R.id.ia_);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.progressBar)");
        this.LJLJL = (ProgressBar) findViewById4;
        View findViewById5 = view.findViewById(R.id.keg);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.statusTextView)");
        this.LJLJLJ = (TuxTextView) findViewById5;
        this.LJLL = (C73305Spp) view.findViewById(R.id.keh);
        TuxIconView tuxIconView = this.LJLJLLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 42));
            SYL syl = this.LJLJJLL;
            if (syl != null) {
                syl.LLLF.LJZL(GiphyCell.class);
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0), 1);
                staggeredGridLayoutManager.LLJJIII(0);
                syl.setLayoutManager(staggeredGridLayoutManager);
                syl.setItemAnimator(null);
                syl.LJII(new C4GU(O6R.LJJIIZ(KL2.LIZJ(requireContext(), 8.0f))), -1);
                syl.LJIIJJI(new IDrS41S0100000_1(this, 1));
                C40443Fu3.LIZ("gif_choose_panel_bottomsheet_async").LJIIIIZZ(syl);
                vl().LJLJJL.observe(this, new AObserverS69S0100000_1(this, 27));
                vl().LJLJLJ.observe(this, new AObserverS69S0100000_1(this, 28));
                vl().LJLL.observe(this, new AObserverS69S0100000_1(this, 29));
                SYL syl2 = this.LJLJJLL;
                if (syl2 != null) {
                    syl2.LJLJLLL((AbstractC72278SYg) vl().LJLLLL.getValue());
                    return;
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("closeButton");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b79, viewGroup, false);
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
}
