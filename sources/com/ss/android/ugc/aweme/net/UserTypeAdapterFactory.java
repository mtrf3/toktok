package com.ss.android.ugc.aweme.net;

import X.C40515FvD;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes12.dex */
public class UserTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!User.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> LJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.UserTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r3v1, types: [T, com.ss.android.ugc.aweme.profile.model.User] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                ?? r3 = (T) ((User) TypeAdapter.this.read(c65385PlN));
                C40515FvD.LIZJ().LJIIIIZZ(r3.getUid(), r3.getSecUid());
                return r3;
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
