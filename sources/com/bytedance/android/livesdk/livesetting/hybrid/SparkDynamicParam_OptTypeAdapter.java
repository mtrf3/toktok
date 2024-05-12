package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SparkDynamicParam_OptTypeAdapter extends TypeAdapter<SparkDynamicParam> {
    public final Gson LIZ;

    public SparkDynamicParam_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SparkDynamicParam read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SparkDynamicParam sparkDynamicParam = new SparkDynamicParam();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -198625299) {
                    if (hashCode != 1165864767) {
                        if (hashCode == 1954273197 && LJJ.equals("param_key")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                sparkDynamicParam.paramKey = reader.LJJIIZI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("param_value")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkDynamicParam.paramValue = reader.LJJIIZI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("pattern_list")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        sparkDynamicParam.patternList = (String[]) C64.LIZ(this.LIZ, String[].class, reader, "gson.getAdapter(Array<St…:class.java).read(reader)");
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return sparkDynamicParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SparkDynamicParam sparkDynamicParam) {
        SparkDynamicParam sparkDynamicParam2 = sparkDynamicParam;
        o.LJIIIZ(writer, "writer");
        if (sparkDynamicParam2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("pattern_list");
        this.LIZ.LJIIJ(String[].class).write(writer, sparkDynamicParam2.patternList);
        writer.LJI("param_key");
        writer.LJJ(sparkDynamicParam2.paramKey);
        writer.LJI("param_value");
        writer.LJJ(sparkDynamicParam2.paramValue);
        writer.LJFF();
    }
}
