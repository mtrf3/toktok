package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5T implements InterfaceC55686LtK {
    public static final N5T LIZ = new N5T();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58587Mz1.LJLIL);
    public static final java.util.Set<String> LIZJ = C77275UUl.LJIIIIZZ("card", "link", "egg");

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r11.equals("preload_result") == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.N5V r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5T.LJFF(X.N5V):void");
    }

    @Override // X.InterfaceC55686LtK
    public final void LIZ(List<? extends Aweme> list) {
        Long l;
        String str;
        UrlModel redImageUrl;
        List<String> urlList;
        Long l2;
        String str2;
        AwemeRawAd awemeRawAd;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (aweme2.isAd() && (awemeRawAd = aweme2.getAwemeRawAd()) != null && awemeRawAd.getCardInfos() != null) {
                    arrayList.add(aweme);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Aweme aweme3 = (Aweme) it.next();
                AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l2 = awemeRawAd2.getCreativeId();
                } else {
                    l2 = null;
                }
                AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    str2 = awemeRawAd3.getLogExtra();
                } else {
                    str2 = null;
                }
                LJI("card", "data_received", l2, str2, aweme3.getAid(), -1);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme4 : list) {
                AwemeRawAd awemeRawAd4 = aweme4.getAwemeRawAd();
                if (awemeRawAd4 != null && o.LJ(awemeRawAd4.getType(), "redpacket") && (redImageUrl = awemeRawAd4.getRedImageUrl()) != null && (urlList = redImageUrl.getUrlList()) != null && (!urlList.isEmpty())) {
                    arrayList2.add(aweme4);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Aweme aweme5 = (Aweme) it2.next();
                AwemeRawAd awemeRawAd5 = aweme5.getAwemeRawAd();
                if (awemeRawAd5 != null) {
                    l = awemeRawAd5.getCreativeId();
                } else {
                    l = null;
                }
                AwemeRawAd awemeRawAd6 = aweme5.getAwemeRawAd();
                if (awemeRawAd6 != null) {
                    str = awemeRawAd6.getLogExtra();
                } else {
                    str = null;
                }
                LJI("redpacket", "data_received", l, str, aweme5.getAid(), -1);
            }
        }
    }

    public static void LIZLLL(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            LJI("redpacket", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
        }
    }

    @Override // X.InterfaceC55686LtK
    public final void LIZIZ(Aweme aweme, LinkData linkData) {
        if (aweme == null || linkData == null) {
            return;
        }
        LJ(0, "link", "show_result", linkData.creativeId, linkData.logExtra, aweme.getAid());
    }

    public static String LIZJ(String str, String str2, String str3) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(str2);
        LIZ2.append('_');
        LIZ2.append(str3);
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJ(int i, String str, String str2, String str3, String str4, String str5) {
        N5V n5v = new N5V(str, str2, i, System.currentTimeMillis());
        n5v.LJ = str5;
        n5v.LJFF = str3;
        n5v.LJI = str4;
        LJFF(n5v);
    }

    public static void LJI(String str, String str2, Long l, String str3, String str4, int i) {
        String str5;
        if (l == null || (str5 = l.toString()) == null) {
            str5 = "-1";
        }
        LJ(i, str, str2, str5, str3, str4);
    }
}
