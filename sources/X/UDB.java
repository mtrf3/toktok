package X;

import android.app.Activity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS36S0301000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDB implements InterfaceC61107NyZ {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final /* synthetic */ Activity LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (o.LJ(c164906da.LIZ, "android.permission.BLUETOOTH_CONNECT")) {
                int i = UDD.LIZ[c164906da.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        if (!C76944UHs.LIZJ(this.LIZJ, "android.permission.BLUETOOTH_CONNECT")) {
                            C73118Smo c73118Smo = new C73118Smo();
                            Activity activity = this.LIZJ;
                            c73118Smo.LIZ(activity, new UDC(activity, this.LIZ, this.LIZIZ), new String[]{"android.permission.BLUETOOTH_CONNECT"});
                        } else {
                            DataChannel dataChannel = this.LIZ;
                            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
                            C30592BzY.LIZ(dataChannel, "deny");
                            interfaceC65784Pro.invoke();
                            InterfaceC30442Bx8.K.LIZ(Boolean.FALSE);
                        }
                    }
                } else {
                    InterfaceC30442Bx8.K.LIZ(Boolean.FALSE);
                    C30592BzY.LIZ(this.LIZ, "allow");
                    this.LIZIZ.invoke();
                }
            }
        }
    }

    public UDB(Activity activity, DataChannel dataChannel, AqS36S0301000_5 aqS36S0301000_5) {
        this.LIZ = dataChannel;
        this.LIZIZ = aqS36S0301000_5;
        this.LIZJ = activity;
    }
}
