package X;

import Y.ACListenerS39S0200000_4;
import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import defpackage.b0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.o;

/* renamed from: X.M4a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56204M4a {
    public static final void LJIIIIZZ() {
        OSZ<Integer, Boolean> selectedBarInfo;
        MM4 LIZIZ = LA9.LIZIZ();
        if (LIZIZ == null || (selectedBarInfo = LIZIZ.getSelectedBarInfo()) == null) {
            return;
        }
        LJII(selectedBarInfo.getFirst().intValue(), selectedBarInfo.getSecond().booleanValue(), false);
    }

    public static final int LIZ(int i) {
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(topActivity, "getTopActivity()");
        Integer LJI = C79045V0n.LJI(i, topActivity);
        if (LJI != null) {
            return LJI.intValue();
        }
        return 0;
    }

    public static final String LIZIZ(int i) {
        String string = ActivityStack.getTopActivity().getString(i);
        o.LJIIIIZZ(string, "getTopActivity().getString(resId)");
        return string;
    }

    public static final <T> T LIZJ(InterfaceC65784Pro<? extends T> block) {
        o.LJIIIZ(block, "block");
        if (LA9.LIZ(true)) {
            return block.invoke();
        }
        return null;
    }

    public static final void LIZLLL(String msg) {
        o.LJIIIZ(msg, "msg");
        C221018lt.LJFF("Creators_Inbox", msg);
    }

    public static final void LJ(String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("metrics-");
        LIZ.append(msg);
        LIZLLL(X1D.LIZIZ(LIZ));
    }

    public static final String LJI(int i) {
        int i2;
        if (i < 1000) {
            return String.valueOf(i);
        }
        if (i > 98499) {
            return "99k";
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(i));
        BigDecimal bigDecimal2 = new BigDecimal("1000");
        boolean z = true;
        if (i < 10000) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        double doubleValue = bigDecimal.divide(bigDecimal2, i2, RoundingMode.HALF_UP).doubleValue();
        if (doubleValue % 1.0d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z = false;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            return b0.LIZJ(LIZ, (int) doubleValue, 'k', LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(doubleValue);
        LIZ2.append('k');
        return X1D.LIZIZ(LIZ2);
    }

    public static final void LJFF(View view, InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(block, "block");
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(view, block, 98), view);
    }

    public static void LJIIIZ(View view, Integer num) {
        LIZJ(new C141605h6(view, null, null, null, num));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r5 != 3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(int r5, boolean r6, boolean r7) {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = ""
            if (r7 == 0) goto L47
            java.lang.String r1 = "notification_page"
        Lb:
            java.lang.String r0 = "enter_from"
            r3.put(r0, r1)
            if (r7 == 0) goto L44
            java.lang.String r1 = "click_tab"
        L14:
            java.lang.String r0 = "enter_method"
            r3.put(r0, r1)
            r1 = 3
            if (r5 != r1) goto L35
            if (r6 == 0) goto L32
            java.lang.String r1 = "1"
        L20:
            java.lang.String r0 = "show_cnt"
            r3.put(r0, r1)
        L25:
            java.lang.String r4 = "request"
        L27:
            java.lang.String r0 = "tab_name"
            r3.put(r0, r4)
            java.lang.String r0 = "enter_im_tab"
            X.FMX.LJIIL(r0, r3)
            return
        L32:
            java.lang.String r1 = "0"
            goto L20
        L35:
            r0 = 1
            if (r5 == r0) goto L41
            r0 = 2
            if (r5 == r0) goto L3e
            if (r5 == r1) goto L25
            goto L27
        L3e:
            java.lang.String r4 = "secondary"
            goto L27
        L41:
            java.lang.String r4 = "primary"
            goto L27
        L44:
            java.lang.String r1 = "go_back_tab"
            goto L14
        L47:
            android.app.Activity r2 = X.C84763XOl.LJIIIIZZ()
            boolean r1 = r2 instanceof X.InterfaceC55058LjC
            r0 = 0
            if (r1 == 0) goto L6e
            X.LjC r2 = (X.InterfaceC55058LjC) r2
        L52:
            boolean r0 = r2 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6c
            X.1qj r2 = (X.ActivityC45651qj) r2
            if (r2 == 0) goto L6c
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C78866UxK.LJJLIIIJJI(r2)
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1JD.LJIJJLI(r0)
            if (r0 == 0) goto L6c
            java.lang.String r1 = r0.nH()
            if (r1 != 0) goto Lb
        L6c:
            r1 = r4
            goto Lb
        L6e:
            r2 = r0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56204M4a.LJII(int, boolean, boolean):void");
    }
}
