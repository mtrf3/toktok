package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveProfileOptimizeConfig_OptTypeAdapter extends TypeAdapter<LiveProfileOptimizeConfig> {
    public final Gson LIZ;

    public LiveProfileOptimizeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveProfileOptimizeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveProfileOptimizeConfig liveProfileOptimizeConfig = new LiveProfileOptimizeConfig(false, false, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1359820346) {
                    if (hashCode != -1137629335) {
                        if (hashCode == 1176604996 && LJJ.equals("cache_expired_time")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveProfileOptimizeConfig.cacheExpiredTime = reader.LJIJJ();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable_pre_pass")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveProfileOptimizeConfig.enablePrePass = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable_cache")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveProfileOptimizeConfig.enableCache = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveProfileOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveProfileOptimizeConfig liveProfileOptimizeConfig) {
        LiveProfileOptimizeConfig liveProfileOptimizeConfig2 = liveProfileOptimizeConfig;
        o.LJIIIZ(writer, "writer");
        if (liveProfileOptimizeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_pre_pass");
        writer.LJJIII(liveProfileOptimizeConfig2.enablePrePass);
        writer.LJI("enable_cache");
        writer.LJJIII(liveProfileOptimizeConfig2.enableCache);
        writer.LJI("cache_expired_time");
        writer.LJIJ(liveProfileOptimizeConfig2.cacheExpiredTime);
        writer.LJFF();
    }
}
