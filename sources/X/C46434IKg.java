package X;

import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.IKg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46434IKg {
    public static final IMLCommonService LIZ;

    static {
        IMLCommonService iMLCommonService;
        Object LIZ2 = C58096Mr6.LIZ(IMLCommonService.class, false);
        if (LIZ2 != null) {
            iMLCommonService = (IMLCommonService) LIZ2;
        } else {
            if (C58096Mr6.O2 == null) {
                synchronized (IMLCommonService.class) {
                    if (C58096Mr6.O2 == null) {
                        C58096Mr6.O2 = new MLCommonServiceImpl();
                    }
                }
            }
            iMLCommonService = C58096Mr6.O2;
        }
        o.LJIIIIZZ(iMLCommonService, "get().getService(IMLCommonService::class.java)");
        LIZ = iMLCommonService;
    }
}
