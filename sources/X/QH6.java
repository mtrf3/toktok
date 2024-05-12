package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* loaded from: classes12.dex */
public final class QH6 {
    static {
        PatternProtector.compile("\\$\\{(.*?)\\}");
    }

    public static boolean LIZ(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
