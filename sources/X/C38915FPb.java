package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.FPb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38915FPb extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C38915FPb INSTANCE = new C38915FPb();

    public C38915FPb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        return C16880lQ.LLLLZI(1, new ThreadFactoryC38895FOh());
    }
}
