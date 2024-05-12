package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.94n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2309394n {
    public static String LIZ(List list) {
        o.LJIIIZ(list, "<this>");
        String json = GsonProtectorUtils.toJson(new Gson(), list);
        o.LJIIIIZZ(json, "actualSerializer.toJson(this)");
        return json;
    }
}
