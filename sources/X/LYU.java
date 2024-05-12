package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LYU {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJJI;
    public static long LJIIL;
    public static String LJI = "";
    public static String LJIIJ = "";
    public static List<FollowingInterestUser> LJIILIIL = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            r0 = 1
            X.LYU.LJ = r0
            boolean r8 = LJIIIIZZ()
            X.OWs r2 = X.C0F0.LIZIZ()
            java.lang.String r1 = "live_following_window_auto_refresh_enabled"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r2.LIZJ(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 0
            r6 = 0
            if (r0 != 0) goto L37
        L1e:
            r1 = 0
        L1f:
            if (r8 == 0) goto L29
            com.ss.android.ugc.aweme.feed.model.AutoRefreshFollowFeedLiveEvent r0 = new com.ss.android.ugc.aweme.feed.model.AutoRefreshFollowFeedLiveEvent
            r0.<init>(r8, r1)
            X.C2U8.LIZ(r0)
        L29:
            boolean r0 = X.LYU.LJIIIIZZ
            if (r0 == 0) goto L30
            LJIIJJI()
        L30:
            X.LYU.LIZ = r6
            X.LYU.LIZIZ = r6
            X.LYU.LJIIJJI = r5
            return
        L37:
            long r1 = X.LYU.LIZJ
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L3e
            goto L1e
        L3e:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.LYU.LIZLLL
            long r3 = r3 - r0
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            goto L1e
        L4c:
            boolean r1 = LJIIIIZZ()
            if (r1 == 0) goto L1f
            com.ss.android.ugc.aweme.feed.model.AutoRefreshFollowFeedLiveEvent r0 = new com.ss.android.ugc.aweme.feed.model.AutoRefreshFollowFeedLiveEvent
            r0.<init>(r5, r1)
            X.C2U8.LIZ(r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYU.LIZ():void");
    }

    public static void LJIIJJI() {
        String str;
        if (!LJII) {
            return;
        }
        LiveOuterService.LJJJLL().LJJJJIZL();
        if (!C62046OWs.LIZIZ("livesdk_enter_message_window")) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("request_id", LJIIJ);
        if (LJIIIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_draw", str);
        FMX.LJIIL("livesdk_enter_message_window", c188727au.LIZ);
    }

    public static void LIZIZ() {
        LIZ = System.currentTimeMillis();
    }

    public static boolean LIZJ() {
        Object LIZJ2 = C0F0.LIZIZ().LIZJ(Boolean.FALSE, "live_following_window_big_avatar");
        o.LJIIIIZZ(LIZJ2, "get().getService(\n      …          false\n        )");
        return ((Boolean) LIZJ2).booleanValue();
    }

    public static void LIZLLL() {
        Object LIZJ2 = C0F0.LIZIZ().LIZJ(Boolean.FALSE, "live_following_window_inner_outer_same_flow");
        o.LJIIIIZZ(LIZJ2, "get().getService(\n      …          false\n        )");
        ((Boolean) LIZJ2).booleanValue();
    }

    public static boolean LJ() {
        Object LIZJ2 = C0F0.LIZIZ().LIZJ(Boolean.FALSE, "live_following_window_long_username");
        o.LJIIIIZZ(LIZJ2, "get().getService(\n      …          false\n        )");
        return ((Boolean) LIZJ2).booleanValue();
    }

    public static boolean LJFF() {
        Object LIZJ2 = C0F0.LIZIZ().LIZJ(Boolean.FALSE, "live_following_window_regular_username");
        o.LJIIIIZZ(LIZJ2, "get().getService(\n      …          false\n        )");
        return ((Boolean) LIZJ2).booleanValue();
    }

    public static boolean LJIIIIZZ() {
        if (!((Boolean) C0F0.LIZIZ().LIZJ(Boolean.TRUE, "live_following_window_auto_open_enabled")).booleanValue() || LIZJ <= 0) {
            return false;
        }
        if (LIZ > 0 && System.currentTimeMillis() - LIZ >= 6000) {
            LJI = "back_auto";
            LIZ = 0L;
            return true;
        }
        Integer exitExpandDuration = (Integer) C0F0.LIZIZ().LIZJ(-1, "live_following_window_exit_expand_duration");
        o.LJIIIIZZ(exitExpandDuration, "exitExpandDuration");
        if (exitExpandDuration.intValue() > 0 && LIZIZ > 0 && System.currentTimeMillis() - LIZIZ >= exitExpandDuration.intValue() * 1000) {
            LJI = "time_auto";
            return true;
        }
        if (LJFF) {
            LJI = "unread";
        } else if (!LJIIJJI) {
            return false;
        }
        return true;
    }

    public static void LJIIJ() {
        LiveOuterService.LJJJLL().LJJJJIZL();
        if (!C62046OWs.LIZIZ("livesdk_draw_message_window")) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("request_id", LJIIJ);
        FMX.LJIIL("livesdk_draw_message_window", c188727au.LIZ);
    }

    public static Rect LJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        Rect rect = new Rect();
        int[] LJJLJ = ORY.LJJLJ(new Integer[]{0, 0});
        itemView.getLocationOnScreen(LJJLJ);
        int i = LJJLJ[0];
        rect.left = i;
        int i2 = LJJLJ[1];
        rect.top = i2;
        rect.right = i + i;
        rect.bottom = i2 + i2;
        return rect;
    }

    public static boolean LJII(TuxTextView tvName) {
        o.LJIIIZ(tvName, "tvName");
        int right = ((tvName.getRight() - tvName.getLeft()) - tvName.getCompoundPaddingLeft()) - tvName.getCompoundPaddingRight();
        float measureText = tvName.getPaint().measureText(tvName.getText().toString());
        if (right > 0 && measureText >= right) {
            return true;
        }
        return false;
    }

    public static SlimRoom LJIIIZ(FollowingInterestUser followingInterestUser) {
        String str;
        User user;
        SlimRoom slimRoom = null;
        if (followingInterestUser != null) {
            if (followingInterestUser.getSlimRoom() != null) {
                if (followingInterestUser == null) {
                    return null;
                }
                return followingInterestUser.getSlimRoom();
            }
            if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
                str = user.roomData;
                if (TextUtils.isEmpty(str) && followingInterestUser != null) {
                    try {
                        followingInterestUser.setSlimRoom((SlimRoom) C75792yF.LIZ(str, SlimRoom.class));
                        slimRoom = followingInterestUser.getSlimRoom();
                        return slimRoom;
                    } catch (Exception unused) {
                        return slimRoom;
                    }
                }
            }
        }
        str = null;
        return TextUtils.isEmpty(str) ? null : null;
    }

    public static void LJIIL(Context context, List list) {
        long j;
        List<String> arrayList;
        int i;
        String LIZIZ2;
        String url;
        SlimRoom.LinkMic linkMic;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user;
        SlimRoom.LinkMic linkMic2;
        List<com.bytedance.android.live.base.model.user.User> list3;
        Long LJJIZ;
        LJIILIIL = list;
        LiveOuterService.LJJJLL().LJIIJJI();
        C55661Lsv c55661Lsv = C55661Lsv.LIZ;
        ArrayList arrayList2 = new ArrayList();
        int min = Math.min(list.size(), 4);
        Gson LIZIZ3 = C75792yF.LIZIZ();
        for (int i2 = 0; i2 < min; i2++) {
            FollowingInterestUser followingInterestUser = (FollowingInterestUser) ListProtector.get(list, i2);
            long j2 = followingInterestUser.getUser().roomId;
            C55661Lsv.LJIILLIIL(i2, j2, GsonProtectorUtils.toJson(LIZIZ3, followingInterestUser));
            String uid = followingInterestUser.getUser().getUid();
            if (uid != null && (LJJIZ = C38350F3i.LJJIZ(uid)) != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            UrlModel avatarThumb = followingInterestUser.getUser().getAvatarThumb();
            if (avatarThumb == null || (arrayList = avatarThumb.getUrlList()) == null) {
                arrayList = new ArrayList<>();
            }
            SlimRoom LJIIIZ2 = LJIIIZ(followingInterestUser);
            if (LJIIIZ2 != null && (linkMic2 = LJIIIZ2.getLinkMic()) != null && (list3 = linkMic2.followedList) != null) {
                i = list3.size();
            } else {
                i = 0;
            }
            if (i >= 2) {
                if (LJIIIZ2 == null || (linkMic = LJIIIZ2.getLinkMic()) == null || (list2 = linkMic.followedList) == null || (user = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) == null) {
                    LIZIZ2 = "";
                } else {
                    LIZIZ2 = C56331M8x.LIZJ(user.getUsername(), user.getNickName(), false, true);
                }
            } else {
                LIZIZ2 = C56331M8x.LIZIZ(followingInterestUser.getUser(), false, true);
            }
            String signature = followingInterestUser.getUser().getSignature();
            if (signature == null) {
                signature = "";
            }
            Iterator<String> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    url = "";
                    break;
                }
                url = it.next();
                if (!TextUtils.isEmpty(url)) {
                    o.LJIIIIZZ(url, "url");
                    break;
                }
            }
            arrayList2.add(new C55906Lws(j2, j, url, LIZIZ2, signature));
        }
        c55661Lsv.LJIJ(min, context, arrayList2);
    }

    public static void LJIILIIL(Context context, List list) {
        boolean z;
        LiveOuterService.LJJJLL().LJIIJJI();
        if (C30746C4w.LIZ()) {
            z = C55661Lsv.LJIIL(context);
        } else {
            z = true;
        }
        if (!C55661Lsv.LJIIIIZZ() || !z) {
            return;
        }
        LJIIL(context, list);
        if (list.size() <= 0 || !C55661Lsv.LJIIIZ()) {
            return;
        }
        ListProtector.add(list, 0, new FollowingInterestUser(new User(), false, null, 0, 8, null));
    }

    public static void LJIILJJIL(Context context, FollowingInterestUser followingInterestUser, List list, int i, View view, int i2) {
        LJIILL(context, followingInterestUser, list, i, view, i2, "homepage_follow", "live_cover");
    }

    public static void LJIILL(Context context, FollowingInterestUser followingInterestUser, List list, int i, View view, int i2, String str, String str2) {
        User user;
        String str3;
        o.LJIIIZ(context, "context");
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            long j = user.roomId;
            String str4 = followingInterestUser.getUser().roomData;
            if (str4 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((FollowingInterestUser) it.next()).getUser().roomId));
                }
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            if (view != null) {
                enterRoomConfig.mRoomsData.enterSourcePosition = LJI(view);
            }
            enterRoomConfig.mRoomsData.roomIds = ORZ.LLJIJIL(arrayList);
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterMethod = str2;
            roomsData.anchorRelationType = followingInterestUser.getInterestUserType();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.isFromList = i2;
            String uid = followingInterestUser.getUser().getUid();
            if (uid == null) {
                uid = CardStruct.IStatusCode.DEFAULT;
            }
            logData.anchorId = uid;
            enterRoomConfig.mRoomsData.enterType = "click";
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            LogPbBean logPbBean = followingInterestUser.getLogPbBean();
            if (logPbBean != null) {
                str3 = logPbBean.getImprId();
            } else {
                str3 = null;
            }
            logData2.requestId = String.valueOf(str3);
            User user2 = followingInterestUser.getUser();
            UrlModel urlModel = user2.roomCover;
            if (urlModel != null && !C32151Nz.LJJIIJZLJL(urlModel.getUrlList())) {
                enterRoomConfig.mRoomsData.bgUrls = (ArrayList) followingInterestUser.getUser().roomCover.getUrlList();
            } else if (user2.getAvatarThumb() != null && !C32151Nz.LJJIIJZLJL(user2.getAvatarThumb().getUrlList())) {
                enterRoomConfig.mRoomsData.bgUrls = (ArrayList) followingInterestUser.getUser().getAvatarThumb().getUrlList();
            }
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.roomId = j;
            roomsData2.enterFromMerge = str;
            roomsData2.roomIds = ORZ.LLJIJIL(arrayList);
            enterRoomConfig.mLogData.positionOutsideLiveRoom = i;
            int followStatus = followingInterestUser.getUser().getFollowStatus();
            int followerStatus = followingInterestUser.getUser().getFollowerStatus();
            if (followStatus != 2 && followStatus != 3) {
                if (followStatus == 1) {
                    if (followerStatus == 1) {
                        enterRoomConfig.mRoomsData.followStatus = "2";
                    } else {
                        enterRoomConfig.mRoomsData.followStatus = "1";
                    }
                } else if (followerStatus == 1) {
                    enterRoomConfig.mRoomsData.followStatus = "3";
                } else {
                    enterRoomConfig.mRoomsData.followStatus = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                enterRoomConfig.mRoomsData.followStatus = String.valueOf(followStatus);
            }
            if (o.LJ("follow_widget", str)) {
                LiveOuterService.LJJJLL().LJIIJJI();
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData3.widgetType = C55902Lwo.LIZLLL;
                roomsData3.widgetAnchorNum = C55902Lwo.LIZLLL();
                enterRoomConfig.mRoomsData.anchorPosition = C55902Lwo.LJ;
            }
            if (C30746C4w.LIZ()) {
                C30746C4w.LIZJ(followingInterestUser.getSlimRoom(), enterRoomConfig);
            }
            LiveOuterService.LJJJLL().LJIILL().LJIILL(context, enterRoomConfig, str4);
        }
    }
}
