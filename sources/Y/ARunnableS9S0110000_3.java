package Y;

import X.C192057gH;
import X.C192187gU;
import X.C51029K0z;
import X.C72083SQt;
import X.C7IZ;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Space;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.feed.assem.caption.PlaceHolderCaptionAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.fullpagev3.PostModeDetailFragmentV3;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;

/* loaded from: classes4.dex */
public class ARunnableS9S0110000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Space space = ((PlaceHolderCaptionAssem) this.l0).LLD;
        if (space != null && (viewTreeObserver2 = space.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(((PlaceHolderCaptionAssem) this.l0).LLFII);
        }
        if (C72083SQt.LJJLIIIJL(((VideoItemParams) C51029K0z.LJIILLIIL((PlaceHolderCaptionAssem) this.l0)).getAweme()) && this.z1) {
            Space space2 = ((PlaceHolderCaptionAssem) this.l0).LLD;
            if (space2 != null && (viewTreeObserver = space2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(((PlaceHolderCaptionAssem) this.l0).LLFII);
            }
            PlaceHolderCaptionAssem placeHolderCaptionAssem = (PlaceHolderCaptionAssem) this.l0;
            placeHolderCaptionAssem.LL = placeHolderCaptionAssem.b4();
            PlaceHolderCaptionAssem placeHolderCaptionAssem2 = (PlaceHolderCaptionAssem) this.l0;
            placeHolderCaptionAssem2.Xw(placeHolderCaptionAssem2.LL);
        }
    }

    public static final void run$0(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            View view = ((BottomBarFragment) aRunnableS9S0110000_3.l0).LJLILLLLZI;
            if (view != null && view.getParent() != null) {
                ((BottomBarFragment) aRunnableS9S0110000_3.l0).h(!aRunnableS9S0110000_3.z1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            if (aRunnableS9S0110000_3.z1) {
                C192057gH c192057gH = (C192057gH) aRunnableS9S0110000_3.l0;
                c192057gH.LJFF(c192057gH.LJLIL);
            } else {
                C192057gH c192057gH2 = (C192057gH) aRunnableS9S0110000_3.l0;
                c192057gH2.LIZIZ(c192057gH2.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            UpvoteVideoAssem upvoteVideoAssem = (UpvoteVideoAssem) aRunnableS9S0110000_3.l0;
            if (upvoteVideoAssem.LLIIZ && !upvoteVideoAssem.z4().LIZLLL()) {
                if (aRunnableS9S0110000_3.z1) {
                    C7IZ u4 = ((UpvoteVideoAssem) aRunnableS9S0110000_3.l0).u4();
                    if (u4 != null) {
                        u4.LJIIJJI();
                    }
                } else {
                    C7IZ u42 = ((UpvoteVideoAssem) aRunnableS9S0110000_3.l0).u4();
                    if (u42 != null && u42.LJIIJ != null && (u42.LJIIIZ || ((AnimatorSet) u42.LJFF.getValue()).isRunning() || ((Animator) u42.LJII.getValue()).isRunning())) {
                        u42.LIZJ();
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            if (aRunnableS9S0110000_3.z1) {
                ((InteractBottomBannerComponent) aRunnableS9S0110000_3.l0).getContainerView().setVisibility(0);
            } else {
                ((InteractBottomBannerComponent) aRunnableS9S0110000_3.l0).getContainerView().setVisibility(8);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        int i;
        try {
            View view = (View) aRunnableS9S0110000_3.l0;
            if (aRunnableS9S0110000_3.z1) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            ((PostModeDetailFragmentV3) aRunnableS9S0110000_3.l0).xp(aRunnableS9S0110000_3.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            aRunnableS9S0110000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            if (aRunnableS9S0110000_3.z1) {
                C192187gU c192187gU = (C192187gU) aRunnableS9S0110000_3.l0;
                c192187gU.LIZLLL(c192187gU.LJLIL);
            } else {
                C192187gU c192187gU2 = (C192187gU) aRunnableS9S0110000_3.l0;
                c192187gU2.LIZIZ(c192187gU2.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS9S0110000_3 aRunnableS9S0110000_3) {
        boolean LIZ;
        try {
            ((PostModeDetailFragment) aRunnableS9S0110000_3.l0).xl(aRunnableS9S0110000_3.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0110000_3(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
