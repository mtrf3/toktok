package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xua, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86340Xua {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C78486UrC.LJLIL);

    public static void LIZ(C86343Xud c86343Xud) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String str;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        C58655N0h LJJJJ;
        if (c86343Xud != null && c86343Xud.LIZ != null && c86343Xud.LIZIZ != null) {
            String str2 = null;
            if (1 != 0) {
                Aweme aweme2 = c86343Xud.LIZ;
                if (((aweme2 != null && aweme2.isAd()) || ((aweme = c86343Xud.LIZ) != null && C63081OpJ.LLF(aweme))) && c86343Xud.LJIIIIZZ.LJLIL > 0) {
                    Aweme aweme3 = c86343Xud.LIZ;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "break", awemeRawAd);
                    Aweme aweme4 = c86343Xud.LIZ;
                    if (aweme4 != null && (LJJJJ = C63081OpJ.LJJJJ("draw_ad", aweme4, "break")) != null) {
                        LIZLLL = LJJJJ;
                    }
                    LIZLLL.LIZJ(Long.valueOf(System.currentTimeMillis() - c86343Xud.LJIIIIZZ.LJLIL), "duration");
                    LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - c86343Xud.LJIIIIZZ.LJLIL), "duration");
                    Aweme aweme5 = c86343Xud.LIZ;
                    if (aweme5 != null && (roomFeedCellStruct2 = aweme5.getRoomFeedCellStruct()) != null && (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) != null) {
                        str = Long.valueOf(newLiveRoomData2.getAnchorId()).toString();
                    } else {
                        str = null;
                    }
                    LIZLLL.LIZIZ(str, "anchor_id");
                    Aweme aweme6 = c86343Xud.LIZ;
                    if (aweme6 != null && (roomFeedCellStruct = aweme6.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                        str2 = Long.valueOf(newLiveRoomData.id).toString();
                    }
                    LIZLLL.LIZIZ(str2, "room_id");
                    LIZLLL.LJI();
                }
            }
        }
    }

    public static void LIZLLL(C86343Xud c86343Xud) {
        String str;
        String str2;
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject optJSONObject;
        StreamUrlStruct streamUrlStruct2;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.PullData pullData2;
        LiveCoreSDKData.Options options;
        LiveCoreSDKData.Quality defaultQuality;
        if (c86343Xud != null) {
            Aweme aweme = c86343Xud.LIZ;
            LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
            C86345Xuf c86345Xuf = c86343Xud.LJIIIIZZ;
            long j = c86345Xuf.LJLJJI;
            long j2 = 0;
            if (j > 0) {
                long j3 = c86345Xuf.LJLIL;
                if (j3 > 0 && aweme != null && liveRoomStruct != null && c86343Xud.LJIIIZ) {
                    if (j < j3) {
                        j = j3;
                    }
                    long j4 = c86343Xud.LJJI;
                    long j5 = c86343Xud.LJJIFFI;
                    if (j4 > 0) {
                        j5 += SystemClock.elapsedRealtime() - j4;
                    }
                    LiveRoomStruct liveRoomStruct2 = c86343Xud.LIZIZ;
                    if (liveRoomStruct2 != null && (streamUrlStruct2 = liveRoomStruct2.stream_url) != null && (liveCoreSDKData2 = streamUrlStruct2.liveCoreSDKData) != null && (pullData2 = liveCoreSDKData2.getPullData()) != null && (options = pullData2.getOptions()) != null && (defaultQuality = options.getDefaultQuality()) != null) {
                        str = defaultQuality.sdkKey;
                    } else {
                        str = null;
                    }
                    String str3 = "";
                    if (str == null) {
                        str = "";
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        LiveRoomStruct liveRoomStruct3 = c86343Xud.LIZIZ;
                        if (liveRoomStruct3 != null && (streamUrlStruct = liveRoomStruct3.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (streamData = pullData.getStreamData()) != null) {
                            JSONObject jSONObject = new JSONObject(streamData);
                            if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                                Iterator<String> keys = optJSONObject.keys();
                                o.LJIIIIZZ(keys, "keys");
                                while (keys.hasNext()) {
                                    String key = keys.next();
                                    o.LJIIIIZZ(key, "key");
                                    arrayList.add(key);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    String abstractCollection = arrayList.toString();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("scene_id", "1003");
                    c188727au.LJ(System.currentTimeMillis() - j, "duration");
                    c188727au.LJIIIZ("enter_from_merge", c86343Xud.LIZJ);
                    c188727au.LJIIIZ("action_type", "click");
                    c188727au.LJIIIZ("anchor_id", liveRoomStruct.owner.getUid());
                    c188727au.LJ(liveRoomStruct.id, "room_id");
                    c188727au.LJIIIZ("request_id", aweme.getRequestId());
                    c188727au.LJIIIZ("enter_method", "live_cell");
                    c188727au.LIZLLL(aweme.getAwemePosition(), "order");
                    c188727au.LJIIIZ("live_play_session_id", c86343Xud.LJJIII);
                    String str4 = c86343Xud.LJJIIJ;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c188727au.LJIIIZ("live_session_id", str3);
                    c188727au.LJIIIZ("follow_status", String.valueOf(C54740Le4.LIZ(liveRoomStruct)));
                    String str5 = "1";
                    if (c86343Xud.LJII.LIZ) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJIIIZ("has_first_frame", str2);
                    if (!liveRoomStruct.hasCommerceGoods) {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJIIIZ("is_ecom", str5);
                    c188727au.LIZLLL(c86343Xud.LJI, "room_position");
                    c188727au.LIZLLL(0, "is_from_draw_req");
                    c188727au.LIZLLL(c86343Xud.LJIJI, "end_type");
                    LiveMode streamType = RoomStruct.getStreamType(liveRoomStruct);
                    o.LJIIIIZZ(streamType, "getStreamType(mRoomStruct)");
                    c188727au.LJIIIZ("live_type", C28509BGv.LIZ(streamType));
                    c188727au.LIZLLL(c86343Xud.LJIJJ, "if_gift_effect");
                    c188727au.LIZLLL(c86343Xud.LJIJJLI, "is_complete_gift_effect");
                    c188727au.LIZLLL(c86343Xud.LJJ, "stall_count");
                    c188727au.LJ(j5, "stall_duration");
                    c188727au.LJIIIZ("resolution_list", abstractCollection);
                    c188727au.LJIIIZ("default_resolution", str);
                    c188727au.LJIIIZ("play_resolution", c86343Xud.LJJII);
                    InterfaceC86351Xul interfaceC86351Xul = c86343Xud.LJJIIZ;
                    if (interfaceC86351Xul != null) {
                        j2 = interfaceC86351Xul.getBitrate();
                    }
                    c188727au.LJ(j2, "play_bitrate");
                    FMX.LJIIL("livesdk_live_window_duration_v2", c188727au.LIZ);
                }
            }
            c86343Xud.LJIIIZ = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C86343Xud r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86340Xua.LJFF(X.Xud, java.lang.String):void");
    }

    public static void LIZIZ(C86343Xud c86343Xud, boolean z, boolean z2) {
        LiveRoomStruct liveRoomStruct;
        int i;
        String str;
        String str2;
        if (c86343Xud != null && (liveRoomStruct = c86343Xud.LIZIZ) != null) {
            long j = c86343Xud.LJIIIIZZ.LJLIL;
            if (j > 0 && c86343Xud.LIZ != null && c86343Xud.LJIIIZ) {
                Integer num = null;
                if (1 != 0) {
                    if (z2) {
                        i = -3;
                    } else if (!z) {
                        i = -2;
                    } else {
                        if (c86343Xud.LJII.LIZ) {
                            return;
                        }
                        if (c86343Xud.LJIIJ) {
                            i = -4;
                        } else {
                            i = -1;
                        }
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJ(System.currentTimeMillis() - j, "duration");
                    c188727au.LJIIIZ("enter_from_merge", c86343Xud.LIZJ);
                    c188727au.LJIIIZ("enter_method", "live_cell");
                    c188727au.LJIIIZ("action_type", "click");
                    c188727au.LJIIIZ("anchor_id", liveRoomStruct.owner.getUid());
                    c188727au.LJ(liveRoomStruct.id, "room_id");
                    c188727au.LJIIIZ("live_play_session_id", c86343Xud.LJJIII);
                    String str3 = c86343Xud.LJJIIJ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c188727au.LJIIIZ("live_session_id", str3);
                    Aweme aweme = c86343Xud.LIZ;
                    if (aweme != null) {
                        str = aweme.getRequestId();
                    } else {
                        str = null;
                    }
                    c188727au.LJIIIZ("request_id", str);
                    Aweme aweme2 = c86343Xud.LIZ;
                    if (aweme2 != null) {
                        num = Integer.valueOf(aweme2.getAwemePosition());
                    }
                    c188727au.LJFF(num, "order");
                    c188727au.LIZLLL(C54740Le4.LIZ(liveRoomStruct), "follow_status");
                    if (liveRoomStruct.hasCommerceGoods) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJIIIZ("is_ecom", str2);
                    c188727au.LIZLLL(c86343Xud.LJI, "room_position");
                    c188727au.LIZLLL(0, "is_from_draw_req");
                    c188727au.LJIIIZ("live_type", RoomStruct.getStreamType(liveRoomStruct).logStreamingType);
                    c188727au.LIZLLL(i, "error_code");
                    FMX.LJIIL("livesdk_preview_live_play_fail", c188727au.LIZ);
                }
            }
        }
    }

    public static void LIZJ(C86343Xud c86343Xud, boolean z, boolean z2) {
        long currentTimeMillis;
        String str;
        User user;
        if (c86343Xud != null && c86343Xud.LIZIZ != null) {
            if (z && z2) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - c86343Xud.LJIIIIZZ.LJLILLLLZI;
            }
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            C188727au LJ = C169696lJ.LJ(currentTimeMillis, "watch_duration");
            LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
            Long l = null;
            if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            LJ.LJIIIZ("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = c86343Xud.LIZIZ;
            if (liveRoomStruct2 != null) {
                l = Long.valueOf(liveRoomStruct2.id);
            }
            LJ.LJFF(l, "room_id");
            LJ.LJIIIZ("user_id", currentUserID);
            FMX.LJIIL("livesdk_live_game_watch_duration", LJ.LIZ);
        }
    }

    public static void LJ(C86343Xud c86343Xud, String reason, boolean z) {
        String str;
        Long l;
        String str2;
        String str3;
        User user;
        User user2;
        o.LJIIIZ(reason, "reason");
        if (((Boolean) LIZ.getValue()).booleanValue() && c86343Xud != null && !c86343Xud.LJ) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", c86343Xud.LIZJ);
            c188727au.LJIIIZ("action_type", "click");
            LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
            Integer num = null;
            if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = c86343Xud.LIZIZ;
            if (liveRoomStruct2 != null) {
                l = Long.valueOf(liveRoomStruct2.id);
            } else {
                l = null;
            }
            c188727au.LJFF(l, "room_id");
            Aweme aweme = c86343Xud.LIZ;
            if (aweme != null) {
                str2 = aweme.getRequestId();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("request_id", str2);
            c188727au.LJIIIZ("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct3 = c86343Xud.LIZIZ;
            if (liveRoomStruct3 != null && (user = liveRoomStruct3.owner) != null) {
                num = Integer.valueOf(user.getFollowStatus());
            }
            c188727au.LJFF(num, "follow_status");
            c188727au.LIZLLL(c86343Xud.LJI, "room_position");
            long currentTimeMillis = System.currentTimeMillis();
            C86345Xuf c86345Xuf = c86343Xud.LJIIIIZZ;
            c188727au.LJ((currentTimeMillis - c86345Xuf.LJLIL) + c86345Xuf.LJLJI, "watch_live_duration");
            c188727au.LJIIIZ("show_reason", reason);
            c188727au.LJIIIZ("live_play_session_id", c86343Xud.LJJIII);
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("back_from_background", str3);
            FMX.LJIIL("livesdk_finish_card_show", c188727au.LIZ);
        }
    }
}
