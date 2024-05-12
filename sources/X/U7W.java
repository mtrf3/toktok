package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestFirstFrameApplogSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7W {
    public final ConcurrentHashMap<String, U83> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashSet<String> LIZIZ = new ConcurrentHashSet<>();
    public final ConcurrentHashSet<String> LIZJ = new ConcurrentHashSet<>();
    public long LIZLLL;
    public long LJ;

    public final void LIZJ() {
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZJ.clear();
    }

    public static HashMap LJ(U66 u66) {
        String str;
        String str2;
        int i;
        LiveMode streamType;
        HashMap hashMap = new HashMap();
        hashMap.put(WM7.SCENE_SERVICE, UC0.LJIILIIL(u66.getScene()).toString());
        hashMap.put("connection_type", C1DJ.LJIILIIL(u66.LIZJ()));
        String LLZLL = u66.LLZLL();
        String str3 = "";
        if (LLZLL == null) {
            LLZLL = "";
        }
        hashMap.put("linkmic_id", LLZLL);
        hashMap.put("channel_id", String.valueOf(u66.LJJLI()));
        String layoutId = u66.LLLZI().getLayoutId();
        if (layoutId == null) {
            layoutId = "";
        }
        hashMap.put("layout", layoutId);
        if (LJIIIIZZ(u66)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (str2 = room.getIdStr()) == null) {
            str2 = "";
        }
        hashMap.put("room_id", str2);
        Room LIZJ = u66.LIZJ();
        if (LIZJ != null && (streamType = LIZJ.getStreamType()) != null) {
            str3 = C28509BGv.LIZ(streamType);
        }
        hashMap.put("live_type", str3);
        hashMap.put("server_time", String.valueOf(C31012CFc.LIZIZ()));
        hashMap.put("client_time", String.valueOf(System.currentTimeMillis()));
        hashMap.put("is_moderator", String.valueOf(u66.n8()));
        if ((u66 instanceof U7T) && u66.getScene() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap.put("arch_type", String.valueOf(i));
        if (C1XY.LJIJJ(u66) && u66.getScene() == 4) {
            hashMap.put("is_resume_broadcast", String.valueOf(u66.LLLLJI() ? 1 : 0));
        }
        return hashMap;
    }

    public static boolean LJIIIIZZ(U66 u66) {
        Room LIZJ = u66.LIZJ();
        if (LIZJ != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == LIZJ.getOwnerUserId()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(String str) {
        for (Map.Entry<String, U83> entry : this.LIZ.entrySet()) {
            if (o.LJ(entry.getValue().LJ, str)) {
                this.LIZ.remove(entry.getKey());
            }
        }
        this.LIZIZ.remove(str);
        this.LIZJ.remove(str);
    }

    public final String LJI(String str) {
        for (Map.Entry<String, U83> entry : this.LIZ.entrySet()) {
            if (o.LJ(entry.getValue().LJ, str)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public final String LJII(U66 u66) {
        String LLZLL;
        U83 u83;
        U85 u85;
        String u852;
        if (LJIIIIZZ(u66) || (LLZLL = u66.LLZLL()) == null || (u83 = this.LIZ.get(LLZLL)) == null || (u85 = u83.LIZ) == null || (u852 = u85.toString()) == null) {
            return "unknown";
        }
        return u852;
    }

    public final void LJIIZILJ(U66 u66) {
        String str;
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("role_type", LJII(u66));
        LJ.put("duration", String.valueOf(System.currentTimeMillis() - this.LJ));
        if (u66.getScene() == 2) {
            if (u66.d()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJ.put("pre_join_rtc", str);
        }
        LJIJJLI("livesdk_linkmic_rtc_join_channel_succeed", LJ);
    }

    public final void LJIJI(U66 u66) {
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("role_type", LJII(u66));
        if (!LJIIIIZZ(u66) && this.LIZLLL != 0) {
            C7MY.LJFF(System.currentTimeMillis(), this.LIZLLL, LJ, "lead_time_before_push_data");
        }
        LJIJJLI("livesdk_linkmic_rtc_push_stream", LJ);
    }

    public static void LJIJJLI(String str, HashMap hashMap) {
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJJIFFI(hashMap);
        if (o.LJ("livesdk_linkmic_im_received", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        } else {
            LIZ.LJJIIJZLJL();
        }
    }

    public final void LJIILLIIL(U66 u66, String source) {
        String str;
        o.LJIIIZ(source, "source");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("role_type", LJII(u66));
        LJ.put("source", source);
        if (u66.getScene() == 2) {
            if (u66.d()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJ.put("pre_join_rtc", str);
        }
        LJIJJLI("livesdk_linkmic_rtc_join_channel_start", LJ);
        this.LJ = System.currentTimeMillis();
    }

    public final void LJIJ(U66 u66, String source) {
        o.LJIIIZ(source, "source");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("source", source);
        LJ.put("role_type", LJII(u66));
        LJIJJLI("livesdk_linkmic_rtc_leave_channel", LJ);
    }

    public final void LIZ(U85 roleType, String str, Long l) {
        o.LJIIIZ(roleType, "roleType");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog() || str == null) {
            return;
        }
        this.LIZ.put(str, new U83(roleType, C31012CFc.LIZIZ(), l, null, null));
    }

    public final HashMap LJFF(U66 u66, String str, String str2) {
        U85 u85;
        HashMap LJ = LJ(u66);
        LJ.put("remote_linkmic_id", str);
        U83 u83 = this.LIZ.get(str2);
        Long l = null;
        if (u83 != null) {
            u85 = u83.LIZ;
        } else {
            u85 = null;
        }
        LJ.put("role_type", String.valueOf(u85));
        InterfaceC75973Trl LLZZ = u66.LLZZ();
        String LLZLL = u66.LLZLL();
        if (LLZLL == null) {
            LLZLL = "";
        }
        LinkUser LJJ = LLZZ.LJJ(LLZLL);
        if (LJJ != null) {
            l = LJJ.getUserId();
        }
        LJ.put("remote_user_id", String.valueOf(l));
        return LJ;
    }

    public final void LJIIJJI(U66 u66, String str, String str2) {
        String LLZLL;
        long LIZIZ;
        Long l;
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog() || this.LIZIZ.contains(str)) {
            return;
        }
        if (u66.getScene() == 2) {
            LLZLL = LJI(str);
        } else if (LJIIIIZZ(u66)) {
            LLZLL = str;
        } else {
            LLZLL = u66.LLZLL();
            if (LLZLL == null) {
                LLZLL = "";
            }
        }
        if (this.LIZ.get(LLZLL) == null) {
            return;
        }
        this.LIZIZ.add(str);
        HashMap LJFF = LJFF(u66, str, LLZLL);
        long LIZIZ2 = C31012CFc.LIZIZ();
        U83 u83 = this.LIZ.get(LLZLL);
        if (u83 != null) {
            LIZIZ = u83.LIZIZ;
        } else {
            LIZIZ = C31012CFc.LIZIZ();
        }
        C7MY.LJFF(LIZIZ2, LIZIZ, LJFF, "duration");
        U83 u832 = this.LIZ.get(LLZLL);
        if (u832 != null && (l = u832.LIZJ) != null) {
            LJFF.put("full_duration", String.valueOf(C31012CFc.LIZIZ() - l.longValue()));
        }
        LJFF.put("type", str2);
        LJIJJLI("livesdk_linkmic_first_frame_success", LJFF);
        if (u66.getScene() == 2) {
            LIZLLL(str);
        }
    }

    public final void LJIILJJIL(int i, U66 u66, String str) {
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("error_code", String.valueOf(i));
        LJ.put("error_msg", str);
        LJIJJLI("livesdk_linkmic_rtc_error", LJ);
    }

    public final void LJIILL(int i, U66 u66, String str) {
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("error_msg", str);
        LJ.put("role_type", LJII(u66));
        LJ.put("error_code", String.valueOf(i));
        LJIJJLI("livesdk_linkmic_rtc_join_channel_failed", LJ);
    }

    public final void LJIJJ(long j, U66 u66, String str) {
        String str2;
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(u66);
        LJ.put("rtc_offline_reason", String.valueOf(j));
        if (this.LIZIZ.contains(str)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ.put("has_first_frame_come", str2);
        LJIJJLI("livesdk_linkmic_rtc_leave", LJ);
    }

    public final void LIZIZ(U85 roleType, String str, String remoteLinkMicId, Long l) {
        String str2;
        o.LJIIIZ(roleType, "roleType");
        o.LJIIIZ(remoteLinkMicId, "remoteLinkMicId");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        if (roleType == U85.INVITER || roleType == U85.HANDLER || roleType == U85.INVITER_DIRECT) {
            str2 = remoteLinkMicId;
        } else {
            str2 = str;
        }
        this.LIZ.put(str2, new U83(roleType, C31012CFc.LIZIZ(), l, str, remoteLinkMicId));
    }

    public final void LJIIJ(String remoteLinkMicId, U66 linker, boolean z, long j, long j2, String leaveReasonStr) {
        String LLZLL;
        long LIZIZ;
        String str;
        Long l;
        o.LJIIIZ(remoteLinkMicId, "remoteLinkMicId");
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(leaveReasonStr, "leaveReasonStr");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        if (linker.getScene() == 2) {
            LLZLL = LJI(remoteLinkMicId);
        } else if (LJIIIIZZ(linker)) {
            LLZLL = remoteLinkMicId;
        } else {
            LLZLL = linker.LLZLL();
            if (LLZLL == null) {
                LLZLL = "";
            }
        }
        if (this.LIZ.get(LLZLL) == null || this.LIZJ.contains(remoteLinkMicId) || this.LIZIZ.contains(remoteLinkMicId)) {
            return;
        }
        this.LIZJ.add(remoteLinkMicId);
        HashMap LJFF = LJFF(linker, remoteLinkMicId, LLZLL);
        long LIZIZ2 = C31012CFc.LIZIZ();
        U83 u83 = this.LIZ.get(LLZLL);
        if (u83 != null) {
            LIZIZ = u83.LIZIZ;
        } else {
            LIZIZ = C31012CFc.LIZIZ();
        }
        C7MY.LJFF(LIZIZ2, LIZIZ, LJFF, "duration");
        U83 u832 = this.LIZ.get(LLZLL);
        if (u832 != null && (l = u832.LIZJ) != null) {
            LJFF.put("full_duration", String.valueOf(C31012CFc.LIZIZ() - l.longValue()));
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        AnonymousClass391.LJFF(LJFF, "is_time_out", str, j, "rtc_offline_reason");
        C43881HKb.LIZJ(j2, LJFF, "leave_reason", "leave_reason_str", leaveReasonStr);
        LJIJJLI("livesdk_linkmic_first_frame_fail", LJFF);
        if (linker.getScene() != 2) {
            return;
        }
        LIZLLL(remoteLinkMicId);
    }

    public static final void LJIIL(String str, U66 linker, LinkLayerMessage message, String str2, String remoteUserId, OSZ<String, String> osz, boolean z, String str3) {
        int i;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(linker);
        LJ.put("message_name", str);
        LJ.put("msg_id", String.valueOf(message.getMessageId()));
        LJ.put("msg_scene", String.valueOf(message.scene));
        LJ.put("msg_type", String.valueOf(message.messageType));
        LJ.put("remote_linkmic_id", str2);
        LJ.put("remote_user_id", remoteUserId);
        if ((linker instanceof U7T) && linker.getScene() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        LJ.put("arch_type", String.valueOf(i));
        LJ.put("is_moderator_operation", String.valueOf(z));
        if (osz != null) {
            LJ.put(osz.getFirst(), osz.getSecond());
        }
        if (str3 != null) {
            LJ.put("operator_uid", str3);
        }
        LJIJJLI("livesdk_linkmic_im_received", LJ);
    }

    public static final void LJIILIIL(String str, U66 linker, String messageId, String messageScene, String messageType, String remoteLinkMicId, String remoteUserId, OSZ<String, String> osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(messageId, "messageId");
        o.LJIIIZ(messageScene, "messageScene");
        o.LJIIIZ(messageType, "messageType");
        o.LJIIIZ(remoteLinkMicId, "remoteLinkMicId");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(linker);
        LJ.put("message_name", str);
        LJ.put("msg_id", messageId);
        LJ.put("msg_scene", messageScene);
        LJ.put("msg_type", messageType);
        LJ.put("remote_linkmic_id", remoteLinkMicId);
        LJ.put("remote_user_id", remoteUserId);
        if (osz != null) {
            LJ.put(osz.getFirst(), osz.getSecond());
        }
        LJIJJLI("livesdk_linkmic_im_received", LJ);
    }

    public final void LJIIIZ(U6D linker, String str, long j, String str2, int i, OSZ osz, boolean z, String str3) {
        o.LJIIIZ(linker, "linker");
        if (!LiveSdkMultiguestFirstFrameApplogSetting.INSTANCE.isLog()) {
            return;
        }
        HashMap LJ = LJ(linker);
        AnonymousClass391.LJFF(LJ, "api_name", str, j, "duration");
        LJ.put("log_id", str2);
        LJ.put("error_code", String.valueOf(i));
        LJ.put("is_moderator_operation", String.valueOf(z));
        if (osz != null) {
            LJ.put(osz.getFirst(), osz.getSecond());
        }
        if (str3 != null) {
            LJ.put("remote_linkmic_id", str3);
        }
        LJIJJLI("livesdk_linkmic_api_finish", LJ);
    }
}
