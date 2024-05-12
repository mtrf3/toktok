package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.ClT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32267ClT extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C32267ClT LJLIL = new C32267ClT();

    public C32267ClT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        AtomicInteger atomicInteger = C32268ClU.LIZ;
        int i = atomicInteger.get();
        atomicInteger.set(0);
        return Integer.valueOf(i);
    }
}
