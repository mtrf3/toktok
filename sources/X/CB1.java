package X;

import com.bytedance.android.livesdk.model.message.SubscriptionGuideMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB1 implements CRX {
    @Override // X.CRX
    public final void LIZIZ(C0HK registry, CQQ publicScreenContext) {
        o.LJIIIZ(registry, "registry");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
    }

    @Override // X.CRX
    public final void LIZLLL(CUN cun) {
    }

    @Override // X.CRX
    public final void LIZ(CBL registry) {
        o.LJIIIZ(registry, "registry");
        registry.LIZLLL(SubscriptionGuideMessage.class, new CB7());
    }

    @Override // X.CRX
    public final void LIZJ(CT7 ct7) {
        ct7.LLD(CBD.class, new CB2());
    }

    @Override // X.CRX
    public final void LJ(InterfaceC31378CTe registry) {
        o.LJIIIZ(registry, "registry");
    }

    @Override // X.CRX
    public final void LJFF(CS7 registry) {
        o.LJIIIZ(registry, "registry");
    }

    @Override // X.CRX
    public final void LJI(InterfaceC29574Bj8 registry) {
        o.LJIIIZ(registry, "registry");
        if (registry.LJIILIIL()) {
            return;
        }
        C31319CQx c31319CQx = (C31319CQx) registry;
        c31319CQx.LJLIIIL(EnumC31509CYf.SUBSCRIPTION_GUIDE_MESSAGE.getIntType());
        c31319CQx.LJLIIIL(EnumC31509CYf.UPGRADE_MESSAGE.getIntType());
    }

    @Override // X.CRX
    public final void LJII(C29821Fa registry) {
        o.LJIIIZ(registry, "registry");
        registry.LIZIZ(SubscriptionGuideMessage.class, new CB8());
    }
}
