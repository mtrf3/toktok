package X;

import com.ss.android.ugc.aweme.bullet.bridge.ad.LoadGeckoResourcesMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40231Fqd extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40231Fqd LJLIL = new C40231Fqd();

    public C40231Fqd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new LoadGeckoResourcesMethod(providerFactory);
    }
}