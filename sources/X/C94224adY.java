package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.o;

/* renamed from: X.adY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94224adY implements IJsonConverter {
    public final Gson LIZ = new Gson();

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        String json = GsonProtectorUtils.toJson(this.LIZ, t);
        o.LJIIIIZZ(json, "gson.toJson(`object`)");
        return json;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> T convertJsonToObj(InputStream json, Class<T> cls) {
        o.LJIIIZ(json, "json");
        return (T) GsonProtectorUtils.fromJson(this.LIZ, (Reader) new InputStreamReader(json, "UTF-8"), (Class) cls);
    }
}
