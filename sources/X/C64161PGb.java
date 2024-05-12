package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Environment;
import android.util.Pair;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PGb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64161PGb extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PGE LJLJJI;

    public final void LIZ() {
        long j;
        long j2;
        long totalSpace;
        long freeSpace;
        long min;
        long min2;
        long currentTimeMillis = System.currentTimeMillis();
        if (C78248UnM.LJIIJ()) {
            C64028PAy.LIZ("APM-Disk", "startCollect:");
        }
        SharedPreferences LIZIZ = F9J.LIZIZ(C78248UnM.LJLJJI, 0, "monitor_config");
        if (LIZIZ != null) {
            j = LIZIZ.getLong("check_disk_last_time", 0L);
        } else {
            j = 0;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - j;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("durationMs:");
            LIZ.append(currentTimeMillis2);
            C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ));
        }
        if (currentTimeMillis2 >= 86400000) {
            C64162PGc c64162PGc = C64162PGc.LJIILJJIL;
            PGG pgg = this.LJLJJI.LIZ;
            PGW pgw = null;
            String str = null;
            pgw = null;
            if (pgg != null && !c64162PGc.LJ) {
                c64162PGc.LJIIIZ = pgg;
                if (!c64162PGc.LJIIIIZZ) {
                    c64162PGc.LJIIIIZZ = true;
                    Application application = C78248UnM.LJLJJI;
                    try {
                        application.getPackageName();
                        c64162PGc.LIZ = C16880lQ.LLIIJLIL(application).getParent();
                        c64162PGc.LIZIZ = C16880lQ.LLIIIL(application).getAbsolutePath();
                        try {
                            str = C16880lQ.LLIIJI(application, null).getParentFile().getAbsolutePath();
                        } catch (Exception unused) {
                        }
                        c64162PGc.LIZJ = str;
                        File LLIIIZ = C16880lQ.LLIIIZ(application);
                        if (LLIIIZ != null) {
                            c64162PGc.LIZLLL = LLIIIZ.getAbsolutePath();
                        }
                    } catch (Exception unused2) {
                        c64162PGc.LJ = true;
                    }
                }
                c64162PGc.LJFF = c64162PGc.LJIILIIL(pgg.LJIIJ);
                c64162PGc.LJI = c64162PGc.LJIILIIL(pgg.LJIIIZ);
                c64162PGc.LJII = c64162PGc.LJIILIIL(pgg.LJIIJJI);
                ArrayList arrayList = new ArrayList();
                File[] listFiles = new File(c64162PGc.LIZ).listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file : listFiles) {
                        c64162PGc.LIZ(file, arrayList);
                    }
                }
                File[] listFiles2 = new File(c64162PGc.LIZJ).listFiles();
                if (listFiles2 != null && listFiles2.length != 0) {
                    for (File file2 : listFiles2) {
                        c64162PGc.LIZ(file2, arrayList);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C64163PGd c64163PGd = (C64163PGd) it.next();
                    Iterator it2 = ((ArrayList) c64163PGd.LJFF).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C64163PGd) it2.next()).LIZLLL) {
                                break;
                            }
                        } else {
                            arrayList2.remove(c64163PGd);
                            break;
                        }
                    }
                }
                arrayList.removeAll(arrayList2);
                if (C78248UnM.LJIIJ()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C64163PGd c64163PGd2 = (C64163PGd) it3.next();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("diskInfoNodes:");
                        LIZ2.append(c64163PGd2.LIZIZ());
                        C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ2));
                    }
                }
                C65548Po0<C64167PGh> c65548Po0 = new C65548Po0<>(c64162PGc.LJIIIZ.LJI);
                C65548Po0<C64167PGh> c65548Po02 = new C65548Po0<>(c64162PGc.LJIIIZ.LJII);
                C65548Po0<C64167PGh> c65548Po03 = new C65548Po0<>(c64162PGc.LJIIIZ.LJFF);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(c64162PGc.LIZ);
                arrayList3.add(c64162PGc.LIZIZ);
                c64162PGc.LIZJ(c64162PGc.LIZIZ(c64162PGc.LIZ, c65548Po0, c65548Po02, c65548Po03, arrayList3));
                arrayList3.clear();
                arrayList3.add(c64162PGc.LIZLLL);
                arrayList3.add(c64162PGc.LIZJ);
                c64162PGc.LIZJ(c64162PGc.LIZIZ(c64162PGc.LIZJ, c65548Po0, c65548Po02, c65548Po03, arrayList3));
                if (C78248UnM.LJIIJ()) {
                    Iterator it4 = ((ArrayList) c65548Po0.LIZIZ()).iterator();
                    while (it4.hasNext()) {
                        C64167PGh c64167PGh = (C64167PGh) it4.next();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("fileListTopK:");
                        LIZ3.append(c64167PGh.LIZLLL());
                        C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ3));
                    }
                    Iterator it5 = ((ArrayList) c65548Po02.LIZIZ()).iterator();
                    while (it5.hasNext()) {
                        C64167PGh c64167PGh2 = (C64167PGh) it5.next();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("dirListTopK:");
                        LIZ4.append(c64167PGh2.LIZLLL());
                        C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ4));
                    }
                    Iterator it6 = ((ArrayList) c65548Po03.LIZIZ()).iterator();
                    while (it6.hasNext()) {
                        C64167PGh c64167PGh3 = (C64167PGh) it6.next();
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("outdatedListTopK:");
                        LIZ5.append(c64167PGh3.LIZLLL());
                        C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ5));
                    }
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("insideDataSize:");
                    LIZ6.append(c64162PGc.LJIIJ);
                    LIZ6.append(" outsideDataSize:");
                    LIZ6.append(c64162PGc.LJIIJJI);
                    LIZ6.append(" insideCacheSize:");
                    LIZ6.append(c64162PGc.LJIIL);
                    LIZ6.append(" outsideCacheSize:");
                    LIZ6.append(c64162PGc.LJIILIIL);
                    C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ6));
                }
                if (!C78915Uy7.LJIJJ(c64162PGc.LJI)) {
                    Iterator it7 = ((ArrayList) c64162PGc.LJI).iterator();
                    while (it7.hasNext()) {
                        File file3 = new File((String) it7.next());
                        if (file3.exists() && !c64162PGc.LJIIJ(file3)) {
                            if (file3.isFile()) {
                                long length = file3.length();
                                C64163PGd c64163PGd3 = new C64163PGd(c64162PGc);
                                c64163PGd3.LIZLLL = false;
                                c64163PGd3.LIZ = file3.getAbsolutePath();
                                c64163PGd3.LIZIZ = length;
                                c64163PGd3.LJ = "custom";
                                arrayList.add(c64163PGd3);
                            } else {
                                C64163PGd c64163PGd4 = new C64163PGd(c64162PGc);
                                c64163PGd4.LIZLLL = true;
                                c64163PGd4.LJ = "custom";
                                c64163PGd4.LIZ = file3.getAbsolutePath();
                                c64163PGd4.LIZIZ = C64162PGc.LJIIIIZZ(file3);
                                arrayList.add(c64163PGd4);
                            }
                        }
                    }
                }
                try {
                    j2 = c64162PGc.LJIIJ + c64162PGc.LJIIJJI;
                    long j3 = c64162PGc.LJIIL + c64162PGc.LJIILIIL;
                    totalSpace = Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace();
                    freeSpace = Environment.getDataDirectory().getFreeSpace();
                    min = Math.min(j2, 17179869184L);
                    min2 = Math.min(j3, 17179869184L);
                } catch (Throwable unused3) {
                }
                if (min >= 0) {
                    Pair LJIIIZ = C64162PGc.LJIIIZ();
                    long LJI = c64162PGc.LJI();
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("appUsage:");
                        LIZ7.append(LJI);
                        C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ7));
                    }
                    pgw = new PGW(j2, min2, totalSpace, freeSpace, LJI, ((Long) LJIIIZ.first).longValue(), ((Long) LJIIIZ.second).longValue(), (float) new BigDecimal(LJI).divide(new BigDecimal(totalSpace), 4, 4).doubleValue(), C64162PGc.LJFF(c65548Po0), C64162PGc.LJFF(c65548Po02), C64162PGc.LJFF(c65548Po03), c64162PGc.LJ(min, arrayList));
                } else {
                    pgw = null;
                }
            }
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("durationMs:");
                LIZ8.append(pgw.LIZ());
                C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ8));
            }
            PC2.LIZ(pgw);
            LIZIZ.edit().putLong("check_disk_last_time", System.currentTimeMillis()).commit();
        }
        C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZIZ(this.LJLJJI.LIZLLL);
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("collect end and cost time:");
            LIZ9.append(System.currentTimeMillis() - currentTimeMillis);
            C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ9));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C64161PGb(PGE pge) {
        this.LJLJJI = pge;
    }
}
