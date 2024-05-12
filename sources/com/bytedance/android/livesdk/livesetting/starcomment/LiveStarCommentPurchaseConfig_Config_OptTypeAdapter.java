package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStarCommentPurchaseConfig_Config_OptTypeAdapter extends TypeAdapter<LiveStarCommentPurchaseConfig.Config> {
    public LiveStarCommentPurchaseConfig_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveStarCommentPurchaseConfig.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveStarCommentPurchaseConfig.Config config = new LiveStarCommentPurchaseConfig.Config(0, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "purchase_page_refresh_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.refreshTime = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveStarCommentPurchaseConfig.Config config) {
        LiveStarCommentPurchaseConfig.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("purchase_page_refresh_time");
        C77339UWx.LJFF(config2.refreshTime, writer);
    }
}
