package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Spb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73291Spb extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C73291Spb INSTANCE = new C73291Spb();

    public C73291Spb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C73274SpK c73274SpK = ExecutorC73290Spa.LJLJJL;
        c73274SpK.getClass();
        c73274SpK.getClass();
        return C16880lQ.LLLLZI((Runtime.getRuntime().availableProcessors() * 2) + 1, new ThreadFactoryC38896FOi());
    }
}
