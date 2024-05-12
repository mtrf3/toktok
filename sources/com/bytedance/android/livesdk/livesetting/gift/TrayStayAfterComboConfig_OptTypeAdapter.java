package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TrayStayAfterComboConfig_OptTypeAdapter extends TypeAdapter<TrayStayAfterComboConfig> {
    public final Gson LIZ;

    public TrayStayAfterComboConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayStayAfterComboConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TrayStayAfterComboConfig trayStayAfterComboConfig = new TrayStayAfterComboConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1947315872:
                        if (!LJJ.equals("stay_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            trayStayAfterComboConfig._stayType = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1435239934:
                        if (!LJJ.equals("first_send_extends_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            trayStayAfterComboConfig._firstSendExtendsDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 866892414:
                        if (!LJJ.equals("fix_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            trayStayAfterComboConfig._fixDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1646458260:
                        if (!LJJ.equals("dynamic_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                            o.LJI(LIZ);
                            trayStayAfterComboConfig._dynamicDuration = LIZ;
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
        return trayStayAfterComboConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, TrayStayAfterComboConfig trayStayAfterComboConfig) {
        TrayStayAfterComboConfig trayStayAfterComboConfig2 = trayStayAfterComboConfig;
        o.LJIIIZ(writer, "writer");
        if (trayStayAfterComboConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("stay_type");
        writer.LJJ(trayStayAfterComboConfig2._stayType);
        writer.LJI("fix_duration");
        C79062V1e.LJFF(trayStayAfterComboConfig2._fixDuration, writer, "dynamic_duration");
        C65412Plo.LIZLLL(this.LIZ, writer, trayStayAfterComboConfig2._dynamicDuration, Integer.TYPE);
        writer.LJI("first_send_extends_duration");
        C77339UWx.LJFF(trayStayAfterComboConfig2._firstSendExtendsDuration, writer);
    }
}
