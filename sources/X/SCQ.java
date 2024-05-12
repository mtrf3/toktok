package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SCQ {
    public static boolean LJIIIIZZ;
    public static final boolean LJIIIZ = o.LJ(EF7.LJIILIIL, "local_test");
    public SC6 LIZIZ;
    public boolean LJ;
    public Integer LJI;
    public final int LIZ = 1;
    public InterfaceC88471Ynr<? super SC6, ? super Integer, C76800UCe> LIZJ = SCU.LJLIL;
    public InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> LIZLLL = SCT.LJLIL;
    public OcrStatus LJFF = new OcrStatus(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    public final SCR LJII = new SCR(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static OcrStatus LIZIZ(SC6 res) {
        String str;
        boolean z;
        String str2;
        C24000wu c24000wu;
        o.LJIIIZ(res, "res");
        OcrStatus ocrStatus = new OcrStatus(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        String str3 = res.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        C276116n c276116n = C22780uw.LIZ;
        C24050wz LIZIZ = c276116n.LIZIZ(str3);
        if (LIZIZ != null) {
            str = LIZIZ.LJI;
        } else {
            str = null;
        }
        boolean z2 = true;
        if (str == null || str.length() == 0 || str3.length() == 0) {
            z = false;
        } else {
            z = c276116n.LIZLLL(str, "eg_ccdc_global_card_number", str3).LIZ;
        }
        if (str3.length() != 0) {
            ocrStatus = OcrStatus.LIZ(ocrStatus, V1M.LJJJJZ(z), null, 6);
        }
        SC7 sc7 = res.LIZIZ;
        sc7.getClass();
        if (str == null || str.length() == 0) {
            return ocrStatus;
        }
        String str4 = sc7.LIZ;
        if ((str4 == null || str4.length() == 0) && ((str2 = sc7.LIZIZ) == null || str2.length() == 0)) {
            return ocrStatus;
        }
        C24000wu LJ = c276116n.LJ(str, sc7.LIZ, sc7.LIZIZ);
        if (LJ.LIZLLL == null) {
            LJ.LIZLLL = new ArrayList();
        }
        List<C24000wu> list = LJ.LIZLLL;
        if (list != null) {
            c24000wu = (C24000wu) ORZ.LJLLLLLL(0, list);
        } else {
            c24000wu = null;
        }
        if (!LJ.LIZ || c24000wu == null || !c24000wu.LIZ) {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        if (valueOf == null) {
            return ocrStatus;
        }
        return OcrStatus.LIZ(ocrStatus, null, V1M.LJJJJZ(valueOf.booleanValue()), 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r0 = X.C22780uw.LIZ;
        r3 = r11.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r0.LIZ.get() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r2 = (X.C41501k2) X.C276216o.LJIIL.LIZJ();
        X.C41501k2.LIZIZ(r4, wi2.g.LIZIZ, new X.C1AS(r3));
        X.SCQ.LJIIIIZZ = true;
        r11.LJI = r4.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        throw new java.lang.IllegalArgumentException("please init first");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r11.LIZLLL.invoke("sdk didn't init!!", java.lang.Integer.valueOf(X.C52899KpT.LIZ().ocrMode));
        X.C78983UzD.LJIIZILJ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (X.SCQ.LJIIIZ == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0016, code lost:
    
        r0 = r0.nonce;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0018, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x000d, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r4 = new X.F6K(r5, r6, r7, java.lang.Integer.valueOf(X.C52899KpT.LIZ().ocrMode), java.lang.String.valueOf(X.C52899KpT.LIZ().showProtectionTips), java.lang.String.valueOf(X.C52899KpT.LIZ().uiType));
        r1 = X.C71222qs.LJLIL;
        kotlin.jvm.internal.o.LJIIIZ(r1, "l");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.SCQ r11) {
        /*
            X.F6K r4 = new X.F6K
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r0 = X.EO3.LIZ
            java.lang.String r7 = ""
            if (r0 == 0) goto Lc
            java.lang.String r5 = r0.merchantId
            if (r5 != 0) goto Lf
        Lc:
            r5 = r7
            if (r0 == 0) goto L13
        Lf:
            java.lang.String r6 = r0.merchantUserId
            if (r6 != 0) goto L16
        L13:
            r6 = r7
            if (r0 == 0) goto L1a
        L16:
            java.lang.String r0 = r0.nonce
            if (r0 != 0) goto L43
        L1a:
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcPipoOcrConfig r0 = X.C52899KpT.LIZ()
            int r0 = r0.ocrMode
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcPipoOcrConfig r0 = X.C52899KpT.LIZ()
            int r0 = r0.showProtectionTips
            java.lang.String r9 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcPipoOcrConfig r0 = X.C52899KpT.LIZ()
            int r0 = r0.uiType
            java.lang.String r10 = java.lang.String.valueOf(r0)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.2qs r1 = X.C71222qs.LJLIL
            java.lang.String r0 = "l"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            goto L45
        L43:
            r7 = r0
            goto L1a
        L45:
            X.16n r0 = X.C22780uw.LIZ     // Catch: java.lang.Exception -> L73
            X.SCR r3 = r11.LJII     // Catch: java.lang.Exception -> L73
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZ     // Catch: java.lang.Exception -> L73
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L6b
            X.16o r0 = X.C276216o.LJIIL     // Catch: java.lang.Exception -> L73
            X.1Jo r2 = r0.LIZJ()     // Catch: java.lang.Exception -> L73
            wi2.g r1 = wi2.g.LIZIZ     // Catch: java.lang.Exception -> L73
            X.1AS r0 = new X.1AS     // Catch: java.lang.Exception -> L73
            r0.<init>(r3)     // Catch: java.lang.Exception -> L73
            X.1k2 r2 = (X.C41501k2) r2     // Catch: java.lang.Exception -> L73
            X.C41501k2.LIZIZ(r4, r1, r0)     // Catch: java.lang.Exception -> L73
            r0 = 1
            X.SCQ.LJIIIIZZ = r0     // Catch: java.lang.Exception -> L73
            java.lang.Integer r0 = r4.LJLJJI     // Catch: java.lang.Exception -> L73
            r11.LJI = r0     // Catch: java.lang.Exception -> L73
            goto L8c
        L6b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "please init first"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L73
            throw r1     // Catch: java.lang.Exception -> L73
        L73:
            r3 = move-exception
            X.Ynr<? super java.lang.String, ? super java.lang.Integer, X.UCe> r2 = r11.LIZLLL
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcPipoOcrConfig r0 = X.C52899KpT.LIZ()
            int r0 = r0.ocrMode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sdk didn't init!!"
            r2.invoke(r0, r1)
            X.C78983UzD.LJIIZILJ(r3)
            boolean r0 = X.SCQ.LJIIIZ
            if (r0 != 0) goto L8d
        L8c:
            return
        L8d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SCQ.LIZLLL(X.SCQ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OcrStatus LIZ(SC6 res) {
        boolean z;
        o.LJIIIZ(res, "res");
        OcrStatus ocrStatus = new OcrStatus(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        SC6 sc6 = this.LIZIZ;
        if (sc6 == null) {
            return ocrStatus;
        }
        String str = sc6.LIZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ocrStatus = OcrStatus.LIZ(ocrStatus, V1M.LJJJJZ(o.LJ(str, res.LIZ)), null, 6);
        }
        if (sc6.LIZIZ.LIZ()) {
            return OcrStatus.LIZ(ocrStatus, null, V1M.LJJJJZ(o.LJ(res.LIZIZ, sc6.LIZIZ)), 5);
        }
        return ocrStatus;
    }

    public final Boolean LIZJ(String str) {
        String str2;
        SC6 sc6 = this.LIZIZ;
        if (sc6 == null || (str2 = sc6.LIZ) == null || str2.length() == 0) {
            return null;
        }
        return Boolean.valueOf(o.LJ(sc6.LIZ, str));
    }

    public final void LJ(InterfaceC88472Yns<? super OcrStatus, OcrStatus> interfaceC88472Yns) {
        if (!this.LJ) {
            return;
        }
        this.LJFF = interfaceC88472Yns.invoke(this.LJFF);
    }
}
