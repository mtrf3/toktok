package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SurfaceViewScene_OptTypeAdapter extends TypeAdapter<SurfaceViewScene> {
    public final Gson LIZ;

    public SurfaceViewScene_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SurfaceViewScene read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SurfaceViewScene surfaceViewScene = new SurfaceViewScene(false, false, false, false, null, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1336041635:
                        if (!LJJ.equals("outside_with_feed")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            surfaceViewScene.outside_with_feed = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 380150922:
                        if (!LJJ.equals("outside_normal_click")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            surfaceViewScene.outside_normal_click = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 823139725:
                        if (!LJJ.equals("inner_draw")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            surfaceViewScene.inner_draw = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 823321719:
                        if (!LJJ.equals("inner_jump")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            surfaceViewScene.inner_jump = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 866027580:
                        if (!LJJ.equals("forbidden_entrance")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            surfaceViewScene.forbidden_entrance = LJJIIZI;
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
        return surfaceViewScene;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SurfaceViewScene surfaceViewScene) {
        SurfaceViewScene surfaceViewScene2 = surfaceViewScene;
        o.LJIIIZ(writer, "writer");
        if (surfaceViewScene2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("outside_with_feed");
        writer.LJJIII(surfaceViewScene2.outside_with_feed);
        writer.LJI("outside_normal_click");
        writer.LJJIII(surfaceViewScene2.outside_normal_click);
        writer.LJI("inner_draw");
        writer.LJJIII(surfaceViewScene2.inner_draw);
        writer.LJI("inner_jump");
        writer.LJJIII(surfaceViewScene2.inner_jump);
        writer.LJI("forbidden_entrance");
        writer.LJJ(surfaceViewScene2.forbidden_entrance);
        writer.LJFF();
    }
}
