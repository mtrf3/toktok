package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NickNameOptConfig_OptTypeAdapter extends TypeAdapter<NickNameOptConfig> {
    public final Gson LIZ;

    public NickNameOptConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final NickNameOptConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        NickNameOptConfig nickNameOptConfig = new NickNameOptConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_nick_name_opt_font")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    nickNameOptConfig.optFont = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_nick_name_opt_round_corner")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    nickNameOptConfig.optRoundCorner = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return nickNameOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, NickNameOptConfig nickNameOptConfig) {
        NickNameOptConfig nickNameOptConfig2 = nickNameOptConfig;
        o.LJIIIZ(writer, "writer");
        if (nickNameOptConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_nick_name_opt_font");
        writer.LJJIII(nickNameOptConfig2.optFont);
        writer.LJI("live_nick_name_opt_round_corner");
        writer.LJJIII(nickNameOptConfig2.optRoundCorner);
        writer.LJFF();
    }
}
