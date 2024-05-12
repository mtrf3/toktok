package com.bytedance.android.livesdk.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPlayerAutoReleaseSwitch_OptTypeAdapter extends TypeAdapter<GiftPlayerAutoReleaseSwitch> {
    public final Gson LIZ;

    public GiftPlayerAutoReleaseSwitch_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftPlayerAutoReleaseSwitch read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftPlayerAutoReleaseSwitch giftPlayerAutoReleaseSwitch = new GiftPlayerAutoReleaseSwitch();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftPlayerAutoReleaseSwitch.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "alive_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftPlayerAutoReleaseSwitch.aliveDuration = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return giftPlayerAutoReleaseSwitch;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftPlayerAutoReleaseSwitch giftPlayerAutoReleaseSwitch) {
        GiftPlayerAutoReleaseSwitch giftPlayerAutoReleaseSwitch2 = giftPlayerAutoReleaseSwitch;
        o.LJIIIZ(writer, "writer");
        if (giftPlayerAutoReleaseSwitch2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(giftPlayerAutoReleaseSwitch2.enable);
        writer.LJI("alive_duration");
        writer.LJIJ(giftPlayerAutoReleaseSwitch2.aliveDuration);
        writer.LJFF();
    }
}
