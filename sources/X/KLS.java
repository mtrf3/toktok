package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class KLS extends W5G {
    public PhotoSearchBottomPanelViewModel LJLIL;
    public KLU LJLILLLLZI;

    public InterfaceC51550KLa getOnPhotoTapListener() {
        return null;
    }

    public InterfaceC51552KLc getOnViewTapListener() {
        return null;
    }

    public void setEnableScale(boolean z) {
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    public void setOnMatrixChangeListener(KLZ klz) {
    }

    public void setOnPhotoTapListener(InterfaceC51550KLa interfaceC51550KLa) {
    }

    public void setOnScaleChangeListener(InterfaceC51551KLb interfaceC51551KLb) {
    }

    public void setOnViewTapListener(InterfaceC51552KLc interfaceC51552KLc) {
    }

    public float getMaximumScale() {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            return klu.LJLJL;
        }
        return 0.0f;
    }

    public float getMediumScale() {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            return klu.LJLJJLL;
        }
        return 0.0f;
    }

    public float getMinimumScale() {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            return klu.LJLJJL;
        }
        return 0.0f;
    }

    public float getScale() {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            return klu.LJLJJI;
        }
        return 0.0f;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        KLU klu = this.LJLILLLLZI;
        if (klu == null || klu.LJFF() == null) {
            this.LJLILLLLZI = new KLU(this);
        }
        super.onAttachedToWindow();
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final KLU getAttacher() {
        return this.LJLILLLLZI;
    }

    public final PhotoSearchBottomPanelViewModel getBottomPanelViewModel() {
        return this.LJLIL;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int save = canvas.save();
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            canvas.concat(klu.LJLLL);
        }
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // X.VA9, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel;
        o.LJIIIZ(event, "event");
        PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel2 = this.LJLIL;
        if (photoSearchBottomPanelViewModel2 != null && (photoSearchBottomPanelViewModel2.LJLJI == 3 || photoSearchBottomPanelViewModel2.LJLJI == 4)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        if (event.getAction() == 0 && (photoSearchBottomPanelViewModel = this.LJLIL) != null && photoSearchBottomPanelViewModel.LJLJI == 5) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (photoSearchBottomPanelViewModel.gv0(context, event)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return super.onTouchEvent(event);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            klu.LJLLILLLL = z;
        }
    }

    public final void setBottomPanelViewModel(PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel) {
        this.LJLIL = photoSearchBottomPanelViewModel;
        KLU klu = this.LJLILLLLZI;
        if (klu == null) {
            return;
        }
        klu.LJZ = photoSearchBottomPanelViewModel;
    }

    public final void setCanDrag(boolean z) {
        KLU klu = this.LJLILLLLZI;
        if (klu == null) {
            return;
        }
        klu.LLD = z;
    }

    public void setMaximumScale(float f) {
        KLU klu = this.LJLILLLLZI;
        if (klu == null) {
            return;
        }
        KLU.LIZLLL(klu.LJLJJL, klu.LJLJJLL, f);
        klu.LJLJL = f;
    }

    public void setMediumScale(float f) {
        KLU klu = this.LJLILLLLZI;
        if (klu == null) {
            return;
        }
        KLU.LIZLLL(klu.LJLJJL, f, klu.LJLJL);
        klu.LJLJJLL = f;
    }

    public void setMinimumScale(float f) {
        KLU klu = this.LJLILLLLZI;
        if (klu == null) {
            return;
        }
        KLU.LIZLLL(f, klu.LJLJJLL, klu.LJLJL);
        klu.LJLJJL = f;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            klu.LJZI = onLongClickListener;
        }
    }

    public final void setOnViewDragListener(KLX klx) {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            klu.LJZL = klx;
        }
    }

    public void setScale(float f) {
        VA9<V92> LJFF;
        KLU klu = this.LJLILLLLZI;
        if (klu == null || (LJFF = klu.LJFF()) == null) {
            return;
        }
        float right = LJFF.getRight() / 2;
        float bottom = LJFF.getBottom() / 2;
        if (klu.LJFF() == null || f < klu.LJLJJL || f > klu.LJLJL) {
            return;
        }
        klu.LJLLL.setScale(f, f, right, bottom);
        klu.LIZIZ();
    }

    public void setZoomTransitionDuration(long j) {
        KLU klu = this.LJLILLLLZI;
        if (klu != null) {
            if (j < 0) {
                j = 200;
            }
            klu.LJLJLJ = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        KLU klu = this.LJLILLLLZI;
        if (klu == null || klu.LJFF() == null) {
            this.LJLILLLLZI = new KLU(this);
        }
    }
}
