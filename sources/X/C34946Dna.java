package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType;

/* renamed from: X.Dna, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34946Dna extends AbstractC65781Prl implements InterfaceC65784Pro<GeckoExperimentsType> {
    public static final C34946Dna LJLIL = new C34946Dna();

    public C34946Dna() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final GeckoExperimentsType invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        GeckoExperimentsType geckoExperimentsType = C34945DnZ.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "gecko_experiments", 31744, GeckoExperimentsType.class, geckoExperimentsType);
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).isGeckoExperienceOptClose()) {
            return null;
        }
        return LJIJ;
    }
}
