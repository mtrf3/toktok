package X;

import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42831mB extends ElementSpecImpl {
    public final LayeredElementContext LJLIL;
    public final boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42831mB(LayeredElementContext layeredElementContext) {
        super(C12960f6.LIZLLL);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext;
        this.LJLILLLLZI = LiveAlphaGroupAnimOptSetting.INSTANCE.getValue();
        addSceneObserver(new DataChannelSceneObserver<Boolean, HourlyRankRewardVisibilityChangedChannel>() { // from class: X.1mA
            public final C5H3 LIZ;

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<HourlyRankRewardVisibilityChangedChannel> getType() {
                return HourlyRankRewardVisibilityChangedChannel.class;
            }

            public final ValueAnimator LIZ() {
                return (ValueAnimator) this.LIZ.getValue();
            }

            {
                super(false, 1, null);
                this.LIZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(C42831mB.this, 121));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                super.dispose(context, constraintProperty);
                if (LIZ().isRunning()) {
                    LIZ().cancel();
                }
                if (C42831mB.this.LJLILLLLZI) {
                    constraintProperty.forceHasOverlappingRenderingCompat(true);
                }
                constraintProperty.alpha(1.0f);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, final ConstraintProperty constraintProperty, Boolean bool) {
                final boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext2, "layeredElementContext", constraintProperty, "constraintProperty");
                LIZ().cancel();
                LIZ().removeAllUpdateListeners();
                C16880lQ.LJLJL(LIZ());
                if (LIZLLL) {
                    LIZ().setFloatValues(constraintProperty.alpha(), 0.0f);
                } else {
                    LIZ().setFloatValues(constraintProperty.alpha(), 1.0f);
                }
                LIZ().addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 29));
                ValueAnimator LIZ = LIZ();
                final C42831mB c42831mB = C42831mB.this;
                LIZ.addListener(new Animator.AnimatorListener() { // from class: X.0f8
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                        if (C42831mB.this.LJLILLLLZI && !LIZLLL) {
                            constraintProperty.forceHasOverlappingRenderingCompat(true);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                        if (C42831mB.this.LJLILLLLZI && LIZLLL) {
                            constraintProperty.forceHasOverlappingRenderingCompat(false);
                        }
                    }
                });
                LIZ().start();
            }
        });
    }
}
