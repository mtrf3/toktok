package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.OaA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62142OaA extends FrameLayout {
    public GestureDetector LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    public void setOnSwipeListener(InterfaceC62144OaC interfaceC62144OaC) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.LJLJJI = false;
            }
            if (this.LJLJJI && this.LJLJI) {
                z = true;
            }
            if (this.LJLILLLLZI && (gestureDetector = this.LJLIL) != null && !z && gestureDetector.onTouchEvent(motionEvent)) {
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.LJLJJI = z;
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.LJLJI = z;
    }

    public void setSwipeEnabled(boolean z) {
        this.LJLILLLLZI = z;
    }

    public C62142OaA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = true;
        C62143OaB c62143OaB = new C62143OaB(this);
        KL2.LIZJ(context, 45.0f);
        KL2.LIZJ(context, 65.0f);
        GestureDetector gestureDetector = new GestureDetector(C16880lQ.LLLLL(context), c62143OaB);
        this.LJLIL = gestureDetector;
        gestureDetector.setOnDoubleTapListener(null);
        this.LJLIL.setIsLongpressEnabled(false);
    }
}
