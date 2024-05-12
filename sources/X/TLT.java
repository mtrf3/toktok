package X;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TLT implements MessageQueue.IdleHandler {
    public final /* synthetic */ TLS LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        TLS tls = this.LJLIL;
        if (tls.LJI) {
            return false;
        }
        Context context = tls.LJJII.getContext();
        o.LJIIIIZZ(context, "root.context");
        OSZ LIZ = TLA.LIZ(context);
        Object first = LIZ.getFirst();
        Object second = LIZ.getSecond();
        ((ArrayList) TLA.LIZ).add(new OSZ(first, second));
        TLS tls2 = this.LJLIL;
        int i = this.LJLILLLLZI + 1;
        int i2 = this.LJLJI;
        tls2.getClass();
        if (i < i2) {
            C16880lQ.LJLI(Looper.myQueue(), new TLT(tls2, i, i2));
        }
        return false;
    }

    public TLT(TLS tls, int i, int i2) {
        this.LJLIL = tls;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
