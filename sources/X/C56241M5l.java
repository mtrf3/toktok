package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import ujb.s;

/* renamed from: X.M5l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56241M5l {
    public static final HashMap<EnumC56245M5p, AbstractC56238M5i> LIZ;

    static {
        HashMap<EnumC56245M5p, AbstractC56238M5i> hashMap = new HashMap<>();
        LIZ = hashMap;
        hashMap.put(EnumC56245M5p.Share, new C56242M5m());
        hashMap.put(EnumC56245M5p.Paid, new C56253M5x());
        hashMap.put(EnumC56245M5p.OpenPlatform, new C56250M5u());
        hashMap.put(EnumC56245M5p.Post, new C56247M5r());
        hashMap.put(EnumC56245M5p.Seo, new C56239M5j());
        hashMap.put(EnumC56245M5p.Web, new C56255M5z());
        hashMap.put(EnumC56245M5p.Others, new C56240M5k());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r8 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r3 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC56238M5i LIZ(X.M5X r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56241M5l.LIZ(X.M5X):X.M5i");
    }

    public static boolean LIZIZ(Intent intent, String str) {
        String str2;
        String host;
        Bundle LLJJIJI;
        if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "android.intent.extra.REFERRER");
            if (LLJJIII == null || (str2 = LLJJIII.toString()) == null) {
                str2 = C16880lQ.LLJJIJIIJIL(intent, "android.intent.extra.REFERRER_NAME");
            }
        } else {
            str2 = null;
        }
        if (str2 == null || (host = UriProtector.parse(str2).getHost()) == null || !s.LJJJLZIJ(host, str, false)) {
            return false;
        }
        return true;
    }
}
