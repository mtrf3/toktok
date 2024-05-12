package X;

import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LQ5 extends FutureTask<InterfaceC55235Lm3> {
    public final String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LQ5(Object host, String str) {
        super(new CallableC55231Llz(host, str));
        o.LJIIIZ(host, "host");
        this.LJLIL = str;
    }
}
