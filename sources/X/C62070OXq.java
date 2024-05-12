package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.BooleanDefaultFalseAdapter;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.IntegerDefaultZeroAdater;
import kotlin.jvm.internal.o;

/* renamed from: X.OXq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62070OXq {
    public static final Gson LIZ;

    static {
        e eVar = new e();
        Class cls = Boolean.TYPE;
        eVar.LIZIZ(new BooleanDefaultFalseAdapter(), cls);
        eVar.LIZIZ(new IntegerDefaultZeroAdater(), Integer.TYPE);
        eVar.LIZIZ(new BooleanDefaultFalseAdapter(), cls);
        LIZ = eVar.LIZ();
    }

    public static final String LIZIZ(Object obj) {
        String json = GsonProtectorUtils.toJson(LIZ, obj);
        o.LJIIIIZZ(json, "gson.toJson(o)");
        return json;
    }

    public static final Object LIZ(Class clazz, String str) {
        o.LJIIIZ(clazz, "clazz");
        return GsonProtectorUtils.fromJson(LIZ, str, clazz);
    }
}
