package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestOutViewerFriendConfig_OptTypeAdapter extends TypeAdapter<MultiGuestOutViewerFriendConfig> {
    public MultiGuestOutViewerFriendConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestOutViewerFriendConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestOutViewerFriendConfig multiGuestOutViewerFriendConfig = new MultiGuestOutViewerFriendConfig(0, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "step")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestOutViewerFriendConfig.step = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "init_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestOutViewerFriendConfig.initCount = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiGuestOutViewerFriendConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestOutViewerFriendConfig multiGuestOutViewerFriendConfig) {
        MultiGuestOutViewerFriendConfig multiGuestOutViewerFriendConfig2 = multiGuestOutViewerFriendConfig;
        o.LJIIIZ(writer, "writer");
        if (multiGuestOutViewerFriendConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("step");
        C79062V1e.LJFF(multiGuestOutViewerFriendConfig2.step, writer, "init_count");
        writer.LJIJ(multiGuestOutViewerFriendConfig2.initCount);
        writer.LJFF();
    }
}
