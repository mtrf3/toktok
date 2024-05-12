package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PC5 extends C78248UnM {
    public static QXX LJLJJL = null;
    public static String LJLJJLL = null;
    public static Boolean LJLJL = null;
    public static String LJLJLJ = null;
    public static int LJLJLLL = -1;
    public static String LJLL = null;
    public static int LJLLI = -1;
    public static String LJLLILLLL = null;
    public static String LJLLJ = null;
    public static long LJLLL = -1;
    public static long LJLLLL = 0;
    public static int LJLLLLLL = -1;
    public static JSONObject LJLZ = null;
    public static java.util.Map<String, String> LJZ = null;
    public static long LJZI = -1;

    public static int LJIIZILJ() {
        return LJLJJL.LLFZ();
    }

    public static String LJIJ() {
        if (TextUtils.isEmpty(LJLLILLLL)) {
            synchronized (PC5.class) {
                if (TextUtils.isEmpty(LJLLILLLL)) {
                    LJLLILLLL = LJLJJL.LLIIII();
                }
            }
        }
        return LJLLILLLL;
    }

    public static String LJIJI() {
        if (LJLJLJ == null) {
            synchronized (PC5.class) {
                if (LJLJLJ == null) {
                    LJLJLJ = LJLJJL.LLIIIZ();
                }
            }
        }
        return LJLJLJ;
    }

    public static String LJIJJ() {
        if (LJLJJLL == null) {
            synchronized (PC5.class) {
                if (LJLJJLL == null) {
                    LJLJJLL = LJLJJL.LLILZIL();
                }
            }
        }
        return LJLJJLL;
    }

    public static String LJIJJLI() {
        return LJLJJL.LLIIJI();
    }

    public static long LJIL() {
        if (LJLLLL <= 0) {
            LJLLLL = System.currentTimeMillis();
        }
        return LJLLLL;
    }

    public static String LJJ() {
        if (LJLLLLLL == -1) {
            synchronized (PC5.class) {
                if (LJLLLLLL == -1) {
                    LJLLLLLL = LJLJJL.LLILIL();
                }
            }
        }
        return String.valueOf(LJLLLLLL);
    }

    public static String LJJI() {
        if (TextUtils.isEmpty(LJLLJ)) {
            synchronized (PC5.class) {
                if (TextUtils.isEmpty(LJLLJ)) {
                    LJLLJ = LJLJJL.LLIZ();
                }
            }
        }
        return LJLLJ;
    }

    public static JSONObject LJJIFFI() {
        if (LJLZ == null) {
            synchronized (PC5.class) {
                if (LJLZ == null) {
                    LJLZ = LJLJJL.LLJI();
                }
            }
        }
        return LJLZ;
    }

    public static long LJJII() {
        if (LJLLL < 0) {
            LJLLL = System.currentTimeMillis();
        }
        return LJLLL;
    }

    public static int LJJIII() {
        if (LJLJLLL == -1) {
            synchronized (PC5.class) {
                if (LJLJLLL == -1) {
                    LJLJLLL = LJLJJL.LLJJI();
                }
            }
        }
        return LJLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map<String, String> LJJIIJ() {
        if (LJZ == null) {
            HashMap hashMap = new HashMap();
            LJZ = hashMap;
            hashMap.put("aid", String.valueOf(LJIIZILJ()));
            LJZ.put("os", "Android");
            LJZ.put("device_platform", "android");
            java.util.Map<String, String> map = LJZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Build.VERSION.SDK_INT);
            LIZ.append("");
            map.put("os_api", X1D.LIZIZ(LIZ));
            LJZ.put("update_version_code", String.valueOf(LJJIII()));
            LJZ.put("version_code", LJIJ());
            LJZ.put("channel", LJIJI());
            LJZ.put("device_model", Build.MODEL);
            LJZ.put("device_brand", Build.BRAND);
        }
        LJZ.put("device_id", LJIJJLI());
        if (C78248UnM.LJIIJ()) {
            LJZ.put("_log_level", "debug");
        }
        try {
            java.util.Map LLILLL = LJLJJL.LLILLL();
            if (LLILLL != null && LLILLL.size() > 0) {
                for (Map.Entry entry : LLILLL.entrySet()) {
                    LJZ.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return LJZ;
    }

    public static int LJJIIJZLJL() {
        if (LJLLI == -1) {
            synchronized (PC5.class) {
                if (LJLLI == -1) {
                    LJLLI = LJLJJL.LLJJIJIIJIL();
                }
            }
        }
        return LJLLI;
    }

    public static boolean LJJIIZ() {
        boolean z;
        if (LJLJL == null) {
            synchronized (PC5.class) {
                if (LJLJL == null) {
                    String LJIJJ = LJIJJ();
                    if (LJIJJ != null) {
                        if (LJIJJ.contains(":")) {
                            LJLJL = Boolean.FALSE;
                        } else if (LJIJJ.equals(C78248UnM.LJLJJI.getPackageName())) {
                            z = true;
                            LJLJL = Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    LJLJL = Boolean.valueOf(z);
                }
            }
        }
        return LJLJL.booleanValue();
    }
}
