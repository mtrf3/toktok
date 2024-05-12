package X;

import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1wJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49111wJ extends AbstractC65781Prl implements InterfaceC88472Yns<C1OL, C0XB> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC11790dD LJLILLLLZI;
    public final /* synthetic */ C03770Cv<C0SL> LJLJI;
    public final /* synthetic */ AbstractC11740d8 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49111wJ(float f, InterfaceC11790dD interfaceC11790dD, C03770Cv<C0SL> c03770Cv, AbstractC11740d8 abstractC11740d8) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC11790dD;
        this.LJLJI = c03770Cv;
        this.LJLJJI = abstractC11740d8;
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [T, X.0SL] */
    @Override // X.InterfaceC88472Yns
    public final C0XB invoke(C1OL c1ol) {
        float ceil;
        QZV c43041mW;
        C1OL drawWithCache = c1ol;
        o.LJIIIZ(drawWithCache, "$this$drawWithCache");
        boolean z = true;
        if (drawWithCache.LJJJJIZL(this.LJLIL) >= 0.0f && C10430b1.LIZJ(drawWithCache.LIZIZ()) > 0.0f) {
            if (C23390vv.LIZJ(this.LJLIL, 0.0f)) {
                ceil = 1.0f;
            } else {
                ceil = (float) Math.ceil(drawWithCache.LJJJJIZL(this.LJLIL));
            }
            float f = 2;
            float min = Math.min(ceil, (float) Math.ceil(C10430b1.LIZJ(drawWithCache.LIZIZ()) / f));
            float f2 = min / f;
            long LIZ = C78923UyF.LIZ(f2, f2);
            long LIZIZ = C1DF.LIZIZ(C10430b1.LIZLLL(drawWithCache.LIZIZ()) - min, C10430b1.LIZIZ(drawWithCache.LIZIZ()) - min);
            if (f * min <= C10430b1.LIZJ(drawWithCache.LIZIZ())) {
                z = false;
            }
            AbstractC11540co LIZ2 = this.LJLILLLLZI.LIZ(drawWithCache.LIZIZ(), drawWithCache.LJLIL.getLayoutDirection(), drawWithCache);
            if (LIZ2 instanceof C1QS) {
                AbstractC11740d8 abstractC11740d8 = this.LJLJJI;
                C1QS c1qs = (C1QS) LIZ2;
                if (z) {
                    return drawWithCache.LIZLLL(new IDqS172S0200000(c1qs, abstractC11740d8, 33));
                }
                if (abstractC11740d8 instanceof C32691Qb) {
                    C11860dK.LIZIZ(((C32691Qb) abstractC11740d8).LIZIZ);
                }
                c1qs.getClass();
                throw null;
            }
            if (LIZ2 instanceof C1QU) {
                C03770Cv<C0SL> c03770Cv = this.LJLJI;
                AbstractC11740d8 abstractC11740d82 = this.LJLJJI;
                C1QU c1qu = (C1QU) LIZ2;
                if (C78926UyI.LJJIJIIJI(c1qu.LIZ)) {
                    return drawWithCache.LIZLLL(new C49221wU(z, abstractC11740d82, c1qu.LIZ.LJ, f2, min, LIZ, LIZIZ, new C43041mW(min, 0.0f, 0, 0, 30)));
                }
                C0SL c0sl = c03770Cv.LIZ;
                C0SL c0sl2 = c0sl;
                if (c0sl == null) {
                    ?? c0sl3 = new C0SL(0);
                    c03770Cv.LIZ = c0sl3;
                    c0sl2 = c0sl3;
                }
                InterfaceC11610cv interfaceC11610cv = c0sl2.LIZLLL;
                if (interfaceC11610cv == null) {
                    interfaceC11610cv = C1JI.LIZ();
                    c0sl2.LIZLLL = interfaceC11610cv;
                }
                C10410az c10410az = c1qu.LIZ;
                interfaceC11610cv.reset();
                interfaceC11610cv.LJ(c10410az);
                if (!z) {
                    C1QX LIZ3 = C1JI.LIZ();
                    LIZ3.LJ(new C10410az(min, min, (c10410az.LIZJ - c10410az.LIZ) - min, (c10410az.LIZLLL - c10410az.LIZIZ) - min, C78999UzT.LJJI(min, c10410az.LJ), C78999UzT.LJJI(min, c10410az.LJFF), C78999UzT.LJJI(min, c10410az.LJI), C78999UzT.LJJI(min, c10410az.LJII)));
                    interfaceC11610cv.LJIIIZ(interfaceC11610cv, LIZ3, 0);
                }
                return drawWithCache.LIZLLL(new IDqS172S0200000(interfaceC11610cv, abstractC11740d82, 35));
            }
            if (LIZ2 instanceof C1QT) {
                AbstractC11740d8 abstractC11740d83 = this.LJLJJI;
                if (z) {
                    LIZ = C10370av.LIZIZ;
                    LIZIZ = drawWithCache.LIZIZ();
                    c43041mW = C43031mV.LIZ;
                } else {
                    c43041mW = new C43041mW(min, 0.0f, 0, 0, 30);
                }
                return drawWithCache.LIZLLL(new C49201wS(abstractC11740d83, LIZ, LIZIZ, c43041mW));
            }
            throw new C162476Zf();
        }
        return drawWithCache.LIZLLL(C49151wN.LJLIL);
    }
}
