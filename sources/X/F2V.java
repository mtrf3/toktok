package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F2V implements IJsonConverter {
    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        return GsonProtectorUtils.toJson(new Gson(), t);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> T convertJsonToObj(InputStream json, Class<T> cls) {
        o.LJIIIZ(json, "json");
        Gson gson = new Gson();
        try {
            C65385PlN c65385PlN = new C65385PlN(new InputStreamReader(json));
            T t = (T) com.google.gson.internal.o.LIZ(cls).cast(gson.LJIIIIZZ(c65385PlN, cls));
            c65385PlN.close();
            json.close();
            return t;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
