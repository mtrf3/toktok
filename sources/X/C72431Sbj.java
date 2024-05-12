package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sbj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72431Sbj extends AppCompatImageView {
    public static final ImageView.ScaleType LL = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config LLD = Bitmap.Config.ARGB_8888;
    public final RectF LJLIL;
    public final RectF LJLILLLLZI;
    public final Matrix LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public Bitmap LJLLI;
    public Canvas LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public ColorFilter LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;

    public final void LIZIZ() {
        int i;
        RectF rectF = this.LJLILLLLZI;
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = ((r3 - min) / 2.0f) + getPaddingLeft();
        float paddingTop = ((r2 - min) / 2.0f) + getPaddingTop();
        float f = min;
        rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop));
        this.LJLLL = Math.min((this.LJLILLLLZI.height() - this.LJLJLJ) / 2.0f, (this.LJLILLLLZI.width() - this.LJLJLJ) / 2.0f);
        this.LJLIL.set(this.LJLILLLLZI);
        if (!this.LJZI && (i = this.LJLJLJ) > 0) {
            this.LJLIL.inset(i - 1.0f, i - 1.0f);
        }
        this.LJLLJ = Math.min(this.LJLIL.height() / 2.0f, this.LJLIL.width() / 2.0f);
        LIZJ();
    }

    public final void LIZJ() {
        float width;
        float height;
        if (this.LJLLI == null) {
            return;
        }
        this.LJLJI.set(null);
        int height2 = this.LJLLI.getHeight();
        float width2 = this.LJLLI.getWidth();
        float f = height2;
        float f2 = 0.0f;
        if (this.LJLIL.height() * width2 > this.LJLIL.width() * f) {
            width = this.LJLIL.height() / f;
            f2 = (this.LJLIL.width() - (width2 * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.LJLIL.width() / width2;
            height = (this.LJLIL.height() - (f * width)) * 0.5f;
        }
        this.LJLJI.setScale(width, width);
        Matrix matrix = this.LJLJI;
        float f3 = (int) (f2 + 0.5f);
        RectF rectF = this.LJLIL;
        matrix.postTranslate(f3 + rectF.left, ((int) (height + 0.5f)) + rectF.top);
        this.LJLZ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r6 = r7.getDrawable()
            r5 = 0
            if (r6 != 0) goto L23
        L7:
            r4 = r5
        L8:
            r7.LJLLI = r4
            if (r4 == 0) goto L20
            boolean r0 = r4.isMutable()
            if (r0 == 0) goto L20
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r0 = r7.LJLLI
            r1.<init>(r0)
            r7.LJLLILLLL = r1
        L1b:
            boolean r0 = r7.LJLLLLLL
            if (r0 != 0) goto L62
            return
        L20:
            r7.LJLLILLLL = r5
            goto L1b
        L23:
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L2e
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            android.graphics.Bitmap r4 = r6.getBitmap()
            goto L8
        L2e:
            boolean r0 = r6 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L4e
            android.graphics.Bitmap$Config r1 = X.C72431Sbj.LLD     // Catch: java.lang.Exception -> L5d
            r0 = 2
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r0, r1)     // Catch: java.lang.Exception -> L5d
        L39:
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L5d
            r3.<init>(r4)     // Catch: java.lang.Exception -> L5d
            int r2 = r3.getWidth()     // Catch: java.lang.Exception -> L5d
            int r1 = r3.getHeight()     // Catch: java.lang.Exception -> L5d
            r0 = 0
            r6.setBounds(r0, r0, r2, r1)     // Catch: java.lang.Exception -> L5d
            r6.draw(r3)     // Catch: java.lang.Exception -> L5d
            goto L8
        L4e:
            int r2 = r6.getIntrinsicWidth()     // Catch: java.lang.Exception -> L5d
            int r1 = r6.getIntrinsicHeight()     // Catch: java.lang.Exception -> L5d
            android.graphics.Bitmap$Config r0 = X.C72431Sbj.LLD     // Catch: java.lang.Exception -> L5d
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch: java.lang.Exception -> L5d
            goto L39
        L5d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L7
        L62:
            android.graphics.Bitmap r0 = r7.LJLLI
            if (r0 == 0) goto L6a
            r7.LIZJ()
        L69:
            return
        L6a:
            android.graphics.Paint r0 = r7.LJLJJI
            r0.setShader(r5)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72431Sbj.LIZ():void");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public int getBorderColor() {
        return this.LJLJL;
    }

    public int getBorderWidth() {
        return this.LJLJLJ;
    }

    public int getCircleBackgroundColor() {
        return this.LJLJLLL;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.LJLLLL;
    }

    @Override // android.widget.ImageView
    public int getImageAlpha() {
        return this.LJLL;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LJZ = true;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJZL) {
            super.onDraw(canvas);
            return;
        }
        if (this.LJLJLLL != 0) {
            canvas.drawCircle(this.LJLIL.centerX(), this.LJLIL.centerY(), this.LJLLJ, this.LJLJJLL);
        }
        if (this.LJLLI != null) {
            if (this.LJZ && this.LJLLILLLL != null) {
                this.LJZ = false;
                Drawable drawable = getDrawable();
                drawable.setBounds(0, 0, this.LJLLILLLL.getWidth(), this.LJLLILLLL.getHeight());
                drawable.draw(this.LJLLILLLL);
            }
            if (this.LJLZ) {
                this.LJLZ = false;
                Bitmap bitmap = this.LJLLI;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.LJLJI);
                this.LJLJJI.setShader(bitmapShader);
            }
            canvas.drawCircle(this.LJLIL.centerX(), this.LJLIL.centerY(), this.LJLLJ, this.LJLJJI);
        }
        if (this.LJLJLJ > 0) {
            canvas.drawCircle(this.LJLILLLLZI.centerX(), this.LJLILLLLZI.centerY(), this.LJLLL, this.LJLJJL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJZL) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!this.LJLILLLLZI.isEmpty()) {
            if (Math.pow(y - this.LJLILLLLZI.centerY(), 2.0d) + Math.pow(x - this.LJLILLLLZI.centerX(), 2.0d) > Math.pow(this.LJLLL, 2.0d)) {
                return false;
            }
        }
        if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (!z) {
        } else {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.LJLJL) {
            return;
        }
        this.LJLJL = i;
        this.LJLJJL.setColor(i);
        invalidate();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.LJZI) {
            return;
        }
        this.LJZI = z;
        LIZIZ();
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = i;
        this.LJLJJL.setStrokeWidth(i);
        LIZIZ();
        invalidate();
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = i;
        this.LJLJJLL.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.LJLLLL) {
            return;
        }
        this.LJLLLL = colorFilter;
        if (this.LJLLLLLL) {
            this.LJLJJI.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (z == this.LJZL) {
            return;
        }
        this.LJZL = z;
        if (z) {
            this.LJLLI = null;
            this.LJLLILLLL = null;
            this.LJLJJI.setShader(null);
        } else {
            LIZ();
        }
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.LJLL) {
            return;
        }
        this.LJLL = i2;
        if (this.LJLLLLLL) {
            this.LJLJJI.setAlpha(i2);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        LIZ();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        LIZ();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        LIZ();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        LIZ();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == LL) {
        } else {
            throw new IllegalArgumentException(C16880lQ.LLLZ("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    public C72431Sbj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C72431Sbj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = new RectF();
        this.LJLILLLLZI = new RectF();
        this.LJLJI = new Matrix();
        Paint paint = new Paint();
        this.LJLJJI = paint;
        Paint paint2 = new Paint();
        this.LJLJJL = paint2;
        Paint paint3 = new Paint();
        this.LJLJJLL = paint3;
        this.LJLJL = -16777216;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLL = 255;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3h, R.attr.a3i, R.attr.a3j, R.attr.a3k}, 0, 0);
        this.LJLJLJ = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.LJLJL = obtainStyledAttributes.getColor(0, -16777216);
        this.LJZI = obtainStyledAttributes.getBoolean(1, false);
        this.LJLJLLL = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        this.LJLLLLLL = true;
        super.setScaleType(LL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.LJLL);
        paint.setColorFilter(this.LJLLLL);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.LJLJL);
        paint2.setStrokeWidth(this.LJLJLJ);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(this.LJLJLLL);
        setOutlineProvider(new C72432Sbk(this));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        LIZIZ();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        LIZIZ();
        invalidate();
    }
}
