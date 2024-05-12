package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Queue;

/* loaded from: classes6.dex */
public final class C1Z {
    public static final C60 LIZ = new C60(0);
    public static boolean LIZIZ;

    public static void LIZIZ(PerceptionMessage perceptionMessage, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        PerceptionDialogInfo perceptionDialogInfo;
        if (perceptionMessage == null || (perceptionDialogInfo = perceptionMessage.dialog) == null) {
            return;
        }
        int i = perceptionDialogInfo.scene;
        if (i != 2 && i != 3) {
            return;
        }
        if (C29306Beo.LIZ(C15380j0.LIZLLL()) == null) {
            C0NB.LJIIIZ("multi_co_host_violation", "activityContext is null");
        }
        ActivityC45651qj LIZ2 = C29306Beo.LIZ(C15380j0.LIZLLL());
        if (LIZ2 == null) {
            return;
        }
        C60 c60 = LIZ;
        boolean z = LIZIZ;
        C1Y c1y = new C1Y(perceptionDialogInfo, LIZ2, perceptionMessage, perceptionMessage, interfaceC88472Yns, interfaceC88472Yns2);
        c60.getClass();
        ((Queue) c60.LIZ).add(c1y);
        if (!z) {
            c60.LIZIZ();
        }
    }

    public static void LIZ(String str, int i, String str2, PunishEventInfo punishEventInfo, PerceptionDialogInfo perceptionDialogInfo) {
        String str3;
        String str4;
        String str5;
        LiveMode streamType;
        if (punishEventInfo != null) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_violation_popup");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(str, "action_type");
            LIZ2.LJIJJ("anchor", "user_type");
            if (i == 2) {
                str3 = "live";
            } else {
                str3 = "apply_pk";
            }
            LIZ2.LJIJJ(str3, "scene_type");
            LIZ2.LJIJJ(punishEventInfo.punishId, "record_id");
            LIZ2.LJIJJ(punishEventInfo.punishType, "violation_type");
            LIZ2.LJIJJ(punishEventInfo.punishReason, "violation_reason");
            C07250Qf.LIZJ(punishEventInfo.violationUid, LIZ2, "violation_anchor_id", str2, "click_tab");
            LIZ2.LJIJJ(punishEventInfo.duration, "period");
            String str6 = null;
            if (perceptionDialogInfo != null) {
                str4 = perceptionDialogInfo.violationDetailUrl;
            } else {
                str4 = null;
            }
            if (!TextUtils.isEmpty(str4)) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJIJJ(str5, "is_detail_button");
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && (streamType = room.getStreamType()) != null) {
                str6 = C28509BGv.LIZ(streamType);
            }
            LIZ2.LJIJJ(str6, "live_type");
            LIZ2.LJJIIJZLJL();
        }
    }
}
