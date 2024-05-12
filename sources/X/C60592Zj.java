package X;

import defpackage.i0;
import java.util.LinkedHashMap;

/* renamed from: X.2Zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60592Zj {
    public static final C5H3<C60592Zj> LIZJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C60602Zk.LJLIL);
    public final java.util.Map<String, Boolean> LIZ = new LinkedHashMap();
    public volatile boolean LIZIZ;

    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) this.LIZ).get(i0.LJFF("scene_key_", str));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
