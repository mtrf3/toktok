package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189927cq {
    public static final /* synthetic */ C189927cq LIZ = new C189927cq();

    public static PoiListApi LIZ() {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(PoiListApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (PoiListApi) obj;
    }
}
