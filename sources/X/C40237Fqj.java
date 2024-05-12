package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40237Fqj extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40237Fqj LJLIL = new C40237Fqj();

    public C40237Fqj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new MonitorLogMethod(providerFactory);
    }
}
