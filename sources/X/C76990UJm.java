package X;

import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76990UJm extends DataChannelSceneObserver<C28429BDt, VideoOrientationChangeChannel> {
    public C76990UJm() {
        super(false, 1, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<VideoOrientationChangeChannel> getType() {
        return VideoOrientationChangeChannel.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C28429BDt c28429BDt) {
        C28429BDt value = c28429BDt;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        if (value.LIZ()) {
            constraintProperty.connect(4, R.id.n4l, 3, 0);
        } else {
            constraintProperty.connect(3, 0, 3, C15380j0.LIZ(100.0f));
        }
        constraintProperty.apply();
    }
}
