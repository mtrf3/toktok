package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8NM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NM {
    public static final java.util.Map<String, Long> LIZ = new LinkedHashMap();

    public static void LIZLLL(String str) {
        LIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LIZ(Context context, Aweme aweme) {
        final UrlModel LJII;
        String str;
        if (!C1DF.LJJIII(aweme) || !((Boolean) C8NO.LIZ.getValue()).booleanValue() || (LJII = C1DF.LJII(aweme)) == null) {
            return;
        }
        List<String> urlList = LJII.getUrlList();
        if (urlList == null || (str = (String) ORZ.LJLLLL(urlList)) == null) {
            str = "";
        }
        LIZLLL(str);
        W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(LJII.getUrlList()));
        LJIIIZ.LIZJ = context;
        LJIIIZ.LIZIZ("story_photo");
        LJIIIZ.LJJII = C38995FSd.LIZLLL();
        LJIIIZ.LJJI = KL0.HIGH;
        LJIIIZ.LJII(new InterfaceC31104CIq() { // from class: X.8NN
            @Override // X.InterfaceC31104CIq
            public final void LJI(File file) {
                String str2;
                List<String> urlList2 = UrlModel.this.getUrlList();
                if (urlList2 == null || (str2 = (String) ORZ.LJLLLL(urlList2)) == null) {
                    str2 = "";
                }
                C8NM.LJ(str2, true);
            }

            @Override // X.InterfaceC31104CIq
            public final void onFailed(Throwable th) {
                String str2;
                List<String> urlList2 = UrlModel.this.getUrlList();
                if (urlList2 == null || (str2 = (String) ORZ.LJLLLL(urlList2)) == null) {
                    str2 = "";
                }
                C8NM.LIZJ(str2, th, true);
            }
        });
    }

    public static void LJ(String str, boolean z) {
        java.util.Map<String, Long> map = LIZ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            map.remove(str);
            LIZIZ(z, true, null, str, elapsedRealtime);
        }
    }

    public static void LIZJ(String str, Throwable th, boolean z) {
        java.util.Map<String, Long> map = LIZ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            map.remove(str);
            LIZIZ(z, false, th, str, elapsedRealtime);
        }
    }

    public static void LIZIZ(boolean z, boolean z2, Throwable th, String str, long j) {
        String str2;
        String str3;
        C188727au c188727au = new C188727au();
        String str4 = "1";
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("success", str2);
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_preload", str4);
        c188727au.LJIIIZ("load_url", str);
        c188727au.LJ(j, "duration");
        if (th != null) {
            str3 = th.getMessage();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("error_msg", str3);
        FMX.LJIIL("story_photo_load_status", c188727au.LIZ);
    }
}
