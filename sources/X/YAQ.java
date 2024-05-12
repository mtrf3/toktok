package X;

import android.graphics.Canvas;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAQ extends AbstractC65781Prl implements InterfaceC88471Ynr<Float, InterfaceC65784Pro<? extends C76800UCe>, C76800UCe> {
    public final /* synthetic */ C68322mC<YAR> LJLIL;
    public final /* synthetic */ C56K LJLILLLLZI;
    public final /* synthetic */ C68322mC<YAO> LJLJI;
    public final /* synthetic */ YAT LJLJJI;
    public final /* synthetic */ Canvas LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ float LJLJL;
    public final /* synthetic */ C76732zl LJLJLJ;
    public final /* synthetic */ C68322mC<YAN> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YAQ(float f, float f2, Canvas canvas, YAT yat, C56K c56k, C76732zl c76732zl, C68322mC c68322mC, C68322mC c68322mC2, C68322mC c68322mC3) {
        super(2);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c56k;
        this.LJLJI = c68322mC2;
        this.LJLJJI = yat;
        this.LJLJJL = canvas;
        this.LJLJJLL = f;
        this.LJLJL = f2;
        this.LJLJLJ = c76732zl;
        this.LJLJLLL = c68322mC3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.YAR] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Float f, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        T t;
        float f2;
        T t2;
        float floatValue = f.floatValue();
        InterfaceC65784Pro<? extends C76800UCe> prepareArcPt = interfaceC65784Pro;
        o.LJIIIZ(prepareArcPt, "prepareArcPt");
        YAR yar = this.LJLIL.element;
        float f3 = this.LJLILLLLZI.element;
        yar.getClass();
        float f4 = yar.LIZ;
        float f5 = yar.LIZIZ;
        float f6 = yar.LIZJ;
        float f7 = (f3 / f6) + yar.LIZLLL;
        ?? yar2 = new YAR(f4, f5, f6, f7);
        if (f7 <= floatValue) {
            C56K c56k = this.LJLILLLLZI;
            YAO yao = this.LJLJI.element;
            YAO yao2 = YAO.LINE;
            if (yao == yao2) {
                this.LJLJJI.LIZ(this.LJLJJL, this.LJLIL.element, yar2);
                f2 = this.LJLJJLL;
            } else {
                f2 = this.LJLJL;
            }
            c56k.element = f2;
            C68322mC<YAO> c68322mC = this.LJLJI;
            int ordinal = c68322mC.element.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    t2 = yao2;
                } else {
                    throw new C162476Zf();
                }
            } else {
                t2 = YAO.SPACE;
            }
            c68322mC.element = t2;
            this.LJLIL.element = yar2;
            if (this.LJLJI.element == yao2) {
                C76732zl c76732zl = this.LJLJLJ;
                c76732zl.element--;
            }
        } else {
            YAR yar3 = new YAR(f4, f5, f6, floatValue);
            if (this.LJLJI.element == YAO.LINE) {
                this.LJLJJI.LIZ(this.LJLJJL, this.LJLIL.element, yar3);
            }
            C56K c56k2 = this.LJLILLLLZI;
            float f8 = c56k2.element;
            YAR yar4 = this.LJLIL.element;
            yar4.getClass();
            c56k2.element = f8 - (Math.abs(floatValue - yar4.LIZLLL) * yar4.LIZJ);
            prepareArcPt.invoke();
            C68322mC<YAN> c68322mC2 = this.LJLJLLL;
            YAN yan = c68322mC2.element;
            yan.getClass();
            if (yan == YAN.UL) {
                t = YAN.U;
            } else {
                t = YAN.values()[yan.ordinal() + 1];
            }
            c68322mC2.element = t;
        }
        return C76800UCe.LIZ;
    }
}
