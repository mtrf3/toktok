package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89553fL {
    public static final ConcurrentHashSet<String> LIZ = new ConcurrentHashSet<>();

    public static final int LIZJ(UrlModel urlModel) {
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            return 0;
        }
        Object obj = ListProtector.get(urlModel.getUrlList(), 0);
        o.LJIIIIZZ(obj, "urlList[0]");
        return LIZLLL((String) obj);
    }

    public static final int LIZLLL(String str) {
        Object LIZ2;
        Object obj = null;
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "x-expires");
            if (queryParameter != null) {
                LIZ2 = Integer.valueOf(CastIntegerProtector.parseInt(queryParameter));
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final boolean LJII(String str) {
        if (str != null && !o.LJ(str, "") && !o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static final void LIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        if (((Boolean) LBS.LIZLLL.getValue()).booleanValue()) {
            C34B.LIZJ(str, msg);
        }
    }

    public static final void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        if (((Boolean) LBS.LIZLLL.getValue()).booleanValue()) {
            C34B.LJI(str, msg);
        }
    }

    public static final boolean LJ(UrlModel urlModel, UrlModel urlModel2) {
        o.LJIIIZ(urlModel, "<this>");
        if (urlModel2 == null) {
            return false;
        }
        String LJIIIIZZ = LJIIIIZZ(urlModel, true);
        String LJIIIIZZ2 = LJIIIIZZ(urlModel2, true);
        if (LJIIIIZZ.length() == 0 || LJIIIIZZ2.length() == 0) {
            return false;
        }
        if (LBS.LJ) {
            return o.LJ(LJIIIIZZ, LJIIIIZZ2);
        }
        if (!o.LJ(LJIIIIZZ, LJIIIIZZ2) && !s.LJJJLZIJ(LJIIIIZZ, LJIIIIZZ2, false) && !s.LJJJLZIJ(LJIIIIZZ2, LJIIIIZZ, false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(UrlModel urlModel, boolean z) {
        if (urlModel == null) {
            return false;
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            LIZIZ("DMAvatarUtils", "urls is empty");
            return false;
        }
        Object obj = ListProtector.get(urlModel.getUrlList(), 0);
        o.LJIIIIZZ(obj, "urlList[0]");
        if (LJFF((String) obj, null, z)) {
            return false;
        }
        return true;
    }

    public static final String LJIIIIZZ(UrlModel urlModel, boolean z) {
        boolean z2;
        String str;
        String str2;
        o.LJIIIZ(urlModel, "<this>");
        String uri = urlModel.getUri();
        if (uri != null && uri.length() > 0) {
            String uri2 = urlModel.getUri();
            o.LJIIIIZZ(uri2, "uri");
            return uri2;
        }
        if (z) {
            C78983UzD.LJIILL("uri is empty");
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C78983UzD.LJIILL("uriList is empty");
            return "";
        }
        List<String> urlList2 = urlModel.getUrlList();
        if (urlList2 == null || (str = (String) ORZ.LJLLLLLL(0, urlList2)) == null) {
            str = "";
        }
        String encodedPath = UriProtector.parse(str).getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        if (encodedPath.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("res is empty: ");
            List<String> urlList3 = urlModel.getUrlList();
            if (urlList3 != null) {
                str2 = (String) ORZ.LJLLLLLL(0, urlList3);
            } else {
                str2 = null;
            }
            LIZ2.append(str2);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
            return "";
        }
        return encodedPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r8 >= r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (r3 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r6 >= r9) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89553fL.LJFF(java.lang.String, java.lang.String, boolean):boolean");
    }
}
