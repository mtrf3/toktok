package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.16I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16I {
    public static int LJFF;
    public final int LIZIZ;
    public int LIZJ;
    public final ArrayList<C018205i> LIZ = new ArrayList<>();
    public ArrayList<C16H> LIZLLL = null;
    public int LJ = -1;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        int i = this.LIZJ;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        LIZ.append(str);
        LIZ.append(" [");
        String LIZ2 = C08380Uo.LIZ(LIZ, this.LIZIZ, "] <", LIZ);
        Iterator<C018205i> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C018205i next = it.next();
            StringBuilder LIZJ = b1.LIZJ(LIZ2, " ");
            LIZJ.append(next.mDebugName);
            LIZ2 = X1D.LIZIZ(LIZJ);
        }
        return i0.LJFF(LIZ2, " >");
    }

    public C16I(int i) {
        this.LIZIZ = -1;
        int i2 = LJFF;
        LJFF = i2 + 1;
        this.LIZIZ = i2;
        this.LIZJ = i;
    }

    public final boolean LIZ(C018205i c018205i) {
        if (this.LIZ.contains(c018205i)) {
            return false;
        }
        this.LIZ.add(c018205i);
        return true;
    }

    public final void LIZIZ(ArrayList<C16I> arrayList) {
        int size = this.LIZ.size();
        if (this.LJ != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C16I c16i = (C16I) ListProtector.get(arrayList, i);
                if (this.LJ == c16i.LIZIZ) {
                    LIZLLL(this.LIZJ, c16i);
                }
            }
            return;
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZJ(final C14Z c14z, int i) {
        int LJIILIIL;
        int LJIILIIL2;
        if (this.LIZ.size() == 0) {
            return 0;
        }
        ArrayList<C018205i> arrayList = this.LIZ;
        C40061hi c40061hi = (C40061hi) ((C018205i) ListProtector.get(arrayList, 0)).mParent;
        c14z.LJIJ();
        c40061hi.addToSolver(c14z, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C018205i) ListProtector.get(arrayList, i2)).addToSolver(c14z, false);
        }
        if (i == 0) {
            if (c40061hi.LJIIIIZZ > 0) {
                C017505b.LIZ(c40061hi, c14z, arrayList, 0);
            }
        } else if (i == 1 && c40061hi.LJIIIZ > 0) {
            C017505b.LIZ(c40061hi, c14z, arrayList, 1);
        }
        try {
            c14z.LJIILL();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZLLL = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            final C018205i c018205i = (C018205i) ListProtector.get(arrayList, i3);
            this.LIZLLL.add(new Object(c018205i, c14z) { // from class: X.16H
                {
                    new WeakReference(c018205i);
                    C017905f c017905f = c018205i.mLeft;
                    c14z.getClass();
                    C14Z.LJIILIIL(c017905f);
                    C14Z.LJIILIIL(c018205i.mTop);
                    C14Z.LJIILIIL(c018205i.mRight);
                    C14Z.LJIILIIL(c018205i.mBottom);
                    C14Z.LJIILIIL(c018205i.mBaseline);
                }
            });
        }
        if (i == 0) {
            LJIILIIL = C14Z.LJIILIIL(c40061hi.mLeft);
            LJIILIIL2 = C14Z.LJIILIIL(c40061hi.mRight);
            c14z.LJIJ();
        } else {
            LJIILIIL = C14Z.LJIILIIL(c40061hi.mTop);
            LJIILIIL2 = C14Z.LJIILIIL(c40061hi.mBottom);
            c14z.LJIJ();
        }
        return LJIILIIL2 - LJIILIIL;
    }

    public final void LIZLLL(int i, C16I c16i) {
        Iterator<C018205i> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C018205i next = it.next();
            c16i.LIZ(next);
            if (i == 0) {
                next.horizontalGroup = c16i.LIZIZ;
            } else {
                next.verticalGroup = c16i.LIZIZ;
            }
        }
        this.LJ = c16i.LIZIZ;
    }
}
