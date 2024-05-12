package com.bytedance.creativex.model.mapping;

import X.C58665N0r;
import X.C65385PlN;
import X.C65403Plf;
import X.HBV;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class OnlySerializableModelExtraAdapter extends TypeAdapter<HashMap<String, Serializable>> {
    public final Gson LIZ;
    public final HBV LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final HashMap<String, Serializable> read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        HashMap<String, Serializable> hashMap = new HashMap<>();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String key = reader.LJJ();
            HBV hbv = this.LIZIZ;
            o.LJIIIIZZ(key, "key");
            Object fromJson = GsonProtectorUtils.fromJson(this.LIZ, reader.LJJIIZI(), (Class<Object>) hbv.get(key));
            if (fromJson == null) {
                hashMap.put(key, fromJson);
            } else if (fromJson instanceof Serializable) {
                hashMap.put(key, fromJson);
            } else {
                "type not supported yet".toString();
                throw new IllegalStateException("type not supported yet");
            }
        }
        reader.LJFF();
        return hashMap;
    }

    public OnlySerializableModelExtraAdapter(Gson gson, C58665N0r mapping) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(mapping, "mapping");
        this.LIZ = gson;
        this.LIZIZ = mapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf out, HashMap<String, Serializable> hashMap) {
        HashMap<String, Serializable> map = hashMap;
        o.LJIIIZ(out, "out");
        o.LJIIIZ(map, "map");
        out.LIZJ();
        for (Map.Entry<String, Serializable> entry : map.entrySet()) {
            String key = entry.getKey();
            Serializable value = entry.getValue();
            Class<?> cls = this.LIZIZ.get(key);
            out.LJI(key);
            out.LJJ(GsonProtectorUtils.toJson(this.LIZ, value, cls));
        }
        out.LJFF();
    }
}
