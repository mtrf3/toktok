package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SXz */
/* loaded from: classes13.dex */
public class C72271SXz extends ConstraintLayout {
    public final int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public Rect LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public Bitmap LJLJL;
    public final C62822Ol8 LJLJLJ;

    private final Paint getHighlightPaint() {
        return (Paint) this.LJLJLJ.getValue();
    }

    private final Paint getMaskPaint() {
        return (Paint) this.LJLJJLL.getValue();
    }

    public final Rect getHighlightRect() {
        int i;
        if (this.LJLJJI == null && (i = this.LJLJI) > 0) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return this.LJLJJI;
            }
            this.LJLJJI = new Rect(findViewById.getLeft(), findViewById.getTop(), findViewById.getWidth() + findViewById.getLeft(), findViewById.getHeight() + findViewById.getTop());
        }
        return new Rect(this.LJLJJI);
    }

    public final Rect getRootRect() {
        return (Rect) this.LJLJJL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LJLJL;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.LJLJL = null;
    }

    public final int getMASK_COLOR_DEFAULT() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect highlightRect;
        if (canvas != null && (highlightRect = getHighlightRect()) != null) {
            if (this.LJLJL == null) {
                this.LJLJL = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap = this.LJLJL;
            if (bitmap != null) {
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getMaskPaint());
                canvas2.drawRect(highlightRect, getHighlightPaint());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72271SXz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        int LIZIZ = C86V.LIZIZ(R.color.cq);
        this.LJLIL = LIZIZ;
        this.LJLILLLLZI = LIZIZ;
        this.LJLJI = -1;
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 628));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 627));
        this.LJLJLJ = C221108m2.LIZIZ(SY0.LJLIL);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.afr, R.attr.az8});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ble.HighlightChildLayout)");
            this.LJLJI = obtainStyledAttributes.getResourceId(0, -1);
            this.LJLILLLLZI = obtainStyledAttributes.getColor(1, LIZIZ);
            obtainStyledAttributes.recycle();
            if (this.LJLJI > 0) {
                setBackgroundColor(0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r1 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJJLJLI(int r4, android.graphics.Rect r5) {
        /*
            r3 = this;
            int r0 = r3.LJLILLLLZI
            r2 = 1
            if (r0 == r4) goto L34
            r3.LJLILLLLZI = r4
            android.graphics.Paint r1 = r3.getMaskPaint()
            int r0 = r3.LJLILLLLZI
            r1.setColor(r0)
            android.graphics.Bitmap r0 = r3.LJLJL
            if (r0 == 0) goto L17
            r0.recycle()
        L17:
            r0 = 0
            r3.LJLJL = r0
            r1 = 1
        L1b:
            android.graphics.Rect r0 = r3.getHighlightRect()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 != 0) goto L30
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5)
            r3.LJLJJI = r0
        L2c:
            r3.invalidate()
        L2f:
            return r2
        L30:
            r2 = r1
            if (r1 == 0) goto L2f
            goto L2c
        L34:
            r1 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72271SXz.LJJLJLI(int, android.graphics.Rect):boolean");
    }

    public static /* synthetic */ boolean LJJLL(C72271SXz c72271SXz, int i, Rect rect, int i2) {
        if ((i2 & 1) != 0) {
            i = c72271SXz.LJLILLLLZI;
        }
        if ((i2 & 2) != 0) {
            rect = c72271SXz.LJLJJI;
        }
        return c72271SXz.LJJLJLI(i, rect);
    }
}
