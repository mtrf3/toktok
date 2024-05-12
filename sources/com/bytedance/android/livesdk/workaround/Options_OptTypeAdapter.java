package com.bytedance.android.livesdk.workaround;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Options_OptTypeAdapter extends TypeAdapter<Options> {
    public final Gson LIZ;

    public Options_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Options read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        Options options = new Options(false, false, false, false, false, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1148453277:
                        if (!LJJ.equals("enable_preview_card")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            options.optEnablePreviewPositionChange = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -902400149:
                        if (!LJJ.equals("further_position_change")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            options.optFurtherPositionChange = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -182341896:
                        if (!LJJ.equals("other_plan")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            options.optOtherPlan = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1918273414:
                        if (!LJJ.equals("position_change")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            options.optPositionChange = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1941746047:
                        if (!LJJ.equals("enable_live_inner")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            options.optEnablePositionChange = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return options;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, Options options) {
        Options options2 = options;
        o.LJIIIZ(writer, "writer");
        if (options2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("position_change");
        writer.LJJIII(options2.optPositionChange);
        writer.LJI("further_position_change");
        writer.LJJIII(options2.optFurtherPositionChange);
        writer.LJI("other_plan");
        writer.LJJIII(options2.optOtherPlan);
        writer.LJI("enable_live_inner");
        writer.LJJIII(options2.optEnablePositionChange);
        writer.LJI("enable_preview_card");
        writer.LJJIII(options2.optEnablePreviewPositionChange);
        writer.LJFF();
    }
}
