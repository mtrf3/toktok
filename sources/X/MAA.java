package X;

import Y.AfS61S0100000_9;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MAA {
    public static volatile boolean LIZ;
    public static int LIZJ;
    public static String LIZIZ = "";
    public static String LIZLLL = "";
    public static String LJ = "";

    public static void LIZ(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        if (((Number) C53108Ksq.LIZ.getValue()).intValue() == 0 || !context.getPackageManager().hasSystemFeature("android.software.app_widgets") || LIZ) {
            return;
        }
        LIZ = true;
        if (C56363MAd.LIZIZ(context).length == 0) {
            i = 1;
        } else {
            i = 0;
        }
        FMX.LJIILL("launch_widget_info", new OSZ(Integer.valueOf(i ^ 1), "has_widget"));
        ((RBX) HG3.LJIILL()).addUserChangeListener(new MAB(context));
        C84763XOl.LJI().LJJJJZI(new AfS61S0100000_9(context, 24));
        LIZIZ(context, "init");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r10, java.lang.String r11) {
        /*
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "refreshWidget ["
            r1.append(r0)
            r1.append(r11)
            r0 = 93
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            com.bytedance.keva.Keva r0 = X.C56363MAd.LIZ()
            java.lang.String r7 = "widgetVersionKey"
            r4 = 0
            long r8 = r0.getLong(r7, r4)
            long r1 = X.EF7.LJI()
            java.lang.String r6 = "widgetUserKey"
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L58
            com.bytedance.keva.Keva r1 = X.C56363MAd.LIZ()
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r6, r0)
            java.lang.String r0 = "keva.getString(widgetUserKey, \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.HG3.LJIIL()
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL
            X.RBY r0 = r0.LJFF()
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L9b
        L58:
            r3 = 1
        L59:
            long r1 = X.EF7.LJI()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L68
            com.bytedance.keva.Keva r0 = X.C56363MAd.LIZ()
            r0.storeLong(r7, r1)
        L68:
            X.HG3.LJIIL()
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL
            X.RBY r0 = r0.LJFF()
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = X.C56363MAd.LJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L84
            com.bytedance.keva.Keva r0 = X.C56363MAd.LIZ()
            r0.storeString(r6, r1)
        L84:
            if (r3 == 0) goto L92
            int[] r0 = X.C56363MAd.LIZIZ(r10)
            java.util.List r0 = X.ORY.LJLI(r0)
            X.C56363MAd.LIZLLL(r10, r0)
        L91:
            return
        L92:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.C56363MAd.LIZLLL(r10, r0)
            goto L91
        L9b:
            r3 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAA.LIZIZ(android.content.Context, java.lang.String):void");
    }
}
