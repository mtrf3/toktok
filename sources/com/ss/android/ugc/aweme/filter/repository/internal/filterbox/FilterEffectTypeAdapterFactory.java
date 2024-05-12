package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.C65385PlN;
import X.C65403Plf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FilterEffectTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        if ((!o.LJ(type.getRawType(), Effect.class)) && (!o.LJ(type.getRawType(), com.ss.ugc.effectplatform.model.Effect.class))) {
            return null;
        }
        final TypeAdapter<T> LJIIJJI = gson.LJIIJJI(this, TypeToken.get(FilterEffect.class));
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterEffectTypeAdapterFactory$create$1
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
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
            }
        };
    }
}
