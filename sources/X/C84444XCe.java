package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XCe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84444XCe implements XDR<List<? extends Effect>> {
    public final /* synthetic */ XCT LIZ;
    public final /* synthetic */ XDR LIZIZ;

    @Override // X.XDR
    public final void onSuccess(List<? extends Effect> list) {
        List<? extends Effect> response = list;
        o.LJIIJ(response, "response");
        this.LIZ.LIZJ(this.LIZIZ, null, response);
    }

    @Override // X.XDR
    public final void preProcess(List<? extends Effect> list) {
    }

    public C84444XCe(XCT xct, XDR xdr) {
        this.LIZ = xct;
        this.LIZIZ = xdr;
    }

    @Override // X.XDR
    public final void onFail(List<? extends Effect> list, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            xdr.onFail(list, exception);
        }
    }
}
