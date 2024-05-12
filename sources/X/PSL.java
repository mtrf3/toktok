package X;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public class PSL {
    public final long LIZ;
    public final List<String> LIZIZ;
    public final java.util.Set<SharedPreferences.OnSharedPreferenceChangeListener> LIZJ;
    public final java.util.Map<String, Object> LIZLLL;
    public final CountDownLatch LJ = new CountDownLatch(1);
    public volatile boolean LJFF = false;

    public PSL(long j, List list, java.util.Set set, java.util.Map map) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = set;
        this.LIZLLL = map;
    }
}
