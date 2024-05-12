package com.bytedance.android.livesdk.livesetting.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RecentlyLogIdSettings_OptTypeAdapter extends TypeAdapter<RecentlyLogIdSettings> {
    public final Gson LIZ;

    public RecentlyLogIdSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RecentlyLogIdSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RecentlyLogIdSettings recentlyLogIdSettings = new RecentlyLogIdSettings(false, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable_get_recently_logId")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    recentlyLogIdSettings.setEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enable_get_recently_logId_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    recentlyLogIdSettings.setList(LIZ);
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return recentlyLogIdSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RecentlyLogIdSettings recentlyLogIdSettings) {
        RecentlyLogIdSettings recentlyLogIdSettings2 = recentlyLogIdSettings;
        o.LJIIIZ(writer, "writer");
        if (recentlyLogIdSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_get_recently_logId");
        writer.LJJIII(recentlyLogIdSettings2.getEnable());
        writer.LJI("enable_get_recently_logId_list");
        C65412Plo.LIZLLL(this.LIZ, writer, recentlyLogIdSettings2.getList(), String.class);
        writer.LJFF();
    }
}
