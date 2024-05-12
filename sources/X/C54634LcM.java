package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.LcM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54634LcM extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public long LJLJI;
    public InterfaceC54635LcN LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54634LcM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        super.onInterceptTouchEvent(ev);
        if (!L7K.LIZJ) {
            return false;
        }
        int action = ev.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = ev.getX() - this.LJLIL;
                    float y = ev.getY() - this.LJLILLLLZI;
                    if (Math.abs(y) > C7MY.LIZIZ(8) && Math.abs(y) > Math.abs(x)) {
                        if (y < 0.0f) {
                            InterfaceC54635LcN interfaceC54635LcN = this.LJLJJI;
                            if (interfaceC54635LcN == null || !interfaceC54635LcN.LIZ()) {
                                return false;
                            }
                            InterfaceC54635LcN interfaceC54635LcN2 = this.LJLJJI;
                            if (interfaceC54635LcN2 != null) {
                                interfaceC54635LcN2.LIZLLL();
                            }
                            return true;
                        }
                        InterfaceC54635LcN interfaceC54635LcN3 = this.LJLJJI;
                        if (interfaceC54635LcN3 == null || !interfaceC54635LcN3.LJ()) {
                            return false;
                        }
                        InterfaceC54635LcN interfaceC54635LcN4 = this.LJLJJI;
                        if (interfaceC54635LcN4 != null) {
                            interfaceC54635LcN4.LIZIZ();
                        }
                        return true;
                    }
                    if (System.currentTimeMillis() - this.LJLJI > ViewConfiguration.getDoubleTapTimeout()) {
                        InterfaceC54635LcN interfaceC54635LcN5 = this.LJLJJI;
                        if (interfaceC54635LcN5 != null) {
                            interfaceC54635LcN5.LIZJ();
                        }
                        return true;
                    }
                }
            } else {
                InterfaceC54635LcN interfaceC54635LcN6 = this.LJLJJI;
                if (interfaceC54635LcN6 != null && interfaceC54635LcN6.LIZ()) {
                    float x2 = ev.getX() - this.LJLIL;
                    float y2 = ev.getY() - this.LJLILLLLZI;
                    if (Math.abs(x2) < C7MY.LIZIZ(8) && Math.abs(y2) < C7MY.LIZIZ(8)) {
                        InterfaceC54635LcN interfaceC54635LcN7 = this.LJLJJI;
                        if (interfaceC54635LcN7 != null) {
                            interfaceC54635LcN7.LIZJ();
                        }
                        return true;
                    }
                }
            }
        } else {
            this.LJLIL = ev.getX();
            this.LJLILLLLZI = ev.getY();
            this.LJLJI = System.currentTimeMillis();
        }
        return false;
    }

    public final void setListener(InterfaceC54635LcN listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54634LcM(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54634LcM.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
