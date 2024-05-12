package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.1NS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NS<STATE> extends C08610Vl<STATE> {
    public C1NS(STATE state) {
        super(state);
    }

    public final void LJ(InterfaceC88472Yns<? super STATE, ? extends STATE> block) {
        o.LJIIIZ(block, "block");
        LJFF(block, true);
    }

    @Override // X.C08610Vl
    public final void LIZLLL(InterfaceC88472Yns block, boolean z) {
        o.LJIIIZ(block, "block");
        super.LIZLLL(block, z);
    }

    public final void LJFF(InterfaceC88472Yns block, boolean z) {
        o.LJIIIZ(block, "block");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && !this.LIZIZ) {
            this.LJ = (STATE) block.invoke(this.LJ);
            LIZJ(z);
        } else {
            LIZLLL(block, z);
        }
    }
}
