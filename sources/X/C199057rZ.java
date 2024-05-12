package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7rZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199057rZ {
    public static final /* synthetic */ C199057rZ LIZ = new C199057rZ();

    public static PoiReviewsApi LIZ() {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(PoiReviewsApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (PoiReviewsApi) obj;
    }
}
