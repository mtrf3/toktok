package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5RI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RI extends View {
    public final Path LJLIL;
    public final Path LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public int LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;

    private final int getMMaskColorLight() {
        return (((int) ((r0 >>> 24) * 0.6d)) << 24) | (16777215 & this.LJLJLLL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LJLL) {
            if (canvas != null) {
                this.LJLJI = canvas.getWidth();
                this.LJLJJI = canvas.getHeight();
            }
            float f = 2;
            int LIZ = C5RE.LIZ(this.LJLJLJ / f);
            int LIZ2 = C5RE.LIZ(this.LJLJLJ / f);
            Path path = this.LJLIL;
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, this.LJLJJI);
            path.lineTo(this.LJLJI, this.LJLJJI);
            path.lineTo(this.LJLJI, 0.0f);
            float f2 = (this.LJLJI - LIZ) >> 1;
            float f3 = LIZ;
            float f4 = f2 + f3;
            float f5 = (this.LJLJJI - LIZ2) >> 1;
            float f6 = LIZ2;
            float f7 = f5 + f6;
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(f2, f5);
            path.lineTo(f4, f5);
            path.lineTo(f4, f7);
            path.lineTo(f2, f7);
            path.close();
            Path path2 = this.LJLILLLLZI;
            path2.reset();
            float f8 = 3;
            float f9 = ((this.LJLJI - LIZ) >> 1) + f8;
            float f10 = 6;
            float f11 = (f3 + f9) - f10;
            float f12 = ((this.LJLJJI - LIZ2) >> 1) + f8;
            float f13 = (f6 + f12) - f10;
            path2.setFillType(Path.FillType.EVEN_ODD);
            path2.moveTo(f9, f12);
            path2.lineTo(f11, f12);
            path2.lineTo(f11, f13);
            path2.lineTo(f9, f13);
            path2.close();
            this.LJLL = true;
        }
        if (!this.LJLL || canvas == null) {
            return;
        }
        canvas.drawPath(this.LJLIL, this.LJLJJL);
        canvas.drawPath(this.LJLILLLLZI, this.LJLJJLL);
    }

    public C5RI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new Path();
        this.LJLILLLLZI = new Path();
        Paint paint = new Paint(1);
        this.LJLJJL = paint;
        Paint paint2 = new Paint(1);
        this.LJLJJLL = paint2;
        this.LJLJL = -16711681;
        this.LJLJLJ = 1.0f;
        this.LJLJLLL = 1157627904;
        this.LJLL = true;
        o.LJI(context);
        o.LJI(attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3e, R.attr.a3f, R.attr.a3g});
        this.LJLJL = obtainStyledAttributes.getColor(0, -16711681);
        this.LJLJLJ = obtainStyledAttributes.getDimension(1, (1 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        this.LJLJLLL = obtainStyledAttributes.getColor(2, 1157627904);
        obtainStyledAttributes.recycle();
        paint.setColor(getMMaskColorLight());
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(this.LJLJL);
        paint2.setStrokeWidth(this.LJLJLJ);
        paint2.setStyle(Paint.Style.STROKE);
    }
}
