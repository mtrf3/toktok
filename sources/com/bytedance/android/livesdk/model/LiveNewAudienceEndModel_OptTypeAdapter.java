package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveNewAudienceEndModel_OptTypeAdapter extends TypeAdapter<LiveNewAudienceEndModel> {
    public LiveNewAudienceEndModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveNewAudienceEndModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveNewAudienceEndModel liveNewAudienceEndModel = new LiveNewAudienceEndModel();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveNewAudienceEndModel.enableLab = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -297955826:
                        if (!LJJ.equals("enable_count_down")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveNewAudienceEndModel.enableCountDown = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 449629334:
                        if (!LJJ.equals("count_down_delay_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveNewAudienceEndModel.timeCountDown = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1391106933:
                        if (!LJJ.equals("count_down_total_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveNewAudienceEndModel.timeJumpRoom = reader.LJIJI();
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
        return liveNewAudienceEndModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveNewAudienceEndModel liveNewAudienceEndModel) {
        LiveNewAudienceEndModel liveNewAudienceEndModel2 = liveNewAudienceEndModel;
        o.LJIIIZ(writer, "writer");
        if (liveNewAudienceEndModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_count_down");
        C79062V1e.LJFF(liveNewAudienceEndModel2.enableCountDown, writer, "enable");
        C79062V1e.LJFF(liveNewAudienceEndModel2.enableLab, writer, "count_down_delay_time");
        C79062V1e.LJFF(liveNewAudienceEndModel2.timeCountDown, writer, "count_down_total_time");
        C77339UWx.LJFF(liveNewAudienceEndModel2.timeJumpRoom, writer);
    }
}
