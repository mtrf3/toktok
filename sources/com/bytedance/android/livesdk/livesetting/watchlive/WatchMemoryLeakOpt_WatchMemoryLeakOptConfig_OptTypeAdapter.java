package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class WatchMemoryLeakOpt_WatchMemoryLeakOptConfig_OptTypeAdapter extends TypeAdapter<WatchMemoryLeakOpt.WatchMemoryLeakOptConfig> {
    public final Gson LIZ;

    public WatchMemoryLeakOpt_WatchMemoryLeakOptConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WatchMemoryLeakOpt.WatchMemoryLeakOptConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        WatchMemoryLeakOpt.WatchMemoryLeakOptConfig watchMemoryLeakOptConfig = new WatchMemoryLeakOpt.WatchMemoryLeakOptConfig(false, false, false, false, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            watchMemoryLeakOptConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1206947624:
                        if (!LJJ.equals("opt_ec_leak")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            watchMemoryLeakOptConfig.ecValue = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1051959291:
                        if (!LJJ.equals("live_remove_channel")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            watchMemoryLeakOptConfig.removeDataChannel = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1950687539:
                        if (!LJJ.equals("live_remove_fragment_tag")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            watchMemoryLeakOptConfig.removeFragment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return watchMemoryLeakOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, WatchMemoryLeakOpt.WatchMemoryLeakOptConfig watchMemoryLeakOptConfig) {
        WatchMemoryLeakOpt.WatchMemoryLeakOptConfig watchMemoryLeakOptConfig2 = watchMemoryLeakOptConfig;
        o.LJIIIZ(writer, "writer");
        if (watchMemoryLeakOptConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(watchMemoryLeakOptConfig2.enable);
        writer.LJI("live_remove_fragment_tag");
        writer.LJJIII(watchMemoryLeakOptConfig2.removeFragment);
        writer.LJI("live_remove_channel");
        writer.LJJIII(watchMemoryLeakOptConfig2.removeDataChannel);
        writer.LJI("opt_ec_leak");
        writer.LJJIII(watchMemoryLeakOptConfig2.ecValue);
        writer.LJFF();
    }
}
