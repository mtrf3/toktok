package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Tq1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75865Tq1 extends C05630Jz {
    public final long LIZ = SystemClock.uptimeMillis();
    public final JSONObject LIZIZ = new JSONObject();
    public final JSONObject LIZJ = new JSONObject();
    public final JSONObject LIZLLL = new JSONObject();

    public abstract void LJIILIIL();

    public abstract String LJIILJJIL();

    public abstract boolean LJIILL();

    public final void LJIIJJI() {
        LJIIL(this, "cost", Long.valueOf(SystemClock.uptimeMillis() - this.LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r6 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.Throwable r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r0 = r9 instanceof X.C29401Dk
            if (r0 == 0) goto L42
            r1 = r9
            X.1Dk r1 = (X.C29401Dk) r1
            int r0 = r1.getErrorCode()
            long r2 = (long) r0
            java.lang.String r6 = r1.getErrorMsg()
            java.lang.String r7 = "ApiServerException"
            if (r6 != 0) goto L18
        L17:
            r6 = r7
        L18:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r5 = r0.getName()
            org.json.JSONObject r1 = r8.LIZIZ
            java.lang.String r0 = "error_class"
            r4 = 1
            LJIIIZ(r1, r0, r5, r4)
            org.json.JSONObject r1 = r8.LIZIZ
            java.lang.String r0 = "error_class_source"
            LJIIIZ(r1, r0, r7, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            org.json.JSONObject r1 = r8.LIZIZ
            java.lang.String r0 = "error_msg"
            LJIIIZ(r1, r0, r2, r4)
            org.json.JSONObject r1 = r8.LIZLLL
            java.lang.String r0 = "error_detail"
            LJIIIZ(r1, r0, r6, r4)
            return
        L42:
            boolean r0 = r9 instanceof X.C0TL
            if (r0 == 0) goto L57
            r1 = r9
            X.0TL r1 = (X.C0TL) r1
            int r0 = r1.getCronetError()
            long r2 = (long) r0
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "NetworkErrorException"
            if (r6 != 0) goto L18
            goto L17
        L57:
            boolean r0 = r9 instanceof X.C276516r
            if (r0 == 0) goto L6c
            r1 = r9
            X.16r r1 = (X.C276516r) r1
            int r0 = r1.getErrorCode()
            long r2 = (long) r0
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "ApiException"
            if (r6 != 0) goto L18
            goto L17
        L6c:
            boolean r0 = r9 instanceof X.C64799Pbv
            if (r0 == 0) goto L81
            r1 = r9
            X.Pbv r1 = (X.C64799Pbv) r1
            int r0 = r1.getCronetInternalErrorCode()
            long r2 = (long) r0
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "CronetIOException"
            if (r6 != 0) goto L18
            goto L17
        L81:
            java.lang.String r6 = r9.getMessage()
            java.lang.String r7 = "unknow_exception"
            if (r6 != 0) goto L8a
            r6 = r7
        L8a:
            r2 = -1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75865Tq1.LJIIJ(java.lang.Throwable):void");
    }

    public final void LJIILLIIL(String str) {
        String str2;
        long j;
        LJIIIZ(this.LIZIZ, "event_id", str, true);
        LJIIIZ(this.LIZLLL, "event_id", str, true);
        LJIIIZ(this.LIZLLL, "network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()), true);
        LJIIIZ(this.LIZLLL, "server_timestamp", Long.valueOf(C30725C4b.LIZ()), true);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (!Room.isValid(room) || room == null || (str2 = room.getIdStr()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIZ(this.LIZLLL, "room_id", str2, true);
        LJIIIZ(this.LIZLLL, "channel_id", String.valueOf(B5G.LIZIZ().LJFF), false);
        LJIIIZ(this.LIZLLL, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()), true);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        long j2 = 0;
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        LJIIIZ(this.LIZLLL, "user_id", Long.valueOf(j), true);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        }
        LJIIIZ(this.LIZLLL, "anchor_id", Long.valueOf(j2), true);
        LJIIIZ(this.LIZIZ, "is_cross_arc_active", Integer.valueOf(C8E.LIZLLL().eU("MultiCoHostBaseMonitor") ? 1 : 0), false);
        MultiHostService.LJLL.getClass();
        C75873Tq9 c75873Tq9 = MultiHostCrossAdapterImpl.LLFFF;
        c75873Tq9.getClass();
        LJIIIZ(this.LIZIZ, "is_cross_arc_enable", Integer.valueOf(MultiHostCrossAdapterImpl.LLFII ? 1 : 0), true);
        c75873Tq9.getClass();
        LJIIIZ(this.LIZIZ, "is_cross_arc_sdk_enable", Integer.valueOf(MultiHostCrossAdapterImpl.LLFZ ? 1 : 0), true);
        LJIIIZ(this.LIZIZ, "is_biz_new_arch_enable", Integer.valueOf(MultiHostService.LJLLI ? 1 : 0), true);
        c75873Tq9.getClass();
        if (MultiHostCrossAdapterImpl.LLFII) {
            c75873Tq9.getClass();
            if (MultiHostCrossAdapterImpl.LLFZ) {
                LJIIIZ(this.LIZIZ, "inner_channel_id", Long.valueOf(C8E.LIZLLL().LLIILZL()), true);
                if (C8E.LIZLLL().eU("MultiCoHostBaseMonitor")) {
                    LJIIIZ(this.LIZIZ, "group_channel_id", U26.LIZ(), true);
                }
            }
        }
        LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eventId:");
        LIZ.append(str);
        LIZ.append(" extra:");
        LIZ.append(this.LIZLLL);
        LIZ.append(" category:");
        LIZ.append(this.LIZIZ);
        TYQ.LIZLLL("ttlive_cohost", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = this.LIZIZ;
        JSONObject jSONObject2 = this.LIZJ;
        JSONObject jSONObject3 = this.LIZLLL;
        LJIIIIZZ(jSONObject3, jSONObject);
        LJIIIIZZ(jSONObject3, jSONObject2);
        C0K2.LIZ.LJI(LJIILJJIL(), jSONObject, jSONObject2, jSONObject3);
        CL5.LIZIZ(str, this.LIZLLL, this.LIZIZ, this.LIZJ, false, 0, LJIILL());
    }

    public static final void LJIIIIZZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        o.LJIIIIZZ(keys, "source.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    public static void LJIIL(AbstractC75865Tq1 abstractC75865Tq1, String str, Object obj) {
        abstractC75865Tq1.getClass();
        LJIIIZ(abstractC75865Tq1.LIZJ, str, obj, true);
    }

    public static final void LJIIIZ(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (jSONObject.has(str) && !z) {
            return;
        }
        if (obj instanceof Integer) {
            C05630Jz.LIZ(((Number) obj).intValue(), str, jSONObject);
            return;
        }
        if (obj instanceof Long) {
            C05630Jz.LJFF(jSONObject, str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            C05630Jz.LJ(jSONObject, str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            C05630Jz.LIZLLL(jSONObject, str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            C05630Jz.LJI(jSONObject, str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            C05630Jz.LJII(jSONObject, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof JSONObject) {
            C05630Jz.LIZJ(str, jSONObject, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            C05630Jz.LIZIZ(str, (JSONArray) obj, jSONObject);
        } else {
            C05630Jz.LJI(jSONObject, str, obj.toString());
        }
    }
}
