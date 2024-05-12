package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeAllowListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveHotDegradeSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.C5h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30757C5h {
    public static boolean LIZ(String str) {
        boolean z;
        boolean z2;
        int value = LiveALogAndMonitorDegradeSetting.INSTANCE.getValue();
        List<String> list = LiveALogAndMonitorDegradeAllowListSetting.INSTANCE.getValue().aLogList;
        if (value == 1 || value == 2 || LiveHotDegradeSetting.INSTANCE.disableLog()) {
            z = true;
        } else {
            z = false;
        }
        if (C38354F3m.LJ(str) || list == null || list.isEmpty()) {
            z2 = false;
        } else {
            z2 = ORZ.LJLJJI(str, list);
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(int i, String name) {
        boolean z;
        boolean z2;
        o.LJIIIZ(name, "name");
        int value = LiveALogAndMonitorDegradeSetting.INSTANCE.getValue();
        List<String> list = LiveALogAndMonitorDegradeAllowListSetting.INSTANCE.getValue().monitorList;
        boolean z3 = true;
        if (value == 2 || LiveHotDegradeSetting.INSTANCE.disableLog()) {
            z = true;
        } else {
            z = false;
        }
        if (C38354F3m.LJ(name) || list == null || list.isEmpty()) {
            z2 = false;
        } else {
            z2 = list.contains(name);
        }
        if (!z || z2) {
            return false;
        }
        if (i == 1 ? ((int) (Math.random() * 100)) == 1 : i == 2 && ((int) (Math.random() * 1000)) == 1) {
            z3 = false;
        }
        return z3;
    }
}
