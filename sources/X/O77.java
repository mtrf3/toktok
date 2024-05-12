package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O77 {
    public static int LJ() {
        int i;
        int LIZIZ = (int) C61384O7g.LIZIZ(C61359O6h.LJIILL, 0);
        if (LIZIZ <= 0) {
            Point point = new Point();
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(C61359O6h.LJIILL, "window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            double d = C61359O6h.LJIILL.getResources().getDisplayMetrics().density;
            if (d <= 1.1d) {
                i = 100;
            } else if (d <= 1.6d) {
                i = 960;
            } else {
                i = 1260;
            }
            int i2 = point.y;
            O7B o7b = O7B.LJIIIZ;
            Context context = C61359O6h.LJIILL;
            o7b.getClass();
            return (((i2 - O7B.LIZIZ(context)) * 200) / i) + ((int) C61384O7g.LIZIZ(C61359O6h.LJIILL, 25.0f));
        }
        return LIZIZ;
    }

    public static long LJII() {
        boolean z;
        if (!C61359O6h.LJJJJ) {
            return System.currentTimeMillis();
        }
        if ((C61359O6h.LJJJJI / 1000) % 10 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && !C61359O6h.LJJIIZ && C61359O6h.LJIILJJIL != null && C1E4.LJIJ() != 0) {
            C61359O6h.LJIILJJIL.getClass();
            return C1E4.LJIJ();
        }
        O7A LIZ = O7A.LIZ();
        if (!LIZ.LJII) {
            long j = LIZ.LJI;
            if (j != -1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("time check, remote time back:");
                LIZ2.append(j);
                C1DJ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                return j;
            }
        }
        O76 LJI = O76.LJI();
        if (LJI.LIZ == 0) {
            LJI.LIZ = LJI.LIZJ.LIZJ("key_pre_launch_time", 0L);
        }
        long j2 = LJI.LIZ;
        if (j2 == 0) {
            if ((C61359O6h.LJJJJI / 10) % 10 != 1) {
                return -1L;
            }
            C1DJ.LJIIIIZZ("time check, hasn't preLaunchTime");
            return System.currentTimeMillis();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j2) {
            if (C61359O6h.LJJJJI % 10 != 1) {
                return -1L;
            }
            return System.currentTimeMillis();
        }
        O76 LJI2 = O76.LJI();
        if (LJI2.LIZIZ == 0) {
            LJI2.LIZIZ = LJI2.LIZJ.LIZJ("key_pre_remote_time", 0L);
        }
        long j3 = LJI2.LIZIZ;
        long j4 = elapsedRealtime - j2;
        StringBuilder LIZJ = V10.LIZJ("time check, last remote time: ", j3, ", time gap between launch: ");
        LIZJ.append(j4);
        LIZJ.append(", current time calculated: ");
        long j5 = j3 + j4;
        LIZJ.append(j5);
        C1DJ.LJIIIIZZ(X1D.LIZIZ(LIZJ));
        return j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        if (android.provider.Settings.Secure.getInt(r10.getContentResolver(), "buttons_show_on_screen_navkeys", 0) != 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.StringBuilder LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O77.LJIIIIZZ():java.lang.StringBuilder");
    }

    public static String LJIILL() {
        StringBuilder sb = new StringBuilder(5120);
        O7O LIZIZ = C61359O6h.LIZIZ();
        LIZIZ.LJIJI = true;
        try {
            sb.append("/api/ad/v2/ack/splash/");
            sb.append("?_unused=0");
            sb.append((CharSequence) LJIIIIZZ());
            sb.append(LIZIZ.toString());
            sb.append("&refresh_num=");
            sb.append(O76.LJI().LJII());
            if (C61359O6h.LJJIJIIJI != -1) {
                sb.append("&is_cold_start=");
                sb.append(C61359O6h.LJJIJIIJI);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return sb.toString();
    }

    public static JSONObject LJIL() {
        try {
            String LIZLLL = O76.LJI().LIZJ.LIZLLL("key_splash_show_times_map");
            if (!TextUtils.isEmpty(LIZLLL)) {
                return new JSONObject(LIZLLL);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean LIZIZ(String str) {
        if (C78886Uxe.LJJIIZI(str)) {
            return false;
        }
        try {
            int LJIILLIIL = LJIILLIIL(str);
            if (LJIILLIIL != 1) {
                if (LJIILLIIL != 2 && LJIILLIIL != 5) {
                    return false;
                }
                return true;
            }
            android.net.Uri parse = UriProtector.parse(str);
            if ("sslocal".equalsIgnoreCase(parse.getScheme())) {
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            return O7K.LIZJ(C61359O6h.LJIILL, intent);
        } catch (Exception e) {
            O8O.LIZLLL().LIZ(e, "key_exception_open_url");
            return false;
        }
    }

    public static void LIZLLL(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static String LJIIIZ(HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (!C78886Uxe.LJJIIZI(entry.getKey()) && !C78886Uxe.LJJIIZI(entry.getValue())) {
                sb.append("&");
                sb.append(C16880lQ.LLLZ("%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        return sb.toString();
    }

    public static String LJIIJ(String str) {
        if (C78886Uxe.LJJIIZI(str) || TextUtils.isEmpty(null)) {
            return null;
        }
        return LIZJ(null, str);
    }

    public static String LJIIJJI(O7J o7j) {
        List<String> list;
        if (o7j == null || (list = o7j.LIZ) == null || list.isEmpty()) {
            return null;
        }
        String str = (String) ListProtector.get(list, 0);
        if (!C78886Uxe.LJJIIZI(str) || list.size() < 2) {
            return str;
        }
        String str2 = (String) ListProtector.get(list, 1);
        if (!C78886Uxe.LJJIIZI(str2) || list.size() < 3) {
            return str2;
        }
        return (String) ListProtector.get(list, 2);
    }

    public static String LJIILIIL(String str) {
        String str2;
        String str3 = null;
        if (C61359O6h.LJII().LIZIZ) {
            if (C78886Uxe.LJJIIZI(str)) {
                return null;
            }
            String LIZLLL = C61359O6h.LIZLLL();
            String LJFF = C61359O6h.LJFF();
            if (TextUtils.isEmpty(LIZLLL) && TextUtils.isEmpty(LJFF)) {
                return null;
            }
            if (LIZLLL != null && LIZLLL.equals(LJFF)) {
                return LIZJ(LIZLLL, str);
            }
            if (!TextUtils.isEmpty(LIZLLL)) {
                str2 = LIZJ(LIZLLL, str);
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(LJFF)) {
                str3 = LIZJ(LJFF, str);
            }
            if ((TextUtils.isEmpty(str2) || !C1B6.LIZIZ(str2)) && !TextUtils.isEmpty(str3) && C1B6.LIZIZ(str3)) {
                return str3;
            }
            return str2;
        }
        if (C78886Uxe.LJJIIZI(str)) {
            return null;
        }
        String LIZLLL2 = C61359O6h.LIZLLL();
        if (TextUtils.isEmpty(LIZLLL2)) {
            return null;
        }
        return LIZJ(LIZLLL2, str);
    }

    public static JSONArray LJIILJJIL(List<O7E> list) {
        JSONArray jSONArray = new JSONArray();
        if (C30591Hz.LJIILLIIL(list)) {
            return jSONArray;
        }
        try {
            Iterator<O7E> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = it.next().LLIIJLIL;
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static int LJIILLIIL(String str) {
        if (C78886Uxe.LJJIIZI(str)) {
            return 0;
        }
        try {
            if (C78886Uxe.LJJIIZI(UriProtector.parse(str).getScheme())) {
                return 0;
            }
            if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
                return 2;
            }
            if (!C78977Uz7.LJJJJZI(str)) {
                return 1;
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String LJIIZILJ(O7G o7g) {
        if (o7g == null || !o7g.LIZJ()) {
            return null;
        }
        return LJIILIIL(o7g.LIZLLL);
    }

    public static String LJIJ(O7G o7g) {
        List<String> list;
        if (o7g == null || (list = o7g.LIZJ) == null || ((ArrayList) list).isEmpty()) {
            return null;
        }
        return O7K.LIZIZ((String) ListProtector.get(o7g.LIZJ, 0));
    }

    public static boolean LJIJJ(O7E o7e) {
        if (o7e == null) {
            return false;
        }
        return o7e.LJIIIZ();
    }

    public static byte[] LJIJJLI(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read > -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        LIZLLL(byteArrayOutputStream);
                        return byteArrayOutputStream.toByteArray();
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                    LIZLLL(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                LIZLLL(byteArrayOutputStream);
                throw th;
            }
        }
    }

    public static String LIZJ(String str, String str2) {
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                C16880lQ.LLLZZIL(file);
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(C78840Uwu.LJJIIJZLJL(str2));
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            C1DJ.LJIJJ(" illegal cache path ");
            return null;
        }
    }

    public static byte[] LJFF(String str, byte[] bArr) {
        try {
            int length = str.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr2[i] = CastIntegerProtector.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 12, bArr.length);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(bArr, 0, 12));
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(copyOfRange);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static List<O7E> LJI(List<O7E> list, List<O7E> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            O7E o7e = (O7E) ListProtector.get(list, i);
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            if (o7e.LJII() <= calendar.getTimeInMillis() && currentTimeMillis < o7e.LJI()) {
                arrayList.add(o7e);
                C1DJ.LJIJI(o7e.LJLL, "preload progress: suitable first-show ad");
            } else {
                C1DJ.LJIJI(o7e.LJLL, "preload progress: first-show ad expired");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C30591Hz.LJIILLIIL(list2)) {
            return arrayList;
        }
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            O7E o7e2 = (O7E) it.next();
            if (o7e2.LLII == 1) {
                arrayList2.add(o7e2);
                C1DJ.LJIJI(o7e2.LJLL, "preload progress: get one first-show ad");
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static int LJIIL(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return ColorProtector.parseColor(str2);
        }
    }

    public static boolean LJIJI(String str, O76 o76) {
        if (C78886Uxe.LJJIIZI(str)) {
            return false;
        }
        String[] strArr = {LJIIJ(str), LJIILIIL(str)};
        int i = 0;
        do {
            String str2 = strArr[i];
            if (!TextUtils.isEmpty(str2) && C1B6.LIZIZ(str2)) {
                if (o76.LJIIJ(str)) {
                    return true;
                }
                O79 LIZIZ = O79.LIZIZ();
                LIZIZ.getClass();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject2.putOpt("uri", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject2.putOpt("path", str2);
                    }
                    jSONObject2.put("log_extra", O7I.LIZIZ().LIZJ());
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                LIZIZ.LIZLLL("splash_ad", "error_save_sp", jSONObject, 84378473382L);
                O7I.LIZIZ().getClass();
                C61357O6f LIZIZ2 = C61357O6f.LIZIZ();
                LIZIZ2.getClass();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    LIZIZ2.LIZ.put(str2, str);
                }
            }
            i++;
        } while (i < 2);
        synchronized (o76) {
            if (!C78886Uxe.LJJIIZI(str)) {
                O7L o7l = o76.LIZJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("splash_ad_url_has_download_");
                LIZ.append(C78840Uwu.LJJIIJZLJL(str));
                String LIZIZ3 = X1D.LIZIZ(LIZ);
                O7M o7m = o7l.LIZ;
                if (LIZIZ3 != null) {
                    o7m.LIZIZ.remove(LIZIZ3);
                } else {
                    o7m.getClass();
                }
                o7l.LIZ();
            }
        }
        return false;
    }

    public static List<O7E> LIZ(JSONArray jSONArray, long j, boolean z) {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (z) {
            jSONObject = LJIL();
        } else {
            jSONObject = null;
        }
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                O7E o7e = new O7E();
                o7e.LJ(optJSONObject, j, z);
                if (z) {
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt(String.valueOf(o7e.LJLL), 0);
                        o7e.LLJI = optInt;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("show times updated, id:");
                        C06510Nj.LIZIZ(LIZ, o7e.LJLL, ", current show time: ", optInt);
                        C1DJ.LJIIIIZZ(X1D.LIZIZ(LIZ));
                    }
                } else if (LJIJJ(o7e)) {
                    O79.LIZIZ().LJII(o7e, "topview_boarding");
                }
                arrayList.add(o7e);
            }
        }
        return arrayList;
    }
}
