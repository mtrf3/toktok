package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.HashSet;

/* renamed from: X.FAq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38540FAq {
    public static final C38541FAr LIZ = new C38541FAr();
    public static final java.util.Set<String> LIZIZ;

    static {
        HashSet hashSet = new HashSet();
        LIZIZ = hashSet;
        C19U.LJ(hashSet, "\\", "^", "$", "+");
        C19U.LJ(hashSet, "*", ".", "?", "!");
        C19U.LJ(hashSet, "{", "}", "(", ")");
        hashSet.add("[");
        hashSet.add("]");
        hashSet.add("|");
    }

    public static boolean LIZ(String str) {
        return !PatternProtector.compile("[A-Za-z0-9-_/]+").matcher(str).matches();
    }
}
