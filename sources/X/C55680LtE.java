package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import kotlin.jvm.internal.o;

/* renamed from: X.LtE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55680LtE extends FWI {
    @Override // X.FWI
    public final C36821Ecj<Long> LIZIZ() {
        C36821Ecj<Long> lastGetRelieveAwemeTime = SharePrefCache.inst().getLastGetRelieveAwemeTime();
        o.LJIIIIZZ(lastGetRelieveAwemeTime, "inst().lastGetRelieveAwemeTime");
        return lastGetRelieveAwemeTime;
    }
}
