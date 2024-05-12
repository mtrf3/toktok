package com.bytedance.android.livesdk.livesetting.other;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FollowLiveBubbleConfig_OptTypeAdapter extends TypeAdapter<FollowLiveBubbleConfig> {
    public FollowLiveBubbleConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final FollowLiveBubbleConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FollowLiveBubbleConfig followLiveBubbleConfig = new FollowLiveBubbleConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "exp_group")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    followLiveBubbleConfig.expGroup = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "diff_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    followLiveBubbleConfig.diffTime = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return followLiveBubbleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FollowLiveBubbleConfig followLiveBubbleConfig) {
        FollowLiveBubbleConfig followLiveBubbleConfig2 = followLiveBubbleConfig;
        o.LJIIIZ(writer, "writer");
        if (followLiveBubbleConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("exp_group");
        C79062V1e.LJFF(followLiveBubbleConfig2.expGroup, writer, "diff_time");
        C77339UWx.LJFF(followLiveBubbleConfig2.diffTime, writer);
    }
}
