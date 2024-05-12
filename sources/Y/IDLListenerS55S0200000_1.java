package Y;

import X.InterfaceC88472Yns;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDLListenerS55S0200000_1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS55S0200000_1 iDLListenerS55S0200000_1) {
        if (((View) iDLListenerS55S0200000_1.l0).getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        ((View) iDLListenerS55S0200000_1.l1).getLocationOnScreen(iArr);
        int i = iArr[1];
        ((View) iDLListenerS55S0200000_1.l0).getLocationOnScreen(iArr);
        int i2 = i - iArr[1];
        if (((View) iDLListenerS55S0200000_1.l0).getHeight() != i2) {
            View mentionPanelContainer = (View) iDLListenerS55S0200000_1.l0;
            o.LJIIIIZZ(mentionPanelContainer, "mentionPanelContainer");
            ViewGroup.LayoutParams layoutParams = mentionPanelContainer.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = i2;
                mentionPanelContainer.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS55S0200000_1 iDLListenerS55S0200000_1) {
        if (((View) iDLListenerS55S0200000_1.l0).getGlobalVisibleRect(new Rect())) {
            ((InterfaceC88472Yns) iDLListenerS55S0200000_1.l1).invoke((View) iDLListenerS55S0200000_1.l0);
            ((View) iDLListenerS55S0200000_1.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS55S0200000_1);
        }
    }

    public IDLListenerS55S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
