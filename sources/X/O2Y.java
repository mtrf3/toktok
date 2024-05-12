package X;

import android.os.FileObserver;
import android.util.LruCache;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class O2Y extends LruCache<String, byte[]> {
    public final /* synthetic */ C61250O2c LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2Y(C61250O2c c61250O2c, int i) {
        super(i);
        this.LIZ = c61250O2c;
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            return bArr2.length;
        }
        return 0;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, String str, byte[] bArr, byte[] bArr2) {
        super.entryRemoved(z, str, bArr, bArr2);
        if (bArr2 == null) {
            FileObserver fileObserver = this.LIZ.LIZJ.get(str);
            if (fileObserver != null) {
                fileObserver.stopWatching();
            }
            ConcurrentHashMap<String, FileObserver> concurrentHashMap = this.LIZ.LIZJ;
            if (concurrentHashMap != null) {
                C65777Prh.LIZJ(concurrentHashMap).remove(str);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }
}
