package X;

import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42741m2 extends ElementSpecImpl {
    public final LayeredElementContext LJLIL;
    public final View LJLILLLLZI;
    public final boolean LJLJI;

    public abstract void LIZ();

    public abstract void LIZIZ();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42741m2(LayeredElementContext layeredElementContext, View view) {
        super(C12960f6.LIZ);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext;
        this.LJLILLLLZI = view;
        this.LJLJI = LiveAlphaGroupAnimOptSetting.INSTANCE.getValue();
        addSceneObserver(new RxBusSceneObserver<B4Q>() { // from class: X.1m1
            public final C5H3 LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<B4Q> getType() {
                return B4Q.class;
            }

            {
                this.LIZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(AbstractC42741m2.this, 116));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                super.dispose(context, constraintProperty);
                if (AbstractC42741m2.this.LJLJI) {
                    constraintProperty.forceHasOverlappingRenderingCompat(true);
                }
                constraintProperty.alpha(1.0f);
                ((ValueAnimator) this.LIZ.getValue()).cancel();
                AbstractC42741m2.this.LJLILLLLZI.setVisibility(8);
                AbstractC42741m2.this.LIZ();
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, final ConstraintProperty constraintProperty, B4Q b4q) {
                final B4Q value = b4q;
                o.LJIIIZ(layeredElementContext2, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                o.LJIIIZ(value, "value");
                if (value.LIZIZ) {
                    AbstractC42741m2.this.LJLILLLLZI.setVisibility(0);
                    AbstractC42741m2.this.LIZIZ();
                } else {
                    AbstractC42741m2.this.LJLILLLLZI.setVisibility(8);
                    AbstractC42741m2.this.LIZ();
                }
                ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                final AbstractC42741m2 abstractC42741m2 = AbstractC42741m2.this;
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                C16880lQ.LJLJL(valueAnimator);
                if (value.LIZIZ) {
                    valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
                } else {
                    valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
                }
                valueAnimator.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 24));
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.0f7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        super.onAnimationEnd(animation);
                        if (AbstractC42741m2.this.LJLJI && !value.LIZIZ) {
                            constraintProperty.forceHasOverlappingRenderingCompat(true);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        super.onAnimationStart(animation);
                        if (AbstractC42741m2.this.LJLJI && value.LIZIZ) {
                            constraintProperty.forceHasOverlappingRenderingCompat(false);
                        }
                    }
                });
                valueAnimator.start();
            }
        });
    }
}
