package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202517x9 extends C77869UhF {
    public C202527xA LJLIL;
    public C202527xA LJLILLLLZI;

    public final void LIZ() {
        int i;
        setImageAlpha(254);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (isSelected()) {
            i = R.raw.icon_color_like_red_shadow_2;
        } else {
            i = R.raw.icon_color_like_shadow_2;
        }
        setImageDrawable(new SY9(context, i));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.7xA] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.7xA] */
    public final void LIZIZ() {
        if (!isSelected()) {
            setAnimation("icon_home_like_new.json");
            if (this.LJLIL == null) {
                this.LJLIL = new Animator.AnimatorListener() { // from class: X.7xA
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C202517x9.this.LIZ();
                        C202517x9.this.removeAnimatorListener(this);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C202517x9.this.LIZ();
                        C202517x9.this.removeAnimatorListener(this);
                    }
                };
            }
            removeAnimatorListener(this.LJLIL);
            addAnimatorListener(this.LJLIL);
            playAnimation();
            return;
        }
        setAnimation("icon_home_dislike_new.json");
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new Animator.AnimatorListener() { // from class: X.7xA
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    C202517x9.this.LIZ();
                    C202517x9.this.removeAnimatorListener(this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    C202517x9.this.LIZ();
                    C202517x9.this.removeAnimatorListener(this);
                }
            };
        }
        removeAnimatorListener(this.LJLILLLLZI);
        addAnimatorListener(this.LJLILLLLZI);
        playAnimation();
    }

    @Override // X.C77869UhF, X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C29701Eo
    public void setComposition(C0GY composition) {
        o.LJIIIZ(composition, "composition");
        super.setComposition(composition);
    }

    public final void setState(Boolean bool) {
        o.LJI(bool);
        setSelected(bool.booleanValue());
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202517x9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }
}
