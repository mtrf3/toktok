package X;

import android.graphics.Canvas;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAP extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC88472Yns<? super YAS, ? extends Boolean>, InterfaceC88472Yns<? super YAS, ? extends YAS>, InterfaceC65784Pro<? extends C76800UCe>, C76800UCe> {
    public final /* synthetic */ C68322mC<YAS> LJLIL;
    public final /* synthetic */ C68322mC<YAN> LJLILLLLZI;
    public final /* synthetic */ C56K LJLJI;
    public final /* synthetic */ C68322mC<YAO> LJLJJI;
    public final /* synthetic */ Canvas LJLJJL;
    public final /* synthetic */ YAT LJLJJLL;
    public final /* synthetic */ float LJLJL;
    public final /* synthetic */ float LJLJLJ;
    public final /* synthetic */ C76732zl LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YAP(float f, float f2, Canvas canvas, YAT yat, C56K c56k, C76732zl c76732zl, C68322mC c68322mC, C68322mC c68322mC2, C68322mC c68322mC3) {
        super(3);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c68322mC2;
        this.LJLJI = c56k;
        this.LJLJJI = c68322mC3;
        this.LJLJJL = canvas;
        this.LJLJJLL = yat;
        this.LJLJL = f;
        this.LJLJLJ = f2;
        this.LJLJLLL = c76732zl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, X.YAS] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC88472Yns<? super YAS, ? extends Boolean> interfaceC88472Yns, InterfaceC88472Yns<? super YAS, ? extends YAS> interfaceC88472Yns2, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        ?? r2;
        T t;
        float f;
        T t2;
        InterfaceC88472Yns<? super YAS, ? extends Boolean> withinBounds = interfaceC88472Yns;
        InterfaceC88472Yns<? super YAS, ? extends YAS> exceedBoundUpdate = interfaceC88472Yns2;
        InterfaceC65784Pro<? extends C76800UCe> prepareArcPt = interfaceC65784Pro;
        o.LJIIIZ(withinBounds, "withinBounds");
        o.LJIIIZ(exceedBoundUpdate, "exceedBoundUpdate");
        o.LJIIIZ(prepareArcPt, "prepareArcPt");
        YAS yas = this.LJLIL.element;
        YAN s = this.LJLILLLLZI.element;
        float f2 = this.LJLJI.element;
        yas.getClass();
        o.LJIIIZ(s, "s");
        int ordinal = s.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        r2 = new YAS(yas.LIZ, yas.LIZIZ - f2);
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(s.name());
                        LIZ.append(" is not supported");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                } else {
                    r2 = new YAS(yas.LIZ - f2, yas.LIZIZ);
                }
            } else {
                r2 = new YAS(yas.LIZ, yas.LIZIZ + f2);
            }
        } else {
            r2 = new YAS(yas.LIZ + f2, yas.LIZIZ);
        }
        if (withinBounds.invoke(r2).booleanValue()) {
            C56K c56k = this.LJLJI;
            YAO yao = this.LJLJJI.element;
            YAO yao2 = YAO.LINE;
            if (yao == yao2) {
                Canvas canvas = this.LJLJJL;
                YAS yas2 = this.LJLIL.element;
                canvas.drawLine(yas2.LIZ, yas2.LIZIZ, r2.LIZ, r2.LIZIZ, this.LJLJJLL.LJIIIIZZ);
                f = this.LJLJL;
            } else {
                f = this.LJLJLJ;
            }
            c56k.element = f;
            this.LJLIL.element = r2;
            C68322mC<YAO> c68322mC = this.LJLJJI;
            int ordinal2 = c68322mC.element.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    t2 = yao2;
                } else {
                    throw new C162476Zf();
                }
            } else {
                t2 = YAO.SPACE;
            }
            c68322mC.element = t2;
            if (this.LJLJJI.element == yao2) {
                C76732zl c76732zl = this.LJLJLLL;
                c76732zl.element--;
            }
        } else {
            YAS other = exceedBoundUpdate.invoke(r2);
            if (this.LJLJJI.element == YAO.LINE) {
                Canvas canvas2 = this.LJLJJL;
                YAS yas3 = this.LJLIL.element;
                canvas2.drawLine(yas3.LIZ, yas3.LIZIZ, other.LIZ, other.LIZIZ, this.LJLJJLL.LJIIIIZZ);
            }
            C56K c56k2 = this.LJLJI;
            float f3 = c56k2.element;
            YAS yas4 = this.LJLIL.element;
            yas4.getClass();
            o.LJIIIZ(other, "other");
            c56k2.element = f3 - (Math.abs(other.LIZIZ - yas4.LIZIZ) + Math.abs(other.LIZ - yas4.LIZ));
            C68322mC<YAN> c68322mC2 = this.LJLILLLLZI;
            YAN yan = c68322mC2.element;
            yan.getClass();
            if (yan == YAN.UL) {
                t = YAN.U;
            } else {
                t = YAN.values()[yan.ordinal() + 1];
            }
            c68322mC2.element = t;
            prepareArcPt.invoke();
        }
        return C76800UCe.LIZ;
    }
}
