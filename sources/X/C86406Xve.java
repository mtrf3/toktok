package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import kotlin.jvm.internal.o;

/* renamed from: X.Xve, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86406Xve implements IReportADLogResultCallback {
    public final /* synthetic */ InterfaceC86407Xvf LIZ;

    public C86406Xve(C86403Xvb c86403Xvb) {
        this.LIZ = c86403Xvb;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
    public final void onFailure(int i, String msg) {
        o.LJIIJ(msg, "msg");
        this.LIZ.onFailure(i, msg);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
    public final void onSuccess(C61335O5j result, String msg) {
        o.LJIIJ(result, "result");
        o.LJIIJ(msg, "msg");
        this.LIZ.onSuccess(result, msg);
    }
}
