package X;

import com.bytedance.android.livesdk.dataChannel.GiftTrayHeightChangeChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.ULn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77043ULn extends DataChannelSceneObserver<Float, GiftTrayHeightChangeChannel> {
    public final /* synthetic */ C77044ULo LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GiftTrayHeightChangeChannel> getType() {
        return GiftTrayHeightChangeChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77043ULn(C77044ULo c77044ULo) {
        super(false, 1, null);
        this.LIZ = c77044ULo;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
        float floatValue = f.floatValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        C77044ULo c77044ULo = this.LIZ;
        int i = 0;
        if (c77044ULo.LJLJI) {
            int i2 = (int) floatValue;
            int i3 = c77044ULo.LJLJJI;
            int i4 = c77044ULo.LJLIL.LJFF + i2;
            if (i3 != i4) {
                if (i2 > 0) {
                    i = i4;
                }
                c77044ULo.LJLJJI = i;
                c77044ULo.LIZ(constraintProperty);
                return;
            }
            return;
        }
        c77044ULo.LJLJJI = 0;
        c77044ULo.LIZ(constraintProperty);
    }
}
