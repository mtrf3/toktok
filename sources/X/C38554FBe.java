package X;

import com.ss.android.ugc.aweme.ml.api.SmartCDNRankService;
import com.ss.android.ugc.aweme.ml.impl.SmartCDNRankServiceImpl;

/* renamed from: X.FBe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38554FBe extends AbstractC65781Prl implements InterfaceC65784Pro<SmartCDNRankService> {
    public static final C38554FBe LJLIL = new C38554FBe();

    public C38554FBe() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ml.api.SmartCDNRankService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SmartCDNRankService invoke() {
        ?? LIZ = C58096Mr6.LIZ(SmartCDNRankService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.T2 == null) {
            synchronized (SmartCDNRankService.class) {
                if (C58096Mr6.T2 == null) {
                    C58096Mr6.T2 = new SmartCDNRankServiceImpl();
                }
            }
        }
        return C58096Mr6.T2;
    }
}
