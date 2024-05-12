package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePitayaSettingsParams_OptTypeAdapter extends TypeAdapter<LivePitayaSettingsParams> {
    public final Gson LIZ;

    public LivePitayaSettingsParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePitayaSettingsParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePitayaSettingsParams livePitayaSettingsParams = new LivePitayaSettingsParams(0, null, null, null, 0, 0L, 0, null, 255, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.enable = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1077048117:
                        if (!LJJ.equals("request_all_pkgs_once")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.requestAllPkgsOnce = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -865551118:
                        if (!LJJ.equals("init_after_app_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.initAfterAppStart = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -830053772:
                        if (!LJJ.equals("frequent_settings")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.fequentSettings = (LivePitayaTaskFrequentControlManager) C64.LIZ(this.LIZ, LivePitayaTaskFrequentControlManager.class, reader, "gson.getAdapter(LivePita…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 163737538:
                        if (!LJJ.equals("live_ai_services")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.aiServices = (LiveAIServices) C64.LIZ(this.LIZ, LiveAIServices.class, reader, "gson.getAdapter(LiveAISe…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 960828537:
                        if (!LJJ.equals("request_all_pkgs_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.requestAllPkgsDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1443175837:
                        if (!LJJ.equals("task_settings")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaSettingsParams.taskSettingsParams = (LivePitayaTaskSettingsParams) C64.LIZ(this.LIZ, LivePitayaTaskSettingsParams.class, reader, "gson.getAdapter(LivePita…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1480340324:
                        if (!LJJ.equals("ab_params")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Object.class);
                            o.LJI(LIZIZ);
                            livePitayaSettingsParams.abParams = LIZIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return livePitayaSettingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePitayaSettingsParams livePitayaSettingsParams) {
        LivePitayaSettingsParams livePitayaSettingsParams2 = livePitayaSettingsParams;
        o.LJIIIZ(writer, "writer");
        if (livePitayaSettingsParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C79062V1e.LJFF(livePitayaSettingsParams2.enable, writer, "task_settings");
        this.LIZ.LJIIJ(LivePitayaTaskSettingsParams.class).write(writer, livePitayaSettingsParams2.taskSettingsParams);
        writer.LJI("ab_params");
        C65412Plo.LJ(this.LIZ, writer, livePitayaSettingsParams2.abParams, Object.class);
        writer.LJI("live_ai_services");
        this.LIZ.LJIIJ(LiveAIServices.class).write(writer, livePitayaSettingsParams2.aiServices);
        writer.LJI("request_all_pkgs_once");
        C79062V1e.LJFF(livePitayaSettingsParams2.requestAllPkgsOnce, writer, "request_all_pkgs_delay");
        writer.LJIJ(livePitayaSettingsParams2.requestAllPkgsDelay);
        writer.LJI("init_after_app_start");
        C79062V1e.LJFF(livePitayaSettingsParams2.initAfterAppStart, writer, "frequent_settings");
        this.LIZ.LJIIJ(LivePitayaTaskFrequentControlManager.class).write(writer, livePitayaSettingsParams2.fequentSettings);
        writer.LJFF();
    }
}
