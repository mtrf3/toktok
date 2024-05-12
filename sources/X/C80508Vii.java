package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vii, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80508Vii extends View {
    public ValueAnimator LJLIL;
    public boolean LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public final int LJLJJLL;
    public final List<InterfaceC74061T4v> LJLJL;
    public final int LJLJLJ;
    public final float LJLJLLL;
    public final Paint LJLL;
    public final RectF LJLLI;
    public final int LJLLILLLL;
    public float LJLLJ;
    public boolean LJLLL;
    public InterfaceC80525Viz LJLLLL;
    public double LJLLLLLL;
    public int LJLZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.LJLZ * ((float) Math.cos(this.LJLLLLLL))) + width;
        float f = height;
        float sin = (this.LJLZ * ((float) Math.sin(this.LJLLLLLL))) + f;
        this.LJLL.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.LJLJLJ, this.LJLL);
        double sin2 = Math.sin(this.LJLLLLLL);
        double cos2 = Math.cos(this.LJLLLLLL);
        this.LJLL.setStrokeWidth(this.LJLLILLLL);
        canvas.drawLine(width, f, r5 + ((int) (cos2 * r0)), height + ((int) (r0 * sin2)), this.LJLL);
        canvas.drawCircle(width, f, this.LJLJLLL, this.LJLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80508Vii.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C80508Vii(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.b03);
        this.LJLJL = new ArrayList();
        Paint paint = new Paint();
        this.LJLL = paint;
        this.LJLLI = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3s, R.attr.b02, R.attr.b_y}, R.attr.b03, R.style.a26);
        this.LJLZ = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.LJLJLJ = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.LJLLILLLL = getResources().getDimensionPixelSize(R.dimen.yi);
        this.LJLJLLL = r1.getDimensionPixelSize(R.dimen.yg);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        LIZIZ(0.0f, false);
        this.LJLJJLL = ViewConfiguration.get(context).getScaledTouchSlop();
        C16300kU.LJIJ(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int LIZ(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    public final void LIZIZ(float f, boolean z) {
        ValueAnimator valueAnimator = this.LJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            LIZJ(f, false);
            return;
        }
        float f2 = this.LJLLJ;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.LJLIL = ofFloat;
        ofFloat.setDuration(200L);
        this.LJLIL.addUpdateListener(new C74085T5t(this));
        this.LJLIL.addListener(new C80519Vit());
        this.LJLIL.start();
    }

    public final void LIZJ(float f, boolean z) {
        float f2 = f % 360.0f;
        this.LJLLJ = f2;
        this.LJLLLLLL = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float cos = (this.LJLZ * ((float) Math.cos(this.LJLLLLLL))) + (getWidth() / 2);
        float sin = (this.LJLZ * ((float) Math.sin(this.LJLLLLLL))) + height;
        RectF rectF = this.LJLLI;
        int i = this.LJLJLJ;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        Iterator<InterfaceC74061T4v> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().LJJIJIIJIL(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LIZIZ(this.LJLLJ, false);
    }
}
