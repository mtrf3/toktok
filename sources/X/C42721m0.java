package X;

import Y.IDCListenerS135S0100000;
import android.view.View;
import com.bytedance.android.livesdk.revenue.StarCommentPinnedAvoidEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1m0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42721m0 extends MultiElementSpecImpl<C42721m0> {
    public final View LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42721m0(C1O4 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        View findViewById = layeredElementContext.getContainer().findViewById(R.id.eql);
        findViewById.setVisibility(8);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(layeredElementContext, 74), findViewById);
        this.LIZ = findViewById;
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.1m8
            {
                int i = C12960f6.LIZJ;
                addSceneObserver(new RxBusSceneObserver<B4Q>() { // from class: X.1m7
                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<B4Q> getType() {
                        return B4Q.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        super.dispose(context, constraintProperty);
                        constraintProperty.visibility(8);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, B4Q b4q) {
                        B4Q value = b4q;
                        o.LJIIIZ(layeredElementContext2, "layeredElementContext");
                        o.LJIIIZ(constraintProperty, "constraintProperty");
                        o.LJIIIZ(value, "value");
                        if (value.LIZIZ) {
                            constraintProperty.visibility(8);
                        } else {
                            constraintProperty.visibility(0);
                        }
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new C42781m6(layeredElementContext));
        MultiElementSpecImplKt.element(this, new C42831mB(layeredElementContext));
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(C12960f6.LJII);
        elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, StarCommentPinnedAvoidEvent>() { // from class: X.1lz
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<StarCommentPinnedAvoidEvent> getType() {
                return StarCommentPinnedAvoidEvent.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                super.dispose(context, constraintProperty);
                constraintProperty.visibility(0);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                int i;
                if (C76965UIn.LIZLLL(bool, layeredElementContext2, "layeredElementContext", constraintProperty, "constraintProperty")) {
                    i = 8;
                } else {
                    i = 0;
                }
                constraintProperty.visibility(i);
            }
        });
        registerElement(elementSpecImpl);
    }
}
