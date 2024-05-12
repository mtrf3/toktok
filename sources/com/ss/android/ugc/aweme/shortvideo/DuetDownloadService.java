package com.ss.android.ugc.aweme.shortvideo;

import X.ActivityC45651qj;
import X.C44066HRe;
import X.C58096Mr6;
import android.app.Activity;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetDownloadService implements IDuetDownloadService {
    public static IDuetDownloadService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IDuetDownloadService.class, false);
        if (LIZ != null) {
            return (IDuetDownloadService) LIZ;
        }
        if (C58096Mr6.U6 == null) {
            synchronized (IDuetDownloadService.class) {
                if (C58096Mr6.U6 == null) {
                    C58096Mr6.U6 = new DuetDownloadService();
                }
            }
        }
        return C58096Mr6.U6;
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LIZIZ(Activity context, DuetAndStitchRouterConfig duetAndStitchRouterConfig) {
        boolean z;
        o.LJIIIZ(context, "context");
        C44066HRe c44066HRe = new C44066HRe();
        String str = duetAndStitchRouterConfig.type;
        boolean z2 = true;
        if (str != null && str.equals("use_duet")) {
            z = true;
        } else {
            z = false;
        }
        c44066HRe.LJIJJLI = z;
        String str2 = duetAndStitchRouterConfig.enterMethod;
        if (str2 == null || !str2.equals("duet_and_stitch_jsb")) {
            z2 = false;
        }
        c44066HRe.LJIL = z2;
        c44066HRe.LJIJJ = duetAndStitchRouterConfig.copy(duetAndStitchRouterConfig.type, duetAndStitchRouterConfig.awemeId, duetAndStitchRouterConfig.anchors, duetAndStitchRouterConfig.enterFrom, "", duetAndStitchRouterConfig.isEcommerce);
        c44066HRe.LIZJ(context, duetAndStitchRouterConfig.awemeId, duetAndStitchRouterConfig.enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LIZ(String str, ActivityC45651qj activityC45651qj, Map map) {
        C44066HRe c44066HRe = new C44066HRe();
        c44066HRe.LIZJ = map;
        c44066HRe.LIZJ(activityC45651qj, str, "duet_page");
    }
}
