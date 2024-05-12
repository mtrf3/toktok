package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.68o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1555468o extends AppCompatTextView {
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setMaskBlurColor(int i) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public C1555468o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
