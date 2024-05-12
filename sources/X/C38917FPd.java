package X;

import android.util.LruCache;

/* renamed from: X.FPd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38917FPd extends LruCache<String, String> {
    public C38917FPd(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int i = 0;
        if (str3 == null) {
            return 0;
        }
        int length = str3.length();
        if (str4 != null) {
            i = str4.length();
        }
        return i + length;
    }
}
