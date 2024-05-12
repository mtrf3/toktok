package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.C65385PlN;
import X.C65403Plf;
import X.C65433Pm9;
import X.C65434PmA;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FilterBoxEffectNetListResponseTypeAdapter implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(type, "type");
        if (!o.LJ(type.getRawType(), C65434PmA.class)) {
            return null;
        }
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new FilterEffectTypeAdapterFactory());
        final TypeAdapter<T> LJIIJ = eVar.LIZ().LJIIJ(C65433Pm9.class);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponseTypeAdapter$create$1
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                return (T) TypeAdapter.this.read(c65385PlN);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, T t) {
                TypeAdapter typeAdapter = TypeAdapter.this;
                if (t != null) {
                    typeAdapter.write(c65403Plf, t);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponse2");
            }
        };
    }
}
