package X;

import com.byted.cast.common.Monitor;
import com.byted.cast.common.api.IBindSdkInfoListener;

/* renamed from: X.ZlA, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90852ZlA implements IBindSdkInfoListener {
    public final /* synthetic */ IBindSdkInfoListener LIZ;

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onByteCastSuccess() {
        this.LIZ.onByteCastSuccess();
        Monitor.sendSinkEvent("ByteCast_BindSdk_Info_Success", "");
    }

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onLelinkSuccess() {
        this.LIZ.onLelinkSuccess();
        Monitor.sendSinkEvent("ByteCast_BindSdk_Lelink_Success", "");
    }

    public C90852ZlA(IBindSdkInfoListener iBindSdkInfoListener) {
        this.LIZ = iBindSdkInfoListener;
    }

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onByteCastFail(int i, String str, Exception exc) {
        this.LIZ.onByteCastFail(i, str, exc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errCode:");
        LIZ.append(i);
        LIZ.append(", errMsg:");
        LIZ.append(str);
        LIZ.append(", e:");
        LIZ.append(exc);
        Monitor.sendSinkEvent("ByteCast_BindSdk_Info_Failure", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onLelinkFail(int i, String str, Exception exc) {
        this.LIZ.onLelinkFail(i, str, exc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errCode:");
        LIZ.append(i);
        LIZ.append(", errMsg:");
        LIZ.append(str);
        LIZ.append(", e:");
        LIZ.append(exc);
        Monitor.sendSinkEvent("ByteCast_BindSdk_Lelink_Failure", X1D.LIZIZ(LIZ));
    }
}
