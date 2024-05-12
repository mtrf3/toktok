package com.bytedance.android.livesdk.livesetting.game;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameLiveFeedbackLabelIds_OptTypeAdapter extends TypeAdapter<GameLiveFeedbackLabelIds> {
    public GameLiveFeedbackLabelIds_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GameLiveFeedbackLabelIds read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds = new GameLiveFeedbackLabelIds(null, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1467162645) {
                    if (hashCode != 1176441553) {
                        if (hashCode == 1227992719 && LJJ.equals("video_buffering_or_freezing")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                String LJJIIZI = reader.LJJIIZI();
                                o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                                gameLiveFeedbackLabelIds.setVideo_buffering_or_freezing(LJJIIZI);
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("game_freezing_or_high_ping")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            gameLiveFeedbackLabelIds.setGame_freezing_or_high_ping(LJJIIZI2);
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("low_audio_quality")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        String LJJIIZI3 = reader.LJJIIZI();
                        o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                        gameLiveFeedbackLabelIds.setLow_audio_quality(LJJIIZI3);
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return gameLiveFeedbackLabelIds;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds) {
        GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds2 = gameLiveFeedbackLabelIds;
        o.LJIIIZ(writer, "writer");
        if (gameLiveFeedbackLabelIds2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("game_freezing_or_high_ping");
        writer.LJJ(gameLiveFeedbackLabelIds2.getGame_freezing_or_high_ping());
        writer.LJI("video_buffering_or_freezing");
        writer.LJJ(gameLiveFeedbackLabelIds2.getVideo_buffering_or_freezing());
        writer.LJI("low_audio_quality");
        writer.LJJ(gameLiveFeedbackLabelIds2.getLow_audio_quality());
        writer.LJFF();
    }
}
