package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O6i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61360O6i implements InterfaceC39140FXs {
    public static volatile C61360O6i LIZ;

    public static void LIZIZ() {
        int i;
        try {
            if (C61359O6h.LIZJ == null) {
                C1DJ.LJIIJ("SplashNetWork is null! please setup it in SplashAdManager!");
                i = 1;
            } else {
                i = 0;
            }
            if (C61359O6h.LIZIZ == null) {
                C1DJ.LJIIJ("EventListener is null! please setup it in SplashAdManager!");
                i = 2;
            }
            if (C61359O6h.LIZLLL == null) {
                C1DJ.LJIIJ("SplashAdResourceLoader is null! please setup it in SplashAdManager!");
                i = 3;
            }
            C1DJ.LJIIJ("SplashAdPlatformSupportCallback is null! please setup it in SplashAdManager!");
            if (i > 0) {
                O8O.LIZLLL().LJIIIZ("service_sdk_engine_invalidate", i, null);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static C61360O6i LIZJ() {
        if (LIZ == null) {
            synchronized (C61360O6i.class) {
                if (LIZ == null) {
                    LIZ = new C61360O6i();
                }
            }
        }
        return LIZ;
    }

    public static boolean LJ() {
        boolean z = false;
        if (!C61359O6h.LJJIL) {
            C1DJ.LJJJ(" SDK is unavailable ");
            return false;
        }
        if (!C61359O6h.LJJI) {
            C1DJ.LJIIJ("splash ad data is not ready, ad is unavailable");
            O8O.LIZLLL().LJIIIZ("service_load_local_status_monitor", 1, null);
        } else {
            z = true;
        }
        LIZIZ();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static final boolean LIZLLL() {
        ?? r4;
        long j;
        Pair pair;
        O7E o7e;
        if (!LJ()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        O8F LIZ2 = O74.LIZIZ().LIZ();
        O7E o7e2 = LIZ2.LIZ;
        if (o7e2 != null) {
            r4 = 1;
            C1DJ.LJIJI(o7e2.LJLL, " there is a suitable ad this time ");
            C61372O6u LIZ3 = C61372O6u.LIZ();
            LIZ3.LIZ = LIZ2.LIZ;
            LIZ3.LIZIZ = System.currentTimeMillis();
        } else {
            r4 = 0;
            C1DJ.LJIJJ(" there is no suitable ad this time ");
            C61353O6b.LIZ();
            C61357O6f.LIZIZ().LIZLLL();
        }
        if (C61359O6h.LJJJJ) {
            if (C61359O6h.LJIILJJIL != null) {
                j = C1E4.LJIJ();
            } else {
                j = 0;
            }
            O76 LJI = O76.LJI();
            if (LJI.LIZ == 0) {
                LJI.LIZ = LJI.LIZJ.LIZJ("key_pre_launch_time", 0L);
            }
            long j2 = LJI.LIZ;
            int i = -1;
            if (j2 == 0) {
                if ((C61359O6h.LJJJJI / 10) % 10 == 1) {
                    pair = new Pair(-1, 0L);
                } else {
                    pair = new Pair(0, 0L);
                }
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < j2) {
                    if (C61359O6h.LJJJJI % 10 == 1) {
                        pair = new Pair(-1, 0L);
                    } else {
                        pair = new Pair(1, 0L);
                    }
                } else {
                    O76 LJI2 = O76.LJI();
                    if (LJI2.LIZIZ == 0) {
                        LJI2.LIZIZ = LJI2.LIZJ.LIZJ("key_pre_remote_time", 0L);
                    }
                    long abs = Math.abs(j - ((elapsedRealtime - j2) + LJI2.LIZIZ));
                    if (abs >= 1000) {
                        pair = new Pair(2, Long.valueOf(abs));
                        i = -1;
                    } else {
                        i = -1;
                        pair = new Pair(-1, 0L);
                    }
                }
            }
            if (((Integer) pair.first).intValue() != i) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("invalid_reason", pair.first);
                hashMap.put("splash_show", Integer.valueOf((int) r4));
                hashMap.put("error_range", pair.second);
                HashMap<String, Object> hashMap2 = new HashMap<>();
                if (r4 == 0) {
                    hashMap2.put("log_extra", O76.LJI().LJ());
                }
                O79 LIZIZ = O79.LIZIZ();
                if (r4 != 0) {
                    o7e = LIZ2.LIZ;
                } else {
                    o7e = null;
                }
                LIZIZ.LJI(o7e, 84378473382L, "time_check_error", hashMap2, hashMap);
            }
        }
        C07670Rv.LIZLLL("UDPClient. setIsFirstTimeRequestAd: ", false);
        C61359O6h.LJJIIZ = false;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
            O8O.LIZLLL().LJII("bda_splash_pick_model_duration", r4, jSONObject, null);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return r4;
    }

    public static final byte[] LIZ(String str, String str2) {
        BufferedInputStream bufferedInputStream;
        byte[] bArr = null;
        bArr = null;
        bArr = null;
        BufferedInputStream bufferedInputStream2 = null;
        bArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        try {
                            bArr = O77.LJFF(str2, O77.LJIJJLI(bufferedInputStream));
                        } catch (FileNotFoundException e) {
                            e = e;
                            C16880lQ.LLLLIIL(e);
                            O77.LIZLLL(bufferedInputStream);
                            return bArr;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream2 = bufferedInputStream;
                        O77.LIZLLL(bufferedInputStream2);
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    O77.LIZLLL(bufferedInputStream2);
                    throw th;
                }
                O77.LIZLLL(bufferedInputStream);
            }
        }
        return bArr;
    }
}
