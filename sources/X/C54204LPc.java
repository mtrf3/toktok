package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LPc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54204LPc extends C54206LPe {
    public float LLLFFI;
    public float LLLFZ;
    public final List<InterfaceC54205LPd> LLLI;
    public final List<InterfaceC54203LPb> LLLII;
    public final C62822Ol8 LLLIIII;

    private final int getTouchSlopDistance() {
        return ((Number) this.LLLIIII.getValue()).intValue();
    }

    public final List<InterfaceC54203LPb> getOnActionDownListeners() {
        return this.LLLII;
    }

    public final List<InterfaceC54205LPd> getOnInterceptTouchEventListeners() {
        return this.LLLI;
    }

    @Override // X.C54206LPe, X.C80769Vmv, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator it = ((ArrayList) this.LLLI).iterator();
        while (it.hasNext()) {
            ((InterfaceC54205LPd) it.next()).dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C54206LPe, X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        boolean z;
        o.LJIIIZ(event, "event");
        float x = event.getX();
        float y = event.getY();
        int action = event.getAction();
        if (action != 0) {
            if (action == 2) {
                boolean z2 = false;
                if (Math.abs(this.LLLFFI - x) > getTouchSlopDistance()) {
                    z = true;
                } else {
                    z = false;
                }
                Iterator it = ((ArrayList) this.LLLI).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((InterfaceC54205LPd) it.next()).LLIILII(event, this.LLLFFI, this.LLLFZ)) {
                        z2 = true;
                        break;
                    }
                }
                if (z && z2) {
                    return true;
                }
            }
        } else {
            this.LLLFFI = x;
            this.LLLFZ = y;
            Iterator it2 = ((ArrayList) this.LLLII).iterator();
            while (it2.hasNext()) {
                ((InterfaceC54203LPb) it2.next()).LLZIL(this.LLLFFI, this.LLLFZ);
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54204LPc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLLI = new ArrayList();
        this.LLLII = new ArrayList();
        this.LLLIIII = C221108m2.LIZIZ(new AqS159S0100000_9(context, 693));
    }
}
