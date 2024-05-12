package X;

import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UJu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76998UJu extends DataChannelSceneObserver<Boolean, KeyboardStatusChannel> {
    public boolean LIZ;
    public final /* synthetic */ C1O4 LIZIZ;
    public final /* synthetic */ ElementSpecImpl LIZJ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<KeyboardStatusChannel> getType() {
        return KeyboardStatusChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76998UJu(C1O4 c1o4, ElementSpecImpl elementSpecImpl) {
        super(false, 1, null);
        this.LIZIZ = c1o4;
        this.LIZJ = elementSpecImpl;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        if (this.LIZ) {
            this.LIZIZ.upElement(this.LIZJ.getId());
            this.LIZ = false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        if (C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty")) {
            if (!this.LIZ) {
                this.LIZIZ.downElement(this.LIZJ.getId());
                this.LIZ = true;
                return;
            }
            return;
        }
        if (!this.LIZ) {
            return;
        }
        this.LIZIZ.upElement(this.LIZJ.getId());
        this.LIZ = false;
    }
}
