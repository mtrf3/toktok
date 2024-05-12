package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TR8 {
    public static boolean LIZ;
    public static String LIZIZ = "";
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;

    public static boolean LIZIZ() {
        Boolean bool;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            bool = Boolean.valueOf(multiGuestDataHolder.LJ);
        } else {
            bool = null;
        }
        return C29306Beo.LJIL(bool);
    }

    public static void LIZ() {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("endBackgroundTimeCalculation, backgroundStartTimeMills=");
        LIZ2.append(LIZLLL);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ2);
        if (LIZLLL > 0) {
            LJ = (System.currentTimeMillis() + LJ) - LIZLLL;
            C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("endBackgroundTimeCalculation, backgroundDuration=");
            LIZ3.append(LJ);
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            LJIILIIL2.getClass();
            C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ3);
            LIZLLL = 0L;
        }
    }

    public static void LIZJ() {
        long j;
        User owner;
        FollowInfo followInfo;
        LIZ();
        long currentTimeMillis = (System.currentTimeMillis() - LIZJ) - LJ;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("logCameraOnDuration, startCameraTimeMills=");
        LIZ2.append(LIZJ);
        LIZ2.append(", backgroundDuration=");
        LIZ2.append(LJ);
        LIZ2.append(", useCameraDuration=");
        LIZ2.append(currentTimeMillis);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ2);
        String guestInviteType = LIZIZ;
        o.LJIIIZ(guestInviteType, "guestInviteType");
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j = followInfo.getFollowStatus();
        } else {
            j = 0;
        }
        C43881HKb.LIZJ(j, hashMap, "follow_status", "guest_invite_type", guestInviteType);
        hashMap.put("duration", String.valueOf(currentTimeMillis));
        C74824TYe.LJLL("livesdk_guest_onstage_camera_on_duration", hashMap);
        LIZJ = 0L;
        LJ = 0L;
    }

    public static void LIZLLL(Runnable runnable) {
        if (LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting.INSTANCE.getValue()) {
            runnable.run();
        }
    }
}
