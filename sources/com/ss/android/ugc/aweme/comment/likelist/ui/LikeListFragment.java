package com.ss.android.ugc.aweme.comment.likelist.ui;

import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.AnonymousClass759;
import X.AnonymousClass793;
import X.AnonymousClass795;
import X.C03880Dg;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C174366sq;
import X.C174556t9;
import X.C178406zM;
import X.C181667Ba;
import X.C216728ey;
import X.C221108m2;
import X.C29822Bn8;
import X.C29S;
import X.C2P8;
import X.C32151Nz;
import X.C32I;
import X.C3C5;
import X.C57939MoZ;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C71Y;
import X.C72300SZc;
import X.C73305Spp;
import X.C76800UCe;
import X.C78886Uxe;
import X.C7ZN;
import X.C7ZP;
import X.C7ZT;
import X.C90903hW;
import X.EF7;
import X.EnumC178426zO;
import X.InterfaceC173976sD;
import X.InterfaceC57784Mm4;
import X.MGN;
import X.O6R;
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
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentColorModeViewModel;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeLoadMoreCell;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeNoMoreLimitCell;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeListFragment extends AmeBaseFragment implements AnonymousClass759 {
    public static final int LJZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(64));
    public Aweme LJLIL;
    public long LJLILLLLZI;
    public C174366sq LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public InterfaceC173976sD LJLJJLL;
    public boolean LJLJLJ;
    public CommentColorModeViewModel LJLLL;
    public final AnonymousClass793 LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 132));
    public volatile boolean LJLJLLL = true;
    public AnonymousClass795 LJLL = new AnonymousClass795(0);
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 136));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 133));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 131));
    public final C7ZN LJLLLL = new C7ZP() { // from class: X.7ZN
        public final LikeListFragment LJLJI;

        @Override // X.C7ZQ
        public final LifecycleOwner getLifecycleOwner() {
            return this.LJLJI;
        }

        {
            this.LJLJI = LikeListFragment.this;
        }

        @Override // X.SYX
        public final void LJIIL(SZZ data) {
            o.LJIIIZ(data, "data");
            if (!IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII() || !C7ZI.LIZIZ() || data.LJLIL.LIZJ != PowerPageState.End) {
                return;
            }
            int size = ((ArrayList) LikeListFragment.this.Dl().getState().LJII()).size();
            for (int i = 0; i < size; i++) {
                InterfaceC57784Mm4 LJI = LikeListFragment.this.Dl().getState().LJI(i);
                if (LJI instanceof C181667Ba) {
                    C181667Ba c181667Ba = (C181667Ba) LJI;
                    if (c181667Ba.LJLIL.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                        C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                        String uid = c181667Ba.LJLIL.getUid();
                        o.LJIIIIZZ(uid, "item.user.uid");
                        LikeListFragment.this.Dl().getState().LJIILL(i, C181667Ba.LIZ(c181667Ba, activityStatusViewModel.LJIIJ(uid), null, 23));
                        String uid2 = c181667Ba.LJLIL.getUid();
                        o.LJIIIIZZ(uid2, "item.user.uid");
                        C7ZR.LIZ(this, uid2, new AObserverS67S0200000_3(LikeListFragment.this, LJI, 0));
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

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // X.AnonymousClass759
    public final void qc(boolean z) {
    }

    @Override // X.AnonymousClass759
    public final void tg(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.7ZN] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.793] */
    public LikeListFragment() {
        final C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 10;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LikeLoadMoreCell.class;
        this.LJLLLLLL = new AbstractC72278SYg<List<? extends User>>(c57939MoZ) { // from class: X.793
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC67352kd<? super A2G<List<User>>> continuation) {
                o.LJIIIZ(continuation, "continuation");
                if (!LikeListFragment.this.isViewValid()) {
                    return;
                }
                if (LikeListFragment.this.LJLJLLL) {
                    LikeListFragment.this.LJLJLLL = false;
                    LikeListFragment.this.vl(C61878OQg.INSTANCE, continuation);
                    return;
                }
                LikeListResponse jv0 = LikeListFragment.this.Al().jv0();
                if (jv0 != null) {
                    LikeListFragment.this.Il(jv0, null, continuation, C61878OQg.INSTANCE, null);
                } else {
                    C71Y.LIZIZ("LikeListFragment", "configList onRefresh unknown error");
                }
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
                List params = (List) obj;
                o.LJIIIZ(continuation, "continuation");
                o.LJIIIZ(params, "params");
                if (!LikeListFragment.this.isViewValid()) {
                    return;
                }
                LikeListFragment.this.vl(params, continuation);
            }
        };
    }

    public final LikeListVM Al() {
        return (LikeListVM) this.LJLJL.getValue();
    }

    public final SYL Dl() {
        return (SYL) this.LJLLILLLL.getValue();
    }

    public final C73305Spp Gl() {
        return (C73305Spp) this.LJLLI.getValue();
    }

    @Override // X.AnonymousClass759
    public final void ig() {
        if (this.LJLJLJ) {
            Hl(true);
        }
        Jl(true);
    }

    public final void wl() {
        String str;
        String xl = xl();
        Aweme aweme = this.LJLIL;
        C174366sq c174366sq = this.LJLJI;
        if (c174366sq == null || (str = c174366sq.getEnterFrom()) == null) {
            str = "";
        }
        this.LJLL = new AnonymousClass795(xl, aweme, str);
    }

    public final String xl() {
        String aid;
        Aweme aweme = this.LJLIL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // X.AnonymousClass759
    public final RecyclerView LLIIIZ() {
        return Dl();
    }

    @Override // X.AnonymousClass759
    public final SY9 LLLI() {
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        SY9 sy9 = new SY9(context, R.raw.icon_heart);
        sy9.LJ(C78886Uxe.LJJIFFI(R.attr.gx, R.color.cu, context));
        return sy9;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!isViewValid()) {
            C71Y.LIZ("LikeListFragment", "view is not valid");
            return;
        }
        if (!C7ZT.LIZLLL() || Dl() == null || Dl().getVisibility() != 0) {
            return;
        }
        int size = ((ArrayList) Dl().getState().LJII()).size();
        for (int i = 0; i < size; i++) {
            InterfaceC57784Mm4 LJI = Dl().getState().LJI(i);
            if (LJI instanceof C181667Ba) {
                C181667Ba c181667Ba = (C181667Ba) LJI;
                String uid = c181667Ba.LJLIL.getUid();
                if (uid != null && uid.length() != 0) {
                    Dl().getState().LJIILL(i, C181667Ba.LIZ(c181667Ba, null, C2P8.LIZ(c181667Ba.LJLIL), 15));
                }
            }
        }
    }

    @Override // X.AnonymousClass759
    public final void Be(C174366sq c174366sq) {
        this.LJLJI = c174366sq;
        wl();
    }

    public final void Hl(boolean z) {
        if (isViewValid() && !o.LJ(Boolean.valueOf(z), Al().kv0().getValue())) {
            if (z) {
                ((Set) Al().LJLJLLL.getValue()).clear();
                ((Set) Al().LJLLI.getValue()).clear();
            }
            Al().kv0().setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final void Jl(boolean z) {
        ?? r2;
        List<User> likeList;
        if (!isViewValid()) {
            return;
        }
        LikeListVM Al = Al();
        String xl = xl();
        Al.getClass();
        if (!o.LJ(Al.LJLILLLLZI, xl)) {
            Al.LJLILLLLZI = xl;
        }
        LikeListResponse jv0 = Al().jv0();
        if (this.LJLJLLL || jv0 != null) {
            if (z && Gl() != null) {
                MGN mgn = MGN.LJLILLLLZI;
                C73305Spp statusView = Gl();
                o.LJIIIIZZ(statusView, "statusView");
                mgn.resetTipsBarrier(statusView);
            }
            InterfaceC173976sD interfaceC173976sD = this.LJLJJLL;
            if (interfaceC173976sD != null) {
                interfaceC173976sD.a3(this);
            }
            if (jv0 != null && (likeList = jv0.getLikeList()) != null) {
                r2 = new ArrayList(C32I.LJJL(likeList, 10));
                Iterator<User> it = likeList.iterator();
                while (it.hasNext()) {
                    r2.add(new C181667Ba(it.next(), this.LJLL, false, (List) null, 24));
                }
            } else {
                r2 = C61878OQg.INSTANCE;
            }
            Dl().getState().LJIILLIIL(r2);
            getOperator().refresh();
        }
    }

    @Override // X.AnonymousClass759
    public final void LJJLIIIJ(Aweme aweme) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAwemeChange, last:");
        LIZ.append(xl());
        LIZ.append(", cur:");
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        String xl = xl();
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        if (!o.LJ(xl, str2)) {
            this.LJLJLLL = true;
        }
        this.LJLIL = aweme;
        wl();
    }

    @Override // X.AnonymousClass759
    public final void Oa(C174366sq c174366sq) {
        if (C178406zM.LIZJ(this.LJLIL) == EnumC178426zO.ALLOW_COMMENT) {
            return;
        }
        mo49getActivity();
        ig();
    }

    @Override // X.AnonymousClass759
    public final void Y8(boolean z) {
        SYL Dl;
        if (!isViewValid()) {
            C71Y.LIZ("LikeListFragment", "view is not valid");
            return;
        }
        this.LJLJLJ = z;
        if (!z && (Dl = Dl()) != null) {
            C12460eI.LIZ(Dl);
        }
        Hl(z);
    }

    @Override // X.AnonymousClass759
    public final void d2(String closeMethod) {
        o.LJIIIZ(closeMethod, "closeMethod");
        Hl(false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        C174366sq c174366sq;
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("id");
        } else {
            serializable = null;
        }
        if (serializable instanceof C174366sq) {
            c174366sq = (C174366sq) serializable;
        } else {
            c174366sq = null;
        }
        this.LJLJI = c174366sq;
        if (c174366sq != null) {
            str = c174366sq.getInsertLikeUserIds();
        }
        this.LJLJJI = str;
        C174366sq c174366sq2 = this.LJLJI;
        if (c174366sq2 != null) {
            i = c174366sq2.getLikeUserCount();
        } else {
            i = 0;
        }
        this.LJLJJL = i;
        wl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-6722115461179548675");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/comment/likelist/ui/LikeListFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/comment/likelist/ui/LikeListFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
        } else {
            super.onHiddenChanged(z);
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/comment/likelist/ui/LikeListFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
        }
    }

    @Override // X.AnonymousClass759
    public final String v(Context context) {
        long iv0;
        long iv02;
        if (C178406zM.LJIIJJI()) {
            if (!isViewValid()) {
                iv02 = this.LJLILLLLZI;
            } else {
                iv02 = Al().iv0(this.LJLIL);
            }
            return C216728ey.LIZ(iv02, this.LJLIL);
        }
        if (context == null) {
            context = EF7.LIZIZ();
        }
        String LIZ = C29822Bn8.LIZ(context, R.string.g3w, "context\n            ?: A…hance_social_Likes_title)");
        if (!isViewValid()) {
            iv0 = this.LJLILLLLZI;
        } else {
            iv0 = Al().iv0(this.LJLIL);
        }
        return ujb.o.LJJJJZ(LIZ, "%d", C216728ey.LIZ(iv0, this.LJLIL), false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Dl().LLLF.LJZL(LikeCell.class);
        Dl().LLLF.LJZL(LikeNoMoreLimitCell.class);
        Dl().LJLJLLL(this.LJLLLLLL);
        Dl().LJLJLJ(new C72300SZc() { // from class: X.794
            @Override // X.C72300SZc
            public final void LJII() {
                LikeListFragment.this.Gl().LJFF();
            }

            @Override // X.C72300SZc
            public final void LJIIIIZZ() {
                C72808Sho<InterfaceC57784Mm4> state;
                SYL Dl = LikeListFragment.this.Dl();
                if (Dl != null && (state = Dl.getState()) != null && state.LJIIIIZZ() > 0) {
                    C78886Uxe.LJJLIIIJILLIZJL(LikeListFragment.this.Gl());
                }
            }

            @Override // X.C72300SZc
            public final void LJI(Exception exc) {
                C78886Uxe.LJJLIIIJJI(LikeListFragment.this.Gl());
                MGN mgn = MGN.LJLILLLLZI;
                if (mgn.isStandardUIEnable()) {
                    C73305Spp statusView = LikeListFragment.this.Gl();
                    o.LJIIIIZZ(statusView, "statusView");
                    mgn.setStatusView(statusView, "like_list_page", new AqS153S0100000_3(LikeListFragment.this, 134), exc);
                    ActivityC45651qj mo49getActivity = LikeListFragment.this.mo49getActivity();
                    if (mo49getActivity != null) {
                        mgn.triggerNetworkTips(mo49getActivity, "like_list_page", (Exception) null, LikeListFragment.this.Gl());
                        return;
                    }
                    return;
                }
                C73305Spp Gl = LikeListFragment.this.Gl();
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AqS153S0100000_3(LikeListFragment.this, 135));
                Gl.setStatus(c73306Spq);
            }
        });
        ((LiveData) Al().LJLJJLL.getValue()).observe(this, new AObserverS71S0100000_3(this, 43));
        ((LiveData) Al().LJLJL.getValue()).observe(this, new AObserverS71S0100000_3(this, 44));
        Dl().LJLJLJ(this.LJLLLL);
        if (this.LJLJLJ) {
            Hl(true);
        }
        Jl(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl(java.util.List r18, X.InterfaceC67352kd r19) {
        /*
            r17 = this;
            java.lang.String r5 = ""
            r9 = r18
            boolean r6 = r9.isEmpty()
            X.2mC r10 = new X.2mC
            r10.<init>()
            r3 = 0
            r2 = 0
            r7 = r17
            if (r6 == 0) goto L1d
            java.lang.String r0 = r7.LJLJJI
            if (r0 == 0) goto L1d
            int r0 = r0.length()
            if (r0 != 0) goto L9c
        L1d:
            r4 = r2
        L1e:
            r7.LJLJJI = r2
            if (r6 == 0) goto L8a
            com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM r1 = r7.Al()
            r1.getClass()
            X.79A r0 = new X.79A
            r0.<init>()
            X.SrC r2 = X.AbstractC73672Svk.LJIIJ(r0)
        L32:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L53
            X.Spp r0 = r7.Gl()
            r0.setVisibility(r3)
            X.Spp r0 = r7.Gl()
            r0.LJFF()
            X.Ol8 r0 = r7.LJLLJ
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
        L53:
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r2.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r0 = r1.LJJJ(r0)
            Y.AfS19S0400000_3 r6 = new Y.AfS19S0400000_3
            r11 = 1
            r8 = r19
            r6.<init>(r7, r8, r9, r10, r11)
            Y.AfS19S0400000_3 r11 = new Y.AfS19S0400000_3
            r16 = 2
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            X.3kP r1 = r0.LJJJLIIL(r6, r11)
            com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM r0 = r7.Al()
            X.Ol8 r0 = r0.LJLJLJ
            java.lang.Object r0 = r0.getValue()
            X.Sq2 r0 = (X.C73318Sq2) r0
            X.C78999UzT.LJFF(r1, r0)
            return
        L8a:
            com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM r2 = r7.Al()
            r2.getClass()
            Y.IDuS315S0100000_3 r1 = new Y.IDuS315S0100000_3
            r0 = 1
            r1.<init>(r2, r0)
            X.SrC r2 = X.AbstractC73672Svk.LJIIJ(r1)
            goto L32
        L9c:
            java.lang.String r4 = r7.LJLJJI     // Catch: java.lang.Throwable -> Ld5
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            com.google.gson.Gson r0 = X.C70Y.LIZ     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r0, r4, r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto Lc8
            java.util.List r0 = X.ORY.LJLIIIL(r0)     // Catch: java.lang.Throwable -> Ld5
        Lae:
            r10.element = r0     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r7.LJLJJI     // Catch: java.lang.Throwable -> Ld5
            kotlin.jvm.internal.o.LJI(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "["
            java.lang.String r1 = ujb.o.LJJJJZ(r1, r0, r5, r3)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "]"
            java.lang.String r1 = ujb.o.LJJJJZ(r1, r0, r5, r3)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "\""
            java.lang.String r4 = ujb.o.LJJJJZ(r1, r0, r5, r3)     // Catch: java.lang.Throwable -> Ld5
            goto Lce
        Lc8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld5
            r0.<init>()     // Catch: java.lang.Throwable -> Ld5
            goto Lae
        Lce:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Ld8
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Ld8
            goto L1e
        Ld5:
            r0 = move-exception
            r4 = r2
            goto Ld9
        Ld8:
            r0 = move-exception
        Ld9:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment.vl(java.util.List, X.2kd):void");
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
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.po, viewGroup, false);
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
    
        if (r4 < X.O6R.LJJIIJZLJL(Dl().getHeight() / com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment.LJZ)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Il(com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse r21, java.lang.Throwable r22, X.InterfaceC67352kd<? super X.A2G<java.util.List<com.ss.android.ugc.aweme.profile.model.User>>> r23, java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r24, java.util.List<java.lang.String> r25) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment.Il(com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse, java.lang.Throwable, X.2kd, java.util.List, java.util.List):void");
    }
}
