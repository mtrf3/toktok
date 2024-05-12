package com.ss.android.ugc.aweme.gsonopt;

import X.C65385PlN;
import X.C65403Plf;
import X.C65427Pm3;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;

/* loaded from: classes12.dex */
public abstract class BaseAdapter<T> extends TypeAdapter<T> {
    public final C65427Pm3 LIZ;

    public abstract T LIZIZ();

    public abstract boolean LIZJ(String str, Object obj, C65385PlN c65385PlN);

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, T t) {
    }

    public BaseAdapter(C65427Pm3 c65427Pm3) {
        this.LIZ = c65427Pm3;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(C65385PlN c65385PlN) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
            c65385PlN.LJJIIJ();
            return null;
        }
        T LIZIZ = LIZIZ();
        try {
            c65385PlN.LIZIZ();
            while (c65385PlN.LJIIJJI()) {
                if (!LIZJ(c65385PlN.LJJ(), LIZIZ, c65385PlN)) {
                    c65385PlN.LJJJJ();
                }
            }
            c65385PlN.LJFF();
            return LIZIZ;
        } catch (IllegalStateException e) {
            throw new s(e);
        }
    }

    public final TypeAdapter LIZ(Object obj, Class cls) {
        r rVar;
        TypeToken<T> typeToken = TypeToken.get(cls);
        if (obj instanceof TypeAdapter) {
            return (TypeAdapter) obj;
        }
        if (obj instanceof u) {
            return ((u) obj).create((Gson) this.LIZ.LIZ, typeToken);
        }
        boolean z = obj instanceof r;
        if (z || (obj instanceof i)) {
            i iVar = null;
            if (z) {
                rVar = (r) obj;
            } else {
                rVar = null;
            }
            if (obj instanceof i) {
                iVar = (i) obj;
            }
            return new TreeTypeAdapter(rVar, iVar, (Gson) this.LIZ.LIZ, typeToken, null);
        }
        throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer reference.");
    }
}
