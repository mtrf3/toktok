package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CHz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31087CHz implements InterfaceC31452CWa {
    public static final C74839TYt LIZ;
    public static Room LIZIZ;

    static {
        C31087CHz c31087CHz = new C31087CHz();
        LIZ = new C74839TYt();
        ((IMessageService) CN1.LIZ(IMessageService.class)).addOnMessageParsedListener(c31087CHz);
    }

    public static void LIZJ() {
        int i;
        Long l;
        Long l2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_message_link_overall_state", 0.1d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Room room = LIZIZ;
            int i2 = 0;
            if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && !roomAuthStatus2.enableChat) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("chat_state", i ^ 1);
            Room room2 = LIZIZ;
            if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null) {
                i2 = roomAuthStatus.getPublicScreenAuth();
            }
            jSONObject.put("public_screen_state", i2);
            jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            Room room3 = LIZIZ;
            if (room3 != null) {
                l = Long.valueOf(room3.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            Room room4 = LIZIZ;
            if (room4 != null) {
                l2 = Long.valueOf(room4.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject.put("anchor_id", l2);
        } catch (JSONException unused) {
        }
        C0K2.LIZLLL("ttlive_message_link_overall_state", new JSONObject(), null, jSONObject);
    }

    public static void LIZIZ(int i) {
        Long l;
        Long l2;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_chat", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("send_precondition_error_code", i);
            jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            Room room = LIZIZ;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            Room room2 = LIZIZ;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject.put("anchor_id", l2);
        } catch (JSONException unused) {
        }
        C0K2.LIZLLL("ttlive_chat", new JSONObject(), null, jSONObject);
    }

    @Override // X.InterfaceC31452CWa
    public final void LIZ(ChatMessage chatMessage) {
        long j;
        long[] jArr;
        long j2;
        Long l;
        Long l2;
        Long l3;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_chat_message_metrics", 0.1d)) {
            return;
        }
        C74839TYt c74839TYt = LIZ;
        CommonMessageData commonMessageData = chatMessage.baseMessage;
        if (commonMessageData != null) {
            j = commonMessageData.messageId;
        } else {
            j = 0;
        }
        int binarySearch = Arrays.binarySearch(c74839TYt.LJLIL, 0, c74839TYt.LJLJI, j);
        if (binarySearch < 0 || (jArr = c74839TYt.LJLILLLLZI) == null) {
            j2 = 0;
        } else {
            j2 = jArr[binarySearch];
        }
        Long valueOf = Long.valueOf(j2);
        if (valueOf.longValue() > 0 && 1 != 0) {
            long longValue = valueOf.longValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message_send_receive_duration", SystemClock.uptimeMillis() - longValue);
                jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                Room room = LIZIZ;
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                jSONObject.put("room_id", l);
                Room room2 = LIZIZ;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l2 = null;
                }
                jSONObject.put("anchor_id", l2);
                CommonMessageData commonMessageData2 = chatMessage.baseMessage;
                if (commonMessageData2 != null) {
                    l3 = Long.valueOf(commonMessageData2.messageId);
                } else {
                    l3 = null;
                }
                jSONObject.put("msg_id", l3);
            } catch (JSONException unused) {
            }
            C0K2.LIZLLL("ttlive_chat_message_metrics", new JSONObject(), null, jSONObject);
        }
    }
}
