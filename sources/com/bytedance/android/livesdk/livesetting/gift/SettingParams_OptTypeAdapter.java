package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SettingParams_OptTypeAdapter extends TypeAdapter<SettingParams> {
    public final Gson LIZ;

    public SettingParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SettingParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SettingParams settingParams = new SettingParams(0, 0L, 0L, 0, false, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1903971961:
                        if (!LJJ.equals("remove_fetch_after_panel_opened")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.removeFetchAfterPanelOpened = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.enable = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1168726191:
                        if (!LJJ.equals("first_fetch_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.firstFetchDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1661256818:
                        if (!LJJ.equals("next_fetch_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.nextFetchDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1826708809:
                        if (!LJJ.equals("force_predict_success")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.forcePredictSuccess = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return settingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SettingParams settingParams) {
        SettingParams settingParams2 = settingParams;
        o.LJIIIZ(writer, "writer");
        if (settingParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C79062V1e.LJFF(settingParams2.enable, writer, "first_fetch_delay");
        writer.LJIJ(settingParams2.firstFetchDelay);
        writer.LJI("next_fetch_delay");
        writer.LJIJ(settingParams2.nextFetchDelay);
        writer.LJI("remove_fetch_after_panel_opened");
        C79062V1e.LJFF(settingParams2.removeFetchAfterPanelOpened, writer, "force_predict_success");
        writer.LJJIII(settingParams2.forcePredictSuccess);
        writer.LJFF();
    }
}
