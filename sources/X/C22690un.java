package X;

import android.content.Context;
import android.text.TextUtils;
import com.aweme.storage.CacheStrategy;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.0un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22690un {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static C22730ur LIZLLL;

    public static void LIZ(String str) {
        C1JX.LJIIIIZZ("checkSpace ", str);
    }

    public static void LIZIZ(Context context, boolean z) {
        long j;
        C22730ur c22730ur;
        CacheStrategy cacheStrategy;
        String[] strArr;
        java.util.Set<String> LJIIL;
        FLD fld;
        Context context2;
        C07670Rv.LIZLLL("forceClean canMonitor:", z);
        LIZIZ = true;
        if (z) {
            j = C39687Fhr.LIZLLL(context);
            try {
                long LJFF = C39687Fhr.LJFF();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_storage_size", j);
                jSONObject.put("storage_available_size", LJFF);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key_status", "after_auto_clean_all");
                C09900aA.LJI("disk_auto_clean_monitor", jSONObject2, jSONObject, null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } else {
            j = 0;
        }
        long LJFF2 = C39687Fhr.LJFF();
        long intValue = ((Number) C23900wk.LIZ.getValue()).intValue();
        long intValue2 = ((Number) C23910wl.LIZ.getValue()).intValue();
        StringBuilder LIZJ2 = V10.LIZJ("current available size: ", LJFF2, ", low storage mb size: ");
        LIZJ2.append(intValue);
        LIZJ2.append(", ultra low storage mb size: ");
        LIZJ2.append(intValue2);
        X1D.LIZIZ(LIZJ2);
        Iterator it = ((ArrayList) P8H.LJIIJ()).iterator();
        while (it.hasNext()) {
            InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) it.next();
            boolean LIZ2 = interfaceC37286EkE.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("cleanSliently ModuleName:");
            LIZ3.append(interfaceC37286EkE.LJ());
            LIZ3.append(" cleanResult:");
            LIZ3.append(LIZ2);
            LIZ3.append(" name:");
            LIZ3.append(C16880lQ.LJLLJ(interfaceC37286EkE.getClass()));
            X1D.LIZIZ(LIZ3);
            if (interfaceC37286EkE instanceof AbstractC37295EkN) {
                if (LJFF2 < intValue * 1048576) {
                    interfaceC37286EkE.LIZJ();
                }
                if (LJFF2 < 1048576 * intValue2) {
                    AbstractC37295EkN abstractC37295EkN = (AbstractC37295EkN) interfaceC37286EkE;
                    abstractC37295EkN.LJFF(abstractC37295EkN.LJIIJ());
                    abstractC37295EkN.LJFF(abstractC37295EkN.LJIIIIZZ());
                    abstractC37295EkN.LJFF(abstractC37295EkN.LJI());
                }
            }
        }
        C22730ur c22730ur2 = LIZLLL;
        if (c22730ur2 != null && (fld = c22730ur2.LIZ) != null && (context2 = fld.LIZ) != null) {
            Context LLLLL = C16880lQ.LLLLL(context2);
            C66580QBc.LIZ = false;
            if (LLLLL != null && !C66580QBc.LIZ) {
                C66580QBc.LIZ = true;
                C66580QBc.LIZJ(2, LLLLL);
                C66580QBc.LIZIZ(2);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("clearDrafts ");
                LIZ4.append(2);
                X1D.LIZIZ(LIZ4);
                C66580QBc.LJ(C66580QBc.LJIIIIZZ(2, LLLLL));
                C66580QBc.LIZ(2, LLLLL);
                try {
                    File LJFF3 = C66580QBc.LJFF(LLLLL);
                    try {
                        File LLIIJI = C16880lQ.LLIIJI(LLLLL, "logs");
                        if (LLIIJI != null && LLIIJI.exists() && !TextUtils.equals(LLIIJI.getAbsolutePath(), LJFF3.getAbsolutePath())) {
                            C56463MDz.LJI(LLIIJI);
                        }
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    File file = new File(C16880lQ.LLIIJLIL(LLLLL), "logs");
                    if (file.exists() && !TextUtils.equals(file.getAbsolutePath(), LJFF3.getAbsolutePath())) {
                        C56463MDz.LJI(file);
                    }
                    File LJIIIZ = P8H.LJIIIZ(LLLLL);
                    if (LJIIIZ != null) {
                        File file2 = new File(LJIIIZ, "logs");
                        if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), LJFF3.getAbsolutePath())) {
                            C56463MDz.LJI(file2);
                        }
                    }
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                File file3 = new File(C66580QBc.LJIILIIL(), "fresco_cache");
                File file4 = new File(C16880lQ.LLIIIZ(LLLLL), "picture/fresco_cache");
                if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file3.getAbsolutePath())) {
                    C56463MDz.LJI(file4);
                }
                File file5 = new File(C16880lQ.LLIIIL(LLLLL), "picture/fresco_cache");
                if (file5.exists() && !TextUtils.equals(file5.getAbsolutePath(), file3.getAbsolutePath())) {
                    C56463MDz.LJI(file5);
                }
                File LJIIIIZZ = P8H.LJIIIIZZ(LLLLL);
                if (LJIIIIZZ != null) {
                    File file6 = new File(LJIIIIZZ, "picture/fresco_cache");
                    if (file6.exists() && !TextUtils.equals(file6.getAbsolutePath(), file3.getAbsolutePath())) {
                        C56463MDz.LJI(file6);
                    }
                }
                File cacheFile = C47242IgQ.LIZ().LJIIL(EnumC47317Ihd.VideoCache).getCacheFile();
                if (cacheFile != null) {
                    File file7 = new File(C16880lQ.LLIIIL(LLLLL), "cache");
                    if (file7.exists() && !TextUtils.equals(file7.getAbsolutePath(), cacheFile.getAbsolutePath())) {
                        C66580QBc.LIZLLL(C66580QBc.LJIJJLI(file7, 0));
                    }
                    File file8 = new File(C16880lQ.LLIIIZ(LLLLL), "cache");
                    if (file8.exists() && !TextUtils.equals(file8.getAbsolutePath(), cacheFile.getAbsolutePath())) {
                        C66580QBc.LIZLLL(C66580QBc.LJIJJLI(file8, 0));
                    }
                    File LJIIIIZZ2 = P8H.LJIIIIZZ(LLLLL);
                    if (LJIIIIZZ2 != null) {
                        File file9 = new File(LJIIIIZZ2, "cache");
                        if (file9.exists() && !TextUtils.equals(file9.getAbsolutePath(), cacheFile.getAbsolutePath())) {
                            C66580QBc.LIZLLL(C66580QBc.LJIJJLI(file9, 0));
                        }
                    }
                }
                C66580QBc.LIZ = false;
            }
        }
        if (context != null && C16880lQ.LLIIIL(context) != null && C16880lQ.LLIIIL(context).getParentFile() != null && C16880lQ.LLIIIZ(context) != null && C16880lQ.LLIIIZ(context).getParentFile() != null && (cacheStrategy = (c22730ur = LIZLLL).LIZJ) != null && (strArr = cacheStrategy.forceList) != null && strArr.length > 0) {
            if (c22730ur.LIZ == null) {
                LJIIL = null;
            } else {
                LJIIL = C66580QBc.LJIIL();
            }
            for (String str : cacheStrategy.forceList) {
                if (LJIIL != null && !LJIIL.contains(str)) {
                    File file10 = new File(str);
                    if ((LIZJ(file10, C16880lQ.LLIIIL(context).getParentFile()) || LIZJ(file10, C16880lQ.LLIIIZ(context).getParentFile())) && file10.exists()) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("cleanOnline file:");
                        LIZ5.append(file10.getAbsolutePath());
                        X1D.LIZIZ(LIZ5);
                        if (file10.isFile()) {
                            C16880lQ.LLLZZIL(file10);
                        } else {
                            C56463MDz.LJI(file10);
                        }
                    }
                }
            }
        }
        C22730ur c22730ur3 = LIZLLL;
        if (c22730ur3 != null && c22730ur3.LIZ != null && C84763XOl.LJIIIIZZ() == null) {
            C22740us.LIZIZ(LIZLLL.LIZIZ, context);
        }
        if (z && j > 0) {
            try {
                long LIZLLL2 = C39687Fhr.LIZLLL(context);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("app_storage_size", LIZLLL2);
                long j2 = j - LIZLLL2;
                jSONObject3.put("clean_size", j2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("key_status", "after_auto_clean_all");
                C09900aA.LJI("disk_auto_clean_monitor", jSONObject4, jSONObject3, null);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("monitor clean size:");
                LIZ6.append(j2);
                X1D.LIZIZ(LIZ6);
            } catch (Exception e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
    }

    public static boolean LIZJ(File file, File file2) {
        if (file2 != null) {
            try {
                if (file2.getCanonicalPath() == null) {
                    return false;
                }
                while (file != null) {
                    if (file.getCanonicalPath() == null) {
                        break;
                    }
                    if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                        file = file.getParentFile();
                    } else {
                        return true;
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }
}
