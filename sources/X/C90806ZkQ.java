package X;

import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.api.IBindSdkInfoListener;

/* renamed from: X.ZkQ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90806ZkQ implements IBindSdkInfoListener {
    public final /* synthetic */ IBindSdkInfoListener LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onByteCastSuccess() {
        this.LIZ.onByteCastSuccess();
        this.LIZIZ.LIZJ.sendSourceEvent("ByteCast_BindSdk_Info_Success", "");
    }

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onLelinkSuccess() {
        this.LIZ.onLelinkSuccess();
        this.LIZIZ.LIZJ.sendSourceEvent("ByteCast_BindSdk_Lelink_Success", "");
    }

    public C90806ZkQ(C90801ZkL c90801ZkL, IBindSdkInfoListener iBindSdkInfoListener) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = iBindSdkInfoListener;
    }

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onByteCastFail(int i, String str, Exception exc) {
        this.LIZ.onByteCastFail(i, str, exc);
        CastMonitor castMonitor = this.LIZIZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errCode:");
        LIZ.append(i);
        LIZ.append(", errMsg:");
        LIZ.append(str);
        LIZ.append(", e:");
        LIZ.append(exc);
        castMonitor.sendSourceEvent("ByteCast_BindSdk_Info_Failure", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.common.api.IBindSdkInfoListener
    public final void onLelinkFail(int i, String str, Exception exc) {
        this.LIZ.onLelinkFail(i, str, exc);
        CastMonitor castMonitor = this.LIZIZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errCode:");
        LIZ.append(i);
        LIZ.append(", errMsg:");
        LIZ.append(str);
        LIZ.append(", e:");
        LIZ.append(exc);
        castMonitor.sendSourceEvent("ByteCast_BindSdk_Lelink_Failure", X1D.LIZIZ(LIZ));
    }
}
