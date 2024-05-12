package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CommentComboTrayConfig_OptTypeAdapter extends TypeAdapter<CommentComboTrayConfig> {
    public CommentComboTrayConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final CommentComboTrayConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CommentComboTrayConfig commentComboTrayConfig = new CommentComboTrayConfig(0, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "comment_tray_group")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    commentComboTrayConfig.commentComboTrayGroup = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "comment_tray_dismiss_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    commentComboTrayConfig.commentComboTrayDuration = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return commentComboTrayConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CommentComboTrayConfig commentComboTrayConfig) {
        CommentComboTrayConfig commentComboTrayConfig2 = commentComboTrayConfig;
        o.LJIIIZ(writer, "writer");
        if (commentComboTrayConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("comment_tray_group");
        C79062V1e.LJFF(commentComboTrayConfig2.commentComboTrayGroup, writer, "comment_tray_dismiss_duration");
        writer.LJIJ(commentComboTrayConfig2.commentComboTrayDuration);
        writer.LJFF();
    }
}
