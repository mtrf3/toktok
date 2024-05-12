package com.ss.android.ugc.aweme.shortvideo.mapping;

import X.N1C;
import android.os.Bundle;
import com.bytedance.creativex.model.mapping.SimpleBundleModelExtraAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TimeSpeedModelExtrasAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        if (!Bundle.class.isAssignableFrom(type.getRawType())) {
            return null;
        }
        return new SimpleBundleModelExtraAdapter(gson, N1C.LIZ);
    }
}
