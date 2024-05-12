package com.bytedance.android.livesdk.livesetting.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GeckoSplit_OptTypeAdapter extends TypeAdapter<GeckoSplit> {
    public final Gson LIZ;

    public GeckoSplit_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GeckoSplit read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GeckoSplit geckoSplit = new GeckoSplit();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1572143979) {
                    if (hashCode != 1433957312) {
                        if (hashCode == 1553720286 && LJJ.equals("live_gecko_delay_trigger_down_time")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                geckoSplit.delayTime = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_gecko_asset_split_enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoSplit.isEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_gecko_asset_info_report_enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        geckoSplit.isEnableReport = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return geckoSplit;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GeckoSplit geckoSplit) {
        GeckoSplit geckoSplit2 = geckoSplit;
        o.LJIIIZ(writer, "writer");
        if (geckoSplit2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_gecko_asset_split_enable");
        writer.LJJIII(geckoSplit2.isEnable);
        writer.LJI("live_gecko_asset_info_report_enable");
        writer.LJJIII(geckoSplit2.isEnableReport);
        writer.LJI("live_gecko_delay_trigger_down_time");
        C77339UWx.LJFF(geckoSplit2.delayTime, writer);
    }
}
