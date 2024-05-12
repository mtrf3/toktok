package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAdaptMicRoomSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TYk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74830TYk {
    public static long LIZ;
    public static int LJFF;
    public static final HashMap<Long, String> LIZIZ = new HashMap<>();
    public static final HashMap<Long, String> LIZJ = new HashMap<>();
    public static final HashSet<Long> LIZLLL = new HashSet<>();
    public static final HashMap<Long, String> LJ = new HashMap<>();
    public static final String LJI = "MultiLiveEnd";

    public static void LIZ(EnumC74778TWk enumC74778TWk) {
        if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
            C74979Tbj.LJIIJJI = true;
            if (enumC74778TWk == EnumC74778TWk.GRID || enumC74778TWk == EnumC74778TWk.FLOATING) {
                C74979Tbj.LJIILIIL = "guest_link";
                C74979Tbj.LJII();
            }
        }
    }

    public static final void LJFF(EnumC74778TWk enumC74778TWk) {
        if (LIZIZ.isEmpty()) {
            return;
        }
        for (Map.Entry<Long, String> entry : LIZJ.entrySet()) {
            C74824TYe.LJJZZIII(entry.getKey().longValue(), 0L, false, entry.getValue(), "turn_off_functions");
        }
        LIZIZ.clear();
        LIZJ.clear();
        LJI("turn_off_functions", 0L, -1L, enumC74778TWk, "liveEnd&turnOff", "");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    public static final void LJ(EnumC74778TWk enumC74778TWk, DataChannel dataChannel) {
        Boolean bool;
        String str;
        if (LIZIZ.isEmpty()) {
            return;
        }
        for (Map.Entry<Long, String> entry : LIZJ.entrySet()) {
            C74824TYe.LJJZZIII(entry.getKey().longValue(), 0L, false, entry.getValue(), "live_end");
        }
        LIZIZ.clear();
        LIZJ.clear();
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BDP.class);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable()) {
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(BDP.class)).LIZ = Boolean.FALSE;
            }
            str = "lineup_start";
        } else {
            str = "live_end";
        }
        LJI(str, 0L, -1L, enumC74778TWk, "liveEnd&turnOff", "");
    }

    public static void LJIIIIZZ(long j, String str) {
        LJ.put(Long.valueOf(j), str);
    }

    public static final void LIZIZ(long j, long j2, EnumC74778TWk enumC74778TWk) {
        HashMap<Long, String> hashMap = LIZIZ;
        String remove = hashMap.remove(Long.valueOf(j));
        String remove2 = LIZJ.remove(Long.valueOf(j));
        if (remove2 != null) {
            C74824TYe.LJJZZIII(j, j2, false, remove2, "anchor_kick_out_guest");
            if (remove != null && hashMap.size() == 0) {
                LIZ(enumC74778TWk);
                LJI("anchor_kick_out_guest", j, j2, enumC74778TWk, remove, remove2);
            }
        }
    }

    public static final void LIZJ(long j, String str, String linkId) {
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        InterfaceC75973Trl LLIIJI2;
        List<LinkUser> LJJIIZI2;
        o.LJIIIZ(linkId, "linkId");
        HashMap<Long, String> hashMap = LIZIZ;
        int i = 0;
        if (hashMap.isEmpty()) {
            LIZ = System.currentTimeMillis();
            if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                C74979Tbj c74979Tbj = C74979Tbj.LIZ;
                C74979Tbj.LJIIL = "guest_link";
                C74979Tbj.LJIIJJI = false;
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C74838TYs.LJ().LJJI;
                o.LJIIIIZZ(multiLiveAnchorPanelSettings, "inst().multiLiveAnchorPanelSettings");
                c74979Tbj.LJFF(C86793Y4n.LJJ(multiLiveAnchorPanelSettings), true);
            }
        }
        hashMap.put(Long.valueOf(j), str);
        LIZJ.put(Long.valueOf(j), linkId);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        LinkUser linkUser = null;
        if (R6 != null && (LLIIJI2 = R6.LLIIJI()) != null && (LJJIIZI2 = LLIIJI2.LJJIIZI()) != null) {
            Iterator<LinkUser> it = LJJIIZI2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LinkUser next = it.next();
                Long userId = next.getUserId();
                if (userId != null && userId.longValue() == j) {
                    linkUser = next;
                    break;
                }
            }
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJI = R62.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            i = LJJIIZI.size();
        }
        if (linkUser == null) {
            i++;
        }
        if (i == 0 || i == 1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("linkedCnt invalid, value ");
            LIZ2.append(i);
            C0NB.LJ("LinkInRoomAnchorOverLogger", X1D.LIZIZ(LIZ2));
        }
        LJFF = Math.max(i - 1, LJFF);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    public static final void LIZLLL(long j, long j2, EnumC74778TWk enumC74778TWk, DataChannel dataChannel) {
        Boolean bool;
        String str;
        HashMap<Long, String> hashMap = LIZIZ;
        String remove = hashMap.remove(Long.valueOf(j));
        String remove2 = LIZJ.remove(Long.valueOf(j));
        if (remove2 != null) {
            C74824TYe.LJJZZIII(j, j2, false, remove2, "guest_over");
            if (remove != null && hashMap.size() == 0) {
                if (dataChannel != null) {
                    bool = (Boolean) dataChannel.kv0(BDO.class);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool) && MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable()) {
                    str = "lineup_over";
                } else {
                    str = "guest_over";
                }
                LJI(str, j, j2, enumC74778TWk, remove, remove2);
                if (dataChannel != null) {
                    ((C32537Cpp) dataChannel.gv0(BDO.class)).LIZ = Boolean.FALSE;
                }
                LIZ(enumC74778TWk);
            }
        }
    }

    public static void LJI(String str, long j, long j2, EnumC74778TWk enumC74778TWk, String str2, String str3) {
        InterfaceC05190Ih interfaceC05190Ih;
        Object obj;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null) {
            interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ;
        } else {
            interfaceC05190Ih = null;
        }
        try {
            if (room != null) {
                if (interfaceC05190Ih != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("channel_id", String.valueOf(room.getId()));
                    C7MY.LJFF(System.currentTimeMillis(), LIZ, hashMap, "duration");
                    hashMap.put("live_type", C74824TYe.LJIIIZ());
                    hashMap.put("connection_over_type", str);
                    if (j2 >= 0) {
                        hashMap.put("anchor_relationship", String.valueOf(j2));
                    }
                    hashMap.put("enter_method", BJM.LJIIIIZZ());
                    hashMap.put("enter_from_merge", BJM.LJFF());
                    hashMap.put("action_type", BJM.LIZLLL());
                    if (C29137Bc5.LIZIZ(room)) {
                        hashMap.put("layout_id", C74824TYe.LJ());
                    } else {
                        hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
                        hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
                    }
                    String str4 = "";
                    if (o.LJ(str2, "")) {
                        obj = "guest_apply_anchor";
                    } else if (o.LJ(str2, "liveEnd&turnOff")) {
                        obj = "";
                    } else {
                        obj = "anchor_invite_guest";
                    }
                    hashMap.put("guest_invite_type", obj);
                    if (C19N.LIZLLL()) {
                        hashMap.put("enter_from", String.valueOf(C58582Myw.LIZ().get(Long.valueOf(j))));
                        C58582Myw.LIZ().remove(Long.valueOf(j));
                    } else {
                        if (o.LJ(str2, "")) {
                            HashSet<Long> hashSet = LIZLLL;
                            if (!hashSet.contains(Long.valueOf(j))) {
                                str4 = "guest_apply_anchor";
                            } else {
                                hashSet.remove(Long.valueOf(j));
                                str4 = "animation_guest_apply_anchor";
                            }
                        } else if (!o.LJ(str2, "liveEnd&turnOff")) {
                            str4 = "anchor_invite_guest";
                        }
                        hashMap.put("enter_from", str4);
                    }
                    hashMap.put("guest_id", String.valueOf(j));
                    hashMap.put("permission_type", C74776TWi.LJ());
                    hashMap.put("linkId", str3);
                    hashMap.put("max_guest_cnt", String.valueOf(LJFF));
                    if (!o.LJ(str, "anchor_pause")) {
                        LJFF = 0;
                    }
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_guest_connection_over");
                    LIZ2.LJJIFFI(hashMap);
                    BZJ bzj = LIZ2.LIZ;
                    if (bzj != null) {
                        bzj.LJIIJJI();
                    }
                    LIZ2.LJJIIJZLJL();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("log_name", "ttlive_multilive_multi_live_end");
                    jSONObject.put("way", str);
                    C0NB.LJIIIZ(LJI, jSONObject.toString());
                    B5G.LIZIZ().LJJJJZ = false;
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
        }
    }
}
