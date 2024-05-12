package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XD2 extends XD3 {
    public final /* synthetic */ XD4 LIZ;

    public XD2(XD4 xd4) {
        this.LIZ = xd4;
    }

    @Override // X.XDR
    public final void onSuccess(String response) {
        o.LJIIJ(response, "response");
        XD4 xd4 = this.LIZ;
        if (xd4 != null) {
            xd4.onFinally();
        }
    }

    @Override // X.XDR
    public final void onFail(String str, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
    }
}
