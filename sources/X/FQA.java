package X;

import com.bytedance.pitaya.cep_engine.error.CepErrorCode;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;

/* loaded from: classes7.dex */
public final class FQA {
    public final /* synthetic */ long LIZ;

    public final void LIZ() {
        try {
            JniCaller.LIZ.callDataCallback(this.LIZ, false, CepErrorCode.DOWNLOAD_FAILED.getCode(), null);
        } catch (Throwable unused) {
        }
    }

    public final void LIZIZ() {
        try {
            JniCaller.LIZ.callDataCallback(this.LIZ, true, CepErrorCode.SUCCESS.getCode(), null);
        } catch (Throwable unused) {
        }
    }

    public FQA(long j) {
        this.LIZ = j;
    }
}
