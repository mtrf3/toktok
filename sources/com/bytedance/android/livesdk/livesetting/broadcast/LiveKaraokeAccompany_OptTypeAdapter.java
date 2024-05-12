package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveKaraokeAccompany_OptTypeAdapter extends TypeAdapter<LiveKaraokeAccompany> {
    public LiveKaraokeAccompany_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveKaraokeAccompany read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveKaraokeAccompany liveKaraokeAccompany = new LiveKaraokeAccompany(0.0f, 0.0f, 0.0f, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 107876) {
                    if (hashCode != 108114) {
                        if (hashCode == 1544803905 && LJJ.equals("default")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveKaraokeAccompany.f7default = (float) reader.LJIJ();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("min")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveKaraokeAccompany.min = (float) reader.LJIJ();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("max")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveKaraokeAccompany.max = (float) reader.LJIJ();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveKaraokeAccompany;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveKaraokeAccompany liveKaraokeAccompany) {
        LiveKaraokeAccompany liveKaraokeAccompany2 = liveKaraokeAccompany;
        o.LJIIIZ(writer, "writer");
        if (liveKaraokeAccompany2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("max");
        C76965UIn.LIZIZ(liveKaraokeAccompany2.max, writer, "min");
        C76965UIn.LIZIZ(liveKaraokeAccompany2.min, writer, "default");
        writer.LJIJJ(Float.valueOf(liveKaraokeAccompany2.f7default));
        writer.LJFF();
    }
}
