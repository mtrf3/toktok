package X;

import android.os.FileObserver;
import android.util.LruCache;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class O49 extends LruCache<String, O4O> {
    public final /* synthetic */ O47 LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O49(O47 o47, int i) {
        super(i);
        this.LIZ = o47;
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, O4O o4o) {
        O4P o4p;
        int i;
        O4O o4o2 = o4o;
        if (o4o2 == null || !o4o2.LJIILL() || (o4p = o4o2.LJLJJL) == null || (i = o4p.LJII) < 1) {
            return 1;
        }
        return i;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, String str, O4O o4o, O4O o4o2) {
        super.entryRemoved(z, str, o4o, o4o2);
        if (o4o2 == null) {
            synchronized (this) {
                FileObserver fileObserver = this.LIZ.LIZJ.get(str);
                if (fileObserver != null) {
                    fileObserver.stopWatching();
                }
                ConcurrentHashMap<String, FileObserver> concurrentHashMap = this.LIZ.LIZJ;
                if (concurrentHashMap != null) {
                    C65777Prh.LIZJ(concurrentHashMap).remove(str);
                    ConcurrentHashMap<String, C61295O3v> concurrentHashMap2 = this.LIZ.LIZIZ;
                    if (concurrentHashMap2 != null) {
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }
        }
    }
}
