package X;

import Y.ARunnableS27S0200000_8;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.IuG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48100IuG {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final Charset LIZIZ = Charset.forName("UTF-8");
    public static final PThreadPoolExecutor LIZJ = new PThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("ver/util/Util"));

    public static void LIZIZ(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void LIZJ(List<C48099IuF> list) {
        if (list == null) {
            return;
        }
        C48841JEv.LJIILIIL("TAG_PROXY_PRE_FILTER", list.toString(), null);
        LJIIJJI("Host", list);
        LJIIJJI("Keep-Alive", list);
        List LJI = LJI("Connection", list);
        if (LJI != null && !LJI.isEmpty()) {
            Iterator it = LJI.iterator();
            while (it.hasNext()) {
                List<String> LJIILIIL = LJIILIIL(((C48099IuF) it.next()).LIZIZ);
                if (LJIILIIL != null) {
                    Iterator<String> it2 = LJIILIIL.iterator();
                    while (it2.hasNext()) {
                        LJIIJJI(it2.next(), list);
                    }
                }
            }
        }
        LJIIJJI("Connection", list);
        List LJI2 = LJI("Proxy-Connection", list);
        if (LJI2 != null && !LJI2.isEmpty()) {
            Iterator it3 = LJI2.iterator();
            while (it3.hasNext()) {
                List<String> LJIILIIL2 = LJIILIIL(((C48099IuF) it3.next()).LIZIZ);
                if (LJIILIIL2 != null) {
                    Iterator<String> it4 = LJIILIIL2.iterator();
                    while (it4.hasNext()) {
                        LJIIJJI(it4.next(), list);
                    }
                }
            }
        }
        LJIIJJI("Proxy-Connection", list);
        C48841JEv.LJIILIIL("TAG_PROXY_PRE_FILTER", list.toString(), null);
    }

    public static List<String> LJFF(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (LJIIIZ(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static void LJII(Runnable runnable) {
        boolean z;
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZJ.execute(runnable);
            C48841JEv.LJIJI("TAG_PROXY_UTIL", "invoke in pool thread", null);
        } else {
            runnable.run();
            C48841JEv.LJIJI("TAG_PROXY_UTIL", "invoke calling thread", null);
        }
    }

    public static void LJIIIIZZ(Runnable runnable) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            runnable.run();
        } else {
            LIZ.post(runnable);
        }
    }

    public static boolean LJIIIZ(String str) {
        if (str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
            return true;
        }
        return false;
    }

    public static int LJIIJ(C48104IuK c48104IuK) {
        int lastIndexOf;
        if (c48104IuK == null) {
            return -1;
        }
        int i = c48104IuK.LJLILLLLZI;
        if (i == 200) {
            return LJIILJJIL(c48104IuK.LIZIZ("Content-Length", null), -1);
        }
        if (i == 206) {
            String LIZIZ2 = c48104IuK.LIZIZ("Content-Range", null);
            if (!TextUtils.isEmpty(LIZIZ2) && (lastIndexOf = LIZIZ2.lastIndexOf("/")) >= 0 && lastIndexOf < LIZIZ2.length() - 1) {
                return LJIILJJIL(LIZIZ2.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static List<String> LJIILIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    arrayList.add(trim);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String LJIILL(List<C48099IuF> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (C48099IuF c48099IuF : list) {
            sb.append(c48099IuF.LIZ);
            sb.append(": ");
            sb.append(c48099IuF.LIZIZ);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public static String LIZLLL(C48111IuR c48111IuR, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb.append(c48111IuR.LIZIZ);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(c48111IuR.LIZJ);
            sb.append("\r\n");
        } else {
            V1I.LIZLLL(sb, "Content-Range: bytes ", i, "-");
            sb.append(c48111IuR.LIZJ - 1);
            sb.append("/");
            sb.append(c48111IuR.LIZJ);
            sb.append("\r\nContent-Length: ");
            sb.append(c48111IuR.LIZJ - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String sb2 = sb.toString();
        C48841JEv.LJIILIIL("TAG_PROXY_WRITE_TO_MP", sb2, null);
        return sb2;
    }

    public static String LJ(C48104IuK c48104IuK, int i) {
        boolean z;
        String enumC64572PVw;
        String str;
        String str2;
        int LJIIJ;
        int i2 = c48104IuK.LJLILLLLZI;
        boolean z2 = true;
        if (i2 >= 200 && i2 < 300) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str3 = "HTTP/1.1";
        if (c48104IuK.LJLJJI != null) {
            enumC64572PVw = "HTTP/1.1";
        } else {
            enumC64572PVw = c48104IuK.LJLJJL.LJLILLLLZI.toString();
        }
        sb.append(enumC64572PVw.toUpperCase());
        sb.append(' ');
        sb.append(c48104IuK.LJLILLLLZI);
        sb.append(' ');
        C64797Pbt<?> c64797Pbt = c48104IuK.LJLJJI;
        if (c64797Pbt != null) {
            str = c64797Pbt.LIZ.LIZJ;
        } else {
            str = c48104IuK.LJLJJL.LJLJJI;
        }
        sb.append(str);
        sb.append("\r\n");
        StringBuilder LIZ2 = X1D.LIZ();
        if (c48104IuK.LJLJJI == null) {
            str3 = c48104IuK.LJLJJL.LJLILLLLZI.toString();
        }
        LIZ2.append(str3.toUpperCase());
        LIZ2.append(" ");
        LIZ2.append(c48104IuK.LJLILLLLZI);
        LIZ2.append(" ");
        C64797Pbt<?> c64797Pbt2 = c48104IuK.LJLJJI;
        if (c64797Pbt2 != null) {
            str2 = c64797Pbt2.LIZ.LIZJ;
        } else {
            str2 = c48104IuK.LJLJJL.LJLJJI;
        }
        LIZ2.append(str2);
        C48841JEv.LJIILIIL("TAG_PROXY_headers", X1D.LIZIZ(LIZ2), null);
        List<C48099IuF> list = c48104IuK.LJLJI;
        LIZJ(list);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C48099IuF c48099IuF = (C48099IuF) it.next();
            String str4 = c48099IuF.LIZ;
            String str5 = c48099IuF.LIZIZ;
            YE1.LIZLLL(sb, str4, ": ", str5, "\r\n");
            if ("Content-Range".equalsIgnoreCase(str4) || ("Accept-Ranges".equalsIgnoreCase(str4) && "bytes".equalsIgnoreCase(str5))) {
                z2 = false;
            }
        }
        if (z2 && (LJIIJ = LJIIJ(c48104IuK)) > 0) {
            sb.append("Content-Range: bytes ");
            sb.append(Math.max(i, 0));
            sb.append("-");
            sb.append(LJIIJ - 1);
            sb.append("/");
            sb.append(LJIIJ);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String sb2 = sb.toString();
        C48841JEv.LJIILIIL("TAG_PROXY_WRITE_TO_MP", sb2, null);
        return sb2;
    }

    public static List LJI(String str, List list) {
        Iterator it = ((ArrayList) list).iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            C48099IuF c48099IuF = (C48099IuF) it.next();
            if (c48099IuF.LIZ.equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c48099IuF);
            }
        }
        return arrayList;
    }

    public static void LJIIJJI(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C48099IuF) it.next()).LIZ.equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    public static int LJIILJJIL(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void LIZ(C48104IuK c48104IuK, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        String enumC64572PVw;
        InterfaceC47447Ijj interfaceC47447Ijj;
        C48111IuR LIZ2;
        String str = null;
        if (c48104IuK != null) {
            int i = c48104IuK.LJLILLLLZI;
            int i2 = 0;
            if (i >= 200 && i < 300) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("response code: ");
                LIZ3.append(c48104IuK.LJLILLLLZI);
                C48841JEv.LJIIIZ("TAG_PROXY_Response", X1D.LIZIZ(LIZ3), null);
                C48105IuL c48105IuL = c48104IuK.LJLIL;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("Range", c48105IuL.LIZ("Range"));
                    jSONObject.put("Vpwp-Type", c48105IuL.LIZ("Vpwp-Type"));
                    jSONObject.put("Vpwp-Mp-Range", c48105IuL.LIZ("Vpwp-Mp-Range"));
                    jSONObject.put("Content-Range", c48104IuK.LIZIZ("Content-Range", null));
                    jSONObject.put("Content-Type", c48104IuK.LIZIZ("Content-Type", null));
                    jSONObject.put("Content-Length", c48104IuK.LIZIZ("Content-Length", null));
                    jSONObject.put("url", c48104IuK.LJLIL.LIZ);
                    String LIZ4 = c48105IuL.LIZ("Vpwp-Key");
                    jSONObject.put("Vpwp-Key", LIZ4);
                    if (LJIILJJIL(c48105IuL.LIZ("Vpwp-Flag"), 0) == 1) {
                        i2 = 1;
                    }
                    C47961Is1 c47961Is1 = C47455Ijr.LIZIZ;
                    if (c47961Is1 != null && (LIZ2 = c47961Is1.LIZ(i2, LIZ4)) != null) {
                        jSONObject.put("DB-Content-Type", LIZ2.LIZIZ);
                        jSONObject.put("DB-Content-Length", LIZ2.LIZJ);
                        jSONObject.put("DB-extra", LIZ2.LJ);
                    }
                } catch (Throwable unused) {
                }
                if (c48104IuK.LJLILLLLZI == 416 && (interfaceC47447Ijj = C47455Ijr.LJ) != null) {
                    LJIIIIZZ(new ARunnableS27S0200000_8(jSONObject, interfaceC47447Ijj, 93));
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("response code: ");
                LIZ5.append(c48104IuK.LJLILLLLZI);
                LIZ5.append(" Error extra: ");
                LIZ5.append(jSONObject.toString());
                throw new C48094IuA(X1D.LIZIZ(LIZ5), c48104IuK.LJLILLLLZI);
            }
            String LIZIZ2 = c48104IuK.LIZIZ("Content-Type", null);
            if (LIZIZ2 != null && (LIZIZ2.startsWith("video/") || "application/octet-stream".equals(LIZIZ2) || "binary/octet-stream".equals(LIZIZ2))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || (LIZIZ2 != null && LIZIZ2.startsWith("audio/"))) {
                int LJIIJ = LJIIJ(c48104IuK);
                if (LJIIJ > 0) {
                    if (z) {
                        if (c48104IuK.LJLJJI != null) {
                            enumC64572PVw = "HTTP/1.1";
                        } else {
                            enumC64572PVw = c48104IuK.LJLJJL.LJLILLLLZI.toString();
                        }
                        if (!"http/1.0".equalsIgnoreCase(enumC64572PVw)) {
                            String LIZIZ3 = c48104IuK.LIZIZ("Accept-Ranges", null);
                            if (c48104IuK.LJLILLLLZI != 206 && (LIZIZ3 == null || !LIZIZ3.contains("bytes"))) {
                                StringBuilder LIZIZ4 = C25620zW.LIZIZ("Accept-Ranges: ", LIZIZ3, ", url: ");
                                LIZIZ4.append(c48104IuK.LJLIL.LIZ);
                                C48841JEv.LJIIIZ("TAG_PROXY_Response", X1D.LIZIZ(LIZIZ4), null);
                                StringBuilder LIZIZ5 = C25620zW.LIZIZ("Accept-Ranges: ", LIZIZ3, ", url: ");
                                LIZIZ5.append(c48104IuK.LJLIL.LIZ);
                                throw new C48094IuA(X1D.LIZIZ(LIZIZ5), 14);
                            }
                        } else {
                            throw new C48094IuA("http/1.0 do not support range request.", 13);
                        }
                    }
                    if (!z2 || c48104IuK.LIZ() != null) {
                        return;
                    }
                    C48841JEv.LJIIIZ("TAG_PROXY_Response", "response body null", null);
                    throw new C48094IuA("response body null", 10);
                }
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("Content-Length: ");
                LIZ6.append(LJIIJ);
                C48841JEv.LJIIIZ("TAG_PROXY_Response", X1D.LIZIZ(LIZ6), null);
                throw new C48094IuA(KMP.LJ("Content-Length: ", LJIIJ), 12);
            }
            StringBuilder LIZIZ6 = C25620zW.LIZIZ("Content-Type: ", LIZIZ2, ", url: ");
            LIZIZ6.append(c48104IuK.LJLIL.LIZ);
            C48841JEv.LJIIIZ("TAG_PROXY_Response", X1D.LIZIZ(LIZIZ6), null);
            if (LIZIZ2 != null && LIZIZ2.startsWith("text/")) {
                InputStream LIZ7 = c48104IuK.LIZ();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(LIZ7));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                StringBuilder LIZ8 = X1D.LIZ();
                                LIZ8.append(readLine);
                                LIZ8.append("\n");
                                sb.append(X1D.LIZIZ(LIZ8));
                            }
                        } catch (IOException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        try {
                            break;
                        } catch (IOException e2) {
                        }
                    } finally {
                        try {
                            LIZ7.close();
                        } catch (IOException e22) {
                            C16880lQ.LLLLIIL(e22);
                        }
                    }
                }
                str = sb.toString();
                int length = str.length();
                int i3 = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                if (length <= 500) {
                    i3 = str.length();
                }
                if (!TextUtils.isEmpty(str)) {
                    str = str.substring(0, i3 - 1);
                }
            }
            StringBuilder LIZLLL = C06540Nm.LIZLLL("Content-Type: ", LIZIZ2, ", extra:", str, ", url: ");
            LIZLLL.append(c48104IuK.LJLIL.LIZ);
            throw new C48094IuA(X1D.LIZIZ(LIZLLL), 11);
        }
        C48841JEv.LJIIIZ("TAG_PROXY_Response", "response null", null);
        throw new C48094IuA("response null", 10);
    }

    public static C48111IuR LJIIL(C48104IuK c48104IuK, C47961Is1 c47961Is1, String str, int i) {
        String str2;
        C48111IuR LIZ2 = c47961Is1.LIZ(i, str);
        if (LIZ2 == null) {
            int LJIIJ = LJIIJ(c48104IuK);
            String LIZIZ2 = c48104IuK.LIZIZ("Content-Type", null);
            if (LJIIJ > 0 && !TextUtils.isEmpty(LIZIZ2)) {
                C48105IuL c48105IuL = c48104IuK.LJLIL;
                String str3 = c48105IuL.LIZ;
                String LJIILL = LJIILL(c48105IuL.LIZJ);
                String LJIILL2 = LJIILL(c48104IuK.LJLJI);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", LJIILL);
                    jSONObject.put("responseHeaders", LJIILL2);
                    str2 = jSONObject.toString();
                } catch (Throwable unused) {
                    str2 = "";
                }
                LIZ2 = new C48111IuR(LJIIJ, i, str, LIZIZ2, str2);
                java.util.Map<String, C48111IuR> map = c47961Is1.LIZ.get(i);
                if (map != null) {
                    map.put(str, LIZ2);
                }
                c47961Is1.LIZJ.execute(new ARunnableS27S0200000_8(c47961Is1, LIZ2, 81));
            }
        }
        return LIZ2;
    }
}
