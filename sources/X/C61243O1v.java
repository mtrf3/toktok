package X;

import android.os.FileObserver;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.O1v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61243O1v {
    public static final /* synthetic */ int LIZLLL = 0;
    public C61234O1m LIZ;
    public final ConcurrentHashMap<String, O1I> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, FileObserver> LIZJ = new ConcurrentHashMap<>();

    public final byte[] LIZ(String str) {
        boolean z;
        C61234O1m c61234O1m;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (c61234O1m = this.LIZ) == null) {
            return null;
        }
        return c61234O1m.get(str);
    }

    public final void LIZIZ(String cacheKey, O1I resInfo) {
        String str;
        o.LJIIJ(cacheKey, "cacheKey");
        o.LJIIJ(resInfo, "resInfo");
        if (cacheKey.length() == 0 || (str = resInfo.LJI) == null || str.length() == 0) {
            return;
        }
        try {
            FileObserverC61244O1w fileObserverC61244O1w = new FileObserverC61244O1w(this, cacheKey, resInfo.LJI);
            this.LIZIZ.put(cacheKey, resInfo);
            FileObserver fileObserver = this.LIZJ.get(cacheKey);
            if (fileObserver != null) {
                fileObserver.stopWatching();
            }
            fileObserverC61244O1w.startWatching();
            this.LIZJ.put(cacheKey, fileObserverC61244O1w);
        } catch (Throwable unused) {
        }
    }
}
