package com.ss.android.ugc.aweme.utils;

import X.C65385PlN;
import X.C65401Pld;
import X.C65403Plf;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;

/* loaded from: classes12.dex */
public class StringJsonAdapterFactory implements u {

    /* loaded from: classes12.dex */
    public static class Adapter<T> extends TypeAdapter<T> {
        public final Gson LIZ;
        public final TypeToken<T> LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final T read(C65385PlN c65385PlN) {
            int i = C65401Pld.LIZ[c65385PlN.LJJIJIL().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return (T) GsonProtectorUtils.fromJson(this.LIZ, c65385PlN, this.LIZIZ.getType());
                }
                return (T) GsonProtectorUtils.fromJson(this.LIZ, c65385PlN.LJJIIZI(), this.LIZIZ.getType());
            }
            c65385PlN.LJJIIJ();
            return null;
        }

        public Adapter(Gson gson, TypeToken<T> typeToken) {
            this.LIZ = gson;
            this.LIZIZ = typeToken;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, T t) {
            c65403Plf.LJJ(GsonProtectorUtils.toJson(this.LIZ, t));
        }
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new Adapter(gson, typeToken);
    }
}
