package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptMock;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCoHostFriendNoticeOptMock_MockParams_OptTypeAdapter extends TypeAdapter<LiveCoHostFriendNoticeOptMock.MockParams> {
    public LiveCoHostFriendNoticeOptMock_MockParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCoHostFriendNoticeOptMock.MockParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveCoHostFriendNoticeOptMock.MockParams mockParams = new LiveCoHostFriendNoticeOptMock.MockParams(0, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1395851432) {
                    if (hashCode != -1298848381) {
                        if (hashCode == 1952845904 && LJJ.equals("next_execution_delay")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                mockParams.nextExecutionDelay = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mockParams.enable = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("should_request_for_the_notice")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        mockParams.shouldRequestForTheNotice = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return mockParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveCoHostFriendNoticeOptMock.MockParams mockParams) {
        LiveCoHostFriendNoticeOptMock.MockParams mockParams2 = mockParams;
        o.LJIIIZ(writer, "writer");
        if (mockParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C79062V1e.LJFF(mockParams2.enable, writer, "next_execution_delay");
        C79062V1e.LJFF(mockParams2.nextExecutionDelay, writer, "should_request_for_the_notice");
        C77339UWx.LJFF(mockParams2.shouldRequestForTheNotice, writer);
    }
}
