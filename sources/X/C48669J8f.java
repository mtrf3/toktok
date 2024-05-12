package X;

import com.ss.android.ugc.aweme.setting.api.DataSaverApi;
import kotlin.jvm.internal.o;

/* renamed from: X.J8f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48669J8f {
    public static final /* synthetic */ C48669J8f LIZ = new C48669J8f();
    public static final DataSaverApi LIZIZ;

    static {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(DataSaverApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LIZIZ = (DataSaverApi) obj;
    }
}
