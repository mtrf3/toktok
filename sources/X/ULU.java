package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULU extends RxBusSceneObserver<B4Q> {
    public final /* synthetic */ ULT LIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<B4Q> getType() {
        return B4Q.class;
    }

    public ULU(ULT ult) {
        this.LIZ = ult;
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
        ULT ult = this.LIZ;
        ult.LJLJI = value.LIZIZ;
        ult.LJLJJI = value.LIZ;
        ult.LIZ(constraintProperty);
    }
}
