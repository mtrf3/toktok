package X;

import Y.ACallableS91S0200000_14;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQZ extends AbstractC73941T0f<List<? extends C79155V4t>, List<? extends C82268WQm>> implements InterfaceC82276WQu {
    public final InterfaceC82271WQp LIZJ;
    public final InterfaceC82274WQs LIZLLL;
    public final InterfaceC82272WQq LJ;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        List req = (List) obj;
        o.LJIIIZ(req, "req");
        return AbstractC73672Svk.LJJIIJZLJL(new ACallableS91S0200000_14(req, this, 4));
    }

    public WQZ(InterfaceC82271WQp interfaceC82271WQp, C82264WQi c82264WQi, InterfaceC82272WQq interfaceC82272WQq) {
        this.LIZJ = interfaceC82271WQp;
        this.LIZLLL = c82264WQi;
        this.LJ = interfaceC82272WQq;
    }
}
