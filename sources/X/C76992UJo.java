package X;

import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestViewHeightChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76992UJo extends DataChannelSceneObserver<Integer, GameLinkGuestViewHeightChannel> {
    public final /* synthetic */ C1O4 LIZ;
    public final /* synthetic */ C5H3<C76997UJt> LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GameLinkGuestViewHeightChannel> getType() {
        return GameLinkGuestViewHeightChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76992UJo(C1O4 c1o4, C62822Ol8 c62822Ol8) {
        super(false, 1, null);
        this.LIZ = c1o4;
        this.LIZIZ = c62822Ol8;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        int intValue = num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        C76997UJt value = this.LIZIZ.getValue();
        if (value == null || intValue <= 0 || intValue < value.LIZIZ) {
            constraintProperty.connect(4, R.id.n4l, 3, this.LIZ.LIZJ);
            return;
        }
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        constraintProperty.connect(4, 0, 4, intValue + value.LIZ);
        constraintProperty.apply();
    }
}
