package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;
import com.bytedance.pitaya.log.PitayaLogger;

/* renamed from: X.aP8, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93330aP8 implements InterfaceC93313aOr {
    public final /* synthetic */ long LIZ;

    public C93330aP8(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC93313aOr
    public final void onSuccess(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download ");
        LIZ.append(str);
        LIZ.append(" success");
        PitayaLogger.LIZ("DefaultAdapter", X1D.LIZIZ(LIZ));
        CallCallbackInNative.LIZ.LIZ(this.LIZ, true, null, null);
    }

    @Override // X.InterfaceC93313aOr
    public final void onFail(String str, String str2) {
        String str3 = str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download ");
        LIZ.append(str);
        LIZ.append(" failed, msg is ");
        LIZ.append(str3);
        PitayaLogger.LIZIZ("DefaultAdapter", X1D.LIZIZ(LIZ));
        CallCallbackInNative callCallbackInNative = CallCallbackInNative.LIZ;
        long j = this.LIZ;
        PTYErrorCode pTYErrorCode = PTYErrorCode.FILE_ERROR;
        int code = pTYErrorCode.getCode();
        int code2 = pTYErrorCode.getCode();
        if (str3 == null) {
            str3 = "Download failed, SDK doesn't show detail exception";
        }
        callCallbackInNative.LIZ(j, false, new PTYError("download", code, code2, str3, null), null);
    }
}
