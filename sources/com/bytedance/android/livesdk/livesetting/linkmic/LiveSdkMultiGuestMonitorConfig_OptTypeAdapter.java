package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestMonitorConfig_OptTypeAdapter extends TypeAdapter<LiveSdkMultiGuestMonitorConfig> {
    public final Gson LIZ;

    public LiveSdkMultiGuestMonitorConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSdkMultiGuestMonitorConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig = new LiveSdkMultiGuestMonitorConfig(false, 0L, 0, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2077031716:
                        if (!LJJ.equals("time_out")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSdkMultiGuestMonitorConfig.timeOUt = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 803187620:
                        if (!LJJ.equals("exception_room_msg_gap")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSdkMultiGuestMonitorConfig.exceptionRoomMsgGap = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1484622445:
                        if (!LJJ.equals("compatible_version")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSdkMultiGuestMonitorConfig.compatibleVersion = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1776078771:
                        if (!LJJ.equals("enable_android")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSdkMultiGuestMonitorConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return liveSdkMultiGuestMonitorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig) {
        LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig2 = liveSdkMultiGuestMonitorConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSdkMultiGuestMonitorConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_android");
        writer.LJJIII(liveSdkMultiGuestMonitorConfig2.enable);
        writer.LJI("time_out");
        writer.LJIJ(liveSdkMultiGuestMonitorConfig2.timeOUt);
        writer.LJI("compatible_version");
        C79062V1e.LJFF(liveSdkMultiGuestMonitorConfig2.compatibleVersion, writer, "exception_room_msg_gap");
        C77339UWx.LJFF(liveSdkMultiGuestMonitorConfig2.exceptionRoomMsgGap, writer);
    }
}
