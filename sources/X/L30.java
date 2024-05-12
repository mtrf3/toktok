package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class L30 implements InterfaceC54556Lb6 {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final EnumC53624L2u LIZJ;
    public final Integer LIZLLL;
    public final Float LJ;
    public final Integer LJFF;

    public L30() {
        EnumC53624L2u discountPriceStyle = EnumC53624L2u.NONE;
        o.LJIIIZ(discountPriceStyle, "discountPriceStyle");
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = discountPriceStyle;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.InterfaceC54556Lb6
    public Integer LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC54556Lb6
    public Integer LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC54556Lb6
    public Float LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC54556Lb6
    public Integer LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC54556Lb6
    public EnumC53624L2u LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC54556Lb6
    public Integer LJFF() {
        return this.LIZIZ;
    }
}
