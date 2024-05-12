package X;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PGa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64160PGa extends PGP {
    public static String LLI;
    public static String LLIFFJFJJ;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public String LJLLJ;
    public String LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public boolean LJZI;
    public List<C64164PGe> LJZL;
    public C65548Po0<C64169PGj> LLFFF;
    public C65548Po0<C64169PGj> LLFII;
    public C65548Po0<C64170PGk> LLFZ;
    public long LJLJLLL = 524288000;
    public long LJLL = 524288000;
    public int LJLLI = 20;
    public long LJLLILLLL = 2592000000L;
    public List<String> LL = new ArrayList();
    public List<String> LLD = new ArrayList();
    public final List<String> LLF = new ArrayList();
    public final List<String> LLFF = new ArrayList();

    @Override // X.PGP
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.PGP
    public final long LJIILJJIL() {
        return 120000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    public final void LJIIZILJ() {
        List<C64164PGe> list;
        ?? r11 = 1;
        String[] strArr = {LLI, LLIFFJFJJ};
        this.LJZL = new ArrayList();
        int i = 0;
        do {
            String str = strArr[i];
            LJIILLIIL(new File(str), r11, r11, this.LJZL);
            File file = new File(str);
            C64165PGf c64165PGf = new C64165PGf(this);
            c64165PGf.LIZ = str;
            c64165PGf.LIZIZ = new C64165PGf(this);
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                c64165PGf.LIZLLL = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(c64165PGf);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i2 = 0;
                    r11 = r11;
                    while (i2 < size) {
                        C64165PGf c64165PGf2 = (C64165PGf) linkedList.poll();
                        if (c64165PGf2 != null) {
                            String str2 = c64165PGf2.LIZ;
                            File file2 = new File(str2);
                            if (!file2.exists() || ((ArrayList) this.LLF).contains(str2)) {
                                c64165PGf2.LIZIZ.LIZLLL -= r11 == true ? 1 : 0;
                            } else if (file2.isFile()) {
                                long length = file2.length();
                                if (length > 0) {
                                    if (C09970aH.LJII()) {
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append("appendExceptionFileQueue: path: ");
                                        LIZ.append(str2);
                                        LIZ.append(", size: ");
                                        LIZ.append(length);
                                        X1D.LIZIZ(LIZ);
                                    }
                                    if (length <= 17179869184L) {
                                        if (this.LLFFF == null) {
                                            this.LLFFF = new C65548Po0<>(this.LJLLI);
                                        }
                                        this.LLFFF.LIZ(new C64169PGj(r11 == true ? 1 : 0, length, str2));
                                    }
                                }
                                C64165PGf c64165PGf3 = c64165PGf2.LIZIZ;
                                if (c64165PGf3 != null) {
                                    c64165PGf3.LIZ(length);
                                    if (!c64165PGf2.LIZIZ.LJFF) {
                                        long currentTimeMillis = System.currentTimeMillis() - file2.lastModified();
                                        if (currentTimeMillis >= this.LJLLILLLL && currentTimeMillis < 62899200000L && currentTimeMillis > 0) {
                                            LJIILL(0, length, currentTimeMillis, str2);
                                        }
                                    }
                                }
                            } else {
                                File[] listFiles2 = file2.listFiles();
                                if (listFiles2 == null || listFiles2.length == 0) {
                                    c64165PGf2.LIZIZ.LIZ(0L);
                                } else {
                                    c64165PGf2.LIZLLL = listFiles2.length;
                                    for (File file3 : listFiles2) {
                                        C64165PGf c64165PGf4 = new C64165PGf(this);
                                        c64165PGf4.LIZIZ = c64165PGf2;
                                        c64165PGf4.LIZ = file3.getAbsolutePath();
                                        if (file3.isDirectory() && !c64165PGf2.LJFF) {
                                            long currentTimeMillis2 = System.currentTimeMillis() - file3.lastModified();
                                            if (currentTimeMillis2 >= this.LJLLILLLL && currentTimeMillis2 < 62899200000L && currentTimeMillis2 > 0) {
                                                c64165PGf4.LJFF = true;
                                                c64165PGf4.LJI = currentTimeMillis2;
                                            }
                                        }
                                        linkedList.offer(c64165PGf4);
                                    }
                                }
                            }
                        }
                        i2++;
                        r11 = 1;
                    }
                }
            }
            i++;
        } while (i < 2);
        List<String> list2 = this.LLFF;
        if (list2 != null && ((ArrayList) list2).size() > 0) {
            Iterator it = ((ArrayList) this.LLFF).iterator();
            while (it.hasNext()) {
                LJIILLIIL(new File((String) it.next()), r11 == true ? 1 : 0, false, this.LJZL);
            }
        }
        Iterator it2 = ((ArrayList) this.LJZL).iterator();
        while (it2.hasNext()) {
            C64164PGe c64164PGe = (C64164PGe) it2.next();
            if ("normal".equals(c64164PGe.LJ) && (list = c64164PGe.LJFF) != null) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        c64164PGe.LIZIZ += ((C64164PGe) it3.next()).LIZIZ;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(3:24|25|(1:27)(2:71|(14:73|(1:75)(1:78)|76|29|(3:56|57|(1:59)(5:60|(1:62)(1:69)|63|(1:65)(1:68)|66))|31|32|33|(7:35|(1:37)(3:45|46|(1:47))|38|39|40|41|42)|54|39|40|41|42)))|28|29|(0)|31|32|33|(0)|54|39|40|41|42) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0192 A[Catch: all -> 0x01ba, TryCatch #3 {all -> 0x01ba, blocks: (B:33:0x0186, B:35:0x0192), top: B:32:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.PGP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64160PGa.LJIIL():void");
    }

    public C64160PGa() {
        this.LJLJJL = "disk";
    }

    public static long LJIJ(File file) {
        File[] listFiles;
        long length;
        long j = 0;
        try {
            listFiles = file.listFiles();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = LJIJ(file2);
                } else {
                    length = file2.length();
                }
                j += length;
            }
            return j;
        }
        return 0L;
    }

    @Override // X.PGP
    public final void LJIIIIZZ(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("dump_switch", true);
        this.LJLJLJ = optBoolean;
        if (optBoolean) {
            long currentTimeMillis = System.currentTimeMillis() - C39714FiI.LIZ.LIZ.getLong("check_disk_last_time", 0L);
            if (currentTimeMillis < 86400000 && currentTimeMillis > 0) {
                this.LJLJL = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.LJLJLLL = jSONObject.optInt("dump_threshold") * 1024 * 1024;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.LJLL = jSONObject.optInt("abnormal_folder_size") * 1024 * 1024;
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.LJLLI = jSONObject.optInt("dump_top_count");
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.LJLLILLLL = jSONObject.optInt("outdated_days") * 86400000;
            }
            this.LL = V3N.LJJIIZ("disk_customed_paths", jSONObject);
            this.LLD = V3N.LJJIIJZLJL("ignored_relative_paths", jSONObject);
        }
        if (jSONObject.optBoolean("enable_collect_apm6", false)) {
            this.LJLJL = true;
        }
    }

    public final boolean LJIJI(C64164PGe c64164PGe) {
        Iterator it = ((ArrayList) this.LLF).iterator();
        while (it.hasNext()) {
            if (c64164PGe.LIZ.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void LJIILL(int i, long j, long j2, String str) {
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("appendutdatedFileQueue: path: ");
            LIZ.append(str);
            LIZ.append(", size: ");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
        }
        if (j < 102400 || j > 17179869184L) {
            return;
        }
        if (this.LLFZ == null) {
            this.LLFZ = new C65548Po0<>(this.LJLLI);
        }
        this.LLFZ.LIZ(new C64170PGk(i, j, j2, str));
    }

    public final void LJIILLIIL(File file, int i, boolean z, List<C64164PGe> list) {
        if (i <= 2 && file.exists()) {
            if (((ArrayList) this.LLF).contains(file.getAbsolutePath())) {
                return;
            }
            if (file.isDirectory()) {
                if (z) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null || listFiles.length == 0) {
                        return;
                    }
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists()) {
                            if (!((ArrayList) this.LLF).contains(file2.getAbsolutePath())) {
                                C64164PGe c64164PGe = new C64164PGe();
                                c64164PGe.LIZLLL = file2.isDirectory();
                                c64164PGe.LIZ = file2.getAbsolutePath();
                                if (file2.isDirectory()) {
                                    ArrayList arrayList = new ArrayList();
                                    c64164PGe.LJFF = arrayList;
                                    if (i == 2) {
                                        c64164PGe.LIZIZ = LJIJ(file2);
                                    }
                                    LJIILLIIL(file2, i + 1, z, arrayList);
                                    list.add(c64164PGe);
                                } else {
                                    c64164PGe.LIZIZ = file2.length();
                                    list.add(c64164PGe);
                                }
                            }
                        }
                    }
                    return;
                }
                C64164PGe c64164PGe2 = new C64164PGe();
                c64164PGe2.LIZLLL = true;
                c64164PGe2.LJ = "custom";
                c64164PGe2.LIZ = file.getAbsolutePath();
                c64164PGe2.LIZIZ = LJIJ(file);
                list.add(c64164PGe2);
                return;
            }
            C64164PGe c64164PGe3 = new C64164PGe();
            c64164PGe3.LIZLLL = false;
            c64164PGe3.LIZ = file.getAbsolutePath();
            c64164PGe3.LIZIZ = file.length();
            if (!z) {
                c64164PGe3.LJ = "custom";
            }
            list.add(c64164PGe3);
        }
    }

    public final void LJIJJ(long j, long j2, long j3, long j4) {
        long j5;
        try {
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("disk: data: ");
                LIZ.append(j);
                LIZ.append(" , cache: ");
                LIZ.append(j2);
                LIZ.append(" , total: ");
                LIZ.append(j3);
                LIZ.append(" , free: ");
                LIZ.append(j4);
                X1D.LIZIZ(LIZ);
            }
            long j6 = 17179869184L;
            if (j > 17179869184L) {
                j5 = 17179869184L;
            } else {
                j5 = j;
            }
            if (j2 <= 17179869184L) {
                j6 = j2;
            }
            JSONObject jSONObject = new JSONObject();
            if (j > 0) {
                jSONObject.put("data", j5);
            }
            if (j2 > 0) {
                jSONObject.put("cache", j6);
            }
            if (j3 > 0) {
                jSONObject.put("total", j3 / 1073741824);
            }
            if (j4 > 0) {
                jSONObject.put("rom_free", j4 / 1073741824);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.LJLJLJ && j5 > this.LJLJLLL) {
                if (this.LLFFF != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((ArrayList) this.LLFFF.LIZIZ()).iterator();
                    while (it.hasNext()) {
                        JSONObject LIZJ = ((C64169PGj) it.next()).LIZJ();
                        if (LIZJ != null) {
                            jSONArray.put(LIZJ);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.LLFII != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = ((ArrayList) this.LLFII.LIZIZ()).iterator();
                    while (it2.hasNext()) {
                        JSONObject LIZJ2 = ((C64169PGj) it2.next()).LIZJ();
                        if (LIZJ2 != null) {
                            jSONArray2.put(LIZJ2);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.LLFZ != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it3 = ((ArrayList) this.LLFZ.LIZIZ()).iterator();
                    while (it3.hasNext()) {
                        JSONObject LIZJ3 = ((C64170PGk) it3.next()).LIZJ();
                        if (LIZJ3 != null) {
                            jSONArray3.put(LIZJ3);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                List<C64164PGe> list = this.LJZL;
                if (list != null && !((ArrayList) list).isEmpty()) {
                    BigDecimal bigDecimal = new BigDecimal(j5);
                    JSONArray jSONArray4 = new JSONArray();
                    Iterator it4 = ((ArrayList) this.LJZL).iterator();
                    while (it4.hasNext()) {
                        C64164PGe c64164PGe = (C64164PGe) it4.next();
                        if (LJIJI(c64164PGe)) {
                            c64164PGe.LIZJ = 0.0f;
                        } else {
                            c64164PGe.LIZJ = (float) new BigDecimal(c64164PGe.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                        }
                        List<C64164PGe> list2 = c64164PGe.LJFF;
                        if (list2 != null) {
                            ArrayList arrayList = (ArrayList) list2;
                            if (arrayList.size() > 0) {
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    C64164PGe c64164PGe2 = (C64164PGe) it5.next();
                                    if (LJIJI(c64164PGe2)) {
                                        c64164PGe2.LIZJ = 0.0f;
                                    } else {
                                        c64164PGe2.LIZJ = (float) new BigDecimal(c64164PGe2.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                                    }
                                }
                            }
                        }
                        jSONArray4.put(c64164PGe.LIZ());
                    }
                    jSONObject2.put("disk_info", jSONArray4);
                }
                this.LLFFF = null;
                this.LLFII = null;
                this.LLFZ = null;
                this.LJZL = null;
            }
            PGP.LJIILIIL(new PEF("disk", "storageUsed", jSONObject, null, jSONObject2, 0));
        } catch (Exception unused) {
        }
    }
}
