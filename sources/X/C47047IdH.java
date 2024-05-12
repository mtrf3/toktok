package X;

import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import kotlin.jvm.internal.o;

/* renamed from: X.IdH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47047IdH {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        if (C46982IcE.LIZIZ().isDebug() || o.LJ(C46982IcE.LIZIZ().getChannel(), "local_test")) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII == null || !LJII.enabled()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r1) {
        /*
            java.lang.String r0 = "errorTag"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1472362992: goto L3f;
                case -782671117: goto L34;
                case -355504186: goto L2b;
                case 16226426: goto L20;
                case 1503668517: goto L17;
                case 1909244093: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = -1
        Ld:
            return r0
        Le:
            java.lang.String r0 = "IE-HideCoverTimeout"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto Lc
        L17:
            java.lang.String r0 = "Short-Pause"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto Lc
        L20:
            java.lang.String r0 = "Pause-B4-Render"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto Lc
        L29:
            r0 = 3
            goto Ld
        L2b:
            java.lang.String r0 = "Stop-B4-Render"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            goto Lc
        L34:
            java.lang.String r0 = "Short-Stop"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            goto Lc
        L3d:
            r0 = 4
            goto Ld
        L3f:
            java.lang.String r0 = "Not-Render"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L48
            goto Lc
        L48:
            r0 = 2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47047IdH.LIZ(java.lang.String):int");
    }

    public static String LIZLLL(Object ownerClass, String methodLabel, Object... extra) {
        o.LJIIIZ(ownerClass, "ownerClass");
        o.LJIIIZ(methodLabel, "methodLabel");
        o.LJIIIZ(extra, "extra");
        StringBuilder sb = new StringBuilder();
        sb.append(ownerClass);
        sb.append(":");
        sb.append(methodLabel);
        int i = 0;
        if (extra.length != 0) {
            sb.append("[");
            for (Object obj : ORY.LJJZZIII(extra)) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    sb.append(obj);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            sb.append("]");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }
}
