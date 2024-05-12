package X;

import com.bytedance.vmsdk.worker.JsWorker;
import kotlin.jvm.internal.o;

/* renamed from: X.Equ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37700Equ {
    public final String LIZ;
    public final JsWorker LIZIZ;
    public final C24550xn LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37700Equ)) {
            return false;
        }
        C37700Equ c37700Equ = (C37700Equ) obj;
        return o.LJ(this.LIZ, c37700Equ.LIZ) && o.LJ(this.LIZIZ, c37700Equ.LIZIZ) && o.LJ(this.LIZJ, c37700Equ.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JsWorker jsWorker = this.LIZIZ;
        int hashCode2 = (hashCode + (jsWorker != null ? jsWorker.hashCode() : 0)) * 31;
        C24550xn c24550xn = this.LIZJ;
        return hashCode2 + (c24550xn != null ? c24550xn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InitializeParam(prefetchUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", mWorker=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", workerBridgeHandle=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C37700Equ(String prefetchUrl, JsWorker mWorker, C24550xn workerBridgeHandle) {
        o.LJIIJ(prefetchUrl, "prefetchUrl");
        o.LJIIJ(mWorker, "mWorker");
        o.LJIIJ(workerBridgeHandle, "workerBridgeHandle");
        this.LIZ = prefetchUrl;
        this.LIZIZ = mWorker;
        this.LIZJ = workerBridgeHandle;
    }
}
