package com.ss.android.ugc.aweme.net;

import X.AbstractC36908Ee8;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;

/* loaded from: classes12.dex */
public final class ModelCheckerTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!AbstractC36908Ee8.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        AbstractC36908Ee8.initRequiredFieldMap(typeToken.getRawType());
        final TypeAdapter<T> LJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r0v3, types: [T, X.Ee8] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                ?? r0 = (T) ((AbstractC36908Ee8) TypeAdapter.this.read(c65385PlN));
                try {
                    r0.checkValid();
                    return r0;
                } catch (n e) {
                    throw e;
                } catch (Throwable th) {
                    throw new s(th);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, T t) {
                if (t == null) {
                    c65403Plf.LJIIJJI();
                } else {
                    TypeAdapter.this.write(c65403Plf, t);
                }
            }
        };
    }
}
