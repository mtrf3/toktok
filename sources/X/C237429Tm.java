package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* renamed from: X.9Tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237429Tm {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C237439Tn.LJLIL);

    public static String LIZIZ(Object obj) {
        return GsonProtectorUtils.toJson((Gson) LIZ.getValue(), obj);
    }

    public static Object LIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson((Gson) LIZ.getValue(), str, cls);
    }
}
