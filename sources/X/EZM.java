package X;

import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EZM<V> implements Callable {
    public static final EZM<V> LJLIL = new EZM<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CommonApi commonApi = EZL.LIZIZ;
        String str = EZL.LIZ;
        String str2 = commonApi.doGet(str).execute().LIZIZ;
        o.LJIIIIZZ(str2, "S_API.doGet(CHECKIN).execute().body()");
        com.ss.android.ugc.aweme.app.api.Api.LIZ(str2, str);
        return null;
    }
}
