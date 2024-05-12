package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SendGiftRetrySetting_SettingParams_OptTypeAdapter extends TypeAdapter<SendGiftRetrySetting.SettingParams> {
    public final Gson LIZ;

    public SendGiftRetrySetting_SettingParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SendGiftRetrySetting.SettingParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SendGiftRetrySetting.SettingParams settingParams = new SendGiftRetrySetting.SettingParams(false, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    settingParams.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "retry_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    settingParams.retryCount = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return settingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SendGiftRetrySetting.SettingParams settingParams) {
        SendGiftRetrySetting.SettingParams settingParams2 = settingParams;
        o.LJIIIZ(writer, "writer");
        if (settingParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(settingParams2.enable);
        writer.LJI("retry_count");
        C77339UWx.LJFF(settingParams2.retryCount, writer);
    }
}
