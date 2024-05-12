package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;

/* renamed from: X.638, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass638 {
    public static final HashMap<String, String> LIZ = new HashMap<>();

    public static final int LIZ() {
        String str = LIZ.get("is_from_push");
        if (str != null) {
            return CastIntegerProtector.parseInt(str);
        }
        return 0;
    }
}
