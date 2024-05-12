package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W0P implements UYF {
    public final /* synthetic */ W0V LIZ;

    public W0P(W0V w0v) {
        this.LIZ = w0v;
    }

    @Override // X.UYF
    public final void LIZ(boolean z, Effect effect, W0K stickerType) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(stickerType, "stickerType");
        W0O w0o = this.LIZ.LJ;
        if (w0o != null) {
            w0o.LIZ(z, effect, stickerType);
        }
    }
}
