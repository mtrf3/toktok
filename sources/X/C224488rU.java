package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.8rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224488rU {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r3 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.net.Uri r4) {
        /*
            java.lang.String r2 = r4.getLastPathSegment()
            X.7au r4 = new X.7au
            r4.<init>()
            java.lang.String r1 = "scene_id"
            java.lang.String r0 = "1048"
            r4.LJIIIZ(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "advertisement"
            r4.LJIIIZ(r1, r0)
            java.lang.String r0 = "to_user_id"
            r4.LJIIIZ(r0, r2)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L28
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L2b
        L28:
            r1 = r2
            if (r3 == 0) goto L54
        L2b:
            boolean r0 = r3.isConnected()
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJFF(r0, r1)
            if (r3 == 0) goto L3e
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L41
        L3e:
            r1 = r2
            if (r3 == 0) goto L47
        L41:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L52
        L47:
            r4.LJIIIZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r1)
            return
        L52:
            r2 = r0
            goto L47
        L54:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224488rU.LIZ(android.net.Uri):void");
    }

    public static final void LIZJ(String url) {
        o.LJIIIZ(url, "url");
        android.net.Uri parse = UriProtector.parse(url);
        String host = parse.getHost();
        String path = parse.getPath();
        if (host == null || host.length() == 0) {
            return;
        }
        if (o.LJ(host, "profile")) {
            LIZ(parse);
        } else {
            if (!o.LJ(host, "user") || path == null || !ujb.o.LJJJLIIL(path, "/profile", false)) {
                return;
            }
            LIZ(parse);
        }
    }

    public static final void LIZIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        C224498rV c224498rV = new C224498rV(context.hashCode());
        c224498rV.LJLILLLLZI = str;
        C2U8.LIZ(new C81P("homepage_hot"));
        C2U8.LIZ(c224498rV);
    }
}
