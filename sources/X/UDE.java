package X;

import Y.IDeS156S0200000_13;
import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_nearby_devices_popup_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ("video_live", "live_type");
        LIZ2.LJIJJ("multi_guest", "toast_type");
        LIZ2.LJIJJ(str, "btn_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(Activity activity, DataChannel dataChannel, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        if (Build.VERSION.SDK_INT >= 31 && !C76944UHs.LIZIZ(activity, "android.permission.BLUETOOTH_CONNECT")) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.L;
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "BLUETOOTH_PERMISSION_HIN…IMES_IN_INTERCEPTOR.value");
            if (LIZJ.intValue() < 2) {
                boolean LIZJ2 = C76944UHs.LIZJ(activity, "android.permission.BLUETOOTH_CONNECT");
                Boolean LIZJ3 = InterfaceC30442Bx8.K.LIZJ();
                o.LJIIIIZZ(LIZJ3, "FIRST_TIME_APPLY_BLUETOO…SION_IN_INTERCEPTOR.value");
                if (LIZJ3.booleanValue() || LIZJ2) {
                    c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
                    AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13(dataChannel, (DataChannel) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 66);
                    AqS160S0200000_13 aqS160S0200000_132 = new AqS160S0200000_13(dataChannel, (DataChannel) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 65);
                    String[] ungrant = C76944UHs.LIZ(activity, "android.permission.BLUETOOTH_CONNECT");
                    o.LJIIIIZZ(ungrant, "ungrant");
                    if (ungrant.length == 0) {
                        aqS160S0200000_13.invoke();
                        return;
                    }
                    C61099NyR LIZIZ = C61099NyR.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-bluetooth_connect_when_multiguest"));
                    UDF udf = new UDF(activity, dataChannel, aqS160S0200000_132);
                    C61100NyS c61100NyS = LIZIZ.LIZ;
                    c61100NyS.LIZ(udf);
                    c61100NyS.LIZIZ("android.permission.BLUETOOTH_CONNECT");
                    c61100NyS.LIZJ(new IDeS156S0200000_13(aqS160S0200000_13, aqS160S0200000_132, 1));
                    return;
                }
            }
        }
        interfaceC65784Pro.invoke();
    }
}
