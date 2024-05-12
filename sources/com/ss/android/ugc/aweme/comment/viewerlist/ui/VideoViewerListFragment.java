package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.ActivityC45651qj;
import X.AnonymousClass759;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C174366sq;
import X.C174556t9;
import X.C175046tw;
import X.C178406zM;
import X.C181677Bb;
import X.C216728ey;
import X.C221108m2;
import X.C29822Bn8;
import X.C29S;
import X.C2P8;
import X.C3C5;
import X.C62822Ol8;
import X.C71Y;
import X.C72300SZc;
import X.C72808Sho;
import X.C73305Spp;
import X.C76800UCe;
import X.C78886Uxe;
import X.C7GH;
import X.C7ZO;
import X.C7ZP;
import X.C7ZT;
import X.C90903hW;
import X.EF7;
import X.InterfaceC173976sD;
import X.InterfaceC57784Mm4;
import X.QD3;
import X.SY9;
import X.SYL;
import X.X1D;
import Y.AObserverS67S0200000_3;
import Y.AObserverS71S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.page.PowerPageState;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.comment.adapter.VideoViewerCell;
import com.ss.android.ugc.aweme.comment.adapter.VideoViewerNoMoreLimitCell;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentColorModeViewModel;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewerListFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class VideoViewerListFragment extends AmeBaseFragment implements AnonymousClass759 {
    public long LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public InterfaceC173976sD LJLJJI;
    public C174366sq LJLJJL;
    public Aweme LJLJJLL;
    public boolean LJLJL;
    public CommentColorModeViewModel LJLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public volatile boolean LJLJLJ = true;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 151));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 150));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 147));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 148));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 149));
    public final C7ZO LJLLLL = new C7ZP() { // from class: X.7ZO
        public final VideoViewerListFragment LJLJI;

        @Override // X.C7ZQ
        public final LifecycleOwner getLifecycleOwner() {
            return this.LJLJI;
        }

        {
            this.LJLJI = VideoViewerListFragment.this;
        }

        @Override // X.SYX
        public final void LJIIL(SZZ data) {
            o.LJIIIZ(data, "data");
            if (!IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII() || !C7ZI.LIZIZ() || data.LJLIL.LIZJ != PowerPageState.End) {
                return;
            }
            int size = ((ArrayList) VideoViewerListFragment.this.vl().getState().LJII()).size();
            for (int i = 0; i < size; i++) {
                InterfaceC57784Mm4 LJI = VideoViewerListFragment.this.vl().getState().LJI(i);
                if (LJI instanceof C181677Bb) {
                    C181677Bb c181677Bb = (C181677Bb) LJI;
                    if (c181677Bb.LJLIL.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                        C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                        String uid = c181677Bb.LJLIL.getUid();
                        o.LJIIIIZZ(uid, "item.user.uid");
                        VideoViewerListFragment.this.vl().getState().LJIILL(i, C181677Bb.LIZ(c181677Bb, activityStatusViewModel.LJIIJ(uid), null, 11));
                        String uid2 = c181677Bb.LJLIL.getUid();
                        o.LJIIIIZZ(uid2, "item.user.uid");
                        C7ZR.LIZ(this, uid2, new AObserverS67S0200000_3(VideoViewerListFragment.this, LJI, 1));
                    }
                }
            }
        }
    };

    @Override // X.AnonymousClass759
    public final void D0(float f, int i) {
    }

    @Override // X.AnonymousClass759
    public final void LLJLILLLLZIIL(int i) {
    }

    @Override // X.AnonymousClass759
    public final void Oa(C174366sq c174366sq) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    @Override // X.AnonymousClass759
    public final void ce() {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.AnonymousClass759
    public final void qc(boolean z) {
    }

    @Override // X.AnonymousClass759
    public final void tg(boolean z) {
    }

    public final SYL vl() {
        return (SYL) this.LJLLILLLL.getValue();
    }

    public final C73305Spp wl() {
        return (C73305Spp) this.LJLL.getValue();
    }

    public final VideoViewerListVM xl() {
        return (VideoViewerListVM) this.LJLJLLL.getValue();
    }

    @Override // X.AnonymousClass759
    public final RecyclerView LLIIIZ() {
        return vl();
    }

    @Override // X.AnonymousClass759
    public final SY9 LLLI() {
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        SY9 sy9 = new SY9(context, R.raw.icon_play);
        sy9.LJ(C78886Uxe.LJJIFFI(R.attr.gx, R.color.cu, context));
        return sy9;
    }

    @Override // X.AnonymousClass759
    public final void ig() {
        if (!isViewValid()) {
            return;
        }
        C71Y.LIZLLL("VideoViewerListFragment", "onCommentPageShow");
        if (this.LJLJL) {
            Al(true);
        }
        Dl(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!isViewValid() || !C7ZT.LIZIZ() || vl() == null || vl().getVisibility() != 0) {
            return;
        }
        int size = ((ArrayList) vl().getState().LJII()).size();
        for (int i = 0; i < size; i++) {
            InterfaceC57784Mm4 LJI = vl().getState().LJI(i);
            if (LJI instanceof C181677Bb) {
                C181677Bb c181677Bb = (C181677Bb) LJI;
                String uid = c181677Bb.LJLIL.getUid();
                if (uid != null && uid.length() != 0) {
                    vl().getState().LJIILL(i, C181677Bb.LIZ(c181677Bb, null, C2P8.LIZ(c181677Bb.LJLIL), 7));
                }
            }
        }
    }

    public static void Dl(VideoViewerListFragment videoViewerListFragment) {
        C72808Sho<InterfaceC57784Mm4> state;
        if (!videoViewerListFragment.isViewValid() || !videoViewerListFragment.LJLJLJ) {
            return;
        }
        SYL vl = videoViewerListFragment.vl();
        if (vl != null && (state = vl.getState()) != null) {
            state.LJFF();
        }
        videoViewerListFragment.LJLJLJ = false;
        C71Y.LIZLLL("VideoViewerListFragment", "triggerRefresh");
        InterfaceC173976sD interfaceC173976sD = videoViewerListFragment.LJLJJI;
        if (interfaceC173976sD != null) {
            interfaceC173976sD.a3(videoViewerListFragment);
        }
        videoViewerListFragment.xl().LJLLI.getOperator().refresh();
    }

    public final void Al(boolean z) {
        if (isViewValid() && !o.LJ(Boolean.valueOf(z), xl().hv0().getValue())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyPageShow: ");
            LIZ.append(z);
            C71Y.LIZ("VideoViewerListFragment", X1D.LIZIZ(LIZ));
            if (z) {
                ((Set) xl().LJLJJL.getValue()).clear();
                ((Set) xl().LJLJJLL.getValue()).clear();
            }
            xl().hv0().setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.AnonymousClass759
    public final void Be(C174366sq c174366sq) {
        this.LJLJJL = c174366sq;
    }

    @Override // X.AnonymousClass759
    public final void LJJLIIIJ(Aweme aweme) {
        String str;
        String str2;
        String str3;
        String enterFrom;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAwemeChange, last:");
        Aweme aweme2 = this.LJLJJLL;
        String str4 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(", cur:");
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Aweme aweme3 = this.LJLJJLL;
        if (aweme3 == null || (str3 = aweme3.getAid()) == null) {
            str3 = "";
        }
        if (aweme != null) {
            str4 = aweme.getAid();
        }
        if (!o.LJ(str3, str4)) {
            this.LJLJLJ = true;
        }
        this.LJLJJLL = aweme;
        xl().LJLJI = this.LJLJJLL;
        VideoViewerListVM xl = xl();
        C174366sq c174366sq = this.LJLJJL;
        if (c174366sq != null && (enterFrom = c174366sq.getEnterFrom()) != null) {
            str5 = enterFrom;
        }
        xl.getClass();
        xl.LJLJJI = str5;
    }

    @Override // X.AnonymousClass759
    public final void Y8(boolean z) {
        if (!isViewValid()) {
            return;
        }
        this.LJLJL = z;
        Al(z);
        if (!z && vl() != null) {
            SYL listView = vl();
            o.LJIIIIZZ(listView, "listView");
            C12460eI.LIZ(listView);
        }
    }

    @Override // X.AnonymousClass759
    public final void d2(String closeMethod) {
        o.LJIIIZ(closeMethod, "closeMethod");
        Al(false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C175046tw c175046tw) {
        C72808Sho<InterfaceC57784Mm4> state;
        String str;
        User user;
        C71Y.LIZLLL("VideoViewerListFragment", "onBlockUserEvent refresh ");
        SYL vl = vl();
        if (vl != null && (state = vl.getState()) != null) {
            Iterator it = ((ArrayList) state.LJII()).iterator();
            while (it.hasNext()) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                if (interfaceC57784Mm4 instanceof C181677Bb) {
                    String uid = ((C181677Bb) interfaceC57784Mm4).LJLIL.getUid();
                    if (c175046tw != null && (user = c175046tw.LJLIL) != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(uid, str)) {
                        C71Y.LIZLLL("VideoViewerListFragment", "onBlockUserEvent view in list ");
                        this.LJLJLJ = true;
                        Dl(this);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C174366sq c174366sq = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("id");
        } else {
            serializable = null;
        }
        if (serializable instanceof C174366sq) {
            c174366sq = (C174366sq) serializable;
        }
        this.LJLJJL = c174366sq;
    }

    @Override // X.AnonymousClass759
    public final String v(Context context) {
        long j;
        long LJ;
        if (C178406zM.LJIIJJI()) {
            if (!isViewValid()) {
                LJ = this.LJLIL;
            } else {
                LJ = C7GH.LJ(this.LJLJJLL);
            }
            return C216728ey.LIZ(LJ, this.LJLJJLL);
        }
        if (context == null) {
            context = EF7.LIZIZ();
        }
        String LIZ = C29822Bn8.LIZ(context, R.string.tp5, "context\n            ?: A….video_view_list_views_n)");
        if (!isViewValid()) {
            j = this.LJLIL;
        } else {
            j = this.LJLJI;
            long LJ2 = C7GH.LJ(this.LJLJJLL);
            if (LJ2 >= j) {
                j = LJ2;
            }
        }
        this.LJLILLLLZI = j;
        return ujb.o.LJJJJZ(LIZ, "%s", C216728ey.LIZ(j, this.LJLJJLL), false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        SYL vl = vl();
        if (vl != null) {
            vl.LLLF.LJZL(VideoViewerCell.class);
            vl.setItemAnimator(null);
            vl.LLLF.LJZL(VideoViewerNoMoreLimitCell.class);
            vl.LJLJLJ(new C72300SZc() { // from class: X.76f
                @Override // X.C72300SZc
                public final void LJII() {
                    VideoViewerListFragment videoViewerListFragment = VideoViewerListFragment.this;
                    videoViewerListFragment.getClass();
                    C71Y.LIZLLL("VideoViewerListFragment", "onLoading");
                    SYL vl2 = videoViewerListFragment.vl();
                    if (vl2 != null) {
                        C78886Uxe.LJJLIIIJILLIZJL(vl2);
                    }
                    C78886Uxe.LJJLIIIJJI(videoViewerListFragment.wl());
                    videoViewerListFragment.wl().LJFF();
                    C78886Uxe.LJJLIIIJILLIZJL((View) videoViewerListFragment.LJLLI.getValue());
                }

                @Override // X.C72300SZc
                public final void LJIIIIZZ() {
                    long j;
                    String str2;
                    Aweme aweme;
                    AwemeStatistics statistics;
                    C72808Sho<InterfaceC57784Mm4> state;
                    Context context;
                    C73305Spp wl;
                    VideoViewerListFragment videoViewerListFragment = VideoViewerListFragment.this;
                    videoViewerListFragment.getClass();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onLoadSuccess ");
                    LIZ.append(videoViewerListFragment.vl().getState().LJIIIIZZ());
                    C71Y.LIZLLL("VideoViewerListFragment", X1D.LIZIZ(LIZ));
                    SYL vl2 = videoViewerListFragment.vl();
                    if (vl2 != null && (state = vl2.getState()) != null && ((ArrayList) state.LJII()).isEmpty()) {
                        SYL vl3 = videoViewerListFragment.vl();
                        if (vl3 != null) {
                            C78886Uxe.LJJLIIIJILLIZJL(vl3);
                        }
                        C73305Spp wl2 = videoViewerListFragment.wl();
                        if (wl2 != null) {
                            wl2.setVisibility(0);
                        }
                        C73305Spp wl3 = videoViewerListFragment.wl();
                        if (wl3 != null && (context = wl3.getContext()) != null && (wl = videoViewerListFragment.wl()) != null) {
                            C73306Spq c73306Spq = new C73306Spq();
                            c73306Spq.LJI = C29822Bn8.LIZ(context, R.string.tof, "this.resources.getString…t_bottom_not_showing_all)");
                            wl.setStatus(c73306Spq);
                        }
                        View view2 = (View) videoViewerListFragment.LJLLI.getValue();
                        if (view2 != null) {
                            C78886Uxe.LJJLIIIJILLIZJL(view2);
                        }
                    } else {
                        View view3 = (View) videoViewerListFragment.LJLLI.getValue();
                        if (view3 != null) {
                            C78886Uxe.LJJLIIIJILLIZJL(view3);
                        }
                        SYL vl4 = videoViewerListFragment.vl();
                        if (vl4 != null) {
                            C78886Uxe.LJJLIIIJJI(vl4);
                        }
                        videoViewerListFragment.wl().setVisibility(8);
                    }
                    C174366sq c174366sq = VideoViewerListFragment.this.LJLJJL;
                    long j2 = 0;
                    if (c174366sq != null && (aweme = c174366sq.getAweme()) != null && (statistics = aweme.getStatistics()) != null) {
                        j = statistics.getPlayCount();
                    } else {
                        j = 0;
                    }
                    java.util.Map map = (java.util.Map) VideoViewerListFragment.this.xl().LJLJLJ.getValue();
                    Aweme aweme2 = VideoViewerListFragment.this.LJLJJLL;
                    String str3 = null;
                    if (aweme2 == null || (str2 = aweme2.getAid()) == null) {
                        str2 = "";
                    }
                    Long l = (Long) map.get(str2);
                    if (l != null) {
                        j2 = l.longValue();
                    }
                    C174366sq c174366sq2 = VideoViewerListFragment.this.LJLJJL;
                    if (c174366sq2 != null) {
                        str3 = c174366sq2.getEnterFrom();
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", str3);
                    c188727au.LJ(j, "vv_cnt");
                    c188727au.LJ(j2, "views_show_cnt");
                    FMX.LJIIL("enter_video_views_panel", c188727au.LIZ);
                }

                @Override // X.C72300SZc
                public final void LJI(Exception exc) {
                    VideoViewerListFragment videoViewerListFragment = VideoViewerListFragment.this;
                    videoViewerListFragment.getClass();
                    C71Y.LIZLLL("VideoViewerListFragment", "onLoadError");
                    videoViewerListFragment.wl().setVisibility(0);
                    MGN mgn = MGN.LJLILLLLZI;
                    if (mgn.isStandardUIEnable()) {
                        C73305Spp statusView = videoViewerListFragment.wl();
                        o.LJIIIIZZ(statusView, "statusView");
                        mgn.setStatusView(statusView, "viewer_list_page", new AqS153S0100000_3(videoViewerListFragment, 1515), exc);
                        ActivityC45651qj mo49getActivity = videoViewerListFragment.mo49getActivity();
                        if (mo49getActivity != null) {
                            mgn.triggerNetworkTips(mo49getActivity, "viewer_list_page", (Exception) null, videoViewerListFragment.wl());
                        }
                    } else {
                        videoViewerListFragment.wl().setStatus((C73306Spq) videoViewerListFragment.LJLLJ.getValue());
                    }
                    SYL vl2 = videoViewerListFragment.vl();
                    if (vl2 != null) {
                        C78886Uxe.LJJLIIIJILLIZJL(vl2);
                    }
                    C78886Uxe.LJJLIIIJILLIZJL((View) videoViewerListFragment.LJLLI.getValue());
                }
            });
            vl.LJLJLLL(xl().LJLLI);
            vl.LJLJLJ(this.LJLLLL);
        }
        xl().LJLJI = this.LJLJJLL;
        VideoViewerListVM xl = xl();
        C174366sq c174366sq = this.LJLJJL;
        if (c174366sq == null || (str = c174366sq.getEnterFrom()) == null) {
            str = "";
        }
        xl.getClass();
        xl.LJLJJI = str;
        ((LiveData) xl().LJLJLLL.getValue()).observe(this, new AObserverS71S0100000_3(this, 13));
        this.LJLJLJ = true;
        if (this.LJLJL) {
            Al(true);
        }
        Dl(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater;
        o.LJIIIZ(inflater, "inflater");
        Fragment parentFragment = getParentFragment();
        C29S c29s = null;
        if (!(parentFragment instanceof CommentListPageFragment)) {
            parentFragment = null;
        }
        if (parentFragment != null) {
            this.LJLLL = C174556t9.LIZ(parentFragment);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            CommentColorModeViewModel commentColorModeViewModel = this.LJLLL;
            if (commentColorModeViewModel != null) {
                layoutInflater = commentColorModeViewModel.hv0(mo49getActivity);
            } else {
                layoutInflater = null;
            }
            if (layoutInflater != null) {
                inflater = layoutInflater;
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.pq, viewGroup, false);
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
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
