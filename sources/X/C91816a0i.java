package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* renamed from: X.a0i, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C91816a0i extends ScrollView {
    public InterfaceC91815a0h LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnScrollListener(InterfaceC91815a0h interfaceC91815a0h) {
        this.LJLIL = interfaceC91815a0h;
    }

    public C91816a0i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC91815a0h interfaceC91815a0h = this.LJLIL;
        if (interfaceC91815a0h != null) {
            interfaceC91815a0h.LIZ(i2);
        }
    }
}
