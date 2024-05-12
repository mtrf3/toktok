package X;

import android.app.Activity;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public final class UDC implements UDJ {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ DataChannel LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.UDJ
    public final void cancel() {
        DataChannel dataChannel = this.LIZIZ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        C30592BzY.LIZ(dataChannel, "deny");
        interfaceC65784Pro.invoke();
        InterfaceC30442Bx8.K.LIZ(Boolean.FALSE);
    }

    @Override // X.UDJ
    public final void execute() {
        OHI ohi = OHI.LIZ;
        Activity activity = this.LIZ;
        ohi.getClass();
        OHI.LJIIIIZZ(activity, "android.permission.BLUETOOTH_CONNECT");
    }

    public UDC(Activity activity, DataChannel dataChannel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = activity;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC65784Pro;
    }
}
