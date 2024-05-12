package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.ActivityC45651qj;
import X.C212988Xm;
import X.C213508Zm;
import X.C214348b8;
import X.C221108m2;
import X.C34X;
import X.C46314IFq;
import X.C46447IKt;
import X.C48905JHh;
import X.C48946JIw;
import X.C48947JIx;
import X.C49187JSd;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8XZ;
import X.C8YF;
import X.EnumC221088m0;
import X.EnumC48916JHs;
import X.InterfaceC212978Xl;
import X.InterfaceC214448bI;
import X.InterfaceC36571c5;
import X.InterfaceC46334IGk;
import X.InterfaceC48907JHj;
import X.InterfaceC49137JQf;
import X.InterfaceC55235Lm3;
import X.InterfaceC88473Ynt;
import X.J1C;
import X.J1M;
import X.J1O;
import X.JGI;
import X.JHC;
import X.JHK;
import X.JIB;
import X.JIC;
import X.JID;
import X.JIG;
import X.JII;
import X.JIJ;
import X.JJL;
import X.JJO;
import X.JLU;
import X.JNU;
import X.JON;
import X.JQA;
import X.JYH;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class UserPhotoHolder extends JNU implements InterfaceC48907JHj, JIG, C8XZ<UserPhotoHolder, JJL> {
    public static final C48946JIw LJZ = new C48946JIw(C48947JIx.LIZJ);
    public final /* synthetic */ AssemReusedVHContainer<UserPhotoHolder, JJL> LJLJL;
    public C48946JIw LJLJLJ;
    public JHC LJLJLLL;
    public ConstraintLayout LJLL;
    public Aweme LJLLI;
    public InterfaceC88473Ynt<? super View, ? super Integer, ? super Aweme, C76800UCe> LJLLILLLL;
    public JON LJLLJ;
    public final C5H3 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final JJO LJLLLLLL;
    public final ActivityC45651qj LJLZ;

    public UserPhotoHolder() {
        throw null;
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.C8XZ
    public final AssemReusedDispatcher<UserPhotoHolder, JJL> LP() {
        return this.LJLJL.LP();
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.C8VZ
    public final InterfaceC214448bI cq0() {
        return this.LJLJL.cq0();
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
    }

    @Override // X.InterfaceC212998Xn
    public final InterfaceC212978Xl<UserPhotoHolder, JJL> getChild() {
        return this.LJLJL.getChild();
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJL.getLifecycle();
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.LJLJL.getViewModelStoreOwner();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner p0, Lifecycle.Event p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.LJLJL.onStateChanged(p0, p1);
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLJL.LJLLLLLL;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        JHC jhc;
        JGI core;
        C48946JIw c48946JIw = this.LJLJLJ;
        if (c48946JIw != null) {
            if (c48946JIw.LIZIZ && (jhc = this.LJLJLLL) != null && (core = jhc.getCore()) != null) {
                JIC.LIZ(core);
                return;
            }
            return;
        }
        o.LJIJI("videoConfig");
        throw null;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        JHC jhc;
        JGI core;
        C48946JIw c48946JIw = this.LJLJLJ;
        if (c48946JIw != null) {
            if (c48946JIw.LIZIZ && (jhc = this.LJLJLLL) != null && (core = jhc.getCore()) != null) {
                core.LLLLLJLJLL();
                return;
            }
            return;
        }
        o.LJIJI("videoConfig");
        throw null;
    }

    @Override // X.C8XZ
    public final ViewModelStore Yb() {
        return this.LJLJL.LJLL;
    }

    @Override // X.C8XZ
    public final ReusedUIAssem<?> Yz() {
        return this.LJLJL.LJLJLLL;
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLJL.LJLLJ;
    }

    @Override // X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return this.LJLJL.LJLLLL;
    }

    @Override // X.InterfaceC212998Xn
    public final C212988Xm<UserPhotoHolder, JJL> getProxy() {
        return this.LJLJL.LJLJL;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        JGI core;
        JHC jhc = this.LJLJLLL;
        if (jhc == null || (core = jhc.getCore()) == null || !core.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.JNU, X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLZ;
    }

    @Override // X.JIG
    public final void LL(JIB jib) {
        JGI core;
        JID jid = new JID(this, jib);
        JHC jhc = this.LJLJLLL;
        if (jhc != null && (core = jhc.getCore()) != null) {
            core.setContainerStatusProvider(jid);
        }
    }

    @Override // X.JNU, X.InterfaceC49280JVs
    public final void LLLLIIIILLL(JQA param) {
        o.LJIIIZ(param, "param");
        param.LJJIIZI = "photo";
        super.LLLLIIIILLL(param);
        this.LJLLL.getValue().getClass();
    }

    public final void P(J1M j1m) {
        String str;
        JON jon;
        JGI core;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        JQA LJLJL = LJLJL();
        Aweme aweme = this.LJLLI;
        Integer num = null;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        LJLJL.LJIILL = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme2 = this.LJLLI;
        if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
            linkedHashMap.put("aweme_type", String.valueOf(aweme2.getAwemeType()));
            PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
                num = Integer.valueOf(imageList2.size());
            }
            linkedHashMap.put("pic_cnt", String.valueOf(num));
        }
        JII.LIZ(J1C.LIZIZ(), LJLJL(), linkedHashMap);
        JHC jhc = this.LJLJLLL;
        if (jhc != null && (core = jhc.getCore()) != null) {
            core.setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, this.LJLLI));
        }
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        if (LIZ != null && (jon = this.LJLLJ) != null) {
            jon.LIZ(LIZ, false);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        InterfaceC36571c5 interfaceC36571c5 = this.LJLZ;
        if ((interfaceC36571c5 instanceof C34X) && (c34x = (C34X) interfaceC36571c5) != null) {
            c34x.registerActivityOnKeyDownListener(this.LJLLLLLL);
        }
        if (!C46447IKt.LJLJLJ) {
            JLU.LJII(this);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        if (!C46447IKt.LJLJLJ) {
            JLU.LJIIIIZZ(this);
        }
        LLLLLJLJLL();
        InterfaceC36571c5 interfaceC36571c5 = this.LJLZ;
        if ((interfaceC36571c5 instanceof C34X) && (c34x = (C34X) interfaceC36571c5) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this.LJLLLLLL);
        }
    }

    @Override // X.InterfaceC212998Xn
    public final void setProxy(C212988Xm<UserPhotoHolder, JJL> c212988Xm) {
        this.LJLJL.LJLJL = c212988Xm;
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public UserPhotoHolder(View view, C8YF c8yf, Fragment fragment) {
        super(view);
        AssemReusedVHContainer<UserPhotoHolder, JJL> assemReusedVHContainer = new AssemReusedVHContainer<>(fragment, c8yf, view);
        this.LJLJL = assemReusedVHContainer;
        this.LJLLL = C214348b8.LIZJ(this, C65352Pkq.LIZ(UserPhotoViewModel.class), C213508Zm.INSTANCE, EnumC221088m0.SYNCHRONIZED);
        this.LJLLLL = C221108m2.LIZIZ(JIJ.LJLIL);
        assemReusedVHContainer.LJJLL(new UserPhotoRootAssem(), view, this);
        this.LJLLLLLL = new JJO(this);
        this.LJLZ = super.getActivity();
    }
}
