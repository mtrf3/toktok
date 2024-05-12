package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BarrageEnterRoomResConfig_OptTypeAdapter extends TypeAdapter<BarrageEnterRoomResConfig> {
    public BarrageEnterRoomResConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final BarrageEnterRoomResConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BarrageEnterRoomResConfig barrageEnterRoomResConfig = new BarrageEnterRoomResConfig(0, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1321694675) {
                    if (hashCode != -852641555) {
                        if (hashCode == 98615255 && LJJ.equals("grade")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                barrageEnterRoomResConfig.level = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("barrage_background")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            barrageEnterRoomResConfig.background = LJJIIZI;
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("gecko_channel")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        String LJJIIZI2 = reader.LJJIIZI();
                        o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                        barrageEnterRoomResConfig.barrageChannel = LJJIIZI2;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return barrageEnterRoomResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BarrageEnterRoomResConfig barrageEnterRoomResConfig) {
        BarrageEnterRoomResConfig barrageEnterRoomResConfig2 = barrageEnterRoomResConfig;
        o.LJIIIZ(writer, "writer");
        if (barrageEnterRoomResConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("grade");
        C79062V1e.LJFF(barrageEnterRoomResConfig2.level, writer, "barrage_background");
        writer.LJJ(barrageEnterRoomResConfig2.background);
        writer.LJI("gecko_channel");
        writer.LJJ(barrageEnterRoomResConfig2.barrageChannel);
        writer.LJFF();
    }
}
