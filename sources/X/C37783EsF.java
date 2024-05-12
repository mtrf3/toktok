package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.EsF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37783EsF extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C37783EsF LJLIL = new C37783EsF();

    public C37783EsF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new AppInfoMethod(providerFactory);
    }
}
