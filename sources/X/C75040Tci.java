package X;

import com.bytedance.android.livesdk.livesetting.linkmic.ExposeMonitorSwitchSetting;
import defpackage.a1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Tci, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75040Tci {
    public static final java.util.Set<String> LIZ = new LinkedHashSet();
    public static final java.util.Set<String> LIZIZ = new LinkedHashSet();

    public static void LJII() {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            C0NB.LJIIIZ("LinkMicExposeMonitor", "onPageHide");
            java.util.Set<String> set = LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (String str : set) {
                if (!LIZ.contains(str)) {
                    arrayList.add(str);
                }
            }
            LIZIZ.clear();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("pageHide and someItems reported but not expose\n");
            LIZ2.append(arrayList);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            C76173Tuz.LIZ.LIZIZ(30001, LIZIZ2, new Throwable(LIZIZ2), null);
        }
    }

    public static void LIZIZ(String str) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            FP1.LJFF("onExpose: ", str, "LinkMicExposeMonitor");
            LIZ.add(str);
        }
    }

    public static void LIZLLL(String str) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            FP1.LJFF("onExposeNotFound: >>>> ", str, "LinkMicExposeMonitor");
        }
    }

    public static void LJ(String str) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            FP1.LJFF("onExposeReported: ", str, "LinkMicExposeMonitor");
            LIZIZ.add(str);
        }
    }

    public static void LJFF(int i) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onItemAttachMissed(");
            LIZ2.append(i);
            LIZ2.append(')');
            C0NB.LJIIIZ("LinkMicExposeMonitor", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJI(int i) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onItemAttached(");
            LIZ2.append(i);
            LIZ2.append(')');
            C0NB.LJIIIZ("LinkMicExposeMonitor", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJIIIZ(String str) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            FP1.LJFF("onPermitFromInvite: ", str, "LinkMicExposeMonitor");
            LIZIZ.add(str);
        }
    }

    public static void LIZ(String userId, boolean z) {
        String str;
        String LJ;
        o.LJIIIZ(userId, "userId");
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserConnectionSuccess: ");
            LIZ2.append(userId);
            LIZ2.append(' ');
            LIZ2.append(z);
            C0NB.LJIIIZ("LinkMicExposeMonitor", X1D.LIZIZ(LIZ2));
            java.util.Set<String> set = LIZIZ;
            if (!set.contains(userId)) {
                if (z) {
                    str = "apply";
                } else {
                    str = "invite";
                }
                if (LIZ.contains(userId)) {
                    LJ = a1.LJ("connection[", str, "] success but not from expose");
                } else {
                    LJ = a1.LJ("connection[", str, "] not from expose other case");
                }
                C76173Tuz.LIZ.LIZIZ(30001, LJ, new Throwable(LJ), null);
                return;
            }
            set.remove(userId);
        }
    }

    public static void LIZJ(int i, String str) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onExposeFound: ");
            LIZ2.append(str);
            LIZ2.append(' ');
            LIZ2.append(i);
            C0NB.LJIIIZ("LinkMicExposeMonitor", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJIIIIZZ(int i, int i2) {
        if (ExposeMonitorSwitchSetting.INSTANCE.getValue()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPageShow ");
            LIZ2.append(i);
            LIZ2.append(' ');
            LIZ2.append(i2);
            C0NB.LJIIIZ("LinkMicExposeMonitor", X1D.LIZIZ(LIZ2));
        }
    }
}
