package X;

import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.XDv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84487XDv implements XDR<EffectChannelResponse> {
    public final /* synthetic */ XCT LIZ;
    public final /* synthetic */ XDR LIZIZ;

    @Override // X.XDR
    public final void onSuccess(EffectChannelResponse response) {
        o.LJIIJ(response, "response");
        ((XEA) this.LIZ.LJ.getValue()).LIZ.LIZ = response;
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            xdr.onSuccess(response);
        }
    }

    @Override // X.XDR
    public final void preProcess(EffectChannelResponse effectChannelResponse) {
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            xdr.preProcess(effectChannelResponse);
        }
    }

    public C84487XDv(XCT xct, XDR xdr) {
        this.LIZ = xct;
        this.LIZIZ = xdr;
    }

    @Override // X.XDR
    public final void onFail(EffectChannelResponse effectChannelResponse, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            xdr.onFail(effectChannelResponse, exception);
        }
    }
}
