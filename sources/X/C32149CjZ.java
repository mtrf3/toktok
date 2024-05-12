package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOnceMoreDurationOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOncemoreDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* renamed from: X.CjZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32149CjZ {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C32159Cjj.LJLIL);

    public static boolean LIZIZ(boolean z) {
        LiveBattleDrawOnceMoreDurationOptSettings liveBattleDrawOnceMoreDurationOptSettings = LiveBattleDrawOnceMoreDurationOptSettings.INSTANCE;
        if (!liveBattleDrawOnceMoreDurationOptSettings.enable()) {
            return false;
        }
        if (z) {
            if (!liveBattleDrawOnceMoreDurationOptSettings.twoMatchEnable()) {
                return false;
            }
            return true;
        }
        if (!liveBattleDrawOnceMoreDurationOptSettings.multiMatchEnable()) {
            return false;
        }
        return true;
    }

    public static void LIZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        if (!LIZIZ(z)) {
            interfaceC88472Yns.invoke(Long.valueOf(LiveBattleDrawOncemoreDurationSetting.INSTANCE.getValue()));
            return;
        }
        String durationOptBusinessName = LiveBattleDrawOnceMoreDurationOptSettings.INSTANCE.durationOptBusinessName();
        if (durationOptBusinessName.length() == 0) {
            interfaceC88472Yns.invoke(Long.valueOf(LiveBattleDrawOncemoreDurationSetting.INSTANCE.getValue()));
            return;
        }
        ((C29921Fk) C0IT.LJFF()).LIZJ(new C22810uz(durationOptBusinessName, new C22820v0(false, null), new C32154Cje(interfaceC88472Yns), new C35201Zs(2, false, 0, 0L, 0L, 0L, 62), 8));
    }

    public static void LIZJ(long j, DataChannel dataChannel, boolean z) {
        String str;
        if (LIZIZ(z) && dataChannel != null) {
            long LJJIZ = C29306Beo.LJJIZ(dataChannel);
            C29306Beo.LJJIZ(dataChannel);
            String featureCollectBusinessName = LiveBattleDrawOnceMoreDurationOptSettings.INSTANCE.featureCollectBusinessName();
            if (featureCollectBusinessName.length() == 0) {
                return;
            }
            InterfaceC22790ux LJFF = C0IT.LJFF();
            JSONObject putOpt = new JSONObject().putOpt("feature_collect_type", "rematch_once_more");
            if (z) {
                str = "two_match";
            } else {
                str = "multi_match";
            }
            ((C29921Fk) LJFF).LIZJ(new C22810uz(featureCollectBusinessName, new C22820v0(false, putOpt.putOpt(WM7.SCENE_SERVICE, str).putOpt("room_id", Long.valueOf(LJJIZ)).putOpt("btn_show_duration", Long.valueOf(j)).putOpt("has_btn_clicked", 1)), (C32158Cji) LIZ.getValue(), new C35201Zs(2, false, 0, 0L, 0L, 0L, 62), 8));
        }
    }

    public static void LIZLLL(long j, DataChannel dataChannel, boolean z) {
        String str;
        if (LIZIZ(z) && dataChannel != null) {
            long LJJIZ = C29306Beo.LJJIZ(dataChannel);
            String featureCollectBusinessName = LiveBattleDrawOnceMoreDurationOptSettings.INSTANCE.featureCollectBusinessName();
            if (featureCollectBusinessName.length() == 0) {
                return;
            }
            InterfaceC22790ux LJFF = C0IT.LJFF();
            JSONObject putOpt = new JSONObject().putOpt("feature_collect_type", "rematch_once_more");
            if (z) {
                str = "two_match";
            } else {
                str = "multi_match";
            }
            ((C29921Fk) LJFF).LIZJ(new C22810uz(featureCollectBusinessName, new C22820v0(false, putOpt.putOpt(WM7.SCENE_SERVICE, str).putOpt("room_id", Long.valueOf(LJJIZ)).putOpt("btn_show_duration", Long.valueOf(j)).putOpt("has_btn_clicked", 0)), (C32158Cji) LIZ.getValue(), new C35201Zs(2, false, 0, 0L, 0L, 0L, 62), 8));
        }
    }
}
