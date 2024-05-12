package com.bytedance.android.livesdk.livesetting.comment;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class InputDialogFixSettingModel_OptTypeAdapter extends TypeAdapter<InputDialogFixSettingModel> {
    public final Gson LIZ;

    public InputDialogFixSettingModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final InputDialogFixSettingModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        InputDialogFixSettingModel inputDialogFixSettingModel = new InputDialogFixSettingModel(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    inputDialogFixSettingModel.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "delayTime")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    inputDialogFixSettingModel.delayTime = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return inputDialogFixSettingModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, InputDialogFixSettingModel inputDialogFixSettingModel) {
        InputDialogFixSettingModel inputDialogFixSettingModel2 = inputDialogFixSettingModel;
        o.LJIIIZ(writer, "writer");
        if (inputDialogFixSettingModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(inputDialogFixSettingModel2.enable);
        writer.LJI("delayTime");
        writer.LJIJ(inputDialogFixSettingModel2.delayTime);
        writer.LJFF();
    }
}
