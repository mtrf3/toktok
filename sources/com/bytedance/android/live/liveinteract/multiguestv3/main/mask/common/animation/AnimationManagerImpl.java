package com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation;

import X.C221108m2;
import X.C47061t0;
import X.C62822Ol8;
import X.C72972SkS;
import X.C75243Tfz;
import X.C75257TgD;
import X.C75258TgE;
import X.C76696U8e;
import X.C78886Uxe;
import X.C87277YNd;
import X.C8E;
import X.EnumC74991Tbv;
import X.FT5;
import X.InterfaceC74798TXe;
import X.InterfaceC75262TgI;
import X.InterfaceC75579TlP;
import X.JBM;
import X.TXY;
import X.U8H;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestShareBgRtlOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestShareBgSupportLayoutAnimationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AnimationManagerImpl implements GenericLifecycleObserver, InterfaceC74798TXe, InterfaceC75262TgI {
    public final ViewGroup LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final IThemeAbility LJLJI;
    public final DataChannel LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public final C75243Tfz LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final View LIZLLL() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            return viewGroup.findViewById(R.id.a5e);
        }
        return null;
    }

    public final View LJ() {
        Context context;
        int i;
        View findViewById;
        ViewGroup viewGroup = this.LJLIL;
        View view = null;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return null;
        }
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 != null && (findViewById = viewGroup2.findViewById(R.id.a5g)) != null) {
            return findViewById;
        }
        if (MultiGuestShareBgSupportLayoutAnimationSetting.INSTANCE.getValue() == 2) {
            if (this.LJLIL instanceof FrameLayout) {
                C47061t0 c47061t0 = new C47061t0(context);
                c47061t0.setId(R.id.a5g);
                if (MultiGuestShareBgRtlOptSetting.INSTANCE.isEnable()) {
                    i = 3;
                } else {
                    i = 1;
                }
                c47061t0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, i));
                c47061t0.setVisibility(8);
                ViewGroup viewGroup3 = this.LJLIL;
                view = c47061t0;
                if (viewGroup3 != null) {
                    viewGroup3.addView(c47061t0);
                    view = c47061t0;
                }
            }
        } else {
            View view2 = new View(context);
            view2.setId(R.id.a5g);
            view2.setBackgroundResource(R.drawable.cfe);
            view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            view2.setVisibility(8);
            ViewGroup viewGroup4 = this.LJLIL;
            view = view2;
            if (viewGroup4 != null) {
                viewGroup4.addView(view2);
                view = view2;
            }
        }
        return view;
    }

    public final void LIZJ() {
        String str;
        boolean z;
        C76696U8e LJJIII;
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null) {
            str = LJJIII.getLayoutBusinessType();
        } else {
            str = null;
        }
        if (o.LJ(str, EnumC74991Tbv.NORMAL.getBusinessType())) {
            return;
        }
        boolean z2 = true;
        if (o.LJ(str, EnumC74991Tbv.FLOAT.getBusinessType()) || o.LJ(str, EnumC74991Tbv.GRID_FLOAT.getBusinessType())) {
            z = true;
        } else {
            z = false;
        }
        int LJJJLZIJ = C78886Uxe.LJJJLZIJ(C8E.LJ());
        if (z && LJJJLZIJ <= 0) {
            z2 = false;
        }
        this.LJLJJLL = z2;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C8E.LJ().Aq(this.LJLJL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C8E.LJ().zF(this.LJLJL);
        if (this.LJLJJLL) {
            LJFF("submit animation onDestroy");
            LJI(this, new C75257TgD(this));
        }
        this.LJLILLLLZI.getLifecycle().removeObserver(this);
    }

    @Override // X.InterfaceC75262TgI
    public final void LIZIZ(JBM jbm) {
        View LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("after ");
        LIZ.append(jbm.LIZIZ);
        LJFF(X1D.LIZIZ(LIZ));
        if (TextUtils.equals(jbm.LIZIZ, "AnimationManager_FadeOut") && (LJ = LJ()) != null) {
            C87277YNd.LJJIIZ(LJ);
        }
    }

    public final void LJFF(String str) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimationManager");
        LIZ.append(hashCode());
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LJFF = C72972SkS.LJFF(str, ' ');
        View LIZLLL = LIZLLL();
        Integer num2 = null;
        if (LIZLLL != null) {
            num = Integer.valueOf(LIZLLL.hashCode());
        } else {
            num = null;
        }
        LJFF.append(num);
        LJFF.append(' ');
        View LJ = LJ();
        if (LJ != null) {
            num2 = Integer.valueOf(LJ.hashCode());
        }
        LJFF.append(num2);
        LJFF.append(' ');
        FT5.LJ(LJFF, this.LJLJLLL, LJFF, LIZIZ);
    }

    @Override // X.InterfaceC74798TXe
    public final void X9(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // X.InterfaceC75262TgI
    public final void LIZ(JBM jbm, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reject ");
        LIZ.append(jbm.LIZIZ);
        LIZ.append(' ');
        LIZ.append(i);
        LJFF(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.InterfaceC75262TgI r11, X.InterfaceC75262TgI r12) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl.LJI(X.TgI, X.TgI):void");
    }

    public AnimationManagerImpl(ViewGroup viewGroup, TXY multiGuestContent, LifecycleOwner lifeCycleOwner, IThemeAbility iThemeAbility, DataChannel dataChannel) {
        o.LJIIIZ(multiGuestContent, "multiGuestContent");
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = lifeCycleOwner;
        this.LJLJI = iThemeAbility;
        this.LJLJJI = dataChannel;
        this.LJLJL = new C75243Tfz(this);
        this.LJLJLJ = C221108m2.LIZIZ(C75258TgE.LJLIL);
        this.LJLJLLL = true;
        lifeCycleOwner.getLifecycle().addObserver(this);
    }
}
