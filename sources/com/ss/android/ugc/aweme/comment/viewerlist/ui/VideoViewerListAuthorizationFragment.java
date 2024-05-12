package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.ActivityC45651qj;
import X.AnonymousClass759;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C174366sq;
import X.C178406zM;
import X.C1794072i;
import X.C216728ey;
import X.C29822Bn8;
import X.C29S;
import X.C3C5;
import X.C45631qh;
import X.C76800UCe;
import X.C79045V0n;
import X.C7GH;
import X.C90903hW;
import X.EF7;
import X.SY4;
import X.SY9;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoViewerListAuthorizationFragment extends AmeBaseFragment implements AnonymousClass759 {
    public long LJLIL;
    public Aweme LJLILLLLZI;
    public C174366sq LJLJI;
    public C45631qh LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.AnonymousClass759
    public final void D0(float f, int i) {
    }

    @Override // X.AnonymousClass759
    public final RecyclerView LLIIIZ() {
        return null;
    }

    @Override // X.AnonymousClass759
    public final void LLJLILLLLZIIL(int i) {
    }

    @Override // X.AnonymousClass759
    public final void Oa(C174366sq c174366sq) {
    }

    @Override // X.AnonymousClass759
    public final void ce() {
    }

    @Override // X.AnonymousClass759
    public final void ig() {
    }

    @Override // X.AnonymousClass759
    public final void qc(boolean z) {
    }

    @Override // X.AnonymousClass759
    public final void tg(boolean z) {
    }

    @Override // X.AnonymousClass759
    public final SY9 LLLI() {
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        SY9 sy9 = new SY9(context, R.raw.icon_play);
        Integer LJI = C79045V0n.LJI(R.attr.gx, context);
        if (LJI != null) {
            sy9.LJ(LJI.intValue());
        }
        return sy9;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AnonymousClass759
    public final void Be(C174366sq c174366sq) {
        this.LJLJI = c174366sq;
    }

    @Override // X.AnonymousClass759
    public final void LJJLIIIJ(Aweme aweme) {
        this.LJLILLLLZI = aweme;
    }

    @Override // X.AnonymousClass759
    public final void Y8(boolean z) {
        String str;
        long j;
        AwemeStatistics statistics;
        if (z) {
            C174366sq c174366sq = this.LJLJI;
            if (c174366sq == null || (str = c174366sq.getEventType()) == null) {
                str = "";
            }
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null && (statistics = aweme.getStatistics()) != null) {
                j = statistics.getPlayCount();
            } else {
                j = 0;
            }
            C1794072i.LJFF(j, str, "show", "post");
        }
    }

    @Override // X.AnonymousClass759
    public final void d2(String closeMethod) {
        o.LJIIIZ(closeMethod, "closeMethod");
    }

    @Override // X.AnonymousClass759
    public final String v(Context context) {
        long LJ;
        if (C178406zM.LJIIJJI()) {
            if (!isViewValid()) {
                LJ = this.LJLIL;
            } else {
                LJ = C7GH.LJ(this.LJLILLLLZI);
            }
            return C216728ey.LIZ(LJ, this.LJLILLLLZI);
        }
        if (context == null) {
            context = EF7.LIZIZ();
        }
        return ujb.o.LJJJJZ(C29822Bn8.LIZ(context, R.string.tp5, "context\n            ?: A….video_view_list_views_n)"), "%s", C216728ey.LIZ(this.LJLIL, this.LJLILLLLZI), false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SY4 sy4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        C45631qh c45631qh = null;
        if (view2 != null) {
            c45631qh = (C45631qh) view2.findViewById(R.id.kw4);
        }
        this.LJLJJI = c45631qh;
        if (c45631qh != null) {
            c45631qh.post(new ARunnableS39S0100000_3(this, 158));
        }
        View view3 = getView();
        if (view3 != null && (sy4 = (SY4) view3.findViewById(R.id.az5)) != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 223));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.baq, viewGroup, false);
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
