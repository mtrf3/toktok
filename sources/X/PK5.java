package X;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PK5 implements InterfaceC64239PJb {
    public final /* synthetic */ File LIZ;
    public final /* synthetic */ C64266PKc LIZIZ;
    public final /* synthetic */ PLI LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ JSONObject LJ;
    public final /* synthetic */ CrashType LJFF;
    public final /* synthetic */ PKA LJI;
    public final /* synthetic */ JSONObject LJII;
    public final /* synthetic */ PKL LJIIIIZZ;

    @Override // X.InterfaceC64239PJb
    public final boolean LIZ(JSONObject jSONObject) {
        PK7 pk7;
        String str;
        C63987P9j LJIIJ;
        JSONObject optJSONObject;
        boolean LJ = PJA.LJ();
        PKN.LJIILIIL(String.valueOf(LJ), "filters", "enable_simplify_request", jSONObject);
        PKN.LJIILIIL(String.valueOf(PJA.LJFF()), "filters", "enable_upload_os_mem", jSONObject);
        String str2 = "unknown_java";
        if (LJ) {
            ArrayList arrayList = new ArrayList();
            try {
                File[] listFiles = this.LIZ.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (!TextUtils.isEmpty(name)) {
                            String[] strArr = PKL.LJIIIIZZ;
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (name.endsWith(strArr[i])) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    String[] strArr2 = PKL.LJIIIZ;
                                    int length2 = strArr2.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length2) {
                                            if (strArr2[i2].equals(name)) {
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            arrayList.add(file);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                File[] listFiles2 = C78596Usy.LJIJI(this.LJIIIIZZ.LIZ, this.LIZIZ.LIZ).listFiles();
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        if (!"logcat.txt".equals(file2.getName()) || !jSONObject.has("logcat")) {
                            String name2 = file2.getName();
                            if (!TextUtils.isEmpty(name2)) {
                                String[] strArr3 = PKL.LJIIJJI;
                                int length3 = strArr3.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length3) {
                                        if (strArr3[i3].equals(name2)) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        arrayList2.add(file2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            ArrayList arrayList3 = new ArrayList();
            if (arrayList.size() > 0) {
                arrayList3.add(new PK7((File[]) arrayList.toArray(new File[arrayList.size()]), true));
            }
            if (arrayList2.size() > 0) {
                arrayList3.add(new PK7((File[]) arrayList2.toArray(new File[arrayList2.size()]), true));
            }
            PK7 LJ2 = C64263PJz.LJ(this.LIZJ.LIZIZ);
            if (LJ2 != null) {
                arrayList3.add(LJ2);
            }
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                arrayList3.add(new PK7(new File(this.LIZLLL), false));
            }
            PK7 LJ3 = PKQ.LJ(this.LJ.optJSONArray("alive_pids"));
            if (LJ3 != null) {
                arrayList3.add(LJ3);
            }
            if (arrayList3.size() > 0) {
                PK7[] pk7Arr = new PK7[arrayList3.size()];
                CrashType crashType = this.LJFF;
                if (crashType != null) {
                    str2 = crashType.getName();
                }
                str = null;
                LJIIJ = C63986P9i.LJIIJ(str2, this.LJI.LIZ, jSONObject.toString(), null, (PK7[]) arrayList3.toArray(pk7Arr));
            } else {
                str = null;
                CrashType crashType2 = this.LJFF;
                if (crashType2 != null) {
                    str2 = crashType2.getName();
                }
                LJIIJ = C63986P9i.LJIIJ(str2, this.LJI.LIZ, jSONObject.toString(), null, null);
            }
        } else {
            CrashType crashType3 = this.LJFF;
            if (crashType3 != null) {
                str2 = crashType3.getName();
            }
            String str3 = this.LJI.LIZ;
            String jSONObject2 = jSONObject.toString();
            PK7[] pk7Arr2 = new PK7[6];
            pk7Arr2[0] = new PK7(this.LIZ, true);
            pk7Arr2[1] = new PK7(C78596Usy.LJIJI(this.LJIIIIZZ.LIZ, this.LIZIZ.LIZ), true);
            pk7Arr2[2] = new PK7(PJ7.LIZIZ(), false);
            if (TextUtils.isEmpty(this.LIZLLL)) {
                pk7 = null;
            } else {
                pk7 = new PK7(new File(this.LIZLLL), false);
            }
            pk7Arr2[3] = pk7;
            pk7Arr2[4] = C64263PJz.LJ(this.LIZJ.LIZIZ);
            pk7Arr2[5] = PKQ.LJ(this.LJ.optJSONArray("alive_pids"));
            str = null;
            LJIIJ = C63986P9i.LJIIJ(str2, str3, jSONObject2, null, pk7Arr2);
        }
        JSONObject jSONObject3 = this.LJII;
        if (jSONObject3 != null && (optJSONObject = jSONObject3.optJSONObject("last_resume_activity")) != null) {
            str = optJSONObject.optString("name");
        }
        UC0.LJJJJI(LJIIJ.LIZ(), CrashType.JAVA, this.LIZJ.LIZIZ, str);
        return LJIIJ.LIZ();
    }

    public PK5(PKL pkl, File file, C64266PKc c64266PKc, PLI pli, String str, JSONObject jSONObject, CrashType crashType, PKA pka, JSONObject jSONObject2) {
        this.LJIIIIZZ = pkl;
        this.LIZ = file;
        this.LIZIZ = c64266PKc;
        this.LIZJ = pli;
        this.LIZLLL = str;
        this.LJ = jSONObject;
        this.LJFF = crashType;
        this.LJI = pka;
        this.LJII = jSONObject2;
    }
}
