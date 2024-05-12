package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLDecoder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ptg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65900Ptg {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011b, code lost:
    
        if (r6 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011d, code lost:
    
        r4 = new X.C65938PuI(X.C65905Ptl.LIZ(r6.getMonitorNormal()), X.C65905Ptl.LIZ(r6.getMonitorError()), X.C65905Ptl.LIZ(r6.getInterceptError()), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0141, code lost:
    
        if (r6 != null) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C65901Pth LIZ(X.C65922Pu2 r8) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65900Ptg.LIZ(X.Pu2):X.Pth");
    }

    public static void LIZJ(C65902Pti c65902Pti) {
        List<String> list;
        String str;
        C65922Pu2 c65922Pu2 = c65902Pti.LJLIL.LJLIL;
        if (c65922Pu2.LIZ == 400203 && o.LJ(c65922Pu2.LIZIZ, "after")) {
            java.util.Map<String, List<String>> T = c65902Pti.T();
            android.net.Uri uri = null;
            if (T == null || (list = T.get("x-tt-net-final-url")) == null || (str = (String) ORZ.LJLLLL(list)) == null || ujb.o.LJJJJJL(str)) {
                return;
            }
            try {
                uri = UriProtector.parse(URLDecoder.decode(str, "UTF-8"));
            } catch (Throwable unused) {
            }
            if (uri == null) {
                return;
            }
            c65902Pti.LLD = uri;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.PYQ LIZIZ(X.C65922Pu2 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65900Ptg.LIZIZ(X.Pu2, boolean):X.PYQ");
    }
}
