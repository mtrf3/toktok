package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.AbstractC213068Xu;
import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.AnonymousClass922;
import X.C107794Kx;
import X.C108814Ov;
import X.C174036sJ;
import X.C187227Wk;
import X.C196437nL;
import X.C196487nQ;
import X.C1DH;
import X.C2067689o;
import X.C209108Io;
import X.C213118Xz;
import X.C221108m2;
import X.C222588oQ;
import X.C232629Ba;
import X.C2MA;
import X.C2QN;
import X.C2U8;
import X.C31081Jw;
import X.C4LD;
import X.C55096Ljo;
import X.C56682Ki;
import X.C62822Ol8;
import X.C8RL;
import X.C9BZ;
import X.C9CI;
import X.IQE;
import X.InterfaceC212878Xb;
import X.InterfaceC212998Xn;
import X.InterfaceC213058Xt;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55062LjG;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC57312Mt;
import Y.ARunnableS39S0100000_3;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class NowPostCardFeedViewHolder<R extends InterfaceC212998Xn<R, ITEM>, ITEM extends C8RL> extends AssemReusedContainer<R, ITEM> implements C2MA, InterfaceC213058Xt<R, ITEM> {
    public static boolean LJLLLLLL;
    public final C222588oQ LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public Aweme LJLLL;
    public NowListFragmentPanel LJLLLL;

    @Override // X.C2MA
    public final void A7(String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void A8() {
    }

    @Override // X.C2MA
    public final void B7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void C7(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void D7(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean D8() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void E8(int i, Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void F8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void G7(boolean z) {
    }

    @Override // X.C2MA
    public final void H8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean I8() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void J7(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void J8(int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean K7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void L5(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void L8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJII(C56682Ki c56682Ki) {
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final InterfaceC57312Mt LJIIIIZZ() {
        return null;
    }

    public abstract ReusedUIAssem<?> LJLIIL();

    @Override // X.C2MA
    public final /* synthetic */ InterfaceC222698ob LLJJIJIL() {
        return null;
    }

    @Override // X.C2MA
    public final InterfaceC222708oc LLLJ() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void N8(long j, long j2, int i, long j3, long j4, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void O7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean O8() {
        return false;
    }

    @Override // X.C2MA
    public final void P7(C9BZ c9bz) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void P8(int i, String str) {
    }

    @Override // X.C2MA
    public final void Q7(String enterMethodValue) {
        o.LJIIIZ(enterMethodValue, "enterMethodValue");
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean R7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean S7() {
        return false;
    }

    @Override // X.C2MA
    public final void T7(C187227Wk c187227Wk) {
    }

    @Override // X.C2MA
    public final void U7(C232629Ba c232629Ba) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void U8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void V7(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ View V8(String str, boolean z) {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2067689o X8() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2MA Y6() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void Y7(C174036sJ c174036sJ) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean Y8() {
        return false;
    }

    @Override // X.C2MA
    public final void Z1(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z6(C209108Io c209108Io) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a7(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a8() {
    }

    @Override // X.C2MA
    public final void b2(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void b7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void b8(String str) {
    }

    @Override // X.C2MA
    public final void c2(long j) {
    }

    @Override // X.C2MA
    public final void c7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void c8(Aweme aweme) {
    }

    @Override // X.C2MA
    public final void c9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void checkViewHolderState() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean d7() {
        return true;
    }

    @Override // X.C2MA
    public final void d8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void d9() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean e7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void e8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void e9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void f7(int i, int i2, String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void f8(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean f9() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void g7(Map map) {
    }

    @Override // X.C2MA
    public final /* synthetic */ C2MA getViewHolderByAwemeId(String str) {
        return null;
    }

    @Override // X.C2MA
    public final void h7(int i, long j) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean i7() {
        return true;
    }

    @Override // X.C2MA
    public final AnonymousClass901 j3() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void j7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j8() {
    }

    @Override // X.C2MA
    public final void m6(Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void m7(C108814Ov c108814Ov) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void n8(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o6(C2QN c2qn) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o8(int i, String str, boolean z) {
    }

    @Override // X.C2MA
    public final void onDestroyView() {
    }

    @Override // X.C2MA
    public final void onPageSelected(int i) {
    }

    @Override // X.C2MA
    public final void onPause() {
    }

    @Override // X.C2MA
    public final void onResume() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void p8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean q7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void r5(int i, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ ImageView s7() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void s8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final void t8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean u7() {
        return true;
    }

    @Override // X.C2MA
    public final void u8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void v7(boolean z) {
    }

    @Override // X.C2MA
    public final void w1() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void x7(float f, float f2, int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void x8(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void y8(int i, String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ View.OnTouchListener z() {
        return null;
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLLILLLL.LIZJ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LJJLI() {
        return this.LJLLILLLL.LIZJ;
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLLILLLL.LIZJ.mo49getActivity();
    }

    @Override // X.C2MA
    public final int getAwemeType() {
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 41;
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLLILLLL.LIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        InterfaceC55100Ljs interfaceC55100Ljs = this.LJLLILLLL.LJIIL;
        if (interfaceC55100Ljs != null) {
            return C55096Ljo.LJIJ(interfaceC55100Ljs);
        }
        return null;
    }

    @Override // X.C2MA
    public final Aweme O1() {
        return getAweme();
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final Aweme getCurrentAweme() {
        return getAweme();
    }

    @Override // X.C2MA
    public final IQE I7() {
        return IQE.INITIALIZED;
    }

    @Override // X.C2MA
    public final Aweme getAweme() {
        return this.LJLLL;
    }

    @Override // X.C2MA
    public final void unBind() {
        LJLIIIL();
    }

    @Override // X.C2MA
    public final void B8(boolean z) {
        LJJIJIIJIL(2);
    }

    @Override // X.C2MA
    public final void LIZLLL(Aweme aweme) {
        this.LJLLL = aweme;
        NowListFragmentPanel nowListFragmentPanel = this.LJLLLL;
        if (nowListFragmentPanel != null && !nowListFragmentPanel.LJLJL) {
            C196487nQ.LIZIZ(nowListFragmentPanel);
            nowListFragmentPanel.LJLJL = true;
        }
        if (LJLLLLLL) {
            return;
        }
        LJLLLLLL = true;
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 81));
    }

    @Override // X.C2MA
    public final void LJJIII(int i) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLLJ.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AqS28S0001000_3(i, 25));
    }

    @Override // X.C2MA
    public final void LJJIJIIJIL(int i) {
        ((AssemViewModel) this.LJLLJ.getValue()).setState(C213118Xz.LJLIL);
    }

    @Override // X.C2MA
    public final void j5(C107794Kx c107794Kx) {
        Aweme LJIJI;
        long j;
        if (c107794Kx != null && (LJIJI = C4LD.LIZ.LJIJI()) != null && TextUtils.equals(c107794Kx.LJLJL, LJIJI.getAid())) {
            if (!TextUtils.isEmpty(c107794Kx.LJLJLLL)) {
                j = 500;
            } else {
                j = 0;
            }
            AnonymousClass922.LIZLLL(c107794Kx, new C31081Jw((BottomToastVM) ViewModelProviders.of(this.LJLLILLLL.LIZJ).get(BottomToastVM.class)), j, LJIJI);
        }
    }

    @Override // X.C2MA
    public final void k7(View view) {
        String str;
        AbstractC213068Xu abstractC213068Xu;
        C196437nL c196437nL = NowListFragmentPanel.LJLJLJ;
        C222588oQ c222588oQ = this.LJLLILLLL;
        Fragment fragment = c222588oQ.LIZJ;
        InterfaceC212878Xb<VideoBaseCell, VideoItemParams> interfaceC212878Xb = c222588oQ.LJIILL;
        InterfaceC55062LjG interfaceC55062LjG = null;
        if ((interfaceC212878Xb instanceof AbstractC213068Xu) && (abstractC213068Xu = (AbstractC213068Xu) interfaceC212878Xb) != null) {
            interfaceC55062LjG = abstractC213068Xu.LIZ;
        }
        String str2 = c222588oQ.LJIIIZ;
        if (c222588oQ.LJ.isFromPostList) {
            str = "video_cover";
        } else {
            str = "feed";
        }
        this.LJLLLL = c196437nL.LIZIZ(fragment, interfaceC55062LjG, str2, str);
        LJJLL(LJLIIL(), view, this);
    }

    @Override // X.C2MA
    public final void l8(int i) {
        C2U8.LIZ(new C9CI(this.LJLLL));
        ((VideoViewModel) this.LJLLJ.getValue()).iv0(i, null);
    }

    @Override // X.C2MA
    public final void t7(boolean z) {
        String str;
        VideoViewModel videoViewModel = (VideoViewModel) this.LJLLJ.getValue();
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        videoViewModel.jv0(str, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NowPostCardFeedViewHolder(C222588oQ params, InterfaceC212878Xb<R, ITEM> interfaceC212878Xb) {
        super(interfaceC212878Xb);
        o.LJIIIZ(params, "params");
        this.LJLLILLLL = params;
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3((NowPostCardFeedViewHolder) this, 577));
    }

    public void LLLZ(int i, Aweme aweme) {
        LIZLLL(aweme);
    }
}
