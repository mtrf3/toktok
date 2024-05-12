package com.bytedance.realx.base.platformsdk;

import X.C16880lQ;
import X.C65385PlN;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.internal.o;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes33.dex */
public class ImplJsonConverter implements IJsonConverter {
    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public <T> String convertObjToJson(T t) {
        return GsonProtectorUtils.toJson(new Gson(), t);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
        Gson gson = new Gson();
        try {
            C65385PlN c65385PlN = new C65385PlN(new InputStreamReader(inputStream));
            T t = (T) o.LIZ(cls).cast(gson.LJIIIIZZ(c65385PlN, cls));
            c65385PlN.close();
            inputStream.close();
            return t;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
