package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS67S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5D {
    public static final float LIZIZ(InterfaceC35811ar<C23390vv> interfaceC35811ar) {
        return interfaceC35811ar.getValue().LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(T29 delegatePaidContentReview, int i, String initialContentText, boolean z, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C35931b3 c35931b3;
        InterfaceC07790Sh LIZLLL;
        long j;
        long LIZIZ;
        InterfaceC07790Sh LIZLLL2;
        long LJIIJ;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(delegatePaidContentReview, "delegatePaidContentReview");
        o.LJIIIZ(initialContentText, "initialContentText");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-278523771);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(delegatePaidContentReview)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIIIZ(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(initialContentText)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJI(z)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i9 = 16384;
            } else {
                i9 = FileUtils.BUFFER_SIZE;
            }
            i4 |= i9;
        }
        if ((46811 & i4) != 9362 || !LJIL.LIZ()) {
            if (i10 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = C78966Uyw.LJJJIL(initialContentText);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            InterfaceC07790Sh LJII = C09290Yb.LJII(interfaceC07790Sh2);
            LJIL.LJJIIJ(-483455358);
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            C31611Lx c31611Lx = C07730Sb.LJIILIIL;
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, c31611Lx, LJIL);
            LJIL.LJJIIJ(-1323940314);
            C44031o7 c44031o7 = AnonymousClass057.LJ;
            Object LJIILLIIL = LJIL.LJIILLIIL(c44031o7);
            C44031o7 c44031o72 = AnonymousClass057.LJIIJ;
            Object LJIILLIIL2 = LJIL.LJIILLIIL(c44031o72);
            C44031o7 c44031o73 = AnonymousClass057.LJIILJJIL;
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJII);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C45891r7 c45891r7 = C03720Cq.LJ;
                C24830yF.LIZ(LJIL, LIZ, c45891r7);
                C45871r5 c45871r5 = C03720Cq.LIZLLL;
                C24830yF.LIZ(LJIL, LJIILLIIL, c45871r5);
                C45881r6 c45881r6 = C03720Cq.LJFF;
                C24830yF.LIZ(LJIL, LJIILLIIL2, c45881r6);
                C45911r9 c45911r9 = C03720Cq.LJI;
                C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, c45911r9, LJIL), LJIL, 2058660585, -1163856341);
                C1P2 c1p2 = C1P2.LIZ;
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                InterfaceC07790Sh LJIJJ = C70657RoD.LJIJJ(C09290Yb.LJII(c1m1), 0.0f, 20, 1);
                LJIL.LJJIIJ(733328855);
                C31631Lz c31631Lz = C07730Sb.LIZIZ;
                InterfaceC273215k LIZJ = C0YZ.LIZJ(c31631Lz, false, LJIL);
                LJIL.LJJIIJ(-1323940314);
                InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                EnumC23500w6 enumC23500w6 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                InterfaceC015404g interfaceC015404g2 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                C40431iJ LJIIL2 = C56509MFt.LJIIL(LJIJJ);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C06460Ne.LIZLLL(0, LJIIL2, AnonymousClass036.LIZLLL(LJIL, LIZJ, c45891r7, LJIL, interfaceC23370vt, c45871r5, LJIL, enumC23500w6, c45881r6, LJIL, interfaceC015404g2, c45911r9, LJIL), LJIL, 2058660585, -2137368960);
                    float f = 12;
                    c35931b3 = LJIL;
                    V50.LIZIZ(45, f, C09280Ya.LIZ(c1m1, C07730Sb.LJFF), delegatePaidContentReview, i, c35931b3, ((i4 << 9) & 7168) | 54, 0);
                    V52.LIZ(c35931b3, false, false, false, false);
                    C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 16), c35931b3, 6);
                    c35931b3.LJJIIJ(-492369756);
                    Object LJJJZ2 = c35931b3.LJJJZ();
                    if (LJJJZ2 == c24490xh) {
                        LJJJZ2 = C78966Uyw.LJJJIL(new C23390vv(0));
                        c35931b3.LJLJLLL(LJJJZ2);
                    }
                    c35931b3.LJJJJJ(false);
                    InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) LJJJZ2;
                    c35931b3.LJJIIJ(-492369756);
                    Object LJJJZ3 = c35931b3.LJJJZ();
                    if (LJJJZ3 == c24490xh) {
                        LJJJZ3 = C78966Uyw.LJJJIL(new C23390vv(0));
                        c35931b3.LJLJLLL(LJJJZ3);
                    }
                    c35931b3.LJJJJJ(false);
                    InterfaceC35811ar interfaceC35811ar3 = (InterfaceC35811ar) LJJJZ3;
                    float f2 = 28;
                    c35931b3.LJJIIJ(733328855);
                    InterfaceC273215k LIZJ2 = C0YZ.LIZJ(c31631Lz, false, c35931b3);
                    c35931b3.LJJIIJ(-1323940314);
                    InterfaceC23370vt interfaceC23370vt2 = (InterfaceC23370vt) c35931b3.LJIILLIIL(c44031o7);
                    EnumC23500w6 enumC23500w62 = (EnumC23500w6) c35931b3.LJIILLIIL(c44031o72);
                    InterfaceC015404g interfaceC015404g3 = (InterfaceC015404g) c35931b3.LJIILLIIL(c44031o73);
                    C40431iJ LJIIL3 = C56509MFt.LJIIL(c1m1);
                    if (c35931b3.LIZIZ instanceof InterfaceC24420xa) {
                        c35931b3.LJIJI();
                        if (c35931b3.LJJIL) {
                            c35931b3.LJJI(c46041rM);
                        } else {
                            c35931b3.LIZIZ();
                        }
                        c35931b3.LJJI = false;
                        C06460Ne.LIZLLL(0, LJIIL3, AnonymousClass036.LIZLLL(c35931b3, LIZJ2, c45891r7, c35931b3, interfaceC23370vt2, c45871r5, c35931b3, enumC23500w62, c45881r6, c35931b3, interfaceC015404g3, c45911r9, c35931b3), c35931b3, 2058660585, -2137368960);
                        float f3 = 8;
                        LIZLLL = C78996UzQ.LIZLLL(C78840Uwu.LJI(C09290Yb.LJII(c1m1), C17480mO.LIZ(f3)), C79212V6y.LIZ(c35931b3).LIZ(), C11710d5.LIZ);
                        InterfaceC07790Sh LJJIIJZLJL = V0N.LJJIIJZLJL(LIZLLL, new AqS144S0200000_13(context, (Context) interfaceC35811ar2, (InterfaceC35811ar<C23390vv>) 23));
                        c35931b3.LJJIIJ(-483455358);
                        InterfaceC273215k LIZ2 = C09330Yf.LIZ(c32371Ov, c31611Lx, c35931b3);
                        c35931b3.LJJIIJ(-1323940314);
                        InterfaceC23370vt interfaceC23370vt3 = (InterfaceC23370vt) c35931b3.LJIILLIIL(c44031o7);
                        EnumC23500w6 enumC23500w63 = (EnumC23500w6) c35931b3.LJIILLIIL(c44031o72);
                        InterfaceC015404g interfaceC015404g4 = (InterfaceC015404g) c35931b3.LJIILLIIL(c44031o73);
                        C40431iJ LJIIL4 = C56509MFt.LJIIL(LJJIIJZLJL);
                        if (c35931b3.LIZIZ instanceof InterfaceC24420xa) {
                            c35931b3.LJIJI();
                            if (c35931b3.LJJIL) {
                                c35931b3.LJJI(c46041rM);
                            } else {
                                c35931b3.LIZIZ();
                            }
                            c35931b3.LJJI = false;
                            C06460Ne.LIZLLL(0, LJIIL4, AnonymousClass036.LIZLLL(c35931b3, LIZ2, c45891r7, c35931b3, interfaceC23370vt3, c45871r5, c35931b3, enumC23500w63, c45881r6, c35931b3, interfaceC015404g4, c45911r9, c35931b3), c35931b3, 2058660585, -1163856341);
                            String str = (String) interfaceC35811ar.getValue();
                            float f4 = 86;
                            InterfaceC07790Sh LJ = C09290Yb.LJ(C09290Yb.LJII(c1m1), f4, 1);
                            long j2 = C11850dJ.LJFF;
                            C1ZM LJ2 = C21600t2.LJ(j2, j2, j2, j2, c35931b3, 2096923);
                            C21750tH.LIZ(str, C73979T1r.LJLIL, LJ, false, false, new C08370Un(j2, 0L, null, null, null, 0L, null, null, 0L, 262142), null, null, null, null, false, null, new C18880oe(1, 0, 11), null, false, 0, null, null, LJ2, c35931b3, 3504, 0, 258000);
                            float f5 = 4;
                            InterfaceC07790Sh LJIL2 = C70657RoD.LJIL(c1p2.LIZ(c1m1, C07730Sb.LJIILL), 0.0f, 0.0f, f5, f5, 3);
                            c35931b3.LJJIIJ(733328855);
                            InterfaceC273215k LIZJ3 = C0YZ.LIZJ(c31631Lz, false, c35931b3);
                            c35931b3.LJJIIJ(-1323940314);
                            InterfaceC23370vt interfaceC23370vt4 = (InterfaceC23370vt) c35931b3.LJIILLIIL(c44031o7);
                            EnumC23500w6 enumC23500w64 = (EnumC23500w6) c35931b3.LJIILLIIL(c44031o72);
                            InterfaceC015404g interfaceC015404g5 = (InterfaceC015404g) c35931b3.LJIILLIIL(c44031o73);
                            C40431iJ LJIIL5 = C56509MFt.LJIIL(LJIL2);
                            if (c35931b3.LIZIZ instanceof InterfaceC24420xa) {
                                c35931b3.LJIJI();
                                if (c35931b3.LJJIL) {
                                    c35931b3.LJJI(c46041rM);
                                } else {
                                    c35931b3.LIZIZ();
                                }
                                c35931b3.LJJI = false;
                                C06460Ne.LIZLLL(0, LJIIL5, AnonymousClass036.LIZLLL(c35931b3, LIZJ3, c45891r7, c35931b3, interfaceC23370vt4, c45871r5, c35931b3, enumC23500w64, c45881r6, c35931b3, interfaceC015404g5, c45911r9, c35931b3), c35931b3, 2058660585, -2137368960);
                                InterfaceC07790Sh LIZ3 = C09280Ya.LIZ(c1m1, C07730Sb.LJI);
                                c35931b3.LJJIIJ(693286680);
                                InterfaceC273215k LIZ4 = C0YX.LIZ(C0YW.LIZ, C07730Sb.LJIIJ, c35931b3);
                                c35931b3.LJJIIJ(-1323940314);
                                InterfaceC23370vt interfaceC23370vt5 = (InterfaceC23370vt) c35931b3.LJIILLIIL(c44031o7);
                                EnumC23500w6 enumC23500w65 = (EnumC23500w6) c35931b3.LJIILLIIL(c44031o72);
                                InterfaceC015404g interfaceC015404g6 = (InterfaceC015404g) c35931b3.LJIILLIIL(c44031o73);
                                C40431iJ LJIIL6 = C56509MFt.LJIIL(LIZ3);
                                if (c35931b3.LIZIZ instanceof InterfaceC24420xa) {
                                    c35931b3.LJIJI();
                                    if (c35931b3.LJJIL) {
                                        c35931b3.LJJI(c46041rM);
                                    } else {
                                        c35931b3.LIZIZ();
                                    }
                                    c35931b3.LJJI = false;
                                    C06460Ne.LIZLLL(0, LJIIL6, AnonymousClass036.LIZLLL(c35931b3, LIZ4, c45891r7, c35931b3, interfaceC23370vt5, c45871r5, c35931b3, enumC23500w65, c45881r6, c35931b3, interfaceC015404g6, c45911r9, c35931b3), c35931b3, 2058660585, -678309503);
                                    String valueOf = String.valueOf(((String) interfaceC35811ar.getValue()).length());
                                    if (((String) interfaceC35811ar.getValue()).length() == 0 || 0 != 0) {
                                        c35931b3.LJJIIJ(557088951);
                                        j = C79212V6y.LIZ(c35931b3).LJIIL();
                                    } else if (((String) interfaceC35811ar.getValue()).length() < 200) {
                                        c35931b3.LJJIIJ(557089027);
                                        j = C79212V6y.LIZ(c35931b3).LJIIIZ();
                                    } else {
                                        c35931b3.LJJIIJ(557089060);
                                        j = ((C11850dJ) C79212V6y.LIZ(c35931b3).LJII.getValue()).LIZ;
                                    }
                                    c35931b3.LJJJJJ(false);
                                    C79053V0v.LIZIZ(valueOf, null, j, C79212V6y.LIZIZ(c35931b3).LJIIZILJ, 0L, null, 0, false, 0, false, null, null, null, c35931b3, 0, 0, 8178);
                                    C79053V0v.LIZIZ(C169696lJ.LIZIZ('/', 200), null, C79212V6y.LIZ(c35931b3).LJIIL(), C79212V6y.LIZIZ(c35931b3).LJIIZILJ, 0L, null, 0, false, 0, false, null, null, null, c35931b3, 0, 0, 8178);
                                    V52.LIZ(c35931b3, false, false, false, false);
                                    V52.LIZ(c35931b3, false, false, false, false);
                                    V52.LIZ(c35931b3, false, false, false, false);
                                    C21750tH.LIZ((String) interfaceC35811ar.getValue(), new AqS143S0200000_12(delegatePaidContentReview, interfaceC35811ar, 81), C09290Yb.LJ(C09290Yb.LJIIIIZZ(C09290Yb.LJFF(C09290Yb.LJII(c1m1)), LIZIZ(interfaceC35811ar3) + ((C23390vv) interfaceC35811ar2.getValue()).LJLIL + f2), f4, 1), false, false, new C08370Un(C79212V6y.LIZ(c35931b3).LJIIIZ(), 0L, null, null, null, 0L, null, null, 0L, 262142), null, V5C.LIZ, null, null, false, null, new C18880oe(0, 7, 7), null, false, 0, null, null, C21600t2.LJ(j2, j2, j2, j2, c35931b3, 2096923), c35931b3, 12582912, 0, 257880);
                                    InterfaceC07790Sh LJII2 = C09290Yb.LJII(V0N.LJJIIJZLJL(C70657RoD.LJIL(interfaceC07790Sh2, 0.0f, ((C23390vv) interfaceC35811ar2.getValue()).LJLIL + f2, 0.0f, 0.0f, 13), new AqS144S0200000_13(context, (Context) interfaceC35811ar3, (InterfaceC35811ar<C23390vv>) 24)));
                                    c35931b3.LJJIIJ(-483455358);
                                    InterfaceC273215k LIZ5 = C09330Yf.LIZ(c32371Ov, c31611Lx, c35931b3);
                                    c35931b3.LJJIIJ(-1323940314);
                                    InterfaceC23370vt interfaceC23370vt6 = (InterfaceC23370vt) c35931b3.LJIILLIIL(c44031o7);
                                    EnumC23500w6 enumC23500w66 = (EnumC23500w6) c35931b3.LJIILLIIL(c44031o72);
                                    InterfaceC015404g interfaceC015404g7 = (InterfaceC015404g) c35931b3.LJIILLIIL(c44031o73);
                                    C40431iJ LJIIL7 = C56509MFt.LJIIL(LJII2);
                                    if (c35931b3.LIZIZ instanceof InterfaceC24420xa) {
                                        c35931b3.LJIJI();
                                        if (c35931b3.LJJIL) {
                                            c35931b3.LJJI(c46041rM);
                                        } else {
                                            c35931b3.LIZIZ();
                                        }
                                        c35931b3.LJJI = false;
                                        C06460Ne.LIZLLL(0, LJIIL7, AnonymousClass036.LIZLLL(c35931b3, LIZ5, c45891r7, c35931b3, interfaceC23370vt6, c45871r5, c35931b3, enumC23500w66, c45881r6, c35931b3, interfaceC015404g7, c45911r9, c35931b3), c35931b3, 2058660585, -1163856341);
                                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f), c35931b3, 6);
                                        String string = FKM.LIZJ().getString(R.string.qpx);
                                        o.LJIIIIZZ(string, "ApplicationHolder.resour…eriesReviewHalfSheet_btn)");
                                        InterfaceC07790Sh LIZLLL3 = C07720Sa.LIZLLL(C78840Uwu.LJI(c1m1, C17480mO.LIZ(f3)), new AqS67S0110000_12(z, delegatePaidContentReview, 5));
                                        if (z) {
                                            c35931b3.LJJIIJ(1963362805);
                                            LIZIZ = C79212V6y.LIZ(c35931b3).LJIIIIZZ();
                                            c35931b3.LJJJJJ(false);
                                        } else {
                                            c35931b3.LJJIIJ(1963362898);
                                            LIZIZ = C79212V6y.LIZ(c35931b3).LIZIZ();
                                            c35931b3.LJJJJJ(false);
                                        }
                                        LIZLLL2 = C78996UzQ.LIZLLL(LIZLLL3, LIZIZ, C11710d5.LIZ);
                                        InterfaceC07790Sh LIZ6 = c1p2.LIZ(C09290Yb.LJII(C70657RoD.LJIJJ(LIZLLL2, 0.0f, f, 1)), C07730Sb.LJIILJJIL);
                                        c35931b3.LJJIIJ(1963363195);
                                        if (z) {
                                            LJIIJ = C11850dJ.LIZJ;
                                        } else {
                                            LJIIJ = C79212V6y.LIZ(c35931b3).LJIIJ();
                                        }
                                        c35931b3.LJJJJJ(false);
                                        C79053V0v.LIZIZ(string, LIZ6, LJIIJ, C79212V6y.LIZIZ(c35931b3).LJIIJ, 0L, new C22060tm(3), 0, false, 0, false, null, null, null, c35931b3, 0, 0, 8144);
                                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f), c35931b3, 6);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJIJ();
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJIJ();
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJIJ();
                                        c35931b3.LJJJJJ(false);
                                        c35931b3.LJJJJJ(false);
                                    } else {
                                        C78929UyL.LJIILJJIL();
                                        throw null;
                                    }
                                } else {
                                    C78929UyL.LJIILJJIL();
                                    throw null;
                                }
                            } else {
                                C78929UyL.LJIILJJIL();
                                throw null;
                            }
                        } else {
                            C78929UyL.LJIILJJIL();
                            throw null;
                        }
                    } else {
                        C78929UyL.LJIILJJIL();
                        throw null;
                    }
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
            c35931b3 = LJIL;
        }
        C35991b9 LJJJJLI = c35931b3.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C73978T1q(delegatePaidContentReview, i, initialContentText, z, interfaceC07790Sh2, i2, i3);
    }
}
