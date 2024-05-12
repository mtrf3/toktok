package com.bytedance.android.livesdk.live.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFeedSettings_OptTypeAdapter extends TypeAdapter<LiveFeedSettings> {
    public final Gson LIZ;

    public LiveFeedSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFeedSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveFeedSettings liveFeedSettings = new LiveFeedSettings();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1930808873:
                        if (!LJJ.equals("channel_id")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFeedSettings.channel_id = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            liveFeedSettings.enable = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -804919194:
                        if (!LJJ.equals("is_follow")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFeedSettings.isFollow = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 106436749:
                        if (!LJJ.equals("param")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            liveFeedSettings.param = LJJIIZI2;
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
        return liveFeedSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveFeedSettings liveFeedSettings) {
        LiveFeedSettings liveFeedSettings2 = liveFeedSettings;
        o.LJIIIZ(writer, "writer");
        if (liveFeedSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJ(liveFeedSettings2.enable);
        writer.LJI("is_follow");
        writer.LJJIII(liveFeedSettings2.isFollow);
        writer.LJI("param");
        writer.LJJ(liveFeedSettings2.param);
        writer.LJI("channel_id");
        C77339UWx.LJFF(liveFeedSettings2.channel_id, writer);
    }
}
