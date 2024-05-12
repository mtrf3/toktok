package X;

import com.ss.android.ugc.aweme.setting.api.LiveReplayApi;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AG0 {
    public static final /* synthetic */ AG0 LIZ = new AG0();

    public static LiveReplayApi LIZ() {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(LiveReplayApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (LiveReplayApi) obj;
    }
}
