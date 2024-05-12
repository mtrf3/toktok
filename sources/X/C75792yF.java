package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75792yF {
    public static Gson LIZ;

    public static Gson LIZIZ() {
        if (LIZ == null) {
            LIZ = new Gson();
        }
        return LIZ;
    }

    public static String LIZJ(Object obj) {
        return GsonProtectorUtils.toJson(LIZIZ(), obj);
    }

    public static Object LIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson(LIZIZ(), str, cls);
    }

    public static List LIZLLL(Class cls, String str) {
        Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(LIZIZ(), str, cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
