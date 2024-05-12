package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import kotlin.jvm.internal.o;

/* renamed from: X.EsH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37785EsH extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C37785EsH LJLIL = new C37785EsH();

    public C37785EsH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new SendLogV3Method(providerFactory);
    }
}
