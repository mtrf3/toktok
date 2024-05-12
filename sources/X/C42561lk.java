package X;

import com.bytedance.android.livesdk.dataChannel.LiveSplashShopScreenAlpha;
import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.1lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42561lk extends ElementSpecImpl {
    public final boolean LJLIL;

    public C42561lk() {
        super(C11110c7.LIZJ);
        this.LJLIL = LiveAlphaGroupAnimOptSetting.INSTANCE.getValue();
        addSceneObserver(new DataChannelSceneObserver<Float, LiveSplashShopScreenAlpha>() { // from class: X.1lj
            public boolean LIZ;

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveSplashShopScreenAlpha> getType() {
                return LiveSplashShopScreenAlpha.class;
            }

            {
                super(false, 1, null);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                float floatValue = f.floatValue();
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                if (floatValue == 1.0f && C42561lk.this.LJLIL) {
                    this.LIZ = false;
                    constraintProperty.forceHasOverlappingRenderingCompat(true);
                }
                if (floatValue < constraintProperty.alpha() && C42561lk.this.LJLIL && !this.LIZ) {
                    this.LIZ = true;
                    constraintProperty.forceHasOverlappingRenderingCompat(false);
                }
                constraintProperty.alpha(floatValue);
            }
        });
    }
}
