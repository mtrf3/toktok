package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import org.json.JSONArray;
import org.json.JSONObject;
import tikcast.linkmic.common.LayoutState;

/* renamed from: X.Tp6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75808Tp6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject, C75814TpC c75814TpC) {
        Object obj;
        Object obj2;
        String str;
        jSONObject.put("state_version", c75814TpC.LJLIL);
        LayoutState layoutState = c75814TpC.LJLILLLLZI;
        if (layoutState == null || (obj = layoutState.layoutId) == null) {
            obj = "";
        }
        jSONObject.put("layout_id", obj);
        Object obj3 = c75814TpC.LJLJJL;
        if (obj3 == null) {
            obj3 = "";
        }
        jSONObject.put("background_image", obj3);
        JSONArray jSONArray = new JSONArray();
        for (UserState userState : c75814TpC.LJLJI) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("link_mic_id", userState.linkMicId);
            Player player = userState.user;
            if (player == null) {
                obj2 = "";
            } else {
                obj2 = Long.valueOf(player.uid);
            }
            jSONObject2.put("user_id", obj2);
            int i = userState.onlineUserState;
            if (i != 0) {
                if (i != 1) {
                    str = "paused";
                } else {
                    str = "normal";
                }
            } else {
                str = "undefined";
            }
            jSONObject2.put("online_user_state", str);
            jSONObject2.put("video_mute", userState.videoMuted);
            jSONObject2.put("audio_mute", userState.audioMuted);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_states", jSONArray);
    }

    public static void LIZIZ(int i, int i2, int i3, Throwable th) {
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[Rsp:");
        LIZ2.append(i2);
        LIZ2.append("] change state ");
        LIZ2.append(i);
        UC0.LJJIZ(X1D.LIZIZ(LIZ2), "ApiRsp");
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_change_state_result", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        BZI LIZ3 = C28787BRn.LIZ("change_state_result");
        LIZ3.LJIJJ(Integer.valueOf(i), "state_type");
        LIZ3.LJIJJ(Integer.valueOf(i2), "is_succeed");
        LIZ3.LJIJJ(Integer.valueOf(i3), "error_code");
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        LIZ3.LJIJJ(str, "error_msg");
        LIZ3.LJIJJ(C78886Uxe.LJJJJLL(C8E.LJ()), "link_id");
        LIZ3.LJIIZILJ();
        LIZ3.LJJIIJZLJL();
    }

    public static void LIZJ(int i, String str, String str2, boolean z, long j) {
        String str3;
        String str4;
        String str5;
        long LIZ2 = C30725C4b.LIZ() - j;
        if (!LinkMicStateSetting.INSTANCE.timeCostReport()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("on ");
            if (z) {
                str5 = "IM";
            } else {
                str5 = "RTC";
            }
            YE1.LIZLLL(LIZ3, str5, "Message stat[]: from ", str2, ", cost ");
            LIZ3.append(LIZ2);
            UC0.LJJIZ(X1D.LIZIZ(LIZ3), "MessageCost");
            return;
        }
        if (z) {
            str3 = "livesdk_rtc_message_cost";
        } else {
            str3 = "livesdk_state_im_cost";
        }
        BZI LIZ4 = C28787BRn.LIZ(str3);
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 7) {
                            str4 = "other";
                        } else {
                            str4 = "background_image";
                        }
                    } else {
                        str4 = "network_state";
                    }
                } else {
                    str4 = "video_mute";
                }
            } else {
                str4 = "audio_mute";
            }
        } else {
            str4 = "online_user_state";
        }
        LIZ4.LJIJJ(str4, "message_type");
        LIZ4.LJIJJ(str, "channel_id");
        if (str2 != null && str2.length() != 0) {
            LIZ4.LJIJJ(str2, "message_direction");
        }
        LIZ4.LJIJJ(Long.valueOf(LIZ2), "message_cost");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ4.LJIILL())) {
            LIZ4.LJIIZILJ();
            LIZ4.LJJIIJZLJL();
        } else {
            LIZ4.LJJIJ();
            LIZ4.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
            LIZ4.LJJIIZI();
        }
    }
}
