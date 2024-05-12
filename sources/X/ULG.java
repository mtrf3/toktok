package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.BottomAlphaLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutCaptionEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULG extends C42721m0 {
    public final boolean LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULG(final C1O4 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LIZIZ = LiveAlphaGroupAnimOptSetting.INSTANCE.getValue();
        View inputInterceptionView = this.LIZ;
        o.LJIIIIZZ(inputInterceptionView, "inputInterceptionView");
        MultiElementSpecImplKt.element(this, new C76999UJv(layeredElementContext, inputInterceptionView));
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(UKC.LIZ);
        elementSpecImpl.addSceneObserver(new ULJ(layeredElementContext, this));
        registerElement(elementSpecImpl);
        ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(UKC.LIZIZ);
        elementSpecImpl2.addSceneObserver(new ULK(layeredElementContext));
        registerElement(elementSpecImpl2);
        ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(UKC.LIZJ);
        elementSpecImpl3.addSceneObserver(new ULH(layeredElementContext));
        registerElement(elementSpecImpl3);
        ElementSpecImpl elementSpecImpl4 = new ElementSpecImpl(UKC.LIZLLL);
        ElementSpecImplKt.onAttach(elementSpecImpl4, ULO.LJLIL);
        elementSpecImpl4.addSceneObserver(new ULI(layeredElementContext));
        registerElement(elementSpecImpl4);
        MultiElementSpecImplKt.element(this, new ElementSpecImpl(layeredElementContext) { // from class: X.1lZ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11110c7.LJII);
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                addSceneObserver(new DataChannelSceneObserver<Boolean, HideTitleLayoutCaptionEvent>(layeredElementContext) { // from class: X.1lY
                    public final View LIZ;
                    public ValueAnimator LIZIZ;
                    public boolean LIZJ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<HideTitleLayoutCaptionEvent> getType() {
                        return HideTitleLayoutCaptionEvent.class;
                    }

                    {
                        super(false, 1, null);
                        this.LIZ = layeredElementContext.getContainer().findViewById(R.id.b4n);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        super.dispose(context, constraintProperty);
                        ValueAnimator valueAnimator = this.LIZIZ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        this.LIZJ = false;
                        this.LIZ.setVisibility(8);
                        constraintProperty.alpha(1.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext2, "layeredElementContext", constraintProperty, "constraintProperty");
                        if (this.LIZJ == LIZLLL) {
                            return;
                        }
                        this.LIZJ = LIZLLL;
                        if (this.LIZIZ == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setDuration(layeredElementContext2.getAnimationDuration());
                            this.LIZIZ = valueAnimator;
                        }
                        ValueAnimator valueAnimator2 = this.LIZIZ;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimator3 = this.LIZIZ;
                        if (valueAnimator3 != null) {
                            valueAnimator3.removeAllUpdateListeners();
                        }
                        if (LIZLLL) {
                            ValueAnimator valueAnimator4 = this.LIZIZ;
                            if (valueAnimator4 != null) {
                                valueAnimator4.setFloatValues(constraintProperty.alpha(), 0.0f);
                            }
                        } else {
                            ValueAnimator valueAnimator5 = this.LIZIZ;
                            if (valueAnimator5 != null) {
                                valueAnimator5.setFloatValues(constraintProperty.alpha(), 1.0f);
                            }
                        }
                        ValueAnimator valueAnimator6 = this.LIZIZ;
                        if (valueAnimator6 != null) {
                            valueAnimator6.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 21));
                        }
                        ValueAnimator valueAnimator7 = this.LIZIZ;
                        if (valueAnimator7 == null) {
                            return;
                        }
                        valueAnimator7.start();
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl(layeredElementContext) { // from class: X.1lX
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11110c7.LJI);
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                addSceneObserver(new DataChannelSceneObserver<Boolean, BottomAlphaLayoutEvent>(layeredElementContext) { // from class: X.1lW
                    public final View LIZ;
                    public ValueAnimator LIZIZ;
                    public boolean LIZJ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<BottomAlphaLayoutEvent> getType() {
                        return BottomAlphaLayoutEvent.class;
                    }

                    {
                        super(false, 1, null);
                        this.LIZ = layeredElementContext.getContainer().findViewById(R.id.b5c);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        super.dispose(context, constraintProperty);
                        ValueAnimator valueAnimator = this.LIZIZ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        this.LIZJ = false;
                        this.LIZ.setVisibility(8);
                        constraintProperty.alpha(1.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext2, "layeredElementContext", constraintProperty, "constraintProperty");
                        if (this.LIZJ == LIZLLL) {
                            return;
                        }
                        this.LIZJ = LIZLLL;
                        if (this.LIZIZ == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setDuration(layeredElementContext2.getAnimationDuration());
                            this.LIZIZ = valueAnimator;
                        }
                        ValueAnimator valueAnimator2 = this.LIZIZ;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimator3 = this.LIZIZ;
                        if (valueAnimator3 != null) {
                            valueAnimator3.removeAllUpdateListeners();
                        }
                        if (LIZLLL) {
                            ValueAnimator valueAnimator4 = this.LIZIZ;
                            if (valueAnimator4 != null) {
                                valueAnimator4.setFloatValues(constraintProperty.alpha(), 0.3f);
                            }
                        } else {
                            ValueAnimator valueAnimator5 = this.LIZIZ;
                            if (valueAnimator5 != null) {
                                valueAnimator5.setFloatValues(constraintProperty.alpha(), 1.0f);
                            }
                        }
                        ValueAnimator valueAnimator6 = this.LIZIZ;
                        if (valueAnimator6 != null) {
                            valueAnimator6.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 20));
                        }
                        ValueAnimator valueAnimator7 = this.LIZIZ;
                        if (valueAnimator7 == null) {
                            return;
                        }
                        valueAnimator7.start();
                    }
                });
            }
        });
    }
}
