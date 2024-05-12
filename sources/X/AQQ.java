package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$initCacheState$1", f = "OfflineModeManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AQQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public AQQ(InterfaceC67352kd<? super AQQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AQQ(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C9SN c9sn;
        C141335gf.LIZJ(obj);
        try {
            AQO.LJII(AQY.LIZIZ());
            AQW.LIZ.getClass();
            AQO.LJI(AQW.LJI() / 1024.0d);
            C26222AQw c26222AQw = AQV.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init cache state cacheSize: ");
            LIZ.append(AQO.LIZLLL().getDouble("key_cached_size", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
            c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ));
            if (AQO.LIZIZ() < AQO.LIZ() && AQO.LIZJ() == C9SN.DOWNLOADED) {
                if (!C48203Ivv.LJ(EF7.LIZIZ())) {
                    c9sn = C9SN.PAUSE_NO_NETWORK;
                } else if (AQO.LJ() && !C48203Ivv.LJFF(EF7.LIZIZ())) {
                    c9sn = C9SN.PAUSE_NOT_WIFI;
                } else {
                    c9sn = C9SN.DOWNLOADING;
                }
                AQO.LJIIIIZZ(c9sn);
            } else if (AQO.LIZIZ() >= AQO.LIZ()) {
                AQO.LJIIIIZZ(C9SN.DOWNLOADED);
            }
        } catch (Exception e) {
            C26222AQw c26222AQw2 = AQV.LJLILLLLZI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("OfflineModeManager init failed ");
            LIZ2.append(e);
            c26222AQw2.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new AQQ(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
