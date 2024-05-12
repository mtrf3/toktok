package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Camera2AB_OptTypeAdapter extends TypeAdapter<Camera2AB> {
    public Camera2AB_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final Camera2AB read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        Camera2AB camera2AB = new Camera2AB();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "camera_type")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    camera2AB.cameraType = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "camera_hw_level")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    camera2AB.cameraHWLevel = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return camera2AB;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, Camera2AB camera2AB) {
        Camera2AB camera2AB2 = camera2AB;
        o.LJIIIZ(writer, "writer");
        if (camera2AB2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("camera_type");
        C79062V1e.LJFF(camera2AB2.cameraType, writer, "camera_hw_level");
        C77339UWx.LJFF(camera2AB2.cameraHWLevel, writer);
    }
}
