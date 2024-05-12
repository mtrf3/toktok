package X;

import com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Fhq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39686Fhq implements ICrashReportService {
    public final ArrayList<ICrashCustomTagListener> LIZ = new ArrayList<>();

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void addCrashCustomTagListener(ICrashCustomTagListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.add(listener);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void report(int i) {
        String str;
        String obj;
        HashMap<String, Object> hashMap = C44422Hc2.LIZ.get(i);
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                if (value != null && (obj = value.toString()) != null && obj.length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            String str2 = "java_crash_detected";
            if (i == 1) {
                str = "oom_detected";
            } else if (i == 2) {
                str = "native_crash_detected";
            } else if (i == 3) {
                str = "java_crash_detected";
            } else {
                throw new Exception("Unknown error type");
            }
            LIZ.append(str);
            LIZ.append(": ");
            LIZ.append(linkedHashMap);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            if (i == 1) {
                str2 = "oom_detected";
            } else if (i == 2) {
                str2 = "native_crash_detected";
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJFF(linkedHashMap);
            GXR.LIZ(str2, c145995oB.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void setCustomTag(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        Iterator<ICrashCustomTagListener> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().setCustomTag(key, value);
        }
    }
}
