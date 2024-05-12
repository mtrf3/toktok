package X;

import kotlin.jvm.internal.o;

/* renamed from: X.15x */
/* loaded from: classes.dex */
public abstract class AbstractC274515x {
    public static final C39191gJ LIZ = new C39191gJ(0);
    public static EnumC23500w6 LIZIZ = EnumC23500w6.Ltr;
    public static int LIZJ;
    public static InterfaceC274415w LIZLLL;

    public abstract EnumC23500w6 LIZ();

    public abstract int LIZIZ();

    public static void LJ(AbstractC39201gK place, long j, float f) {
        o.LJIIIZ(place, "$this$place");
        long LJJZ = place.LJJZ();
        place.LJL(C78939UyV.LIZ(((int) (j >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(j)), f, null);
    }

    public static /* synthetic */ void LJFF(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, long j) {
        abstractC274515x.getClass();
        LJ(abstractC39201gK, j, 0.0f);
    }

    public static void LJIIIIZZ(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, long j) {
        C536828u layerBlock = C274615y.LIZ;
        abstractC274515x.getClass();
        o.LJIIIZ(layerBlock, "layerBlock");
        if (abstractC274515x.LIZ() == EnumC23500w6.Ltr || abstractC274515x.LIZIZ() == 0) {
            long LJJZ = abstractC39201gK.LJJZ();
            abstractC39201gK.LJL(C78939UyV.LIZ(((int) (j >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(j)), 0.0f, layerBlock);
            return;
        }
        long LIZ2 = C78939UyV.LIZ((abstractC274515x.LIZIZ() - abstractC39201gK.LJLIL) - ((int) (j >> 32)), C23450w1.LIZJ(j));
        long LJJZ2 = abstractC39201gK.LJJZ();
        abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ2 >> 32)) + ((int) (LJJZ2 >> 32)), C23450w1.LIZJ(LJJZ2) + C23450w1.LIZJ(LIZ2)), 0.0f, layerBlock);
    }

    public static /* synthetic */ void LJIIJJI(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, long j) {
        C536828u c536828u = C274615y.LIZ;
        abstractC274515x.getClass();
        LJIIJ(abstractC39201gK, j, 0.0f, c536828u);
    }

    public static void LIZJ(AbstractC39201gK abstractC39201gK, int i, int i2, float f) {
        o.LJIIIZ(abstractC39201gK, "<this>");
        long LIZ2 = C78939UyV.LIZ(i, i2);
        long LJJZ = abstractC39201gK.LJJZ();
        abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ2 >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(LIZ2)), f, null);
    }

    public static /* synthetic */ void LIZLLL(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, int i, int i2) {
        abstractC274515x.getClass();
        LIZJ(abstractC39201gK, i, i2, 0.0f);
    }

    public static void LJI(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, int i, int i2) {
        abstractC274515x.getClass();
        o.LJIIIZ(abstractC39201gK, "<this>");
        long LIZ2 = C78939UyV.LIZ(i, i2);
        if (abstractC274515x.LIZ() == EnumC23500w6.Ltr || abstractC274515x.LIZIZ() == 0) {
            long LJJZ = abstractC39201gK.LJJZ();
            abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ2 >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(LIZ2)), 0.0f, null);
            return;
        }
        long LIZ3 = C78939UyV.LIZ((abstractC274515x.LIZIZ() - abstractC39201gK.LJLIL) - ((int) (LIZ2 >> 32)), C23450w1.LIZJ(LIZ2));
        long LJJZ2 = abstractC39201gK.LJJZ();
        abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ3 >> 32)) + ((int) (LJJZ2 >> 32)), C23450w1.LIZJ(LJJZ2) + C23450w1.LIZJ(LIZ3)), 0.0f, null);
    }

    public static void LJII(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, int i, int i2) {
        C536828u layerBlock = C274615y.LIZ;
        abstractC274515x.getClass();
        o.LJIIIZ(abstractC39201gK, "<this>");
        o.LJIIIZ(layerBlock, "layerBlock");
        long LIZ2 = C78939UyV.LIZ(i, i2);
        if (abstractC274515x.LIZ() == EnumC23500w6.Ltr || abstractC274515x.LIZIZ() == 0) {
            long LJJZ = abstractC39201gK.LJJZ();
            abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ2 >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(LIZ2)), 0.0f, layerBlock);
            return;
        }
        long LIZ3 = C78939UyV.LIZ((abstractC274515x.LIZIZ() - abstractC39201gK.LJLIL) - ((int) (LIZ2 >> 32)), C23450w1.LIZJ(LIZ2));
        long LJJZ2 = abstractC39201gK.LJJZ();
        abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ3 >> 32)) + ((int) (LJJZ2 >> 32)), C23450w1.LIZJ(LJJZ2) + C23450w1.LIZJ(LIZ3)), 0.0f, layerBlock);
    }

    public static void LJIIJ(AbstractC39201gK placeWithLayer, long j, float f, InterfaceC88472Yns layerBlock) {
        o.LJIIIZ(placeWithLayer, "$this$placeWithLayer");
        o.LJIIIZ(layerBlock, "layerBlock");
        long LJJZ = placeWithLayer.LJJZ();
        placeWithLayer.LJL(C78939UyV.LIZ(((int) (j >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(j)), f, layerBlock);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIZ(AbstractC274515x abstractC274515x, AbstractC39201gK abstractC39201gK, int i, int i2, InterfaceC88472Yns layerBlock, int i3) {
        if ((i3 & 8) != 0) {
            layerBlock = C274615y.LIZ;
        }
        abstractC274515x.getClass();
        o.LJIIIZ(abstractC39201gK, "<this>");
        o.LJIIIZ(layerBlock, "layerBlock");
        long LIZ2 = C78939UyV.LIZ(i, i2);
        long LJJZ = abstractC39201gK.LJJZ();
        abstractC39201gK.LJL(C78939UyV.LIZ(((int) (LIZ2 >> 32)) + ((int) (LJJZ >> 32)), C23450w1.LIZJ(LJJZ) + C23450w1.LIZJ(LIZ2)), 0.0f, layerBlock);
    }
}
