package com.bytedance.android.livesdk.livesetting.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GeckoSetting_OptTypeAdapter extends TypeAdapter<GeckoSetting> {
    public final Gson LIZ;

    public GeckoSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GeckoSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GeckoSetting geckoSetting = new GeckoSetting();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1380821995:
                        if (!LJJ.equals("boe_url_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            geckoSetting.boeUrlList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1370615288:
                        if (!LJJ.equals("ppe_url_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            geckoSetting.ppeUrlList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -970411666:
                        if (!LJJ.equals("url_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ3);
                            geckoSetting.urlList = LIZ3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -834809288:
                        if (!LJJ.equals("is_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoSetting.isEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1212116679:
                        if (!LJJ.equals("delay_trigger_down_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoSetting.delayTriggerDownTime = reader.LJIJI();
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
        return geckoSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GeckoSetting geckoSetting) {
        GeckoSetting geckoSetting2 = geckoSetting;
        o.LJIIIZ(writer, "writer");
        if (geckoSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("is_enable");
        writer.LJJIII(geckoSetting2.isEnable);
        writer.LJI("url_list");
        C65412Plo.LIZLLL(this.LIZ, writer, geckoSetting2.urlList, String.class);
        writer.LJI("ppe_url_list");
        C65412Plo.LIZLLL(this.LIZ, writer, geckoSetting2.ppeUrlList, String.class);
        writer.LJI("boe_url_list");
        C65412Plo.LIZLLL(this.LIZ, writer, geckoSetting2.boeUrlList, String.class);
        writer.LJI("delay_trigger_down_time");
        C77339UWx.LJFF(geckoSetting2.delayTriggerDownTime, writer);
    }
}
