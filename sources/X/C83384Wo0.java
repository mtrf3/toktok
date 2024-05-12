package X;

import com.bytedance.ies.actionai.jni.ActionAILoggerListener;
import com.bytedance.ies.actionai.jni.LogLevel;

/* renamed from: X.Wo0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83384Wo0 extends ActionAILoggerListener {
    @Override // com.bytedance.ies.actionai.jni.ActionAILoggerListener
    public final void onLog(LogLevel logLevel, String str) {
        int i;
        if (logLevel == null) {
            i = -1;
        } else {
            i = C83386Wo2.LIZ[logLevel.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (str == null) {
                                str = "";
                            }
                            android.util.Log.println(3, "ActionAIDemo", str);
                            return;
                        } else {
                            if (str == null) {
                                str = "";
                            }
                            android.util.Log.println(6, "ActionAIDemo", str);
                            return;
                        }
                    }
                    if (str == null) {
                        str = "";
                    }
                    android.util.Log.println(5, "ActionAIDemo", str);
                    return;
                }
                if (str == null) {
                    str = "";
                }
                android.util.Log.println(4, "ActionAIDemo", str);
                return;
            }
            if (str == null) {
                str = "";
            }
            android.util.Log.println(3, "ActionAIDemo", str);
            return;
        }
        if (str == null) {
            str = "";
        }
        android.util.Log.println(2, "ActionAIDemo", str);
    }
}
