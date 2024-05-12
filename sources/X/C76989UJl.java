package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76989UJl extends WidgetHiddenChangedSceneObserver {
    public final /* synthetic */ C76987UJj LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76989UJl(C76987UJj c76987UJj) {
        super(R.id.ar1);
        this.LIZ = c76987UJj;
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        C76987UJj c76987UJj = this.LIZ;
        c76987UJj.LJLJI = !z;
        c76987UJj.LIZ();
    }
}
