package X;

import androidx.compose.ui.platform.g1;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20120qe {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r3 > r13.getHeight()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC12040dc LIZLLL(X.C1OL r22, float r23) {
        /*
            java.lang.String r0 = "<this>"
            r12 = r22
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r2 = r23
            double r0 = (double) r2
            double r3 = java.lang.Math.ceil(r0)
            float r0 = (float) r3
            int r0 = (int) r0
            int r3 = r0 * 2
            X.0dc r13 = X.C20190ql.LIZ
            X.0d9 r0 = X.C20190ql.LIZIZ
            X.1mT r14 = X.C20190ql.LIZJ
            if (r13 == 0) goto L28
            if (r0 == 0) goto L28
            int r1 = r13.getWidth()
            if (r3 > r1) goto L28
            int r1 = r13.getHeight()
            if (r3 <= r1) goto L44
        L28:
            r1 = 1
            r0 = 24
            X.1QV r13 = X.C78966Uyw.LIZ(r3, r3, r1, r0)
            X.C20190ql.LIZ = r13
            X.1QR r0 = new X.1QR
            r0.<init>()
            android.graphics.Canvas r3 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = X.C78688UuS.LJ(r13)
            r3.<init>(r1)
            r0.LIZ = r3
            X.C20190ql.LIZIZ = r0
        L44:
            if (r14 != 0) goto L4d
            X.1mT r14 = new X.1mT
            r14.<init>()
            X.C20190ql.LIZJ = r14
        L4d:
            X.0XA r1 = r12.LJLIL
            X.0w6 r11 = r1.getLayoutDirection()
            int r1 = r13.getWidth()
            float r3 = (float) r1
            int r1 = r13.getHeight()
            float r1 = (float) r1
            long r5 = X.C1DF.LIZIZ(r3, r1)
            X.0hs r10 = r14.LJLIL
            X.0vt r9 = r10.LIZ
            X.0w6 r8 = r10.LIZIZ
            X.0d9 r7 = r10.LIZJ
            long r3 = r10.LIZLLL
            r10.LIZ = r12
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r11, r1)
            r10.LIZIZ = r11
            r10.LIZJ = r0
            r10.LIZLLL = r5
            r0.LJIIL()
            long r15 = X.C11850dJ.LIZIZ
            long r19 = r14.LIZIZ()
            r21 = 0
            r22 = 0
            r23 = 58
            r17 = 0
            X.C14720hw.LJIIIIZZ(r14, r15, r17, r19, r21, r22, r23)
            r5 = 4278190080(0xff000000, double:2.113706745E-314)
            long r15 = X.C78897Uxp.LJFF(r5)
            long r17 = X.C10370av.LIZIZ
            long r19 = X.C1DF.LIZIZ(r2, r2)
            r23 = 120(0x78, float:1.68E-43)
            X.C14720hw.LJIIIIZZ(r14, r15, r17, r19, r21, r22, r23)
            long r15 = X.C78897Uxp.LJFF(r5)
            long r18 = X.C78923UyF.LIZ(r2, r2)
            r14 = r14
            r17 = r2
            r20 = r21
            r21 = r22
            r22 = r23
            X.C14720hw.LIZJ(r14, r15, r17, r18, r20, r21, r22)
            r0.LJIIJ()
            X.0hs r0 = r14.LJLIL
            r0.getClass()
            kotlin.jvm.internal.o.LJIIIZ(r9, r1)
            r0.LIZ = r9
            kotlin.jvm.internal.o.LJIIIZ(r8, r1)
            r0.LIZIZ = r8
            kotlin.jvm.internal.o.LJIIIZ(r7, r1)
            r0.LIZJ = r7
            r0.LIZLLL = r3
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20120qe.LIZLLL(X.1OL, float):X.0dc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(long r16, final X.EnumC20220qo r18, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r19, X.InterfaceC24520xk r20, int r21) {
        /*
            java.lang.String r0 = "handleReferencePoint"
            r13 = r18
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r0 = "content"
            r7 = r19
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r0 = -1409050158(0xffffffffac0399d2, float:-1.8701607E-12)
            r1 = r20
            X.1b3 r8 = r1.LJIL(r0)
            r15 = r21
            r0 = r15 & 14
            r11 = r16
            if (r0 != 0) goto Lc1
            boolean r0 = r8.LJIIJ(r11)
            if (r0 == 0) goto Lbe
            r3 = 4
        L26:
            r3 = r3 | r15
        L27:
            r0 = r15 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L34
            boolean r0 = r8.LJIJJ(r13)
            if (r0 == 0) goto Lba
            r0 = 32
        L33:
            r3 = r3 | r0
        L34:
            r0 = r15 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L41
            boolean r0 = r8.LJIJJ(r7)
            if (r0 == 0) goto Lb7
            r0 = 256(0x100, float:3.59E-43)
        L40:
            r3 = r3 | r0
        L41:
            r1 = r3 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L4d
            boolean r0 = r8.LIZ()
            if (r0 != 0) goto Lb3
        L4d:
            float r0 = X.C10370av.LIZLLL(r11)
            int r1 = X.O6R.LJJIIZ(r0)
            float r0 = X.C10370av.LJ(r11)
            int r0 = X.O6R.LJJIIZ(r0)
            long r0 = X.C78939UyV.LIZ(r1, r0)
            X.0w1 r5 = new X.0w1
            r5.<init>(r0)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r8.LJJIIJ(r2)
            boolean r4 = r8.LJIJJ(r13)
            boolean r2 = r8.LJIJJ(r5)
            r2 = r2 | r4
            java.lang.Object r4 = r8.LJJJZ()
            if (r2 != 0) goto L84
            X.0xi r2 = X.InterfaceC24520xk.LIZ
            r2.getClass()
            X.0xh r2 = X.C24500xi.LIZIZ
            if (r4 != r2) goto L8c
        L84:
            X.1YO r4 = new X.1YO
            r4.<init>(r13, r0)
            r8.LJLJLLL(r4)
        L8c:
            r0 = 0
            r8.LJJJJJ(r0)
            X.1YO r4 = (X.C1YO) r4
            r5 = 0
            X.0zm r6 = new X.0zm
            r1 = 1
            r0 = 15
            r6.<init>(r1, r0)
            int r0 = r3 << 3
            r9 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2
            X.C25830zr.LIZ(r4, r5, r6, r7, r8, r9, r10)
        La3:
            X.1b9 r0 = r8.LJJJJLI()
            if (r0 != 0) goto Laa
        La9:
            return
        Laa:
            X.240 r10 = new X.240
            r14 = r7
            r10.<init>(r11, r13, r14, r15)
            r0.LIZLLL = r10
            goto La9
        Lb3:
            r8.LIZLLL()
            goto La3
        Lb7:
            r0 = 128(0x80, float:1.8E-43)
            goto L40
        Lba:
            r0 = 16
            goto L33
        Lbe:
            r3 = 2
            goto L26
        Lc1:
            r3 = r15
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20120qe.LIZIZ(long, X.0qo, X.Ynr, X.0xk, int):void");
    }

    public static final void LIZ(InterfaceC07790Sh modifier, boolean z, EnumC22040tk direction, boolean z2, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        InterfaceC07790Sh LIZ;
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(modifier, "modifier");
        o.LJIIIZ(direction, "direction");
        C35931b3 LJIL = interfaceC24520xk.LJIL(47957398);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJI(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(direction)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (LJIL.LJI(z2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !LJIL.LIZ()) {
            InterfaceC07790Sh LJIIL = C09290Yb.LJIIL(modifier, C20290qv.LIZ, C20290qv.LIZIZ);
            o.LJIIIZ(LJIIL, "<this>");
            LIZ = C07770Sf.LIZ(LJIIL, g1.LIZ, new AnonymousClass248(z, direction, z2));
            C79057V0z.LJ(LIZ, LJIL, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C524323z(modifier, z, direction, z2, i);
    }

    public static final void LIZJ(long j, boolean z, EnumC22040tk direction, boolean z2, InterfaceC07790Sh modifier, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        EnumC20220qo enumC20220qo;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        o.LJIIIZ(direction, "direction");
        o.LJIIIZ(modifier, "modifier");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-616295642);
        if ((i & 14) == 0) {
            if (LJIL.LJIIJ(j)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJI(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(direction)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (LJIL.LJI(z2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i4 = 16384;
            } else {
                i4 = FileUtils.BUFFER_SIZE;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((i2 & 374491) != 74898 || !LJIL.LIZ()) {
            if (!z ? (direction != EnumC22040tk.Ltr || z2) && (direction != EnumC22040tk.Rtl || !z2) : (direction == EnumC22040tk.Ltr && !z2) || (direction == EnumC22040tk.Rtl && z2)) {
                enumC20220qo = EnumC20220qo.TopRight;
            } else {
                enumC20220qo = EnumC20220qo.TopLeft;
            }
            LIZIZ(j, enumC20220qo, C1DJ.LJ(LJIL, 732099485, new AnonymousClass241(i2, j, modifier, direction, interfaceC88471Ynr, z, z2)), LJIL, (i2 & 14) | 384);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AnonymousClass242(i, j, modifier, direction, interfaceC88471Ynr, z, z2);
    }
}
