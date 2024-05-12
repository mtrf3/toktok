package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aTp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93621aTp extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final Path LJLJJL;
    public final Path LJLJJLL;
    public final float LJLJL;
    public final Paint LJLJLJ;
    public final Paint LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZ(this.LJLJJL, 0.0f);
        canvas.clipPath(this.LJLJJL);
        canvas.drawPath(this.LJLJJL, this.LJLJLJ);
        super.draw(canvas);
        if (this.LJLL) {
            LIZ(this.LJLJJLL, this.LJLJL / 2);
            Path path = this.LJLJJLL;
            LinearGradient linearGradient = new LinearGradient(getWidth() / 2.0f, getTop(), getWidth() / 2.0f, getBottom(), C04330Ez.LIZIZ(getContext(), R.color.ae9), C04330Ez.LIZIZ(getContext(), R.color.ae8), Shader.TileMode.CLAMP);
            if (this.LJLLI) {
                this.LJLJLLL.setShader(linearGradient);
                canvas.drawPath(path, this.LJLJLLL);
            } else {
                canvas.drawPath(path, this.LJLJLLL);
            }
        }
    }

    public final void setBorderPaintColor(int i) {
        this.LJLJLLL.setColor(i);
    }

    public final void setGradientBorder(boolean z) {
        this.LJLLI = z;
    }

    public final void setRadius(float f) {
        this.LJLIL = f;
        this.LJLILLLLZI = f;
        this.LJLJI = f;
        this.LJLJJI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c5, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C93621aTp(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r2 = 0
            r11.<init>(r12, r13, r2)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r11.LJLJJL = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r11.LJLJJLL = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = X.C93410aQQ.LIZ(r0)
            r11.LJLJL = r5
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            r4 = 1
            r3.setAntiAlias(r4)
            r3.setColor(r2)
            r11.LJLJLJ = r3
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            r1.setStrokeWidth(r5)
            r1.setAntiAlias(r4)
            r11.LJLJLLL = r1
            r11.LJLL = r4
            r11.LJLLI = r4
            if (r13 != 0) goto L4e
        L4a:
            r11.setWillNotDraw(r2)
            return
        L4e:
            r1 = 0
            android.content.Context r10 = r11.getContext()     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 6
            int[] r6 = new int[r0]     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 1711407108(0x66020004, float:1.5347698E23)
            r6[r2] = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 1711407109(0x66020005, float:1.53477E23)
            r6[r4] = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 2130969444(0x7f040364, float:1.754757E38)
            r9 = 2
            r6[r9] = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 2130969448(0x7f040368, float:1.7547578E38)
            r7 = 3
            r6[r7] = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 2130971632(0x7f040bf0, float:1.7552008E38)
            r8 = 4
            r6[r8] = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r0 = 2130971636(0x7f040bf4, float:1.7552016E38)
            r5 = 5
            r6[r5] = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r13, r6)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r6 = 1711538183(0x66040007, float:1.5583822E23)
            float r0 = r0.getDimension(r6)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r1.getDimension(r9, r0)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r11.LJLIL = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r0.getDimension(r6)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r1.getDimension(r8, r0)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r11.LJLILLLLZI = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r0.getDimension(r6)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r1.getDimension(r7, r0)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r11.LJLJI = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r0.getDimension(r6)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            float r0 = r1.getDimension(r5, r0)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r11.LJLJJI = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            boolean r0 = r1.getBoolean(r4, r2)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r11.LJLL = r0     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            int r0 = r1.getColor(r2, r2)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            r3.setColor(r0)     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lcb
            goto Lc7
        Lc5:
            if (r1 == 0) goto L4a
        Lc7:
            r1.recycle()
            goto L4a
        Lcb:
            r0 = move-exception
            if (r1 == 0) goto Ld1
            r1.recycle()
        Ld1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93621aTp.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void LIZ(Path path, float f) {
        path.reset();
        path.moveTo(getWidth() - this.LJLJJI, f);
        path.arcTo((getWidth() - (this.LJLJJI * 2.0f)) + f, f, getWidth() - f, (this.LJLJJI * 2.0f) - f, 270.0f, 90.0f, false);
        path.lineTo(getWidth() - f, getHeight() - this.LJLJI);
        float f2 = 2;
        path.arcTo((getWidth() - (this.LJLJI * 2.0f)) + f, (getHeight() - (this.LJLJI * f2)) + f, getWidth() - f, getHeight() - f, 0.0f, 90.0f, false);
        path.lineTo(this.LJLIL, getHeight() - f);
        float height = getHeight();
        float f3 = this.LJLIL;
        path.arcTo(f, (height - (f3 * 2.0f)) + f, (f2 * f3) - f, getHeight() - f, 90.0f, 90.0f, false);
        path.lineTo(f, this.LJLILLLLZI);
        float f4 = (this.LJLILLLLZI * 2.0f) - f;
        path.arcTo(f, f, f4, f4, 180.0f, 90.0f, false);
        path.close();
    }
}
