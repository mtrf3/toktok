package X;

import com.ss.android.ugc.aweme.wavepublish.cloudmerge.net.NLERequestApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EZb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36627EZb extends AbstractC36626EZa {
    public final ConcurrentHashMap<String, NLERequestApi> LIZ = new ConcurrentHashMap<>();

    public final NLERequestApi LIZIZ(String str) {
        NLERequestApi nLERequestApi = this.LIZ.get(str);
        if (nLERequestApi == null) {
            NLERequestApi api = (NLERequestApi) C65083PgV.LJIIIIZZ(NLERequestApi.class, str);
            ConcurrentHashMap<String, NLERequestApi> concurrentHashMap = this.LIZ;
            o.LJIIIIZZ(api, "api");
            concurrentHashMap.put(str, api);
            return api;
        }
        return nLERequestApi;
    }
}
