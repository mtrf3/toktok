package Y;

import X.AbstractC71212RxA;
import X.C71124Rvk;
import X.C71125Rvl;
import X.C73305Spp;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpAddonFloatWidget;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;

/* loaded from: classes13.dex */
public class IDAListenerS236S0100000_12 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationRepeat$4(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationRepeat$5(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationStart$3(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationStart$4(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    public static final void onAnimationStart$5(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            case 4:
                onAnimationEnd$4(this, animation);
                return;
            case 5:
                onAnimationEnd$5(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            case 3:
                onAnimationRepeat$3(this, animation);
                return;
            case 4:
                onAnimationRepeat$4(this, animation);
                return;
            case 5:
                onAnimationRepeat$5(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            case 3:
                onAnimationStart$3(this, animation);
                return;
            case 4:
                onAnimationStart$4(this, animation);
                return;
            case 5:
                onAnimationStart$5(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS236S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        View view = ((PdpAddonFloatWidget) iDAListenerS236S0100000_12.l0).contentView;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    public static final void onAnimationEnd$1(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        ((PdpAddonFloatWidget) iDAListenerS236S0100000_12.l0).LJLJLLL = false;
    }

    public static final void onAnimationEnd$2(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        PdpAddonFloatWidget pdpAddonFloatWidget = (PdpAddonFloatWidget) iDAListenerS236S0100000_12.l0;
        pdpAddonFloatWidget.LJLJLJ = true;
        pdpAddonFloatWidget.LJLJLLL = false;
    }

    public static final void onAnimationEnd$3(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) ((C71124Rvk) iDAListenerS236S0100000_12.l0).LJLJI;
        if (abstractC71212RxA != null) {
            abstractC71212RxA.LJIILLIIL();
        }
    }

    public static final void onAnimationEnd$4(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) ((C71125Rvl) iDAListenerS236S0100000_12.l0).LJLJI;
        if (abstractC71212RxA != null) {
            abstractC71212RxA.LJIILLIIL();
        }
    }

    public static final void onAnimationEnd$5(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) iDAListenerS236S0100000_12.l0;
        C73305Spp c73305Spp = stickerPropDetailFragment.LJZL;
        if (c73305Spp == null) {
            stickerPropDetailFragment.LLJILJIL.setVisibility(8);
            stickerPropDetailFragment.LLD.setVisibility(0);
            ViewGroup viewGroup = stickerPropDetailFragment.LLF;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            View view = stickerPropDetailFragment.LLIFFJFJJ;
            if (view != null) {
                view.setVisibility(0);
            }
            stickerPropDetailFragment.Pl();
            stickerPropDetailFragment.LJLJL.setVisibility(0);
            stickerPropDetailFragment.LJZI.setVisibility(0);
            stickerPropDetailFragment.LLLILZ.LIZLLL();
            stickerPropDetailFragment.mScrollableLayout.scrollTo(0, 0);
            return;
        }
        c73305Spp.LJFF();
        stickerPropDetailFragment.LJZL.setVisibility(0);
        throw null;
    }

    public static final void onAnimationStart$1(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        PdpAddonFloatWidget pdpAddonFloatWidget = (PdpAddonFloatWidget) iDAListenerS236S0100000_12.l0;
        pdpAddonFloatWidget.LJLJLJ = false;
        pdpAddonFloatWidget.LJLJLLL = true;
    }

    public static final void onAnimationStart$2(IDAListenerS236S0100000_12 iDAListenerS236S0100000_12, Animation animation) {
        ((PdpAddonFloatWidget) iDAListenerS236S0100000_12.l0).LJLJLLL = true;
    }
}
