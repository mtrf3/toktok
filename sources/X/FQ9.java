package X;

import com.bytedance.pitaya.cep_engine.error.CepErrorCode;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;

/* loaded from: classes7.dex */
public final class FQ9 {
    public final /* synthetic */ long LIZ;

    public FQ9(long j) {
        this.LIZ = j;
    }

    public final void LIZIZ(byte[] bArr) {
        try {
            JniCaller.LIZ.callDataCallback(this.LIZ, true, CepErrorCode.SUCCESS.getCode(), new String(bArr, PVC.LIZ));
        } catch (Throwable unused) {
        }
    }

    public final void LIZ(int i, String str) {
        try {
            JniCaller.LIZ.callDataCallback(this.LIZ, false, CepErrorCode.DOWNLOAD_FAILED.getCode(), "request failed!, code is " + i + ", errorMsg is " + ((Object) str) + ",response is " + ((Object) null));
        } catch (Throwable unused) {
        }
    }
}
