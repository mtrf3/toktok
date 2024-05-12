package X;

import Y.AfS0S2400100_5;
import Y.AfS2S2200000_5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceAfterEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Uqn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78461Uqn {
    public static final C78469Uqv LIZJ = new C78469Uqv();
    public static boolean LIZLLL;
    public final HashMap<String, OSZ<List<EnterRoomConfig>, InterfaceC54958Lha>> LIZ = new HashMap<>();
    public WeakReference<NK9> LIZIZ;

    public final DialogFragment LJ() {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).f20();
    }

    public static boolean LJIIIIZZ() {
        Integer num;
        if (Live.getService() != null && ((num = (Integer) Live.getService().LJIIIZ(0, "live_mt_remove_traffic_dialog")) == null || num.intValue() != 0)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ() {
        Integer num;
        if (Live.getService() == null || (num = (Integer) Live.getService().LJIIIZ(0, "live_opt_enter_room_success")) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(User user) {
        if (user == null || user.isBlock()) {
            return false;
        }
        if (AV1.LJIIZILJ(user, false) && user.getFollowStatus() != 2 && user.getFollowStatus() != 1) {
            HG3.LJIIL();
            if (!o.LJ(HG3.LJLJL.LJFF().getCurUserId(), user.getUid())) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJI(Context context) {
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (LIZ.isDeepLinkHandlerActivity(context) || LIZ.LIZLLL(context)) {
            return true;
        }
        return false;
    }

    public final C78458Uqk LJFF(String listProviderTag) {
        InterfaceC54958Lha interfaceC54958Lha;
        o.LJIIIZ(listProviderTag, "listProviderTag");
        C78458Uqk c78458Uqk = C78459Uql.LIZ;
        HashMap<String, OSZ<List<EnterRoomConfig>, InterfaceC54958Lha>> componentPairMap = this.LIZ;
        c78458Uqk.getClass();
        o.LJIIIZ(componentPairMap, "componentPairMap");
        OSZ<List<EnterRoomConfig>, InterfaceC54958Lha> osz = componentPairMap.get(listProviderTag);
        List<EnterRoomConfig> list = null;
        if (osz != null) {
            interfaceC54958Lha = osz.getSecond();
        } else {
            interfaceC54958Lha = null;
        }
        c78458Uqk.LIZIZ = interfaceC54958Lha;
        OSZ<List<EnterRoomConfig>, InterfaceC54958Lha> osz2 = componentPairMap.get(listProviderTag);
        if (osz2 != null) {
            list = osz2.getFirst();
        }
        c78458Uqk.LIZ = list;
        return c78458Uqk;
    }

    public static void LJII(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from_merge", str);
            jSONObject.put("enter_method", str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJIIJJI("ttlive_enter_room_live_entrance", 0, jSONObject);
    }

    public final void LJIILJJIL(Context context, EnterRoomConfig enterRoomConfig) {
        LJIJ(context, "", enterRoomConfig, null, null);
    }

    public static final void LIZIZ(Context context, EnterRoomConfig enterRoomConfig, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterRoomConfig, "enterRoomConfig");
        if (Live.getService() == null) {
            return;
        }
        if (!CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            C30326BvG.LIZ.post(RunnableC78467Uqt.LJLIL, null);
        }
        HashMap LIZ = C45243HpH.LIZ("intercept", "new_style", "live.intent.extra.FROM_NEW_STYLE_SOURCE", str);
        LIZ.put("toplive_position", enterRoomConfig.mLogData.toplivePosition);
        C78847Ux1.LJJJJI(enterRoomConfig, LIZ);
        enterRoomConfig.mRoomsData.fromDrawerStyle = str;
        enterRoomConfig.mLogData.positionOutsideLiveRoom = 0;
        EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
        B57.LIZ.LIZJ(enterRoomLinkSession);
        enterRoomLinkSession.LIZIZ(new Event("ttlive_enter_live_converge_start", 3329, EnumC28203B5b.BussinessApiCall));
        if (enterRoomConfig.mRoomsData.fromNewStyle && Live.getService() != null && Live.getService().LJJJJL() != null) {
            ((C28679BNj) Live.getService().LJJJJL()).LIZ(LIZ);
        }
    }

    public final void LJIILL(Context context, EnterRoomConfig enterRoomConfig, String str) {
        o.LJIIIZ(enterRoomConfig, "enterRoomConfig");
        LJIJ(context, str, enterRoomConfig, null, null);
    }

    public final void LJIILLIIL(Context context, NewLiveRoomStruct newLiveRoomStruct, EnterRoomConfig enterRoomConfig) {
        boolean z;
        if (newLiveRoomStruct != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            long j = newLiveRoomStruct.id;
            roomsData.roomId = j;
            enterRoomConfig.mStreamData.streamRoomId = j;
            if (newLiveRoomStruct.multiStreamScene == 1) {
                z = true;
            } else {
                z = false;
            }
            LiveStreamUrlExtra.SrConfig srConfig = null;
            if (z && newLiveRoomStruct.getLiveStudioExtraStreamData() != null && newLiveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() != null && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
                String liveStudioExtraStreamData = newLiveRoomStruct.getLiveStudioExtraStreamData();
                String liveStudioExtraStreamDefaultQualitySdkKey = newLiveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey();
                int ordinal = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
                LiveStreamUrlExtra liveStudioStreamUrlExtra = newLiveRoomStruct.getLiveStudioStreamUrlExtra();
                if (liveStudioStreamUrlExtra != null) {
                    srConfig = liveStudioStreamUrlExtra.getSrConfig();
                }
                C78857UxB.LJIILIIL(enterRoomConfig, liveStudioExtraStreamData, liveStudioExtraStreamDefaultQualitySdkKey, ordinal, srConfig, newLiveRoomStruct.getOptions());
            } else {
                String multiStreamData = newLiveRoomStruct.getMultiStreamData();
                String multiStreamDefaultQualitySdkKey = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
                int ordinal2 = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
                LiveStreamUrlExtra streamUrlExtra = newLiveRoomStruct.getStreamUrlExtra();
                if (streamUrlExtra != null) {
                    srConfig = streamUrlExtra.getSrConfig();
                }
                C78857UxB.LJIILIIL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, ordinal2, srConfig, newLiveRoomStruct.getOptions());
            }
        }
        LJIJ(context, "", enterRoomConfig, null, null);
    }

    public final void LJIIZILJ(Context context, User user, EnterRoomConfig enterRoomConfig) {
        long j;
        if (context == null || user == null || enterRoomConfig == null) {
            return;
        }
        String str = enterRoomConfig.mLogData.requestId;
        if (str == null || str.length() == 0) {
            enterRoomConfig.mLogData.requestId = user.getRequestId();
        }
        enterRoomConfig.mRoomsData.followStatus = String.valueOf(C54740Le4.LIZIZ(user));
        String str2 = user.roomData;
        long j2 = user.roomId;
        if (TextUtils.isEmpty(enterRoomConfig.mLogData.anchorId)) {
            enterRoomConfig.mLogData.anchorId = user.getUid();
        }
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.secUid)) {
            enterRoomConfig.mRoomsData.secUid = user.getSecUid();
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j2;
        EnterRoomConfig.GuestUser guestUser = roomsData.guestUser;
        if (guestUser != null && guestUser.uid == 0) {
            try {
                String uid = user.getUid();
                if (uid != null) {
                    j = CastLongProtector.parseLong(uid);
                } else {
                    j = -1;
                }
                guestUser.uid = j;
            } catch (NumberFormatException unused) {
                EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.mRoomsData.guestUser;
                if (guestUser2 != null) {
                    guestUser2.uid = -1L;
                }
            }
            EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.mRoomsData.guestUser;
            if (guestUser3 != null) {
                guestUser3.nickName = user.getUniqueId();
            }
        }
        LJIILL(context, enterRoomConfig, str2);
    }

    public final void LJIIJ(Boolean bool, Integer num, String str, List list) {
        NK9 nk9;
        bool.booleanValue();
        int intValue = num.intValue();
        WeakReference<NK9> weakReference = this.LIZIZ;
        if (weakReference != null && (nk9 = weakReference.get()) != null) {
            nk9.LIZ(intValue, str, list);
        }
    }

    public final void LJIIL(Context context, User user, boolean z, SlimRoom slimRoom) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(user, "user");
        if (!LIZ(user)) {
            C05L.LIZLLL(context, R.string.paq);
            return;
        }
        String requestId = user.getRequestId();
        String uid = user.getUid();
        long j = user.roomId;
        if (!z) {
            str = "others_homepage";
        } else {
            str = "homepage";
        }
        C78688UuS.LJJJJLL(1, uid, j, C78688UuS.LJJIJIL(str, "head", requestId));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "others_homepage";
        roomsData.enterMethod = "others_photo";
        if (slimRoom != null && C30746C4w.LIZ()) {
            C30746C4w.LIZJ(slimRoom, enterRoomConfig);
        }
        LJIIZILJ(context, user, enterRoomConfig);
    }

    public final void LJIJJ(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle) {
        List<String> urlList;
        o.LJIIIZ(context, "context");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "chat";
        roomsData.enterMethod = "live_cover";
        ArrayList<String> arrayList = null;
        enterRoomConfig.mLogData.share_from = bundle.getString("share_user_id", null);
        int followStatus = user.getFollowStatus();
        if (followStatus != 0 && followStatus != 1 && followStatus != 2) {
            enterRoomConfig.mRoomsData.followStatus = "3";
        } else {
            enterRoomConfig.mRoomsData.followStatus = String.valueOf(followStatus);
        }
        enterRoomConfig.mRoomsData.shareFromUserId = bundle.getString("share_user_id", null);
        enterRoomConfig.mLogData.sharedPlatform = "chat_merge";
        enterRoomConfig.mRoomsData.shareIntent = bundle.getString("share_live_intent", null);
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.shareSource = "private_message_share_source";
        if (newLiveRoomStruct != null) {
            roomsData2.userId = user.getUid();
            enterRoomConfig.mRoomsData.secUid = user.getSecUid();
            enterRoomConfig.mLogData.anchorId = user.getUid();
            enterRoomConfig.mStreamData.isWithPush = true;
            UrlModel urlModel = newLiveRoomStruct.roomCover;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                if (urlList instanceof ArrayList) {
                    arrayList = (ArrayList) urlList;
                }
                roomsData3.bgUrls = arrayList;
            }
            LJIILLIIL(context, newLiveRoomStruct, enterRoomConfig);
            return;
        }
        LJIIZILJ(context, user, enterRoomConfig);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x000d, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(android.content.Context r12, java.lang.String r13, com.bytedance.android.livesdkapi.session.EnterRoomConfig r14, java.util.List<java.lang.Long> r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78461Uqn.LJIJ(android.content.Context, java.lang.String, com.bytedance.android.livesdkapi.session.EnterRoomConfig, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0046, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r18, com.bytedance.android.livesdkapi.session.EnterRoomConfig r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r21, X.InterfaceC54958Lha r22, X.InterfaceC78468Uqu r23) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78461Uqn.LIZJ(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig, com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, X.Lha, X.Uqu):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x006b, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r13, com.bytedance.android.livesdkapi.session.EnterRoomConfig r14, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r15, java.util.List<com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct> r16, X.InterfaceC54958Lha r17, X.InterfaceC78468Uqu r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78461Uqn.LIZLLL(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, java.util.List, X.Lha, X.Uqu):void");
    }

    public final void LJIIJJI(Context context, EnterRoomConfig enterRoomConfig, User user, long[] jArr, long j, int i) {
        o.LJIIIZ(context, "context");
        if (LIZLLL) {
            return;
        }
        if (!LIZ(user)) {
            Z8A.LIZIZ.requestUser(user.getUid(), user.getSecUid(), new C78462Uqo(this, context, enterRoomConfig, jArr, i, user));
            LIZLLL = true;
            return;
        }
        if (!CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            C30326BvG.LIZ.post(RunnableC78466Uqs.LJLIL, null);
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomIds = jArr;
        roomsData.enterFromMerge = "message";
        roomsData.enterMethod = "live_cell";
        enterRoomConfig.mLogData.anchorId = String.valueOf(j);
        enterRoomConfig.mLogData.positionOutsideLiveRoom = i;
        LJIIZILJ(context, user, enterRoomConfig);
    }

    public final void LJIILIIL(Context context, long j, EnterRoomConfig enterRoomConfig, String enterFrom, ArrayList<Long> arrayList, String roomInfoList) {
        o.LJIIIZ(enterRoomConfig, "enterRoomConfig");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(roomInfoList, "roomInfoList");
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        roomsData.enterFromMerge = enterFrom;
        LJIJ(context, "", enterRoomConfig, arrayList, roomInfoList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Object] */
    public final void LJIJI(Context context, java.util.Map map, String str, List list, int i, NK7 nk7) {
        boolean z;
        this.LIZIZ = new WeakReference<>(nk7);
        long currentTimeMillis = System.currentTimeMillis();
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        java.util.Map<String, Object> map2 = null;
        if (z) {
            ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class);
            if (iLiveFeedApiService != null) {
                map2 = iLiveFeedApiService.G1(-1L);
            }
            LJIILJJIL(context, C78469Uqv.LIZLLL(-3L, str, "live_bottom_bar"));
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = "";
            if (map2 != null && (map2.get("feed_url") instanceof String)) {
                ?? r1 = map2.get("feed_url");
                o.LJII(r1, "null cannot be cast to non-null type kotlin.String");
                c68322mC.element = r1;
            }
            ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).uv(str, (String) c68322mC.element, map).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S2400100_5(str, this, context, c68322mC, currentTimeMillis, map, 0), new AfS2S2200000_5(str, this, context, 2));
            return;
        }
        if (list.isEmpty() || i < 0 || i >= list.size() - 1) {
            return;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mRoomsData.roomId = ((Number) ListProtector.get(list, i)).longValue();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterMethod = "live_bottom_bar";
        roomsData.enterFromMerge = str;
        roomsData.gameLiveExtra = map;
        roomsData.roomIds = new long[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long[] jArr = enterRoomConfig.mRoomsData.roomIds;
            if (jArr != null) {
                jArr[i2] = ((Number) ListProtector.get(list, i2)).longValue();
            }
        }
        enterRoomConfig.mRoomsData.position = i;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (roomsData2 != null) {
            roomsData2.enterRoomScene = "outside_normal_click";
        }
        if (enterRoomConfig == null) {
            return;
        }
        LJIILJJIL(context, enterRoomConfig);
    }
}
