package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import tikcast.api.perception.ViolationStatusResponse;

/* renamed from: X.BIn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28553BIn implements InterfaceC12650eb {
    public final /* synthetic */ UserManageService LIZ;
    public final /* synthetic */ C28555BIp LIZIZ;
    public final /* synthetic */ ViolationStatusResponse.ResponseData LIZJ;

    @Override // X.InterfaceC12650eb
    public final void LIZ(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        LiveMode streamType;
        PerceptionDialogInfo perceptionDialogInfo;
        PunishEventInfo punishEventInfo;
        PunishEventInfo punishEventInfo2;
        UserManageService userManageService = this.LIZ;
        C28555BIp c28555BIp = this.LIZIZ;
        ViolationStatusResponse.ResponseData responseData = this.LIZJ;
        userManageService.getClass();
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (currentUserId == c28555BIp.LIZJ) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_violation_popup");
        LIZ.LJIIZILJ();
        String str7 = null;
        if (responseData != null && (punishEventInfo2 = responseData.punishEvent) != null) {
            str3 = punishEventInfo2.punishType;
        } else {
            str3 = null;
        }
        C06530Nl.LIZLLL(LIZ, str3, "violation_type", currentUserId, "perception_reach_user_id");
        if (responseData != null && (punishEventInfo = responseData.punishEvent) != null) {
            str4 = punishEventInfo.punishReason;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "violation_reason");
        LIZ.LJIJJ(str, "action_type");
        LIZ.LJIJJ(str2, "user_type");
        LIZ.LJIJJ(c28555BIp.LJI, "scene_type");
        if (responseData != null && (perceptionDialogInfo = responseData.perceptionDialog) != null) {
            str5 = perceptionDialogInfo.violationDetailUrl;
        } else {
            str5 = null;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str6, "is_detail_button");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str7 = C28509BGv.LIZ(streamType);
        }
        LIZ.LJIJJ(str7, "live_type");
        LIZ.LJJIIJZLJL();
    }

    public C28553BIn(UserManageService userManageService, C28555BIp c28555BIp, ViolationStatusResponse.ResponseData responseData) {
        this.LIZ = userManageService;
        this.LIZIZ = c28555BIp;
        this.LIZJ = responseData;
    }
}
