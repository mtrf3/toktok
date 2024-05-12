package X;

import com.bytedance.vmsdk.net.Response;
import com.bytedance.vmsdk.worker.JsWorker;

/* renamed from: X.Epd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37621Epd implements InterfaceC37172EiO<Response> {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ JsWorker LIZIZ;

    @Override // X.InterfaceC37172EiO
    public final void LIZ(Response response) {
        Response response2 = response;
        if (this.LIZIZ.isRunning()) {
            JsWorker.nativeResolve(this.LIZIZ.mNativeWorkerPtr.get(), response2, this.LIZ);
        }
    }

    public C37621Epd(JsWorker jsWorker, long j) {
        this.LIZIZ = jsWorker;
        this.LIZ = j;
    }
}
