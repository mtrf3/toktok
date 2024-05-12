package com.ss.android.ugc.aweme.compliance.business.phl.feed;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C27605AsT;
import X.C27610AsY;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C62822Ol8;
import X.C73062Slu;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.IPX;
import X.IPZ;
import X.IWF;
import X.InterfaceC61213O0r;
import X.KRR;
import X.KRS;
import X.KRT;
import X.KRU;
import X.KRV;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.views.PagerLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes9.dex */
public final class PhlFeedFragment extends BaseFragment {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public RecyclerView LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;
    public final C62822Ol8 LJLJLJ;
    public ARunnableS44S0100000_8 LJLJLLL;
    public long LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    public PhlFeedFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.requiredArg(this, KRV.LJLIL, "enter_from", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArgNotNull(this, KRR.LJLIL, "init_position", Integer.class);
        this.LJLJI = routeArgExtension.requiredArg(this, KRT.LJLIL, "video_list", List.class);
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 43));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 44));
        this.LJLJL = -1;
        this.LJLJLJ = C221108m2.LIZIZ(KRS.INSTANCE);
    }

    public final List<Video> vl() {
        return (List) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IWF iwf = C27610AsY.LIZ;
        if (iwf != null) {
            iwf.LLLLLL();
            iwf.LJJJZ();
            iwf.LJJIIZ();
            iwf.LJJJLL(null);
            iwf.release();
        }
        C27610AsY.LIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        xl(this.LJLJL, "click_back");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C73062Slu c73062Slu;
        super.onPause();
        C27605AsT wl = wl(this.LJLJL);
        if (wl != null && (c73062Slu = wl.LJLILLLLZI) != null) {
            c73062Slu.LJII();
        }
        ((Handler) this.LJLJLJ.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C73062Slu c73062Slu;
        super.onResume();
        C27605AsT wl = wl(this.LJLJL);
        if (wl != null && (c73062Slu = wl.LJLILLLLZI) != null) {
            c73062Slu.LJIIIIZZ();
        }
        Dl(false);
    }

    public final void Dl(boolean z) {
        ((Handler) this.LJLJLJ.getValue()).removeCallbacksAndMessages(null);
        if (z) {
            this.LJLL = 0L;
        }
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 19);
        this.LJLJLLL = aRunnableS44S0100000_8;
        ((Handler) this.LJLJLJ.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
    }

    public final void Gl(int i) {
        C73062Slu c73062Slu;
        if (this.LJLJL == i) {
            return;
        }
        this.LJLJL = i;
        IPZ.LIZ(IPX.PLAYER_IDLE);
        C27605AsT wl = wl(i);
        if (wl != null && (c73062Slu = wl.LJLILLLLZI) != null) {
            c73062Slu.LJIILIIL(0.0f);
        }
        Dl(true);
    }

    public final C27605AsT wl(int i) {
        View LJJIJIL;
        if (i == -1 || (LJJIJIL = ((C0A2) this.LJLJJLL.getValue()).LJJIJIL(this.LJLJL)) == null) {
            return null;
        }
        Object tag = LJJIJIL.getTag();
        if (!(tag instanceof C27605AsT)) {
            return null;
        }
        return (C27605AsT) tag;
    }

    public final void Al(int i, String str) {
        if (i < 0 || i >= vl().size()) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", (String) this.LJLIL.getValue());
        c188727au.LJIIIZ("video_id", ((Video) ListProtector.get(vl(), i)).getPlayAddr().getSourceId());
        c188727au.LJIIIZ("enter_method", str);
        FMX.LJIIL("play_privacy_highlights_video", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (vl().isEmpty()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        View findViewById = view.findViewById(R.id.hn1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.phl_feed_back)");
        C16880lQ.LJJJ((TuxIconView) findViewById, new ACListenerS28S0100000_8(this, 106));
        this.LJLJJI = (RecyclerView) view.findViewById(R.id.hn4);
        ((PagerLayoutManager) this.LJLJJLL.getValue()).LLIIIL = new KRU(this);
        RecyclerView recyclerView = this.LJLJJI;
        o.LJI(recyclerView);
        recyclerView.setLayoutManager((C0A2) this.LJLJJLL.getValue());
        RecyclerView recyclerView2 = this.LJLJJI;
        o.LJI(recyclerView2);
        recyclerView2.setAdapter((AbstractC029409q) this.LJLJJL.getValue());
        if (((Number) this.LJLILLLLZI.getValue()).intValue() > 0 && ((Number) this.LJLILLLLZI.getValue()).intValue() < vl().size()) {
            RecyclerView recyclerView3 = this.LJLJJI;
            o.LJI(recyclerView3);
            recyclerView3.LJLI(((Number) this.LJLILLLLZI.getValue()).intValue());
        }
    }

    public final void xl(int i, String str) {
        if (i < 0 || i >= vl().size()) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", (String) this.LJLIL.getValue());
        c188727au.LIZLLL(i, "position");
        c188727au.LJ(this.LJLL, "playtime");
        c188727au.LJIIIZ("exit_method", str);
        FMX.LJIIL("end_privacy_highlights_video", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agk, viewGroup, false);
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
