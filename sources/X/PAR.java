package X;

import Y.IDComparatorS39S0000000_11;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes12.dex */
public final class PAR implements PCY {
    public volatile long LIZ = 60000;
    public final C64049PBt<PAT> LIZIZ = new C64049PBt<>(10);
    public volatile PAS LIZJ;
    public boolean LIZLLL;
    public long LJ;

    public final synchronized void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C48661J7x.LIZ.LIZ(this);
    }

    public final void LIZJ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        if (this.LIZJ != null) {
            PAS pas = this.LIZJ;
            synchronized (pas) {
                File file = pas.LIZ;
                if (file != null) {
                    File[] listFiles = file.listFiles(new PAC(pas));
                    if (listFiles != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (File file2 : listFiles) {
                            arrayList3.add(file2.getName());
                        }
                        Collections.sort(arrayList3, new IDComparatorS39S0000000_11(32));
                        arrayList2 = new ArrayList();
                        for (int i = 0; i < arrayList3.size(); i++) {
                            arrayList2.add(new File(pas.LIZ, (String) ListProtector.get(arrayList3, i)));
                        }
                    }
                }
            }
            if (!C78915Uy7.LJIJJ(arrayList2)) {
                arrayList.addAll(arrayList2);
            }
        }
        if (C78915Uy7.LJIJJ(arrayList)) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            File file3 = (File) ListProtector.get(arrayList, i3);
            if (!file3.exists()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reportFile file is not exist:");
                LIZ.append(file3.getAbsolutePath());
                PAU.LIZ("APM-SDK", X1D.LIZIZ(LIZ));
            } else {
                try {
                    byte[] LIZIZ = OPR.LIZIZ(file3);
                    if (LIZIZ != null) {
                        PAT LIZ2 = PAT.LIZ(ByteBuffer.wrap(LIZIZ));
                        if (LIZ2 != null) {
                            LIZ2.LIZJ = file3;
                            int i4 = LIZ2.LIZIZ;
                            if (i2 == 0 || i2 + i4 < 1048576) {
                                i2 += i4;
                                arrayList4.add(LIZ2);
                            } else {
                                PAG.LIZ.LJ(arrayList4);
                                return;
                            }
                        } else {
                            PAU.LIZ("APM-SDK", "fromMemory bytes is null");
                        }
                    } else {
                        PAU.LIZ("APM-SDK", "fromFile bytes is null");
                    }
                } catch (Throwable th) {
                    PAU.LIZIZ("fromFile", th);
                }
                C16880lQ.LLLZZIL(file3);
            }
        }
        if (!C78915Uy7.LJIJJ(arrayList4)) {
            PAG.LIZ.LJ(arrayList4);
        }
    }

    public final void LIZLLL() {
        if (this.LIZIZ.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (!this.LIZIZ.LIZ()) {
            arrayList.add(this.LIZIZ.LIZIZ());
            PAT LIZIZ = this.LIZIZ.LIZIZ();
            if (LIZIZ != null) {
                int i2 = LIZIZ.LIZIZ;
                if (i == 0 || i + i2 < 1048576) {
                    i += i2;
                    arrayList.add(LIZIZ);
                } else {
                    PAG.LIZ.LJ(arrayList);
                    arrayList.clear();
                    arrayList.add(LIZIZ);
                    i = i2;
                }
            }
        }
        PAG.LIZ.LJ(arrayList);
    }

    @Override // X.PCY
    public final void LIZIZ(long j) {
        if (j - this.LJ >= this.LIZ) {
            try {
                System.currentTimeMillis();
                try {
                    if (this.LIZJ != null) {
                        this.LIZJ.LIZ();
                    }
                } catch (Throwable th) {
                    PAU.LIZIZ("flushBuffer", th);
                }
                LIZLLL();
                if (C63985P9h.LIZLLL()) {
                    LIZJ();
                }
            } catch (Throwable th2) {
                PAU.LIZIZ("report", th2);
            }
            this.LJ = System.currentTimeMillis();
        }
    }

    public final synchronized void LJ(long j) {
        if (j > 0) {
            if (this.LIZ != j) {
                this.LIZ = Math.min(j, this.LIZ);
            }
        }
    }
}
