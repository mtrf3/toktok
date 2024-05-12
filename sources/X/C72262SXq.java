package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.SXq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72262SXq extends FrameLayout {
    public boolean LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public InterfaceC72263SXr LJLJJI;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        InterfaceC72263SXr interfaceC72263SXr;
        InterfaceC72263SXr interfaceC72263SXr2 = this.LJLJJI;
        if (interfaceC72263SXr2 == null || !interfaceC72263SXr2.LIZIZ()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LJLJI = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                this.LJLILLLLZI = motionEvent.getX();
                motionEvent.getY();
                this.LJLIL = false;
                InterfaceC72263SXr interfaceC72263SXr3 = this.LJLJJI;
                if (interfaceC72263SXr3 != null) {
                    interfaceC72263SXr3.LIZJ();
                }
            } else if (valueOf.intValue() == 2) {
                if (C47959Irz.LIZ(motionEvent, this.LJLILLLLZI) >= this.LJLJI) {
                    this.LJLIL = false;
                }
            } else if (valueOf.intValue() == 1) {
                this.LJLIL = true;
                if (C47959Irz.LIZ(motionEvent, this.LJLILLLLZI) < this.LJLJI && (interfaceC72263SXr = this.LJLJJI) != null) {
                    interfaceC72263SXr.LIZLLL();
                }
                InterfaceC72263SXr interfaceC72263SXr4 = this.LJLJJI;
                if (interfaceC72263SXr4 != null) {
                    interfaceC72263SXr4.LIZ();
                }
            }
        }
        return this.LJLIL;
    }

    public final void setListener(InterfaceC72263SXr iAvailableShopClick) {
        o.LJIIIZ(iAvailableShopClick, "iAvailableShopClick");
        this.LJLJJI = iAvailableShopClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72262SXq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = 80;
    }
}
