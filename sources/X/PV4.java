package X;

import android.util.LruCache;

/* loaded from: classes12.dex */
public class PV4 extends LruCache<String, byte[]> {
    public PV4() {
        super(10485760);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, byte[] bArr) {
        return bArr.length;
    }
}
