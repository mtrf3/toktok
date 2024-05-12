package X;

import com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.ItV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48053ItV {
    public static final ISmartFeedAdUIService LIZ;

    static {
        ISmartFeedAdUIService iSmartFeedAdUIService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartFeedAdUIService.class, false);
        if (LIZ2 != null) {
            iSmartFeedAdUIService = (ISmartFeedAdUIService) LIZ2;
        } else {
            if (C58096Mr6.U2 == null) {
                synchronized (ISmartFeedAdUIService.class) {
                    if (C58096Mr6.U2 == null) {
                        C58096Mr6.U2 = new SmartFeedAdUIServiceImpl();
                    }
                }
            }
            iSmartFeedAdUIService = C58096Mr6.U2;
        }
        o.LJIIIIZZ(iSmartFeedAdUIService, "get().getService(ISmartF…dAdUIService::class.java)");
        LIZ = iSmartFeedAdUIService;
    }
}
