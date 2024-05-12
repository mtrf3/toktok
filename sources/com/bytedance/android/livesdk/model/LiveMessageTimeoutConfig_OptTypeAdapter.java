package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageTimeoutConfig_OptTypeAdapter extends TypeAdapter<LiveMessageTimeoutConfig> {
    public LiveMessageTimeoutConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageTimeoutConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageTimeoutConfig liveMessageTimeoutConfig = new LiveMessageTimeoutConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -843836544) {
                    if (hashCode != 611861429) {
                        if (hashCode == 1858670505 && LJJ.equals("ws_connect_timeout")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMessageTimeoutConfig.wsConnectTimeout = reader.LJIJJ();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("http_fetch_request_timeout")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageTimeoutConfig.httpFetchRequestTimeout = reader.LJIJJ();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("http_fetch_monitor_timeout")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMessageTimeoutConfig.httpFetchMonitorTimeout = reader.LJIJJ();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMessageTimeoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageTimeoutConfig liveMessageTimeoutConfig) {
        LiveMessageTimeoutConfig liveMessageTimeoutConfig2 = liveMessageTimeoutConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageTimeoutConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("http_fetch_monitor_timeout");
        writer.LJIJ(liveMessageTimeoutConfig2.httpFetchMonitorTimeout);
        writer.LJI("http_fetch_request_timeout");
        writer.LJIJ(liveMessageTimeoutConfig2.httpFetchRequestTimeout);
        writer.LJI("ws_connect_timeout");
        writer.LJIJ(liveMessageTimeoutConfig2.wsConnectTimeout);
        writer.LJFF();
    }
}
