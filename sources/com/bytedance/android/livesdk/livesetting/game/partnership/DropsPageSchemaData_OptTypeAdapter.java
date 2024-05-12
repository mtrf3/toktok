package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DropsPageSchemaData_OptTypeAdapter extends TypeAdapter<DropsPageSchemaData> {
    public DropsPageSchemaData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final DropsPageSchemaData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        DropsPageSchemaData dropsPageSchemaData = new DropsPageSchemaData(null, null, null, null, null, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -796447002:
                        if (!LJJ.equals("drops_host_task_panel")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            dropsPageSchemaData.dropsHostTaskPanel = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -700810822:
                        if (!LJJ.equals("drops_host_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            dropsPageSchemaData.dropsHostList = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 430256737:
                        if (!LJJ.equals("drops_guide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            dropsPageSchemaData.dropsGuide = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 440873442:
                        if (!LJJ.equals("drops_setup")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            dropsPageSchemaData.dropsSetup = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1069016158:
                        if (!LJJ.equals("drops_audience_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            dropsPageSchemaData.dropsAudienceList = LJJIIZI5;
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
        return dropsPageSchemaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, DropsPageSchemaData dropsPageSchemaData) {
        DropsPageSchemaData dropsPageSchemaData2 = dropsPageSchemaData;
        o.LJIIIZ(writer, "writer");
        if (dropsPageSchemaData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("drops_guide");
        writer.LJJ(dropsPageSchemaData2.dropsGuide);
        writer.LJI("drops_audience_list");
        writer.LJJ(dropsPageSchemaData2.dropsAudienceList);
        writer.LJI("drops_host_list");
        writer.LJJ(dropsPageSchemaData2.dropsHostList);
        writer.LJI("drops_host_task_panel");
        writer.LJJ(dropsPageSchemaData2.dropsHostTaskPanel);
        writer.LJI("drops_setup");
        writer.LJJ(dropsPageSchemaData2.dropsSetup);
        writer.LJFF();
    }
}
