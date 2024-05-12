package com.bytedance.creativex.model.mapping;

import X.C16880lQ;
import X.C58665N0r;
import X.C65385PlN;
import X.C65403Plf;
import X.HBV;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SimpleBundleModelExtraAdapter extends TypeAdapter<Bundle> {
    public final Gson LIZ;
    public final HBV LIZIZ;

    @Override // com.google.gson.TypeAdapter
    public final Bundle read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        Bundle bundle = new Bundle(SimpleBundleModelExtraAdapter.class.getClassLoader());
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String key = reader.LJJ();
            HBV hbv = this.LIZIZ;
            o.LJIIIIZZ(key, "key");
            Object fromJson = GsonProtectorUtils.fromJson(this.LIZ, reader.LJJIIZI(), (Class<Object>) hbv.get(key));
            if (fromJson == null) {
                bundle.putSerializable(key, null);
            } else if (fromJson instanceof Parcelable) {
                bundle.putParcelable(key, (Parcelable) fromJson);
            } else if (fromJson instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) fromJson);
            } else if (fromJson instanceof Byte) {
                bundle.putByte(key, ((Number) fromJson).byteValue());
            } else if (fromJson instanceof Character) {
                bundle.putChar(key, ((Character) fromJson).charValue());
            } else if (fromJson instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) fromJson).booleanValue());
            } else if (fromJson instanceof Integer) {
                bundle.putInt(key, ((Number) fromJson).intValue());
            } else if (fromJson instanceof Short) {
                bundle.putShort(key, ((Number) fromJson).shortValue());
            } else if (fromJson instanceof Long) {
                bundle.putLong(key, ((Number) fromJson).longValue());
            } else if (fromJson instanceof Float) {
                bundle.putFloat(key, ((Number) fromJson).floatValue());
            } else if (fromJson instanceof Double) {
                bundle.putDouble(key, ((Number) fromJson).doubleValue());
            } else if (fromJson instanceof String) {
                bundle.putString(key, (String) fromJson);
            } else {
                "type not supported yet".toString();
                throw new IllegalStateException("type not supported yet");
            }
        }
        reader.LJFF();
        return bundle;
    }

    public SimpleBundleModelExtraAdapter(Gson gson, C58665N0r mapping) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(mapping, "mapping");
        this.LIZ = gson;
        this.LIZIZ = mapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf out, Bundle bundle) {
        Bundle bundle2 = bundle;
        o.LJIIIZ(out, "out");
        o.LJIIIZ(bundle2, "bundle");
        out.LIZJ();
        if (bundle2.getClassLoader() == null) {
            bundle2.setClassLoader(SimpleBundleModelExtraAdapter.class.getClassLoader());
        }
        Set<String> keySet = bundle2.keySet();
        o.LJIIIIZZ(keySet, "bundle.keySet()");
        for (String key : keySet) {
            HBV hbv = this.LIZIZ;
            o.LJIIIIZZ(key, "key");
            Class<?> cls = hbv.get(key);
            Object LLJJIII = C16880lQ.LLJJIII(bundle2, key);
            out.LJI(key);
            out.LJJ(GsonProtectorUtils.toJson(this.LIZ, LLJJIII, cls));
        }
        out.LJFF();
    }
}
