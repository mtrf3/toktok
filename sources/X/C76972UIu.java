package X;

import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkLayoutDataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76972UIu extends DataChannelSceneObserver<C74760TVs, GameLinkLayoutDataChannel> {
    public final /* synthetic */ C76973UIv LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GameLinkLayoutDataChannel> getType() {
        return GameLinkLayoutDataChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76972UIu(C76973UIv c76973UIv) {
        super(false, 1, null);
        this.LIZ = c76973UIv;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C74760TVs c74760TVs) {
        int i;
        C74760TVs value = c74760TVs;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C76973UIv c76973UIv = this.LIZ;
        int i2 = value.LJLIL;
        if (i2 == 0) {
            i = 0;
        } else {
            i = i2 + c76973UIv.LJLIL.LIZLLL;
        }
        c76973UIv.LJLJJI = i;
        c76973UIv.LIZ(constraintProperty);
    }
}
