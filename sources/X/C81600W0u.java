package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.W0u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81600W0u implements InterfaceC81593W0n {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C82622Wbi LIZ;

    public C81600W0u(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = diContainer;
    }

    @Override // X.InterfaceC81593W0n
    public final InterfaceC81592W0m LIZIZ(Effect effect) {
        return LIZ(effect, null, null);
    }

    @Override // X.InterfaceC81593W0n
    public final InterfaceC81592W0m LIZ(Effect effect, W10 w10, C81603W0x c81603W0x) {
        if (ID0.LJIJ(effect)) {
            return new C81607W1b(effect, this.LIZ, new AqS164S0100000_14(c81603W0x, 13));
        }
        if (ID0.LJIILIIL(effect)) {
            if (V3N.LJIILLIIL(effect)) {
                return new C81606W1a(effect, this.LIZ, 0, C81602W0w.LJLIL, new AqS180S0100000_14(c81603W0x, 6));
            }
            return new C81606W1a(effect, this.LIZ, 0, new AqS164S0100000_14(c81603W0x, 14), C81601W0v.LJLIL);
        }
        return new C81596W0q(c81603W0x);
    }
}
