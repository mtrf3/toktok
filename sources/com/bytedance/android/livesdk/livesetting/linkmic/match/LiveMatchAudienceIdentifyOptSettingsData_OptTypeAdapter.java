package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter extends TypeAdapter<LiveMatchAudienceIdentifyOptSettingsData> {
    public final Gson LIZ;

    public LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchAudienceIdentifyOptSettingsData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMatchAudienceIdentifyOptSettingsData liveMatchAudienceIdentifyOptSettingsData = new LiveMatchAudienceIdentifyOptSettingsData(false, false, false, false, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1531404538:
                        if (!LJJ.equals("enable_sei_fallback")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMatchAudienceIdentifyOptSettingsData.enable_sei_fallback = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1179020207:
                        if (!LJJ.equals("enable_open_message_cache")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMatchAudienceIdentifyOptSettingsData.enable_open_message_cache = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1108426868:
                        if (!LJJ.equals("enable_block_match_open_msg")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMatchAudienceIdentifyOptSettingsData.enable_block_match_open_msg = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1984162026:
                        if (!LJJ.equals("enable_armies_fallback")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMatchAudienceIdentifyOptSettingsData.enable_armies_fallback = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMatchAudienceIdentifyOptSettingsData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMatchAudienceIdentifyOptSettingsData liveMatchAudienceIdentifyOptSettingsData) {
        LiveMatchAudienceIdentifyOptSettingsData liveMatchAudienceIdentifyOptSettingsData2 = liveMatchAudienceIdentifyOptSettingsData;
        o.LJIIIZ(writer, "writer");
        if (liveMatchAudienceIdentifyOptSettingsData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_open_message_cache");
        writer.LJJIII(liveMatchAudienceIdentifyOptSettingsData2.enable_open_message_cache);
        writer.LJI("enable_sei_fallback");
        writer.LJJIII(liveMatchAudienceIdentifyOptSettingsData2.enable_sei_fallback);
        writer.LJI("enable_armies_fallback");
        writer.LJJIII(liveMatchAudienceIdentifyOptSettingsData2.enable_armies_fallback);
        writer.LJI("enable_block_match_open_msg");
        writer.LJJIII(liveMatchAudienceIdentifyOptSettingsData2.enable_block_match_open_msg);
        writer.LJFF();
    }
}
