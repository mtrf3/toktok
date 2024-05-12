package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UNa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77082UNa extends WidgetHiddenChangedSceneObserver {
    public final /* synthetic */ C77087UNf LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77082UNa(C77087UNf c77087UNf) {
        super(R.id.ijo);
        this.LIZ = c77087UNf;
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (z) {
            ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.ijo);
            if (constraintPropertyById != null) {
                C77087UNf c77087UNf = this.LIZ;
                if (C16330kX.LIZJ(constraintPropertyById.getView())) {
                    c77087UNf.LIZ(constraintProperty, constraintPropertyById.getView().getHeight());
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.LIZIZ().cancel();
    }
}
