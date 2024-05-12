package X;

import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJN extends DataChannelSceneObserver<C28429BDt, VideoOrientationChangeChannel> {
    public final /* synthetic */ UJM LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<VideoOrientationChangeChannel> getType() {
        return VideoOrientationChangeChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJN(UJM ujm) {
        super(false, 1, null);
        this.LIZ = ujm;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C28429BDt c28429BDt) {
        C28429BDt value = c28429BDt;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        this.LIZ.LJLIL.LIZIZ(value);
        this.LIZ.LIZ(constraintProperty);
    }
}
