package com.bytedance.android.livesdk.chatroom.model.backroom;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BackRoomListSettingConfig_OptTypeAdapter extends TypeAdapter<BackRoomListSettingConfig> {
    public final Gson LIZ;

    public BackRoomListSettingConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BackRoomListSettingConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BackRoomListSettingConfig backRoomListSettingConfig = new BackRoomListSettingConfig(null, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1731964363) {
                    if (hashCode != 1249374180) {
                        if (hashCode == 1286305040 && LJJ.equals("block_list")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                                o.LJI(LIZ);
                                backRoomListSettingConfig.blockList = LIZ;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("multi_list")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            backRoomListSettingConfig.multiList = LIZ2;
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("single_list")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                        o.LJI(LIZ3);
                        backRoomListSettingConfig.singleList = LIZ3;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return backRoomListSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BackRoomListSettingConfig backRoomListSettingConfig) {
        BackRoomListSettingConfig backRoomListSettingConfig2 = backRoomListSettingConfig;
        o.LJIIIZ(writer, "writer");
        if (backRoomListSettingConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("block_list");
        C65412Plo.LIZLLL(this.LIZ, writer, backRoomListSettingConfig2.blockList, String.class);
        writer.LJI("multi_list");
        C65412Plo.LIZLLL(this.LIZ, writer, backRoomListSettingConfig2.multiList, String.class);
        writer.LJI("single_list");
        C65412Plo.LIZLLL(this.LIZ, writer, backRoomListSettingConfig2.singleList, String.class);
        writer.LJFF();
    }
}
