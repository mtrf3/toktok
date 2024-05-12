package X;

import java.util.HashMap;

/* renamed from: X.4zJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127414zJ {
    public static final java.util.Map<String, Long> LIZ = new HashMap();

    public static void LIZ(C145995oB c145995oB, String str) {
        HashMap hashMap = (HashMap) LIZ;
        Long l = (Long) hashMap.get(str);
        if (l != null) {
            c145995oB.LIZIZ(l.longValue(), "crop_encode_duration");
        }
        hashMap.remove(str);
    }
}
