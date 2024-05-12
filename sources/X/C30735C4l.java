package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.C4l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30735C4l extends C02Z {
    public DataChannel LJLILLLLZI;

    public final void LIZ() {
        setProgress(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    public final DataChannel getDataChannel() {
        return this.LJLILLLLZI;
    }

    public final void LIZIZ(int i) {
        setProgress(getProgress() + i);
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    @Override // X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30735C4l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }
}
