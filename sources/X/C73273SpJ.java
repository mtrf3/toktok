package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.SpJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73273SpJ extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C73273SpJ LJLIL = new C73273SpJ();

    public C73273SpJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        ExecutorC73290Spa.LJLJJL.getClass();
        ?? value = ExecutorC73290Spa.LJLJJI.getValue();
        o.LJFF(value, "SerialExecutor.UNBOUND_EXECUTOR");
        return value;
    }
}
