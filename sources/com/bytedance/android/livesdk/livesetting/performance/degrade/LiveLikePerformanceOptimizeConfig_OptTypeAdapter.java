package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLikePerformanceOptimizeConfig_OptTypeAdapter extends TypeAdapter<LiveLikePerformanceOptimizeConfig> {
    public final Gson LIZ;

    public LiveLikePerformanceOptimizeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLikePerformanceOptimizeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveLikePerformanceOptimizeConfig liveLikePerformanceOptimizeConfig = new LiveLikePerformanceOptimizeConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -858243256) {
                    if (hashCode != -278195185) {
                        if (hashCode == 1600021770 && LJJ.equals("enable_function_downgrade")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveLikePerformanceOptimizeConfig.enableFunctionDowngrade = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable_function_remove")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveLikePerformanceOptimizeConfig.enableFunctionRemove = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable_performance_optimize")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveLikePerformanceOptimizeConfig.enablePerformanceOptimize = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveLikePerformanceOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveLikePerformanceOptimizeConfig liveLikePerformanceOptimizeConfig) {
        LiveLikePerformanceOptimizeConfig liveLikePerformanceOptimizeConfig2 = liveLikePerformanceOptimizeConfig;
        o.LJIIIZ(writer, "writer");
        if (liveLikePerformanceOptimizeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_performance_optimize");
        writer.LJJIII(liveLikePerformanceOptimizeConfig2.enablePerformanceOptimize);
        writer.LJI("enable_function_downgrade");
        writer.LJJIII(liveLikePerformanceOptimizeConfig2.enableFunctionDowngrade);
        writer.LJI("enable_function_remove");
        writer.LJJIII(liveLikePerformanceOptimizeConfig2.enableFunctionRemove);
        writer.LJFF();
    }
}
