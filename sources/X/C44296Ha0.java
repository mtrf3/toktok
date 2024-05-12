package X;

import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.app.services.RegionService;

/* renamed from: X.Ha0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44296Ha0 implements InterfaceC43725HEb {
    public static final String LIZ() {
        IRegionService LIZ = RegionService.LIZ();
        if (LIZ != null) {
            return LIZ.getRegion();
        }
        return "";
    }

    public static final Boolean LIZIZ() {
        return Boolean.valueOf(C85990Xow.LJIIIZ());
    }
}
