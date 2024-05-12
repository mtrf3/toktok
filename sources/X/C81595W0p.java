package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS180S0100000_14;

/* renamed from: X.W0p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81595W0p implements InterfaceC81593W0n {
    @Override // X.InterfaceC81593W0n
    public final InterfaceC81592W0m LIZIZ(Effect effect) {
        return LIZ(effect, null, null);
    }

    @Override // X.InterfaceC81593W0n
    public final InterfaceC81592W0m LIZ(Effect effect, W10 w10, C81603W0x c81603W0x) {
        if (ID0.LJIJ(effect)) {
            return new UYH(effect, new AqS180S0100000_14(w10, 179));
        }
        return new C81596W0q(c81603W0x);
    }
}
