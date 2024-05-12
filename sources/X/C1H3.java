package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.dataChannel.BGMRefreshVolumeBarEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1H3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1H3 extends C02Z {
    public DataChannel LJLILLLLZI;

    public final DataChannel getDataChannel() {
        return this.LJLILLLLZI;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            Rect bounds = getThumb().getBounds();
            o.LJIIIIZZ(bounds, "thumb.bounds");
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int paddingLeft = getPaddingLeft() + (bounds.left - getThumbOffset());
            int width = bounds.width() + paddingLeft;
            if (x < paddingLeft || x > width || y < bounds.top || y > bounds.bottom) {
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null) {
                    dataChannel.pv0(BGMRefreshVolumeBarEvent.class);
                }
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1H3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }
}
