package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TTh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74697TTh {
    public static DataChannel LIZ;

    public static boolean LIZ() {
        Boolean bool;
        LiveMode liveMode;
        LiveMode liveMode2;
        LiveMode liveMode3;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isHitModeratorLibraFun, isAnchor=");
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        LIZ2.append(C74947TbD.LJIILLIIL(LJ));
        LIZ2.append(", anchorAbility=");
        LiveAbLabelSetting liveAbLabelSetting = LiveAbLabelSetting.INSTANCE;
        LIZ2.append(liveAbLabelSetting.getIntValue("live_sdk_multiguest_moderator_ability"));
        LIZ2.append(", guestAbility=");
        LIZ2.append(U4C.LIZIZ("live_sdk_multiguest_moderator_ability"));
        LIZ2.append(", techSwitchSetting=");
        LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting linkMicMultiGuestV3AndroidModeratorTechSwitchSetting = LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE;
        LIZ2.append(linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue());
        LIZ2.append(", isMicRoom=");
        LIZ2.append(((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt());
        LIZ2.append(", isVideoLiveMode=");
        DataChannel dataChannel = LIZ;
        Boolean bool2 = null;
        if (dataChannel != null && (liveMode3 = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(liveMode3));
        } else {
            bool = null;
        }
        LIZ2.append(C29306Beo.LJJIFFI(bool));
        LIZ2.append(", ");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestModeratorCommonHelper", LIZIZ);
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        if (C74947TbD.LJIILLIIL(LJ2)) {
            if (liveAbLabelSetting.getIntValue("live_sdk_multiguest_moderator_ability") == 1 && linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue() && !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
                DataChannel dataChannel2 = LIZ;
                if (dataChannel2 != null && (liveMode2 = (LiveMode) dataChannel2.kv0(BCX.class)) != null) {
                    bool2 = Boolean.valueOf(C28509BGv.LJI(liveMode2));
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                    return true;
                }
            }
        } else {
            Integer LIZIZ2 = U4C.LIZIZ("live_sdk_multiguest_moderator_ability");
            if (LIZIZ2 != null && LIZIZ2.intValue() == 1 && linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue() && !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
                DataChannel dataChannel3 = LIZ;
                if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.kv0(BCX.class)) != null) {
                    bool2 = Boolean.valueOf(C28509BGv.LJI(liveMode));
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
