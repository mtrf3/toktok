package com.ss.android.ugc.feed.platform.panel.playbutton;

import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2MA;
import X.C2MH;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.C76352z9;
import X.EnumC221088m0;
import X.InterfaceC222708oc;
import X.InterfaceC55102Lju;
import X.JAK;
import X.KR6;
import X.KU4;
import X.VPK;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.experiment.FeedPauseAnimationOptimizationType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlayButtonComponent extends BasePanelComponent implements KR6, IPlayButtonAbility, InterfaceC55102Lju {
    public ImageView LJLIL;
    public boolean LJLILLLLZI;
    public final VPK LJLJI = new VPK();
    public final C5H3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.KR6
    public final void LJLLILLLL() {
        this.LJLILLLLZI = false;
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLJLLL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2021424687) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final View lg0() {
        ImageView imageView;
        C2MA curViewHolder;
        if (this.LJLILLLLZI) {
            IViewPagerComponentAbility v3 = v3();
            if (v3 != null && (curViewHolder = v3.getCurViewHolder()) != null) {
                imageView = curViewHolder.s7();
            } else {
                imageView = null;
            }
            this.LJLIL = imageView;
        }
        return this.LJLIL;
    }

    public final IViewPagerComponentAbility v3() {
        return (IViewPagerComponentAbility) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final float zH() {
        FeedPauseAnimationOptimizationType.IconStyle LIZ;
        FeedPauseAnimationOptimizationType.LIZ.getClass();
        if (FeedPauseAnimationOptimizationType.LIZIZ() && (LIZ = FeedPauseAnimationOptimizationType.LIZ()) != null) {
            return LIZ.iconAlpha;
        }
        return 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayButtonComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 741), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 4));
        }
        this.LJLJJI = c62822Ol8;
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 742));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 740));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void bo() {
        Context context;
        C2MA c2ma;
        InterfaceC222708oc LLLJ;
        View lg0 = lg0();
        Aweme aweme = null;
        if (lg0 != null) {
            IViewPagerComponentAbility v3 = v3();
            if (v3 != null) {
                c2ma = v3.getCurViewHolder();
            } else {
                c2ma = null;
            }
            if (c2ma != null && (LLLJ = c2ma.LLLJ()) != null && LLLJ.Jk0()) {
                lg0.setVisibility(8);
                op0();
                fi0();
            } else {
                lg0.setVisibility(0);
                lg0.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS20S0200000_1(lg0, this, 23)).start();
            }
        }
        VPK vpk = this.LJLJI;
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        IViewPagerComponentAbility v32 = v3();
        if (v32 != null) {
            aweme = v32.getCurrentAweme();
        }
        C76352z9.LIZ(vpk, context, aweme);
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJI.getValue();
        if (iFeedPanelPlatformAbility != null) {
            iFeedPanelPlatformAbility.dismissToolTip();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void es0() {
        View lg0 = lg0();
        if (lg0 != null) {
            lg0.setAlpha(0.0f);
        }
        View lg02 = lg0();
        if (lg02 == null) {
            return;
        }
        lg02.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void f70() {
        Context context;
        float f;
        View lg0 = lg0();
        if (lg0 != null) {
            lg0.setVisibility(0);
            FeedPauseAnimationOptimizationType.LIZ.getClass();
            if (!FeedPauseAnimationOptimizationType.LIZIZ()) {
                lg0.setScaleX(2.5f);
                lg0.setScaleY(2.5f);
            } else {
                lg0.setAlpha(0.0f);
                FeedPauseAnimationOptimizationType.IconStyle LIZ = FeedPauseAnimationOptimizationType.LIZ();
                if (LIZ != null) {
                    f = LIZ.iconAlpha;
                    lg0.animate().alpha(f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).withEndAction(new ARunnableS37S0100000_1(this, 54)).start();
                    lg0.setSelected(false);
                }
            }
            f = 1.0f;
            lg0.animate().alpha(f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).withEndAction(new ARunnableS37S0100000_1(this, 54)).start();
            lg0.setSelected(false);
        }
        VPK vpk = this.LJLJI;
        Fragment fragment = getPanelContext().LJ;
        Aweme aweme = null;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        IViewPagerComponentAbility v3 = v3();
        if (v3 != null) {
            aweme = v3.getCurrentAweme();
        }
        C76352z9.LIZ(vpk, context, aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void fi0() {
        C2MA nextViewHolder;
        ImageView s7;
        IViewPagerComponentAbility v3 = v3();
        if (v3 == null || (nextViewHolder = v3.getNextViewHolder()) == null || (s7 = nextViewHolder.s7()) == null) {
            return;
        }
        s7.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void op0() {
        C2MA preViewHolder;
        ImageView s7;
        IViewPagerComponentAbility v3 = v3();
        if (v3 == null || (preViewHolder = v3.getPreViewHolder()) == null || (s7 = preViewHolder.s7()) == null) {
            return;
        }
        s7.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final boolean rQ() {
        View lg0 = lg0();
        if (lg0 != null && lg0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void kQ(int[] iArr) {
        View lg0 = lg0();
        if (lg0 != null) {
            lg0.getLocationOnScreen(iArr);
        }
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        this.LJLILLLLZI = true;
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }
}
