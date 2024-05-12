package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UKx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77027UKx extends DataChannelSceneObserver<C30744C4u, ProgrammedLiveMenuVisibilityChannel> {
    public final Handler LIZ;

    public C77027UKx() {
        super(false);
        this.LIZ = new Handler(C16880lQ.LLJJJJ(), new C77028UKy(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
        return ProgrammedLiveMenuVisibilityChannel.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        this.LIZ.removeCallbacksAndMessages(null);
        constraintProperty.connect(7, R.id.bg2, 6, C15380j0.LIZ(28.0f));
        constraintProperty.apply();
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C30744C4u c30744C4u) {
        C30744C4u value = c30744C4u;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        if (value.LIZ) {
            Handler handler = this.LIZ;
            Message message = new Message();
            message.what = 0;
            message.obj = constraintProperty;
            handler.sendMessageDelayed(message, 300L);
            return;
        }
        this.LIZ.removeMessages(0);
        constraintProperty.connect(7, R.id.bg2, 6, C15380j0.LIZ(28.0f));
        constraintProperty.apply();
    }
}
