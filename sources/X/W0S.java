package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.IDqS438S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W0S implements UYF {
    public final /* synthetic */ IDqS438S0100000_14 LIZ;

    public W0S(IDqS438S0100000_14 iDqS438S0100000_14) {
        this.LIZ = iDqS438S0100000_14;
    }

    @Override // X.UYF
    public final void LIZ(boolean z, Effect effect, W0K stickerType) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(stickerType, "stickerType");
        W0N w0n = ((W0U) this.LIZ.l0).LIZIZ;
        if (w0n != null) {
            w0n.LIZ(z, effect, stickerType);
        }
    }
}
