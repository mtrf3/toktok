package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40228Fqa extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40228Fqa LJLIL = new C40228Fqa();

    public C40228Fqa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new LoadFeedsMethod(providerFactory);
    }
}
