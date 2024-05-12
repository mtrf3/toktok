package X;

import Y.IDCListenerS250S0100000;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0qQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19980qQ {
    public static void LIZ(long j) {
        if (j > 0) {
            C19940qM c19940qM = C19930qL.LIZ;
            C19920qK c19920qK = c19940qM.LIZJ;
            if (c19920qK == null || c19920qK.LIZ != j) {
                Iterator<C19920qK> it = c19940qM.LIZ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c19920qK = it.next();
                        if (c19920qK.LIZ == j) {
                            break;
                        }
                    } else {
                        Iterator it2 = ((ArrayList) c19940qM.LIZLLL).iterator();
                        while (it2.hasNext()) {
                            c19920qK = (C19920qK) it2.next();
                            if (c19920qK.LIZ == j) {
                            }
                        }
                        return;
                    }
                }
            }
            if (c19940qM.LIZJ == c19920qK) {
                c19940qM.LIZJ = null;
            } else {
                c19940qM.LIZIZ(c19920qK);
            }
            C19900qI c19900qI = c19920qK.LJ;
            if (c19900qI != null) {
                c19900qI.LIZ = 4;
                c19900qI.dismiss();
                return;
            }
            IDCListenerS250S0100000 iDCListenerS250S0100000 = c19920qK.LIZJ;
            if (iDCListenerS250S0100000 == null) {
                return;
            }
            c19920qK.LIZLLL.LIZIZ.removeOnLayoutChangeListener(iDCListenerS250S0100000);
            c19940qM.LIZ();
        }
    }

    public static void LIZIZ(C19920qK c19920qK) {
        if (C16330kX.LIZJ(c19920qK.LIZLLL.LIZIZ)) {
            LIZJ(c19920qK);
            return;
        }
        IDCListenerS250S0100000 iDCListenerS250S0100000 = new IDCListenerS250S0100000(c19920qK, 4);
        c19920qK.LIZJ = iDCListenerS250S0100000;
        c19920qK.LIZLLL.LIZIZ.addOnLayoutChangeListener(iDCListenerS250S0100000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x03b1, code lost:
    
        r8 = r8 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03af, code lost:
    
        if (r12 != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e3, code lost:
    
        if (r12 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        if (r12 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ee, code lost:
    
        if (r12 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02f0, code lost:
    
        r6.setAnimationStyle(com.zhiliaoapp.musically.R.style.ao);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ff, code lost:
    
        r6.setAnimationStyle(com.zhiliaoapp.musically.R.style.an);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x030a, code lost:
    
        if (r12 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0313, code lost:
    
        if (r12 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02fd, code lost:
    
        if (r12 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0335, code lost:
    
        r6 = r10.right;
        r4 = r11.left;
        r1 = r3.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x033d, code lost:
    
        if (r6 > (r4 + r1)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x033f, code lost:
    
        r5.left = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0343, code lost:
    
        r5.left = java.lang.Math.min(r6 - r4, r2.left);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0333, code lost:
    
        if (r12 == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final X.C19920qK r25) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19980qQ.LIZJ(X.0qK):void");
    }
}
