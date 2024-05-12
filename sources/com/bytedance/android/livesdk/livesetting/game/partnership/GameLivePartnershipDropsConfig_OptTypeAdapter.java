package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameLivePartnershipDropsConfig_OptTypeAdapter extends TypeAdapter<GameLivePartnershipDropsConfig> {
    public final Gson LIZ;

    public GameLivePartnershipDropsConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameLivePartnershipDropsConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig = new GameLivePartnershipDropsConfig(false, null, null, 0, false, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1372270885:
                        if (!LJJ.equals("enable_permanent_drops_share_item")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            gameLivePartnershipDropsConfig.enablePermanentDropsShareItem = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1363186393:
                        if (!LJJ.equals("preview_card")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            gameLivePartnershipDropsConfig.previewCard = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            gameLivePartnershipDropsConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -192824519:
                        if (!LJJ.equals("drops_preview_show_cnt")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            gameLivePartnershipDropsConfig.dropsPreviewShowCnt = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1814856459:
                        if (!LJJ.equals("drops_card")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            gameLivePartnershipDropsConfig.dropsCard = LJJIIZI2;
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
        return gameLivePartnershipDropsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig) {
        GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig2 = gameLivePartnershipDropsConfig;
        o.LJIIIZ(writer, "writer");
        if (gameLivePartnershipDropsConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(gameLivePartnershipDropsConfig2.enable);
        writer.LJI("drops_card");
        writer.LJJ(gameLivePartnershipDropsConfig2.dropsCard);
        writer.LJI("preview_card");
        writer.LJJ(gameLivePartnershipDropsConfig2.previewCard);
        writer.LJI("drops_preview_show_cnt");
        C79062V1e.LJFF(gameLivePartnershipDropsConfig2.dropsPreviewShowCnt, writer, "enable_permanent_drops_share_item");
        writer.LJJIII(gameLivePartnershipDropsConfig2.enablePermanentDropsShareItem);
        writer.LJFF();
    }
}
