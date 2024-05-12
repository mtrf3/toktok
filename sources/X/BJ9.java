package X;

import Y.ARunnableS41S0100000_5;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BJ9 implements BJD {
    public volatile boolean LIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final Handler LJFF;
    public final String LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final EnterRoomConfig LJIIJ;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public String LJJIII;
    public final String LJJIIJ;
    public final String LJJIIJZLJL;
    public long LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public DataChannel LJJIJIIJI;
    public String LJJIJLIJ;
    public String LJJIL;
    public long LJJIZ;
    public long LJJJIL;
    public long LJJJJ;
    public long LJJJJI;
    public long LJJJJIZL;
    public long LJJJJJ;
    public long LJJJJJL;
    public long LJJJJL;
    public long LJJJJLI;
    public long LJJJJLL;
    public long LJJJJZ;
    public long LJJJJZI;
    public long LJJJLIIL;
    public long LJJJLL;
    public volatile boolean LIZIZ = true;
    public final ARunnableS41S0100000_5 LJ = new ARunnableS41S0100000_5(this, 233);
    public long LJIIJJI = 0;
    public volatile boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public long LJIILLIIL = -1;
    public boolean LJIIZILJ = false;
    public long LJIJ = -1;
    public long LJIJI = -1;
    public long LJIJJ = 0;
    public long LJIJJLI = 0;
    public long LJIL = 0;
    public boolean LJJ = false;
    public long LJJI = -1;
    public long LJJIFFI = 0;
    public String LJJII = "click";
    public long LJJIJIIJIL = -1;
    public boolean LJJIJIL = false;
    public boolean LJJIJL = false;
    public final ArrayList<B7G> LJJJ = new ArrayList<>();
    public final boolean LJJJI = B4T.LIZ().LIZIZ();
    public final C28230B6c LJJJLZIJ = new C28230B6c(this);
    public final C28231B6d LJJJZ = new C28231B6d(this);

    public final void LIZJ() {
        ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).jp0(this.LJIIJJI, this.LJJJLZIJ);
        ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).uG(this.LJIIJJI, this.LJJJZ);
        this.LJJJIL = 0L;
        this.LJJJJ = 0L;
        this.LJJJJI = 0L;
        this.LJJJJIZL = 0L;
        this.LJJJJJ = 0L;
        this.LJJJJJL = 0L;
        this.LJJJJL = 0L;
        this.LJJJJLI = 0L;
        this.LJJJJLL = 0L;
        this.LJJJJZ = 0L;
        this.LJJJJZI = 0L;
        this.LJJJLIIL = 0L;
    }

    public final void LJIIJJI() {
        if (this.LJJIJIIJI == null || this.LJIIZILJ || this.LJIJ == -1) {
            return;
        }
        HashMap hashMap = new HashMap();
        EnterRoomConfig enterRoomConfig = this.LJIIJ;
        if (enterRoomConfig != null) {
            hashMap.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
            hashMap.put("action_type", this.LJIIJ.mRoomsData.actionType);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_room_type_duration");
        LIZ.LJJIFFI(hashMap);
        I9A.LIZ(System.currentTimeMillis() - this.LJIJ, this.LJIJJ, LIZ, "duration");
        this.LJIJJ = 0L;
        this.LJIJJLI = 0L;
        OSZ osz = (OSZ) this.LJJIJIIJI.kv0(BCJ.class);
        if (this.LJJIJIIJI != null && osz != null) {
            LIZ.LJIJJ(((IDefinitionService) CN1.LIZ(IDefinitionService.class)).kh0(((Integer) osz.getSecond()).intValue(), ((Integer) osz.getFirst()).intValue()), "rotate_type");
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIILLIIL(this.LJJIJIIJI);
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJI();
            BJM bjm = BJM.LJLIL;
            LIZ.LJIJJ(BJM.LJIILL(), "room_orientation");
            LIZ.LJIJJ(bjm.LIZJ(), "live_type");
            LIZ.LJJIIZI();
        }
        this.LJIIZILJ = true;
    }

    public final long LIZLLL() {
        return (SystemClock.elapsedRealtime() - this.LJIILLIIL) - this.LJJIFFI;
    }

    public final void LJIILJJIL() {
        LIZJ();
        this.LJJIIZI = null;
        this.LJIIJ.mLogData.loadDuration = 0L;
        this.LJIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LJIILLIIL = -1L;
        this.LJIJ = -1L;
        this.LJIJI = -1L;
        this.LJIIZILJ = false;
        this.LJIJJ = 0L;
        this.LJIJJLI = 0L;
        this.LJIL = 0L;
        this.LJJ = false;
        this.LJJI = -1L;
        this.LJJIFFI = 0L;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIJL = false;
        this.LJJIJIL = false;
        this.LJIILIIL = false;
        this.LJJIJIIJI = null;
        this.LIZJ = false;
        this.LIZLLL = false;
        Handler handler = this.LJFF;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJJJ.clear();
    }

    public static void LJ(BJ9 bj9) {
        Handler handler;
        if (bj9.LJIIL) {
            return;
        }
        long LIZLLL = bj9.LIZLLL();
        if (LIZLLL / 1000 >= 10 && !bj9.LIZJ) {
            bj9.LJIILIIL("livesdk_watch_tensec");
            bj9.LIZJ = true;
        } else {
            if (LIZLLL >= 10000 || (handler = bj9.LJFF) == null) {
                return;
            }
            handler.postDelayed(new IDRunnableS6S0101000(2, bj9, 35), 10000 - LIZLLL);
        }
    }

    public static void LJFF(BJ9 bj9) {
        Handler handler;
        if (bj9.LJIIL) {
            return;
        }
        long LIZLLL = bj9.LIZLLL();
        if (LIZLLL / 1000 >= 30 && !bj9.LIZLLL) {
            bj9.LJIILIIL("livesdk_watch_thirtysec");
            bj9.LIZLLL = true;
        } else {
            if (LIZLLL >= 30000 || (handler = bj9.LJFF) == null) {
                return;
            }
            handler.postDelayed(new IDRunnableS6S0101000(3, bj9, 34), 30000 - LIZLLL);
        }
    }

    public final void LIZ(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJJJJL;
        this.LJJJJL = SystemClock.elapsedRealtime();
        if (i == 1) {
            this.LJJJJLI += elapsedRealtime;
            return;
        }
        if (i == 2) {
            this.LJJJJLL += elapsedRealtime;
            return;
        }
        if (i == 3) {
            this.LJJJJZ += elapsedRealtime;
        } else if (i == 4) {
            this.LJJJJZI += elapsedRealtime;
        } else {
            if (i != 5) {
                return;
            }
            this.LJJJLIIL += elapsedRealtime;
        }
    }

    public final void LIZIZ(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJJJIL;
        this.LJJJIL = SystemClock.elapsedRealtime();
        if (i == 1) {
            this.LJJJJ += elapsedRealtime;
            return;
        }
        if (i == 2) {
            this.LJJJJI += elapsedRealtime;
            return;
        }
        if (i == 3) {
            this.LJJJJIZL += elapsedRealtime;
        } else if (i == 4) {
            this.LJJJJJ += elapsedRealtime;
        } else {
            if (i != 5) {
                return;
            }
            this.LJJJJJL += elapsedRealtime;
        }
    }

    public final void LJIIIZ(boolean z) {
        long elapsedRealtime;
        if (this.LJIILL) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            elapsedRealtime = 0;
        } else {
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.LJIL) - this.LJJIFFI;
            if (elapsedRealtime < 0) {
                elapsedRealtime = 0;
            }
        }
        hashMap.put("watch_duration", String.valueOf(elapsedRealtime));
        BZI LIZ = C28787BRn.LIZ("livesdk_live_game_watch_duration");
        LIZ.LJJIFFI(hashMap);
        C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, this.LJJIJIIJI), LIZ, "user_id");
        LIZ.LJJIII(Long.valueOf(this.LJIIJJI));
        LIZ.LJ(Long.valueOf(this.LJJIIZ));
        LIZ.LIZJ(this.LJJII);
        LIZ.LJJIIJZLJL();
        this.LJIL = 0L;
        this.LJIILL = true;
    }

    public final void LJIIJ(java.util.Map<String, String> map) {
        java.util.Map<String, String> map2 = this.LJIIJ.mRoomsData.gameLiveExtra;
        if (map2 != null && map2.get("tag_name") != null) {
            ((HashMap) map).put("live_game_name", this.LJIIJ.mRoomsData.gameLiveExtra.get("tag_name"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(Room room) {
        Object[] objArr;
        Object[] objArr2;
        String str;
        Object[] objArr3;
        int i;
        Object[] objArr4;
        int i2;
        String str2;
        Object obj;
        java.util.Map<String, String> L;
        java.util.Map map;
        B7G b7g;
        int i3;
        EnterRoomConfig.ECWrapData eCWrapData;
        HashMap<String, String> hashMap;
        LIZIZ(0);
        LIZ(0);
        B4N LIZIZ = B4N.LIZIZ();
        LIZIZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopRoomDuration duration: ");
        LIZ.append(LIZIZ.LIZ());
        C0NB.LJIIIZ("AudienceLivePlayTaskManager", X1D.LIZIZ(LIZ));
        LIZIZ.LIZIZ = false;
        LIZIZ.LIZLLL = 0L;
        LIZIZ.LIZJ = -1L;
        ((HashMap) LIZIZ.LJ).clear();
        ((CopyOnWriteArrayList) LIZIZ.LIZ).clear();
        LIZIZ.LJFF.removeCallbacksAndMessages(null);
        C30588BzU.LIZIZ(room, this.LJJIJIIJI);
        if (this.LJIILLIIL == -1 || this.LJIILJJIL || room == null) {
            return;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.LJIILLIIL) - this.LJJIFFI;
        long currentTimeMillis = System.currentTimeMillis() - this.LJJJLL;
        if (BJP.LIZ()) {
            Long l = 0L;
            Iterator it = ((ArrayList) LivePlayFragment.A).iterator();
            while (it.hasNext()) {
                l = Long.valueOf(((Long) it.next()).longValue() + l.longValue());
            }
            elapsedRealtime += l.longValue();
        }
        HashMap hashMap2 = new HashMap();
        long j = this.LJIIJ.mLogData.fromPortalId;
        if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            hashMap2.put("connection_type", "manual_pk");
            hashMap2.put("pk_id", String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()));
        }
        hashMap2.put("request_page", C28594BKc.LIZJ().LIZLLL());
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            hashMap2.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
        }
        String str3 = this.LJIIJ.mLogData.gdLabel;
        hashMap2.put("gd_label", str3);
        hashMap2.put("action_type", this.LJIIJ.mRoomsData.actionType);
        String str4 = "1";
        if (!TextUtils.isEmpty(str3) && "click_push_live_cd_user".equals(str3)) {
            hashMap2.put("is_subscribe", "1");
        } else {
            hashMap2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        long e10 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).e10(this.LJIIJJI);
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).NN(this.LJIIJJI);
        if (this.LJIIJ.mRoomsData.isBackPreRoom) {
            objArr = "1";
        } else {
            objArr = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_return", objArr);
        if (!TextUtils.isEmpty(this.LJIIJ.mLogData.liveReason)) {
            hashMap2.put("live_reason", this.LJIIJ.mLogData.liveReason);
        }
        if (room.getOwner() != null && room.getOwner().getAuthenticationInfo() != null) {
            objArr2 = "1";
        } else {
            objArr2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_anchor_official", objArr2);
        if (room.getSquareCoverImg() != null && !C32151Nz.LJJIIJZLJL(room.getSquareCoverImg().getUrls())) {
            str = "screen_shot";
        } else {
            str = "user_upload";
        }
        hashMap2.put("cover_type", str);
        ((ILoggerService) CN1.LIZ(ILoggerService.class)).Dg("", true).getClass();
        new BJJ().LIZ(room, hashMap2);
        BM1.LIZ(null, hashMap2);
        BM1.LIZIZ(hashMap2);
        EnterRoomConfig enterRoomConfig = this.LJIIJ;
        if (enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null && (hashMap = eCWrapData.ecCommonExtraParam) != null) {
            hashMap2.putAll(hashMap);
        }
        if (this.LJJJI) {
            objArr3 = "1";
        } else {
            objArr3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_commerce_inner_flow", objArr3);
        long j2 = this.LJIIJ.mLogData.cardRoomId;
        if (j2 > 0) {
            hashMap2.put("card_room_id", String.valueOf(j2));
        }
        EnterRoomConfig enterRoomConfig2 = this.LJIIJ;
        String str5 = "draw";
        if (enterRoomConfig2.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig2.mRoomsData.actionType)) {
            hashMap2.put("from_room_id", String.valueOf(this.LJIIJ.mLogData.fromRoomId));
        }
        if (!"-1".equals(this.LJIIJ.mLogData.drawAction) || "draw".equals(this.LJIIJ.mRoomsData.actionType)) {
            hashMap2.put("draw_action", this.LJIIJ.mLogData.drawAction);
        }
        if (this.LJIIJ.mRoomsData.isFromBubble > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJIIJ.mRoomsData.isFromBubble);
            LIZ2.append("");
            hashMap2.put("is_from_bubble", X1D.LIZIZ(LIZ2));
        }
        if (this.LJIIJ.mRoomsData.isFromCache > 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.LJIIJ.mRoomsData.isFromCache);
            LIZ3.append("");
            hashMap2.put("is_from_cache", X1D.LIZIZ(LIZ3));
        }
        if (room.getBcToggleInfo() != null && (room.getBcToggleInfo().status == 1 || room.getBcToggleInfo().status == 2)) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap2.put("is_paid_partnership", String.valueOf(i));
        if (this.LJIIJ.mLogData.isPreLiveAccessRecall) {
            objArr4 = "1";
        } else {
            objArr4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_revoked_end", objArr4);
        hashMap2.put("enter_from_merge", this.LJIIJ.mRoomsData.enterFromMerge);
        hashMap2.put("enter_method", this.LJIIJ.mRoomsData.enterMethod);
        User owner = room.getOwner();
        if (owner != null) {
            if (!owner.isAnchorHasSubQualification()) {
                hashMap2.put("is_subscription", "-1");
            } else if (owner.isSubscribed()) {
                hashMap2.put("is_subscription", "1");
            } else {
                hashMap2.put("is_subscription", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (room.getCommerceStruct() != null) {
            try {
                JSONObject jSONObject = new JSONObject(room.getCommerceStruct().getOecInitDataString());
                String optString = jSONObject.optString("pop_product_id");
                if (optString.isEmpty()) {
                    String optString2 = jSONObject.optString("pop_product");
                    if (!optString2.isEmpty()) {
                        optString = new JSONObject(optString2).optString("product_id");
                    }
                }
                if (!optString.isEmpty()) {
                    hashMap2.put("current_product_id", optString);
                }
            } catch (Exception unused) {
            }
        }
        LiveEventAndSubscribeConfig value = LiveEventAndSubscribeSetting.INSTANCE.getValue();
        int i4 = this.LJIIJ.mRoomsData.anchorRelationType;
        if (i4 == 1 || i4 == 2) {
            hashMap2.put("window_tag_type", String.valueOf(value.styleOfLiveEventAndSubscribe));
        }
        int i5 = this.LJIIJ.mRoomsData.anchorRelationType;
        if (i5 == 1) {
            str2 = "subscription";
            i2 = 2;
        } else {
            i2 = 2;
            if (i5 == 2) {
                str2 = "live_event";
            } else {
                str2 = "follow";
            }
        }
        hashMap2.put("window_tag", str2);
        DataChannel dataChannel = this.LJJIJIIJI;
        if (dataChannel != null) {
            C28429BDt c28429BDt = (C28429BDt) dataChannel.kv0(VideoOrientationChangeChannel.class);
            if (c28429BDt != null) {
                boolean LIZ4 = c28429BDt.LIZ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("");
                LIZ5.append(LIZ4 ? 1 : 0);
                hashMap2.put("is_horizontal_room", X1D.LIZIZ(LIZ5));
            }
            Boolean bool = (Boolean) this.LJJIJIIJI.kv0(C28430BDu.class);
            if (bool != null && bool.booleanValue()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("");
            LIZ6.append(i3);
            hashMap2.put("show_orientation_widget", X1D.LIZIZ(LIZ6));
        }
        List LIZJ = BJB.LIZJ();
        ListIterator listIterator = LIZJ.listIterator(LIZJ.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (!o.LJ(((BJA) obj).LJLILLLLZI, String.valueOf(room.getId()))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BJA bja = (BJA) obj;
        if (bja == null) {
            L = C113554cx.LJJJLIIL();
        } else if (bja.LJLIL.length() == 0) {
            if (bja.LJLILLLLZI.length() > 0) {
                L = E2C.LIZJ("drawer_from_room_id", bja.LJLILLLLZI);
            } else {
                L = C113554cx.LJJJLIIL();
            }
        } else {
            L = bja.L();
        }
        hashMap2.putAll(L);
        if (!TextUtils.equals(this.LJIIJ.mRoomsData.enterRoomScene, "inner_draw")) {
            str5 = "click";
        }
        hashMap2.put("user_action_type", str5);
        if (!TextUtils.isEmpty(this.LJIIJ.mLogData.enterRoomViaPreviewGuide)) {
            hashMap2.put("if_guidence", this.LJIIJ.mLogData.enterRoomViaPreviewGuide);
        }
        if (!TextUtils.isEmpty(this.LJIIJ.mLogData.liveSortBy)) {
            hashMap2.put("sort_status", this.LJIIJ.mLogData.liveSortBy);
            hashMap2.put("followlist_order", String.valueOf(this.LJIIJ.mLogData.followListOrder));
        }
        LJIIJ(hashMap2);
        BZI LIZ7 = C28787BRn.LIZ("live_duration");
        LIZ7.LJJIFFI(hashMap2);
        LIZ7.LJIJJ(String.valueOf(j), "portal_id");
        C06530Nl.LIZLLL(LIZ7, this.LJJIIZI, "live_play_session_id", currentTimeMillis, "stream_duration");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJ), "duration_server_heat_level_1");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJI), "duration_server_heat_level_2");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJIZL), "duration_server_heat_level_3");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJJ), "duration_server_heat_level_4");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJJL), "duration_server_heat_level_5");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJLI), "duration_client_heat_level_1");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJLL), "duration_client_heat_level_2");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJZ), "duration_client_heat_level_3");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJJZI), "duration_client_heat_level_4");
        LIZ7.LJIJJ(Long.valueOf(this.LJJJLIIL), "duration_client_heat_level_5");
        LIZJ();
        if ("portal".equals(this.LJJIIJZLJL)) {
            LIZ7.LJIJJ(1, "is_portal_user");
        } else {
            LIZ7.LJIJJ(0, "is_portal_user");
        }
        DataChannel dataChannel2 = this.LJJIJIIJI;
        if (dataChannel2 != null && dataChannel2.kv0(BJO.class) != null) {
            LIZ7.LJIILLIIL(this.LJJIJIIJI);
        } else {
            LIZ7.LJIIZILJ();
        }
        if ("follow_widget".equals(this.LJIIJ.mRoomsData.enterFromMerge)) {
            LIZ7.LJIJJ(this.LJIIJ.mRoomsData.widgetType, "widget_type");
            LIZ7.LJIJJ(Integer.valueOf(this.LJIIJ.mRoomsData.anchorPosition), "anchor_position");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ7.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ7.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        LIZ7.LIZLLL(C28835BTj.LIZIZ(null, this.LJJIJIIJI, "user_live_duration"));
        LIZ7.LJIJJ(String.valueOf(elapsedRealtime), "duration");
        LIZ7.LJIJJ(Long.valueOf(e10), "hot_duration");
        LIZ7.LJIIIZ("live_view");
        LIZ7.LJIIJJI("live_detail");
        if (iFansClubService != null) {
            map = iFansClubService.Yd(null, this.LJJIJIIJI, true);
        } else {
            map = null;
        }
        LIZ7.LJJIFFI(map);
        LIZ7.LJJIIJZLJL();
        if (C28835BTj.LJ(this.LJIIJ)) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("room_id", String.valueOf(this.LJIIJJI));
            hashMap3.put("anchor_id", String.valueOf(this.LJJIIZ));
            hashMap3.put("duration", Long.valueOf(elapsedRealtime));
            b7g = null;
            C28835BTj.LIZ("live_ad", "live_duration", null, hashMap3);
        } else {
            b7g = null;
        }
        if (CN1.LIZ(IWalletService.class) != null && ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange() != null) {
            ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJJ();
        }
        this.LJIILJJIL = true;
        String str6 = "close";
        if (this.LJJIJIIJIL != -1) {
            if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_video_over")) {
                DataChannel dataChannel3 = this.LJJIJIIJI;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("video_id", BJM.LJIJ());
                if (dataChannel3 != null) {
                    hashMap4.put("is_live_recall", CardStruct.IStatusCode.DEFAULT);
                    Room room2 = (Room) dataChannel3.kv0(RoomChannel.class);
                    if (room2 != null) {
                        if (!room2.hasCommerceGoods) {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        hashMap4.put("is_sale", str4);
                        hashMap4.put("orientation", String.valueOf(room2.getOrientation()));
                    }
                }
                hashMap4.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJJIJIIJIL));
                hashMap4.put("trigger", "close");
                BZI LIZ8 = C28787BRn.LIZ("livesdk_video_over");
                LIZ8.LJJIFFI(hashMap4);
                LIZ8.LJIILLIIL(this.LJJIJIIJI);
                LIZ8.LIZJ(this.LJJII);
                LIZ8.LJJIIJZLJL();
            }
            this.LJJIJIIJIL = -1L;
        }
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_user_left_rankings_status")) {
            BZI LIZ9 = C28787BRn.LIZ("livesdk_user_left_rankings_status");
            LIZ9.LJIIZILJ();
            if (((Long) DataChannelGlobal.LJLJJI.mv0(C29025BaH.class)).longValue() != BJW.RANK_SWITCH_STATUS_OFF.getValue()) {
                str6 = "open";
            }
            LIZ9.LJIJJ(str6, "ranking_status");
            LIZ9.LJJIIJZLJL();
        }
        this.LJJJ.add(new B7G(EnumC28204B5c.END, SystemClock.elapsedRealtime()));
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_backstage_return_watch_duration", 0.1d)) {
            return;
        }
        Iterator<B7G> it2 = this.LJJJ.iterator();
        B7G b7g2 = b7g;
        B7G b7g3 = b7g;
        B7G b7g4 = b7g;
        while (it2.hasNext()) {
            B7G next = it2.next();
            int ordinal = next.LIZ.ordinal();
            if (ordinal != 1) {
                if (ordinal != i2) {
                    if (ordinal == 3) {
                        b7g3 = next;
                        b7g4 = b7g;
                    }
                } else {
                    b7g2 = next;
                    b7g3 = b7g;
                }
            } else {
                b7g4 = next;
            }
        }
        if (b7g2 == null || b7g3 == null || b7g4 == null) {
            return;
        }
        BZI LIZ10 = C28787BRn.LIZ("livesdk_live_backstage_return_watch_duration");
        LIZ10.LJIIZILJ();
        LIZ10.LJIJJ(b7g2.LIZJ, "backstage_type");
        C28289B8j.LIZJ(b7g4.LIZIZ, b7g3.LIZIZ, LIZ10, "duration");
    }

    public final void LJIILIIL(String str) {
        String str2;
        EnterRoomConfig.ECWrapData eCWrapData;
        HashMap<String, String> hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("growth_deepevent", String.valueOf(1));
        hashMap2.put("request_page", C28594BKc.LIZJ().LIZLLL());
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            hashMap2.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
        }
        String str3 = this.LJIIJ.mLogData.gdLabel;
        String str4 = "1";
        if (!TextUtils.isEmpty(str3) && "click_push_live_cd_user".equals(str3)) {
            hashMap2.put("is_subscribe", "1");
        } else {
            hashMap2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C15380j0.LJIILLIIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        hashMap2.put("room_orientation", str2);
        if (!this.LJIIJ.mRoomsData.isBackPreRoom) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_return", str4);
        EnterRoomConfig enterRoomConfig = this.LJIIJ;
        if (enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null && (hashMap = eCWrapData.ecCommonExtraParam) != null) {
            hashMap2.putAll(hashMap);
        }
        long j = this.LJIIJ.mLogData.cardRoomId;
        if (j > 0) {
            hashMap2.put("card_room_id", String.valueOf(j));
        }
        EnterRoomConfig enterRoomConfig2 = this.LJIIJ;
        if (enterRoomConfig2.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig2.mRoomsData.actionType)) {
            hashMap2.put("from_room_id", String.valueOf(this.LJIIJ.mLogData.fromRoomId));
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap2.putAll(BJB.LIZ());
        if (!"-1".equals(this.LJIIJ.mLogData.drawAction) || "draw".equals(this.LJIIJ.mRoomsData.actionType)) {
            hashMap2.put("draw_action", this.LJIIJ.mLogData.drawAction);
        }
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJJIFFI(hashMap2);
        java.util.Map map = null;
        LIZ.LIZLLL(C28835BTj.LIZIZ(null, this.LJJIJIIJI, "user_live_duration"));
        LIZ.LJIIIZ("live_view");
        LIZ.LJIIJJI("live_detail");
        LIZ.LIZJ(this.LJJII);
        LIZ.LJIIZILJ();
        if (iFansClubService != null) {
            map = iFansClubService.Yd(null, this.LJJIJIIJI, true);
        }
        LIZ.LJJIFFI(map);
        if (("livesdk_watch_thirtysec".equals(str) || "livesdk_watch_tensec".equals(str)) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIJ();
            LIZ.LJJIIZ();
            LIZ.LJJIIZI();
            return;
        }
        LIZ.LJJIIJZLJL();
    }

    public static void LJII(DataChannel dataChannel, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_end_live_popup");
        LIZ.LJIJJ(str, "popup_type");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
    }

    public static void LJIIIIZZ(int i, DataChannel dataChannel, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_one_account_toast");
        LIZ.LJIJJ(Integer.valueOf(i), "situation");
        LIZ.LJIJJ(str, "last_account_status");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0514  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r23, boolean r24, java.lang.String r25, com.bytedance.android.livesdkapi.depend.model.live.Room r26, com.bytedance.ies.sdk.datachannel.DataChannel r27) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJ9.LJI(boolean, boolean, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public BJ9(Context context, String str, String str2, long j, String str3, String str4, EnterRoomConfig enterRoomConfig, String str5, String str6) {
        Handler handler;
        TextUtils.equals(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel(), "local_test");
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            handler = new Handler(C39202Fa2.LIZ.LIZ());
        } else {
            handler = new Handler(((IHostAction) CN1.LIZ(IHostAction.class)).getHostHandlerThread().getLooper());
        }
        this.LJFF = handler;
        new WeakReference(context);
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = j;
        this.LJIIIZ = str3;
        this.LJJIII = str4;
        this.LJIIJ = enterRoomConfig;
        this.LJJIIJ = str5;
        this.LJJIIJZLJL = str6;
    }
}
