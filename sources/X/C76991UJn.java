package X;

import Y.ARunnableS24S0300000_13;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76991UJn extends DataChannelSceneObserver<C28429BDt, VideoOrientationChangeChannel> {
    public final /* synthetic */ C1O4 LIZ;
    public final /* synthetic */ C5H3<C76995UJr> LIZIZ;
    public final /* synthetic */ C5H3<C76997UJt> LIZJ;
    public final /* synthetic */ C68322mC<Boolean> LIZLLL;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<VideoOrientationChangeChannel> getType() {
        return VideoOrientationChangeChannel.class;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Boolean] */
    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C28429BDt c28429BDt) {
        C28429BDt value = c28429BDt;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C76995UJr value2 = this.LIZIZ.getValue();
        if (value2 != null) {
            value2.LIZ(layeredElementContext, constraintProperty);
            return;
        }
        if (this.LIZJ.getValue() != null) {
            C68322mC<Boolean> c68322mC = this.LIZLLL;
            Boolean bool = c68322mC.element;
            if (bool != null && o.LJ(bool, Boolean.valueOf(value.LIZ()))) {
                return;
            } else {
                c68322mC.element = Boolean.valueOf(value.LIZ());
            }
        }
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        if (!LiveMtMockLandscapeSetting.INSTANCE.getValue() && value.LIZ()) {
            constraintProperty.connect(4, R.id.n4l, 3, this.LIZ.LIZJ);
            C76997UJt value3 = this.LIZJ.getValue();
            if (value3 != null) {
                ViewGroup container = layeredElementContext.getContainer();
                View view = constraintProperty.getView();
                o.LJIIIIZZ(view, "constraintProperty.view");
                o.LJIIIZ(container, "container");
                if (value3.LIZIZ == 0.0f) {
                    view.post(new ARunnableS24S0300000_13(value3, container, view, 0));
                }
            }
        } else {
            constraintProperty.connect(3, 0, 3, C15380j0.LIZ(230.0f));
        }
        constraintProperty.apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76991UJn(C1O4 c1o4, C62822Ol8 c62822Ol8, C62822Ol8 c62822Ol82, C68322mC c68322mC) {
        super(false, 1, null);
        this.LIZ = c1o4;
        this.LIZIZ = c62822Ol8;
        this.LIZJ = c62822Ol82;
        this.LIZLLL = c68322mC;
    }
}
