package com.ss.android.ugc.aweme.utils;

import X.C65385PlN;
import X.C65403Plf;
import X.InterfaceC65435PmB;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;

/* loaded from: classes12.dex */
public class PostConstructTypeAdapterFactory implements u {

    /* loaded from: classes12.dex */
    public static class PostConstructTypeAdapter<T> extends TypeAdapter<T> {
        public final TypeAdapter<T> LIZ;

        public PostConstructTypeAdapter(TypeAdapter<T> typeAdapter) {
            this.LIZ = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(C65385PlN c65385PlN) {
            T read = this.LIZ.read(c65385PlN);
            if (read instanceof InterfaceC65435PmB) {
                ((InterfaceC65435PmB) read).LIZ();
            }
            return read;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, T t) {
            this.LIZ.write(c65403Plf, t);
        }
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new PostConstructTypeAdapter(gson.LJIIJJI(this, typeToken));
    }
}
