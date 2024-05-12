package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameCardShownConfig_OptTypeAdapter extends TypeAdapter<GameCardShownConfig> {
    public final Gson LIZ;

    public GameCardShownConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameCardShownConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GameCardShownConfig gameCardShownConfig = new GameCardShownConfig(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gameCardShownConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "delay_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gameCardShownConfig.delayTime = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return gameCardShownConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GameCardShownConfig gameCardShownConfig) {
        GameCardShownConfig gameCardShownConfig2 = gameCardShownConfig;
        o.LJIIIZ(writer, "writer");
        if (gameCardShownConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(gameCardShownConfig2.enable);
        writer.LJI("delay_time");
        writer.LJIJ(gameCardShownConfig2.delayTime);
        writer.LJFF();
    }
}
