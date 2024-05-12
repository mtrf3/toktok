package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TrayComboConfig_OptTypeAdapter extends TypeAdapter<TrayComboConfig> {
    public final Gson LIZ;

    public TrayComboConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayComboConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TrayComboConfig trayComboConfig = new TrayComboConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -785704977) {
                    if (hashCode != -991413) {
                        if (hashCode == 1667386806 && LJJ.equals("dynamic_jump_interval")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                                o.LJI(LIZ);
                                trayComboConfig._jumpInterval = LIZ;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("combo_type")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            trayComboConfig._comboType = LJJIIZI;
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("animation_duration")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                        o.LJI(LIZ2);
                        trayComboConfig._animationDuration = LIZ2;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return trayComboConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, TrayComboConfig trayComboConfig) {
        TrayComboConfig trayComboConfig2 = trayComboConfig;
        o.LJIIIZ(writer, "writer");
        if (trayComboConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("animation_duration");
        Gson gson = this.LIZ;
        List<Integer> list = trayComboConfig2._animationDuration;
        Class cls = Integer.TYPE;
        C65412Plo.LIZLLL(gson, writer, list, cls);
        writer.LJI("combo_type");
        writer.LJJ(trayComboConfig2._comboType);
        writer.LJI("dynamic_jump_interval");
        C65412Plo.LIZLLL(this.LIZ, writer, trayComboConfig2._jumpInterval, cls);
        writer.LJFF();
    }
}
