package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XE7 implements XCP {
    public final /* synthetic */ C84490XDy LIZ;

    @Override // X.XCP
    public final void onProgress(Effect effect, int i, long j) {
    }

    @Override // X.XCP
    public final void onStart(Effect effect) {
    }

    public XE7(C84490XDy c84490XDy) {
        this.LIZ = c84490XDy;
    }

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        XDR xdr;
        if (effect != null && (xdr = this.LIZ.LIZIZ) != null) {
            xdr.onSuccess(effect);
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZ.LIZIZ;
        if (xdr != null) {
            xdr.onFail(effect, exception);
        }
    }
}
