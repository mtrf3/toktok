package X;

import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.bullet.module.p002default.DefaultLynxKitDelegatesProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FuZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40475FuZ implements InterfaceC60283NlH, InterfaceC60269Nl3, InterfaceC40491Fup {
    @Override // X.InterfaceC60280NlE
    public final InterfaceC60179Njb LIZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C59451NUx(providerFactory, new N5S());
    }

    @Override // X.InterfaceC60266Nl0
    public final List<InterfaceC38217EzF> LIZIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return new ArrayList();
    }

    @Override // X.InterfaceC60261Nkv
    public final List<AbstractC59475NVv> LIZJ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC60269Nl3
    public final InterfaceC60257Nkr LIZLLL(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C59587Na3(providerFactory);
    }

    @Override // X.InterfaceC40491Fup
    public final InterfaceC39446Fdy LJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C39442Fdu();
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

    @Override // X.InterfaceC60269Nl3
    public final InterfaceC60244Nke LJII(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C39439Fdr(providerFactory);
    }

    @Override // X.InterfaceC40491Fup
    public final InterfaceC60304Nlc LJIIIIZZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new DefaultLynxKitDelegatesProvider();
    }

    @Override // X.InterfaceC60266Nl0
    public final List<InterfaceC38186Eyk> createBridges(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return BulletHostProxy.LIZ().createBridges(providerFactory);
    }
}
