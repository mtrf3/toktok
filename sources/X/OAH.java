package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class OAH {
    public static void LIZ(File file) {
        OAY.LIZ().execute(new ARunnableS46S0100000_10(file, 115));
    }

    public static boolean LIZJ(String str) {
        try {
            LJFF(str);
            return true;
        } catch (Throwable th) {
            C45804HyK.LJJLIIIJJIZ(new RuntimeException(i0.LJFF("delete old channel version failed，path：", str), th));
            return false;
        }
    }

    public static void LJFF(String str) {
        if (AppSettingsManager.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            String str2 = File.separator;
            LIZ.append(str2);
            LIZ.append("update.lock");
            C61457OAb LIZ2 = C61457OAb.LIZ(X1D.LIZIZ(LIZ));
            if (LIZ2 == null) {
                return;
            }
            try {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append(str2);
                LIZ3.append("select.lock");
                C61456OAa LIZ4 = C61456OAa.LIZ(X1D.LIZIZ(LIZ3));
                try {
                    C61467OAl.LIZJ(new File(str));
                    return;
                } finally {
                    LIZ4.LIZIZ();
                }
            } finally {
                LIZ2.LIZIZ();
            }
        }
        if (!O5R.LJ(str)) {
            return;
        }
        try {
            C61467OAl.LIZJ(new File(str));
        } finally {
            O5R.LJFF(str);
        }
    }

    public static void LJI(Context context, OEI oei) {
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        if (c61532OCy.LJ != null) {
            c61532OCy.LIZIZ();
            if (c61532OCy.LJ.getEnv() != GeckoGlobalConfig.ENVType.PROD) {
                String str = oei.LIZ.get("X-Gecko-Tt-Env");
                if (TextUtils.isEmpty(str)) {
                    str = oei.LIZ.get("x-gecko-tt-env");
                }
                OAI oai = OAO.LIZ;
                if (oai.LIZ == null) {
                    oai.LIZ = F9J.LIZIZ(context, 0, "sp_gecko");
                }
                String string = oai.LIZ.getString("gecko_x_tt_env", null);
                if (string != null ? !string.equals(str) : str != null) {
                    OC6.LIZ("gecko-debug-tag", "gecko combine response header[X-Gecko-Tt-Env] has been changed,delete all local resources");
                    c61532OCy.LIZIZ();
                    Iterator<File> it = c61532OCy.LJ.getCandidateRootDirectories().iterator();
                    while (it.hasNext()) {
                        C61467OAl.LIZJ(it.next());
                    }
                }
                OAO.LIZ.LIZ(context, "gecko_x_tt_env", str);
            }
        }
    }

    public static void LIZIZ(Long l, String str, boolean z) {
        if (OAJ.LJLILLLLZI == null) {
            synchronized (OAJ.class) {
                if (OAJ.LJLILLLLZI == null) {
                    OAJ.LJLILLLLZI = new OAJ();
                }
            }
        }
        OAJ.LJLILLLLZI.execute(new RunnableC61350O5y(l, str, z));
    }

    public static List<File> LJII(File[] fileArr, long j, List<File> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = 0;
        long j3 = 0;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                LIZ(file2);
                ((ArrayList) list).add(file2);
            } else {
                try {
                    long parseLong = CastLongProtector.parseLong(name);
                    if (j != 0) {
                        if (parseLong != j) {
                            arrayList2.add(file2);
                        }
                    } else {
                        long lastModified = file2.lastModified();
                        if (j2 != 0) {
                            if (lastModified < j3) {
                                arrayList2.add(file2);
                            } else {
                                arrayList2.add(file);
                            }
                        }
                        file = file2;
                        j2 = parseLong;
                        j3 = lastModified;
                    }
                } catch (Exception unused) {
                    LIZ(file2);
                    ((ArrayList) list).add(file2);
                }
            }
        }
        Iterator it = arrayList.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            File file3 = (File) it.next();
            if (file3.getName().indexOf("--updating") == -1) {
                LIZ(file3);
                ((ArrayList) list).add(file3);
            } else {
                long lastModified2 = file3.lastModified();
                if (j4 == 0 || j4 > lastModified2) {
                    j4 = lastModified2;
                } else {
                    LIZ(file3);
                    ((ArrayList) list).add(file3);
                }
            }
        }
        return arrayList2;
    }

    public static int LIZLLL(Long l, String str, boolean z, boolean z2) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            try {
                longValue = l.longValue();
            } catch (Throwable th) {
                C45804HyK.LJJLIIIJJIZ(new RuntimeException(i0.LJFF("delete old channel version failed，path：", str), th));
                return 0;
            }
        }
        return LJ(longValue, z, z2, str);
    }

    public static int LJ(long j, boolean z, boolean z2, String str) {
        boolean z3;
        C61457OAb c61457OAb;
        C61456OAa c61456OAa = null;
        if (AppSettingsManager.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            String str2 = File.separator;
            String LJFF = JBR.LJFF(LIZ, str2, "update.lock", LIZ);
            if (z) {
                c61457OAb = C61457OAb.LIZ(LJFF);
                if (c61457OAb == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Need lock but can not hold ChannelUpdateLock of ");
                    LIZ2.append(LJFF);
                    LIZ2.append(" when deleting ");
                    LIZ2.append(str);
                    OC6.LIZLLL("gecko-debug-tag", X1D.LIZIZ(LIZ2));
                    return 0;
                }
            } else {
                c61457OAb = null;
            }
            File[] listFiles = new File(str).listFiles(new OAM());
            if (listFiles == null || listFiles.length == 0 || (z2 && listFiles.length == 1)) {
                return 0;
            }
            if (z) {
                try {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str);
                    LIZ3.append(str2);
                    LIZ3.append("select.lock");
                    c61456OAa = C61456OAa.LIZ(X1D.LIZIZ(LIZ3));
                } finally {
                    if (c61457OAb != null) {
                        c61457OAb.LIZIZ();
                    }
                }
            }
            try {
                ArrayList arrayList = new ArrayList();
                List<File> LJII = LJII(listFiles, j, arrayList);
                int size = arrayList.size();
                ArrayList arrayList2 = (ArrayList) LJII;
                if (!arrayList2.isEmpty()) {
                    OC6.LIZ("gecko-debug-tag", "delete after update", str, Long.valueOf(j), LJII);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(file.getAbsolutePath());
                        LIZ4.append(File.separator);
                        LIZ4.append("using.lock");
                        if (C61458OAc.LIZ(X1D.LIZIZ(LIZ4))) {
                            size++;
                        }
                    }
                }
                return size;
            } finally {
                if (c61456OAa != null) {
                    c61456OAa.LIZIZ();
                }
            }
        }
        try {
            File[] listFiles2 = new File(str).listFiles(new OAN());
            if (listFiles2 != null && listFiles2.length != 0 && (!z2 || listFiles2.length != 1)) {
                boolean LJ = O5R.LJ(str);
                if (z && !LJ) {
                    return 0;
                }
                try {
                    OC6.LIZ("gecko-debug-tag", "channel delete lock", str, Boolean.valueOf(z), Boolean.valueOf(LJ));
                    if (!z && LJ) {
                        O5R.LJFF(str);
                        z3 = false;
                    } else {
                        z3 = LJ;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ArrayList arrayList3 = new ArrayList();
                    List<File> LJII2 = LJII(listFiles2, j, arrayList3);
                    int size2 = arrayList3.size();
                    ArrayList arrayList4 = (ArrayList) LJII2;
                    if (!arrayList4.isEmpty()) {
                        if (!z && !LJ) {
                            OC6.LIZ("gecko-debug-tag", "channel delete before update when locking", str);
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append(str);
                            LIZ5.append(" has been delete when locked");
                            OD6.LJI(6, X1D.LIZIZ(LIZ5), 600, null);
                        }
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            File file2 = (File) it2.next();
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append(file2.getAbsolutePath());
                            LIZ6.append("--pending-delete");
                            File file3 = new File(X1D.LIZIZ(LIZ6));
                            file2.renameTo(file3);
                            if (C61467OAl.LIZJ(file3)) {
                                size2++;
                            }
                        }
                    }
                    OC6.LIZ("gecko-debug-tag", "channel version delete", str, Long.valueOf(j), LJII2);
                    if (z3) {
                        O5R.LJFF(str);
                    }
                    return size2;
                } catch (Throwable th2) {
                    th = th2;
                    LJ = z3;
                    if (LJ) {
                        O5R.LJFF(str);
                        throw th;
                    }
                    throw th;
                }
            }
            return 0;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
