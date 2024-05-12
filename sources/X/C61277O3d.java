package X;

import com.ss.android.ugc.aweme.service.LingoCaptionService;
import com.ss.android.ugc.aweme.service.LingoCaptionServiceImpl;
import defpackage.e1;

/* renamed from: X.O3d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61277O3d extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C61277O3d LJLIL = new C61277O3d();

    public C61277O3d() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        LingoCaptionService lingoCaptionService;
        Object LIZ = C58096Mr6.LIZ(LingoCaptionService.class, false);
        if (LIZ != null) {
            lingoCaptionService = (LingoCaptionService) LIZ;
        } else {
            if (C58096Mr6.W4 == null) {
                synchronized (LingoCaptionService.class) {
                    if (C58096Mr6.W4 == null) {
                        C58096Mr6.W4 = new LingoCaptionServiceImpl();
                    }
                }
            }
            lingoCaptionService = C58096Mr6.W4;
        }
        int LIZ2 = lingoCaptionService.LIZ();
        if (!e1.LIZ(31744, "lingo_gecko_low_storage_enable", true, false)) {
            return Boolean.TRUE;
        }
        if (LIZ2 > 0 && C61588OFc.LIZIZ() >= LIZ2) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(lingoCaptionService.LIZIZ());
    }
}
