package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.notification.outapppushwsreconnect.OutAppPushWsReconnectConfigModel;

/* loaded from: classes12.dex */
public final class QXI {
    public static final OutAppPushWsReconnectConfigModel LIZ = new OutAppPushWsReconnectConfigModel(0, 0, false, 0, 0, 0, 63, null);

    public static final OutAppPushWsReconnectConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        OutAppPushWsReconnectConfigModel outAppPushWsReconnectConfigModel = LIZ;
        OutAppPushWsReconnectConfigModel outAppPushWsReconnectConfigModel2 = (OutAppPushWsReconnectConfigModel) LIZLLL.LJIIIIZZ("out_app_push_ws_reconnect_config", OutAppPushWsReconnectConfigModel.class, outAppPushWsReconnectConfigModel);
        if (outAppPushWsReconnectConfigModel2 == null) {
            return outAppPushWsReconnectConfigModel;
        }
        return outAppPushWsReconnectConfigModel2;
    }
}
