package X;

/* renamed from: X.05m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C018605m {
    public static final boolean[] LIZ = new boolean[3];

    public static final boolean LIZIZ(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void LIZ(C40061hi c40061hi, C14Z c14z, C018205i c018205i) {
        c018205i.mHorizontalResolution = -1;
        c018205i.mVerticalResolution = -1;
        EnumC018105h enumC018105h = c40061hi.mListDimensionBehaviors[0];
        EnumC018105h enumC018105h2 = EnumC018105h.WRAP_CONTENT;
        if (enumC018105h != enumC018105h2 && c018205i.mListDimensionBehaviors[0] == EnumC018105h.MATCH_PARENT) {
            int i = c018205i.mLeft.LJI;
            int width = c40061hi.getWidth() - c018205i.mRight.LJI;
            C017905f c017905f = c018205i.mLeft;
            c017905f.LJIIIIZZ = c14z.LJIIJ(c017905f);
            C017905f c017905f2 = c018205i.mRight;
            c017905f2.LJIIIIZZ = c14z.LJIIJ(c017905f2);
            c14z.LIZLLL(c018205i.mLeft.LJIIIIZZ, i);
            c14z.LIZLLL(c018205i.mRight.LJIIIIZZ, width);
            c018205i.mHorizontalResolution = 2;
            c018205i.setHorizontalDimension(i, width);
        }
        if (c40061hi.mListDimensionBehaviors[1] != enumC018105h2 && c018205i.mListDimensionBehaviors[1] == EnumC018105h.MATCH_PARENT) {
            int i2 = c018205i.mTop.LJI;
            int height = c40061hi.getHeight() - c018205i.mBottom.LJI;
            C017905f c017905f3 = c018205i.mTop;
            c017905f3.LJIIIIZZ = c14z.LJIIJ(c017905f3);
            C017905f c017905f4 = c018205i.mBottom;
            c017905f4.LJIIIIZZ = c14z.LJIIJ(c017905f4);
            c14z.LIZLLL(c018205i.mTop.LJIIIIZZ, i2);
            c14z.LIZLLL(c018205i.mBottom.LJIIIIZZ, height);
            if (c018205i.mBaselineDistance > 0 || c018205i.mVisibility == 8) {
                C017905f c017905f5 = c018205i.mBaseline;
                c017905f5.LJIIIIZZ = c14z.LJIIJ(c017905f5);
                c14z.LIZLLL(c018205i.mBaseline.LJIIIIZZ, c018205i.mBaselineDistance + i2);
            }
            c018205i.mVerticalResolution = 2;
            c018205i.setVerticalDimension(i2, height);
        }
    }
}
