package X;

import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MHh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56549MHh {
    public static final void LIZ(String str, String pageName, long j, long j2, long j3, boolean z, InterfaceC56535MGt interfaceC56535MGt) {
        boolean z2;
        o.LJIIIZ(pageName, "pageName");
        boolean z3 = false;
        if (pageName.length() == 0 || j2 <= 0 || j3 <= 0 || j <= 0) {
            return;
        }
        if (str == null) {
            str = "";
        }
        TaskTraceMetric remove = C44206HWo.LIZ.remove(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (remove != null) {
            Long valueOf = Long.valueOf(remove.taskExecuteStartTime);
            if (valueOf.longValue() >= j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                linkedHashMap.put("to_execute_stime", String.valueOf(valueOf.longValue() - j));
            }
            Long valueOf2 = Long.valueOf(remove.taskExecuteEndTime);
            if (valueOf2.longValue() >= j) {
                linkedHashMap.put("to_execute_etime", String.valueOf(valueOf2.longValue() - j));
            }
            Long valueOf3 = Long.valueOf(remove.shootStartTime);
            if (valueOf3.longValue() >= j) {
                linkedHashMap.put("to_shoot_stime", String.valueOf(valueOf3.longValue() - j));
            }
            Long valueOf4 = Long.valueOf(remove.shootEndTime);
            if (valueOf4.longValue() >= j) {
                linkedHashMap.put("to_shoot_etime", String.valueOf(valueOf4.longValue() - j));
            }
            if (remove.taskExecuteEndTime > 0) {
                z3 = true;
            }
            linkedHashMap.put("preload_ab_open", String.valueOf(z3));
        }
        linkedHashMap.put("to_request_time", String.valueOf(j2 - j));
        linkedHashMap.put("to_response_time", String.valueOf(j3 - j));
        linkedHashMap.put("page_name", pageName);
        linkedHashMap.put("preload_ab_setting", String.valueOf(z));
        interfaceC56535MGt.onEvent(linkedHashMap);
    }
}
