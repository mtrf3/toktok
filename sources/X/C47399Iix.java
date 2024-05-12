package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* renamed from: X.Iix, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47399Iix {
    public static boolean LIZ;

    public static String LIZ(java.util.Map<String, Float> map) {
        if (map == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        try {
            if (map.isEmpty()) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            Map.Entry<String, Float> entry = null;
            for (Map.Entry<String, Float> entry2 : map.entrySet()) {
                if (entry2 != null && (entry == null || entry.getValue().floatValue() < entry2.getValue().floatValue())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return entry.getKey();
        } catch (Throwable unused) {
            return CardStruct.IStatusCode.DEFAULT;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.String r6) {
        /*
            r6.getClass()
            int r0 = r6.hashCode()
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            r1 = -1
            switch(r0) {
                case 49: goto L34;
                case 50: goto L2b;
                case 51: goto L22;
                case 1444: goto L19;
                case 1445: goto L10;
                default: goto Lf;
            }
        Lf:
            return r2
        L10:
            java.lang.String r0 = "-2"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L3d
            goto Lf
        L19:
            java.lang.String r0 = "-1"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L3f
            goto Lf
        L22:
            java.lang.String r0 = "3"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L40
            goto Lf
        L2b:
            java.lang.String r0 = "2"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L41
            goto Lf
        L34:
            java.lang.String r0 = "1"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L42
            goto Lf
        L3d:
            r0 = -2
            return r0
        L3f:
            return r1
        L40:
            return r5
        L41:
            return r4
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47399Iix.LIZIZ(java.lang.String):int");
    }

    public static String LIZJ(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case C61447O9r.LJIIJ /* 49 */:
                if (!str.equals("1")) {
                    return "static";
                }
                return "bycar";
            case 50:
                if (!str.equals("2")) {
                    return "static";
                }
                return "walking";
            case 51:
                if (!str.equals("3")) {
                    return "static";
                }
                return "lying";
            case 1444:
                if (!str.equals("-1")) {
                    return "static";
                }
                return "disable";
            case 1445:
                if (!str.equals("-2")) {
                    return "static";
                }
                return "error";
            default:
                return "static";
        }
    }
}
