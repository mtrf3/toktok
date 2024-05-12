package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.6C1, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6C1 extends View {
    public final RectF LJLIL;
    public final RectF LJLILLLLZI;
    public final Paint LJLJI;
    public final RectF LJLJJI;
    public Paint LJLJJL;
    public int[] LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public volatile boolean LJLLJ;
    public boolean LJLLL;
    public final PointF[] LJLLLL;
    public C6CB LJLLLLLL;

    public final void LIZIZ() {
        RectF rectF = new RectF(this.LJLIL);
        C77119UOl.LJJIIZ(rectF, this.LJLLILLLL);
        if (this.LJLLL) {
            RectF rectF2 = this.LJLJJI;
            float f = rectF.left;
            int i = this.LJLJLJ;
            float f2 = rectF.top;
            int i2 = this.LJLJLLL;
            rectF2.set(f - i, f2 - i2, rectF.right + i, rectF.bottom + i2);
        } else {
            this.LJLJJI.set(rectF);
        }
        RectF rectF3 = this.LJLILLLLZI;
        RectF rectF4 = this.LJLJJI;
        float f3 = rectF4.left;
        int i3 = this.LJLJL;
        rectF3.set(f3 - i3, rectF4.top - i3, rectF4.right + i3, rectF4.bottom + i3);
        PointF[] pointFArr = this.LJLLLL;
        PointF pointF = pointFArr[0];
        RectF rectF5 = this.LJLJJI;
        float f4 = rectF5.left;
        pointF.x = f4;
        float f5 = rectF5.top;
        pointF.y = f5;
        PointF pointF2 = pointFArr[1];
        float f6 = rectF5.right;
        pointF2.x = f6;
        pointF2.y = f5;
        PointF pointF3 = pointFArr[2];
        pointF3.x = f4;
        float f7 = rectF5.bottom;
        pointF3.y = f7;
        PointF pointF4 = pointFArr[3];
        pointF4.x = f6;
        pointF4.y = f7;
        for (PointF pointF5 : pointFArr) {
            C77119UOl.LJJIII(pointF5, this.LJLILLLLZI.centerX(), this.LJLILLLLZI.centerY(), (float) Math.toRadians(this.LJLLI));
        }
    }

    public RectF getRectOnWindow() {
        RectF rectF = this.LJLILLLLZI;
        float f = rectF.left;
        int[] iArr = this.LJLJJLL;
        int i = iArr[0];
        float f2 = rectF.top;
        int i2 = iArr[1];
        return new RectF(f + i, f2 + i2, rectF.right + i, rectF.bottom + i2);
    }

    public PointF[] getFourAnglePoint() {
        return this.LJLLLL;
    }

    public RectF getHelpBoxRect() {
        return this.LJLILLLLZI;
    }

    public float getRotateAngle() {
        return this.LJLLI;
    }

    public RectF getViewBoxRect() {
        return this.LJLJJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LIZIZ();
        canvas.save();
        canvas.rotate(this.LJLLI, this.LJLIL.centerX(), this.LJLIL.centerY());
        if (this.LJLLL) {
            RectF rectF = this.LJLJJI;
            int i = this.LJLL;
            canvas.drawRoundRect(rectF, i, i, this.LJLJJL);
        }
        if (this.LJLLJ) {
            canvas.drawRect(this.LJLILLLLZI, this.LJLJI);
        }
        canvas.restore();
    }

    public void setHelpBoxColor(int i) {
        this.LJLJI.setColor(i);
    }

    public void setHelpBoxPadding(int i) {
        this.LJLJL = i;
        invalidate();
    }

    public void setShowBg(boolean z) {
        this.LJLLL = z;
        invalidate();
    }

    public void setStickerShowHelpboxCallback(C6CB c6cb) {
        this.LJLLLLLL = c6cb;
    }

    public void setmWindowPadding(int[] iArr) {
        this.LJLJJLL = iArr;
    }

    public C6C1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new RectF();
        this.LJLILLLLZI = new RectF();
        Paint paint = new Paint();
        this.LJLJI = paint;
        this.LJLJJI = new RectF();
        this.LJLJJL = new Paint();
        this.LJLJJLL = new int[2];
        this.LJLJL = 10;
        this.LJLJLJ = 10;
        this.LJLJLLL = 10;
        this.LJLL = 10;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2.0f);
        Paint paint2 = new Paint(paint);
        this.LJLJJL = paint2;
        paint2.setColor(-1);
        this.LJLJJL.setStyle(Paint.Style.FILL);
        this.LJLJL = (int) C74275TDb.LIZIZ(context, 10.0f);
        this.LJLJLJ = (int) C74275TDb.LIZIZ(context, 16.0f);
        this.LJLJLLL = (int) C74275TDb.LIZIZ(context, 8.0f);
        this.LJLL = (int) C74275TDb.LIZIZ(context, 5.0f);
        new Paint().setColor(-65536);
    }

    public final void LIZ(float f, float f2) {
        this.LJLIL.offset(f, f2);
        invalidate();
    }
}
