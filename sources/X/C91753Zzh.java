package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Zzh, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91753Zzh {
    public static final void LIZ(EnumC92109a5R state, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        String LIZ;
        long j;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(state, "state");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-527632274);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(state)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if (((i3 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            if (i7 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            int[] iArr = C91752Zzg.LIZ;
            int i8 = iArr[state.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    i6 = R.drawable.ia;
                } else {
                    i6 = R.drawable.kf;
                }
            } else {
                i6 = R.drawable.km;
            }
            int i9 = iArr[state.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    LIZ = C92054a4Y.LIZ("pipo_payin_paymentcode_paymentstatu_failed", new String[0]);
                } else {
                    LIZ = C92054a4Y.LIZ("pipo_payin_status_processing", new String[0]);
                }
            } else {
                LIZ = C92054a4Y.LIZ("pipo_payin_paymentcode_paymentstatu_success", new String[0]);
            }
            int i10 = iArr[state.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    LJIL.LJJIIJ(-527631520);
                    j = C91671ZyN.LIZ(LJIL).LJIILJJIL;
                    LJIL.LJJJJJ(false);
                } else {
                    LJIL.LJJIIJ(-527631565);
                    j = C91671ZyN.LIZ(LJIL).LJJIFFI;
                    LJIL.LJJJJJ(false);
                }
            } else {
                LJIL.LJJIIJ(-527631627);
                j = C91671ZyN.LIZ(LJIL).LJJII;
                LJIL.LJJJJJ(false);
            }
            InterfaceC07760Se.LJJJ.getClass();
            C31611Lx c31611Lx = C07730Sb.LJIILJJIL;
            int i11 = ((i3 >> 3) & 14) | 384;
            LJIL.LJJIIJ(-483455358);
            InterfaceC273215k LIZ2 = C09330Yf.LIZ(C0YW.LIZJ, c31611Lx, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
            int i12 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C24830yF.LIZ(LJIL, LIZ2, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i12 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                if (((i12 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    if ((((((i11 >> 6) & 112) | 6) & 81) ^ 16) != 0 || !LJIL.LIZ()) {
                        C0SR.LIZ(C79081V1x.LJJIIZ(i6, LJIL), "", null, null, null, 0.0f, null, LJIL, 56, 124);
                        C21430sl.LIZIZ(LIZ, C70657RoD.LJIJ(InterfaceC07790Sh.LJJJI, 8), 0L, 0L, null, null, null, 0L, null, new C22060tm(3), 0L, 0, false, 0, null, new C08370Un(j, C79043V0l.LJIIIIZZ(32), C13640gC.LJLJI, null, null, 0L, null, null, 0L, 262136), LJIL, 48, 0, 32252);
                    } else {
                        LJIL.LIZLLL();
                    }
                } else {
                    LJIL.LIZLLL();
                }
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
                LJIL.LJIJ();
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92490aBa(state, interfaceC07790Sh2, i, i2);
    }
}
