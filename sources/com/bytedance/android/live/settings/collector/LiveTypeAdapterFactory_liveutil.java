package com.bytedance.android.live.settings.collector;

import com.bytedance.android.livesdk.model.MonitorSampleData;
import com.bytedance.android.livesdk.model.MonitorSampleData_OptTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTypeAdapterFactory_liveutil implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        if (o.LJ(type.getRawType(), MonitorSampleData.class)) {
            return new MonitorSampleData_OptTypeAdapter(gson);
        }
        return null;
    }
}
