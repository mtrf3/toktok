package com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service;

import X.C58096Mr6;
import X.C78948Uye;
import X.C79234V7u;
import X.InterfaceC71003Rtn;
import X.OGE;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PdpCardBridgeServiceImpl implements IPdpCardBridgeService {
    public static IPdpCardBridgeService LJI() {
        Object LIZ = C58096Mr6.LIZ(IPdpCardBridgeService.class, false);
        if (LIZ != null) {
            return (IPdpCardBridgeService) LIZ;
        }
        if (C58096Mr6.L == null) {
            synchronized (IPdpCardBridgeService.class) {
                if (C58096Mr6.L == null) {
                    C58096Mr6.L = new PdpCardBridgeServiceImpl();
                }
            }
        }
        return C58096Mr6.L;
    }

    public static JSONArray LJII(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof Map) {
                try {
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    jSONArray.put(LJIIIIZZ((Map) obj));
                } catch (Exception unused) {
                }
            } else if (obj instanceof List) {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                jSONArray.put(LJII((List) obj));
            }
        }
        return jSONArray;
    }

    public static JSONObject LJIIIIZZ(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(str, ((Number) value).longValue());
            } else {
                boolean z = false;
                if (value instanceof Float) {
                    float floatValue = ((Number) value).floatValue();
                    if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue)) {
                        z = true;
                    }
                    if (z) {
                        jSONObject.put(str, r5.floatValue());
                    }
                } else if (value instanceof Integer) {
                    jSONObject.put(str, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    Number number = (Number) value;
                    double doubleValue = number.doubleValue();
                    if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
                        z = true;
                    }
                    if (z) {
                        jSONObject.put(str, number.doubleValue());
                    }
                } else if (value instanceof String) {
                    jSONObject.put(str, value);
                } else if (value instanceof Boolean) {
                    jSONObject.put(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Map) {
                    try {
                        jSONObject.put(str, LJIIIIZZ((Map) value));
                    } catch (Exception unused) {
                    }
                } else if (value instanceof List) {
                    jSONObject.put(str, LJII((List) value));
                }
            }
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final void LIZIZ(OGE oge) {
        if (oge != null) {
            oge.jf();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final HashMap<String, Object> LIZJ(InterfaceC71003Rtn interfaceC71003Rtn) {
        LaneParams LJIILJJIL;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (interfaceC71003Rtn != null && (LJIILJJIL = C78948Uye.LJIILJJIL(interfaceC71003Rtn, "lib_track_builtin_lane_business")) != null) {
            for (Map.Entry<String, Object> entry : LJIILJJIL.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(entry.getKey(), value);
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61430O9a LJ(android.view.View r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L52
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto L52
            android.view.ViewParent r2 = r0.getParent()
        Ld:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L4f
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L50
            android.view.ViewParent r1 = r2.getParent()
        L19:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L20
            r6 = r1
            android.view.View r6 = (android.view.View) r6
        L20:
            r5 = 0
            if (r6 == 0) goto L4d
            int r4 = r6.getHeight()
        L27:
            if (r2 == 0) goto L4b
            int r3 = r2.getTop()
        L2d:
            r0 = 1
            if (r6 == 0) goto L49
            boolean r0 = r6.canScrollVertically(r0)
        L34:
            r2 = r0 ^ 1
            X.O9a r1 = new X.O9a
            int r4 = r4 - r3
            if (r4 >= 0) goto L47
        L3b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r0 = X.C79081V1x.LJJIIZI(r0)
            r1.<init>(r2, r0)
            return r1
        L47:
            r5 = r4
            goto L3b
        L49:
            r0 = 0
            goto L34
        L4b:
            r3 = 0
            goto L2d
        L4d:
            r4 = 0
            goto L27
        L4f:
            r2 = r6
        L50:
            r1 = r6
            goto L19
        L52:
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl.LJ(android.view.View):X.O9a");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final String LIZ(OGE oge, int i) {
        if (oge != null) {
            return oge.Nx(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.InterfaceC71003Rtn r11, java.lang.String r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl.LJFF(X.Rtn, java.lang.String, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final void LIZLLL(InterfaceC71003Rtn interfaceC71003Rtn, Context context, String schema, Map<String, ? extends Object> map) {
        o.LJIIIZ(schema, "schema");
        if (context != null && interfaceC71003Rtn != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, schema);
            o.LJIIIIZZ(buildRoute, "buildRoute(context, schema)");
            C79234V7u.LJJIJIIJIL(buildRoute, interfaceC71003Rtn, new AqS176S0100000_10(map, (Map<String, ? extends Object>) 44));
            buildRoute.open();
        }
    }
}
