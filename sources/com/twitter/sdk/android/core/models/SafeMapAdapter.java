package com.twitter.sdk.android.core.models;

import X.C65385PlN;
import X.C65403Plf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes12.dex */
public class SafeMapAdapter implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, final TypeToken<T> typeToken) {
        final TypeAdapter<T> LJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.twitter.sdk.android.core.models.SafeMapAdapter.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                T t = (T) TypeAdapter.this.read(c65385PlN);
                if (Map.class.isAssignableFrom(typeToken.getRawType())) {
                    if (t == null) {
                        return (T) Collections.EMPTY_MAP;
                    }
                    return (T) Collections.unmodifiableMap((Map) t);
                }
                return t;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, T t) {
                TypeAdapter.this.write(c65403Plf, t);
            }
        };
    }
}
