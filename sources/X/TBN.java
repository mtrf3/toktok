package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TBN extends RelativeLayout {
    public TBO LJLIL;

    public float getBottomLeftRadius() {
        return this.LJLIL.LIZ[4];
    }

    public float getBottomRightRadius() {
        return this.LJLIL.LIZ[6];
    }

    public int getStrokeColor() {
        return this.LJLIL.LJ;
    }

    public int getStrokeWidth() {
        return this.LJLIL.LJI;
    }

    public float getTopLeftRadius() {
        return this.LJLIL.LIZ[0];
    }

    public float getTopRightRadius() {
        return this.LJLIL.LIZ[2];
    }

    @Override // android.view.View
    public final void invalidate() {
        TBO tbo = this.LJLIL;
        if (tbo != null) {
            tbo.LIZLLL(this);
        }
        super.invalidate();
    }

    public final TBO getMRectCornerHelper() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.saveLayer(this.LJLIL.LIZIZ(), null, 31);
        super.dispatchDraw(canvas);
        TBO tbo = this.LJLIL;
        tbo.getClass();
        if (tbo.LJI > 0) {
            tbo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            tbo.LIZJ().setColor(-1);
            tbo.LIZJ().setStrokeWidth(tbo.LJI * 2);
            tbo.LIZJ().setStyle(Paint.Style.STROKE);
            canvas.drawPath(tbo.LIZ(), tbo.LIZJ());
            tbo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            tbo.LIZJ().setColor(tbo.LJ);
            tbo.LIZJ().setStyle(Paint.Style.STROKE);
            canvas.drawPath(tbo.LIZ(), tbo.LIZJ());
        }
        tbo.LIZJ().setColor(-1);
        tbo.LIZJ().setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            tbo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(tbo.LIZ(), tbo.LIZJ());
        } else {
            tbo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path = new Path();
            path.addRect(0.0f, 0.0f, tbo.LIZIZ().width(), tbo.LIZIZ().height(), Path.Direction.CW);
            path.op(tbo.LIZ(), Path.Op.DIFFERENCE);
            canvas.drawPath(path, tbo.LIZJ());
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            Region region = this.LJLIL.LJIIIIZZ;
            if (region != null) {
                if (!region.contains((int) ev.getX(), (int) ev.getY())) {
                    return false;
                }
            } else {
                o.LJIJI("mAreaRegion");
                throw null;
            }
        } else if (action != 1) {
            if (action == 3) {
                setPressed(false);
                refreshDrawableState();
            }
            return super.dispatchTouchEvent(ev);
        }
        refreshDrawableState();
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLIL.LJII) {
            canvas.save();
            canvas.clipPath(this.LJLIL.LIZ());
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public void setBottomLeftRadius(int i) {
        float[] fArr = this.LJLIL.LIZ;
        float f = i * 1.0f;
        fArr[6] = f;
        fArr[7] = f;
        invalidate();
    }

    public void setBottomRightRadius(int i) {
        float[] fArr = this.LJLIL.LIZ;
        float f = i * 1.0f;
        fArr[4] = f;
        fArr[5] = f;
        invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.LJLIL.LJII = z;
        invalidate();
    }

    public final void setMRectCornerHelper(TBO tbo) {
        o.LJIIIZ(tbo, "<set-?>");
        this.LJLIL = tbo;
    }

    public void setRadius(int i) {
        int length = this.LJLIL.LIZ.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.LJLIL.LIZ[i2] = i * 1.0f;
        }
        invalidate();
    }

    public final void setRoundAsCircle(boolean z) {
        this.LJLIL.LIZLLL = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.LJLIL.LJ = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.LJLIL.LJI = i;
        invalidate();
    }

    public void setTopLeftRadius(int i) {
        float[] fArr = this.LJLIL.LIZ;
        float f = i * 1.0f;
        fArr[0] = f;
        fArr[1] = f;
        invalidate();
    }

    public void setTopRightRadius(int i) {
        float[] fArr = this.LJLIL.LIZ;
        float f = i * 1.0f;
        fArr[2] = f;
        fArr[3] = f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        TBO tbo = new TBO();
        this.LJLIL = tbo;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3q, R.attr.b95, R.attr.b96, R.attr.b97, R.attr.b98, R.attr.b99, R.attr.b9_, R.attr.bf_, R.attr.bfa, R.attr.bqm, R.attr.bt4, R.attr.bt5, R.attr.bt6, R.attr.bt7, R.attr.bt8, R.attr.bt9, R.attr.bts, R.attr.btt});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.RectCornerAttrs)");
        tbo.LIZLLL = obtainStyledAttributes.getBoolean(1, false);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
        tbo.LJFF = colorStateList;
        if (colorStateList != null) {
            tbo.LJ = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = tbo.LJFF;
            o.LJI(colorStateList2);
            colorStateList2.getDefaultColor();
        } else {
            tbo.LJ = -1;
        }
        tbo.LJI = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        tbo.LJII = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float[] fArr = tbo.LIZ;
        float f = dimensionPixelSize2;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = dimensionPixelSize3;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = dimensionPixelSize5;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = dimensionPixelSize4;
        fArr[6] = f4;
        fArr[7] = f4;
        tbo.LJIIIZ = new RectF();
        tbo.LIZIZ = new Path();
        tbo.LJIIIIZZ = new Region();
        tbo.LIZJ = new Paint();
        tbo.LIZJ().setColor(-1);
        tbo.LIZJ().setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        TBO tbo = this.LJLIL;
        tbo.getClass();
        tbo.LIZIZ().set(0.0f, 0.0f, i, i2);
        tbo.LIZLLL(this);
    }
}
