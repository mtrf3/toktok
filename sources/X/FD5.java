package X;

import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS21S2100000_6;
import kotlin.jvm.internal.AqS73S1100000_6;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes7.dex */
public final class FD5 {
    public static InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> LIZ;
    public static final CopyOnWriteArraySet<FD4> LIZIZ = new CopyOnWriteArraySet<>();

    public static String LJFF(String str) {
        if (o.LJJJLIIL(str, "http", false)) {
            return str;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            String queryParameter = UriProtector.getQueryParameter(parse, "url");
            if (queryParameter == null) {
                queryParameter = UriProtector.getQueryParameter(parse, "surl");
            }
            if (queryParameter != null) {
                return queryParameter;
            }
            return str;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return str;
        }
    }

    public static void LIZ(String monitorId, String str) {
        kotlin.jvm.internal.o.LJIIJ(monitorId, "monitorId");
        OFH.LIZLLL.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("collectBoolean [monitorId:");
        LIZ2.append(monitorId);
        LIZ2.append("][field:");
        LIZ2.append(str);
        LIZ2.append("][value:");
        LIZ2.append(true);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        OFH.LJI(monitorId, Boolean.TRUE, str);
    }

    public static void LJ(String str, C79604VMa c79604VMa) {
        FD6.LIZ(new AqS73S1100000_6(str, c79604VMa, 8));
    }

    public static void LJII(String str, java.util.Map map) {
        FD6.LIZ(new AqS73S1100000_6(str, map, 9));
    }

    public static void LIZIZ(int i, String monitorId, String str) {
        kotlin.jvm.internal.o.LJIIJ(monitorId, "monitorId");
        OFH.LIZLLL.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("collectInt [monitorId:");
        LIZ2.append(monitorId);
        LIZ2.append("][field:");
        LIZ2.append(str);
        LIZ2.append("][value:");
        LIZ2.append(i);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        OFH.LJI(monitorId, Integer.valueOf(i), str);
    }

    public static void LIZJ(long j, String monitorId, String str) {
        kotlin.jvm.internal.o.LJIIJ(monitorId, "monitorId");
        OFH.LIZLLL.getClass();
        OFH.LIZIZ(j, monitorId, str);
    }

    public static void LIZLLL(String monitorId, String str, String str2) {
        kotlin.jvm.internal.o.LJIIJ(monitorId, "monitorId");
        OFH.LIZLLL.getClass();
        OFH.LIZJ(monitorId, str, str2);
    }

    public static void LJIIIIZZ(View view, String containerID, C61659OHv c61659OHv) {
        kotlin.jvm.internal.o.LJIIJ(containerID, "containerID");
        FD6.LIZ(new VMP(view, containerID, c61659OHv));
    }

    public static void LJIIJ(String str, Object value, String str2) {
        kotlin.jvm.internal.o.LJIIJ(value, "value");
        FD6.LIZ(new AqS21S2100000_6(str, value, str2, 1));
    }

    public static void LJI(String str, String str2, String str3, JSONObject jSONObject) {
        FD6.LIZ(new C37312Eke(str2, str, str3, jSONObject));
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9 = str5;
        String str10 = str4;
        String str11 = str6;
        String str12 = str7;
        String str13 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str10 = "";
        }
        if ((i & 16) != 0) {
            str9 = "";
        }
        if ((i & 32) != 0) {
            str11 = "";
        }
        if ((i & 64) != 0) {
            str12 = "";
        }
        if ((i & 128) == 0) {
            str13 = str8;
        }
        try {
            FD6.LIZ(new C38516F9s(str2, str3, str10, str9, str11, str12, str13, str));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
