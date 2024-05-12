package com.ss.android.ugc.effectmanager.knadapt;

import X.AnonymousClass636;
import X.PVC;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KNJsonConverter {
    public final IJsonConverter jsonConverter;

    public KNJsonConverter(IJsonConverter jsonConverter) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        this.jsonConverter = jsonConverter;
    }

    public <T> String convertObjToJson(T t) {
        return this.jsonConverter.convertObjToJson(t);
    }

    public <T> T convertJsonToObj(String json, Class<T> cls) {
        o.LJIIJ(json, "json");
        o.LJIIJ(cls, "cls");
        Charset charset = PVC.LIZ;
        byte[] bytes = json.getBytes(charset);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            IJsonConverter iJsonConverter = this.jsonConverter;
            byte[] bytes2 = json.getBytes(charset);
            o.LJFF(bytes2, "(this as java.lang.String).getBytes(charset)");
            T t = (T) iJsonConverter.convertJsonToObj(new ByteArrayInputStream(bytes2), cls);
            AnonymousClass636.LJFF(byteArrayInputStream, null);
            return t;
        } finally {
        }
    }
}
