package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9nM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247409nM {
    public static String LJ() {
        Context context;
        try {
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                context = abstractC247499nV.LJ();
            } else {
                context = null;
            }
        } catch (Throwable unused) {
            if (0 != 0) {
            }
        }
        if (!FCD.LJFF(context, "com.ss.android.ugc.now")) {
            return "";
        }
        return "tiktok_now";
    }

    public static C247289nA LIZJ() {
        return (C247289nA) C95J.LIZ(8);
    }

    public static C247339nF LIZIZ(String pageName) {
        o.LJIIIZ(pageName, "pageName");
        HashMap hashMap = (HashMap) C247339nF.LJFF.getValue();
        Object obj = hashMap.get(pageName);
        if (obj == null) {
            C247339nF.LJI.getClass();
            obj = new C247339nF(LIZLLL(pageName));
            hashMap.put(pageName, obj);
        }
        return (C247339nF) obj;
    }

    public static int LIZLLL(String pageName) {
        o.LJIIIZ(pageName, "pageName");
        int hashCode = pageName.hashCode();
        if (hashCode != -667094460) {
            if (hashCode == 1691937916) {
                pageName.equals("homepage_hot");
            }
        } else if (pageName.equals("homepage_friends")) {
            return 28;
        }
        return 8;
    }

    public static boolean LIZ(File file, String md5) {
        o.LJIIIZ(md5, "md5");
        if (!file.exists()) {
            return false;
        }
        return o.LJ(C38352F3k.LIZIZ(file), md5);
    }

    public static void LJFF(Context context, String jumpLink, String enterFrom) {
        o.LJIIIZ(jumpLink, "jumpLink");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (context == null || jumpLink.length() == 0) {
            return;
        }
        if (ujb.o.LJJJLIIL(jumpLink, "http", false)) {
            C247289nA LIZJ = LIZJ();
            if (LIZJ != null && LIZJ.LJIIIZ()) {
                try {
                    C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(UriProtector.getQueryParameter(UriProtector.parse(jumpLink), "af_dp"))));
                    return;
                } catch (Throwable unused) {
                    C250729si.LIZ(context, jumpLink, enterFrom, null, false);
                    return;
                }
            }
            C250729si.LIZ(context, jumpLink, enterFrom, null, false);
            return;
        }
        if (s.LJJJLZIJ(jumpLink, "//now/feed", false)) {
            C247289nA LIZJ2 = LIZJ();
            if (LIZJ2 == null) {
                return;
            }
            LIZJ2.LJFF(context);
            return;
        }
        C250729si.LIZ(context, jumpLink, enterFrom, null, false);
    }
}
