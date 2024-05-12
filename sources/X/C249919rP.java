package X;

import Y.IDComparatorS32S0000000_4;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.NormalPendant;
import com.bytedance.touchpoint.core.model.TimerPendant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9rP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249919rP {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(X.C9OT r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L5
            goto L7
        L5:
            r0 = r2
            goto Lf
        L7:
            com.bytedance.touchpoint.core.model.NormalPendant r0 = r3.LJLIL     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L5
            java.lang.String r0 = r0.normalJumpLink     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L5
        Lf:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = "event_keyword"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L1c
            r2 = r0
        L1c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249919rP.LIZJ(X.9OT):java.lang.String");
    }

    public static int LIZLLL(C9OT c9ot) {
        NormalPendant normalPendant;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null) {
            return normalPendant.showAfter;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r12 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r12 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        if (r12 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(X.C9OT r12) {
        /*
            r11 = 0
            if (r12 == 0) goto L71
            com.bytedance.touchpoint.core.model.NormalPendant r0 = r12.LJLIL
            if (r0 == 0) goto L71
            com.bytedance.touchpoint.core.model.CloseFrequentLimit r0 = r0.closeFrequentLimit
            if (r0 == 0) goto L71
            int r5 = r0.daysWindow
        Ld:
            com.bytedance.touchpoint.core.model.NormalPendant r0 = r12.LJLIL
            if (r0 == 0) goto L75
            com.bytedance.touchpoint.core.model.CloseFrequentLimit r0 = r0.closeFrequentLimit
            if (r0 == 0) goto L75
            int r2 = r0.maxClose
        L17:
            com.bytedance.touchpoint.core.model.NormalPendant r0 = r12.LJLIL
            if (r0 == 0) goto L79
            com.bytedance.touchpoint.core.model.CloseFrequentLimit r0 = r0.closeFrequentLimit
            if (r0 == 0) goto L79
            int r1 = r0.daysNoShow
        L21:
            com.bytedance.touchpoint.core.model.NormalPendant r0 = r12.LJLIL
            if (r0 == 0) goto L7d
            com.bytedance.touchpoint.core.model.CloseFrequentLimit r0 = r0.closeFrequentLimit
            if (r0 == 0) goto L7d
            java.lang.Integer r0 = r0.hoursNoShow
            if (r0 == 0) goto L7d
            int r10 = r0.intValue()
        L31:
            X.9rR r9 = X.C250079rf.LIZ
            r9.LIZJ = r5
            r9.LIZLLL = r2
            r9.LJ = r1
            r9.LJFF = r10
            r8 = 1
            r3 = -1
            java.lang.String r7 = "not_show_before_stamp"
            if (r5 == 0) goto L44
            if (r2 != 0) goto L4c
        L44:
            com.bytedance.keva.Keva r0 = r9.LIZLLL()
            r0.storeLong(r7, r3)
        L4b:
            return r8
        L4c:
            com.bytedance.keva.Keva r0 = r9.LIZLLL()
            long r5 = r0.getLong(r7, r3)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4b
            if (r10 > 0) goto L6c
            long r1 = X.C249939rR.LIZ()
        L60:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L7f
            com.bytedance.keva.Keva r0 = r9.LIZLLL()
            r0.storeLong(r7, r3)
            goto L4b
        L6c:
            long r1 = java.lang.System.currentTimeMillis()
            goto L60
        L71:
            r5 = 0
            if (r12 == 0) goto L75
            goto Ld
        L75:
            r2 = 0
            if (r12 == 0) goto L79
            goto L17
        L79:
            r1 = 0
            if (r12 == 0) goto L7d
            goto L21
        L7d:
            r10 = 0
            goto L31
        L7f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249919rP.LJ(X.9OT):boolean");
    }

    public static boolean LJFF(C9OT c9ot) {
        int i;
        NormalPendant normalPendant;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null) {
            i = normalPendant.showTimes;
        } else {
            i = 0;
        }
        if (C250079rf.LIZ.LIZJ() + 1 > i) {
            return false;
        }
        return true;
    }

    public static String LIZ(C9OT c9ot, String widgetName) {
        TimerPendant timerPendant;
        String str;
        NormalPendant normalPendant;
        String str2;
        o.LJIIIZ(widgetName, "widgetName");
        if (o.LJ(widgetName, "non_tracker")) {
            if (c9ot != null && (normalPendant = c9ot.LJLIL) != null && (str2 = normalPendant.activityId) != null) {
                return str2;
            }
        } else if (c9ot != null && (timerPendant = c9ot.LJLILLLLZI) != null && (str = timerPendant.activityId) != null) {
            return str;
        }
        return "";
    }

    public static List LIZIZ(int i, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ActivityTask activityTask = (ActivityTask) it.next();
                if (activityTask.taskType == i) {
                    arrayList.add(activityTask);
                }
            }
            if (arrayList.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS32S0000000_4(5));
            }
        }
        return arrayList;
    }
}
