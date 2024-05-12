package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMatchTimeOutData_OptTypeAdapter extends TypeAdapter<LiveMatchTimeOutData> {
    public LiveMatchTimeOutData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchTimeOutData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMatchTimeOutData liveMatchTimeOutData = new LiveMatchTimeOutData(0, 0, 0, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1670075102) {
                    switch (hashCode) {
                        case 274232874:
                            if (!LJJ.equals("live_interact_match_timeout_v2")) {
                                break;
                            } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMatchTimeOutData.timeout_v2 = reader.LJIJI();
                                break;
                            } else {
                                reader.LJJIIJ();
                                break;
                            }
                        case 274232875:
                            if (!LJJ.equals("live_interact_match_timeout_v3")) {
                                break;
                            } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMatchTimeOutData.timeout_v3 = reader.LJIJI();
                                break;
                            } else {
                                reader.LJJIIJ();
                                break;
                            }
                        case 274232876:
                            if (!LJJ.equals("live_interact_match_timeout_v4")) {
                                break;
                            } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMatchTimeOutData.timeout_v4 = reader.LJIJI();
                                break;
                            } else {
                                reader.LJJIIJ();
                                break;
                            }
                    }
                } else if (LJJ.equals("live_interact_match_inviter_extra_time")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMatchTimeOutData.extra_time = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMatchTimeOutData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMatchTimeOutData liveMatchTimeOutData) {
        LiveMatchTimeOutData liveMatchTimeOutData2 = liveMatchTimeOutData;
        o.LJIIIZ(writer, "writer");
        if (liveMatchTimeOutData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_interact_match_timeout_v2");
        C79062V1e.LJFF(liveMatchTimeOutData2.timeout_v2, writer, "live_interact_match_timeout_v3");
        C79062V1e.LJFF(liveMatchTimeOutData2.timeout_v3, writer, "live_interact_match_timeout_v4");
        C79062V1e.LJFF(liveMatchTimeOutData2.timeout_v4, writer, "live_interact_match_inviter_extra_time");
        C77339UWx.LJFF(liveMatchTimeOutData2.extra_time, writer);
    }
}
