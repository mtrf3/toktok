package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.agj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94421agj extends C94152acO {
    @Override // X.C94152acO
    public final boolean LJI(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94421agj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        setCriticalHeight(0);
        setMinHeight(C93742aVm.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT));
        setMaxHeight(C93742aVm.LIZIZ(335));
        setCurrentHeight(C93742aVm.LIZIZ(335));
    }
}
