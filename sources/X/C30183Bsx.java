package X;

import Y.IDTListenerS115S0100000_5;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Bsx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30183Bsx extends AbstractC32821Qo {
    public final InterfaceC30182Bsw LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC88472Yns<MotionEvent, Boolean> LJLJI;
    public final IDTListenerS115S0100000_5 LJLJJI = new IDTListenerS115S0100000_5(this, 14);

    @Override // X.AbstractC32821Qo
    public final void LIZIZ() {
        InterfaceC30182Bsw interfaceC30182Bsw = this.LJLIL;
        if (interfaceC30182Bsw != null) {
            interfaceC30182Bsw.LJJJJLL(this.LJLJJI);
        }
    }

    @Override // X.AbstractC32821Qo
    public final void LIZJ() {
        InterfaceC30182Bsw interfaceC30182Bsw = this.LJLIL;
        if (interfaceC30182Bsw != null) {
            interfaceC30182Bsw.LJJLIIIJLLLLLLLZ(this.LJLJJI);
        }
    }

    @Override // X.AbstractC32821Qo
    public final int LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC32821Qo
    public final boolean LIZLLL(MotionEvent event, C32811Qn c32811Qn) {
        o.LJIIIZ(event, "event");
        Boolean invoke = this.LJLJI.invoke(event);
        if (invoke != null) {
            return invoke.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30183Bsx(InterfaceC30182Bsw interfaceC30182Bsw, int i, InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        this.LJLIL = interfaceC30182Bsw;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC88472Yns;
    }
}
