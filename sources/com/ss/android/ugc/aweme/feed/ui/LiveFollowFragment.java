package com.ss.android.ugc.aweme.feed.ui;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.BZI;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C31413CUn;
import X.C3C5;
import X.C54441LYf;
import X.C54727Ldr;
import X.C54729Ldt;
import X.C54730Ldu;
import X.C54732Ldw;
import X.C62822Ol8;
import X.C73353Sqb;
import X.C76800UCe;
import X.C81335Vw3;
import X.C86393XvR;
import X.C90903hW;
import X.InterfaceC54761LeP;
import X.InterfaceC54978Lhu;
import X.InterfaceC61213O0r;
import X.LYN;
import X.LYP;
import X.LYQ;
import X.LYR;
import X.LYT;
import X.OSZ;
import Y.ACListenerS29S0100000_9;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import webcast.api.feed.FollowRecommendItem;

@InterfaceC61213O0r
/* loaded from: classes10.dex */
public final class LiveFollowFragment extends AmeBaseFragment implements InterfaceC54978Lhu {
    public String LJLIL;
    public TuxIconView LJLILLLLZI;
    public RecyclerView LJLJI;
    public C81335Vw3 LJLJJL;
    public LYN LJLJJLL;
    public long LJLJL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C31413CUn LJLJJI = new C31413CUn();
    public final LYT LJLJLJ = new LYT(this);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 230));

    @Override // X.InterfaceC54978Lhu
    public final void LJ() {
        LYN lyn = this.LJLJJLL;
        if (lyn != null) {
            lyn.LIZIZ();
        }
        LYN lyn2 = this.LJLJJLL;
        if (lyn2 != null) {
            lyn2.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LYN lyn = this.LJLJJLL;
        if (lyn != null) {
            lyn.LIZIZ.LIZLLL();
            ((ArrayList) lyn.LJ).clear();
            ((ArrayList) lyn.LIZLLL).clear();
        }
        this.LJLJJLL = null;
        this.LJLJL = 0L;
        C73353Sqb.LIZIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLJL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int i;
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZIZ;
        List<Object> list;
        List<FollowRecommendItem> list2;
        super.onResume();
        if (this.LJLJL > 0 && System.currentTimeMillis() - this.LJLJL >= 60000) {
            LYN lyn = this.LJLJJLL;
            if (lyn != null) {
                lyn.LIZIZ();
            }
            LYN lyn2 = this.LJLJJLL;
            if (lyn2 != null) {
                lyn2.LIZJ();
            }
        }
        LYN lyn3 = this.LJLJJLL;
        if (lyn3 == null || (list2 = lyn3.LJ) == null || (str = Integer.valueOf(((ArrayList) list2).size()).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String str2 = this.LJLIL;
        if (str2 == null) {
            str2 = "draw";
        }
        LYN lyn4 = this.LJLJJLL;
        if (lyn4 != null && (list = lyn4.LIZLLL) != null) {
            i = ((ArrayList) list).size();
        } else {
            i = 0;
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_live_cover_second_list_show")) != null && (LIZIZ = LJJLIIJ.LIZIZ(C113554cx.LJJL(new OSZ("enter_from_merge", "homepage_follow"), new OSZ("enter_method", "live_cover"), new OSZ("enter_type", str2), new OSZ("live_anchor_num", String.valueOf(i)), new OSZ("recommend_anchor_num", str)))) != null) {
            LIZIZ.LJJIIJZLJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Intent intent;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (intent = mo49getActivity.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent, "enterType")) == null) {
            str = "draw";
        }
        this.LJLIL = str;
        C73353Sqb.LJ().LJII();
        C73353Sqb.LJ().LJIIIZ(0L);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        RecyclerView recyclerView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJLL = new LYN(this);
        View view2 = getView();
        C81335Vw3 c81335Vw3 = null;
        if (view2 != null) {
            tuxIconView = (TuxIconView) view2.findViewById(R.id.aei);
        } else {
            tuxIconView = null;
        }
        this.LJLILLLLZI = tuxIconView;
        View view3 = getView();
        if (view3 != null) {
            recyclerView = (RecyclerView) view3.findViewById(R.id.dl2);
        } else {
            recyclerView = null;
        }
        this.LJLJI = recyclerView;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView3 = this.LJLJI;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LJLJJI);
        }
        View view4 = getView();
        if (view4 != null) {
            c81335Vw3 = (C81335Vw3) view4.findViewById(R.id.dl3);
        }
        this.LJLJJL = c81335Vw3;
        if (c81335Vw3 != null) {
            c81335Vw3.setOnRefreshListener(this);
        }
        TuxIconView tuxIconView2 = this.LJLILLLLZI;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS29S0100000_9(this, 195));
        }
        this.LJLJJI.LJLZ(LYR.class, new C54727Ldr());
        this.LJLJJI.LJLZ(LYP.class, new C54730Ldu(this.LJLJLJ));
        this.LJLJJI.LJLZ(LYQ.class, new C54729Ldt(this.LJLJLJ));
        this.LJLJJI.LJLZ(FollowRecommendItem.class, new C54732Ldw(this.LJLJLJ));
        LYN lyn = this.LJLJJLL;
        if (lyn != null) {
            lyn.LIZLLL(FollowSkyLightHelper.LJIJJLI);
            lyn.LIZ();
        }
        LYN lyn2 = this.LJLJJLL;
        if (lyn2 != null) {
            lyn2.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        ActivityC86117Xqz activityC86117Xqz = (ActivityC86117Xqz) this.LJLJLLL.getValue();
        if (activityC86117Xqz != null) {
            activityC86117Xqz.activityConfiguration(C54441LYf.LJLIL);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3t, viewGroup, false);
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
