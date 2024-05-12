package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06670Nz {
    public static final C1JR LIZ = C0QD.LIZ(C48081ue.LJLIL, C48091uf.LJLIL);
    public static final ParcelableSnapshotMutableState LIZIZ = C78966Uyw.LJJJIL(Float.valueOf(1.0f));
    public static final C41391jr<Float> LIZJ = C1JI.LJJIJIIJI(0.0f, 400.0f, null, 5);
    public static final C41391jr<C23450w1> LIZLLL = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1);
    public static final C41391jr<C23490w5> LJ = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23490w5(C07180Py.LIZIZ()), 1);

    public static C1I9 LIZIZ() {
        C41391jr LJJIJIIJI = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23490w5(C07180Py.LIZIZ()), 1);
        InterfaceC07760Se.LJJJ.getClass();
        return LIZ(LJJIJIIJI, C07730Sb.LJIIIZ, C47791uB.LJLIL, true);
    }

    public static C1IB LJII() {
        C41391jr LJJIJIIJI = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23490w5(C07180Py.LIZIZ()), 1);
        InterfaceC07760Se.LJJJ.getClass();
        return LJI(LJJIJIIJI, C07730Sb.LJIIIZ, C47891uL.LJLIL, true);
    }

    public static C1IB LJIIIIZZ() {
        C41391jr LJJIJIIJI = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23490w5(C07180Py.LIZIZ()), 1);
        InterfaceC07760Se.LJJJ.getClass();
        C31621Ly shrinkTowards = C07730Sb.LJIIL;
        C47901uM targetHeight = C47901uM.LJLIL;
        o.LJIIIZ(shrinkTowards, "shrinkTowards");
        o.LJIIIZ(targetHeight, "targetHeight");
        return LJI(LJJIJIIJI, LJIILLIIL(shrinkTowards), new IDqS416S0100000(targetHeight, 108), true);
    }

    public static final C31631Lz LJIILL(InterfaceC07740Sc interfaceC07740Sc) {
        InterfaceC07760Se.LJJJ.getClass();
        if (o.LJ(interfaceC07740Sc, C07730Sb.LJIILIIL)) {
            return C07730Sb.LJ;
        }
        if (o.LJ(interfaceC07740Sc, C07730Sb.LJIILL)) {
            return C07730Sb.LJI;
        }
        return C07730Sb.LJFF;
    }

    public static final C31631Lz LJIILLIIL(InterfaceC07750Sd interfaceC07750Sd) {
        InterfaceC07760Se.LJJJ.getClass();
        if (o.LJ(interfaceC07750Sd, C07730Sb.LJIIJ)) {
            return C07730Sb.LIZJ;
        }
        if (o.LJ(interfaceC07750Sd, C07730Sb.LJIIL)) {
            return C07730Sb.LJIIIIZZ;
        }
        return C07730Sb.LJFF;
    }

    public static C1I9 LIZJ(C41391jr animationSpec, int i) {
        C31621Ly expandFrom;
        boolean z = true;
        if ((i & 1) != 0) {
            animationSpec = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23490w5(C07180Py.LIZIZ()), 1);
        }
        C47801uC initialHeight = null;
        if ((i & 2) != 0) {
            InterfaceC07760Se.LJJJ.getClass();
            expandFrom = C07730Sb.LJIIL;
        } else {
            expandFrom = null;
        }
        if ((i & 4) == 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            initialHeight = C47801uC.LJLIL;
        }
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(expandFrom, "expandFrom");
        o.LJIIIZ(initialHeight, "initialHeight");
        return LIZ(animationSpec, LJIILLIIL(expandFrom), new IDqS416S0100000(initialHeight, 104), z);
    }

    public static C1I9 LIZLLL(C1J4 animationSpec, int i) {
        if ((i & 1) != 0) {
            animationSpec = C1JI.LJJIJIIJI(0.0f, 400.0f, null, 5);
        }
        o.LJIIIZ(animationSpec, "animationSpec");
        return new C1I9(new C06560No(new C1ID(0.0f, animationSpec), null, null, null, 14));
    }

    public static C1IB LJ(C48361v6 c48361v6, int i) {
        C1J4 animationSpec = c48361v6;
        if ((i & 1) != 0) {
            animationSpec = C1JI.LJJIJIIJI(0.0f, 400.0f, null, 5);
        }
        o.LJIIIZ(animationSpec, "animationSpec");
        return new C1IB(new C06560No(new C1ID(0.0f, animationSpec), null, null, null, 14));
    }

    public static final C1I9 LJIIIZ(C1J4 animationSpec, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(animationSpec, "animationSpec");
        return new C1I9(new C06560No(null, new C1I3(animationSpec, interfaceC88472Yns), null, null, 13));
    }

    public static final C1I9 LJIIJ(C1J4 animationSpec, InterfaceC88472Yns initialOffsetY) {
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(initialOffsetY, "initialOffsetY");
        return LJIIIZ(animationSpec, new IDqS416S0100000(initialOffsetY, 111));
    }

    public static final C1IB LJIIL(C1J4 animationSpec, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(animationSpec, "animationSpec");
        return new C1IB(new C06560No(null, new C1I3(animationSpec, interfaceC88472Yns), null, null, 13));
    }

    public static final C1IB LJIILIIL(C1J4 animationSpec, InterfaceC88472Yns targetOffsetY) {
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(targetOffsetY, "targetOffsetY");
        return LJIIL(animationSpec, new IDqS416S0100000(targetOffsetY, 113));
    }

    public static C1I9 LJFF(C48361v6 c48361v6, float f, int i) {
        long j;
        C1J4 animationSpec = c48361v6;
        if ((i & 1) != 0) {
            animationSpec = C1JI.LJJIJIIJI(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = C12000dY.LIZIZ;
        } else {
            j = 0;
        }
        o.LJIIIZ(animationSpec, "animationSpec");
        return new C1I9(new C06560No(null, null, null, new C0O4(f, j, animationSpec), 7));
    }

    public static final C1I9 LIZ(C1J4 animationSpec, InterfaceC07760Se expandFrom, InterfaceC88472Yns initialSize, boolean z) {
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(expandFrom, "expandFrom");
        o.LJIIIZ(initialSize, "initialSize");
        return new C1I9(new C06560No(null, null, new C1I8(animationSpec, expandFrom, initialSize, z), null, 11));
    }

    public static final C1IB LJI(C1J4 animationSpec, InterfaceC07760Se shrinkTowards, InterfaceC88472Yns targetSize, boolean z) {
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(shrinkTowards, "shrinkTowards");
        o.LJIIIZ(targetSize, "targetSize");
        return new C1IB(new C06560No(null, null, new C1I8(animationSpec, shrinkTowards, targetSize, z), null, 11));
    }
}
