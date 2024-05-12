package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UNe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77086UNe extends WidgetHiddenChangedSceneObserver {
    public final /* synthetic */ C77083UNb LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77086UNe(C77083UNb c77083UNb) {
        super(R.id.dq9);
        this.LIZ = c77083UNb;
    }

    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
    public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (z) {
            C77083UNb c77083UNb = this.LIZ;
            c77083UNb.LIZJ(c77083UNb.LJLJL);
        } else {
            C77083UNb c77083UNb2 = this.LIZ;
            c77083UNb2.LJLJJI |= c77083UNb2.LJLJL;
            c77083UNb2.LIZIZ().cancel();
        }
    }
}
