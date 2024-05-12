package X;

import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.20e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514420e extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, Boolean, Double> {
    public final /* synthetic */ double LJLIL;
    public final /* synthetic */ C514920j LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514420e(double d, C514920j c514920j) {
        super(3);
        this.LJLIL = d;
        this.LJLILLLLZI = c514920j;
    }

    @Override // X.InterfaceC88473Ynt
    public final Double invoke(String str, Boolean bool, Boolean bool2) {
        String targetKey = str;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        o.LJIIIZ(targetKey, "targetKey");
        double d = this.LJLIL;
        if (booleanValue) {
            d = this.LJLILLLLZI.LIZIZ.getDouble(targetKey, d);
        } else if (!booleanValue2) {
            d = super/*X.1mf*/.getDouble(targetKey, d);
        } else {
            String LJIIZILJ = this.LJLILLLLZI.LJIIZILJ(targetKey);
            if (this.LJLILLLLZI.LIZIZ.contains(LJIIZILJ)) {
                d = this.LJLILLLLZI.LIZIZ.getDouble(LJIIZILJ, this.LJLIL);
                if (d != this.LJLIL) {
                    this.LJLILLLLZI.LJIJI(targetKey, Double.valueOf(d), new IDqS443S0100000(this.LJLILLLLZI, 23));
                }
            }
        }
        return Double.valueOf(d);
    }
}
