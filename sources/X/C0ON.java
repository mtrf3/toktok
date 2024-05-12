package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0ON */
/* loaded from: classes.dex */
public final /* synthetic */ class C0ON {
    public static String LIZJ(String str, String str2, String str3, String str4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        LIZ.append(str4);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1gE] */
    public static C39141gE LIZ(int i, int i2, InterfaceC44861pS interfaceC44861pS, java.util.Map alignmentLines, InterfaceC88472Yns placementBlock) {
        o.LJIIIZ(alignmentLines, "alignmentLines");
        o.LJIIIZ(placementBlock, "placementBlock");
        return new InterfaceC273515n(i, i2, interfaceC44861pS, alignmentLines, placementBlock) { // from class: X.1gE
            public final int LIZ;
            public final int LIZIZ;
            public final java.util.Map<AbstractC272415c, Integer> LIZJ;
            public final /* synthetic */ int LIZLLL;
            public final /* synthetic */ InterfaceC44861pS LJ;
            public final /* synthetic */ InterfaceC88472Yns<AbstractC274515x, C76800UCe> LJFF;

            @Override // X.InterfaceC273515n
            public final void LIZJ() {
                AbstractC45981rG abstractC45981rG;
                C39191gJ c39191gJ = AbstractC274515x.LIZ;
                int i3 = this.LIZLLL;
                EnumC23500w6 layoutDirection = this.LJ.getLayoutDirection();
                InterfaceC44861pS interfaceC44861pS2 = this.LJ;
                if (interfaceC44861pS2 instanceof AbstractC45981rG) {
                    abstractC45981rG = (AbstractC45981rG) interfaceC44861pS2;
                } else {
                    abstractC45981rG = null;
                }
                InterfaceC88472Yns<AbstractC274515x, C76800UCe> interfaceC88472Yns = this.LJFF;
                InterfaceC274415w interfaceC274415w = AbstractC274515x.LIZLLL;
                c39191gJ.getClass();
                int i4 = AbstractC274515x.LIZJ;
                EnumC23500w6 enumC23500w6 = AbstractC274515x.LIZIZ;
                AbstractC274515x.LIZJ = i3;
                AbstractC274515x.LIZIZ = layoutDirection;
                boolean LJIIL = C39191gJ.LJIIL(c39191gJ, abstractC45981rG);
                interfaceC88472Yns.invoke(c39191gJ);
                if (abstractC45981rG != null) {
                    abstractC45981rG.LJLJJLL = LJIIL;
                }
                AbstractC274515x.LIZJ = i4;
                AbstractC274515x.LIZIZ = enumC23500w6;
                AbstractC274515x.LIZLLL = interfaceC274415w;
            }

            @Override // X.InterfaceC273515n
            public final java.util.Map<AbstractC272415c, Integer> LJI() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC273515n
            public final int getHeight() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC273515n
            public final int getWidth() {
                return this.LIZ;
            }

            {
                this.LIZLLL = i;
                this.LJ = interfaceC44861pS;
                this.LJFF = placementBlock;
                this.LIZ = i;
                this.LIZIZ = i2;
                this.LIZJ = alignmentLines;
            }
        };
    }
}
