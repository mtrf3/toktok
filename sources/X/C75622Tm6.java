package X;

import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchComponentDisappearCheckDurationSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Tm6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75622Tm6 extends C05630Jz {
    public static final java.util.Map<String, Boolean> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, String> LIZIZ = new LinkedHashMap();
    public static final JSONObject LIZJ = new JSONObject();
    public static final LruCache<Long, Boolean> LIZLLL = new LruCache<>(3);
    public static boolean LJ;
    public static boolean LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static int LJIIIZ;
    public static volatile boolean LJIIJ;
    public static long LJIIJJI;
    public static C73411SrX LJIIL;

    public static void LJIILL() {
        Boolean bool;
        C73411SrX c73411SrX;
        LJIIJ = false;
        LJIIJJI = 0L;
        LJIIIZ = 0;
        LJIIIIZZ = 0L;
        ((LinkedHashMap) LIZIZ).clear();
        C73411SrX c73411SrX2 = LJIIL;
        if (c73411SrX2 != null) {
            bool = Boolean.valueOf(c73411SrX2.isDisposed());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJIL(bool) && (c73411SrX = LJIIL) != null) {
            c73411SrX.dispose();
        }
        LJIIL = null;
    }

    public static void LJIIIZ(int i) {
        String str;
        long LIZIZ2 = C76265TwT.LIZ.LIZIZ();
        LruCache<Long, Boolean> lruCache = LIZLLL;
        if (!o.LJ(lruCache.get(Long.valueOf(LIZIZ2)), Boolean.TRUE)) {
            return;
        }
        lruCache.put(Long.valueOf(LIZIZ2), Boolean.FALSE);
        JSONObject jSONObject = new JSONObject();
        int i2 = 0;
        int i3 = 0;
        for (EnumC76429Tz7 enumC76429Tz7 : EnumC76429Tz7.values()) {
            boolean LJ2 = o.LJ(((LinkedHashMap) LIZ).get(enumC76429Tz7.getScene()), Boolean.TRUE);
            if (LJ2) {
                i3++;
            }
            String scene = enumC76429Tz7.getScene();
            if (LJ2) {
                str = "display_success";
            } else {
                str = "display_failed";
            }
            C05630Jz.LJI(jSONObject, scene, str);
        }
        int length = EnumC76429Tz7.values().length;
        if (!LJ) {
            length--;
        }
        if (length == i3) {
            i2 = 1;
        }
        long j = LJI;
        if (j > 10000) {
            long j2 = LJII;
            if (j2 > 10000) {
                C05630Jz.LJFF(jSONObject, "match_contribute_entrance_display_duration", j - j2);
                LJI = 0L;
                LJII = 0L;
                C05630Jz.LIZ(i, "match_stage", jSONObject);
                C05630Jz.LIZ(i2, "full_display", jSONObject);
                LJIILLIIL("component_identify_result", jSONObject, LJ, LJFF);
            }
        }
        C05630Jz.LIZ(10, "match_contribute_entrance_display_duration", jSONObject);
        LJI = 0L;
        LJII = 0L;
        C05630Jz.LIZ(i, "match_stage", jSONObject);
        C05630Jz.LIZ(i2, "full_display", jSONObject);
        LJIILLIIL("component_identify_result", jSONObject, LJ, LJFF);
    }

    public static void LJIILIIL(int i) {
        String str;
        JSONObject jSONObject = LIZJ;
        int i2 = 0;
        int i3 = 0;
        for (EnumC76429Tz7 enumC76429Tz7 : EnumC76429Tz7.values()) {
            boolean LJ2 = o.LJ(((LinkedHashMap) LIZ).get(enumC76429Tz7.getScene()), Boolean.TRUE);
            if (LJ2) {
                i3++;
            }
            String scene = enumC76429Tz7.getScene();
            if (LJ2) {
                str = "display_success";
            } else {
                str = "display_failed";
            }
            C05630Jz.LJI(jSONObject, scene, str);
        }
        int length = EnumC76429Tz7.values().length - 1;
        if (!LJ) {
            length--;
        }
        if (length == i3) {
            i2 = 1;
        }
        C05630Jz.LIZ(i, "match_stage", jSONObject);
        C05630Jz.LIZ(i2, "full_display", jSONObject);
        long j = LJII;
        if (j > 0) {
            C05630Jz.LJFF(jSONObject, "room_component_load_start_time", j);
            C05630Jz.LJFF(jSONObject, "stay_duration", System.currentTimeMillis() - LJII);
        }
        long j2 = LJII;
        if (j2 > 10000) {
            long j3 = LJI;
            if (j3 > 10000) {
                C05630Jz.LJFF(jSONObject, "match_contribute_entrance_display_duration", j3 - j2);
            }
        }
        LJI = 0L;
        LJII = 0L;
        LJIIZILJ("identify_result", jSONObject, LJ, LJFF);
    }

    public static void LJIILJJIL(SeiAppData sei) {
        int i;
        o.LJIIIZ(sei, "sei");
        JSONObject jSONObject = LIZJ;
        C05630Jz.LJFF(jSONObject, "sei_battle_id", sei.battleId);
        C05630Jz.LJ(jSONObject, "sei_stream_offset", sei.containerOffsetY);
        List<SeiRegion> list = sei.grids;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C05630Jz.LIZ(i, "sei_stream_offset", jSONObject);
        C05630Jz.LIZ(1, "sei_match_stage", jSONObject);
    }

    public static void LJIJ(EnumC76429Tz7 component) {
        Boolean bool;
        C73411SrX c73411SrX;
        o.LJIIIZ(component, "component");
        long LIZ2 = C30725C4b.LIZ();
        if (LJIIJJI < LIZ2) {
            LJIIJJI = LIZ2;
        }
        LIZIZ.put(component.getScene(), "disappear");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("disappearedReason ======");
        LIZ3.append(LJIIIZ);
        LIZ3.append(" and comp = ");
        LIZ3.append(component);
        C0NB.LJ("disappear", X1D.LIZIZ(LIZ3));
        if (LJIIIZ >= 0) {
            LJIIIIZZ = C76265TwT.LIZ.LIZIZ();
            C73411SrX c73411SrX2 = LJIIL;
            if (c73411SrX2 != null) {
                bool = Boolean.valueOf(c73411SrX2.isDisposed());
            } else {
                bool = null;
            }
            if (!C29306Beo.LJIL(bool) && (c73411SrX = LJIIL) != null) {
                c73411SrX.dispose();
            }
            if (LiveMatchComponentDisappearCheckDurationSetting.INSTANCE.getValue() < 0) {
                LJIILL();
            } else {
                LJIIL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(r1.getValue(), TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJLIIL(C75627TmB.LJLIL, C75624Tm8.LJLIL);
            }
        }
    }

    public static void LJIIIIZZ(JSONObject jSONObject, boolean z, boolean z2) {
        C05630Jz.LJFF(jSONObject, "channel_id", B5G.LIZIZ().LJFF);
        C05630Jz.LJFF(jSONObject, "battle_id", C76265TwT.LIZ.LIZIZ());
        C05630Jz.LIZ(z ? 1 : 0, "match_type", jSONObject);
        C05630Jz.LIZ(z2 ? 1 : 0, "invite_type", jSONObject);
    }

    public static void LJIIJ(LinkMicBattleMessage message, boolean z, boolean z2) {
        long j;
        Long l;
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                l = null;
                long j2 = message.actionByUserId;
                if (l != null || l.longValue() != j2) {
                    return;
                }
                LJIILLIIL("component_battle_start", jSONObject, z, z2);
            }
        } else {
            j = 0;
        }
        l = Long.valueOf(j);
        long j22 = message.actionByUserId;
        if (l != null) {
            return;
        }
        LJIILLIIL("component_battle_start", jSONObject, z, z2);
    }

    public static void LJIIJJI(long j, boolean z, boolean z2) {
        if (z2) {
            LJIIIZ(2);
        }
        LIZLLL.put(Long.valueOf(j), Boolean.TRUE);
        LJ = z;
        LJFF = z2;
        JSONObject jSONObject = new JSONObject();
        long LIZ2 = C30725C4b.LIZ();
        LJII = LIZ2;
        C05630Jz.LJFF(jSONObject, "component_load_start_time", LIZ2);
        LJIILLIIL("component_identify_start", jSONObject, z, z2);
        ((LinkedHashMap) LIZ).clear();
        ((LinkedHashMap) LIZIZ).clear();
        LJIILL();
    }

    public static void LJIIL(String str, boolean z, boolean z2) {
        ((LinkedHashMap) LIZ).clear();
        LJ = z;
        LJFF = z2;
        LJII = C30725C4b.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("componentLoadStartTime = ");
        LIZ2.append(LJII);
        LIZ2.append(" --------111111");
        C0NB.LIZIZ("loadTime", X1D.LIZIZ(LIZ2));
        C05630Jz.LJI(LIZJ, "identify_scene", str);
        ((LinkedHashMap) LIZIZ).clear();
        LJIILL();
    }

    public static void LJIJI(EnumC76429Tz7 component, boolean z, java.util.Map map) {
        o.LJIIIZ(component, "component");
        if (map != null) {
            JSONObject jSONObject = LIZJ;
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        LIZ.put(component.getScene(), Boolean.valueOf(z));
    }

    public static void LJIILLIIL(String str, JSONObject jSONObject, boolean z, boolean z2) {
        LJIIIIZZ(jSONObject, z, z2);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C0K2.LIZLLL("ttlive_client_anchor_match_component_monitor", new JSONObject(), null, jSONObject);
        CL5.LIZIZ(str, jSONObject, null, null, true, 1, true);
    }

    public static void LJIIZILJ(String str, JSONObject jSONObject, boolean z, boolean z2) {
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LIZ(C8E.LIZLLL().LLII().getValue(), "cohost_status", LIZJ);
        LJIIIIZZ(jSONObject, z, z2);
        C0K2.LIZLLL("ttlive_client_audience_match_component_monitor", new JSONObject(), null, jSONObject);
        CL5.LIZIZ(str, jSONObject, null, null, true, 1, true);
    }
}
