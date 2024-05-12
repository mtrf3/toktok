package X;

import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.Ioq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47764Ioq implements InterfaceC47844Iq8 {
    public final WeakReference<TTVideoEngineImpl> LIZ;

    public C47764Ioq(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZ(C47789IpF c47789IpF) {
        if (c47789IpF == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetcher should retry, error:");
        LIZ.append(c47789IpF.toString());
        C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return;
        }
        C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
        int i = tTVideoEngineImpl.LLILIL;
        c47750Ioc.getClass();
        HashMap LJFF = c47789IpF.LJFF();
        LJFF.put("apiver", Integer.valueOf(i));
        c47750Ioc.LJIILJJIL.add(LJFF);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZIZ(String str) {
        C78253UnR.LJI("TTVideoEngine", "fetcher cancelled");
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return;
        }
        tTVideoEngineImpl.e.LJIJJ(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (r4.b5.LJI.readInt() == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        r4.e.LIZIZ.LLIIIZ = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r4.LLZLLIL.onFetchedVideoInfo(r7) != false) goto L27;
     */
    @Override // X.InterfaceC47844Iq8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C47164IfA r7, X.C47789IpF r8) {
        /*
            r6 = this;
            java.lang.ref.WeakReference<com.ss.ttvideoengine.TTVideoEngineImpl> r0 = r6.LIZ
            java.lang.Object r4 = r0.get()
            com.ss.ttvideoengine.TTVideoEngineImpl r4 = (com.ss.ttvideoengine.TTVideoEngineImpl) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            r3 = 0
            r4.z0 = r3
            java.lang.String r2 = "TTVideoEngine"
            if (r7 == 0) goto L14
            if (r8 == 0) goto L51
        L14:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "fetch info failed:"
            r1.append(r0)
            java.lang.String r0 = r8.toString()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C78253UnR.LIZLLL(r2, r0)
            java.util.Map r0 = r8.LJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "log_id"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L48
            X.Ioc r2 = r4.e
            java.util.Map r0 = r8.LJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 15
            r2.LJJJJIZL(r0, r1)
        L48:
            X.Ioc r0 = r4.e
            r0.getClass()
            r4.LLLIIIIL(r8)
            return
        L51:
            r4.LLZZZZ = r7
            java.lang.String r0 = "fetch info success"
            X.C78253UnR.LJI(r2, r0)
            X.Ioc r0 = r4.e
            r0.LJIJ(r7)
            int r0 = r4.L6
            r2 = 1
            if (r0 != r2) goto L6b
            X.ImS r0 = r4.LLZZZZ
            java.lang.String r0 = r0.LJIIIIZZ()
            r4.LLZLL(r0)
        L6b:
            boolean r5 = r7.LJJIJ()
            r4.LLD = r5
            r4.LJZ = r5
            X.Ipc r1 = r4.LJLJI
            r0 = 17
            r1.LJ(r0, r5)
            boolean r0 = r4.U
            if (r0 == 0) goto L7f
            return
        L7f:
            X.IaA r0 = r4.LLZLLIL
            if (r0 == 0) goto Lc5
            X.Iot r0 = r4.b5
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto Lad
            boolean r1 = r4.LLLLLILLIL
            r0 = 558(0x22e, float:7.82E-43)
            int r0 = r4.LIZ(r0, r1)
            if (r0 == 0) goto Lb6
            X.Iot r1 = r4.b5
            X.ImS r0 = r4.LLZZZZ
            r1.LJIIIIZZ(r0)
            X.Iot r0 = r4.b5
            android.os.Parcel r0 = r0.LJI
            int r0 = r0.readInt()
            if (r0 != r2) goto Lbf
        La6:
            X.Ioc r0 = r4.e
            X.Iod r0 = r0.LIZIZ
            r0.LLIIIZ = r2
            return
        Lad:
            X.IaA r0 = r4.LLZLLIL
            boolean r0 = r0.onFetchedVideoInfo(r7)
            if (r0 == 0) goto Lbf
            goto La6
        Lb6:
            X.Iot r2 = r4.b5
            X.ImS r1 = r4.LLZZZZ
            r0 = 411(0x19b, float:5.76E-43)
            r2.LJFF(r0, r3, r3, r1)
        Lbf:
            X.Ioc r0 = r4.e
            X.Iod r0 = r0.LIZIZ
            r0.LLIIIZ = r3
        Lc5:
            r4.LJLJJLL(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47764Ioq.LIZJ(X.IfA, X.IpF):void");
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZLLL(int i, String str) {
        boolean z;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video status exception:");
        LIZ.append(i);
        C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
        tTVideoEngineImpl.z0 = false;
        C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
        if (c47750Ioc != null) {
            if (c47750Ioc.LJJLI == 4) {
                c47750Ioc.LIZLLL.LIZ(0, "error");
                z = false;
            } else {
                z = true;
            }
            if (c47750Ioc.LJJLI == 3) {
                c47750Ioc.LIZJ.LIZIZ("error");
                c47750Ioc.LIZIZ.LLJJJJJIL = System.currentTimeMillis();
                z = false;
            }
            c47750Ioc.LJJLI = 5;
            if (z) {
                c47750Ioc.LJI.LJIILJJIL();
            }
            C47751Iod c47751Iod = c47750Ioc.LIZIZ;
            c47751Iod.LJJJJLI = i;
            c47751Iod.LJJJJLL = str;
            c47750Ioc.LJIL(5);
        }
        if (tTVideoEngineImpl.b5.LIZIZ()) {
            tTVideoEngineImpl.b5.LJFF(410, i, 0, null);
        } else {
            tTVideoEngineImpl.LLZL.onVideoStatusException(i);
        }
    }
}
