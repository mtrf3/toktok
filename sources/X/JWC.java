package X;

import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import ujb.s;

/* loaded from: classes9.dex */
public final class JWC {
    public static final AsyncLoadConfig LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        AsyncLoadConfig asyncLoadConfig = new AsyncLoadConfig(false, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, objArr7, objArr8, j, 16383, 0 == true ? 1 : 0);
        FFL.LJIIIZ().getClass();
        AsyncLoadConfig asyncLoadConfig2 = (AsyncLoadConfig) FFL.LJIJ(true, "search_async_preload", 31744, AsyncLoadConfig.class, asyncLoadConfig);
        if (asyncLoadConfig2 != null) {
            asyncLoadConfig = asyncLoadConfig2;
        }
        LIZ = asyncLoadConfig;
    }

    public static final boolean LIZ(String str) {
        for (String str2 : LIZ.lynxWhitelist) {
            if (str != null && s.LJJJLZIJ(str, str2, false)) {
                return true;
            }
        }
        return false;
    }
}
