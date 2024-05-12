package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TyS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76388TyS {
    public ImageView LIZ;
    public C2A4 LIZIZ;
    public C47121t6 LIZJ;
    public C47121t6 LIZLLL;
    public CMV LJ;
    public ConstraintLayout LJFF;
    public AnimatorSet LJI;
    public C81705W4v LJII;
    public DataChannel LJIIIIZZ;
    public Drawable LJIIIZ;
    public Integer LJIIJ;
    public String LJIIJJI;

    public final void LIZ() {
        AnimatorSet animatorSet = this.LJI;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJI;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = this.LJI;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            this.LJI = null;
        }
    }

    public final float LIZIZ(float f) {
        ConstraintLayout constraintLayout = this.LJFF;
        if (constraintLayout != null) {
            return TypedValue.applyDimension(1, f, constraintLayout.getContext().getResources().getDisplayMetrics());
        }
        o.LJIJI("layoutPKCountDown");
        throw null;
    }

    public final AnimatorSet LIZJ(long j, float f) {
        AnimatorSet animatorSet = new AnimatorSet();
        C47121t6 c47121t6 = this.LIZLLL;
        if (c47121t6 != null) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.ALPHA, f, 1.0f));
            animatorSet.setDuration(j);
            return animatorSet;
        }
        o.LJIJI("tvPKCountDownValue");
        throw null;
    }

    public final AnimatorSet LIZLLL(long j, float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        C47121t6 c47121t6 = this.LIZLLL;
        if (c47121t6 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_X, f, f2);
            C47121t6 c47121t62 = this.LIZLLL;
            if (c47121t62 != null) {
                animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(c47121t62, (Property<C47121t6, Float>) View.SCALE_Y, f, f2));
                animatorSet.setDuration(j);
                return animatorSet;
            }
            o.LJIJI("tvPKCountDownValue");
            throw null;
        }
        o.LJIJI("tvPKCountDownValue");
        throw null;
    }
}
