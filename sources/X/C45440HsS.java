package X;

import Y.IDxS131S0200000_7;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.HsS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45440HsS {
    public InterfaceC92693kP LIZ;

    public final void LIZ() {
        InterfaceC92693kP interfaceC92693kP = this.LIZ;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            InterfaceC92693kP interfaceC92693kP2 = this.LIZ;
            if (interfaceC92693kP2 != null) {
                interfaceC92693kP2.dispose();
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    public final void LIZIZ(long j, InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns) {
        AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LIZ(new IDxS131S0200000_7(this, interfaceC88472Yns, 1));
    }
}
