package X;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS18S0202000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class V5R {
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        if (r2 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List LJFF(long r6, java.util.List r8, java.util.List r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "temps"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r9.iterator()
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.A4Y r2 = (X.A4Y) r2
            X.A4e r1 = r2.getTempOverrideState()
            X.A4e r0 = X.EnumC25632A4e.CREATION
            if (r1 == r0) goto L30
            X.A4e r1 = r2.getTempOverrideState()
            X.A4e r0 = X.EnumC25632A4e.EDIT
            if (r1 != r0) goto L13
        L30:
            java.lang.Long r0 = r2.getCollectionId()
            if (r0 != 0) goto L37
            goto L13
        L37:
            long r1 = r0.longValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            r4.add(r3)
            goto L13
        L43:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r4.iterator()
        L4c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r6 = r7.next()
            X.A4Y r6 = (X.A4Y) r6
            r5.add(r6)
            java.util.Iterator r4 = r8.iterator()
        L5f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.A4Y r2 = (X.A4Y) r2
            java.lang.String r1 = r2.getReplyRefId()
            java.lang.String r0 = r6.getId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = r2.getReplyRefId()
            if (r0 == 0) goto L5f
            if (r3 == 0) goto L4c
            r5.add(r3)
            goto L4c
        L86:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.addAll(r5)
            java.util.Iterator r7 = r8.iterator()
        L92:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r6 = r7.next()
            X.A4Y r6 = (X.A4Y) r6
            java.util.Iterator r3 = r5.iterator()
        La2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.A4Y r0 = (X.A4Y) r0
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r6.getId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto La2
            if (r2 == 0) goto Le4
        Lbf:
            java.util.Iterator r3 = r9.iterator()
        Lc3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.A4Y r0 = (X.A4Y) r0
            java.lang.String r1 = r0.getReplyRefId()
            java.lang.String r0 = r6.getId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lc3
            if (r2 == 0) goto L92
            r4.add(r2)
            goto L92
        Le4:
            r4.add(r6)
            goto Lbf
        Le8:
            java.util.List r0 = X.ORZ.LLJI(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5R.LJFF(long, java.util.List, java.util.List):java.util.List");
    }

    public static final void LIZLLL(InterfaceC07790Sh interfaceC07790Sh, V7H v7h, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh LIZLLL;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        V7H v7h2 = v7h;
        C35931b3 LJIL = interfaceC24520xk.LJIL(67092663);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
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
            if (LJIL.LJIJJ(v7h2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) != 18 || !LJIL.LIZ()) {
            if (i6 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i7 != 0) {
                v7h2 = null;
            }
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LJII = C09290Yb.LJII(c1m1);
            LJIL.LJJIIJ(-483455358);
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
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
                C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 3), LJIL, 6);
                LIZLLL = C78996UzQ.LIZLLL(C78840Uwu.LJI(interfaceC07790Sh2, C17480mO.LIZ(8)), C79212V6y.LIZ(LJIL).LIZ(), C11710d5.LIZ);
                InterfaceC07790Sh LJIJJ = C70657RoD.LJIJJ(C07720Sa.LIZLLL(C09290Yb.LJII(LIZLLL), new AqS163S0100000_13(v7h2, 320)), 0.0f, 13, 1);
                LJIL.LJJIIJ(733328855);
                InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, false, LJIL);
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
                    InterfaceC07790Sh LIZ2 = C09280Ya.LIZ(C09290Yb.LJIIZILJ(c1m1), C07730Sb.LJFF);
                    LJIL.LJJIIJ(693286680);
                    InterfaceC273215k LIZ3 = C0YX.LIZ(C0YW.LIZ, C07730Sb.LJIIJ, LJIL);
                    LJIL.LJJIIJ(-1323940314);
                    InterfaceC23370vt interfaceC23370vt2 = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                    EnumC23500w6 enumC23500w62 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                    InterfaceC015404g interfaceC015404g3 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                    C40431iJ LJIIL3 = C56509MFt.LJIIL(LIZ2);
                    if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                        LJIL.LJIJI();
                        if (LJIL.LJJIL) {
                            LJIL.LJJI(c46041rM);
                        } else {
                            LJIL.LIZIZ();
                        }
                        LJIL.LJJI = false;
                        C06460Ne.LIZLLL(0, LJIIL3, AnonymousClass036.LIZLLL(LJIL, LIZ3, c45891r7, LJIL, interfaceC23370vt2, c45871r5, LJIL, enumC23500w62, c45881r6, LJIL, interfaceC015404g3, c45911r9, LJIL), LJIL, 2058660585, -678309503);
                        C32391Ox c32391Ox = C32391Ox.LIZ;
                        C31621Ly c31621Ly = C07730Sb.LJIIJJI;
                        float f = 16;
                        V2K.LIZJ(R.raw.icon_pen, "pen icon", C09290Yb.LJIIIIZZ(C09290Yb.LJIILIIL(c32391Ox.LIZ(c1m1, c31621Ly), f), f), 0L, 0.0f, 0.0f, false, LJIL, 48, LiveTryModeCountDownThresholdSetting.DEFAULT);
                        C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 4), LJIL, 6);
                        String string = FKM.LIZJ().getString(R.string.qpz);
                        o.LJIIIIZZ(string, "resources.getString(R.st…_seriesReviewSection_btn)");
                        C79053V0v.LIZIZ(string, c32391Ox.LIZ(c1m1, c31621Ly), C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIIJ, 0L, new C22060tm(3), 0, false, 0, false, null, null, null, LJIL, 0, 0, 8144);
                        V52.LIZ(LJIL, false, false, false, false);
                        V52.LIZ(LJIL, false, false, false, false);
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 12), LJIL, 6);
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
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
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
        LJJJJLI.LIZLLL = new AqS18S0202000_13(interfaceC07790Sh2, v7h2, i, i2, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v92, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0xk, X.1b3] */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r33v6, types: [X.Yns, java.util.Map, X.Ynr] */
    /* JADX WARN: Type inference failed for: r33v7, types: [java.lang.Throwable, X.0Sh] */
    /* JADX WARN: Type inference failed for: r33v9, types: [X.0Sh, X.Yns, java.util.Map, X.Ynr] */
    public static final void LIZ(A4Y review, V7H v7h, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        String str;
        InterfaceC07790Sh LIZLLL;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(review, "review");
        ?? LJIL = interfaceC24520xk.LJIL(795738547);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(review)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(v7h)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) != 146 || !LJIL.LIZ()) {
            if (i9 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            Object obj = LJJJZ;
            if (LJJJZ == C24500xi.LIZIZ) {
                C42191l9 c42191l9 = new C42191l9();
                LJIL.LJLJLLL(c42191l9);
                obj = c42191l9;
            }
            LJIL.LJJJJJ(false);
            InterfaceC07790Sh LIZJ = C07720Sa.LIZJ(C09410Yn.LIZ(interfaceC07790Sh2, EnumC09340Yg.Min), (C1OH) obj, null, false, null, null, new AqS163S0100000_13(v7h, 318), 28);
            LJIL.LJJIIJ(733328855);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZJ2 = C0YZ.LIZJ(C07730Sb.LIZIZ, false, LJIL);
            LJIL.LJJIIJ(-1323940314);
            C44031o7 c44031o7 = AnonymousClass057.LJ;
            Object LJIILLIIL = LJIL.LJIILLIIL(c44031o7);
            C44031o7 c44031o72 = AnonymousClass057.LJIIJ;
            Object LJIILLIIL2 = LJIL.LJIILLIIL(c44031o72);
            C44031o7 c44031o73 = AnonymousClass057.LJIILJJIL;
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LIZJ);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C45891r7 c45891r7 = C03720Cq.LJ;
                C24830yF.LIZ(LJIL, LIZJ2, c45891r7);
                C45871r5 c45871r5 = C03720Cq.LIZLLL;
                C24830yF.LIZ(LJIL, LJIILLIIL, c45871r5);
                C45881r6 c45881r6 = C03720Cq.LJFF;
                C24830yF.LIZ(LJIL, LJIILLIIL2, c45881r6);
                C45911r9 c45911r9 = C03720Cq.LJI;
                C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, c45911r9, LJIL), LJIL, 2058660585, -2137368960);
                float f = 8;
                if (review.isReply()) {
                    i7 = 36;
                } else {
                    i7 = 0;
                }
                InterfaceC07790Sh LIZIZ = C11F.LIZIZ(C70657RoD.LJIJI(interfaceC07790Sh2, i7, f), C76800UCe.LIZ, new V5S(review, v7h, null));
                LJIL.LJJIIJ(693286680);
                C32361Ou c32361Ou = C0YW.LIZ;
                C31621Ly c31621Ly = C07730Sb.LJIIJ;
                InterfaceC273215k LIZ = C0YX.LIZ(c32361Ou, c31621Ly, LJIL);
                LJIL.LJJIIJ(-1323940314);
                InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                EnumC23500w6 enumC23500w6 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                InterfaceC015404g interfaceC015404g2 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                C40431iJ LJIIL2 = C56509MFt.LJIIL(LIZIZ);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C06460Ne.LIZLLL(0, LJIIL2, AnonymousClass036.LIZLLL(LJIL, LIZ, c45891r7, LJIL, interfaceC23370vt, c45871r5, LJIL, enumC23500w6, c45881r6, LJIL, interfaceC015404g2, c45911r9, LJIL), LJIL, 2058660585, -678309503);
                    C32391Ox c32391Ox = C32391Ox.LIZ;
                    C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                    if (review.isReply()) {
                        i8 = 20;
                    } else {
                        i8 = 32;
                    }
                    InterfaceC07790Sh LIZLLL2 = C07720Sa.LIZLLL(C78999UzT.LJI(C78840Uwu.LJI(C09290Yb.LJIIJJI(c1m1, i8), C17480mO.LIZ), C79043V0l.LIZ((float) 0.5d, C79212V6y.LIZ(LJIL).LJII()), C11710d5.LIZ), new AqS160S0200000_13(review, v7h, 23));
                    String profileUrl = review.getProfileUrl();
                    if (profileUrl == null) {
                        profileUrl = "";
                    }
                    InterfaceC88471Ynr interfaceC88471Ynr = 0;
                    V2G.LIZ(new V2I(profileUrl), review.getName(), LIZLLL2, null, null, 0.0f, null, null, null, LJIL, 0, 504);
                    C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 12), LJIL, 6);
                    LJIL.LJJIIJ(-483455358);
                    InterfaceC273215k LIZ2 = C09330Yf.LIZ(C0YW.LIZJ, C07730Sb.LJIILIIL, LJIL);
                    LJIL.LJJIIJ(-1323940314);
                    InterfaceC23370vt interfaceC23370vt2 = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                    EnumC23500w6 enumC23500w62 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                    InterfaceC015404g interfaceC015404g3 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                    C40431iJ LJIIL3 = C56509MFt.LJIIL(c1m1);
                    if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                        LJIL.LJIJI();
                        if (LJIL.LJJIL) {
                            LJIL.LJJI(c46041rM);
                        } else {
                            LJIL.LIZIZ();
                        }
                        LJIL.LJJI = false;
                        C06460Ne.LIZLLL(0, LJIIL3, AnonymousClass036.LIZLLL(LJIL, LIZ2, c45891r7, LJIL, interfaceC23370vt2, c45871r5, LJIL, enumC23500w62, c45881r6, LJIL, interfaceC015404g3, c45911r9, LJIL), LJIL, 2058660585, -1163856341);
                        LJIL.LJJIIJ(693286680);
                        InterfaceC273215k LIZ3 = C0YX.LIZ(c32361Ou, c31621Ly, LJIL);
                        LJIL.LJJIIJ(-1323940314);
                        InterfaceC23370vt interfaceC23370vt3 = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                        EnumC23500w6 enumC23500w63 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                        InterfaceC015404g interfaceC015404g4 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                        C40431iJ LJIIL4 = C56509MFt.LJIIL(c1m1);
                        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                            LJIL.LJIJI();
                            if (LJIL.LJJIL) {
                                LJIL.LJJI(c46041rM);
                            } else {
                                LJIL.LIZIZ();
                            }
                            LJIL.LJJI = false;
                            C06460Ne.LIZLLL(0, LJIIL4, AnonymousClass036.LIZLLL(LJIL, LIZ3, c45891r7, LJIL, interfaceC23370vt3, c45871r5, LJIL, enumC23500w63, c45881r6, LJIL, interfaceC015404g4, c45911r9, LJIL), LJIL, 2058660585, -678309503);
                            String name = review.getName();
                            LJIL.LJJIIJ(-1196518457);
                            if (name != null) {
                                interfaceC88471Ynr = 0;
                                C79053V0v.LIZIZ(name, C07720Sa.LIZLLL(c1m1, new AqS160S0200000_13(review, v7h, 24)), C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIILL, 0L, new C22060tm(5), 0, false, 0, false, null, null, null, LJIL, 0, 0, 8144);
                            }
                            LJIL.LJJJJJ(false);
                            LJIL.LJJIIJ(-1196517920);
                            if (review.isVerifiedUser()) {
                                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 3), LJIL, 6);
                                float f2 = 10;
                                z = false;
                                V2K.LIZJ(R.raw.icon_color_verified_badge, "pen icon", C09290Yb.LJIIIIZZ(C09290Yb.LJIILIIL(c32391Ox.LIZ(c1m1, C07730Sb.LJIIJJI), f2), f2), 0L, 0.0f, 0.0f, false, LJIL, 48, LiveTryModeCountDownThresholdSetting.DEFAULT);
                            } else {
                                z = false;
                            }
                            LJIL.LJJJJJ(z);
                            LJIL.LJJIIJ(-105330614);
                            String creatorId = review.getCreatorId();
                            if (v7h != null) {
                                str = v7h.LJ();
                            } else {
                                str = interfaceC88471Ynr;
                            }
                            InterfaceC07790Sh interfaceC07790Sh3 = interfaceC88471Ynr;
                            if (o.LJ(creatorId, str)) {
                                C79053V0v.LIZIZ("·", C70657RoD.LJIJJ(c1m1, 3, 0.0f, 2), C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIILL, 0L, new C22060tm(5), z ? 1 : 0, z, z ? 1 : 0, z, interfaceC88471Ynr, interfaceC88471Ynr, interfaceC88471Ynr, LJIL, 54, z ? 1 : 0, 8144);
                                String string = FKM.LIZJ().getString(R.string.bwk);
                                o.LJIIIIZZ(string, "resources.getString(R.string.author)");
                                ?? r33 = interfaceC88471Ynr;
                                C79053V0v.LIZIZ(string, r33, C79212V6y.LIZ(LJIL).LJIIIIZZ(), C79212V6y.LIZIZ(LJIL).LJIILL, 0L, new C22060tm(5), z ? 1 : 0, z, z ? 1 : 0, z, r33, r33, r33, LJIL, z ? 1 : 0, z ? 1 : 0, 8146);
                                interfaceC07790Sh3 = r33;
                            }
                            LJIL.LJJJJJ(z);
                            LJIL.LJJJJJ(z);
                            LJIL.LJJJJJ(z);
                            LJIL.LJIJ();
                            LJIL.LJJJJJ(z);
                            LJIL.LJJJJJ(z);
                            float f3 = 4;
                            C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f3), LJIL, 6);
                            LJIL.LJJIIJ(-105329757);
                            if (!review.isReply()) {
                                V50.LIZIZ(10, (float) 3.5d, interfaceC07790Sh3, new V7G(v7h), review.getNumStars(), LJIL, 54, 4);
                            }
                            LJIL.LJJJJJ(z);
                            C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f3), LJIL, 6);
                            String contentText = review.getContentText();
                            LJIL.LJJIIJ(-105329044);
                            InterfaceC88471Ynr interfaceC88471Ynr2 = interfaceC07790Sh3;
                            if (contentText != null) {
                                interfaceC88471Ynr2 = interfaceC07790Sh3;
                                if (s.LJZI(contentText).toString().length() != 0) {
                                    ?? r332 = interfaceC07790Sh3;
                                    C79053V0v.LIZIZ(contentText, C09290Yb.LJII(c1m1), C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIILJJIL, 0L, new C22060tm(5), 0, false, 0, false, r332, r332, r332, LJIL, 48, 0, 8144);
                                    C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f3), LJIL, 6);
                                    interfaceC88471Ynr2 = r332;
                                }
                            }
                            LJIL.LJJJJJ(false);
                            InterfaceC07790Sh LJII = C09290Yb.LJII(c1m1);
                            LJIL.LJJIIJ(693286680);
                            InterfaceC273215k LIZ4 = C0YX.LIZ(c32361Ou, c31621Ly, LJIL);
                            LJIL.LJJIIJ(-1323940314);
                            InterfaceC23370vt interfaceC23370vt4 = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                            EnumC23500w6 enumC23500w64 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                            InterfaceC015404g interfaceC015404g5 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                            C40431iJ LJIIL5 = C56509MFt.LJIIL(LJII);
                            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                                LJIL.LJIJI();
                                if (LJIL.LJJIL) {
                                    LJIL.LJJI(c46041rM);
                                } else {
                                    LJIL.LIZIZ();
                                }
                                LJIL.LJJI = false;
                                C06460Ne.LIZLLL(0, LJIIL5, AnonymousClass036.LIZLLL(LJIL, LIZ4, c45891r7, LJIL, interfaceC23370vt4, c45871r5, LJIL, enumC23500w64, c45881r6, LJIL, interfaceC015404g5, c45911r9, LJIL), LJIL, 2058660585, -678309503);
                                long j = 0;
                                boolean z2 = false;
                                int i10 = 0;
                                C79053V0v.LIZIZ(ujb.o.LJJJJZ(C86036Xpg.LIZIZ(review.getUnixTimestamp() * 1000), "/", "-", false), interfaceC88471Ynr2, C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIIZILJ, 0L, new C22060tm(5), 0, false, 0, false, interfaceC88471Ynr2, interfaceC88471Ynr2, interfaceC88471Ynr2, LJIL, 0, 0, 8146);
                                LJIL.LJJIIJ(-1196514813);
                                if (review.getCanReply()) {
                                    C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, f), LJIL, 6);
                                    InterfaceC07790Sh LIZLLL3 = C07720Sa.LIZLLL(c1m1, new AqS160S0200000_13(review, v7h, 25));
                                    String string2 = FKM.LIZJ().getString(R.string.q21);
                                    long LJIIL6 = C79212V6y.LIZ(LJIL).LJIIL();
                                    C08370Un c08370Un = C79212V6y.LIZIZ(LJIL).LJIILLIIL;
                                    o.LJIIIIZZ(string2, "getString(R.string.reply)");
                                    j = 0;
                                    i10 = 0;
                                    z2 = false;
                                    C79053V0v.LIZIZ(string2, LIZLLL3, LJIIL6, c08370Un, 0L, new C22060tm(5), 0, false, 0, false, interfaceC88471Ynr2, interfaceC88471Ynr2, interfaceC88471Ynr2, LJIL, 0, 0, 8144);
                                }
                                LJIL.LJJJJJ(z2);
                                LJIL.LJJIIJ(555612653);
                                ?? r0 = z2;
                                if (review.isEditable()) {
                                    C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, f), LJIL, 6);
                                    String string3 = FKM.LIZJ().getString(R.string.fgu);
                                    o.LJIIIIZZ(string3, "resources.getString(R.string.edit)");
                                    r0 = 0;
                                    C79053V0v.LIZIZ(string3, C07720Sa.LIZLLL(c1m1, new AqS160S0200000_13(review, v7h, 26)), C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIILLIIL, j, new C22060tm(5), i10, i10, i10, i10, interfaceC88471Ynr2, interfaceC88471Ynr2, interfaceC88471Ynr2, LJIL, i10, i10, 8144);
                                }
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJIJ();
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJIJ();
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                LJIL.LJIJ();
                                LJIL.LJJJJJ(r0);
                                LJIL.LJJJJJ(r0);
                                if (review.isTransient()) {
                                    LIZLLL = C78996UzQ.LIZLLL(C09290Yb.LJFF(C09290Yb.LJII(c1m1)), ((C11850dJ) C79212V6y.LIZ(LJIL).LJLJJL.getValue()).LIZ, C11710d5.LIZ);
                                    V5E.LIZ(LIZLLL, LJIL, r0, r0);
                                }
                                V52.LIZ(LJIL, r0, r0, r0, r0);
                            } else {
                                C78929UyL.LJIILJJIL();
                                throw interfaceC88471Ynr2;
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
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C79210V6w(review, v7h, interfaceC07790Sh2, i, i2);
    }

    public static final void LJ(A4T reviewObjects, InterfaceC07790Sh interfaceC07790Sh, V7H v7h, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        V7H v7h2 = v7h;
        o.LJIIIZ(reviewObjects, "reviewObjects");
        C35931b3 LJIL = interfaceC24520xk.LJIL(241685487);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(reviewObjects)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(v7h2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 651) != 130 || !LJIL.LIZ()) {
            if ((i2 & 2) != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i6 != 0) {
                v7h2 = null;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            Object obj = LJJJZ;
            if (LJJJZ == c24490xh) {
                ParcelableSnapshotMutableState LJJJIL = C78966Uyw.LJJJIL(Boolean.FALSE);
                LJIL.LJLJLLL(LJJJIL);
                obj = LJJJIL;
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) obj;
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            C76800UCe c76800UCe = C76800UCe.LIZ;
            LJIL.LJJIIJ(511388516);
            boolean LJIJJ = LJIL.LJIJJ(interfaceC35811ar) | LJIL.LJIJJ(reviewObjects);
            Object LJJJZ2 = LJIL.LJJJZ();
            Object obj2 = LJJJZ2;
            if (LJIJJ || LJJJZ2 == c24490xh) {
                C25631A4d c25631A4d = new C25631A4d(reviewObjects, interfaceC35811ar, null);
                LJIL.LJLJLLL(c25631A4d);
                obj2 = c25631A4d;
            }
            LJIL.LJJJJJ(false);
            C24610xt.LJ(c76800UCe, (InterfaceC88471Ynr) obj2, LJIL);
            C32301Oo c32301Oo = C0YW.LJ;
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LIZLLL = C07720Sa.LIZLLL(C09290Yb.LJII(c1m1), new AqS163S0100000_13(v7h2, 321));
            LJIL.LJJIIJ(693286680);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C0YX.LIZ(c32301Oo, C07730Sb.LJIIJ, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LIZLLL);
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
                C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, 2058660585, -678309503);
                C32391Ox c32391Ox = C32391Ox.LIZ;
                String string = FKM.LIZJ().getString(R.string.qpr, Long.valueOf(reviewObjects.getTotalReviews() + (((Boolean) interfaceC35811ar.getValue()).booleanValue() ? 1L : 0L)));
                o.LJIIIIZZ(string, "resources.getString(\n   …) 1 else 0,\n            )");
                C79053V0v.LIZIZ(string, null, C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIILL, 0L, new C22060tm(3), 0, false, 0, false, null, null, null, LJIL, 0, 0, 8146);
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 3), LJIL, 6);
                float f = 12;
                C0SR.LIZ(V23.LIZIZ(new SY9(context, R.raw.icon_chevron_right_ltr), LJIL), "See All", c32391Ox.LIZ(C09290Yb.LJIILIIL(C09290Yb.LJIIIIZZ(c1m1, f), f), C07730Sb.LJIIJJI), null, null, 0.0f, C11860dK.LIZIZ(C79212V6y.LIZ(LJIL).LJIIL()), LJIL, 56, 56);
                V52.LIZ(LJIL, false, false, false, false);
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
        LJJJJLI.LIZLLL = new C25648A4u(reviewObjects, interfaceC07790Sh2, v7h2, i, i2);
    }

    public static final void LIZJ(boolean z, List<A4Y> temporaryReviewObjects, A4T reviewObjectsList, InterfaceC07790Sh interfaceC07790Sh, V53 v53, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(temporaryReviewObjects, "temporaryReviewObjects");
        o.LJIIIZ(reviewObjectsList, "reviewObjectsList");
        C35931b3 LJIL = interfaceC24520xk.LJIL(895899190);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(reviewObjectsList)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(v53)) {
                i7 = 16384;
            } else {
                i7 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i7;
        }
        if ((i2 & 2) != 2 || (46731 & i3) != 9346 || !LJIL.LIZ()) {
            if (i8 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            int i9 = (i3 >> 9) & 14;
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
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
            int i10 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
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
                LJIIL.invoke(V10.LIZLLL(LJIL, interfaceC015404g, c45911r9, LJIL), LJIL, Integer.valueOf((i10 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                if (((i10 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    if (((((i9 >> 6) & 112) | 6) & 81) != 16 || !LJIL.LIZ()) {
                        LJIL.LJJIIJ(-477774917);
                        if (z) {
                            String string = FKM.LIZJ().getString(R.string.qps);
                            o.LJIIIIZZ(string, "resources.getString(R.st…ilPage_reviewsSec_header)");
                            C79053V0v.LIZIZ(string, C70657RoD.LJIJJ(C09290Yb.LJII(InterfaceC07790Sh.LJJJI), 0.0f, 8, 1), C79212V6y.LIZ(LJIL).LJIIIZ(), C79212V6y.LIZIZ(LJIL).LJJIII, 0L, null, 0, false, 0, false, null, null, null, LJIL, 48, 0, 8176);
                        }
                        LJIL.LJJJJJ(false);
                        C31621Ly c31621Ly = C07730Sb.LJIIJJI;
                        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                        InterfaceC07790Sh LJIL2 = C70657RoD.LJIL(c1m1, 0.0f, 0.0f, 0.0f, 16, 7);
                        LJIL.LJJIIJ(693286680);
                        InterfaceC273215k LIZ2 = C0YX.LIZ(C0YW.LIZ, c31621Ly, LJIL);
                        LJIL.LJJIIJ(-1323940314);
                        InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                        EnumC23500w6 enumC23500w6 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                        InterfaceC015404g interfaceC015404g2 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                        C40431iJ LJIIL2 = C56509MFt.LJIIL(LJIL2);
                        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                            LJIL.LJIJI();
                            if (LJIL.LJJIL) {
                                LJIL.LJJI(c46041rM);
                            } else {
                                LJIL.LIZIZ();
                            }
                            LJIL.LJJI = false;
                            C06460Ne.LIZLLL(0, LJIIL2, AnonymousClass036.LIZLLL(LJIL, LIZ2, c45891r7, LJIL, interfaceC23370vt, c45871r5, LJIL, enumC23500w6, c45881r6, LJIL, interfaceC015404g2, c45911r9, LJIL), LJIL, 2058660585, -678309503);
                            float LIZJ = A4S.LIZJ(reviewObjectsList);
                            C21430sl.LIZIZ(Q8U.LIZIZ(new Object[]{Float.valueOf(LIZJ)}, 1, "%.1f", "format(format, *args)"), null, 0L, C79043V0l.LJIIIIZZ(40), null, C13640gC.LJLJLJ, null, 0L, null, null, 0L, 0, false, 0, null, C79212V6y.LIZIZ(LJIL).LJJIII, LJIL, 199680, 0, 32726);
                            C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, (float) 13.5d), LJIL, 6);
                            LJIL.LJJIIJ(-483455358);
                            InterfaceC273215k LIZ3 = C09330Yf.LIZ(c32371Ov, c31611Lx, LJIL);
                            LJIL.LJJIIJ(-1323940314);
                            InterfaceC23370vt interfaceC23370vt2 = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                            EnumC23500w6 enumC23500w62 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                            InterfaceC015404g interfaceC015404g3 = (InterfaceC015404g) LJIL.LJIILLIIL(c44031o73);
                            C40431iJ LJIIL3 = C56509MFt.LJIIL(c1m1);
                            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                                LJIL.LJIJI();
                                if (LJIL.LJJIL) {
                                    LJIL.LJJI(c46041rM);
                                } else {
                                    LJIL.LIZIZ();
                                }
                                LJIL.LJJI = false;
                                C06460Ne.LIZLLL(0, LJIIL3, AnonymousClass036.LIZLLL(LJIL, LIZ3, c45891r7, LJIL, interfaceC23370vt2, c45871r5, LJIL, enumC23500w62, c45881r6, LJIL, interfaceC015404g3, c45911r9, LJIL), LJIL, 2058660585, -1163856341);
                                int i11 = ((i3 >> 3) & 7168) | 54;
                                z2 = false;
                                V50.LIZIZ(20, (float) 8.5d, null, v53, LIZJ, LJIL, i11, 4);
                                InterfaceC07790Sh LJIL3 = C70657RoD.LJIL(c1m1, 0.0f, 2, 0.0f, 0.0f, 13);
                                String string2 = FKM.LIZJ().getString(R.string.qpq, Long.valueOf(A4S.LJFF(reviewObjectsList)));
                                long LJIIL4 = C79212V6y.LIZ(LJIL).LJIIL();
                                C08370Un c08370Un = C79212V6y.LIZIZ(LJIL).LJIILJJIL;
                                o.LJIIIIZZ(string2, "getString(\n             …(),\n                    )");
                                C79053V0v.LIZIZ(string2, LJIL3, LJIIL4, c08370Un, 0L, null, 0, false, 0, false, null, null, null, LJIL, 48, 0, 8176);
                                V52.LIZ(LJIL, false, false, false, false);
                                V52.LIZ(LJIL, false, false, false, false);
                                V52.LIZ(LJIL, z2, z2, z2, z2);
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
                    }
                } else {
                    LJIL.LIZLLL();
                }
                z2 = false;
                V52.LIZ(LJIL, z2, z2, z2, z2);
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
        LJJJJLI.LIZLLL = new V6Q(z, temporaryReviewObjects, reviewObjectsList, interfaceC07790Sh2, v53, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C32541Pm r32, X.A4T r33, boolean r34, boolean r35, boolean r36, boolean r37, X.InterfaceC07790Sh r38, boolean r39, X.V7H r40, X.InterfaceC24520xk r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5R.LIZIZ(X.1Pm, X.A4T, boolean, boolean, boolean, boolean, X.0Sh, boolean, X.V7H, X.0xk, int, int):void");
    }
}
