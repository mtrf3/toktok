package X;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W34 extends Scroller {
    public W39 LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W34(Context context, Interpolator interpolator) {
        super(context, interpolator);
        o.LJIIIZ(context, "context");
        this.LIZ = W39.IDLE;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        int i6 = W35.LIZ[this.LIZ.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i5 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
            }
        } else {
            i5 = LinkMicRtcMixBitrateSetting.DEFAULT;
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
