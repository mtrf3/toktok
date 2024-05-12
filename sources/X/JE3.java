package X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public final class JE3 implements View.OnTouchListener {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ JE2 LJLILLLLZI;

    public JE3(JE2 je2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLILLLLZI = je2;
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Handler handler;
        Handler handler2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (view == null || view.getVisibility() != 0 || !view.isClickable()) {
            return false;
        }
        if (motionEvent != null) {
            Integer valueOf = Integer.valueOf(motionEvent.getActionMasked());
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    view.setAlpha(0.4f);
                    View view2 = this.LJLILLLLZI.LJLILLLLZI;
                    if (view2 != null && (handler2 = view2.getHandler()) != null) {
                        handler2.removeCallbacks(this.LJLILLLLZI.LJLLLL);
                    }
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    view.setAlpha(1.0f);
                    JE2 je2 = this.LJLILLLLZI;
                    View view3 = je2.LJLILLLLZI;
                    if (view3 != null && (handler = view3.getHandler()) != null) {
                        handler.removeCallbacks(je2.LJLLLL);
                        handler.postDelayed(je2.LJLLLL, 2000L);
                    }
                }
            }
            if (motionEvent != null && motionEvent.getActionMasked() == 1 && (interfaceC65784Pro = this.LJLIL) != null) {
                interfaceC65784Pro.invoke();
            }
        }
        return true;
    }
}
