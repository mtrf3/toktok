package X;

import com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.ItQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48048ItQ {
    public static final ISmartFeedLoadMoreService LIZ;

    static {
        ISmartFeedLoadMoreService iSmartFeedLoadMoreService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartFeedLoadMoreService.class, false);
        if (LIZ2 != null) {
            iSmartFeedLoadMoreService = (ISmartFeedLoadMoreService) LIZ2;
        } else {
            if (C58096Mr6.V2 == null) {
                synchronized (ISmartFeedLoadMoreService.class) {
                    if (C58096Mr6.V2 == null) {
                        C58096Mr6.V2 = new SmartFeedLoadMoreServiceImpl();
                    }
                }
            }
            iSmartFeedLoadMoreService = C58096Mr6.V2;
        }
        o.LJIIIIZZ(iSmartFeedLoadMoreService, "get().getService(ISmartF…dMoreService::class.java)");
        LIZ = iSmartFeedLoadMoreService;
    }
}
