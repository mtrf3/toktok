package com.bytedance.android.livesdk.livesetting.performance;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePanelCostTimeModel_OptTypeAdapter extends TypeAdapter<LivePanelCostTimeModel> {
    public final Gson LIZ;

    public LivePanelCostTimeModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePanelCostTimeModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePanelCostTimeModel livePanelCostTimeModel = new LivePanelCostTimeModel(false, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_sdk_panel_open_cost_times_switch")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePanelCostTimeModel.mSwitch = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_sdk_panel_open_cost_times_limit_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePanelCostTimeModel.mLimitDuration = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return livePanelCostTimeModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePanelCostTimeModel livePanelCostTimeModel) {
        LivePanelCostTimeModel livePanelCostTimeModel2 = livePanelCostTimeModel;
        o.LJIIIZ(writer, "writer");
        if (livePanelCostTimeModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_sdk_panel_open_cost_times_switch");
        writer.LJJIII(livePanelCostTimeModel2.mSwitch);
        writer.LJI("live_sdk_panel_open_cost_times_limit_duration");
        C77339UWx.LJFF(livePanelCostTimeModel2.mLimitDuration, writer);
    }
}
