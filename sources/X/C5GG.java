package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5GG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GG extends TuxTextView {
    public final Paint LJLLLL;
    public final Paint LJLLLLLL;
    public final RectF LJLZ;
    public final RectF LJZ;
    public final Paint LJZI;
    public float LJZL;
    public float LL;
    public final float LLD;
    public final float LLF;
    public final float LLFF;
    public final float LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public final java.util.Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIFFJFJJ;
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

    public final int getBgColor() {
        return this.LLFZ;
    }

    public final int getBorderColor() {
        return this.LLFII;
    }

    public final int getTxtColor() {
        return this.LLI;
    }

    public C5GG(Context context) {
        super(context, null, 0);
        int i;
        int i2;
        Paint paint = new Paint(1);
        this.LJLLLL = paint;
        Paint paint2 = new Paint(1);
        this.LJLLLLLL = paint2;
        this.LJLZ = new RectF();
        this.LJZ = new RectF();
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LJZI = paint3;
        this.LJZL = C32151Nz.LJIIZILJ(4);
        this.LL = C32151Nz.LJIIZILJ(5);
        float LJIIZILJ = C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
        this.LLD = LJIIZILJ;
        this.LLF = C32151Nz.LJIIZILJ(2);
        this.LLFF = 0.33333334f;
        this.LLFFF = 0.8f;
        Integer LJI = C79045V0n.LJI(R.attr.j2, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LLFII = i;
        Integer LJI2 = C79045V0n.LJI(R.attr.j0, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        this.LLFZ = i2;
        Integer LJI3 = C79045V0n.LJI(R.attr.j5, context);
        this.LLI = LJI3 != null ? LJI3.intValue() : 0;
        setTuxFont(92);
        setLayerType(2, null);
        setTextColor(this.LLI);
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), C7MY.LIZIZ(6), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
        paint.setDither(true);
        paint.setColor(this.LLFII);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(LJIIZILJ);
        paint2.setDither(true);
        paint2.setColor(this.LLFZ);
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float height = (float) ((getHeight() / 2.0d) - (this.LL / 2.0d));
        RectF rectF = this.LJLZ;
        float f = this.LLF;
        canvas.drawRoundRect(rectF, f, f, this.LJLLLLLL);
        RectF rectF2 = this.LJZ;
        float f2 = this.LLF;
        canvas.drawRoundRect(rectF2, f2, f2, this.LJLLLL);
        float f3 = 0;
        float f4 = this.LJZL;
        float f5 = 2;
        canvas.drawOval(f3 - (f4 / f5), height, (f4 / f5) + f3, height + this.LL, this.LJZI);
        canvas.drawOval(getWidth() - (this.LJZL / f5), height, (this.LJZL / f5) + getWidth(), height + this.LL, this.LJZI);
        float f6 = this.LJZL;
        canvas.drawArc(f3 - (f6 / f5), height, (f6 / f5) + f3, height + this.LL, 0.0f, 360.0f, false, this.LJLLLL);
        canvas.drawArc(getWidth() - (this.LJZL / f5), height, (this.LJZL / f5) + getWidth(), height + this.LL, 0.0f, 360.0f, false, this.LJLLLL);
        super.onDraw(canvas);
    }

    public final void setBgColor(int i) {
        this.LLFZ = i;
        this.LJLLLLLL.setColor(i);
    }

    public final void setBorderColor(int i) {
        this.LLFII = i;
        this.LJLLLL.setColor(i);
    }

    public final void setTxtColor(int i) {
        this.LLI = i;
        setTextColor(i);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.LJLZ;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        float f = i3 - i;
        rectF.right = f;
        float f2 = i4 - i2;
        rectF.bottom = f2;
        RectF rectF2 = this.LJZ;
        float f3 = this.LLD;
        float f4 = 2;
        rectF2.left = (f3 / f4) + 0.0f;
        rectF2.top = (f3 / f4) + 0.0f;
        rectF2.right = f - (f3 / f4);
        rectF2.bottom = f2 - (f3 / f4);
        float f5 = f2 * this.LLFF;
        this.LL = f5;
        this.LJZL = f5 * this.LLFFF;
    }
}
