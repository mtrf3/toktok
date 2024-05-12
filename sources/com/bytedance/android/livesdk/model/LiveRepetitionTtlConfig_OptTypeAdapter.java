package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRepetitionTtlConfig_OptTypeAdapter extends TypeAdapter<LiveRepetitionTtlConfig> {
    public LiveRepetitionTtlConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRepetitionTtlConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRepetitionTtlConfig liveRepetitionTtlConfig = new LiveRepetitionTtlConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1704076645:
                        if (!LJJ.equals("ttlive_default_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.defaultTtl = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1100213571:
                        if (!LJJ.equals("ttlive_foru_card_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.foruCardTtl = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -897399688:
                        if (!LJJ.equals("ttlive_drawer_one_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.drawerOneTtl = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -635128953:
                        if (!LJJ.equals("enable_live_petition_show")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.enableLivePetitionShow = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -487951010:
                        if (!LJJ.equals("ttlive_drawer_two_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.drawerTwoTtl = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -181318317:
                        if (!LJJ.equals("ttlive_close_page_recommend_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.closePage = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 603195946:
                        if (!LJJ.equals("ttlive_live_square_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.liveSquareTtl = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2087222669:
                        if (!LJJ.equals("ttlive_foru_head_ttl")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRepetitionTtlConfig.foruHeadTtl = reader.LJIJJ();
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
        return liveRepetitionTtlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRepetitionTtlConfig liveRepetitionTtlConfig) {
        LiveRepetitionTtlConfig liveRepetitionTtlConfig2 = liveRepetitionTtlConfig;
        o.LJIIIZ(writer, "writer");
        if (liveRepetitionTtlConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_live_petition_show");
        writer.LJIJ(liveRepetitionTtlConfig2.enableLivePetitionShow);
        writer.LJI("ttlive_default_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.defaultTtl);
        writer.LJI("ttlive_foru_card_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.foruCardTtl);
        writer.LJI("ttlive_foru_head_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.foruHeadTtl);
        writer.LJI("ttlive_drawer_two_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.drawerTwoTtl);
        writer.LJI("ttlive_drawer_one_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.drawerOneTtl);
        writer.LJI("ttlive_live_square_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.liveSquareTtl);
        writer.LJI("ttlive_close_page_recommend_ttl");
        writer.LJIJ(liveRepetitionTtlConfig2.closePage);
        writer.LJFF();
    }
}
