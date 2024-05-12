package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.EXb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36575EXb extends AbstractC65781Prl implements InterfaceC65784Pro<Thread> {
    public static final C36575EXb INSTANCE = new C36575EXb();

    public C36575EXb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Thread invoke() {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        return LLJJJJ.getThread();
    }
}
