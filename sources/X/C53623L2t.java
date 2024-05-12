package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.L2t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53623L2t extends C53622L2s {
    public final EnumC53627L2x LJJJJJL;
    public final int LJJJJL;
    public final EnumC53624L2u LJJJJLI;
    public final int LJJJJLL;
    public final float LJJJJZ;
    public final int LJJJJZI;
    public final int LJJJLIIL;
    public final int LJJJLL;

    public C53623L2t() {
        EnumC53627L2x priceLayoutShowStyle = EnumC53627L2x.V3;
        EnumC53624L2u discountPriceStyle = EnumC53624L2u.TRANSPARENT_BG_WITH_BRACKETS;
        o.LJIIIZ(priceLayoutShowStyle, "priceLayoutShowStyle");
        o.LJIIIZ(discountPriceStyle, "discountPriceStyle");
        this.LJJJJJL = priceLayoutShowStyle;
        this.LJJJJL = R.attr.eb;
        this.LJJJJLI = discountPriceStyle;
        this.LJJJJLL = R.attr.h0;
        this.LJJJJZ = 0.0f;
        this.LJJJJZI = 0;
        this.LJJJLIIL = R.attr.eb;
        this.LJJJLL = 81;
    }

    @Override // X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final Integer LIZ() {
        return Integer.valueOf(this.LJJJLIIL);
    }

    @Override // X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LJJJJLL);
    }

    @Override // X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final Float LIZJ() {
        return Float.valueOf(this.LJJJJZ);
    }

    @Override // X.C53622L2s, X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final Integer LJFF() {
        return Integer.valueOf(this.LJJJLL);
    }

    @Override // X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final Integer LJIJJ() {
        return Integer.valueOf(this.LJJJJZI);
    }

    @Override // X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final EnumC53624L2u LJ() {
        return this.LJJJJLI;
    }

    @Override // X.C53622L2s, X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final EnumC53627L2x LJIIIZ() {
        return this.LJJJJJL;
    }

    @Override // X.C53621L2r, X.C53618L2o, X.InterfaceC71480S3o
    public final int LJIJI() {
        return this.LJJJJL;
    }
}
