package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PartnershipSchemaConfig_OptTypeAdapter extends TypeAdapter<PartnershipSchemaConfig> {
    public PartnershipSchemaConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final PartnershipSchemaConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PartnershipSchemaConfig partnershipSchemaConfig = new PartnershipSchemaConfig(null, null, null, null, null, null, null, null, null, 511, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2126089543:
                        if (!LJJ.equals("roma_schema_page_promote_introduction")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            partnershipSchemaConfig.promoteIntroduction = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -2092084086:
                        if (!LJJ.equals("roma_schema_page_event_qualification")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            partnershipSchemaConfig.eventQualification = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1998020754:
                        if (!LJJ.equals("roma_schema_page_drop_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            partnershipSchemaConfig.pageDropList = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1806796413:
                        if (!LJJ.equals("roma_schema_page_intro_card")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            partnershipSchemaConfig.pageIntroCard = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1210813830:
                        if (!LJJ.equals("roma_schema_page_current_promote")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            partnershipSchemaConfig.currentPromote = LJJIIZI5;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1140258252:
                        if (!LJJ.equals("roma_schema_page_promote_center")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI6 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI6, "reader.nextString()");
                            partnershipSchemaConfig.promoteCenter = LJJIIZI6;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -210970051:
                        if (!LJJ.equals("roma_schema_page_promote_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI7 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI7, "reader.nextString()");
                            partnershipSchemaConfig.promoteList = LJJIIZI7;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 37668753:
                        if (!LJJ.equals("roma_schema_page_user_game_detail_v2")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI8 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI8, "reader.nextString()");
                            partnershipSchemaConfig.userGameDetail = LJJIIZI8;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 904523594:
                        if (!LJJ.equals("roma_schema_page_user_game_detail")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI9 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI9, "reader.nextString()");
                            partnershipSchemaConfig.userGameDetailLandscape = LJJIIZI9;
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
        return partnershipSchemaConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PartnershipSchemaConfig partnershipSchemaConfig) {
        PartnershipSchemaConfig partnershipSchemaConfig2 = partnershipSchemaConfig;
        o.LJIIIZ(writer, "writer");
        if (partnershipSchemaConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("roma_schema_page_intro_card");
        writer.LJJ(partnershipSchemaConfig2.pageIntroCard);
        writer.LJI("roma_schema_page_promote_list");
        writer.LJJ(partnershipSchemaConfig2.promoteList);
        writer.LJI("roma_schema_page_promote_introduction");
        writer.LJJ(partnershipSchemaConfig2.promoteIntroduction);
        writer.LJI("roma_schema_page_promote_center");
        writer.LJJ(partnershipSchemaConfig2.promoteCenter);
        writer.LJI("roma_schema_page_current_promote");
        writer.LJJ(partnershipSchemaConfig2.currentPromote);
        writer.LJI("roma_schema_page_event_qualification");
        writer.LJJ(partnershipSchemaConfig2.eventQualification);
        writer.LJI("roma_schema_page_drop_list");
        writer.LJJ(partnershipSchemaConfig2.pageDropList);
        writer.LJI("roma_schema_page_user_game_detail");
        writer.LJJ(partnershipSchemaConfig2.userGameDetailLandscape);
        writer.LJI("roma_schema_page_user_game_detail_v2");
        writer.LJJ(partnershipSchemaConfig2.userGameDetail);
        writer.LJFF();
    }
}
