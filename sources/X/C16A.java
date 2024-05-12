package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.16A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16A {
    public final ArrayList<C018205i> LIZ = new ArrayList<>();
    public final AnonymousClass168 LIZIZ = new AnonymousClass168();
    public final C40061hi LIZJ;

    public C16A(C40061hi c40061hi) {
        this.LIZJ = c40061hi;
    }

    public final void LIZJ(C40061hi c40061hi) {
        this.LIZ.clear();
        int size = c40061hi.LIZ.size();
        for (int i = 0; i < size; i++) {
            C018205i c018205i = (C018205i) ListProtector.get(c40061hi.LIZ, i);
            EnumC018105h horizontalDimensionBehaviour = c018205i.getHorizontalDimensionBehaviour();
            EnumC018105h enumC018105h = EnumC018105h.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == enumC018105h || c018205i.getVerticalDimensionBehaviour() == enumC018105h) {
                this.LIZ.add(c018205i);
            }
        }
        c40061hi.LIZJ.LIZIZ = true;
    }

    public final boolean LIZ(AnonymousClass169 anonymousClass169, C018205i c018205i, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.LIZIZ.LIZ = c018205i.getHorizontalDimensionBehaviour();
        this.LIZIZ.LIZIZ = c018205i.getVerticalDimensionBehaviour();
        this.LIZIZ.LIZJ = c018205i.getWidth();
        this.LIZIZ.LIZLLL = c018205i.getHeight();
        AnonymousClass168 anonymousClass168 = this.LIZIZ;
        anonymousClass168.LJIIIIZZ = false;
        anonymousClass168.LJIIIZ = i;
        EnumC018105h enumC018105h = anonymousClass168.LIZ;
        EnumC018105h enumC018105h2 = EnumC018105h.MATCH_CONSTRAINT;
        if (enumC018105h == enumC018105h2) {
            z = true;
        } else {
            z = false;
        }
        if (anonymousClass168.LIZIZ == enumC018105h2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c018205i.mDimensionRatio > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c018205i.mDimensionRatio > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && c018205i.mResolvedMatchConstraintDefault[0] == 4) {
            anonymousClass168.LIZ = EnumC018105h.FIXED;
        }
        if (z4 && c018205i.mResolvedMatchConstraintDefault[1] == 4) {
            anonymousClass168.LIZIZ = EnumC018105h.FIXED;
        }
        ((C1AG) anonymousClass169).LIZIZ(c018205i, anonymousClass168);
        c018205i.setWidth(this.LIZIZ.LJ);
        c018205i.setHeight(this.LIZIZ.LJFF);
        AnonymousClass168 anonymousClass1682 = this.LIZIZ;
        c018205i.hasBaseline = anonymousClass1682.LJII;
        c018205i.setBaselineDistance(anonymousClass1682.LJI);
        AnonymousClass168 anonymousClass1683 = this.LIZIZ;
        anonymousClass1683.LJIIIZ = 0;
        return anonymousClass1683.LJIIIIZZ;
    }

    public final void LIZIZ(C40061hi c40061hi, int i, int i2) {
        int i3 = c40061hi.mMinWidth;
        int i4 = c40061hi.mMinHeight;
        c40061hi.setMinWidth(0);
        c40061hi.setMinHeight(0);
        c40061hi.setWidth(i);
        c40061hi.setHeight(i2);
        c40061hi.setMinWidth(i3);
        c40061hi.setMinHeight(i4);
        this.LIZJ.LIZLLL();
    }
}
