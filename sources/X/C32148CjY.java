package X;

import Y.ARunnableS3S1300000_5;
import com.bytedance.android.livesdk.livesetting.gift.AutoTriggerConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CjY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32148CjY implements InterfaceC121064p4 {
    public final DataChannel LIZ;

    public C32148CjY(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC121064p4
    public final void LIZ(String eventName, java.util.Map<String, String> map) {
        AutoTriggerConfig autoTriggerConfig;
        o.LJIIIZ(eventName, "eventName");
        LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = LiveGiftGuideClientAISettings.INSTANCE;
        if (!liveGiftGuideClientAISettings.getAutoTriggerConfig().isEmpty() && (autoTriggerConfig = liveGiftGuideClientAISettings.getAutoTriggerConfig().get(eventName)) != null) {
            int i = autoTriggerConfig.delaySecond;
            if (i == 0) {
                LIZIZ(eventName, map, autoTriggerConfig);
            } else {
                C15610jN.LIZJ(new ARunnableS3S1300000_5(this, eventName, map, autoTriggerConfig, 1), i * 1000);
            }
        }
    }

    public final void LIZIZ(String str, java.util.Map<String, String> map, AutoTriggerConfig autoTriggerConfig) {
        String LIZ;
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        if (LJJIL == null || (LIZ = C17280m4.LIZ(LJJIL)) == null) {
            return;
        }
        if (autoTriggerConfig.isSameRoom > 0 && (!o.LJ(map.get("room_id"), LIZ) || map.get("room_id") == null || LIZ.length() == 0)) {
            return;
        }
        C32146CjW.LJ(this.LIZ, "auto_trigger_by_applog", C17130lp.LIZ(), new JSONObject().putOpt("trigger_event", str), autoTriggerConfig);
    }
}
