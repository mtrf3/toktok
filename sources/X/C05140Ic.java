package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05140Ic {
    public static List LIZ(String value) {
        o.LJIIIZ(value, "value");
        Object fromJson = GsonProtectorUtils.fromJson(new Gson(), value, new TypeToken<List<? extends String>>() { // from class: X.1Fq
        }.getType());
        o.LJIIIIZZ(fromJson, "Gson().fromJson(value, listType)");
        return (List) fromJson;
    }
}
