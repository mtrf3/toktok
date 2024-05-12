package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;
import com.bytedance.pitaya.log.PitayaLogger;
import java.nio.charset.Charset;

/* renamed from: X.aP9, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93331aP9 implements InterfaceC93314aOs {
    public final /* synthetic */ long LIZ;

    public C93331aP9(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC93314aOs
    public final void LIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder("request success, response is ");
        Charset charset = PVC.LIZ;
        sb.append(new String(bArr, charset));
        PitayaLogger.LIZ("DefaultAdapter", sb.toString());
        CallCallbackInNative.LIZ.LIZ(this.LIZ, true, null, new String(bArr, charset));
    }

    @Override // X.InterfaceC93314aOs
    public final void onFailure(int i, String str) {
        String str2 = "request failed!, code is " + i + ", errorMsg is " + str + ",response is " + ((String) null);
        PitayaLogger.LIZIZ("DefaultAdapter", str2);
        CallCallbackInNative.LIZ.LIZ(this.LIZ, false, new PTYError("request", PTYErrorCode.NETWORK_ERROR.getCode(), i, str2, null), null);
    }
}
