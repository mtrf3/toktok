package X;

import com.bytedance.android.livesdk.LandscapeInteractionMarginData;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.ULg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77036ULg extends DataChannelSceneObserver<C28157B3h, LandscapeInteractionMarginData> {
    public final /* synthetic */ UL8 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LandscapeInteractionMarginData> getType() {
        return LandscapeInteractionMarginData.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77036ULg(UL8 ul8) {
        super(false, 1, null);
        this.LIZ = ul8;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C28157B3h c28157B3h) {
        boolean z;
        C28157B3h value = c28157B3h;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        Boolean bool = (Boolean) layeredElementContext.getDataChannel().kv0(BCS.class);
        int i = 0;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (this.LIZ.LJIILIIL) {
            if (!z) {
                i = value.LIZ;
            }
            constraintProperty.margin(1, i);
            constraintProperty.apply();
            return;
        }
        if (!z) {
            i = value.LIZJ;
        }
        constraintProperty.margin(2, i);
        constraintProperty.apply();
    }
}
