package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKZ extends WidgetHiddenChangedSceneObserver {
    public UKZ() {
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
