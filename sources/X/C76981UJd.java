package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76981UJd extends WidgetHiddenChangedSceneObserver {
    public final /* synthetic */ UJX LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76981UJd(UJX ujx) {
        super(R.id.bjy);
        this.LIZ = ujx;
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        View view;
        View view2;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        boolean z2 = !z;
        this.LIZ.LJLLILLLL = z2;
        if (z2) {
            ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.bjy);
            if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
                view2.addOnLayoutChangeListener(this.LIZ.LLFZ);
            }
        } else {
            ConstraintProperty constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.bjy);
            if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
                view.removeOnLayoutChangeListener(this.LIZ.LLFZ);
            }
        }
        UJX.LIZLLL(this.LIZ, false, false, 3);
    }
}