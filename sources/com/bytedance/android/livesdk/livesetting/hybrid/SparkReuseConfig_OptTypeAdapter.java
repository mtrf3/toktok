package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SparkReuseConfig_OptTypeAdapter extends TypeAdapter<SparkReuseConfig> {
    public final Gson LIZ;

    public SparkReuseConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SparkReuseConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SparkReuseConfig sparkReuseConfig = new SparkReuseConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkReuseConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -810883302:
                        if (!LJJ.equals("volume")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkReuseConfig.volume = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -126600503:
                        if (!LJJ.equals("deny_schema_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkReuseConfig.denySchemaList = (String[]) this.LIZ.LJIIJ(String[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 97555:
                        if (!LJJ.equals("biz")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            sparkReuseConfig.biz = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 255323270:
                        if (!LJJ.equals("allow_schema_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkReuseConfig.allowSchemaList = (String[]) this.LIZ.LJIIJ(String[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1344097533:
                        if (!LJJ.equals("expired_time_in_seconds")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkReuseConfig.expiredTimeInSeconds = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1865206070:
                        if (!LJJ.equals("match_rule")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sparkReuseConfig.matchRule = reader.LJIJI();
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
        return sparkReuseConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SparkReuseConfig sparkReuseConfig) {
        SparkReuseConfig sparkReuseConfig2 = sparkReuseConfig;
        o.LJIIIZ(writer, "writer");
        if (sparkReuseConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(sparkReuseConfig2.enable);
        writer.LJI("volume");
        C79062V1e.LJFF(sparkReuseConfig2.volume, writer, "biz");
        writer.LJJ(sparkReuseConfig2.biz);
        writer.LJI("expired_time_in_seconds");
        C79062V1e.LJFF(sparkReuseConfig2.expiredTimeInSeconds, writer, "allow_schema_list");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(String[].class);
        LJIIJ.write(writer, sparkReuseConfig2.allowSchemaList);
        writer.LJI("deny_schema_list");
        LJIIJ.write(writer, sparkReuseConfig2.denySchemaList);
        writer.LJI("match_rule");
        C77339UWx.LJFF(sparkReuseConfig2.matchRule, writer);
    }
}
