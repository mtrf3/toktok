package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: X.Ijr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47455Ijr {
    public static volatile C47935Irb LIZ = null;
    public static volatile C47961Is1 LIZIZ = null;
    public static volatile Context LIZJ = null;
    public static volatile String LIZLLL = null;
    public static volatile InterfaceC47447Ijj LJ = null;
    public static volatile InterfaceC47477IkD LJFF = null;
    public static volatile IUX LJI = null;
    public static volatile InterfaceC47476IkC LJII = null;
    public static volatile String LJIIIIZZ = null;
    public static volatile boolean LJIIIZ = false;
    public static volatile boolean LJIIJ = true;
    public static volatile boolean LJIIJJI = true;
    public static int LJIIL = 8192;
    public static int LJIILIIL = 10;
    public static volatile boolean LJIILJJIL = true;
    public static boolean LJIILL = false;
    public static boolean LJIILLIIL = true;
    public static boolean LJIIZILJ = false;
    public static boolean LJIJ = true;
    public static boolean LJIJI = false;
    public static volatile int LJIJJ = 10;
    public static volatile boolean LJIJJLI = false;
    public static long LJIL = 0;
    public static volatile int LJJ = 0;
    public static volatile InterfaceC47479IkF LJJI = null;
    public static volatile boolean LJJIFFI = true;
    public static boolean LJJII;
    public static boolean LJJIII;

    public static void LIZIZ(int i, String str) {
        if (LJII != null) {
            LJII.getClass();
            if (IZ8.LJIIIZ()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                jSONObject.put("url", str);
                C46982IcE.LJI().monitorCommonLog("aweme_media_play_video_data_download", "aweme_media_play_video_data_download", jSONObject);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LIZJ(int i, String str, String str2) {
        if (LJI != null) {
            IUW.LIZ(i, str, str2);
        }
    }

    public static String LIZ(String str, String str2, String str3, List list) {
        Object[] objArr = new Object[3];
        if (LJIIIIZZ == null) {
            LJIIIIZZ = String.valueOf(new Random().nextInt());
        }
        objArr[0] = LJIIIIZZ;
        objArr[1] = str;
        objArr[2] = str2;
        StringBuilder sb = new StringBuilder(C16880lQ.LLLZ("%s-%s-%s", objArr));
        if (!TextUtils.isEmpty(str3)) {
            sb.append("-");
            sb.append(str3);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            sb.append("-");
            sb.append(str4);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("------as-----:");
        LIZ2.append(sb.toString());
        C48841JEv.LJIIIIZZ("TAG_PROXY", X1D.LIZIZ(LIZ2), null);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(sb.toString().hashCode());
        LIZ3.append("");
        return X1D.LIZIZ(LIZ3);
    }
}
