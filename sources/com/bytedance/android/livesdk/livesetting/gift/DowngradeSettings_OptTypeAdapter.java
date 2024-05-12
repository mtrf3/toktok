package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DowngradeSettings_OptTypeAdapter extends TypeAdapter<DowngradeSettings> {
    public DowngradeSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final DowngradeSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        DowngradeSettings downgradeSettings = new DowngradeSettings();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "min_memory")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    downgradeSettings.minMemory = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return downgradeSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, DowngradeSettings downgradeSettings) {
        DowngradeSettings downgradeSettings2 = downgradeSettings;
        o.LJIIIZ(writer, "writer");
        if (downgradeSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_memory");
        writer.LJIJ(downgradeSettings2.minMemory);
        writer.LJFF();
    }
}
