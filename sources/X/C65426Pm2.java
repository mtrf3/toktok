package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.gsonopt.GsonOptTypeAdapterFactory;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.Pm2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65426Pm2 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(Gson originGson, String str, Class dataClass) {
        o.LJIIIZ(originGson, "originGson");
        o.LJIIIZ(dataClass, "dataClass");
        if (str.length() == 0) {
            return null;
        }
        C65427Pm3 c65427Pm3 = new C65427Pm3(originGson);
        e eVar = new e(originGson);
        eVar.LIZJ(new GsonOptTypeAdapterFactory(c65427Pm3));
        Gson LIZ2 = eVar.LIZ();
        c65427Pm3.LIZ = LIZ2;
        return GsonProtectorUtils.fromJson(LIZ2, str, (Type) dataClass);
    }
}
