package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import X.WM7;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleFallBackSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCapsuleFallBackSetting_CapsuleTypeScene_OptTypeAdapter extends TypeAdapter<LiveCapsuleFallBackSetting.CapsuleTypeScene> {
    public LiveCapsuleFallBackSetting_CapsuleTypeScene_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCapsuleFallBackSetting.CapsuleTypeScene read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveCapsuleFallBackSetting.CapsuleTypeScene capsuleTypeScene = new LiveCapsuleFallBackSetting.CapsuleTypeScene();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "type")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    capsuleTypeScene.type = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, WM7.SCENE_SERVICE)) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    capsuleTypeScene.scene = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return capsuleTypeScene;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveCapsuleFallBackSetting.CapsuleTypeScene capsuleTypeScene) {
        LiveCapsuleFallBackSetting.CapsuleTypeScene capsuleTypeScene2 = capsuleTypeScene;
        o.LJIIIZ(writer, "writer");
        if (capsuleTypeScene2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("type");
        C79062V1e.LJFF(capsuleTypeScene2.type, writer, WM7.SCENE_SERVICE);
        writer.LJJ(capsuleTypeScene2.scene);
        writer.LJFF();
    }
}
