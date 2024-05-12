package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fcg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39366Fcg {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(boolean z) {
        if (z) {
            AdLandingPageConfig LIZ2 = C59445NUr.LIZ();
            if (LIZ2 == null) {
                return null;
            }
            return LIZ2.getSplashAdAutoJumpAllowList();
        }
        AdLandingPageConfig LIZ3 = C59445NUr.LIZ();
        if (LIZ3 == null) {
            return null;
        }
        return LIZ3.autoJumpAllowList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r8) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39366Fcg.LIZLLL(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static boolean LIZJ(String str, String str2, String str3, List list) {
        boolean LJJJLIIL;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        if (str2 == null) {
            str2 = UriProtector.parse(str).getScheme();
        }
        if (TextUtils.equals(str2, "sslocal")) {
            return true;
        }
        if (!TextUtils.isEmpty(str3)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (o.LJ(str3, it.next())) {
                    return true;
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (str2 != null && str4 != null) {
                if (!s.LJJJLZIJ(str4, ":", false)) {
                    LJJJLIIL = TextUtils.equals(str2, str4);
                } else {
                    LJJJLIIL = ujb.o.LJJJLIIL(str, str4, false);
                }
                if (LJJJLIIL) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.net.Uri r8, java.lang.String r9, boolean r10, android.webkit.WebView r11, com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig r12, boolean r13, boolean r14, X.C59222NMc r15, X.N1V r16) {
        /*
            r7 = 0
            if (r8 == 0) goto L9
            java.lang.String r2 = r8.toString()
            if (r2 != 0) goto La
        L9:
            return r7
        La:
            java.lang.String r4 = r8.getScheme()
            r1 = 0
            if (r4 == 0) goto L9c
            java.lang.String r3 = "getDefault()"
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r3 = X.AnonymousClass028.LIZJ(r3, r4, r0)
        L19:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r15.LIZ
            boolean r6 = X.C55511LqV.LJIIIZ(r5)
            if (r12 == 0) goto L9a
            java.util.List<java.lang.String> r0 = r12.clickJumpAllowList
        L23:
            boolean r0 = LIZJ(r2, r3, r9, r0)
            r4 = 1
            if (r0 != 0) goto L40
            java.util.List r0 = LIZ(r6)
            boolean r0 = LIZJ(r2, r3, r9, r0)
            if (r0 != 0) goto L40
            if (r5 == 0) goto L3a
            java.util.List r1 = r5.getIabAutoJumpAllowList()
        L3a:
            boolean r0 = LIZJ(r2, r3, r9, r1)
            if (r0 == 0) goto L98
        L40:
            r1 = 1
        L41:
            if (r12 == 0) goto L80
            if (r13 == 0) goto L4f
            boolean r0 = r12.isJumpControlEnabled()
            if (r0 == 0) goto L4f
            if (r1 != 0) goto L4f
            if (r10 == 0) goto L86
        L4f:
            boolean r0 = X.C59303NPf.LIZJ(r2)
            if (r0 != 0) goto L86
            android.content.Context r1 = r11.getContext()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            boolean r0 = X.FC0.LIZJ(r1, r0)
            r0 = r0 ^ 1
            r1 = r16
            X.NPI.LIZ(r1, r2, r10, r0)
            java.lang.String r0 = "market"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto La7
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            r1.setData(r8)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r0)
            goto L9f
        L80:
            if (r13 == 0) goto L4f
            if (r1 != 0) goto L4f
            if (r10 != 0) goto L4f
        L86:
            if (r14 == 0) goto L9
            boolean r0 = X.C59303NPf.LIZJ(r2)
            if (r0 == 0) goto L9
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            X.C16880lQ.LLZZ(r11, r2)
            return r4
        L98:
            r1 = 0
            goto L41
        L9a:
            r0 = r1
            goto L23
        L9c:
            r3 = r1
            goto L19
        L9f:
            android.content.Context r0 = r11.getContext()     // Catch: java.lang.Exception -> La6
            X.C16880lQ.LIZJ(r0, r1)     // Catch: java.lang.Exception -> La6
        La6:
            return r4
        La7:
            android.content.Context r1 = r11.getContext()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            boolean r0 = X.FC0.LIZJ(r1, r0)
            if (r0 == 0) goto Lbd
            android.content.Context r0 = r11.getContext()
            LIZLLL(r0, r2, r9)
            return r4
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39366Fcg.LIZIZ(android.net.Uri, java.lang.String, boolean, android.webkit.WebView, com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig, boolean, boolean, X.NMc, X.N1V):boolean");
    }
}
