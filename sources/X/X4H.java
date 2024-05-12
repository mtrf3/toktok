package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X4H {
    public static final X40<Integer, X4H> LJ = new X40<>(16, 16);
    public static final X4H LJFF = new X4H(null);
    public static JSONObject LJI;
    public static JSONObject LJII;
    public static Boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static X4H LJIIJ;
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final Boolean LIZJ;
    public int LIZLLL;

    static {
        LIZJ();
    }

    public static JSONObject LIZIZ() {
        return ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getDownloadSetting();
    }

    public static void LIZJ() {
        boolean z;
        Boolean bool;
        JSONObject downloadSetting = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getDownloadSetting();
        boolean z2 = false;
        if (downloadSetting.optInt("disable_task_setting", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        LJIIIZ = z;
        LJI = downloadSetting.optJSONObject("disabled_task_keys");
        JSONObject optJSONObject = downloadSetting.optJSONObject("bugfix");
        if (optJSONObject != null && optJSONObject.has("default")) {
            if (optJSONObject.optInt("default", 0) == 1) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        LJII = optJSONObject;
        LJIIIIZZ = bool;
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SettingUpdate:");
            LIZ.append(downloadSetting.toString());
            C65210PiY.LIZIZ("DownloadSetting", "init", X1D.LIZIZ(LIZ));
        }
    }

    public final String LJIIJJI() {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has("setting_tag") && !LIZLLL("setting_tag")) {
            return this.LIZ.optString("setting_tag", "");
        }
        return LIZIZ().optString("setting_tag", "");
    }

    public X4H(JSONObject jSONObject) {
        Boolean bool;
        this.LIZ = jSONObject;
        JSONObject jSONObject2 = null;
        r2 = null;
        r2 = null;
        Boolean bool2 = null;
        if (jSONObject != null && !LIZLLL("bugfix")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("bugfix");
            if (optJSONObject != null && optJSONObject.has("default") && !LIZLLL("default")) {
                bool2 = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
            }
            bool = bool2;
            jSONObject2 = optJSONObject;
        } else {
            bool = null;
        }
        this.LIZIZ = jSONObject2;
        this.LIZJ = bool;
    }

    public static X4H LIZ(DownloadInfo downloadInfo) {
        if (LJIIIZ) {
            return LJFF;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new X4H(new JSONObject(downloadSettingString));
            }
        } catch (Throwable unused) {
        }
        return LJFF;
    }

    public static boolean LIZLLL(String str) {
        JSONObject jSONObject = LJI;
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    public static X4H LJ(int i) {
        return LJFF(i, null);
    }

    public static void LJIIL(int i) {
        X4H x4h = LJIIJ;
        if (x4h != null && x4h.LIZLLL == i) {
            LJIIJ = null;
        }
        X40<Integer, X4H> x40 = LJ;
        synchronized (x40) {
            x40.remove(Integer.valueOf(i));
        }
    }

    public final JSONObject LJIIIZ(String str) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optJSONObject(str);
        }
        return LIZIZ().optJSONObject(str);
    }

    public static X4H LJFF(int i, DownloadInfo downloadInfo) {
        X4H x4h;
        DownloadInfo downloadInfo2;
        X4H x4h2 = LJIIJ;
        if (x4h2 != null && x4h2.LIZLLL == i) {
            return x4h2;
        }
        X40<Integer, X4H> x40 = LJ;
        synchronized (x40) {
            x4h = x40.get(Integer.valueOf(i));
        }
        if (x4h == null) {
            if (downloadInfo == null) {
                if (LJIIIZ) {
                    x4h = LJFF;
                } else if (((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext() != null && (downloadInfo2 = ((IDownloadProcessDispatcherService) X41.LIZ(IDownloadProcessDispatcherService.class)).getDownloadInfo(i)) != null) {
                    x4h = LIZ(downloadInfo2);
                } else {
                    x4h = LJFF;
                }
            } else {
                x4h = LIZ(downloadInfo);
            }
            synchronized (x40) {
                x40.put(Integer.valueOf(i), x4h);
            }
        }
        x4h.LIZLLL = i;
        LJIIJ = x4h;
        return x4h;
    }

    public final boolean LJI(String str, boolean z) {
        if (this.LIZIZ != null && !LIZLLL(str)) {
            if (this.LIZIZ.has(str)) {
                if (this.LIZIZ.optInt(str, z ? 1 : 0) != 1) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.LIZJ;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = LJII;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                if (LJII.optInt(str, z ? 1 : 0) != 1) {
                    return false;
                }
                return true;
            }
            Boolean bool2 = LJIIIIZZ;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z;
    }

    public final double LJII(String str, double d) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optDouble(str, d);
        }
        return LIZIZ().optDouble(str, d);
    }

    public final int LJIIIIZZ(String str, int i) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optInt(str, i);
        }
        return LIZIZ().optInt(str, i);
    }

    public final long LJIIJ(String str, long j) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optLong(str, j);
        }
        return LIZIZ().optLong(str, j);
    }
}
