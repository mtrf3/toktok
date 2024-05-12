package com.bytedance.android.livesdk.livesetting.performance;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDataReportSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTTLSDataReportSettings_TTLSDataReportSetting_OptTypeAdapter extends TypeAdapter<LiveTTLSDataReportSettings.TTLSDataReportSetting> {
    public final Gson LIZ;

    public LiveTTLSDataReportSettings_TTLSDataReportSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveTTLSDataReportSettings.TTLSDataReportSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveTTLSDataReportSettings.TTLSDataReportSetting tTLSDataReportSetting = new LiveTTLSDataReportSettings.TTLSDataReportSetting(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "webcast_live_sdk_ttls_so_data_report_settings")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    tTLSDataReportSetting.enableSo = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "webcast_live_sdk_ttls_lynx_data_report_settings")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    tTLSDataReportSetting.enableLynx = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return tTLSDataReportSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveTTLSDataReportSettings.TTLSDataReportSetting tTLSDataReportSetting) {
        LiveTTLSDataReportSettings.TTLSDataReportSetting tTLSDataReportSetting2 = tTLSDataReportSetting;
        o.LJIIIZ(writer, "writer");
        if (tTLSDataReportSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("webcast_live_sdk_ttls_so_data_report_settings");
        writer.LJJIII(tTLSDataReportSetting2.enableSo);
        writer.LJI("webcast_live_sdk_ttls_lynx_data_report_settings");
        writer.LJJIII(tTLSDataReportSetting2.enableLynx);
        writer.LJFF();
    }
}
