package X;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.EQd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC36395EQd {
    <T> T createDefaultRetrofit(Class<T> cls);

    <T> T createRetrofit(String str, boolean z, Class<T> cls);

    <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends InterfaceC37216Ej6> list);

    String getApiHost();

    Gson getRetrofitFactoryGson();

    void putCommonParams(HashMap<String, String> hashMap, boolean z);

    <T> T retrofitCreate(String str, Class<T> cls);
}
