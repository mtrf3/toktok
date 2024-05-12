package X;

import Y.ACListenerS29S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LUG {
    public static final int LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(49));
    public static final Interpolator LJIIIIZZ;
    public static final Interpolator LJIIIZ;
    public final ViewGroup LIZ;
    public final SmartImageView LIZIZ;
    public View LIZJ;
    public Animator LIZLLL;
    public boolean LJ;
    public String LJFF;
    public Aweme LJI;

    static {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.36f, 0.0f, 0.66f, -0.56f);
        o.LJIIIIZZ(LIZIZ, "create(0.36f, 0f, 0.66f, -0.56f)");
        LJIIIIZZ = LIZIZ;
        PathInterpolator LIZIZ2 = C18950ol.LIZIZ(0.4f, 1.25f, 0.26f, 1.0f);
        o.LJIIIIZZ(LIZIZ2, "create(0.4f, 1.25f, 0.26f, 1f)");
        LJIIIZ = LIZIZ2;
    }

    public final void LIZLLL() {
        AnimatorSet animatorSet;
        if (!this.LJ) {
            return;
        }
        SmartImageView smartImageView = this.LIZIZ;
        if (smartImageView != null) {
            smartImageView.setClickable(false);
        }
        this.LJ = false;
        LJ();
        View view = this.LIZJ;
        SmartImageView smartImageView2 = this.LIZIZ;
        if (view == null || smartImageView2 == null) {
            animatorSet = null;
        } else {
            ObjectAnimator LIZJ = LIZJ(view);
            ObjectAnimator LIZIZ = LIZIZ(smartImageView2);
            animatorSet = new AnimatorSet();
            animatorSet.play(LIZJ).after(LIZIZ);
        }
        this.LIZLLL = animatorSet;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public final void LJ() {
        Animator animator = this.LIZLLL;
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
        }
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.end();
        }
    }

    public LUG(C54113LLp c54113LLp) {
        this.LIZ = c54113LLp;
        SmartImageView smartImageView = new SmartImageView(c54113LLp.getContext());
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        smartImageView.setScaleX(0.0f);
        smartImageView.setScaleY(0.0f);
        int i = LJII;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        smartImageView.setLayoutParams(layoutParams);
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS29S0100000_9(this, 182));
        smartImageView.setClickable(false);
        c54113LLp.addView(smartImageView);
        this.LIZIZ = smartImageView;
    }

    public static AnchorCommonStruct LIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List<AnchorPanelAction> actions;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it.next();
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2.getType() == 28 && (actions = anchorCommonStruct2.getActions()) != null && !actions.isEmpty()) {
                Iterator<AnchorPanelAction> it2 = actions.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getActionType() == 1) {
                        anchorCommonStruct = next;
                        break loop0;
                    }
                }
            }
        }
        return anchorCommonStruct;
    }

    public static ObjectAnimator LIZIZ(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, scaleX, scaleY)");
        ofPropertyValuesHolder.setInterpolator(LJIIIIZZ);
        ofPropertyValuesHolder.setDuration(200L);
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator LIZJ(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, scaleX, scaleY)");
        ofPropertyValuesHolder.setInterpolator(LJIIIZ);
        ofPropertyValuesHolder.setDuration(200L);
        return ofPropertyValuesHolder;
    }
}
