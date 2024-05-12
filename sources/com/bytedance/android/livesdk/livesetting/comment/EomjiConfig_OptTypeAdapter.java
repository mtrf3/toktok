package com.bytedance.android.livesdk.livesetting.comment;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class EomjiConfig_OptTypeAdapter extends TypeAdapter<EomjiConfig> {
    public final Gson LIZ;

    public EomjiConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final EomjiConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        EomjiConfig eomjiConfig = new EomjiConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "emoji_enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    eomjiConfig.isShowEmojiConvenient = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "quick_comment_forbidden")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    eomjiConfig.isForbidQuickComment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return eomjiConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, EomjiConfig eomjiConfig) {
        EomjiConfig eomjiConfig2 = eomjiConfig;
        o.LJIIIZ(writer, "writer");
        if (eomjiConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("emoji_enable");
        writer.LJJIII(eomjiConfig2.isShowEmojiConvenient);
        writer.LJI("quick_comment_forbidden");
        writer.LJJIII(eomjiConfig2.isForbidQuickComment);
        writer.LJFF();
    }
}
