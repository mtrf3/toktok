package X;

/* renamed from: X.PCf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64061PCf {
    public final String LIZ;

    public C64061PCf(String str, String... strArr) {
        int length = strArr.length;
        if (length != 0) {
            StringBuilder sb = new StringBuilder("[");
            int i = 0;
            do {
                String str2 = strArr[i];
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
                i++;
            } while (i < length);
            sb.append("] ");
        }
        this.LIZ = str;
        new PT4(str);
        int i2 = 2;
        while (!android.util.Log.isLoggable(this.LIZ, i2) && (i2 = i2 + 1) <= 7) {
        }
    }
}
