package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.UJw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77000UJw extends RxBusSceneObserver<B4Q> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<B4Q> getType() {
        return B4Q.class;
    }

    public C77000UJw(UJP ujp) {
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, B4Q b4q) {
        B4Q value = b4q;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        UJP ujp = this.LIZ;
        ujp.LJZL = value.LIZIZ;
        ujp.LJIIJ(constraintProperty, false);
    }
}
