package X;

import Y.ACListenerS22S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6DB, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6DB extends C6DA {
    public LinearLayout LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    @Override // X.C6DA
    public View LJFF() {
        LinearLayout LIZIZ;
        LinearLayout LIZIZ2;
        LinearLayout LIZLLL = LIZLLL();
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLILLLLZI && this.LIZJ && !this.LJIIL) {
            boolean z = AnonymousClass699.LIZIZ().LIZIZ.LJLJI;
            int i = R.string.e46;
            if (z) {
                if (this.LJIIJJI) {
                    LIZIZ2 = LIZIZ(R.drawable.b9m, R.string.s6l);
                } else {
                    if (AnonymousClass699.LJFF) {
                        i = R.string.s6q;
                    }
                    LIZIZ2 = LIZIZ(R.drawable.b9n, i);
                }
                this.LJIIJ = LIZIZ2;
                View childAt = LIZIZ2.getChildAt(0);
                o.LJIIIIZZ(childAt, "viewGroup.getChildAt(IMAGE_INDEX)");
                C139355dT c139355dT = new C139355dT();
                if (!c139355dT.LIZ.getBoolean("read_text_guide_shown_v2", false)) {
                    c139355dT.LIZ.storeBoolean("read_text_guide_shown_v2", true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                    o.LJIIIIZZ(duration, "ofFloat(view, View.ROTAT…       .setDuration(1000)");
                    duration.setInterpolator(new TimeInterpolator() { // from class: X.6DD
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            float f2;
                            if ((0.0f <= f && f <= 0.18f) || (0.18f <= f && f <= 0.36f)) {
                                return f * 1.11f;
                            }
                            if (0.36f <= f && f <= 0.56f) {
                                f2 = 0.04f;
                            } else {
                                if (0.56f > f || f > 0.8f) {
                                    return f;
                                }
                                f *= 0.833f;
                                f2 = 0.1336f;
                            }
                            return f + f2;
                        }
                    });
                    animatorSet.play(duration).after(duration.clone()).after(1500L);
                    animatorSet.start();
                }
                LinearLayout linearLayout = this.LJIIJ;
                if (linearLayout != null) {
                    C16880lQ.LJIIZILJ(linearLayout, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 49));
                }
                LIZLLL.addView(this.LJIIJ);
                LIZLLL.addView(LIZJ());
            } else {
                if (this.LJIIJJI) {
                    LIZIZ = LIZIZ(R.drawable.ta, R.string.e47);
                } else {
                    LIZIZ = LIZIZ(R.drawable.ta, R.string.e46);
                }
                this.LJIIJ = LIZIZ;
                View childAt2 = LIZIZ.getChildAt(0);
                o.LJIIIIZZ(childAt2, "viewGroup.getChildAt(IMAGE_INDEX)");
                C139355dT c139355dT2 = new C139355dT();
                if (!c139355dT2.LIZ.getBoolean("read_text_guide_shown", false)) {
                    c139355dT2.LIZ.storeBoolean("read_text_guide_shown", true);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                    o.LJIIIIZZ(duration2, "ofFloat(view, View.ROTAT…       .setDuration(1000)");
                    duration2.setInterpolator(new TimeInterpolator() { // from class: X.6DC
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            float f2;
                            if ((0.0f <= f && f <= 0.18f) || (0.18f <= f && f <= 0.36f)) {
                                return f * 1.11f;
                            }
                            if (0.36f <= f && f <= 0.56f) {
                                f2 = 0.04f;
                            } else {
                                if (0.56f > f || f > 0.8f) {
                                    return f;
                                }
                                f *= 0.833f;
                                f2 = 0.1336f;
                            }
                            return f + f2;
                        }
                    });
                    animatorSet2.play(duration2).after(duration2.clone()).after(1500L);
                    animatorSet2.start();
                }
                LinearLayout linearLayout2 = this.LJIIJ;
                if (linearLayout2 != null) {
                    C16880lQ.LJIIZILJ(linearLayout2, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 50));
                }
                LIZLLL.addView(this.LJIIJ);
                LIZLLL.addView(LIZJ());
            }
        }
        LinearLayout LIZIZ3 = LIZIZ(R.drawable.tb, R.string.e3g);
        LinearLayout LIZIZ4 = LIZIZ(R.drawable.t9, R.string.e43);
        C16880lQ.LJIIZILJ(LIZIZ3, new ACListenerS22S0100000_2(this, 133));
        C16880lQ.LJIIZILJ(LIZIZ4, new ACListenerS22S0100000_2(this, 134));
        if (this.LIZJ) {
            LIZLLL.addView(LIZIZ3);
            LIZLLL.addView(LIZJ());
            LJIIJJI(3);
        } else {
            LJIIJJI(2);
        }
        LIZLLL.addView(LIZIZ4);
        return LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6DB(View contentView, C1552567l c1552567l) {
        super(contentView, c1552567l);
        o.LJIIIZ(contentView, "contentView");
    }

    @Override // X.C6DA
    public final void LJIIL(RectF helpBoxRect, int i, int i2, float f, boolean z) {
        o.LJIIIZ(helpBoxRect, "helpBoxRect");
        this.LJIIJJI = z;
        super.LJIIL(helpBoxRect, i, i2, f, z);
    }
}
