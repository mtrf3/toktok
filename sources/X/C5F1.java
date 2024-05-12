package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5F1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F1 extends TuxTextView {
    public final Paint LJLLLL;
    public final PorterDuffXfermode LJLLLLLL;
    public final RectF LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        RectF rectF = this.LJLZ;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawRoundRect(this.LJLZ, C32151Nz.LJIIZILJ(2), C32151Nz.LJIIZILJ(2), this.LJLLLL);
        getPaint().setXfermode(this.LJLLLLLL);
        super.onDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        Paint paint = new Paint(1);
        this.LJLLLL = paint;
        this.LJLZ = new RectF();
        paint.setColor(-1);
        this.LJLLLLLL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }
}
