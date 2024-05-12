package X;

import android.util.LruCache;

/* renamed from: X.O1m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61234O1m extends LruCache<String, byte[]> {
    public C61234O1m(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            return bArr2.length;
        }
        return 0;
    }
}
