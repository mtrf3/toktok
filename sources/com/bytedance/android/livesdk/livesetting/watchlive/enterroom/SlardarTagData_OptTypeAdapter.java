package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

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
public final class SlardarTagData_OptTypeAdapter extends TypeAdapter<SlardarTagData> {
    public final Gson LIZ;

    public SlardarTagData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SlardarTagData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SlardarTagData slardarTagData = new SlardarTagData(false, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1298848381) {
                    if (hashCode != -1229303081) {
                        if (hashCode == 278123446 && LJJ.equals("app_log_count")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                slardarTagData.logCount = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("message_count")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            slardarTagData.messageCount = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        slardarTagData.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return slardarTagData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SlardarTagData slardarTagData) {
        SlardarTagData slardarTagData2 = slardarTagData;
        o.LJIIIZ(writer, "writer");
        if (slardarTagData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(slardarTagData2.enable);
        writer.LJI("message_count");
        C79062V1e.LJFF(slardarTagData2.messageCount, writer, "app_log_count");
        C77339UWx.LJFF(slardarTagData2.logCount, writer);
    }
}
