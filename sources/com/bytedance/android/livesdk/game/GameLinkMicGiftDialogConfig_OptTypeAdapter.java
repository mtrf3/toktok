package com.bytedance.android.livesdk.game;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameLinkMicGiftDialogConfig_OptTypeAdapter extends TypeAdapter<GameLinkMicGiftDialogConfig> {
    public final Gson LIZ;

    public GameLinkMicGiftDialogConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameLinkMicGiftDialogConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GameLinkMicGiftDialogConfig gameLinkMicGiftDialogConfig = new GameLinkMicGiftDialogConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "block_widget")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gameLinkMicGiftDialogConfig.isBlockWidget = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "block_barrier")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gameLinkMicGiftDialogConfig.isBlockBarrier = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return gameLinkMicGiftDialogConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GameLinkMicGiftDialogConfig gameLinkMicGiftDialogConfig) {
        GameLinkMicGiftDialogConfig gameLinkMicGiftDialogConfig2 = gameLinkMicGiftDialogConfig;
        o.LJIIIZ(writer, "writer");
        if (gameLinkMicGiftDialogConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("block_widget");
        writer.LJJIII(gameLinkMicGiftDialogConfig2.isBlockWidget);
        writer.LJI("block_barrier");
        writer.LJJIII(gameLinkMicGiftDialogConfig2.isBlockBarrier);
        writer.LJFF();
    }
}
