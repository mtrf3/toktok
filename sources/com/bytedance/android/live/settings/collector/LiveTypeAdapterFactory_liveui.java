package com.bytedance.android.live.settings.collector;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveRecyclerViewOptData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRecyclerViewOptData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.LiveTooltipDebugConfig;
import com.bytedance.android.livesdk.livesetting.model.LiveTooltipDebugConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LivePanelCostTimeModel;
import com.bytedance.android.livesdk.livesetting.performance.LivePanelCostTimeModel_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptData;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltip;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltip_OptTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTypeAdapterFactory_liveui implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (o.LJ(rawType, LiveRecyclerViewOptData.class)) {
            return new LiveRecyclerViewOptData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, DrawerLoadOpt.class)) {
            return new DrawerLoadOpt_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveTooltipDebugConfig.class)) {
            return new LiveTooltipDebugConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRecyclerviewPerformanceOptData.class)) {
            return new LiveRecyclerviewPerformanceOptData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePanelCostTimeModel.class)) {
            return new LivePanelCostTimeModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveTooltip.class)) {
            return new LiveTooltip_OptTypeAdapter(gson);
        }
        return null;
    }
}
