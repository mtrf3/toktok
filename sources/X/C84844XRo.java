package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import kotlin.jvm.internal.o;

/* renamed from: X.XRo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84844XRo {
    public static final /* synthetic */ C84844XRo LIZ = new C84844XRo();

    public static PoiDiscoveryApi LIZ() {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(PoiDiscoveryApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (PoiDiscoveryApi) obj;
    }
}
