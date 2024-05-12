package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.gift.StickerGiftTimeoutSettings;
import com.bytedance.android.livesdk.livesetting.performance.FacialGiftTrackingSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ckf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32217Ckf {
    public static final C32217Ckf LIZ = new C32217Ckf();
    public static final List<C32218Ckg> LIZIZ = new ArrayList();
    public static final C32123Cj9 LIZJ = new C32123Cj9();

    public static void LIZ(C32218Ckg c32218Ckg, java.util.Map map, int i, String str) {
        long j;
        Integer num;
        User owner;
        java.util.Set<Map.Entry> entrySet;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Sending [gift_sticker_play_status], errorCode: ");
        LIZ2.append(i);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ2));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Long l = null;
        if (room != null) {
            num = Integer.valueOf(room.getOrientation());
        } else {
            num = null;
        }
        java.util.Map LJFF = C32455CoV.LJFF(c32218Ckg.LJFF);
        C32255ClH LIZ3 = C32256ClI.LIZ("gift_sticker_play_status");
        LIZ3.LIZIZ();
        LIZ3.LJFF(LJFF);
        LIZ3.LIZJ(c32218Ckg.LIZ, "gift_id");
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry entry : entrySet) {
                LIZ3.LIZJ(((Number) entry.getValue()).longValue(), (String) entry.getKey());
            }
        }
        LIZ3.LIZLLL(Integer.valueOf(i), "error_code");
        LIZ3.LIZLLL(str, "error_message");
        LIZ3.LIZJ(j, "room_id");
        LIZ3.LIZLLL(num, "room_type");
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        }
        LIZ3.LIZLLL(l, "anchor_id");
        LIZ3.LIZLLL(Integer.valueOf(c32218Ckg.LJ.type), "gift_type");
        LIZ3.LJI();
    }

    public final void LIZIZ(long j, long j2, long j3, String str) {
        Object obj;
        C32218Ckg c32218Ckg;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleShowEvent ");
        LIZ2.append(str);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ2));
        if (str == null) {
            return;
        }
        long LIZ3 = C30725C4b.LIZ();
        List<C32218Ckg> list = LIZIZ;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((C32218Ckg) obj).LIZIZ, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c32218Ckg = (C32218Ckg) obj;
            if (c32218Ckg != null) {
                ((ArrayList) LIZIZ).remove(c32218Ckg);
            }
        }
        if (c32218Ckg == null) {
            return;
        }
        C31120CJg.LIZ.e1();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sticker_total_latency", Long.valueOf(SystemClock.elapsedRealtime() - c32218Ckg.LIZJ));
        linkedHashMap.put("sticker_anchor_latency", Long.valueOf(j2));
        linkedHashMap.put("sticker_stream_latency", Long.valueOf(LIZ3 - j));
        linkedHashMap.put("sticker_message_latency", Long.valueOf(j3 - c32218Ckg.LIZLLL));
        LIZ(c32218Ckg, linkedHashMap, 0, null);
    }

    public static void LIZJ(DataChannel dataChannel, SendGiftResult result, Long l, GiftMessage msg, String responseLogId) {
        Long l2;
        long j;
        boolean z;
        boolean z2;
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(result, "result");
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(responseLogId, "responseLogId");
        if (!FacialGiftTrackingSettings.INSTANCE.isEnabled()) {
            C32444CoK.LIZ("StickerGiftTracker", "Facial gift event tracking disabled, ignoring record");
            return;
        }
        long j2 = result.mGiftId;
        Gift findGiftById = GiftManager.inst().findGiftById(j2);
        if (findGiftById == null) {
            return;
        }
        if (findGiftById.type != 4) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isn't sticker gift: ");
            LIZ2.append(findGiftById.id);
            LIZ2.append(", type = ");
            LIZ2.append(findGiftById.type);
            C32444CoK.LIZIZ("StickerGiftTracker", X1D.LIZIZ(LIZ2));
            return;
        }
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room == null) {
            return;
        }
        String clientVersion = room.getClientVersion();
        if (clientVersion != null) {
            l2 = C79043V0l.LJIJJLI(clientVersion);
        } else {
            l2 = null;
        }
        String versionCode = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getVersionCode();
        o.LJIIIIZZ(versionCode, "getService(IHostAppConte…::class.java).versionCode");
        Long LJIJJLI = C79043V0l.LJIJJLI(versionCode);
        if (LJIJJLI != null) {
            j = LJIJJLI.longValue();
        } else {
            j = 0;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Versions, host: ");
        LIZ3.append(l2);
        LIZ3.append(", current device: ");
        LIZ3.append(j);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ3));
        if (l2 == null || l2.longValue() < 260700) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("anchor version too low : ");
            LIZ4.append(room.getClientVersion());
            LIZ4.append(", ignore");
            C32444CoK.LIZIZ("StickerGiftTracker", X1D.LIZIZ(LIZ4));
            return;
        }
        if (C32257ClJ.LJI()) {
            C32444CoK.LIZIZ("StickerGiftTracker", "Host won't receive SEI callbacks, ignoring");
            return;
        }
        IInteractService iInteractService = C31120CJg.LIZ;
        if (iInteractService.OB() || iInteractService.h80() || iInteractService.QA() || iInteractService.ta0() || iInteractService.Qe0()) {
            if (l2.longValue() < r12.getMultiHostPermanentSeiMinVersion() && j >= r12.getMultiHostPermanentSeiMinVersion()) {
                C32444CoK.LIZIZ("StickerGiftTracker", "Host version does not support permanent SEI, ignoring");
                return;
            }
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            if (C31120CJg.LIZJ(LJ, room) == 2) {
                C32444CoK.LIZIZ("StickerGiftTracker", "User is linking to host, cannot receive SEI data");
                return;
            }
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (l == null || l.longValue() != currentUserId) {
            z = false;
        } else {
            z = true;
        }
        long id = room.getOwner().getId();
        if (l == null || l.longValue() != id) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2) {
            C32444CoK.LIZIZ("StickerGiftTracker", "Gift was sent to self or a non-owner host");
            return;
        }
        iInteractService.Ty("live_sticker_gift_sei", new WeakReference<>(LIZJ));
        C32218Ckg c32218Ckg = new C32218Ckg(j2, responseLogId, SystemClock.elapsedRealtime(), C30725C4b.LIZ(), findGiftById, msg);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Gift sent, enqueuing record: ");
        LIZ5.append(c32218Ckg);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ5));
        List<C32218Ckg> list = LIZIZ;
        synchronized (list) {
            ((ArrayList) list).add(c32218Ckg);
        }
        C32257ClJ.LIZ.postDelayed(new RunnableC32219Ckh(c32218Ckg), StickerGiftTimeoutSettings.INSTANCE.getValue());
    }

    public static void LIZLLL(DataChannel dataChannel, SendGiftResult sendGiftResult, C32805Cu9 c32805Cu9, GiftMessage msg, String responseLogId) {
        Long l;
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(responseLogId, "responseLogId");
        C32822CuQ c32822CuQ = c32805Cu9.LJIILIIL;
        if (c32822CuQ != null) {
            l = Long.valueOf(c32822CuQ.LIZ);
        } else {
            l = null;
        }
        LIZJ(dataChannel, sendGiftResult, l, msg, responseLogId);
    }
}
