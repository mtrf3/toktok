package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UKa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77004UKa extends WidgetHiddenChangedSceneObserver {
    public C77004UKa() {
        super(R.id.imh);
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (z) {
            constraintProperty.constrainMaxWidth(0);
            constraintProperty.apply();
        } else {
            constraintProperty.constrainMaxWidth(C15380j0.LIZ(131.0f));
            constraintProperty.apply();
        }
    }
}
