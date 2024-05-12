package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.20I, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C20I extends C42721m0 {
    public C20I(final C1O4 c1o4) {
        super(c1o4);
        MultiElementSpecImplKt.element(this, new C42481lc(c1o4.getDataChannel()));
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.1li
            {
                int i = C11110c7.LIZIZ;
                addSceneObserver(new DataChannelSceneObserver<Float, LiveExtendedScreenAlpha>() { // from class: X.1lh
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenAlpha> getType() {
                        return LiveExtendedScreenAlpha.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                        float floatValue = f.floatValue();
                        o.LJIIIZ(layeredElementContext, "layeredElementContext");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        if (floatValue < 1.0f) {
                            constraintProperty.visibility(0);
                        } else {
                            constraintProperty.visibility(8);
                        }
                        constraintProperty.alpha(1 - floatValue);
                    }
                });
                ElementSpecImplKt.onAttach(this, C20K.LJLIL);
            }
        });
        MultiElementSpecImplKt.element(this, new C42561lk());
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.1le
            {
                int i = C11110c7.LJ;
                addSceneObserver(new DataChannelSceneObserver<EnumC31158CKs, LiveExtendedScreenStatus>() { // from class: X.1ld
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenStatus> getType() {
                        return LiveExtendedScreenStatus.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC31158CKs enumC31158CKs) {
                        EnumC31158CKs value = enumC31158CKs;
                        o.LJIIIZ(layeredElementContext, "layeredElementContext");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        o.LJIIIZ(value, "value");
                        int i2 = C11130c9.LIZ[value.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return;
                            }
                            constraintProperty.visibility(8);
                            return;
                        }
                        constraintProperty.visibility(0);
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.1lg
            {
                int i = C11110c7.LJFF;
                addSceneObserver(new DataChannelSceneObserver<EnumC31158CKs, LiveExtendedScreenStatus>() { // from class: X.1lf
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenStatus> getType() {
                        return LiveExtendedScreenStatus.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC31158CKs enumC31158CKs) {
                        EnumC31158CKs value = enumC31158CKs;
                        o.LJIIIZ(layeredElementContext, "layeredElementContext");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        o.LJIIIZ(value, "value");
                        int i2 = C11140cA.LIZ[value.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return;
                            }
                            constraintProperty.visibility(8);
                            return;
                        }
                        constraintProperty.visibility(0);
                    }
                });
            }
        });
        View inputInterceptionView = this.LIZ;
        o.LJIIIIZZ(inputInterceptionView, "inputInterceptionView");
        MultiElementSpecImplKt.element(this, new C20J(c1o4, inputInterceptionView));
        MultiElementSpecImplKt.element(this, new ElementSpecImpl(c1o4) { // from class: X.1lm
            {
                super(C11110c7.LIZLLL);
                addSceneObserver(new DataChannelSceneObserver<C29646BkI, HideTitleLayoutEvent>(c1o4) { // from class: X.1ll
                    public final View LIZ;
                    public ValueAnimator LIZIZ;
                    public boolean LIZJ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<HideTitleLayoutEvent> getType() {
                        return HideTitleLayoutEvent.class;
                    }

                    {
                        super(false, 1, null);
                        this.LIZ = c1o4.getContainer().findViewById(R.id.kii);
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
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C29646BkI c29646BkI) {
                        int i;
                        C29646BkI value = c29646BkI;
                        o.LJIIIZ(layeredElementContext, "layeredElementContext");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        o.LJIIIZ(value, "value");
                        boolean z = this.LIZJ;
                        boolean z2 = value.LJLIL;
                        if (z == z2) {
                            return;
                        }
                        this.LIZJ = z2;
                        if (this.LIZIZ == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setDuration(layeredElementContext.getAnimationDuration());
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
                        int i2 = C11150cB.LIZ[value.LJLILLLLZI.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                i = R.id.fzm;
                            } else {
                                throw new C162476Zf();
                            }
                        } else {
                            i = R.id.fvv;
                        }
                        if (value.LJLIL) {
                            ValueAnimator valueAnimator4 = this.LIZIZ;
                            if (valueAnimator4 != null) {
                                valueAnimator4.setFloatValues(constraintProperty.alpha(), 0.0f);
                            }
                            layeredElementContext.upElement(i);
                        } else {
                            ValueAnimator valueAnimator5 = this.LIZIZ;
                            if (valueAnimator5 != null) {
                                valueAnimator5.setFloatValues(constraintProperty.alpha(), 1.0f);
                            }
                            layeredElementContext.downElement(i);
                        }
                        ValueAnimator valueAnimator6 = this.LIZIZ;
                        if (valueAnimator6 != null) {
                            valueAnimator6.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 22));
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
