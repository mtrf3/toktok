package com.bytedance.android.livesdk.livesetting.message;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageSampleRatio_OptTypeAdapter extends TypeAdapter<LiveMessageSampleRatio> {
    public LiveMessageSampleRatio_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageSampleRatio read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageSampleRatio liveMessageSampleRatio = new LiveMessageSampleRatio(0L, 0L, 0L, 0L, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1132661299:
                        if (!LJJ.equals("msg_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageSampleRatio.setMsgRatio(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -586860318:
                        if (!LJJ.equals("device_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageSampleRatio.setDeviceRatio(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -476538595:
                        if (!LJJ.equals("base_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageSampleRatio.setBaseRatio(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1933335191:
                        if (!LJJ.equals("user_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageSampleRatio.setUserRatio(reader.LJIJJ());
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
        return liveMessageSampleRatio;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageSampleRatio liveMessageSampleRatio) {
        LiveMessageSampleRatio liveMessageSampleRatio2 = liveMessageSampleRatio;
        o.LJIIIZ(writer, "writer");
        if (liveMessageSampleRatio2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("msg_ratio");
        writer.LJIJ(liveMessageSampleRatio2.getMsgRatio());
        writer.LJI("device_ratio");
        writer.LJIJ(liveMessageSampleRatio2.getDeviceRatio());
        writer.LJI("user_ratio");
        writer.LJIJ(liveMessageSampleRatio2.getUserRatio());
        writer.LJI("base_ratio");
        writer.LJIJ(liveMessageSampleRatio2.getBaseRatio());
        writer.LJFF();
    }
}
