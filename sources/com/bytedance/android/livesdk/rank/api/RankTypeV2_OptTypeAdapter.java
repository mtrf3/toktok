package com.bytedance.android.livesdk.rank.api;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RankTypeV2_OptTypeAdapter extends TypeAdapter<RankTypeV2> {
    public RankTypeV2_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final RankTypeV2 read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RankTypeV2 rankTypeV2 = new RankTypeV2(0, null, 0, 0, 0, 0, 0, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1826906930:
                        if (!LJJ.equals("rank_settlement_countdown")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            rankTypeV2.rankSettlementCountdown = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1644795419:
                        if (!LJJ.equals("rank_settlement_countdown_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            rankTypeV2.rankSettlementCountdownDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -641883458:
                        if (!LJJ.equals("rank_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            rankTypeV2.rankName = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -641681555:
                        if (!LJJ.equals("rank_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            rankTypeV2.type = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1405486176:
                        if (!LJJ.equals("show_rank_keep_up_tip")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            rankTypeV2.showRankKeepUpTip = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1578493864:
                        if (!LJJ.equals("rank_phase")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            rankTypeV2.rankPhase = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1581644766:
                        if (!LJJ.equals("rank_style")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            rankTypeV2.style = reader.LJIJI();
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
        return rankTypeV2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RankTypeV2 rankTypeV2) {
        RankTypeV2 rankTypeV22 = rankTypeV2;
        o.LJIIIZ(writer, "writer");
        if (rankTypeV22 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("rank_type");
        C79062V1e.LJFF(rankTypeV22.type, writer, "rank_name");
        writer.LJJ(rankTypeV22.rankName);
        writer.LJI("rank_style");
        C79062V1e.LJFF(rankTypeV22.style, writer, "rank_phase");
        C79062V1e.LJFF(rankTypeV22.rankPhase, writer, "rank_settlement_countdown");
        C79062V1e.LJFF(rankTypeV22.rankSettlementCountdown, writer, "rank_settlement_countdown_duration");
        C79062V1e.LJFF(rankTypeV22.rankSettlementCountdownDuration, writer, "show_rank_keep_up_tip");
        C77339UWx.LJFF(rankTypeV22.showRankKeepUpTip, writer);
    }
}
