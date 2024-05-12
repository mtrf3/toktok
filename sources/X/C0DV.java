package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0DV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DV {
    public final C29321Dc LIZ;
    public C0DK LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final C46111rT LJIIJ;
    public C46081rQ LJIIJJI;

    public final AbstractC538029g LIZJ() {
        return this.LIZ.LLI.LIZJ;
    }

    public C0DV(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LIZ = layoutNode;
        this.LIZIZ = C0DK.Idle;
        this.LJIIJ = new C46111rT(this);
    }

    public static boolean LIZLLL(C29321Dc c29321Dc) {
        Object obj;
        C39061g6 c39061g6 = c29321Dc.LJLLLLLL;
        if (c39061g6 != null) {
            obj = c39061g6.LIZJ;
        } else {
            obj = null;
        }
        return o.LJ(obj, c29321Dc);
    }

    public final void LJ(int i) {
        boolean z;
        C29321Dc LJIJJLI;
        C0DV c0dv;
        int i2 = this.LJIIIZ;
        this.LJIIIZ = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2 && (LJIJJLI = this.LIZ.LJIJJLI()) != null && (c0dv = LJIJJLI.LLIFFJFJJ) != null) {
            if (i == 0) {
                c0dv.LJ(c0dv.LJIIIZ - 1);
            } else {
                c0dv.LJ(c0dv.LJIIIZ + 1);
            }
        }
    }

    public static final void LIZ(C0DV c0dv, long j) {
        c0dv.LIZIZ = C0DK.LookaheadMeasuring;
        c0dv.LJFF = false;
        C03750Ct snapshotObserver = C1DF.LJJIJIIJI(c0dv.LIZ).getSnapshotObserver();
        C29321Dc node = c0dv.LIZ;
        C45941rC c45941rC = new C45941rC(c0dv, j);
        snapshotObserver.getClass();
        o.LJIIIZ(node, "node");
        if (node.LJLLLLLL != null) {
            snapshotObserver.LIZ(node, snapshotObserver.LIZIZ, c45941rC);
        } else {
            snapshotObserver.LIZ(node, snapshotObserver.LIZJ, c45941rC);
        }
        c0dv.LJI = true;
        c0dv.LJII = true;
        if (LIZLLL(c0dv.LIZ)) {
            c0dv.LIZLLL = true;
            c0dv.LJ = true;
        } else {
            c0dv.LIZJ = true;
        }
        c0dv.LIZIZ = C0DK.Idle;
    }

    public static final void LIZIZ(C0DV c0dv, long j) {
        C0DK c0dk = c0dv.LIZIZ;
        C0DK c0dk2 = C0DK.Idle;
        if (c0dk == c0dk2) {
            C0DK c0dk3 = C0DK.Measuring;
            c0dv.LIZIZ = c0dk3;
            c0dv.LIZJ = false;
            C03750Ct snapshotObserver = C1DF.LJJIJIIJI(c0dv.LIZ).getSnapshotObserver();
            C29321Dc node = c0dv.LIZ;
            C45961rE c45961rE = new C45961rE(c0dv, j);
            snapshotObserver.getClass();
            o.LJIIIZ(node, "node");
            snapshotObserver.LIZ(node, snapshotObserver.LIZJ, c45961rE);
            if (c0dv.LIZIZ == c0dk3) {
                c0dv.LIZLLL = true;
                c0dv.LJ = true;
                c0dv.LIZIZ = c0dk2;
                return;
            }
            return;
        }
        "layout state is not idle before measure starts".toString();
        throw new IllegalStateException("layout state is not idle before measure starts");
    }
}
