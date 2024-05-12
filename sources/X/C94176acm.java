package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.acm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94176acm extends ConstraintLayout {
    public InterfaceC93639aU7 LJLIL;
    public InterfaceC93640aU8 LJLILLLLZI;
    public float LJLJI;
    public final int LJLJJI;

    public final InterfaceC93639aU7 getOnDispatchTouchListener() {
        return this.LJLIL;
    }

    public final InterfaceC93640aU8 getOnSlideBackListener() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        InterfaceC93639aU7 interfaceC93639aU7 = this.LJLIL;
        if (interfaceC93639aU7 != null && !interfaceC93639aU7.LIZ(ev)) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        InterfaceC93640aU8 interfaceC93640aU8;
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && this.LJLJI - event.getX() > this.LJLJJI && (interfaceC93640aU8 = this.LJLILLLLZI) != null) {
                interfaceC93640aU8.LIZ();
            }
        } else {
            this.LJLJI = event.getX();
        }
        return true;
    }

    public final void setOnDispatchTouchListener(InterfaceC93639aU7 interfaceC93639aU7) {
        this.LJLIL = interfaceC93639aU7;
    }

    public final void setOnSlideBackListener(InterfaceC93640aU8 interfaceC93640aU8) {
        this.LJLILLLLZI = interfaceC93640aU8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94176acm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
        this.LJLJJI = viewConfiguration.getScaledTouchSlop();
        setMotionEventSplittingEnabled(false);
    }
}
