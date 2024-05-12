package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNY extends AbstractC65781Prl implements InterfaceC88472Yns<C59259NNn, InterfaceC1039145z<? extends C59257NNl>> {
    public static final NNY LJLIL = new NNY();

    public NNY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC1039145z<? extends C59257NNl> invoke(C59259NNn c59259NNn) {
        C59259NNn it = c59259NNn;
        o.LJIIIZ(it, "it");
        List<C59257NNl> list = it.clickList;
        if (list != null) {
            return ORZ.LJLIIIL(list);
        }
        return OJA.LIZ;
    }
}
