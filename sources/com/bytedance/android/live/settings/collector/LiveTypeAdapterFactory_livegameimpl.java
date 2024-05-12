package com.bytedance.android.live.settings.collector;

import com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig;
import com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig_OptTypeAdapter;
import com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateConfig;
import com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateConfig_OptTypeAdapter;
import com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeConfig;
import com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeConfig_OptTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTypeAdapterFactory_livegameimpl implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (o.LJ(rawType, MobileGameBroadcastFeedbackConfig.class)) {
            return new MobileGameBroadcastFeedbackConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MobileHighPingAdjustBitrateConfig.class)) {
            return new MobileHighPingAdjustBitrateConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MobileHighPingOptimizeConfig.class)) {
            return new MobileHighPingOptimizeConfig_OptTypeAdapter(gson);
        }
        return null;
    }
}
