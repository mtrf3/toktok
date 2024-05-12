package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class JWB extends AbstractC65781Prl implements InterfaceC65784Pro<ConcurrentHashMap<String, AtomicInteger>> {
    public static final JWB LJLIL = new JWB();

    public JWB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ConcurrentHashMap<String, AtomicInteger> invoke() {
        return new ConcurrentHashMap<>();
    }
}
