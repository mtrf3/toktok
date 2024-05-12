package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.FLp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38825FLp extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C38825FLp LJLIL = new C38825FLp();

    public C38825FLp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
        return LIZLLL;
    }
}
