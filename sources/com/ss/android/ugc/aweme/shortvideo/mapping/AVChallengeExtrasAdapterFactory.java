package com.ss.android.ugc.aweme.shortvideo.mapping;

import X.N1B;
import com.bytedance.creativex.model.mapping.OnlySerializableModelExtraAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AVChallengeExtrasAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        if (!HashMap.class.isAssignableFrom(type.getRawType())) {
            return null;
        }
        return new OnlySerializableModelExtraAdapter(gson, N1B.LIZ);
    }
}
