package X;

/* loaded from: classes10.dex */
public final class LEY implements InterfaceC206908Ac {
    public static final LEY LJLIL = new LEY();
    public static final int LJLILLLLZI = C7MY.LIZIZ(32);
    public static final int LJLJI = C7MY.LIZIZ(16);
    public static final int LJLJJI = 2;
    public static int LJLJJL;
    public static int LJLJJLL;

    @Override // X.InterfaceC206908Ac
    public final boolean LJIL() {
        if (C35686DzW.LIZ("ITabletExplore.isExploreABOn") || ((Number) C52873Kp3.LIZ.getValue()).intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC206908Ac
    public final int LJIJ(int i) {
        if (C35686DzW.LIZ("ITabletExplore.enableExplore")) {
            return i;
        }
        return ((Number) C52873Kp3.LIZ.getValue()).intValue();
    }

    @Override // X.InterfaceC206908Ac
    public final int LJJIIJ(int i) {
        if (C35686DzW.LIZ("ITabletExplore.getSpanCount")) {
            return i;
        }
        if (C53946LFe.LIZJ(null, null).LJFF) {
            return 4;
        }
        return 3;
    }

    @Override // X.InterfaceC206908Ac
    public final int LJJIIZ(int i) {
        if (C35686DzW.LIZ("ITabletExplore.calculateItemSpace")) {
            return i;
        }
        return LJLJI;
    }

    @Override // X.InterfaceC206908Ac
    public final int LJJIJIL(int i) {
        if (C35686DzW.LIZ("ITabletExplore.calculateListPadding")) {
            return i;
        }
        return LJLILLLLZI - (LJLJI / 2);
    }

    @Override // X.InterfaceC206908Ac
    public final int LJIIIZ(ActivityC45651qj activityC45651qj, int i) {
        int i2;
        int i3;
        if (C35686DzW.LIZ("ITabletExplore.calculateCoverWidth")) {
            return i;
        }
        if (C53946LFe.LIZJ(activityC45651qj, null).LJFF && (i3 = LJLJJLL) > 0) {
            return i3;
        }
        if (!C53946LFe.LIZJ(activityC45651qj, null).LJFF && (i2 = LJLJJL) > 0) {
            return i2;
        }
        int i4 = C53946LFe.LIZJ(activityC45651qj, null).LIZIZ;
        if (LEZ.LIZ.LIZIZ(activityC45651qj, null)) {
            i4 = C47135Ieh.LIZ(60, i4);
        }
        int LJJIIJ = LJJIIJ(LJLJJI);
        int i5 = (i4 - ((LJJIIJ + 3) * LJLJI)) / LJJIIJ;
        if (C53946LFe.LIZJ(activityC45651qj, null).LJFF) {
            LJLJJLL = i5;
        } else {
            LJLJJL = i5;
        }
        return i5;
    }
}
