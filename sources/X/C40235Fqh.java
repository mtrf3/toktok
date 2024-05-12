package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40235Fqh extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40235Fqh LJLIL = new C40235Fqh();

    public C40235Fqh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new UserInfoMethod(providerFactory);
    }
}
