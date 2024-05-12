package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: X.P4h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63855P4h {
    public static final Pattern LIZ = PatternProtector.compile("^\\D?(\\d+)$");
    public static final java.util.Map<String, Integer> LIZIZ;
    public static final java.util.Map<String, Integer> LIZJ;

    static {
        HashMap hashMap = new HashMap();
        LIZJ = hashMap;
        hashMap.put("01", 1);
        hashMap.put("02", 2);
        hashMap.put("03", 4);
        hashMap.put("04", 8);
        hashMap.put("05", 16);
        hashMap.put("06", 32);
        hashMap.put("07", 64);
        hashMap.put("08", 128);
        hashMap.put("09", 256);
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        hashMap2.put("00", 1);
        hashMap2.put("01", 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", 128);
        hashMap2.put("08", 256);
        hashMap2.put("09", 512);
    }
}
