package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SeiParseConfig_OptTypeAdapter extends TypeAdapter<SeiParseConfig> {
    public final Gson LIZ;

    public SeiParseConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SeiParseConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SeiParseConfig seiParseConfig = new SeiParseConfig(false, false, false, false, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2088127079:
                        if (!LJJ.equals("sub_thread_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            seiParseConfig.setThreadEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1274492040:
                        if (!LJJ.equals("filter")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            seiParseConfig.setFilter(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -977551361:
                        if (!LJJ.equals("live_inner_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            seiParseConfig.setInnerEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 11660762:
                        if (!LJJ.equals("preview_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            seiParseConfig.setPreviewEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
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
        return seiParseConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SeiParseConfig seiParseConfig) {
        SeiParseConfig seiParseConfig2 = seiParseConfig;
        o.LJIIIZ(writer, "writer");
        if (seiParseConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("sub_thread_enable");
        writer.LJJIII(seiParseConfig2.getThreadEnable());
        writer.LJI("filter");
        writer.LJJIII(seiParseConfig2.getFilter());
        writer.LJI("preview_enable");
        writer.LJJIII(seiParseConfig2.getPreviewEnable());
        writer.LJI("live_inner_enable");
        writer.LJJIII(seiParseConfig2.getInnerEnable());
        writer.LJFF();
    }
}
