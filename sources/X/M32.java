package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import fjb.a;
import kotlin.jvm.internal.AqS113S0300000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM$calculatePaddingAndMoveMap$2", f = "DiscoveryLandingMapVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M32 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DiscoverMapResponse LJLIL;
    public final /* synthetic */ DiscoveryLandingMapVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M32(DiscoverMapResponse discoverMapResponse, DiscoveryLandingMapVM discoveryLandingMapVM, InterfaceC67352kd<? super M32> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = discoverMapResponse;
        this.LJLILLLLZI = discoveryLandingMapVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new M32(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        M3B LJIIJJI;
        C141335gf.LIZJ(obj);
        MapBounds mapWindow = this.LJLIL.getMapWindow();
        if (mapWindow != null && (LJIIJJI = C78948Uye.LJIIJJI(mapWindow)) != null) {
            int i = M3K.LIZIZ;
            M3J m3j = M3K.LIZ;
            int i2 = (i - m3j.LJLIL) - m3j.LJLJI;
            int i3 = (M3K.LIZJ - m3j.LJLILLLLZI) - m3j.LJLJJI;
            double abs = Math.abs(LJIIJJI.getMaxLng() - LJIIJJI.getMinLng());
            double abs2 = Math.abs(LJIIJJI.getMaxLat() - LJIIJJI.getMinLat());
            M3J m3j2 = M3K.LIZ;
            double d = i2;
            double d2 = (m3j2.LJLIL * abs) / d;
            double d3 = i3;
            MapBounds mapBounds = new MapBounds(String.valueOf(LJIIJJI.getMaxLng() + ((m3j2.LJLJI * abs) / d)), String.valueOf(LJIIJJI.getMaxLat() + ((m3j2.LJLILLLLZI * abs2) / d3)), String.valueOf(LJIIJJI.getMinLng() - d2), String.valueOf(LJIIJJI.getMinLat() - ((m3j2.LJLJJI * abs2) / d3)));
            DiscoveryLandingMapVM discoveryLandingMapVM = this.LJLILLLLZI;
            DiscoverMapResponse discoverMapResponse = this.LJLIL;
            if (discoveryLandingMapVM.LJLLJ) {
                return C76800UCe.LIZ;
            }
            C56165M2n.LIZIZ(new C56167M2p("KEY_MOVE_MAP", null, C47261Igj.LJJIJ("KEY_INIT_MAP"), false, new AqS113S0300000_9(discoveryLandingMapVM, discoverMapResponse, mapBounds, 12), 16));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
