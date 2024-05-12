package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftConfig_OptTypeAdapter extends TypeAdapter<GiftConfig> {
    public final Gson LIZ;

    public GiftConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftConfig giftConfig = new GiftConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2103107547:
                        if (!LJJ.equals("receive_msg")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfig._receiveMsgConfig = (ReceiveMsgConfig) C64.LIZ(this.LIZ, ReceiveMsgConfig.class, reader, "gson.getAdapter(ReceiveM…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1129822395:
                        if (!LJJ.equals("tray_combo")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfig._trayComboConfig = (TrayComboConfig) C64.LIZ(this.LIZ, TrayComboConfig.class, reader, "gson.getAdapter(TrayComb…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -143668406:
                        if (!LJJ.equals("msg_enqueue")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfig._msgEnqueueConfig = (MsgEnqueueConfig) C64.LIZ(this.LIZ, MsgEnqueueConfig.class, reader, "gson.getAdapter(MsgEnque…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -103715218:
                        if (!LJJ.equals("tray_stay_after_combo")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfig._trayStayAfterComboConfig = (TrayStayAfterComboConfig) C64.LIZ(this.LIZ, TrayStayAfterComboConfig.class, reader, "gson.getAdapter(TrayStay…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1349497446:
                        if (!LJJ.equals("tray_show")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfig._trayShowConfig = (TrayShowConfig) C64.LIZ(this.LIZ, TrayShowConfig.class, reader, "gson.getAdapter(TrayShow…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1588999809:
                        if (!LJJ.equals("tray_dismiss")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfig._trayDismissConfig = (TrayDismissConfig) C64.LIZ(this.LIZ, TrayDismissConfig.class, reader, "gson.getAdapter(TrayDism…:class.java).read(reader)");
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
        return giftConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftConfig giftConfig) {
        GiftConfig giftConfig2 = giftConfig;
        o.LJIIIZ(writer, "writer");
        if (giftConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("receive_msg");
        this.LIZ.LJIIJ(ReceiveMsgConfig.class).write(writer, giftConfig2._receiveMsgConfig);
        writer.LJI("msg_enqueue");
        this.LIZ.LJIIJ(MsgEnqueueConfig.class).write(writer, giftConfig2._msgEnqueueConfig);
        writer.LJI("tray_show");
        this.LIZ.LJIIJ(TrayShowConfig.class).write(writer, giftConfig2._trayShowConfig);
        writer.LJI("tray_combo");
        this.LIZ.LJIIJ(TrayComboConfig.class).write(writer, giftConfig2._trayComboConfig);
        writer.LJI("tray_stay_after_combo");
        this.LIZ.LJIIJ(TrayStayAfterComboConfig.class).write(writer, giftConfig2._trayStayAfterComboConfig);
        writer.LJI("tray_dismiss");
        this.LIZ.LJIIJ(TrayDismissConfig.class).write(writer, giftConfig2._trayDismissConfig);
        writer.LJFF();
    }
}
