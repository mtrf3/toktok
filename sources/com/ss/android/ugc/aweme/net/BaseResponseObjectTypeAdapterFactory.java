package com.ss.android.ugc.aweme.net;

import X.C38333F2r;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes12.dex */
public class BaseResponseObjectTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!BaseResponse.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> LJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r1v3, types: [T, com.ss.android.ugc.aweme.base.api.BaseResponse] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    ?? r1 = (T) ((BaseResponse) TypeAdapter.this.read(c65385PlN));
                    BaseResponse.ServerTimeExtra serverTimeExtra = r1.extra;
                    return r1;
                } catch (n e) {
                    if (e.getCause() instanceof C38333F2r) {
                        throw e.getCause();
                    }
                    throw e;
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
