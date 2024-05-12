package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.J6f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48617J6f {
    public static String LIZ;
    public static long LIZJ;
    public static long LJ;
    public static C48631J6t LJFF;
    public static long LJI;
    public static int LJII;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static long LJIIJ;
    public static int LJIIJJI;
    public static long LJIIL;
    public static IRequestIdService LJIILIIL;
    public static final SimpleDateFormat LJIILJJIL;
    public static String LIZIZ = "";
    public static int LIZLLL = -1;

    static {
        C48631J6t c48631J6t = new C48631J6t();
        LJFF = c48631J6t;
        LJIILJJIL = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        c48631J6t.LIZJ = 0;
        c48631J6t.LIZIZ = 0;
        c48631J6t.LIZ = 0;
    }

    public static int LIZ(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            Object obj = ListProtector.get(arrayList, arrayList.size() / 2);
            o.LJIIIIZZ(obj, "list[list.size / 2]");
            return ((Number) obj).intValue();
        }
        return 0;
    }

    public static C48631J6t LIZIZ(long j) {
        if (j - LJI > 30000) {
            try {
                C48631J6t networkQuality = TTNetInit.getNetworkQuality();
                if (networkQuality != null) {
                    LJFF = networkQuality;
                }
            } catch (Exception unused) {
            }
            LJI = j;
        }
        return LJFF;
    }

    public static String LIZJ(long j) {
        if (j - LIZJ > 30000) {
            String LLJILJILJ = C16880lQ.LLJILJILJ(EF7.LIZIZ());
            o.LJIIIIZZ(LLJILJILJ, "getNetworkAccessType(getApplicationContext())");
            LIZIZ = LLJILJILJ;
            LIZJ = j;
        }
        return LIZIZ;
    }

    public static C7D6 LIZLLL(String str, String enterType) {
        String LIZIZ2;
        o.LJIIIZ(enterType, "enterType");
        if (LJIILIIL == null) {
            LJIILIIL = RequestIdService.LJ();
        }
        if (LJIILIIL == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(enterType) || !o.LJ(enterType, "homepage_hot") || (LIZIZ2 = C42398GkU.LIZIZ(str, '0')) == null) {
            return null;
        }
        IRequestIdService iRequestIdService = LJIILIIL;
        o.LJI(iRequestIdService);
        return iRequestIdService.LIZLLL(LIZIZ2);
    }
}
