package X;

import com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService;
import com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Lq0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55480Lq0 implements IFIPerformanceService {
    public static final C55480Lq0 LIZIZ = new C55480Lq0();
    public final /* synthetic */ IFIPerformanceService LIZ;

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZ(int i, boolean z) {
        this.LIZ.LIZ(i, z);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZIZ(int i) {
        this.LIZ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZJ(int i, String str, Object value) {
        o.LJIIIZ(value, "value");
        this.LIZ.LIZJ(i, str, value);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZLLL(int i, int i2) {
        this.LIZ.LIZLLL(i, i2);
    }

    public C55480Lq0() {
        IFIPerformanceService iFIPerformanceService;
        Object LIZ = C58096Mr6.LIZ(IFIPerformanceService.class, false);
        if (LIZ != null) {
            iFIPerformanceService = (IFIPerformanceService) LIZ;
        } else {
            if (C58096Mr6.O8 == null) {
                synchronized (IFIPerformanceService.class) {
                    if (C58096Mr6.O8 == null) {
                        C58096Mr6.O8 = new PerformanceServiceImpl();
                    }
                }
            }
            iFIPerformanceService = C58096Mr6.O8;
        }
        this.LIZ = iFIPerformanceService;
    }
}
