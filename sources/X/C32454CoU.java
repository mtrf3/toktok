package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CoU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32454CoU {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String LJJL = O5Y.LJJL(str);
        o.LJIIIIZZ(LJJL, "suffixAll(name)");
        return LJJL;
    }

    public static String LIZIZ(String str) {
        String LJJLI = O5Y.LJJLI(str);
        o.LJIIIIZZ(LJJLI, "suffixError(name)");
        return LJJLI;
    }

    public static final void LIZLLL(long j) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        User user = (User) interfaceC05190Ih;
        hashMap.put("user_id", Long.valueOf(user.getId()));
        hashMap.put("gift_id", Long.valueOf(j));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", Long.valueOf(room.getId()));
        }
        C0K2.LJII(1, LIZ("ttlive_fast_gift_send"), hashMap);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str = EnumC30551Byt.Gift.info;
        LIZIZ.getClass();
        BKQ.LJ(hashMap, str, "ttlive_fast_gift_send");
        BZI LIZ2 = C28787BRn.LIZ("ttlive_fast_gift_send");
        LIZ2.LJIJJ(Long.valueOf(user.getId()), "user_id");
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJFF(Throwable th) {
        HashMap hashMap = new HashMap();
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        hashMap.put("user_id", Long.valueOf(((User) interfaceC05190Ih).getId()));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", Long.valueOf(room.getId()));
        }
        if (th != null) {
            if (th instanceof C276516r) {
                hashMap.put("error_code", Integer.valueOf(((C276516r) th).getErrorCode()));
            } else {
                hashMap.put("error_code", 0);
            }
            hashMap.put("error_msg", th.getMessage());
        }
        if (room != null && room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableGift()) {
            C0K2.LJIIL(0L, 1, LIZ("ttlive_gift_disable_but_sent"), hashMap);
            C0K2.LJII(1, LIZIZ("ttlive_gift_disable_but_sent"), hashMap);
            BKQ LIZIZ = BKQ.LIZIZ();
            String str = EnumC30551Byt.Gift.info;
            LIZIZ.getClass();
            BKQ.LJ(hashMap, str, "ttlive_gift_disable_but_sent");
        }
    }

    public static final void LIZJ(long j, Throwable th) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        User user = (User) interfaceC05190Ih;
        hashMap.put("user_id", String.valueOf(user.getId()));
        hashMap2.put("user_id", String.valueOf(user.getId()));
        hashMap.put("gift_id", String.valueOf(j));
        hashMap2.put("gift_id", String.valueOf(j));
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap2.put("room_id", String.valueOf(room.getId()));
        }
        if (th != null) {
            if (th instanceof C276516r) {
                C276516r c276516r = (C276516r) th;
                hashMap.put("error_code", String.valueOf(c276516r.getErrorCode()));
                hashMap2.put("error_code", String.valueOf(c276516r.getErrorCode()));
            }
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            hashMap.put("error_msg", message);
            hashMap2.put("error_msg", th.getMessage());
        }
        C0K2.LJII(1, LIZ("ttlive_fast_gift_send"), hashMap2);
        C0K2.LJII(1, LIZIZ("ttlive_fast_gift_send"), hashMap2);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str = EnumC30551Byt.Gift.info;
        LIZIZ.getClass();
        BKQ.LJ(hashMap, str, "ttlive_fast_gift_send");
        BZI LIZ2 = C28787BRn.LIZ("ttlive_fast_gift_send");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJII(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        hashMap.put("gift_icon_url", str);
        C0K2.LJII(0, LIZ("ttlive_gift_icon_load_status"), hashMap);
    }

    public static final void LJI(long j, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        hashMap.put("error_msg", str2);
        C0K2.LJII(1, LIZ("ttlive_gift_icon_load_status"), hashMap);
        C0K2.LJII(1, LIZIZ("ttlive_gift_icon_load_status"), hashMap);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str3 = EnumC30551Byt.Gift.info;
        LIZIZ.getClass();
        BKQ.LJ(hashMap, str3, "ttlive_gift_icon_load_status");
    }

    public static void LJ(long j, long j2, int i, int i2, String str) {
        C65032gt.LIZ(new RunnableC32453CoT(j, j2, i, i2, str));
    }

    public static final void LJIIIZ(long j, long j2, long j3, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("duration", j2);
            jSONObject2.put("send_click_duration", j3);
            jSONObject.put("error_code", 0);
            jSONObject.put("connection_type", str2);
            jSONObject3.put("error_code", 0);
            jSONObject3.put("gift_id", j);
            if (C38354F3m.LJ(str)) {
                str = "direct_gift_tab";
            }
            jSONObject3.put("gift_enter_from", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C0K2.LJI(LIZ("ttlive_gift_send_status"), jSONObject, jSONObject2, jSONObject3);
    }

    public static final void LJIIIIZZ(long j, long j2, Throwable th, long j3, long j4, String str) {
        int i;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
        }
        if (th instanceof C276516r) {
            C276516r c276516r = (C276516r) th;
            hashMap.put("error_code", Integer.valueOf(c276516r.getErrorCode()));
            i = c276516r.getErrorCode();
        } else {
            i = 0;
            hashMap.put("error_code", 0);
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("duration", j3);
            jSONObject2.put("send_click_duration", j4);
            jSONObject.put("error_code", i);
            jSONObject.put("error_msg", str2);
            jSONObject.put("connection_type", str);
            jSONObject3.put("error_msg", str2);
            jSONObject3.put("error_code", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C0K2.LJ(LIZIZ("ttlive_gift_send_status"), jSONObject, jSONObject2, jSONObject3);
        C0K2.LJI(LIZ("ttlive_gift_send_status"), jSONObject, jSONObject2, jSONObject3);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str3 = EnumC30551Byt.Gift.info;
        LIZIZ.getClass();
        BKQ.LJ(hashMap, str3, "ttlive_gift_send_status");
    }
}
