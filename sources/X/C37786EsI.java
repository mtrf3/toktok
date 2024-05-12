package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.EsI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37786EsI extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C37786EsI LJLIL = new C37786EsI();

    public C37786EsI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new LoadFeedsFlowMethod(providerFactory);
    }
}
