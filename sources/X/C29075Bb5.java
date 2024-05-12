package X;

import Y.AfS54S0200000_5;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ShareSuccessEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Bb5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29075Bb5 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString(((IHostShare) CN1.LIZ(IHostShare.class)).getBundleKey(3));
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "top_supporters")) {
            return "top_supporters";
        }
        if (TextUtils.equals(str, "recently_shared")) {
            return "recently_shared";
        }
        return LiveGiftNewGifterBadgeSetting.DEFAULT;
    }

    public static final String LIZIZ(User user) {
        String str;
        if (user == null) {
            return "";
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            str = "h5_m";
        } else {
            str = "h5_t";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("www.tiktok.com/@");
        LIZ2.append(C05170If.LJ(user));
        LIZ2.append("/live?source=");
        LIZ2.append(str);
        LIZ2.append("&_r=1");
        return X1D.LIZIZ(LIZ2);
    }

    public static final void LJ(Room room, DataChannel dataChannel, String platform) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(platform, "platform");
        dataChannel.pv0(ShareSuccessEvent.class);
        if (C28835BTj.LJFF(dataChannel) && room.author() != null && !TextUtils.equals(platform, "chat_merge")) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(room.author().getId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
            C28835BTj.LIZ("live_ad", "live_share", null, hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        if (r0.isAdmin == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C29929Bor LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.Room r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            java.lang.String r0 = "room"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "dataChannel"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.B83 r0 = X.B83.LIZ()
            X.BgP r1 = r0.LIZIZ()
            X.Bor r3 = new X.Bor
            r3.<init>(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L1f
            r3.LJIIJ = r6
        L1f:
            X.Bfu r1 = (X.C29374Bfu) r1
            long r0 = r1.getCurrentUserId()
            r3.LIZLLL = r0
            r4.getId()
            r4.getOwnerUserId()
            java.lang.String r0 = X.BJM.LJIILIIL()
            r3.LJIIZILJ = r0
            java.lang.String r0 = X.BJM.LJFF()
            r3.LJJ = r0
            java.lang.String r0 = X.BJM.LJIIIIZZ()
            r3.LJJI = r0
            java.lang.String r0 = "live_detail"
            r3.LJJJJJL = r0
            r3.LJJIFFI = r7
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomUserChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomUserChannel.class
            java.lang.Object r0 = r5.kv0(r0)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L8c
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            if (r0 == 0) goto L8c
            boolean r0 = r0.isAdmin
            r2 = 1
            if (r0 != r2) goto L8c
        L5a:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r1 = r5.kv0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r1 == 0) goto L87
            java.lang.String r0 = r4.getAnchorShareText()
        L6c:
            r3.LJIIL = r0
            r3.LJIILJJIL = r1
            r3.LJIILL = r2
            X.BtI r0 = X.EnumC30204BtI.SHARE
            boolean r0 = r0.isRedDotShowing(r5)
            r3.LJIILLIIL = r0
            r3.LJIJJLI = r8
            java.lang.Class<X.BCe> r0 = X.C28388BCe.class
            java.lang.Object r0 = r5.kv0(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.LJIJ = r0
            return r3
        L87:
            java.lang.String r0 = r4.getUserShareText()
            goto L6c
        L8c:
            r2 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29075Bb5.LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String, java.util.Map):X.Bor");
    }

    public static final void LJFF(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner, String sharePlatform, String str, Bundle bundle) {
        String string;
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(sharePlatform, "sharePlatform");
        String str2 = "";
        if (bundle != null && (string = bundle.getString("shareIdList", "")) != null) {
            str2 = string;
        }
        ((InterfaceC29856Bng) ((IShareService) CN1.LIZ(IShareService.class)).Ib(str, room.getId(), str2, (String) DataChannelGlobal.LJLJJI.mv0(C29038BaU.class)).LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZJ(new AfS54S0200000_5(room, dataChannel, 64), BTJ.LIZ);
    }

    public static final void LIZJ(Room room, DataChannel dataChannel, String platform, String shareType, Bundle bundle, String requestPage, java.util.Map<String, String> map, C29930Bos shareParams) {
        String str;
        int i;
        int i2;
        Object obj;
        int i3;
        String str2;
        String str3;
        int i4;
        Long l;
        String l2;
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        o.LJIIIZ(requestPage, "requestPage");
        o.LJIIIZ(shareParams, "shareParams");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("share_success");
        LIZ2.append(System.currentTimeMillis());
        String bindId = MD5Utils.getMD5String(X1D.LIZIZ(LIZ2));
        String str4 = "";
        if (bundle == null) {
            str = "";
            i = 0;
            i2 = 0;
        } else {
            str = bundle.getString("shareIdList", "");
            i = bundle.getInt(((IHostShare) CN1.LIZ(IHostShare.class)).getBundleKey(2));
            i2 = bundle.getInt(((IHostShare) CN1.LIZ(IHostShare.class)).getBundleKey(1));
        }
        Object kv0 = dataChannel.kv0(UserIsAnchorChannel.class);
        Boolean bool = Boolean.TRUE;
        boolean LJ = o.LJ(kv0, bool);
        if (C74838TYs.LJ().LJJ > 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        String str5 = "portrait";
        if (LJ) {
            Hashtag hashtag = (Hashtag) dataChannel.kv0(HashtagChangedChannel.class);
            if (hashtag == null || (str3 = hashtag.title) == null) {
                str3 = "";
            }
            Hashtag hashtag2 = (Hashtag) dataChannel.kv0(HashtagChangedChannel.class);
            if (hashtag2 != null && (l = hashtag2.id) != null && (l2 = l.toString()) != null) {
                str4 = l2;
            }
            HashMap hashMap = new HashMap();
            String LIZ3 = LIZ(bundle);
            if (o.LJ(LIZ3, "top_supporters")) {
                hashMap.put("top_supporters_cnt", String.valueOf(Collections.unmodifiableList(shareParams.LJJIJ).size()));
            }
            if (o.LJ(LIZ3, "recently_shared")) {
                hashMap.put("recently_shared_cnt", String.valueOf(Collections.unmodifiableList(shareParams.LJJIJIIJI).size()));
            }
            BZI LIZ4 = C28787BRn.LIZ("share");
            LIZ4.LJIILLIIL(dataChannel);
            LIZ4.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_share"));
            LIZ4.LJIJJ(requestPage, "request_page");
            LIZ4.LJIJJ(Integer.valueOf(i), "is_create_group_chat");
            LIZ4.LJIJJ(Integer.valueOf(i2), "friends_shared_cnt");
            LIZ4.LJIJJ(LIZ3, "batch_share_type");
            LiveMode streamType = room.getStreamType();
            o.LJIIIIZZ(streamType, "room.streamType");
            LIZ4.LJIJJ(C28509BGv.LIZ(streamType), "live_type");
            LIZ4.LJIJJ(platform, "share_platform");
            LIZ4.LJIJJ("anchor", "user_type");
            LIZ4.LJIJJ(bindId, "bind_id");
            if (!C15380j0.LJIILLIIL()) {
                str5 = "landscape";
            }
            LIZ4.LJIJJ(str5, "room_orientation");
            LIZ4.LJIJJ(str3, "hashtag_type");
            LIZ4.LJIJJ(str4, "hash_id");
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            LIZ4.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            LIZ4.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
            LIZ4.LJIJJ("anchor", "initiator");
            Integer num = (Integer) dataChannel.kv0(RoomShareCountChannel.class);
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            LIZ4.LJIJJ(Integer.valueOf(i4), "share_num");
            LIZ4.LJIJJ(obj, "is_guest_connection");
            LIZ4.LJJIFFI(hashMap);
            LIZ4.LJJIIJZLJL();
        } else {
            HashMap LIZ5 = C45243HpH.LIZ("share_platform", platform, "share_type", shareType);
            LIZ5.put("user_type", "user");
            LIZ5.put("request_page", requestPage);
            o.LJIIIIZZ(bindId, "bindId");
            LIZ5.put("bind_id", bindId);
            if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                String LIZLLL = C28594BKc.LIZJ().LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
                LIZ5.put("enter_live_method", LIZLLL);
            }
            if (TextUtils.equals(BJM.LJIIIZ(), "click_push_live_cd_user")) {
                LIZ5.put("is_subscribe", "1");
            } else {
                LIZ5.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            if (C15380j0.LJIILLIIL()) {
                LIZ5.put("room_orientation", "portrait");
            } else {
                LIZ5.put("room_orientation", "landscape");
            }
            if (!o.LJ(dataChannel.kv0(BCW.class), bool)) {
                str5 = "landscape";
            }
            BZI LIZ6 = C28787BRn.LIZ("livesdk_share");
            LIZ6.LJIILLIIL(dataChannel);
            LIZ6.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_share"));
            LIZ6.LJIJJ(Integer.valueOf(i), "is_create_group_chat");
            LIZ6.LJIJJ(Integer.valueOf(i2), "friends_shared_cnt");
            LIZ6.LJIJJ(LIZ(bundle), "batch_share_type");
            LIZ6.LJIJJ(str5, "room_orientation");
            LIZ6.LJJIFFI(BJB.LIZ());
            LIZ6.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())), "server_heat_level");
            LIZ6.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())), "client_heat_level");
            LIZ6.LJJIFFI(map);
            LIZ6.LJJIFFI(LIZ5);
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper2 = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            LIZ6.LJIJJ(iLiveHostCrossRoomEventHelper2.getFromRequestId(), "cohost_from_request_id");
            LIZ6.LJIJJ(iLiveHostCrossRoomEventHelper2.getFromRoomId(), "cohost_from_room_id");
            Integer num2 = (Integer) dataChannel.kv0(RoomShareCountChannel.class);
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = 0;
            }
            LIZ6.LJIJJ(Integer.valueOf(i3), "share_num");
            LIZ6.LJIJJ(obj, "is_guest_connection");
            LIZ6.LJJIIJZLJL();
        }
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("share_info")) {
            BZI LIZ7 = C28787BRn.LIZ("share_info");
            LIZ7.LJIJJ(bindId, "bind_id");
            LIZ7.LJIJJ(str, "to_user_id");
            LIZ7.LJJIIJZLJL();
        }
        if (!LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_like_tap_count")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", shareType);
            jSONObject.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            jSONObject.put("room_id", Long.valueOf(room.getId()));
            LiveMode streamType2 = room.getStreamType();
            if (streamType2 != null) {
                str2 = streamType2.logStreamingType;
            } else {
                str2 = null;
            }
            jSONObject.put("room_type", str2);
        } catch (JSONException unused) {
        }
        C0K2.LIZLLL("ttlive_like_tap_count", new JSONObject(), null, jSONObject);
    }
}
