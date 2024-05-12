package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fun, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40489Fun implements InterfaceC60283NlH, InterfaceC60269Nl3 {
    @Override // X.InterfaceC60266Nl0
    public final List<InterfaceC38217EzF> LIZIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return new ArrayList();
    }

    @Override // X.InterfaceC60269Nl3
    public final InterfaceC60257Nkr LIZLLL(F3T providerFactory) {
        C59451NUx c59451NUx;
        o.LJIIIZ(providerFactory, "providerFactory");
        Object LIZJ = providerFactory.LIZJ(InterfaceC60179Njb.class);
        if (!(LIZJ instanceof C59451NUx) || (c59451NUx = (C59451NUx) LIZJ) == null) {
            return null;
        }
        return new C59657NbB(this, providerFactory, c59451NUx);
    }

    @Override // X.InterfaceC60266Nl0
    public final void LJFF(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
    }

    @Override // X.InterfaceC60266Nl0
    public final C61878OQg LJI(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return C61878OQg.INSTANCE;
    }
}
