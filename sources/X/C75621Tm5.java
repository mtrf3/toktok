package X;

import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tm5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75621Tm5 extends C05630Jz {
    public static final java.util.Map<String, Boolean> LIZ = new LinkedHashMap();
    public static final LruCache<Long, Integer> LIZIZ = new LruCache<>(3);
    public static String LIZJ = "";
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;

    public static void LJIIIIZZ() {
        String str;
        if (LIZLLL == B5G.LIZIZ().LJFF) {
            return;
        }
        LIZLLL = B5G.LIZIZ().LJFF;
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        int i2 = 0;
        for (EnumC75623Tm7 enumC75623Tm7 : EnumC75623Tm7.values()) {
            boolean LJ2 = o.LJ(((LinkedHashMap) LIZ).get(enumC75623Tm7.getScene()), Boolean.TRUE);
            if (LJ2) {
                i2++;
            }
            String scene = enumC75623Tm7.getScene();
            if (LJ2) {
                str = "display_success";
            } else {
                str = "display_failed";
            }
            C05630Jz.LJI(jSONObject, scene, str);
        }
        if (EnumC75623Tm7.values().length == i2) {
            i = 1;
        }
        C05630Jz.LIZ(i, "full_display", jSONObject);
        C05630Jz.LIZ(C8E.LIZLLL().LLII().getValue(), "status", jSONObject);
        LJIIL("component_identify_result", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI() {
        /*
            android.util.LruCache<java.lang.Long, java.lang.Integer> r4 = X.C75621Tm5.LIZIZ
            long r0 = X.C75621Tm5.LJFF
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 2
            if (r0 != 0) goto L56
        L11:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            long r0 = X.C75621Tm5.LJFF
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r0)
            X.Tm7[] r8 = X.EnumC75623Tm7.values()
            int r5 = r8.length
            r6 = 0
            r4 = 0
            r7 = 0
        L2b:
            if (r4 >= r5) goto L5d
            r2 = r8[r4]
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = X.C75621Tm5.LIZ
            java.lang.String r0 = r2.getScene()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L45
            int r7 = r7 + 1
        L45:
            java.lang.String r1 = r2.getScene()
            if (r0 == 0) goto L53
            java.lang.String r0 = "display_success"
        L4d:
            X.C05630Jz.LJI(r3, r1, r0)
            int r4 = r4 + 1
            goto L2b
        L53:
            java.lang.String r0 = "display_failed"
            goto L4d
        L56:
            int r0 = r0.intValue()
            if (r0 != r2) goto L11
            return
        L5d:
            long r4 = X.C75621Tm5.LJ
            java.lang.String r10 = "match_contribute_entrance_display_duration"
            r8 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb3
            long r1 = X.C75621Tm5.LJI
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb3
            long r4 = r4 - r1
            X.C05630Jz.LJFF(r3, r10, r4)
        L71:
            r0 = 0
            X.C75621Tm5.LJI = r0
            X.C75621Tm5.LJ = r0
            X.Tm7[] r0 = X.EnumC75623Tm7.values()
            int r1 = r0.length
            r0 = 1
            int r1 = r1 - r0
            if (r1 != r7) goto L81
            r6 = 1
        L81:
            java.lang.String r0 = "full_display"
            X.C05630Jz.LIZ(r6, r0, r3)
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r0 = X.B5G.LIZIZ()
            long r0 = r0.LJFF
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "channel_id"
            X.C05630Jz.LJI(r3, r0, r1)
            java.lang.String r2 = "sei_channel_id"
            long r0 = X.C75621Tm5.LJFF
            X.C05630Jz.LJFF(r3, r2, r0)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C8E.LIZLLL()
            X.Tm4 r0 = r0.LLII()
            int r1 = r0.getValue()
            java.lang.String r0 = "status"
            X.C05630Jz.LIZ(r1, r0, r3)
            java.lang.String r0 = "component_identify_result"
            LJIILIIL(r0, r3)
            return
        Lb3:
            r0 = 10
            X.C05630Jz.LJFF(r3, r10, r0)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75621Tm5.LJIIJJI():void");
    }

    public static void LJIIIZ(String str) {
        if (o.LJ(LIZJ, str)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        LIZJ = str;
        ((LinkedHashMap) LIZ).clear();
        LJIIL("component_will_join", new JSONObject());
    }

    public static void LJIIJ(long j) {
        LruCache<Long, Integer> lruCache = LIZIZ;
        Integer num = lruCache.get(Long.valueOf(j));
        if (num != null && num.intValue() != 0) {
            return;
        }
        lruCache.put(Long.valueOf(j), 1);
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "channel_id", j);
        LJI = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("--------1111----loadSuccess = ");
        LIZ2.append(LJI);
        C0NB.LIZIZ("loadTimeCohost", X1D.LIZIZ(LIZ2));
        LJFF = j;
        LJIILIIL("component_identify_beigin", jSONObject);
    }

    public static void LJIILJJIL(EnumC75623Tm7 component) {
        o.LJIIIZ(component, "component");
        LIZ.put(component.getScene(), Boolean.TRUE);
    }

    public static void LJIIL(String str, JSONObject jSONObject) {
        C05630Jz.LJI(jSONObject, "channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJII(jSONObject, "is_sdk", C8E.LIZLLL().LLIFFJFJJ());
        C0K2.LIZLLL("ttlive_client_anchor_cohost_component_monitor", new JSONObject(), null, jSONObject);
        CL5.LIZIZ(str, jSONObject, null, null, true, 0, true);
    }

    public static void LJIILIIL(String str, JSONObject jSONObject) {
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJII(jSONObject, "is_sdk", C8E.LIZLLL().LLIFFJFJJ());
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_audience_cohost_component_monitor", 0.2d)) {
            C0K2.LIZLLL("ttlive_client_audience_cohost_component_monitor", new JSONObject(), null, jSONObject);
        }
        CL5.LIZIZ(str, jSONObject, null, null, true, 0, true);
    }
}
