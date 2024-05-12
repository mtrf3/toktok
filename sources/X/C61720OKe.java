package X;

import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import kotlin.jvm.internal.o;

/* renamed from: X.OKe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61720OKe {
    public static final /* synthetic */ C61720OKe LIZ = new C61720OKe();

    public static PromoteEntryCheckApi LIZ() {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(PromoteEntryCheckApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (PromoteEntryCheckApi) obj;
    }
}
