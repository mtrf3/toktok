package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.lighten.loader.SmartImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vtg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81188Vtg extends SmartImageView {
    public ViewOnTouchListenerC81187Vtf LJLJLJ;
    public InterfaceC81194Vtm LJLJLLL;
    public volatile boolean LJLL;

    public InterfaceC81196Vto getOnPhotoTapListener() {
        return null;
    }

    public void setOnMatrixChangeListener(InterfaceC81195Vtn interfaceC81195Vtn) {
    }

    public void setOnPhotoTapListener(InterfaceC81196Vto interfaceC81196Vto) {
    }

    public void setOnScaleChangeListener(InterfaceC81197Vtp interfaceC81197Vtp) {
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            return viewOnTouchListenerC81187Vtf.LJLJJLL;
        }
        return 0.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            return viewOnTouchListenerC81187Vtf.LJLJJL;
        }
        return 0.0f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            return viewOnTouchListenerC81187Vtf.LJLJJI;
        }
        return 0.0f;
    }

    public InterfaceC71052Rua getOnViewTapListener() {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            return viewOnTouchListenerC81187Vtf.LJZ;
        }
        return null;
    }

    public float getScale() {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            return viewOnTouchListenerC81187Vtf.LJFF();
        }
        return 0.0f;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC81191Vtj runnableC81191Vtj;
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null && (runnableC81191Vtj = viewOnTouchListenerC81187Vtf.LJLLLLLL) != null) {
            runnableC81191Vtj.LJLIL.LIZ.abortAnimation();
            viewOnTouchListenerC81187Vtf.LJLLLLLL = null;
        }
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        InterfaceC81194Vtm interfaceC81194Vtm;
        o.LJIIIZ(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 2) {
            boolean z = false;
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.LJLL) {
                    this.LJLL = false;
                    InterfaceC81194Vtm interfaceC81194Vtm2 = this.LJLJLLL;
                    if (interfaceC81194Vtm2 != null) {
                        interfaceC81194Vtm2.LIZ();
                    }
                }
            } else {
                if (event.getPointerCount() > 1) {
                    z = true;
                }
                this.LJLL = z;
            }
        } else if (this.LJLL && (interfaceC81194Vtm = this.LJLJLLL) != null) {
            interfaceC81194Vtm.LIZIZ();
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Matrix matrix;
        o.LJIIIZ(canvas, "canvas");
        int save = canvas.save();
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            matrix = viewOnTouchListenerC81187Vtf.LJLLJ;
        } else {
            matrix = null;
        }
        canvas.concat(matrix);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            viewOnTouchListenerC81187Vtf.LJLLI = z;
        }
    }

    public void setEnableScale(boolean z) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            viewOnTouchListenerC81187Vtf.LLD = z;
        }
    }

    public void setMaximumScale(float f) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf == null) {
            return;
        }
        ViewOnTouchListenerC81187Vtf.LIZJ(viewOnTouchListenerC81187Vtf.LJLJJI, viewOnTouchListenerC81187Vtf.LJLJJL, f);
        viewOnTouchListenerC81187Vtf.LJLJJLL = f;
    }

    public void setMediumScale(float f) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf == null) {
            return;
        }
        ViewOnTouchListenerC81187Vtf.LIZJ(viewOnTouchListenerC81187Vtf.LJLJJI, f, viewOnTouchListenerC81187Vtf.LJLJJLL);
        viewOnTouchListenerC81187Vtf.LJLJJL = f;
    }

    public void setMinimumScale(float f) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf == null) {
            return;
        }
        ViewOnTouchListenerC81187Vtf.LIZJ(f, viewOnTouchListenerC81187Vtf.LJLJJL, viewOnTouchListenerC81187Vtf.LJLJJLL);
        viewOnTouchListenerC81187Vtf.LJLJJI = f;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            if (onDoubleTapListener != null) {
                viewOnTouchListenerC81187Vtf.LJLJLLL.LIZIZ(onDoubleTapListener);
            } else {
                viewOnTouchListenerC81187Vtf.LJLJLLL.LIZIZ(new GestureDetectorOnDoubleTapListenerC81193Vtl(viewOnTouchListenerC81187Vtf));
            }
        }
    }

    public final void setOnPhotoTouchListener(InterfaceC81194Vtm interfaceC81194Vtm) {
        this.LJLJLLL = interfaceC81194Vtm;
    }

    public void setOnViewTapListener(InterfaceC71052Rua interfaceC71052Rua) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf == null) {
            return;
        }
        viewOnTouchListenerC81187Vtf.LJZ = interfaceC71052Rua;
    }

    public void setScale(float f) {
        VA9<V92> LJ;
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf == null || (LJ = viewOnTouchListenerC81187Vtf.LJ()) == null) {
            return;
        }
        viewOnTouchListenerC81187Vtf.LJII(f, LJ.getRight() / 2, LJ.getBottom() / 2, false);
    }

    public void setZoomTransitionDuration(long j) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJLJ;
        if (viewOnTouchListenerC81187Vtf != null) {
            if (j < 0) {
                j = 200;
            }
            viewOnTouchListenerC81187Vtf.LJLJL = j;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C81188Vtg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81188Vtg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJLJ = new ViewOnTouchListenerC81187Vtf(this);
    }
}
