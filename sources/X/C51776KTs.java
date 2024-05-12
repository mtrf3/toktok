package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.KTs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51776KTs extends RecyclerView {
    public int LLLF;
    public final Paint LLLFF;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (getHeight() >= this.LLLF) {
            this.LLLFF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.LLLFF.setShader(new LinearGradient(0.0f, 0.15f * getHeight(), 0.0f, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, getWidth(), 0.2f * getHeight(), this.LLLFF);
        }
    }

    public final void setMaxHeight(int i) {
        this.LLLF = i;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51776KTs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLF = (int) (C81184Vtc.LIZLLL(C60903NvH.LJ) * 0.65d);
        this.LLLFF = new Paint();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.LLLF, LiveLayoutPreloadThreadPriority.DEFAULT));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
