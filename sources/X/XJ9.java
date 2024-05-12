package X;

import android.os.Looper;
import android.os.MessageQueue;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XJ9 {
    public static final Object LIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        MessageQueue myQueue = Looper.myQueue();
        o.LJIIIIZZ(myQueue, "myQueue()");
        XJA xja = new XJA(xks);
        xks.LJIILIIL(new AqS146S0200000_15(myQueue, xja, 20));
        C16880lQ.LJLI(myQueue, xja);
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }
}
