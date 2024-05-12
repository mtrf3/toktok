package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import defpackage.a1;

/* renamed from: X.Xw5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86433Xw5 extends ProgressBar {
    public InterfaceC86436Xw8 LJLIL;
    public InterfaceC86439XwB LJLILLLLZI;
    public InterfaceC86437Xw9 LJLJI;

    public final InterfaceC86437Xw9 getClickListener() {
        return this.LJLJI;
    }

    public final InterfaceC86436Xw8 getListener() {
        return this.LJLIL;
    }

    public final InterfaceC86439XwB getStatusView() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        Integer mo47getStatus;
        Integer mo47getStatus2;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                InterfaceC86439XwB interfaceC86439XwB = this.LJLILLLLZI;
                if (interfaceC86439XwB == null || (mo47getStatus2 = interfaceC86439XwB.mo47getStatus()) == null || mo47getStatus2.intValue() != 0) {
                    InterfaceC86436Xw8 interfaceC86436Xw8 = this.LJLIL;
                    if (interfaceC86436Xw8 != null) {
                        interfaceC86436Xw8.LIZJ();
                    }
                    return false;
                }
            } else if (valueOf.intValue() == 1) {
                InterfaceC86439XwB interfaceC86439XwB2 = this.LJLILLLLZI;
                if (interfaceC86439XwB2 == null || (mo47getStatus = interfaceC86439XwB2.mo47getStatus()) == null || mo47getStatus.intValue() != 0) {
                    return false;
                }
                InterfaceC86436Xw8 interfaceC86436Xw82 = this.LJLIL;
                if (interfaceC86436Xw82 != null) {
                    interfaceC86436Xw82.LIZJ();
                }
                InterfaceC86437Xw9 interfaceC86437Xw9 = this.LJLJI;
                if (interfaceC86437Xw9 != null) {
                    interfaceC86437Xw9.LIZJ(getId());
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setClickListener(InterfaceC86437Xw9 interfaceC86437Xw9) {
        this.LJLJI = interfaceC86437Xw9;
    }

    public final void setListener(InterfaceC86436Xw8 interfaceC86436Xw8) {
        this.LJLIL = interfaceC86436Xw8;
    }

    public final void setStatusView(InterfaceC86439XwB interfaceC86439XwB) {
        this.LJLILLLLZI = interfaceC86439XwB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86433Xw5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        setOnClickListener(new ViewOnClickListenerC13880ga(ViewOnClickListenerC86441XwD.LJLIL));
    }
}
