package X;

import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42481lc extends ElementSpecImpl {
    public final boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42481lc(DataChannel dataChannel) {
        super(C11110c7.LIZ);
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = LiveAlphaGroupAnimOptSetting.INSTANCE.getValue();
        addSceneObserver(new DataChannelSceneObserver<Float, LiveExtendedScreenAlpha>() { // from class: X.1la
            public boolean LIZ;

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveExtendedScreenAlpha> getType() {
                return LiveExtendedScreenAlpha.class;
            }

            {
                super(false, 1, null);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                float floatValue = f.floatValue();
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                if (floatValue == 1.0f && C42481lc.this.LJLIL) {
                    this.LIZ = false;
                    constraintProperty.forceHasOverlappingRenderingCompat(true);
                }
                if (floatValue < constraintProperty.alpha() && C42481lc.this.LJLIL && !this.LIZ) {
                    this.LIZ = true;
                    constraintProperty.forceHasOverlappingRenderingCompat(false);
                }
                constraintProperty.alpha(floatValue);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<EnumC31158CKs, LiveExtendedScreenStatus>() { // from class: X.1lb
            public boolean LIZ;

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveExtendedScreenStatus> getType() {
                return LiveExtendedScreenStatus.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC31158CKs enumC31158CKs) {
                EnumC31158CKs value = enumC31158CKs;
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                o.LJIIIZ(value, "value");
                int i = C11120c8.LIZ[value.ordinal()];
                if (i != 1) {
                    if (i != 2 || this.LIZ) {
                        return;
                    }
                    this.LIZ = true;
                    layeredElementContext.upElement(R.id.fva);
                    layeredElementContext.upElement(R.id.frh);
                    layeredElementContext.upElement(R.id.mz0);
                    layeredElementContext.upElement(R.id.dx6);
                    layeredElementContext.upElement(R.id.a9s);
                    layeredElementContext.upElement(R.id.n4b);
                    layeredElementContext.upElement(R.id.img);
                    layeredElementContext.upElement(R.id.imh);
                    layeredElementContext.upElement(R.id.gyq);
                    return;
                }
                if (!this.LIZ) {
                    return;
                }
                layeredElementContext.downElement(R.id.n4b);
                layeredElementContext.downElement(R.id.frh);
                layeredElementContext.downElement(R.id.a9s);
                layeredElementContext.downElement(R.id.mz0);
                layeredElementContext.downElement(R.id.dx6);
                layeredElementContext.downElement(R.id.img);
                layeredElementContext.downElement(R.id.imh);
                layeredElementContext.downElement(R.id.gyq);
                layeredElementContext.downElement(R.id.fva);
                this.LIZ = false;
            }
        });
    }
}
