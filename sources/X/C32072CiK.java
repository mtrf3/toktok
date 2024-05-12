package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CiK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32072CiK {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public static final int LIZ(EnumC32070CiI messageScene) {
        o.LJIIIZ(messageScene, "messageScene");
        int i = C32071CiJ.LIZ[messageScene.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new C162476Zf();
        }
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r6) {
        /*
            boolean r0 = X.CN0.LIZ
            r5 = 1
            if (r0 == 0) goto L6
            return r5
        L6:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1983264146: goto L2b;
                case -1365631818: goto L14;
                case -254278833: goto L22;
                case 2035736517: goto Le;
                default: goto Ld;
            }
        Ld:
            return r5
        Le:
            java.lang.String r0 = "message_p2p_dispatch_direct"
            r6.equals(r0)
            goto Ld
        L14:
            java.lang.String r0 = "message_dispatch_delay"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ld
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            goto L39
        L22:
            java.lang.String r0 = "message_dispatch_list_delay"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L34
            goto Ld
        L2b:
            java.lang.String r0 = "message_dispatch_size"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L34
            goto Ld
        L34:
            r3 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        L39:
            double r1 = java.lang.Math.random()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L42
            goto Ld
        L42:
            r5 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32072CiK.LIZIZ(java.lang.String):boolean");
    }
}
