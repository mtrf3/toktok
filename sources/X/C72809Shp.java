package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Shp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72809Shp extends SmartImageView {
    public ViewOnTouchListenerC80851VoF LJLJLJ;

    @Override // com.bytedance.lighten.loader.SmartImageView
    public final void LIZIZ() {
        ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF = this.LJLJLJ;
        if (viewOnTouchListenerC80851VoF == null || viewOnTouchListenerC80851VoF.LJFF() == null) {
            this.LJLJLJ = new ViewOnTouchListenerC80851VoF(this);
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.VA9, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        LIZIZ();
        super.onAttachedToWindow();
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Matrix matrix;
        o.LJIIIZ(canvas, "canvas");
        int save = canvas.save();
        ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF = this.LJLJLJ;
        if (viewOnTouchListenerC80851VoF != null) {
            matrix = viewOnTouchListenerC80851VoF.LJLZ;
        } else {
            matrix = null;
        }
        canvas.concat(matrix);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // X.VA9, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72809Shp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        LIZIZ();
    }
}
