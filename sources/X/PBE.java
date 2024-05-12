package X;

import Y.IDComparatorS39S0000000_11;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class PBE implements InterfaceC64040PBk {
    public volatile long LIZ = 60000;
    public volatile long LIZIZ = 1048576;
    public final C64049PBt<PBF> LIZJ = new C64049PBt<>(40);
    public volatile PB6 LIZLLL;
    public volatile PB7 LJ;
    public volatile AbstractRunnableC64070PCo LJFF;

    public final synchronized void LIZJ() {
        this.LJFF = new PBI(this, this.LIZ);
        PD6 pd6 = PD6.IO;
        C64071PCp.LIZ(pd6).LIZJ(this.LJFF);
        if (PC5.LJJIIZ()) {
            C64071PCp.LIZ(pd6).LIZJ(new PB5(this));
        }
    }

    @Override // X.InterfaceC64040PBk
    public final String getName() {
        return "first_log_dir";
    }

    public final void LIZIZ() {
        try {
            if (this.LJ != null) {
                this.LJ.LIZ();
            }
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "flushMemoryBuffer", th);
        }
    }

    public final void LIZLLL() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.LIZLLL != null) {
                this.LIZLLL.LIZ();
            }
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "flushPersistentBuffer", th);
        }
        LIZIZ();
        LJ();
        if (PC5.LJJIIZ()) {
            if (this.LIZLLL != null) {
                String[] LIZJ = this.LIZLLL.LIZJ();
                if (LIZJ != null && LIZJ.length != 0) {
                    List asList = Arrays.asList(LIZJ);
                    Collections.sort(asList, new IDComparatorS39S0000000_11(26));
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("reportFile: parsing ");
                        LIZ.append(asList.size());
                        LIZ.append(" files. fileNameList");
                        LIZ.append(asList);
                        C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
                    }
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i < asList.size()) {
                            File file = new File(O5Y.LJIL(), (String) ListProtector.get(asList, i));
                            if (file.exists()) {
                                try {
                                    byte[] LIZIZ = OPR.LIZIZ(file);
                                    if (LIZIZ != null) {
                                        PBF LIZ2 = PBF.LIZ(ByteBuffer.wrap(LIZIZ));
                                        if (LIZ2 != null) {
                                            LIZ2.LIZLLL = file;
                                            int i3 = LIZ2.LIZJ;
                                            if (i2 == 0 || i2 + i3 < this.LIZIZ) {
                                                i2 += i3;
                                                arrayList.add(LIZ2);
                                            } else {
                                                PBK.LIZ.LIZLLL(asList.size() - arrayList.size(), arrayList);
                                                break;
                                            }
                                        } else {
                                            C64028PAy.LIZIZ("APM-Slardar", "fromMemory bytes is null");
                                        }
                                    } else {
                                        C64028PAy.LIZIZ("APM-Slardar", "fromFile bytes is null");
                                    }
                                } catch (Throwable th2) {
                                    C64028PAy.LIZJ("APM-Slardar", "fromFile", th2);
                                }
                                if (C78248UnM.LJIIJ()) {
                                    C64028PAy.LIZ("APM-Slardar", "logFile invalid. delete now.");
                                }
                                C16880lQ.LLLZZIL(file);
                            }
                            i++;
                        } else {
                            PBK.LIZ.LIZLLL(0, arrayList);
                            break;
                        }
                    }
                }
            } else {
                C64028PAy.LIZIZ("APM-Slardar", "persistentBuffer is null");
            }
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("LogReporter One Loop Cost:");
            LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ3));
        }
    }

    public final void LJ() {
        if (this.LIZJ.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (!this.LIZJ.LIZ()) {
            arrayList.add(this.LIZJ.LIZIZ());
            PBF LIZIZ = this.LIZJ.LIZIZ();
            if (LIZIZ != null) {
                int i2 = LIZIZ.LIZJ;
                if (i == 0 || i + i2 < this.LIZIZ) {
                    i += i2;
                    arrayList.add(LIZIZ);
                } else {
                    PBK.LIZ.LIZLLL(0, arrayList);
                    arrayList.clear();
                    arrayList.add(LIZIZ);
                    i = i2;
                }
            }
        }
        PBK.LIZ.LIZLLL(0, arrayList);
    }

    @Override // X.InterfaceC64040PBk
    public final long getSize() {
        String[] LIZJ = this.LIZLLL.LIZJ();
        long j = 0;
        if (LIZJ != null && LIZJ.length != 0) {
            for (String str : LIZJ) {
                j += new File(O5Y.LJIL(), str).length();
            }
        }
        return j;
    }

    @Override // X.InterfaceC64040PBk
    public final void LIZ(long j) {
        String[] LIZJ;
        long parseLong;
        if (this.LIZLLL == null || (LIZJ = this.LIZLLL.LIZJ()) == null || LIZJ.length == 0) {
            return;
        }
        for (String str : LIZJ) {
            File file = new File(O5Y.LJIL(), str);
            String name = file.getName();
            int indexOf = name.indexOf("_");
            if (indexOf != -1) {
                try {
                    parseLong = CastLongProtector.parseLong(name.substring(0, indexOf));
                } catch (Exception unused) {
                }
                if (parseLong != -1) {
                    if (parseLong <= j) {
                        OPR.LIZ(file);
                    }
                }
            }
            OPR.LIZ(file);
        }
    }

    public final synchronized void LJFF(long j) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setLoopInterval:");
            LIZ.append(this.LIZ);
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
        }
        if (j > 0 && this.LIZ != j) {
            this.LIZ = j;
            if (this.LJFF == null) {
                return;
            }
            PD6 pd6 = PD6.IO;
            C64071PCp.LIZ(pd6).LIZIZ(this.LJFF);
            this.LJFF = new PBH(this, this.LIZ, this.LIZ);
            C64071PCp.LIZ(pd6).LIZJ(this.LJFF);
        }
    }
}
