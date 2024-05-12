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
public final class TrackerEventDeprecated_OptTypeAdapter extends TypeAdapter<TrackerEventDeprecated> {
    public final Gson LIZ;

    public TrackerEventDeprecated_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrackerEventDeprecated read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TrackerEventDeprecated trackerEventDeprecated = new TrackerEventDeprecated();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_tracker_event_deprecated_call_enabled")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    trackerEventDeprecated.isEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_tracker_event_deprecated_allow_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    trackerEventDeprecated.allowList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return trackerEventDeprecated;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, TrackerEventDeprecated trackerEventDeprecated) {
        TrackerEventDeprecated trackerEventDeprecated2 = trackerEventDeprecated;
        o.LJIIIZ(writer, "writer");
        if (trackerEventDeprecated2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_tracker_event_deprecated_call_enabled");
        writer.LJJIII(trackerEventDeprecated2.isEnable);
        writer.LJI("live_tracker_event_deprecated_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, trackerEventDeprecated2.allowList, String.class);
        writer.LJFF();
    }
}
