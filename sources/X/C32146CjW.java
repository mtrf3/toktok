package X;

import Y.AfS20S1100000_5;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerRequestSettings;
import com.bytedance.android.livesdk.livesetting.gift.AutoTriggerConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftGuideClientAI;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideExpSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideTriggerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS1S1200200_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CjW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32146CjW {
    public static void LIZJ(DataChannel dataChannel, String str, JSONObject jSONObject) {
        Room room;
        long j;
        LiveGiftGuideExpSetting liveGiftGuideExpSetting = LiveGiftGuideExpSetting.INSTANCE;
        if ((liveGiftGuideExpSetting.getValue() != 0 && LiveGiftGuideClientAISettings.INSTANCE.getValue().enableCollect) || LiveGuideDialogDurationOptSetting.INSTANCE.enable()) {
            switch (str.hashCode()) {
                case -2092390398:
                    if (str.equals("after_gift_combo") && jSONObject != null) {
                        C19660pu.LIZIZ("livesdk_combo_gift", jSONObject);
                        break;
                    }
                    break;
                case -1929103368:
                    if (str.equals("after_gift_animation")) {
                        C19660pu.LIZJ("livesdk_big_gift_loaded_timestamp");
                        break;
                    }
                    break;
                case -1922704744:
                    if (str.equals("close_special_badge_page")) {
                        C19660pu.LIZJ("livesdk_user_level_close_timestamp");
                        break;
                    }
                    break;
                case -1661806867:
                    if (str.equals("user_level_upgrade")) {
                        C19660pu.LIZJ("livesdk_user_level_upgrade_danmaku");
                        break;
                    }
                    break;
                case -1192132074:
                    if (str.equals("exit_clear_mode")) {
                        C19660pu.LIZJ("livesdk_clear_screen");
                        break;
                    }
                    break;
                case -1099292049:
                    if (str.equals("massive_comments") && jSONObject != null) {
                        C19660pu.LIZIZ("livesdk_massive_comments", jSONObject);
                        break;
                    }
                    break;
                case 1350451880:
                    if (str.equals("massive_gifts") && jSONObject != null) {
                        C19660pu.LIZIZ("livesdk_massive_gift", jSONObject);
                        break;
                    }
                    break;
            }
        }
        long LIZ = C17130lp.LIZ();
        int value = liveGiftGuideExpSetting.getValue();
        if (value != 1) {
            if (value != 2) {
                return;
            }
            LJ(dataChannel, str, LIZ, null, null);
            return;
        }
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId() || TextUtils.isEmpty(str)) {
            return;
        }
        if (!o.LJ(str, "client_polling")) {
            LiveGiftGuideTriggerSetting liveGiftGuideTriggerSetting = LiveGiftGuideTriggerSetting.INSTANCE;
            if (liveGiftGuideTriggerSetting.getValue() != 2 && liveGiftGuideTriggerSetting.getValue() != 3) {
                return;
            }
        }
        if (o.LJ(str, "client_polling")) {
            LiveGiftGuideTriggerSetting liveGiftGuideTriggerSetting2 = LiveGiftGuideTriggerSetting.INSTANCE;
            if (liveGiftGuideTriggerSetting2.getValue() != 1 && liveGiftGuideTriggerSetting2.getValue() != 3) {
                return;
            }
        }
        LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = LiveGiftGuideClientAISettings.INSTANCE;
        if (liveGiftGuideClientAISettings.getValue().nativeTriggerConfig.triggerTypeDisableList.contains(str)) {
            return;
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) dataChannel.kv0(WatchDurationChannel.class);
        if (interfaceC65784Pro != null) {
            j = ((Number) interfaceC65784Pro.invoke()).longValue();
        } else {
            j = 0;
        }
        long j2 = j / 1000;
        if (liveGiftGuideClientAISettings.getValue().nativeTriggerConfig.enablePitayaFilterList.contains(str)) {
            LIZ(room.getId(), str, j2, null, new AqS1S1200200_1(dataChannel, room, j2, LIZ, str, 1), C32160Cjk.LJLIL);
        } else {
            LJFF(dataChannel, room, str, j2, null, LIZ);
        }
    }

    public static void LJ(DataChannel dataChannel, String str, long j, JSONObject jSONObject, AutoTriggerConfig autoTriggerConfig) {
        Room room;
        long j2;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId()) {
            return;
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) dataChannel.kv0(WatchDurationChannel.class);
        if (interfaceC65784Pro != null) {
            j2 = ((Number) interfaceC65784Pro.invoke()).longValue();
        } else {
            j2 = 0;
        }
        C32089Cib.LJLLI = SystemClock.elapsedRealtime();
        C32089Cib.LJLLJ.put(str, Long.valueOf(C32089Cib.LJLLI));
        long j3 = j2 / 1000;
        if (autoTriggerConfig != null && autoTriggerConfig.ignorePitayaPackage == 1) {
            LJFF(dataChannel, room, autoTriggerConfig.defaultTriggerName, j3, null, j);
        } else {
            LIZ(room.getId(), str, j3, jSONObject, new AqS1S1200200_1(dataChannel, room, j3, j, str, 0), C75142xC.LJLIL);
        }
    }

    public static void LIZ(long j, String str, long j2, JSONObject jSONObject, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65784Pro interfaceC65784Pro) {
        String str2;
        long j3;
        InterfaceC22790ux value = C32089Cib.LJLLL.getValue();
        GiftGuideClientAI value2 = LiveGiftGuideClientAISettings.INSTANCE.getValue();
        if (value2.businessName.length() == 0) {
            str2 = value2.businessName;
        } else {
            str2 = value2.frequencyControlBusinessName;
        }
        JSONObject put = new JSONObject().putOpt("user_consume_layer", Integer.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue())).put("room_id", j).put("trigger_type", str).put("watch_duration", j2).put("last_gift_guide_ts", C32089Cib.LJLLILLLL);
        IWalletCenter walletCenter = ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        if (walletCenter != null) {
            j3 = ((WalletCenter) walletCenter).LIZ();
        } else {
            j3 = 0;
        }
        JSONObject put2 = put.put("available_diamonds", j3);
        if (jSONObject != null) {
            put2 = C77123UOp.LJJIJLIJ(put2, jSONObject);
        }
        value.LIZJ(new C22810uz(str2, new C22820v0(false, put2), new C32152Cjc(interfaceC65784Pro, interfaceC88471Ynr), new C35201Zs(0, false, 0, 0L, 0L, r7.getValue().taskTimeout, 31), 8));
    }

    public static void LIZIZ(DataChannel dataChannel, long j, String str, long j2, JSONObject jSONObject, long j3) {
        FP1.LJFF("start final trigger, scene == ", str, "LiveGiftGuidePredictManager");
        if (1000 * j2 < LiveGiftGuideClientAISettings.INSTANCE.getValue().frequencyControlTaskDelay) {
            return;
        }
        LiveClientTriggerRequestSettings liveClientTriggerRequestSettings = LiveClientTriggerRequestSettings.INSTANCE;
        if (liveClientTriggerRequestSettings.getRequestSetting() == 2) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "features ?: JSONObject()).toString()");
        LIZLLL(dataChannel, j, str, j2, j3, jSONObject2);
        if (liveClientTriggerRequestSettings.getRequestSetting() == 1) {
            C0K2.LJ("ttlive_client_trigger_request_type", new JSONObject().putOpt("request_from", 1).putOpt("trigger_type", str), new JSONObject(), new JSONObject());
        }
    }

    public static void LIZLLL(DataChannel dataChannel, long j, String scene, long j2, long j3, String featuresParam) {
        AbstractC73672Svk<C28467BFf<GiftGuideTriggerResponse.Data>> triggerGiftGuidePredict;
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(featuresParam, "featuresParam");
        C65814PsI.LIZ().getClass();
        GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C65814PsI.LIZJ(GiftRetrofitApi.class);
        if (giftRetrofitApi != null && (triggerGiftGuidePredict = giftRetrofitApi.triggerGiftGuidePredict(j, scene, j2, C32089Cib.LJLLILLLL, j3, featuresParam)) != null) {
            C1EW.LIZ(triggerGiftGuidePredict).LJJJLIIL(new AfS20S1100000_5(dataChannel, scene, 11), C32151Cjb.LJLIL);
        }
    }

    public static void LJFF(DataChannel dataChannel, Room room, String str, long j, JSONObject jSONObject, long j2) {
        FP1.LJFF("trigger request, scene == ", str, "LiveGiftGuidePredictManager");
        LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = LiveGiftGuideClientAISettings.INSTANCE;
        if (liveGiftGuideClientAISettings.getValue().nativeTriggerConfig.triggerTypeDisableList.contains(str) || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground()) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = C32089Cib.LJLLJ;
        if (concurrentHashMap.containsKey(str)) {
            if (concurrentHashMap.containsKey(str)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l = concurrentHashMap.get(str);
                if (l == null) {
                    l = Long.valueOf(C32089Cib.LJLLI);
                }
                if (elapsedRealtime - l.longValue() <= liveGiftGuideClientAISettings.getValue().triggerDuration * 1000) {
                    return;
                }
            } else {
                return;
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C32089Cib.LJLLI = elapsedRealtime2;
        concurrentHashMap.put(str, Long.valueOf(elapsedRealtime2));
        if (o.LJ(str, "close_special_badge_page")) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C75132xB(dataChannel, room, str, j, jSONObject, j2, null), 3);
        } else {
            LIZIZ(dataChannel, room.getId(), str, j, jSONObject, j2);
        }
    }
}
