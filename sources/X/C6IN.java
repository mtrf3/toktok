package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.6IN, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6IN extends AppCompatTextView {
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setMaskBlurColor(int i) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public C6IN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
