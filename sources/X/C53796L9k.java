package X;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* renamed from: X.L9k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53796L9k {
    public static final java.util.Map<Integer, SoftReference<OVR>> LIZ = new LinkedHashMap();

    public static int LIZ(Object... objArr) {
        int i = 1;
        for (Object obj : objArr) {
            i = (obj.hashCode() * i) % 100000000;
        }
        return i;
    }
}
