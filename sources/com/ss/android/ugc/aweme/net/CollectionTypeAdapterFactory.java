package com.ss.android.ugc.aweme.net;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class CollectionTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!Collection.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> LJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, T, java.util.ArrayList] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                ?? r2 = (T) ((Collection) TypeAdapter.this.read(c65385PlN));
                if (r2 instanceof ArrayList) {
                    ?? r22 = (T) ((ArrayList) r2);
                    for (int size = r22.size() - 1; size >= 0; size--) {
                        if (ListProtector.get(r22, size) == null) {
                            ListProtector.remove(r22, size);
                        }
                    }
                    return r22;
                }
                Iterator it = r2.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        it.remove();
                    }
                }
                return r2;
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
