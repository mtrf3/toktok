package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UNZ extends WidgetHiddenChangedSceneObserver {
    public final /* synthetic */ UNY LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UNZ(UNY uny) {
        super(R.id.ijo);
        this.LIZ = uny;
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (z) {
            ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.ijo);
            if (constraintPropertyById != null) {
                UNY uny = this.LIZ;
                if (C16330kX.LIZJ(constraintPropertyById.getView())) {
                    uny.LIZ(constraintProperty, constraintPropertyById.getView().getHeight());
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.LIZIZ().cancel();
    }
}
