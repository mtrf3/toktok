package com.ss.android.ugc.aweme.gsonopt;

import X.C65427Pm3;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;

/* loaded from: classes12.dex */
public class BaseAdapterFactory implements u {
    public final C65427Pm3 LJLIL;

    public BaseAdapter LIZ(String str) {
        return null;
    }

    public BaseAdapterFactory(C65427Pm3 c65427Pm3) {
        this.LJLIL = c65427Pm3;
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        BaseAdapter LIZ;
        if (typeToken != null && (typeToken.getType() instanceof Class) && (LIZ = LIZ(((Class) typeToken.getType()).getName().replace(".", "/"))) != null) {
            return LIZ;
        }
        return null;
    }
}
