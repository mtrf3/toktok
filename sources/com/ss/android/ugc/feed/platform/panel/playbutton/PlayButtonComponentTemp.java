package com.ss.android.ugc.feed.platform.panel.playbutton;

import X.C221108m2;
import X.C2MA;
import X.C2QG;
import X.C62822Ol8;
import X.C76352z9;
import X.InterfaceC222708oc;
import X.VPK;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.experiment.FeedPauseAnimationOptimizationType;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlayButtonComponentTemp implements IPlayButtonAbility {
    public final BaseListFragmentPanel LJLIL;
    public ImageView LJLILLLLZI;
    public boolean LJLJI;
    public final VPK LJLJJI;
    public final C62822Ol8 LJLJJL;

    public final IPlayButtonAbility LIZ() {
        return (IPlayButtonAbility) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void bo() {
        Context context;
        InterfaceC222708oc LLLJ;
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.bo();
                return;
            }
            return;
        }
        View lg0 = lg0();
        if (lg0 != null) {
            C2MA curViewHolder = this.LJLIL.getCurViewHolder();
            if (curViewHolder != null && (LLLJ = curViewHolder.LLLJ()) != null && LLLJ.Jk0()) {
                lg0.setVisibility(8);
                op0();
                fi0();
            } else {
                lg0.setVisibility(0);
                lg0.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS20S0200000_1(lg0, this, 24)).start();
            }
        }
        VPK vpk = this.LJLJJI;
        Fragment fragment = this.LJLIL.getFragment();
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        C76352z9.LIZ(vpk, context, this.LJLIL.getCurrentAweme());
        this.LJLIL.dismissToolTip();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void es0() {
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.es0();
                return;
            }
            return;
        }
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
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.f70();
                return;
            }
            return;
        }
        View lg0 = lg0();
        if (lg0 != null) {
            lg0.setVisibility(0);
            FeedPauseAnimationOptimizationType.LIZ.getClass();
            if (!FeedPauseAnimationOptimizationType.LIZIZ()) {
                lg0.setScaleX(2.5f);
                lg0.setScaleY(2.5f);
            } else {
                lg0.setAlpha(0.0f);
                FeedPauseAnimationOptimizationType.IconStyle LIZ2 = FeedPauseAnimationOptimizationType.LIZ();
                if (LIZ2 != null) {
                    f = LIZ2.iconAlpha;
                    lg0.animate().alpha(f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).withEndAction(new ARunnableS37S0100000_1(this, 55)).start();
                    lg0.setSelected(false);
                }
            }
            f = 1.0f;
            lg0.animate().alpha(f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).withEndAction(new ARunnableS37S0100000_1(this, 55)).start();
            lg0.setSelected(false);
        }
        VPK vpk = this.LJLJJI;
        Fragment fragment = this.LJLIL.getFragment();
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        C76352z9.LIZ(vpk, context, this.LJLIL.getCurrentAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void fi0() {
        ImageView s7;
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.fi0();
                return;
            }
            return;
        }
        C2MA nextViewHolder = this.LJLIL.getNextViewHolder();
        if (nextViewHolder == null || (s7 = nextViewHolder.s7()) == null) {
            return;
        }
        s7.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final View lg0() {
        ImageView imageView = null;
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ == null) {
                return null;
            }
            return LIZ.lg0();
        }
        if (this.LJLJI && this.LJLIL.getCurFeedViewHolder() != null) {
            C2MA curFeedViewHolder = this.LJLIL.getCurFeedViewHolder();
            if (curFeedViewHolder != null) {
                imageView = curFeedViewHolder.s7();
            }
            this.LJLILLLLZI = imageView;
        }
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void op0() {
        ImageView s7;
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.op0();
                return;
            }
            return;
        }
        C2MA preViewHolder = this.LJLIL.getPreViewHolder();
        if (preViewHolder == null || (s7 = preViewHolder.s7()) == null) {
            return;
        }
        s7.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final boolean rQ() {
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ == null) {
                return false;
            }
            return LIZ.rQ();
        }
        View lg0 = lg0();
        if (lg0 == null || lg0.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final float zH() {
        FeedPauseAnimationOptimizationType.IconStyle LIZ;
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ2 = LIZ();
            if (LIZ2 != null) {
                return LIZ2.zH();
            }
        } else {
            FeedPauseAnimationOptimizationType.LIZ.getClass();
            if (FeedPauseAnimationOptimizationType.LIZIZ() && (LIZ = FeedPauseAnimationOptimizationType.LIZ()) != null) {
                return LIZ.iconAlpha;
            }
        }
        return 1.0f;
    }

    public PlayButtonComponentTemp(BaseListFragmentPanel panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL = panel;
        this.LJLJJI = new VPK();
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 743));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void kQ(int[] iArr) {
        if (C2QG.LIZ()) {
            IPlayButtonAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.kQ(iArr);
                return;
            }
            return;
        }
        View lg0 = lg0();
        if (lg0 == null) {
            return;
        }
        lg0.getLocationOnScreen(iArr);
    }
}
