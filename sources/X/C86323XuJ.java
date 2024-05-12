package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.XuJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86323XuJ {
    public static final void LIZ(C86343Xud c86343Xud, boolean z) {
        String str;
        String str2;
        Long l;
        long j;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        C188727au c188727au = new C188727au();
        String str3 = null;
        if (c86343Xud != null) {
            str = c86343Xud.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("enter_from_merge", str);
        c188727au.LJIIIZ("action_type", "click");
        if (c86343Xud != null && (liveRoomStruct3 = c86343Xud.LIZIZ) != null && (user = liveRoomStruct3.owner) != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("anchor_id", str2);
        if (c86343Xud != null && (liveRoomStruct2 = c86343Xud.LIZIZ) != null) {
            l = Long.valueOf(liveRoomStruct2.id);
        } else {
            l = null;
        }
        c188727au.LJFF(l, "room_id");
        if (c86343Xud != null && (aweme = c86343Xud.LIZ) != null) {
            str3 = aweme.getRequestId();
        }
        c188727au.LJIIIZ("request_id", str3);
        c188727au.LJIIIZ("enter_method", "live_cell");
        c188727au.LIZLLL(z ? 1 : 0, "is_preview_over");
        if (c86343Xud != null && (liveRoomStruct = c86343Xud.LIZIZ) != null) {
            j = liveRoomStruct.maxPreviewTime;
        } else {
            j = 0;
        }
        c188727au.LJ(j / 1000, "maximum_preview_duration");
        FMX.LJIIL("livesdk_sub_only_live_preview_show", c188727au.LIZ);
    }

    public static final void LIZIZ(C86343Xud c86343Xud, long j) {
        long j2;
        String str;
        String str2;
        Long l;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        LiveRoomStruct liveRoomStruct4;
        if (c86343Xud != null && (liveRoomStruct4 = c86343Xud.LIZIZ) != null) {
            j2 = liveRoomStruct4.allowPreviewTime;
        } else {
            j2 = -1;
        }
        long j3 = 0;
        if (j <= 0 && j2 < 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        String str3 = null;
        if (c86343Xud != null) {
            str = c86343Xud.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("enter_from_merge", str);
        c188727au.LJIIIZ("action_type", "click");
        if (c86343Xud != null && (liveRoomStruct3 = c86343Xud.LIZIZ) != null && (user = liveRoomStruct3.owner) != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("anchor_id", str2);
        if (c86343Xud != null && (liveRoomStruct2 = c86343Xud.LIZIZ) != null) {
            l = Long.valueOf(liveRoomStruct2.id);
        } else {
            l = null;
        }
        c188727au.LJFF(l, "room_id");
        if (c86343Xud != null && (aweme = c86343Xud.LIZ) != null) {
            str3 = aweme.getRequestId();
        }
        c188727au.LJIIIZ("request_id", str3);
        c188727au.LJIIIZ("enter_method", "live_cell");
        c188727au.LJIIIZ("event_page", "others");
        c188727au.LJ((j - j2) / 1000, "duration");
        if (c86343Xud != null && (liveRoomStruct = c86343Xud.LIZIZ) != null) {
            j3 = liveRoomStruct.maxPreviewTime;
        }
        c188727au.LJ(j3 / 1000, "maximum_preview_duration");
        FMX.LJIIL("livesdk_sub_only_live_preview_duration", c188727au.LIZ);
    }
}
