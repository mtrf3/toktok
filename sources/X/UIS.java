package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UIS extends View {
    public long LJLIL;
    public final Paint LJLILLLLZI;
    public final Rect LJLJI;
    public final Rect LJLJJI;
    public final Rect LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;

    private final Bitmap getSrcBitmap() {
        return (Bitmap) this.LJLJJLL.getValue();
    }

    public final float getEndPosition() {
        return this.LJLJJI.right;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJJI.width() > 0 && !getSrcBitmap().isRecycled()) {
            getSrcBitmap().recycle();
        }
    }

    public final long getDuraion() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJJI.width() <= 0) {
            return;
        }
        this.LJLJI.right = (getSrcBitmap().getWidth() * getMeasuredHeight()) / getSrcBitmap().getHeight();
        this.LJLJI.bottom = getMeasuredHeight();
        this.LJLJJI.bottom = getMeasuredHeight();
        if (canvas != null) {
            canvas.save();
            canvas.translate(this.LJLJL, 0.0f);
            canvas.clipRect(this.LJLJJI);
            canvas.drawBitmap(getSrcBitmap(), this.LJLJJL, this.LJLJI, this.LJLILLLLZI);
            canvas.restore();
        }
    }

    public final void setDuraion(long j) {
        this.LJLIL = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = new Paint();
        this.LJLJI = new Rect();
        this.LJLJJI = new Rect(0, 0, 0, 0);
        this.LJLJJL = new Rect(0, 0, 0, 0);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 462));
    }
}
