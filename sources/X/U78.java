package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCP2PMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import java.util.HashSet;

/* loaded from: classes14.dex */
public final class U78 {
    public static final int LIZ = LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().compatibleVersion;
    public static final HashSet<String> LIZIZ = C77275UUl.LIZLLL("linkMicSDKFirstVideoFrameReceived", "linkMicSDKKickout");

    public static void LIZ(U66 u66, String str, String str2, String str3) {
        String appVersion;
        Integer LJJJJJ;
        if (str == null || str.length() == 0 || u66 == null || !LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            return;
        }
        LinkUser LJJJJL = u66.LLZZ().LJJJJL(str);
        if (LJJJJL == null || (appVersion = LJJJJL.getAppVersion()) == null || (LJJJJJ = C29306Beo.LJJJJJ(appVersion)) == null) {
            C75516TkO c75516TkO = C75516TkO.LIZ;
            str.toString();
            c75516TkO.LIZ(20011, "P2P_MSG_APP_VERSION_NULL", C65618Pp8.of("remoteLinkMicId", str, "type", str3));
        } else {
            if (LJJJJJ.intValue() < LIZ) {
                return;
            }
            StringBuilder LIZLLL = C06540Nm.LIZLLL("appLogUserMsg, type=", str3, ", remoteLinkMicId=", str, ", msg=");
            LIZLLL.append(str2);
            U4R.LIZLLL("RtcUserMsgSuccessRateMonitor", X1D.LIZIZ(LIZLLL));
            LinkLayerRTCP2PMessage linkLayerRTCP2PMessage = (LinkLayerRTCP2PMessage) U7V.LJIILLIIL(LinkLayerRTCP2PMessage.class, str2);
            if (linkLayerRTCP2PMessage != null && LIZIZ.contains(linkLayerRTCP2PMessage.getMethod())) {
                C70657RoD.LJJI(0.01d, new U4T(u66, str, linkLayerRTCP2PMessage, str3));
            }
        }
    }
}
