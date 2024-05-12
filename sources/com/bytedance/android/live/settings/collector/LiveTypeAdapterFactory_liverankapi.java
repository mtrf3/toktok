package com.bytedance.android.live.settings.collector;

import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;
import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.api.RankTypeV2_OptTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTypeAdapterFactory_liverankapi implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (o.LJ(rawType, LiveRankLynxConfig.Config.class)) {
            return new LiveRankLynxConfig_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRankTypeConfig.Config.class)) {
            return new LiveRankTypeConfig_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RankTypeV2.class)) {
            return new RankTypeV2_OptTypeAdapter(gson);
        }
        return null;
    }
}
