package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS437S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.V5c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79164V5c {
    public static final void LIZ(Context context, String imagePath, boolean z, AbstractC65590Pog<ESM<?>> actions, InterfaceC24520xk interfaceC24520xk, int i) {
        V77 v7x;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(actions, "actions");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1184050607);
        if (z) {
            v7x = new V7Y();
        } else {
            v7x = new V7X();
        }
        C32351Ot c32351Ot = new C32351Ot(v7x.LJ, C50651yn.LJLIL);
        LJIL.LJJIIJ(-483455358);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C09330Yf.LIZ(c32351Ot, C07730Sb.LJIILIIL, LJIL);
        LJIL.LJJIIJ(-1323940314);
        Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJIJI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(c46041rM);
            } else {
                LJIL.LIZIZ();
            }
            LJIL.LJJI = false;
            C24830yF.LIZ(LJIL, LIZ, C03720Cq.LJ);
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, 2058660585, -1163856341);
            C1P2 c1p2 = C1P2.LIZ;
            boolean z2 = false;
            C21510st.LIZ(C62824OlA.LJLIL, c1p2.LIZ(C09290Yb.LJIIJ(C78840Uwu.LJI(c1m1, C17480mO.LIZ(v7x.LJFF)), v7x.LIZ + 8.0f, v7x.LIZIZ + 8.0f), C07730Sb.LJIILJJIL), false, null, null, null, null, C21380sg.LIZ(C79212V6y.LIZ(LJIL).LJIILIIL(), 0L, 0L, 0L, LJIL, 32768, 14), null, C1DJ.LJ(LJIL, 667655305, new C79186V5y(context, imagePath, v7x, i)), LJIL, 805306374, 380);
            ArrayList arrayList = new ArrayList(C32I.LJJL(actions, 10));
            Iterator it = actions.iterator();
            while (it.hasNext()) {
                ESM esm = (ESM) it.next();
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = esm.LIZLLL;
                InterfaceC07790Sh LJIIJ = C09290Yb.LJIIJ(InterfaceC07790Sh.LJJJI, v7x.LIZJ, v7x.LIZLLL);
                InterfaceC07760Se.LJJJ.getClass();
                z2 = false;
                C21510st.LIZ(interfaceC65784Pro, c1p2.LIZ(LJIIJ, C07730Sb.LJIILJJIL), false, null, null, C17480mO.LIZ(v7x.LJFF), null, C21380sg.LIZ(C79212V6y.LIZ(LJIL).LJIILIIL(), 0L, 0L, 0L, LJIL, 32768, 14), null, C1DJ.LJ(LJIL, 576485493, new IDqS437S0100000_13(esm, (ESM<?>) 5)), LJIL, 805306368, 348);
                arrayList.add(C76800UCe.LIZ);
            }
            V52.LIZ(LJIL, z2, z2, z2, z2);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new C62813Okz(context, imagePath, z, actions, i);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
    
        if (r5 == X.C24500xi.LIZIZ) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.content.Context r21, java.lang.String r22, X.V77 r23, X.InterfaceC07790Sh r24, X.InterfaceC24520xk r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79164V5c.LIZIZ(android.content.Context, java.lang.String, X.V77, X.0Sh, X.0xk, int, int):void");
    }
}
