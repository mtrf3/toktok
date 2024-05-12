package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MethodCallsLogger {
    public Map<String, Integer> mCalledMethods = new HashMap();

    public boolean approveCall(String str, int i) {
        int i2;
        Integer num = this.mCalledMethods.get(str);
        boolean z = false;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        }
        this.mCalledMethods.put(str, Integer.valueOf(i | i2));
        return !z;
    }
}
