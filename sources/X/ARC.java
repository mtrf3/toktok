package X;

import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ARC extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new ARC();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.YELP.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LIZLLL(SmartImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        LJJJJI(imageView, new AqS154S0100000_4(imageView, 1065));
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJIZL(new AqS135S0200000_4(this, eventMapBuilder, 151));
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }
}
