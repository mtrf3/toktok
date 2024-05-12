package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40230Fqc extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40230Fqc LJLIL = new C40230Fqc();

    public C40230Fqc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new CloseMethod(providerFactory);
    }
}
