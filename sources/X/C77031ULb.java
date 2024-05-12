package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ULb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77031ULb extends WidgetHiddenChangedSceneObserver {
    public final /* synthetic */ ULT LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77031ULb(ULT ult) {
        super(R.id.bkq);
        this.LIZ = ult;
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ULT ult = this.LIZ;
        if (ult.LJLILLLLZI == z) {
            return;
        }
        ult.LJLILLLLZI = z;
        ult.LIZ(constraintProperty);
    }
}
