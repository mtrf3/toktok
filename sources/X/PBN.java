package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes12.dex */
public final class PBN implements InterfaceC64040PBk {
    public C64031PBb LIZIZ;
    public final LinkedHashMap<PBM, ConcurrentLinkedQueue<C64033PBd>> LIZ = new LinkedHashMap<>();
    public long LIZJ = 30000;
    public long LIZLLL = 0;
    public long LJ = 1;

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0208, code lost:
    
        if (X.C78248UnM.LJIIJ() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x020a, code lost:
    
        X.C64028PAy.LIZ("APM-Slardar", "sendMemory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x021b, code lost:
    
        if (X.PBO.LIZJ(r8).LJ(r4.LIZ) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0233, code lost:
    
        r1 = r4.LIZIZ + 1;
        r4.LIZIZ = r1;
        X.C64038PBi.LIZ.getClass();
        r4.LIZJ = java.lang.System.currentTimeMillis() + X.PBX.LIZ(r1);
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x021d, code lost:
    
        r3.remove(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PBN.LIZJ():void");
    }

    @Override // X.InterfaceC64040PBk
    public final String getName() {
        return "second_log_dir";
    }

    @Override // X.InterfaceC64040PBk
    public final long getSize() {
        File[] listFiles;
        PB0 pb0 = PB2.LIZ;
        pb0.LIZJ();
        File file = pb0.LIZJ;
        if (file == null) {
            listFiles = null;
        } else {
            listFiles = file.listFiles();
        }
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            j += file2.length();
        }
        return j;
    }

    public static void LIZIZ(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            PBF pbf = (PBF) it.next();
            try {
                File file = pbf.LIZLLL;
                if (file != null) {
                    OPR.LIZ(file);
                }
            } catch (Exception unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete LogFile's source File failed. logFile=");
                LIZ.append(pbf.LIZLLL);
                X1D.LIZIZ(LIZ);
                InterfaceC64004PAa interfaceC64004PAa = C64028PAy.LIZ;
                if (interfaceC64004PAa != null) {
                    interfaceC64004PAa.LIZ();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037 A[SYNTHETIC] */
    @Override // X.InterfaceC64040PBk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(long r9) {
        /*
            r8 = this;
            X.PB0 r0 = X.PB2.LIZ
            r0.LIZJ()
            java.io.File r0 = r0.LIZJ
            if (r0 != 0) goto La
        L9:
            return
        La:
            java.io.File[] r7 = r0.listFiles()
            if (r7 != 0) goto L11
            goto L9
        L11:
            int r6 = r7.length
            r5 = 0
            r4 = 0
        L14:
            if (r4 >= r6) goto L3a
            r3 = r7[r4]
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L2e
            int r1 = r2.length     // Catch: java.lang.Throwable -> L2e
            r0 = 2
            if (r1 == r0) goto L27
            goto L2e
        L27:
            r0 = r2[r5]     // Catch: java.lang.Throwable -> L2e
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r1 = -1
        L30:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L37
            X.OPR.LIZ(r3)
        L37:
            int r4 = r4 + 1
            goto L14
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PBN.LIZ(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0034, code lost:
    
        if (r8.LJIILIIL != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PBN.LIZLLL(int, java.util.List):void");
    }
}
