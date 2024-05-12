package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ew1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38017Ew1 extends AbstractC65781Prl implements InterfaceC65784Pro<C38018Ew2> {
    public static final C38017Ew1 LJLIL = new C38017Ew1();

    public C38017Ew1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C38018Ew2 invoke() {
        C38018Ew2 c38018Ew2 = new C38018Ew2(30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38022Ew6("assem-serial-t", 0));
        c38018Ew2.allowCoreThreadTimeOut(true);
        return c38018Ew2;
    }
}
