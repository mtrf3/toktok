package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.model.LiveBeautyParam;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBeautyParam_OptTypeAdapter extends TypeAdapter<LiveBeautyParam> {
    public final Gson LIZ;

    public LiveBeautyParam_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBeautyParam read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveBeautyParam liveBeautyParam = new LiveBeautyParam();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1771699283:
                        if (!LJJ.equals("face_lift")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeautyParam.lift = (LiveBeautyParam.Param) this.LIZ.LJIIJ(LiveBeautyParam.Param.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1389855777:
                        if (!LJJ.equals("brightening")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeautyParam.brightening = (LiveBeautyParam.Param) this.LIZ.LJIIJ(LiveBeautyParam.Param.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -728007840:
                        if (!LJJ.equals("beauty_skin")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeautyParam.beauty = (LiveBeautyParam.Param) this.LIZ.LJIIJ(LiveBeautyParam.Param.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 109400042:
                        if (!LJJ.equals("sharp")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeautyParam.sharp = (LiveBeautyParam.Param) this.LIZ.LJIIJ(LiveBeautyParam.Param.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 734992449:
                        if (!LJJ.equals("big_eyes")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeautyParam.bigEyes = (LiveBeautyParam.Param) this.LIZ.LJIIJ(LiveBeautyParam.Param.class).read(reader);
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
        return liveBeautyParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveBeautyParam liveBeautyParam) {
        LiveBeautyParam liveBeautyParam2 = liveBeautyParam;
        o.LJIIIZ(writer, "writer");
        if (liveBeautyParam2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("brightening");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(LiveBeautyParam.Param.class);
        LJIIJ.write(writer, liveBeautyParam2.brightening);
        writer.LJI("beauty_skin");
        LJIIJ.write(writer, liveBeautyParam2.beauty);
        writer.LJI("big_eyes");
        LJIIJ.write(writer, liveBeautyParam2.bigEyes);
        writer.LJI("face_lift");
        LJIIJ.write(writer, liveBeautyParam2.lift);
        writer.LJI("sharp");
        LJIIJ.write(writer, liveBeautyParam2.sharp);
        writer.LJFF();
    }
}
