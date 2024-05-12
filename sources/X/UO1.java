package X;

import android.os.SystemClock;
import android.text.TextPaint;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UO1 {
    public final C792439c LIZ;
    public final TextPaint LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final InterfaceC88472Yns<? super C77106UNy, C76800UCe> LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final LifecycleOwner LJI;
    public final long LJII;
    public boolean LJIIIIZZ;
    public UO9 LJIIIZ;
    public final int LJIIJ;
    public final List<C77105UNx> LJIIJJI;
    public final List<C77105UNx> LJIIL;
    public XJO LJIILIIL;

    public final void LIZIZ() {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJI), C78613UtF.LIZ, null, new C792539d(this, null), 2);
    }

    public final long LIZJ() {
        C792439c c792439c = this.LIZ;
        if (c792439c.LIZIZ == 0) {
            return 0L;
        }
        return c792439c.LIZIZ + (SystemClock.elapsedRealtime() - c792439c.LIZLLL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002b. Please report as an issue. */
    public final Object LIZ(C77106UNy c77106UNy, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C77105UNx c77105UNx;
        long j;
        UO7 uo7;
        long LIZJ = LIZJ();
        if (((ArrayList) this.LJIIJJI).isEmpty()) {
            c77105UNx = null;
        } else {
            c77105UNx = (C77105UNx) ORZ.LLFF(this.LJIIJJI);
        }
        long j2 = c77106UNy.LJLIL;
        long j3 = c77106UNy.LJLJJI + j2;
        long j4 = 0;
        if (c77105UNx != null) {
            j = c77105UNx.LIZIZ + c77105UNx.LIZLLL;
        } else {
            j = 0;
        }
        if (j3 < j) {
            uo7 = UO7.DELAY;
        } else if (j3 < LIZJ) {
            uo7 = UO7.OVERDUE;
        } else if (j2 > LIZJ) {
            uo7 = UO7.NOT_START;
        } else if (j2 <= j) {
            uo7 = UO7.UNDER_WAY_OTHER_RUNNING;
        } else {
            uo7 = UO7.UNDER_WAY_ARRIVE_LATE;
        }
        switch (UO8.LIZ[uo7.ordinal()]) {
            case 1:
                InterfaceC88472Yns<? super C77106UNy, C76800UCe> interfaceC88472Yns = this.LJ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(c77106UNy);
                }
                return C76800UCe.LIZ;
            case 2:
                if (c77105UNx != null) {
                    long j5 = c77106UNy.LJLIL;
                    long j6 = c77106UNy.LJLJJI;
                    long j7 = j5 + j6;
                    long j8 = c77105UNx.LIZIZ + c77105UNx.LIZLLL;
                    if (j8 >= j5) {
                        j5 = j8;
                    }
                    c77106UNy.LJLIL = j5;
                    long j9 = this.LJII;
                    if (j9 <= j6) {
                        j6 = j9;
                    }
                    long j10 = j7 - j5;
                    if (j6 < j10) {
                        j6 = j10;
                    }
                    c77106UNy.LJLJJI = j6;
                }
                Object LIZLLL = LIZLLL(c77106UNy, c77105UNx, interfaceC67352kd);
                if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZLLL;
                }
                return C76800UCe.LIZ;
            case 3:
                long j11 = this.LJII;
                long j12 = c77106UNy.LJLJJI;
                if (j11 > j12) {
                    j11 = j12;
                }
                long j13 = (c77106UNy.LJLIL + j12) - LIZJ;
                if (j11 < j13) {
                    j11 = j13;
                }
                c77106UNy.LJLJJI = j11;
                c77106UNy.LJLIL = LIZJ;
                Object LIZLLL2 = LIZLLL(c77106UNy, c77105UNx, interfaceC67352kd);
                if (LIZLLL2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZLLL2;
                }
                return C76800UCe.LIZ;
            case 4:
                if (c77105UNx != null) {
                    long j14 = c77105UNx.LIZIZ + c77105UNx.LIZLLL;
                    if (LIZJ < j14) {
                        LIZJ = j14;
                    }
                }
                long j15 = this.LJII;
                long j16 = c77106UNy.LJLJJI;
                if (j15 > j16) {
                    j15 = j16;
                }
                long j17 = (c77106UNy.LJLIL + j16) - LIZJ;
                if (j15 < j17) {
                    j15 = j17;
                }
                c77106UNy.LJLJJI = j15;
                c77106UNy.LJLIL = LIZJ;
                Object LIZLLL3 = LIZLLL(c77106UNy, c77105UNx, interfaceC67352kd);
                if (LIZLLL3 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZLLL3;
                }
                return C76800UCe.LIZ;
            case 5:
                long j18 = c77106UNy.LJLIL;
                if (c77105UNx != null) {
                    long j19 = c77105UNx.LIZIZ + c77105UNx.LIZLLL;
                    if (LIZJ < j19) {
                        LIZJ = j19;
                    }
                }
                c77106UNy.LJLIL = LIZJ;
                long j20 = this.LJII;
                long j21 = c77106UNy.LJLJJI;
                if (j20 > j21) {
                    j20 = j21;
                }
                long j22 = (j21 + j18) - LIZJ;
                if (j20 < j22) {
                    j20 = j22;
                }
                c77106UNy.LJLJJI = j20;
                Object LIZLLL4 = LIZLLL(c77106UNy, c77105UNx, interfaceC67352kd);
                if (LIZLLL4 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZLLL4;
                }
                return C76800UCe.LIZ;
            case 6:
                if (c77105UNx != null) {
                    long j23 = c77105UNx.LIZIZ + c77105UNx.LIZLLL;
                    if (LIZJ < j23) {
                        LIZJ = j23;
                    }
                }
                c77106UNy.LJLIL = LIZJ;
                long j24 = c77106UNy.LJLJJI;
                if (0 < j24) {
                    j4 = j24;
                }
                c77106UNy.LJLJJI = j4;
                Object LIZLLL5 = LIZLLL(c77106UNy, c77105UNx, interfaceC67352kd);
                if (LIZLLL5 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZLLL5;
                }
                return C76800UCe.LIZ;
            default:
                return C76800UCe.LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120 A[LOOP:4: B:77:0x011a->B:79:0x0120, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136 A[LOOP:5: B:82:0x0130->B:84:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014a A[LOOP:6: B:87:0x0144->B:89:0x014a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x02a7 -> B:26:0x0243). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C77106UNy r23, X.C77105UNx r24, X.InterfaceC67352kd<? super X.C76800UCe> r25) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UO1.LIZLLL(X.UNy, X.UNx, X.2kd):java.lang.Object");
    }

    public UO1(C792439c c792439c, TextPaint textPaint, float f, AqS179S0100000_13 aqS179S0100000_13, AqS160S0200000_13 aqS160S0200000_13, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = c792439c;
        this.LIZIZ = textPaint;
        this.LIZJ = 20;
        this.LIZLLL = f;
        this.LJ = aqS179S0100000_13;
        this.LJFF = aqS160S0200000_13;
        this.LJI = lifecycleOwner;
        this.LJII = 1000L;
        this.LJIIJ = 15;
        this.LJIIJJI = new ArrayList();
        this.LJIIL = new ArrayList();
    }
}
