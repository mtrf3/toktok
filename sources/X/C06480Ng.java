package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06480Ng {
    public static final C06600Ns LIZJ(AbstractC06580Nq abstractC06580Nq, AbstractC06620Nu exit) {
        o.LJIIIZ(abstractC06580Nq, "<this>");
        o.LJIIIZ(exit, "exit");
        return new C06600Ns(abstractC06580Nq, exit);
    }

    public static final <S> void LIZIZ(S s, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super C1IC<S>, C06600Ns> interfaceC88472Yns, InterfaceC07760Se interfaceC07760Se, InterfaceC88474Ynu<? super InterfaceC06520Nk, ? super S, ? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC07760Se interfaceC07760Se2 = interfaceC07760Se;
        InterfaceC88472Yns<? super C1IC<S>, C06600Ns> interfaceC88472Yns2 = interfaceC88472Yns;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-441539443);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC07760Se2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(content)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        if (((46811 & i3) ^ 9362) != 0 || !LJIL.LIZ()) {
            if (i9 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i10 != 0) {
                interfaceC88472Yns2 = C47831uF.LJLIL;
            }
            if (i11 != 0) {
                InterfaceC07760Se.LJJJ.getClass();
                interfaceC07760Se2 = C07730Sb.LIZIZ;
            }
            LIZ(C78845Uwz.LJFF(s, "AnimatedContent", LJIL, (i3 & 8) | 48 | (i3 & 14)), interfaceC07790Sh2, interfaceC88472Yns2, interfaceC07760Se2, null, content, LJIL, (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 8);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C47841uG(s, interfaceC07790Sh2, interfaceC88472Yns2, interfaceC07760Se2, content, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0279, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r13 == X.C24500xi.LIZIZ) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0184, code lost:
    
        r4.add(r22.LIZLLL());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ee, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0221, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184 A[EDGE_INSN: B:79:0x0184->B:77:0x0184 BREAK  A[LOOP:0: B:69:0x0162->B:73:0x0380], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void LIZ(X.C07160Pw<S> r22, X.InterfaceC07790Sh r23, X.InterfaceC88472Yns<? super X.C1IC<S>, X.C06600Ns> r24, X.InterfaceC07760Se r25, X.InterfaceC88472Yns<? super S, ? extends java.lang.Object> r26, X.InterfaceC88474Ynu<? super X.InterfaceC06520Nk, ? super S, ? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r27, X.InterfaceC24520xk r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06480Ng.LIZ(X.0Pw, X.0Sh, X.Yns, X.0Se, X.Yns, X.Ynu, X.0xk, int, int):void");
    }
}
