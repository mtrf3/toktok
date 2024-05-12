package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageSEITimeoutConfig_OptTypeAdapter extends TypeAdapter<LiveMessageSEITimeoutConfig> {
    public LiveMessageSEITimeoutConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageSEITimeoutConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig = new LiveMessageSEITimeoutConfig(0.0f, 0L, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1283000954) {
                    if (hashCode != 3023545) {
                        if (hashCode == 653829648 && LJJ.equals("multiple")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMessageSEITimeoutConfig.multiple = (float) reader.LJIJ();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("bias")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageSEITimeoutConfig.bias = reader.LJIJJ();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("max_timeout")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMessageSEITimeoutConfig.maxTimeout = reader.LJIJJ();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMessageSEITimeoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig) {
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig2 = liveMessageSEITimeoutConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageSEITimeoutConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("multiple");
        C76965UIn.LIZIZ(liveMessageSEITimeoutConfig2.multiple, writer, "bias");
        writer.LJIJ(liveMessageSEITimeoutConfig2.bias);
        writer.LJI("max_timeout");
        writer.LJIJ(liveMessageSEITimeoutConfig2.maxTimeout);
        writer.LJFF();
    }
}
