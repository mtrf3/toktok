package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTimeNtpOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTimeNtpOpt_TimeNormal_OptTypeAdapter extends TypeAdapter<LiveTimeNtpOpt.TimeNormal> {
    public final Gson LIZ;

    public LiveTimeNtpOpt_TimeNormal_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveTimeNtpOpt.TimeNormal read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveTimeNtpOpt.TimeNormal timeNormal = new LiveTimeNtpOpt.TimeNormal(false, false, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1429170748) {
                    if (hashCode != -889313107) {
                        if (hashCode == -631653608 && LJJ.equals("enable_ws")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                timeNormal.enableWS = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("http_delay_threshold_for_ntp")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            timeNormal.httpDelayThresholdForNTP = reader.LJIJJ();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable_http")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        timeNormal.enableHttp = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return timeNormal;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveTimeNtpOpt.TimeNormal timeNormal) {
        LiveTimeNtpOpt.TimeNormal timeNormal2 = timeNormal;
        o.LJIIIZ(writer, "writer");
        if (timeNormal2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_ws");
        writer.LJJIII(timeNormal2.enableWS);
        writer.LJI("enable_http");
        writer.LJJIII(timeNormal2.enableHttp);
        writer.LJI("http_delay_threshold_for_ntp");
        writer.LJIJ(timeNormal2.httpDelayThresholdForNTP);
        writer.LJFF();
    }
}
