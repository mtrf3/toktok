package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTO extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final HTO LJLIL = new HTO();

    public HTO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        Looper looper = IH6.LIZ.getLooper();
        o.LJIIIIZZ(looper, "thread.looper");
        return new Handler(looper);
    }
}
