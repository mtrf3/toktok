package X;

import com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40232Fqe extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40232Fqe LJLIL = new C40232Fqe();

    public C40232Fqe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new ShareOpenPlatformMethod(providerFactory);
    }
}