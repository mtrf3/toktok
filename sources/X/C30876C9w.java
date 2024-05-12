package X;

import Y.IDTListenerS115S0100000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveDrawOptSetting;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C9w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30876C9w extends LayeredConstraintLayout implements InterfaceC30182Bsw {
    public final List<View.OnTouchListener> LJLIL;
    public final List<View.OnTouchListener> LJLILLLLZI;
    public final List<View.OnTouchListener> LJLJI;
    public View.OnTouchListener LJLJJI;
    public C54 LJLJJL;
    public boolean LJLJJLL;
    public final boolean LJLJL;

    @Override // X.InterfaceC30182Bsw
    public final void LJJLI() {
        this.LJLILLLLZI.clear();
        this.LJLIL.clear();
        this.LJLJI.clear();
    }

    public C30876C9w(Context context) {
        super(context);
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJLL = false;
        this.LJLJL = LiveDrawOptSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC30182Bsw
    public final void LJJJJLL(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        this.LJLJI.add(onTouchListener);
    }

    @Override // X.InterfaceC30182Bsw
    public final void LJJJLL(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        this.LJLILLLLZI.add(onTouchListener);
    }

    @Override // X.InterfaceC30182Bsw
    public final void LJJLIIIJLLLLLLLZ(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5) {
        if (iDTListenerS115S0100000_5 != null && ((ArrayList) this.LJLJI).contains(iDTListenerS115S0100000_5)) {
            ((ArrayList) this.LJLJI).remove(iDTListenerS115S0100000_5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int size = this.LJLIL.size() - 1; size >= 0; size--) {
            ((View.OnTouchListener) ListProtector.get(this.LJLIL, size)).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        for (int size = this.LJLJI.size() - 1; size >= 0; size--) {
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
        for (int size = this.LJLILLLLZI.size() - 1; size >= 0; size--) {
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

    public C30876C9w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJLL = false;
        this.LJLJL = LiveDrawOptSetting.INSTANCE.getValue();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.LJLJL && ((view instanceof CVQ) || (view instanceof CVM) || (view instanceof C74296TDw) || (view instanceof C31808Ce4))) {
            return false;
        }
        return super.drawChild(canvas, view, j);
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
