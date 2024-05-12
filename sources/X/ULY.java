package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULY extends RxBusSceneObserver<B4Q> {
    public final /* synthetic */ C77030ULa LIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<B4Q> getType() {
        return B4Q.class;
    }

    public ULY(C77030ULa c77030ULa) {
        this.LIZ = c77030ULa;
    }

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, B4Q b4q) {
        B4Q value = b4q;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        if (!C30149BsP.LIZIZ(layeredElementContext.getDataChannel())) {
            return;
        }
        constraintProperty.removeConstraints(6);
        constraintProperty.removeConstraints(7);
        if (!value.LIZIZ) {
            constraintProperty.connect(6, R.id.eqj, 7, this.LIZ.LJLIL.LJIILL);
            constraintProperty.apply();
        } else {
            constraintProperty.connect(7, 0, 7, 0);
            constraintProperty.apply();
        }
    }
}
