package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ZyP, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91673ZyP {
    /* JADX WARN: Type inference failed for: r1v3, types: [X.a5d, T] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.a5d, T] */
    public static final void LIZ(Boolean bool, C91668ZyK c91668ZyK, Boolean bool2, C91675ZyR c91675ZyR, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C91669ZyL config;
        AbstractC13490fx abstractC13490fx;
        EnumC23500w6 enumC23500w6;
        boolean booleanValue;
        int i8;
        C91668ZyK c91668ZyK2 = c91668ZyK;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        C91675ZyR c91675ZyR2 = c91675ZyR;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(784356501);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(bool3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && LJIL.LJIJJ(c91668ZyK2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(bool4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(c91675ZyR2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(content)) {
                i7 = 16384;
            } else {
                i7 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i7;
        }
        if (((46811 & i3) ^ 9362) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i9 != 0) {
                    bool3 = Boolean.TRUE;
                }
                if ((i2 & 2) != 0) {
                    c91668ZyK2 = C91671ZyN.LIZLLL;
                    i3 &= -113;
                }
                if (i10 != 0) {
                    bool4 = Boolean.FALSE;
                }
                if (i11 != 0) {
                    c91675ZyR2 = null;
                }
            } else {
                LJIL.LIZLLL();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            LJIL.LJJJJJL();
            Boolean bool5 = Boolean.TRUE;
            if (o.LJ(bool3, bool5)) {
                config = C91670ZyM.LIZ;
            } else {
                config = C91670ZyM.LIZIZ;
            }
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = new C92121a5d(0);
            if (c91675ZyR2 != null) {
                config = new C91669ZyL(0L, 0L, 0L, config.LIZLLL, config.LJ, config.LJFF, config.LJI);
                c68322mC.element = new C92121a5d(0, 0, 0, 0, 0);
            }
            o.LJIIIZ(config, "config");
            long j = config.LIZIZ;
            long j2 = config.LIZ;
            long LIZIZ = C11850dJ.LIZIZ(j2, 0.5f);
            long LIZIZ2 = C11850dJ.LIZIZ(config.LIZ, 0.2f);
            long j3 = config.LIZJ;
            long LIZIZ3 = C11850dJ.LIZIZ(j3, 0.75f);
            long LIZIZ4 = C11850dJ.LIZIZ(config.LIZJ, 0.5f);
            long LIZIZ5 = C11850dJ.LIZIZ(config.LIZJ, 0.34f);
            long LIZIZ6 = C11850dJ.LIZIZ(config.LIZJ, 0.2f);
            long LIZIZ7 = C11850dJ.LIZIZ(config.LIZJ, 0.12f);
            long LIZIZ8 = C11850dJ.LIZIZ(config.LIZJ, 0.05f);
            long j4 = config.LJ;
            long j5 = config.LJFF;
            long j6 = config.LJI;
            long j7 = config.LIZLLL;
            long LJFF = C78897Uxp.LJFF(4281756671L);
            long LJFF2 = C78897Uxp.LJFF(4284900973L);
            long j8 = C11850dJ.LIZJ;
            C91672ZyO c91672ZyO = new C91672ZyO(j2, j, j3, LIZIZ3, LIZIZ4, LIZIZ5, LIZIZ6, LIZIZ7, LIZIZ8, LIZIZ, LIZIZ2, j4, j5, j6, j7, C78897Uxp.LJFF(4279638051L), C78897Uxp.LJFF(2148931619L), j8, LJFF, LJFF2, j8, C78897Uxp.LIZLLL(1301650343), C78897Uxp.LIZLLL(637534208), j8, C78897Uxp.LJFF(3948172372L), C78897Uxp.LJFF(4292115200L), C78897Uxp.LJFF(4282287684L));
            if (c91668ZyK2 == null) {
                abstractC13490fx = null;
            } else {
                abstractC13490fx = c91668ZyK2.LIZ;
            }
            LJIL.LJJIIJ(1111564221);
            if (abstractC13490fx == null) {
                abstractC13490fx = AbstractC13490fx.LJLIL;
            }
            C21560sy c21560sy = new C21560sy(abstractC13490fx, C91676ZyS.LJFF(C21350sd.LIZJ(LJIL), LJIL), C91676ZyS.LIZIZ(C21350sd.LIZJ(LJIL), LJIL), 12158);
            LJIL.LJJJJJ(false);
            if (o.LJ(bool4, bool5)) {
                enumC23500w6 = EnumC23500w6.Rtl;
            } else {
                enumC23500w6 = EnumC23500w6.Ltr;
            }
            C91671ZyN.LIZ = o.LJ(bool3, bool5);
            if (bool4 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool4.booleanValue();
            }
            C91671ZyN.LIZIZ = booleanValue;
            C21410sj.LIZ(null, c21560sy, null, C1DJ.LJ(LJIL, -819893752, new C92392aA0(c91672ZyO, enumC23500w6, c68322mC, content, i3)), LJIL, 3072, 5);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92393aA1(bool3, c91668ZyK2, bool4, c91675ZyR2, content, i, i2);
    }
}
