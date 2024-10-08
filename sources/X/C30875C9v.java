package X;

import Y.IDTListenerS115S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C9v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30875C9v extends FrameLayout implements InterfaceC30182Bsw {
    public final List<View.OnTouchListener> LJLIL;
    public final List<View.OnTouchListener> LJLILLLLZI;
    public final List<View.OnTouchListener> LJLJI;
    public View.OnTouchListener LJLJJI;
    public C54 LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC30182Bsw
    public final void LJJLI() {
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLJI).clear();
    }

    @Override // X.InterfaceC30182Bsw
    public final void LJJJJLL(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        ((ArrayList) this.LJLJI).add(onTouchListener);
    }

    @Override // X.InterfaceC30182Bsw
    public final void LJJJLL(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        ((ArrayList) this.LJLILLLLZI).add(onTouchListener);
    }

    @Override // X.InterfaceC30182Bsw
    public final void LJJLIIIJLLLLLLLZ(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5) {
        if (iDTListenerS115S0100000_5 != null && ((ArrayList) this.LJLJI).contains(iDTListenerS115S0100000_5)) {
            ((ArrayList) this.LJLJI).remove(iDTListenerS115S0100000_5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int size = ((ArrayList) this.LJLIL).size() - 1; size >= 0; size--) {
            ((View.OnTouchListener) ListProtector.get(this.LJLIL, size)).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        for (int size = ((ArrayList) this.LJLJI).size() - 1; size >= 0; size--) {
            View.OnTouchListener onTouchListener = (View.OnTouchListener) ListProtector.get(this.LJLJI, size);
            if (motionEvent.getAction() == 2) {
                View.OnTouchListener onTouchListener2 = this.LJLJJI;
                if (onTouchListener2 != null) {
                    onTouchListener2.onTouch(this, motionEvent);
                    return true;
                }
                if (onTouchListener.onTouch(this, motionEvent)) {
                    this.LJLJJI = (View.OnTouchListener) ListProtector.get(this.LJLJI, size);
                    return true;
                }
            } else {
                this.LJLJJI = null;
            }
            onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        for (int size = ((ArrayList) this.LJLILLLLZI).size() - 1; size >= 0; size--) {
            View.OnTouchListener onTouchListener = (View.OnTouchListener) ListProtector.get(this.LJLILLLLZI, size);
            if (motionEvent.getAction() == 2) {
                View.OnTouchListener onTouchListener2 = this.LJLJJI;
                if (onTouchListener2 != null) {
                    onTouchListener2.onTouch(this, motionEvent);
                    return true;
                }
                if (onTouchListener.onTouch(this, motionEvent)) {
                    this.LJLJJI = (View.OnTouchListener) ListProtector.get(this.LJLILLLLZI, size);
                    return true;
                }
            } else {
                this.LJLJJI = null;
            }
            onTouchListener.onTouch(this, motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC30182Bsw
    public void setInterceptTouchEvent(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC30182Bsw
    public void setOnSizeChangedListener(C54 c54) {
        this.LJLJJL = c54;
    }

    public C30875C9v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJLL = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C54 c54 = this.LJLJJL;
        if (c54 != null) {
            c54.LIZ(i2, i4);
        }
    }
}
