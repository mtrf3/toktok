package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BhC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29454BhC {
    public final C29475BhX LIZ;
    public final C29484Bhg LIZIZ;
    public final long LIZJ;
    public long LIZLLL;

    public final String LIZIZ() {
        String KU;
        boolean LIZ = this.LIZIZ.LIZJ.LIZ();
        boolean LIZJ = this.LIZIZ.LIZJ.LIZJ();
        UserProfileEvent userProfileEvent = this.LIZ.LJI;
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (LIZ) {
            String KU2 = iInteractService.KU(this.LIZIZ.LIZJ.LIZJ);
            if (this.LIZIZ.LIZJ.LJ()) {
                return "live_anchor_c_anchor";
            }
            return i0.LJFF("live_anchor_c_", KU2);
        }
        if (userProfileEvent.isFromProgrammedLiveMenu || userProfileEvent.isFromProgrammedLiveFollowCard) {
            if (LIZJ) {
                return "program_live_audience_c_official_id";
            }
            return "program_live_audience_c_anchor";
        }
        if (((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            if (LIZJ) {
                return "program_live_audience_c_official_id";
            }
            return "program_live_audience_c_audience";
        }
        String KU3 = iInteractService.KU(this.LIZIZ.LIZJ.LIZIZ.getId());
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("live_");
        LIZ2.append(KU3);
        LIZ2.append("_c_");
        sb.append(X1D.LIZIZ(LIZ2));
        if (this.LIZIZ.LIZJ.LJ()) {
            KU = "anchor";
        } else {
            KU = iInteractService.KU(this.LIZIZ.LIZJ.LIZJ);
        }
        if (this.LIZIZ.LIZJ.LJ()) {
            sb.append("anchor");
        } else {
            sb.append(KU);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "{\n                val se….toString()\n            }");
        return sb2;
    }

    public static int LIZJ(User user) {
        List<BadgeStruct> list;
        String str;
        if (user != null) {
            list = user.getBadgeList();
        } else {
            list = null;
        }
        if (list == null) {
            return 0;
        }
        List<BadgeStruct> badgeList = user.getBadgeList();
        if (badgeList == null) {
            badgeList = C61878OQg.INSTANCE;
        }
        int i = -1;
        for (BadgeStruct badgeStruct : badgeList) {
            if (badgeStruct.badgeScene == 8) {
                try {
                    CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
                    if (combineBadgeStruct != null && (str = combineBadgeStruct.str) != null) {
                        i = C1E4.LJJIFFI(PatternProtector.compile("[^0-9]").matcher(str).replaceAll(""));
                    } else {
                        i = 0;
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (i <= -1) {
            return -1;
        }
        return i;
    }

    public static void LIZLLL(C29454BhC c29454BhC) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SubscribeInfo subscribeInfo;
        User owner;
        SubscribeInfo subscribeInfo2;
        SubscribeInfo subscribeInfo3;
        Room room = c29454BhC.LIZ.LIZLLL;
        boolean LIZ = c29454BhC.LIZIZ.LIZJ.LIZ();
        if (LIZ) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).upLoadLiveEcoEvent(room.getId(), 1);
        }
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_click_user", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        C29475BhX c29475BhX = c29454BhC.LIZ;
        long j = c29475BhX.LIZJ;
        UserProfileEvent userProfileEvent = c29475BhX.LJI;
        String LJIIIZ = BJM.LJIIIZ();
        DataChannel dataChannel = c29454BhC.LIZ.LJII;
        String LIZIZ = c29454BhC.LIZIZ();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_click_user");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        if (!LIZ) {
            str = "live_detail";
        } else {
            str = "live_take_detail";
        }
        LIZ2.LJIIJJI(str);
        LIZ2.LJIIIZ("live_interact");
        LIZ2.LJIJJ(LIZIZ, "click_type");
        LIZ2.LJIJJ(userProfileEvent.clickModule, "click_module");
        LIZ2.LJIJJ(userProfileEvent.clickMethod, "click_method");
        LIZ2.LJIJJ(Long.valueOf(userProfileEvent.msgId), "message_id");
        C07250Qf.LIZJ(userProfileEvent.releaseId, LIZ2, "message_release_id", LIZIZ, "request_page");
        LIZ2.LJIJJ(String.valueOf(j), "to_user_id");
        LIZ2.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "enter_live_method");
        if (!TextUtils.isEmpty(LJIIIZ) && o.LJ("click_push_live_cd_user", LJIIIZ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str2, "is_subscribe");
        if (c29454BhC.LIZ.LIZIZ) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        LIZ2.LJIJJ(str3, "room_orientation");
        if (TextUtils.isEmpty(userProfileEvent.mClickUserPosition)) {
            str4 = "profile_card";
        } else {
            str4 = userProfileEvent.mClickUserPosition;
        }
        LIZ2.LJIJJ(str4, "click_user_position");
        LIZ2.LJIJJ(Integer.valueOf(c29454BhC.LIZIZ.LIZJ.LIZLLL() ? 1 : 0), "is_self");
        LIZ2.LJJIFFI(BJB.LIZ());
        LIZ(LIZ2, null);
        LIZ2.LJIJJ(Integer.valueOf(C29292Bea.LIZJ(null) ? 1 : 0), "is_level");
        LIZ2.LJIJJ(Integer.valueOf(C29292Bea.LIZIZ(null) ? 1 : 0), "is_rank");
        int LIZJ = LIZJ(null);
        if (LIZJ > -1) {
            LIZ2.LJIJJ(Integer.valueOf(LIZJ), "user_level");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        if (room.getOwner().getSubscribeInfo() != null) {
            User owner2 = room.getOwner();
            int i = 0;
            if (owner2 != null && (subscribeInfo3 = owner2.getSubscribeInfo()) != null && subscribeInfo3.isAnchorQualified()) {
                str5 = "open";
            } else {
                str5 = "close";
            }
            LIZ2.LJIJJ(str5, "subscription_status");
            User owner3 = room.getOwner();
            if (owner3 != null && (subscribeInfo = owner3.getSubscribeInfo()) != null && subscribeInfo.isAnchorQualified() && (owner = room.getOwner()) != null && (subscribeInfo2 = owner.getSubscribeInfo()) != null) {
                i = subscribeInfo2.getSubscriberCount();
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "subscriber");
            LIZ2.LJJIFFI(userProfileEvent.extraParams);
        }
        java.util.Map<String, String> map = userProfileEvent.trackExtra;
        if (map != null) {
            LIZ2.LJJIFFI(map);
        }
        if (dataChannel.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW) {
            LIZ2.LJIIJJI("live_extended_comment_filed");
        }
        String str6 = userProfileEvent.mEventPage;
        if (str6 != null) {
            LIZ2.LJIIJJI(str6);
        }
        java.util.Map<String, String> map2 = userProfileEvent.mRankInfo;
        if (map2 != null) {
            LIZ2.LJJIFFI(map2);
        }
        LIZ2.LJJIIJZLJL();
    }

    public C29454BhC(C29475BhX c29475BhX, C29484Bhg cellConfig) {
        o.LJIIIZ(cellConfig, "cellConfig");
        this.LIZ = c29475BhX;
        this.LIZIZ = cellConfig;
        this.LIZJ = SystemClock.elapsedRealtime();
    }

    public static BZI LIZ(BZI bzi, User user) {
        boolean z;
        String str;
        String str2;
        if (user == null || user.getBadgeList() == null) {
            return bzi;
        }
        if (user != null && user.getLiveRoomId() > 0) {
            z = true;
        } else {
            z = false;
        }
        List<BadgeStruct> badgeList = user.getBadgeList();
        if (badgeList == null) {
            badgeList = C61878OQg.INSTANCE;
        }
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        for (BadgeStruct badgeStruct : badgeList) {
            int i5 = badgeStruct.badgeScene;
            if (i5 == 8) {
                try {
                    CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
                    if (combineBadgeStruct != null && (str2 = combineBadgeStruct.str) != null) {
                        i2 = C1E4.LJJIFFI(PatternProtector.compile("[^0-9]").matcher(str2).replaceAll(""));
                    } else {
                        i2 = 0;
                    }
                } catch (Exception unused) {
                }
            } else if (i5 == 10) {
                try {
                    PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
                    if (privilegeLogExtra != null && (str = privilegeLogExtra.level) != null) {
                        i4 = CastIntegerProtector.parseInt(str);
                    }
                } catch (Exception unused2) {
                }
                i3 = 1;
            }
        }
        if (i2 > -1) {
            bzi.LJIJJ(Integer.valueOf(i2), "user_level");
        }
        if (z) {
            i4 = -1;
        } else {
            i = i3;
        }
        bzi.LJIJJ(Integer.valueOf(i), "is_fans_club_level");
        bzi.LJIJJ(Integer.valueOf(i4), "fans_club_level");
        bzi.LJIJJ(Integer.valueOf(C29292Bea.LIZJ(user.getBadgeList()) ? 1 : 0), "is_level");
        bzi.LJIJJ(Integer.valueOf(C29292Bea.LIZIZ(user.getBadgeList()) ? 1 : 0), "is_rank");
        return bzi;
    }
}
