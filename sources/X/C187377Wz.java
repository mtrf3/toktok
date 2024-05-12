package X;

import com.ss.android.ugc.aweme.nows.feed.caption.NowCaptionService;
import com.ss.android.ugc.aweme.service.INowCaptionService;

/* renamed from: X.7Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187377Wz implements INowCaptionService {
    public static final C187377Wz LIZIZ = new C187377Wz();
    public final /* synthetic */ INowCaptionService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowCaptionService
    public final boolean LIZ(int i) {
        return this.LIZ.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.service.INowCaptionService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C187377Wz() {
        INowCaptionService iNowCaptionService;
        Object LIZ = C58096Mr6.LIZ(INowCaptionService.class, false);
        if (LIZ != null) {
            iNowCaptionService = (INowCaptionService) LIZ;
        } else {
            if (C58096Mr6.x3 == null) {
                synchronized (INowCaptionService.class) {
                    if (C58096Mr6.x3 == null) {
                        C58096Mr6.x3 = new NowCaptionService();
                    }
                }
            }
            iNowCaptionService = C58096Mr6.x3;
        }
        this.LIZ = iNowCaptionService;
    }
}
