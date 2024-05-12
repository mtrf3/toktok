package X;

import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51331zt extends GroupableElementSpecImpl {
    public C51331zt() {
        super(R.id.gi_);
        addSceneObserver(new DataChannelSceneObserver<EnumC31158CKs, LiveExtendedScreenStatus>() { // from class: X.1lM
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveExtendedScreenStatus> getType() {
                return LiveExtendedScreenStatus.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC31158CKs value) {
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                o.LJIIIZ(value, "value");
                if (value == EnumC31158CKs.SHOW) {
                    if (constraintProperty.visibility() != 8) {
                        constraintProperty.visibility(8);
                    }
                } else {
                    if (constraintProperty.visibility() == 0) {
                        return;
                    }
                    constraintProperty.visibility(0);
                }
            }
        });
    }
}
