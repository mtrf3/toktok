package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.7sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199437sB {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC65462ha LIZ(int i, String poiId, String reviewId, String str) {
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(reviewId, "reviewId");
        XGR LIZ2 = XGJ.LIZ().LIZ(new C199177rl(poiId, reviewId, i, str));
        LIZ2.LIZ(new XH4(new XHR(reviewId)));
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.status_code = 0;
        LIZ2.LIZ(new C84568XGy(new C199087rc(baseResponse)));
        return LIZ2.LIZIZ();
    }
}
