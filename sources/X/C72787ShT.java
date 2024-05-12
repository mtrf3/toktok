package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ShT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72787ShT extends View {
    public final ShortVideoContext LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public float LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;

    private final RectF getFlashRectF() {
        float f = this.LJLJL;
        float f2 = this.LJLJJI + f;
        float f3 = f + this.LJLJI;
        float screenWidth = getScreenWidth() - this.LJLJJI;
        float f4 = this.LJLJL;
        return new RectF(f2, f3, screenWidth - f4, f4 + this.LJLJI + this.LJLL);
    }

    private final int getScreenHeight() {
        return ((Number) this.LJLJLLL.getValue()).intValue();
    }

    private final int getScreenWidth() {
        return ((Number) this.LJLJLJ.getValue()).intValue();
    }

    private final FrameLayout.LayoutParams getSurfaceViewParams() {
        return (FrameLayout.LayoutParams) this.LJLILLLLZI.getValue();
    }

    private final RectF getSurfaceViewRectF() {
        return new RectF(this.LJLJJI, this.LJLJI, getScreenWidth() - this.LJLJJI, this.LJLJJLL + this.LJLJI);
    }

    public final ShortVideoContext getShortVideoContext() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStrokeWidth(this.LJLJL);
        LIZIZ.setColor(this.LJLLILLLL);
        LIZIZ.setStyle(Paint.Style.STROKE);
        LIZIZ.setMaskFilter(new BlurMaskFilter(this.LJLJL, BlurMaskFilter.Blur.NORMAL));
        Path path = new Path();
        path.addRect(getSurfaceViewRectF(), Path.Direction.CW);
        RectF flashRectF = getFlashRectF();
        path.addRect(flashRectF, Path.Direction.CW);
        float f = this.LJLLI;
        path.addRoundRect(flashRectF, f, f, Path.Direction.CW);
        if (canvas != null) {
            canvas.drawPath(path, LIZIZ);
        }
        LIZIZ.setMaskFilter(new BlurMaskFilter(40.0f, BlurMaskFilter.Blur.NORMAL));
        LIZIZ.setStyle(Paint.Style.STROKE);
        if (canvas != null) {
            canvas.drawRect(getSurfaceViewRectF(), LIZIZ);
        }
        LIZIZ.setStyle(Paint.Style.FILL_AND_STROKE);
        RectF rectF = new RectF(0.0f, 0.0f, getScreenWidth(), this.LJLJI);
        if (canvas != null) {
            canvas.drawRect(rectF, LIZIZ);
        }
        RectF rectF2 = new RectF(0.0f, this.LJLJI + this.LJLJJLL, getScreenWidth(), getScreenHeight());
        if (canvas != null) {
            canvas.drawRect(rectF2, LIZIZ);
        }
        float f2 = this.LJLJI;
        RectF rectF3 = new RectF(0.0f, f2, this.LJLJJI, this.LJLJJLL + f2);
        if (canvas != null) {
            canvas.drawRect(rectF3, LIZIZ);
        }
        RectF rectF4 = new RectF(getScreenWidth() - this.LJLJJI, this.LJLJI, getScreenWidth(), this.LJLJI + this.LJLJJLL);
        if (canvas != null) {
            canvas.drawRect(rectF4, LIZIZ);
        }
        if (this.LJLLJ) {
            LIZIZ.setMaskFilter(null);
            LIZIZ.setStyle(Paint.Style.FILL_AND_STROKE);
            double LIZIZ2 = ((this.LJLJJLL - (this.LJLJJL * 1.125d)) / 2) + C7MY.LIZIZ(20);
            RectF rectF5 = new RectF(0.0f, 0.0f, getScreenWidth(), (float) (this.LJLJI + LIZIZ2));
            if (canvas != null) {
                canvas.drawRect(rectF5, LIZIZ);
            }
            RectF rectF6 = new RectF(0.0f, (float) ((this.LJLJI + this.LJLJJLL) - LIZIZ2), getScreenWidth(), getScreenHeight());
            if (canvas != null) {
                canvas.drawRect(rectF6, LIZIZ);
            }
        }
    }

    public final void setFlashColor(int i) {
        this.LJLLILLLL = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72787ShT(Context context, ShortVideoContext shortVideoContext) {
        super(context);
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        new LinkedHashMap();
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1218));
        this.LJLJI = getSurfaceViewParams().topMargin;
        this.LJLJJI = getSurfaceViewParams().leftMargin;
        this.LJLJJL = getSurfaceViewParams().width;
        float f = getSurfaceViewParams().height;
        this.LJLJJLL = f;
        this.LJLJL = C32151Nz.LJIIZILJ(56);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(context, 1217));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(context, 1216));
        getScreenWidth();
        this.LJLL = f - (this.LJLJL * 2);
        this.LJLLI = C32151Nz.LJIIZILJ(130);
        this.LJLLILLLL = -1;
        if (Build.VERSION.SDK_INT >= 28) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public final void LIZIZ(float f, float f2) {
        this.LJLJL = f;
        getScreenWidth();
        this.LJLL = this.LJLJJLL - (this.LJLJL * 2);
        this.LJLLI = f2;
        invalidate();
    }

    public final void LIZ(float f, float f2, int i) {
        requestLayout();
        this.LJLJL = f;
        getScreenWidth();
        this.LJLL = this.LJLJJLL - (this.LJLJL * 2);
        this.LJLLI = f2;
        this.LJLLILLLL = i;
        invalidate();
    }
}
