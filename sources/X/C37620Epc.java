package X;

import com.bytedance.vmsdk.worker.JsWorker;

/* renamed from: X.Epc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37620Epc implements InterfaceC37172EiO<Throwable> {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ JsWorker LIZIZ;

    @Override // X.InterfaceC37172EiO
    public final void LIZ(Throwable th) {
        Throwable th2 = th;
        if (this.LIZIZ.isRunning()) {
            JsWorker.nativeReject(this.LIZIZ.mNativeWorkerPtr.get(), th2.getMessage(), this.LIZ);
        }
    }

    public C37620Epc(JsWorker jsWorker, long j) {
        this.LIZIZ = jsWorker;
        this.LIZ = j;
    }
}
