package X;

import com.bytedance.ies.abmock.ConfigItem;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FGy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38704FGy {
    public static final C38704FGy LIZ = new C38704FGy();

    public static void LIZJ(String str) {
        Boolean bool;
        if (str == null) {
            return;
        }
        ConfigItem configItem = (ConfigItem) ((HashMap) KUZ.LIZ).get(str);
        if (configItem != null) {
            bool = Boolean.valueOf(configItem.isHybrid);
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            E6T.LIZIZ("not_hybrid", str, null, false, 12);
            return;
        }
        String LJI = FHK.LIZJ.LJI(C38705FGz.LIZJ(str), null);
        if (LJI == null) {
            String msg = a1.LJ("preciseExposeVid ", str, " but vid is null");
            o.LJIIIZ(msg, "msg");
            E6T.LIZIZ("vid_empty", str, null, false, 12);
            return;
        }
        java.util.Map<String, ConfigItem> map = KUZ.LIZIZ;
        o.LJIIIIZZ(map, "getPreciseConfigMap()");
        if (((HashMap) map).containsKey(str)) {
            String msg2 = C0ON.LIZJ("precise expose Vid key:", str, ",vid:", LJI);
            o.LJIIIZ(msg2, "msg");
        } else {
            String msg3 = C0ON.LIZJ("precise expose for full expose experiment Vid key:", str, ",vid:", LJI);
            o.LJIIIZ(msg3, "msg");
        }
        C38682FGc.LIZ.LIZ(LJI, false);
        E6T.LIZIZ("success", str, LJI, false, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(java.lang.String r4, boolean r5) {
        /*
            boolean r3 = X.FH0.LIZ(r4)
            r2 = 0
            if (r3 == 0) goto L18
            if (r4 == 0) goto L16
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = X.FH0.LIZ
            r0.put(r4, r1)
            java.lang.String r1 = "time_out"
            r0 = 4
            X.E6T.LIZIZ(r1, r4, r2, r5, r0)
        L16:
            if (r5 != 0) goto L33
        L18:
            if (r4 == 0) goto L33
            X.FHK r0 = X.FHK.LIZJ
            X.FHP r0 = r0.LIZ
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L33
            if (r3 != 0) goto L2f
            if (r4 == 0) goto L2f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = X.FH0.LIZ
            r0.put(r4, r1)
        L2f:
            LIZJ(r4)
            return r2
        L33:
            java.util.Map<java.lang.String, com.bytedance.ies.abmock.ConfigItem> r0 = X.KUZ.LIZ
            if (r0 == 0) goto L45
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            com.bytedance.ies.abmock.ConfigItem r0 = (com.bytedance.ies.abmock.ConfigItem) r0
            if (r0 == 0) goto L45
            java.lang.Object r0 = r0.defaultValue
            if (r0 != 0) goto L46
        L45:
            return r2
        L46:
            r2 = r0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38704FGy.LIZIZ(java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r6 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r5, boolean r6, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r3 = X.FH0.LIZ(r5)
            r2 = 0
            if (r3 == 0) goto L18
            if (r5 == 0) goto L16
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = X.FH0.LIZ
            r0.put(r5, r1)
            java.lang.String r1 = "time_out"
            r0 = 4
            X.E6T.LIZIZ(r1, r5, r2, r6, r0)
        L16:
            if (r6 != 0) goto L33
        L18:
            if (r5 == 0) goto L33
            X.FHK r0 = X.FHK.LIZJ
            X.FHP r0 = r0.LIZ
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L33
            if (r3 != 0) goto L2f
            if (r5 == 0) goto L2f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = X.FH0.LIZ
            r0.put(r5, r1)
        L2f:
            LIZJ(r5)
            return r2
        L33:
            if (r7 != 0) goto L36
            r7 = r2
        L36:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38704FGy.LIZ(java.lang.String, boolean, java.lang.Object):java.lang.Object");
    }
}
