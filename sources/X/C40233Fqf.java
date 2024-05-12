package X;

import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAuthPageMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40233Fqf extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40233Fqf LJLIL = new C40233Fqf();

    public C40233Fqf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new OpenAuthPageMethod(providerFactory);
    }
}
