package X;

import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import com.ss.android.ugc.aweme.ml.ohr.SmartOHRServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J5f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48591J5f {
    public static final SmartOHRService LIZ;
    public static final FQH LIZIZ;

    static {
        SmartOHRService smartOHRService;
        Object LIZ2 = C58096Mr6.LIZ(SmartOHRService.class, false);
        if (LIZ2 != null) {
            smartOHRService = (SmartOHRService) LIZ2;
        } else {
            if (C58096Mr6.f3 == null) {
                synchronized (SmartOHRService.class) {
                    if (C58096Mr6.f3 == null) {
                        C58096Mr6.f3 = new SmartOHRServiceImpl();
                    }
                }
            }
            smartOHRService = C58096Mr6.f3;
        }
        o.LJIIIIZZ(smartOHRService, "get().getService(SmartOHRService::class.java)");
        LIZ = smartOHRService;
        LIZIZ = (FQH) smartOHRService;
    }
}
