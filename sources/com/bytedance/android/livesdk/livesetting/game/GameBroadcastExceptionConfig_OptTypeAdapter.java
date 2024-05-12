package com.bytedance.android.livesdk.livesetting.game;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameBroadcastExceptionConfig_OptTypeAdapter extends TypeAdapter<GameBroadcastExceptionConfig> {
    public final Gson LIZ;

    public GameBroadcastExceptionConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameBroadcastExceptionConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GameBroadcastExceptionConfig gameBroadcastExceptionConfig = new GameBroadcastExceptionConfig(false, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gameBroadcastExceptionConfig.setEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "exception_info")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    HashMap LIZJ = C65412Plo.LIZJ(this.LIZ, reader, Integer.TYPE, ExceptionInfo.class);
                    o.LJI(LIZJ);
                    gameBroadcastExceptionConfig.setExceptionInfo(LIZJ);
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return gameBroadcastExceptionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GameBroadcastExceptionConfig gameBroadcastExceptionConfig) {
        GameBroadcastExceptionConfig gameBroadcastExceptionConfig2 = gameBroadcastExceptionConfig;
        o.LJIIIZ(writer, "writer");
        if (gameBroadcastExceptionConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(gameBroadcastExceptionConfig2.getEnable());
        writer.LJI("exception_info");
        C65412Plo.LJ(this.LIZ, writer, gameBroadcastExceptionConfig2.getExceptionInfo(), ExceptionInfo.class);
        writer.LJFF();
    }
}
