package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XDy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84490XDy implements XDR<Effect> {
    public final /* synthetic */ XCT LIZ;
    public final /* synthetic */ XDR LIZIZ;

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        Effect response = effect;
        o.LJIIJ(response, "response");
        XCT xct = this.LIZ;
        XE7 xe7 = new XE7(this);
        xct.getClass();
        xct.LJIIJ().LIZLLL(response, false, xe7);
    }

    @Override // X.XDR
    public final void preProcess(Effect effect) {
    }

    public C84490XDy(XCT xct, XDR xdr) {
        this.LIZ = xct;
        this.LIZIZ = xdr;
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            xdr.onFail(effect, exception);
        }
    }
}
