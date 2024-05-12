package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.1wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49451wr extends AbstractC65781Prl implements InterfaceC65784Pro<ThreadFactory> {
    public static final C49451wr LJLIL = new C49451wr();

    public C49451wr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ThreadFactory invoke() {
        return Executors.defaultThreadFactory();
    }
}
