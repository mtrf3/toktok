package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.agilelogger.ALog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class PKB {
    public static volatile PKB LJ;
    public volatile String LIZ;
    public volatile PKE LIZIZ;
    public volatile PKF LIZJ;
    public volatile boolean LIZLLL;

    public static PKB LIZJ() {
        if (LJ == null) {
            synchronized (PKB.class) {
                if (LJ == null) {
                    LJ = new PKB();
                }
            }
        }
        return LJ;
    }

    public final void LIZIZ() {
        if (PKG.LIZ != null) {
            C78685UuP.LJJJLZIJ();
            try {
                Runnable runnable = PKG.LIZ;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.LIZIZ != null) {
            try {
                ((C64297PLh) this.LIZIZ).getClass();
                ALog.flush();
                ALog.forceLogSharding();
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        }
    }

    public static String LIZLLL(String str, List list) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload alog ");
        LIZ.append(str);
        LIZ.append(": ");
        LIZ.append(list);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJJLZIJ();
        try {
            PKA pka = new PKA();
            pka.LIZLLL = String.valueOf(PK0.LIZIZ().LIZLLL().get("aid"));
            pka.LIZJ = PK0.LIZLLL().LIZ();
            pka.LJ = str;
            pka.LJFF = list;
            if (TextUtils.isEmpty(pka.LIZLLL)) {
                str2 = "no_aid";
            } else if (TextUtils.isEmpty(pka.LIZJ)) {
                str2 = "no_did";
            } else if (TextUtils.isEmpty(pka.LJ)) {
                str2 = "no_process";
            } else {
                List<String> list2 = pka.LJFF;
                if (list2 != null && list2.size() != 0) {
                    str2 = "normal";
                } else {
                    str2 = "no_files";
                }
            }
            if (!str2.equals("normal")) {
                return str2;
            }
            C64248PJk LIZIZ = C64248PJk.LIZIZ();
            String str3 = pka.LIZLLL;
            String str4 = pka.LIZJ;
            String str5 = pka.LJ;
            List<String> list3 = pka.LJFF;
            LIZIZ.getClass();
            if (C64248PJk.LIZLLL(str3, str4, str5, list3)) {
                return "normal";
            }
            return "unknown";
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("uploadAlog: upload alog error: ");
            LIZ2.append(th);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLZIJ();
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
            return "unknown";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public final List<String> LIZ(long j, String str) {
        boolean z;
        PKF pkf;
        boolean z2;
        ?? r7;
        ?? r18;
        String str2;
        long j2;
        if (PKG.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        List<String> list = null;
        list = null;
        if (z) {
            C78685UuP.LJJJLZIJ();
            try {
                if (PKG.LIZIZ == null) {
                    return null;
                }
                long j3 = j / 1000;
                list = ALog.getALogFiles(str, null, j3 - 3600, j3);
                return list;
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(this.LIZ)) {
            return list;
        }
        if (!new File(this.LIZ).exists()) {
            return list;
        }
        String str3 = this.LIZ;
        if (this.LIZJ instanceof PKC) {
            pkf = new PKC(str);
        } else {
            pkf = this.LIZJ;
        }
        if (TextUtils.isEmpty(str3) || !C1B6.LIZIZ(str3) || pkf == null) {
            return list;
        }
        PKC pkc = (PKC) pkf;
        if (pkc.LIZ == null) {
            pkc.LIZ = C64264PKa.LIZJ(PK0.LIZ);
        }
        String str4 = pkc.LIZ;
        if (str4 != null) {
            z2 = !str4.contains(":");
        } else {
            z2 = true;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str3)) {
            try {
                File file = new File(str3);
                if (file.exists() && file.listFiles() != null) {
                    if (pkc.LIZ.contains(":")) {
                        str2 = pkc.LIZ.replace(":", "-");
                    } else {
                        str2 = pkc.LIZ;
                    }
                    ?? listFiles = file.listFiles();
                    int length = listFiles.length;
                    int i = 0;
                    long j4 = 0;
                    long j5 = 0;
                    List<String> list2 = list;
                    List<String> list3 = list;
                    while (i < length) {
                        ?? r12 = listFiles[i];
                        String name = r12.getName();
                        if (name.endsWith(".hot") && ((!z2 || !r12.getName().contains("-")) && ((z2 || r12.getName().contains("-")) && name.contains(str2)))) {
                            String[] split = name.split("_");
                            if (split != null && split.length >= 4) {
                                j2 = CastLongProtector.parseLong(split[3]);
                            } else if (split != null && split.length > 1) {
                                j2 = CastLongProtector.parseLong(split[0]);
                            } else {
                                j2 = -1;
                            }
                            if (j <= 0 || j2 <= j) {
                                if (j5 < j2) {
                                    list2 = list3;
                                    j4 = j5;
                                    list3 = r12;
                                    j5 = j2;
                                } else if (j4 < j2) {
                                    j4 = j2;
                                    list2 = r12;
                                }
                            }
                        }
                        i++;
                        list3 = list3;
                    }
                    r7 = list3;
                    r18 = list2;
                } else {
                    r7 = list;
                    r18 = list;
                }
                if (r18 != 0 && r18.length() > 0) {
                    arrayList.add(r18.getAbsolutePath());
                }
                if (r7 != null && r7.length() > 0) {
                    arrayList.add(r7.getAbsolutePath());
                }
            } catch (Exception unused2) {
            }
        }
        if (!arrayList.isEmpty() && str != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                C78685UuP.LJJJLZIJ();
                C64263PJz.LIZ("collectAlog", str5);
            }
        }
        return arrayList;
    }
}
