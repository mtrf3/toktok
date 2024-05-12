package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.C16880lQ;
import X.C1BU;
import X.C1DG;
import X.C212988Xm;
import X.C214348b8;
import X.C221108m2;
import X.C26045AKb;
import X.C2VF;
import X.C43251GyF;
import X.C46314IFq;
import X.C46446IKs;
import X.C46548IOq;
import X.C48880JGi;
import X.C48881JGj;
import X.C48892JGu;
import X.C48905JHh;
import X.C48984JKi;
import X.C49098JOs;
import X.C49111JPf;
import X.C49128JPw;
import X.C49187JSd;
import X.C49621Jdh;
import X.C50699Jv5;
import X.C55230Lly;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C6ZT;
import X.C72434Sbm;
import X.C78688UuS;
import X.C78926UyI;
import X.C79043V0l;
import X.C7MY;
import X.C8XZ;
import X.C8YF;
import X.C94T;
import X.EnumC221088m0;
import X.EnumC48916JHs;
import X.InterfaceC212978Xl;
import X.InterfaceC214448bI;
import X.InterfaceC46334IGk;
import X.InterfaceC48907JHj;
import X.InterfaceC48970JJu;
import X.InterfaceC49137JQf;
import X.InterfaceC49280JVs;
import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import X.J1C;
import X.J1M;
import X.J1O;
import X.J1Y;
import X.J21;
import X.J7H;
import X.JGI;
import X.JGL;
import X.JHC;
import X.JHI;
import X.JHK;
import X.JIB;
import X.JIC;
import X.JII;
import X.JJ8;
import X.JKM;
import X.JON;
import X.JOO;
import X.JP7;
import X.JQA;
import X.JQT;
import X.JQX;
import X.JW1;
import X.JY2;
import X.JYH;
import X.JYM;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS40S0100000_4;
import Y.IDCListenerS245S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchPhotoHolder extends JOO implements View.OnClickListener, InterfaceC49280JVs, JP7, JQX, JW1, C8XZ<SearchPhotoHolder, JKM> {
    public final /* synthetic */ AssemReusedVHContainer<SearchPhotoHolder, JKM> LJLL;
    public final C5H3 LJLLI;
    public final SearchStateViewModel LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public FrameLayout LJLLL;
    public ViewStub LJLLLL;
    public JON LJLLLLLL;
    public JHC LJLZ;
    public TextView LJZ;
    public C72434Sbm LJZI;
    public TextView LJZL;
    public TextView LL;
    public SearchResultParam LLD;
    public JIB LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public Integer LLFII;
    public final String LLFZ;
    public boolean LLI;
    public final InterfaceC48970JJu LLIFFJFJJ;
    public int LLII;
    public JQA LLIIII;
    public String LLIIIILZ;
    public JQT LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final J1Y LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C46548IOq LLIIJLIL;

    public SearchPhotoHolder() {
        throw null;
    }

    @Override // X.JP7
    public final int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.JQX
    public final C49128JPw LJJLJ() {
        return null;
    }

    @Override // X.JP7
    public final Aweme LJLLILLLL(int i, String str) {
        return null;
    }

    @Override // X.JQX
    public final void LJLLLL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.JP7
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.JP7
    public final void LLIIL() {
        onClick(null);
    }

    @Override // X.JP7
    public final void LLJIJIL() {
    }

    @Override // X.JQX
    public final JP7 LLLLIIL() {
        return this;
    }

    @Override // X.JP7
    public final boolean LLLLILI() {
        return false;
    }

    @Override // X.MFR
    public final void LLZLLLL() {
    }

    @Override // X.C8XZ
    public final AssemReusedDispatcher<SearchPhotoHolder, JKM> LP() {
        return this.LJLL.LP();
    }

    @Override // X.AbstractC208468Gc
    public final boolean U(Video video, String str) {
        return false;
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.C8VZ
    public final InterfaceC214448bI cq0() {
        return this.LJLL.cq0();
    }

    @Override // X.JOO
    public final void f0() {
        this.LLI = true;
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
    }

    @Override // X.InterfaceC212998Xn
    public final InterfaceC212978Xl<SearchPhotoHolder, JKM> getChild() {
        return this.LJLL.getChild();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLL.getLifecycle();
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.LJLL.getViewModelStoreOwner();
    }

    public final void m0(int i, JKM jkm) {
        this.LJLL.LJJZ(i, jkm);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner p0, Lifecycle.Event p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.LJLL.onStateChanged(p0, p1);
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLL.LJLLLLLL;
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC49280JVs
    public final JQA LJLJL() {
        JQA jqa = this.LLIIII;
        if (jqa == null) {
            return new JQA();
        }
        return jqa;
    }

    @Override // X.JP7
    public final int LJLLI() {
        C1BU c1bu;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C1BU) && (c1bu = (C1BU) layoutParams) != null) {
            return c1bu.LJLIL;
        }
        return -1;
    }

    @Override // X.JQX, X.InterfaceC49148JQq
    public final boolean LLIIII() {
        if (!C46446IKs.LJLJLJ) {
            if (LLZL() && LLZL()) {
                return true;
            }
            return false;
        }
        if (LLZL()) {
            return true;
        }
        return false;
    }

    @Override // X.JQX
    public final boolean LLZL() {
        if (!C46446IKs.LJLJLJ) {
            JQT jqt = this.LLIIIJ;
            if (jqt != null && jqt.LJJIIJ()) {
                return true;
            }
            return false;
        }
        return ((Boolean) this.LLIIJI.getValue()).booleanValue();
    }

    @Override // X.JOO, X.AbstractC208468Gc
    public final int[] P() {
        return J7H.LIZ(201);
    }

    @Override // X.C8XZ
    public final ViewModelStore Yb() {
        return this.LJLL.LJLL;
    }

    @Override // X.C8XZ
    public final ReusedUIAssem<?> Yz() {
        return this.LJLL.LJLJLLL;
    }

    @Override // X.JOO
    public final void bindView() {
        if (this.LJLIL == null) {
            return;
        }
        C79043V0l.LJIIJ(this.LJLILLLLZI);
        JHC i0 = i0();
        if (i0 != null) {
            Aweme mData = this.LJLIL;
            o.LJIIIIZZ(mData, "mData");
            i0.LIZ(mData);
        }
        JQA LJLJL = LJLJL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJLJL.LJFF);
        linkedHashMap.put("search_id", LJLJL.LJII);
        linkedHashMap.put("search_result_id", LJLJL.LJIILJJIL);
        linkedHashMap.put("search_keyword", LJLJL.LJ);
        JHC i02 = i0();
        if (i02 != null) {
            i02.setExtraParams(linkedHashMap);
        }
    }

    @Override // X.JOO
    public final void g0() {
        this.itemView.post(new ARunnableS40S0100000_4(this, 106));
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLL.LJLLL;
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLL.LJLLJ;
    }

    @Override // X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return this.LJLL.LJLLLL;
    }

    @Override // X.InterfaceC212998Xn
    public final C212988Xm<SearchPhotoHolder, JKM> getProxy() {
        return this.LJLL.LJLJL;
    }

    public final JHC i0() {
        ViewStub viewStub;
        if (this.LJLZ == null) {
            ViewStub viewStub2 = this.LJLLLL;
            JHC jhc = null;
            if (viewStub2 != null && viewStub2.getParent() != null && (viewStub = this.LJLLLL) != null) {
                viewStub.setLayoutResource(R.layout.ci0);
                View inflate = viewStub.inflate();
                if (inflate instanceof JHC) {
                    jhc = (JHC) inflate;
                }
                this.LJLZ = jhc;
                l0(jhc);
            }
        }
        return this.LJLZ;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        JGI core;
        if (!C46446IKs.LJLJLJ) {
            return a0();
        }
        JHC i0 = i0();
        if (i0 != null && (core = i0.getCore()) != null) {
            return core.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return LJIIIIZZ();
    }

    @Override // X.JP7
    public final int LLJJJ() {
        return getAdapterPosition();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        JGI LJJJLL;
        if (J21.LIZ() && (LJJJLL = C78926UyI.LJJJLL(this)) != null) {
            JIC.LIZ(LJJJLL);
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        if (J21.LIZ()) {
            JGI LJJJLL = C78926UyI.LJJJLL(this);
            if (LJJJLL != null) {
                LJJJLL.LLLLLJLJLL();
            }
            if (C46446IKs.LJLJLJ) {
                C79043V0l.LJIIJ(this.LJLLLLLL);
            }
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.JQX
    public final InterfaceC48907JHj getPlayerView() {
        return i0();
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LLFF;
    }

    @Override // X.JP7
    public final SearchResultParam LJLJLLL() {
        return this.LLD;
    }

    @Override // X.JP7
    public final int LJLL() {
        return this.LLII;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LLFII;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.JOO
    public final boolean c0() {
        return this.LLI;
    }

    @Override // X.JP7
    public final Aweme getCurrentAweme() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return this.LLIIJLIL;
    }

    @Override // X.AbstractC208618Gr, X.MFR
    public final void LJJII(boolean z) {
        super.LJJII(z);
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LLFII = Integer.valueOf(i);
    }

    @Override // X.JW1
    public final void LJZ(String str) {
        ((SearchPhotoViewModel) this.LJLLI.getValue()).LJLJI = this.LLIIIILZ;
        this.LLIIIILZ = str;
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C78688UuS.LJJLIIIIJ(event, this.LJLLL, LJLJL(), this.LJLIL);
    }

    @Override // X.InterfaceC49280JVs
    public final void LLLLIIIILLL(JQA jqa) {
        C48881JGj dataProvider;
        jqa.LIZIZ(jqa.LJII);
        this.LLIIII = jqa;
        ((SearchPhotoViewModel) this.LJLLI.getValue()).LJLILLLLZI = jqa;
        JHC i0 = i0();
        if (i0 != null && (dataProvider = i0.getDataProvider()) != null) {
            dataProvider.LJIJJLI = jqa;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        JY2.LIZIZ(itemView, LJLJL());
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        o.LJIIIZ(info, "info");
    }

    public final void l0(JHC jhc) {
        Integer num;
        int i;
        JGI core;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Holder(");
        LIZ.append(hashCode());
        LIZ.append("), initVideoView: ");
        if (jhc != null) {
            num = Integer.valueOf(jhc.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (jhc == null) {
            return;
        }
        jhc.setEnableLifecycleObserver(true);
        jhc.setEnableHideCoverAnim(true);
        jhc.setMCoverView(null);
        jhc.setPhotoSoundIcon(this.LJLLLLLL);
        JIB jib = this.LLF;
        if (jib != null && (core = jhc.getCore()) != null) {
            core.setContainerStatusProvider(jib);
        }
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZLLL());
        if (valueOf.intValue() > 0) {
            i = valueOf.intValue();
        } else {
            i = 4;
        }
        jhc.setOutlineProvider(new C43251GyF(C7MY.LIZIZ(i)));
        jhc.setClipToOutline(true);
    }

    public final void n0(J1M j1m) {
        JON jon;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            Integer num = null;
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
                linkedHashMap.put("aweme_type", String.valueOf(aweme.getAwemeType()));
                PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
                    num = Integer.valueOf(imageList2.size());
                }
                linkedHashMap.put("pic_cnt", String.valueOf(num));
            }
        }
        JII.LIZ(J1C.LIZIZ(), LJLJL(), linkedHashMap);
        JGI LJJJLL = C78926UyI.LJJJLL(this);
        if (LJJJLL != null) {
            LJJJLL.setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 1, this.LJLIL));
        }
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        if (LIZ != null && (jon = this.LJLLLLLL) != null) {
            jon.LIZ(LIZ, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        String str;
        SearchStateViewModel searchStateViewModel;
        C48881JGj dataProvider;
        int i;
        JGL jgl;
        C48881JGj dataProvider2;
        if (C6ZT.LIZ(view)) {
            return;
        }
        Aweme aweme = null;
        if (view != null) {
            interfaceC55235Lm3 = C55230Lly.LJ(view);
        } else {
            interfaceC55235Lm3 = null;
        }
        new C50699Jv5(interfaceC55235Lm3).LJI();
        JON jon = this.LJLLLLLL;
        if (jon != null) {
            jon.setVisibility(8);
        }
        Aweme aweme2 = this.LJLIL;
        if (aweme2 != null && aweme2.getStatus() != null && this.LJLIL.getStatus().isDelete()) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.tme);
            c26045AKb.LJIIJ();
            return;
        }
        JHC i0 = i0();
        if (i0 != null && (dataProvider2 = i0.getDataProvider()) != null) {
            aweme = dataProvider2.LIZJ;
        }
        if (aweme != null) {
            JHC i02 = i0();
            if (i02 == null || (dataProvider = i02.getDataProvider()) == null) {
                return;
            }
            C48880JGi LJI = dataProvider.LJI();
            if (LJI != null) {
                JHC i03 = i0();
                if (i03 != null) {
                    i = i03.getPosition();
                } else {
                    i = -1;
                }
                LJI.LJ = i;
            }
            Context mContext = this.LJLJLJ;
            o.LJIIIIZZ(mContext, "mContext");
            if (J1C.LIZLLL(mContext)) {
                C48892JGu.LIZ(dataProvider, true);
            } else {
                C48892JGu.LIZ(dataProvider, false);
            }
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null && aweme3.isAd()) {
                JHI.LIZ().LJIIJJI = true;
            }
            JGI LJJJLL = C78926UyI.LJJJLL(this);
            if (LJJJLL != null && (jgl = LJJJLL.LLIIIILZ) != null) {
                jgl.LLLJL();
            }
        }
        C49621Jdh.LIZ(LJLJL());
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme aweme4 = this.LJLIL;
        if (aweme4 == null || (str = aweme4.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.put(str, new WeakReference<>(LJLJL()));
        InterfaceC48970JJu interfaceC48970JJu = this.LLIFFJFJJ;
        if (interfaceC48970JJu != null) {
            interfaceC48970JJu.yd(new JYM(this.itemView, this.LJLIL, this.LLFZ, this.LLIIII, 32));
        }
        JQT jqt = this.LLIIIJ;
        if (jqt != null) {
            jqt.LJJJJI();
        }
        if (!C49111JPf.LIZ() || (searchStateViewModel = this.LJLLILLLL) == null) {
            return;
        }
        searchStateViewModel.isBackFromDetailPage = true;
    }

    @Override // X.InterfaceC212998Xn
    public final void setProxy(C212988Xm<SearchPhotoHolder, JKM> c212988Xm) {
        this.LJLL.LJLJL = c212988Xm;
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPhotoHolder(View itemView, InterfaceC48970JJu interfaceC48970JJu, C8YF proxyer, Fragment fragment) {
        super(itemView);
        SearchStateViewModel searchStateViewModel;
        ViewStub viewStub;
        ViewStub viewStub2;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(proxyer, "proxyer");
        AssemReusedVHContainer<SearchPhotoHolder, JKM> assemReusedVHContainer = new AssemReusedVHContainer<>(fragment, proxyer, itemView);
        this.LJLL = assemReusedVHContainer;
        C5H3 LIZJ = C214348b8.LIZJ(this, C65352Pkq.LIZ(SearchPhotoViewModel.class), C94T.INSTANCE, EnumC221088m0.SYNCHRONIZED);
        this.LJLLI = LIZJ;
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 561));
        this.LLII = -1;
        this.LLIIIL = C221108m2.LIZIZ(C2VF.LJLIL);
        this.LLIIIZ = new J1Y(this);
        assemReusedVHContainer.LJJLL(new SearchPhotoRootAssem(), itemView, this);
        this.LLIIJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 562));
        this.LLIIJLIL = new C46548IOq(this);
        ActivityC45651qj LJ = C1DG.LJ(itemView, "itemView.context");
        if (LJ != null) {
            searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(LJ).get(SearchStateViewModel.class);
        } else {
            searchStateViewModel = null;
        }
        this.LJLLILLLL = searchStateViewModel;
        ((SearchPhotoViewModel) LIZJ.getValue()).LJLJJL = "";
        View findViewById = itemView.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.desc)");
        this.LJZ = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.fqv);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.like_and_play_count)");
        this.LL = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.a_v);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.author_avatar)");
        this.LJZI = (C72434Sbm) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.aa0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.author_name)");
        this.LJZL = (TextView) findViewById4;
        this.LJLLLL = (ViewStub) itemView.findViewById(R.id.n60);
        SmartImageView smartImageView = (SmartImageView) itemView.findViewById(R.id.cover);
        this.LJLILLLLZI = smartImageView;
        C79043V0l.LJIIJ(smartImageView);
        this.LJLLL = (FrameLayout) itemView.findViewById(R.id.jgz);
        TextView textView = this.LJZ;
        if (textView != null) {
            C16880lQ.LJIJI(textView, this);
            C72434Sbm c72434Sbm = this.LJZI;
            if (c72434Sbm != null) {
                C16880lQ.LJJIJL(c72434Sbm, this);
                TextView textView2 = this.LJZL;
                if (textView2 != null) {
                    C16880lQ.LJIJI(textView2, this);
                    C16880lQ.LJIIJ(this, itemView);
                    TextView textView3 = this.LL;
                    if (textView3 != null) {
                        C16880lQ.LJIJI(textView3, this);
                        if (C46314IFq.LIZIZ()) {
                            this.LJLLLLLL = (JON) itemView.findViewById(R.id.k7p);
                        }
                        JON jon = this.LJLLLLLL;
                        if (jon != null) {
                            C16880lQ.LJJJLZIJ(jon, new ACListenerS28S0100000_8(this, 64));
                        }
                        JON jon2 = this.LJLLLLLL;
                        if (jon2 != null) {
                            jon2.setOnTouchListener(new IDTListenerS117S0100000_8(this, 13));
                        }
                        JJ8.LIZ.getClass();
                        if (JJ8.LIZ()) {
                            View findViewById5 = itemView.findViewById(R.id.hoa);
                            o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.photo_mode_icon_container)");
                            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
                            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                            anonymousClass064.LJII(constraintLayout);
                            anonymousClass064.LJI(R.id.ho_, 6);
                            anonymousClass064.LJIIIIZZ(R.id.ho_, 7, 0, 7);
                            anonymousClass064.LJIIIIZZ(R.id.ho_, 3, 0, 3);
                            anonymousClass064.LIZIZ(constraintLayout);
                        }
                        this.LLFZ = "";
                        this.LLIFFJFJJ = interfaceC48970JJu;
                        itemView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 18));
                        if (i0() == null && (viewStub = this.LJLLLL) != null && viewStub.getParent() != null && (viewStub2 = this.LJLLLL) != null) {
                            viewStub2.setLayoutResource(R.layout.ci0);
                            View inflate = viewStub2.inflate();
                            this.LJLZ = inflate instanceof JHC ? (JHC) inflate : null;
                            l0(i0());
                            return;
                        }
                        return;
                    }
                    o.LJIJI("txtLikeCount");
                    throw null;
                }
                o.LJIJI("txtAuthorName");
                throw null;
            }
            o.LJIJI("authorAvatar");
            throw null;
        }
        o.LJIJI("txtDesc");
        throw null;
    }

    public final void h0(Aweme aweme, int i, int i2, boolean z, boolean z2) {
        bind(aweme, i);
        if (aweme == null) {
            return;
        }
        this.LLFFF = true;
        this.LJLIL = aweme;
        this.LLI = true;
        this.LLII = i2;
        JQA LJLJL = LJLJL();
        InterfaceC88472Yns<? super Aweme, String> provider = (InterfaceC88472Yns) this.LLIIIL.getValue();
        o.LJIIIZ(provider, "provider");
        LJLJL.LJJIIZ = provider;
        String str = (String) ((InterfaceC88472Yns) this.LLIIIL.getValue()).invoke(this.LJLIL);
        if (str != null) {
            LJLJL.LJIILJJIL = str;
        }
        if (!TextUtils.equals(this.LLFZ, "selfharm")) {
            JOO.X(this.LJLILLLLZI);
        }
        bindView();
        JON jon = this.LJLLLLLL;
        if (jon != null) {
            jon.setVisibility(8);
        }
        ((SearchPhotoViewModel) this.LJLLI.getValue()).LJLJJI = z2;
    }
}
