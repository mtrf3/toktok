package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* renamed from: X.Sbf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72427Sbf extends C62846OlW {
    public int LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public Shape LJLJJLL;
    public Shape LJLJL;
    public Paint LJLJLJ;
    public Paint LJLJLLL;
    public Paint LJLL;
    public Bitmap LJLLI;
    public PorterDuffXfermode LJLLILLLL;

    public final void LIZIZ() {
        if (this.LJLJJI <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        Bitmap bitmap = this.LJLLI;
        if (bitmap != null) {
            bitmap.recycle();
            this.LJLLI = null;
        }
        this.LJLLI = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.LJLLI);
        Paint paint = new Paint(1);
        paint.setColor(this.LJLJI);
        canvas.drawRect(new RectF(0.0f, 0.0f, measuredWidth, measuredHeight), paint);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLLI == null) {
            LIZIZ();
        }
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LJLLI;
        if (bitmap != null) {
            bitmap.recycle();
            this.LJLLI = null;
        }
        C54339LUh.LIZ(this);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Shape shape;
        super.onDraw(canvas);
        if (this.LJLJJI > 0.0f && this.LJLJL != null && this.LJLLI != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            this.LJLJLLL.setXfermode(null);
            canvas.drawBitmap(this.LJLLI, 0.0f, 0.0f, this.LJLJLLL);
            float f = this.LJLJJI;
            canvas.translate(f, f);
            if (this.LJLLILLLL == null) {
                this.LJLLILLLL = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.LJLJLLL.setXfermode(this.LJLLILLLL);
            this.LJLJL.draw(canvas, this.LJLJLLL);
            canvas.restoreToCount(saveLayer);
        }
        int i = this.LJLIL;
        if ((i != 1 && i != 2) || (shape = this.LJLJJLL) == null) {
            return;
        }
        shape.draw(canvas, this.LJLJLJ);
    }

    public void setExtension(InterfaceC72428Sbg interfaceC72428Sbg) {
        requestLayout();
    }

    public void setShapeMode(int i) {
        LJ(this.LJLILLLLZI, i);
    }

    public void setShapeRadius(float f) {
        LJ(f, this.LJLIL);
    }

    public void setStrokeColor(int i) {
        LJFF(this.LJLJJI, i);
    }

    public void setStrokeWidth(float f) {
        LJFF(f, this.LJLJI);
    }

    public C72427Sbf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = 637534208;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.b9a, R.attr.bab, R.attr.bf_, R.attr.bfa});
            this.LJLIL = obtainStyledAttributes.getInt(1, 0);
            this.LJLILLLLZI = obtainStyledAttributes.getDimension(0, 0.0f);
            this.LJLJJI = obtainStyledAttributes.getDimension(3, 0.0f);
            this.LJLJI = obtainStyledAttributes.getColor(2, this.LJLJI);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.LJLJLJ = paint;
        paint.setFilterBitmap(true);
        this.LJLJLJ.setColor(-16777216);
        this.LJLJLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.LJLJLLL = paint2;
        paint2.setFilterBitmap(true);
        this.LJLJLLL.setColor(-16777216);
        Paint paint3 = new Paint(1);
        this.LJLL = paint3;
        paint3.setFilterBitmap(true);
        this.LJLL.setColor(-16777216);
        this.LJLL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        new Path();
    }

    public final void LJ(float f, int i) {
        boolean z;
        if (this.LJLIL != i || this.LJLILLLLZI != f) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        if (z) {
            this.LJLIL = i;
            this.LJLILLLLZI = f;
            this.LJLJJLL = null;
            this.LJLJL = null;
            requestLayout();
        }
    }

    public final void LJFF(float f, int i) {
        float f2 = this.LJLJJI;
        if (f2 <= 0.0f) {
            return;
        }
        if (f2 != f) {
            this.LJLJJI = f;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Shape shape = this.LJLJL;
            float f3 = this.LJLJJI * 2.0f;
            shape.resize(measuredWidth - f3, measuredHeight - f3);
            postInvalidate();
        }
        if (this.LJLJI != i) {
            this.LJLJI = i;
            LIZIZ();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.LJLJJL) {
            this.LJLJJL = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.LJLIL == 2) {
                this.LJLILLLLZI = Math.min(measuredWidth, measuredHeight) / 2.0f;
            }
            if (this.LJLJJLL == null || this.LJLILLLLZI != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.LJLILLLLZI);
                this.LJLJJLL = new RoundRectShape(fArr, null, null);
                this.LJLJL = new RoundRectShape(fArr, null, null);
            }
            float f = measuredWidth;
            float f2 = measuredHeight;
            this.LJLJJLL.resize(f, f2);
            Shape shape = this.LJLJL;
            float f3 = this.LJLJJI * 2.0f;
            shape.resize(f - f3, f2 - f3);
            LIZIZ();
        }
    }
}
