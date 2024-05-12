package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* renamed from: X.VWv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79885VWv extends VRK implements LifecycleOwner {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public LifecycleRegistry LJLJI;
    public Bitmap LJLJJI;
    public Bitmap LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public Paint LJLJLJ;
    public RectF LJLJLLL;

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.LJLILLLLZI && this.LJLIL) {
            this.LJLJI.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJI.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LJLJI;
    }

    public final boolean getMAutoPlay() {
        return this.LJLIL;
    }

    public final boolean getMIgnoreAttachStatus() {
        return this.LJLILLLLZI;
    }

    public final boolean getMIsShowLastFrame() {
        return this.LJLJJLL;
    }

    public final boolean getMIsShowPoster() {
        return this.LJLJL;
    }

    public final Bitmap getMLastFrame() {
        return this.LJLJJL;
    }

    public final LifecycleRegistry getMLifecycleRegistry() {
        return this.LJLJI;
    }

    public final Paint getMPaint() {
        return this.LJLJLJ;
    }

    public final Bitmap getMPoster() {
        return this.LJLJJI;
    }

    public final RectF getMRectF() {
        return this.LJLJLLL;
    }

    public C79885VWv(Context context) {
        super(context);
        setWillNotDraw(false);
        this.LJLJI = new LifecycleRegistry(this);
        this.LJLJLJ = new Paint();
        this.LJLJLLL = new RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLJJI != null && this.LJLJL) {
            this.LJLJLLL.set(0.0f, 0.0f, getWidth(), getHeight());
            if (canvas != null) {
                Bitmap bitmap = this.LJLJJI;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, this.LJLJLLL, this.LJLJLJ);
                    return;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            o.LJIIZILJ();
            throw null;
        }
        if (this.LJLJJL == null || !this.LJLJJLL) {
            return;
        }
        this.LJLJLLL.set(0.0f, 0.0f, getWidth(), getHeight());
        if (canvas != null) {
            Bitmap bitmap2 = this.LJLJJL;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, (Rect) null, this.LJLJLLL, this.LJLJLJ);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        o.LJIIZILJ();
        throw null;
    }

    public final void setMAutoPlay(boolean z) {
        this.LJLIL = z;
    }

    public final void setMIgnoreAttachStatus(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setMIsShowLastFrame(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setMIsShowPoster(boolean z) {
        this.LJLJL = z;
    }

    public final void setMLastFrame(Bitmap bitmap) {
        this.LJLJJL = bitmap;
    }

    public final void setMLifecycleRegistry(LifecycleRegistry lifecycleRegistry) {
        o.LJIIJ(lifecycleRegistry, "<set-?>");
        this.LJLJI = lifecycleRegistry;
    }

    public final void setMPaint(Paint paint) {
        o.LJIIJ(paint, "<set-?>");
        this.LJLJLJ = paint;
    }

    public final void setMPoster(Bitmap bitmap) {
        this.LJLJJI = bitmap;
    }

    public final void setMRectF(RectF rectF) {
        o.LJIIJ(rectF, "<set-?>");
        this.LJLJLLL = rectF;
    }
}
