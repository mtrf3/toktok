package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter extends TypeAdapter<LiveSubsPrivilegeDetailOptConfig> {
    public final Gson LIZ;

    public LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSubsPrivilegeDetailOptConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig = new LiveSubsPrivilegeDetailOptConfig(false, null, null, null, false, 0L, false, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1972341613:
                        if (!LJJ.equals("preload_data_idle")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubsPrivilegeDetailOptConfig.preloadDataIdle = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1956700211:
                        if (!LJJ.equals("preload_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubsPrivilegeDetailOptConfig.preloadDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -100689769:
                        if (!LJJ.equals("preload_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubsPrivilegeDetailOptConfig.preloadSchema = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 329999306:
                        if (!LJJ.equals("preload_allow_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            liveSubsPrivilegeDetailOptConfig.preloadAllowList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 417997570:
                        if (!LJJ.equals("enable_preload_reuse")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubsPrivilegeDetailOptConfig.enablePreloadReuse = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1068943999:
                        if (!LJJ.equals("reuse_allow_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            liveSubsPrivilegeDetailOptConfig.reuseAllowList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1435758100:
                        if (!LJJ.equals("ignore_failed_preload")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubsPrivilegeDetailOptConfig.ignoreFailedPreload = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return liveSubsPrivilegeDetailOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig) {
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig2 = liveSubsPrivilegeDetailOptConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSubsPrivilegeDetailOptConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_preload_reuse");
        writer.LJJIII(liveSubsPrivilegeDetailOptConfig2.enablePreloadReuse);
        writer.LJI("preload_schema");
        writer.LJJ(liveSubsPrivilegeDetailOptConfig2.preloadSchema);
        writer.LJI("reuse_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveSubsPrivilegeDetailOptConfig2.reuseAllowList, String.class);
        writer.LJI("preload_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveSubsPrivilegeDetailOptConfig2.preloadAllowList, String.class);
        writer.LJI("ignore_failed_preload");
        writer.LJJIII(liveSubsPrivilegeDetailOptConfig2.ignoreFailedPreload);
        writer.LJI("preload_delay");
        writer.LJIJ(liveSubsPrivilegeDetailOptConfig2.preloadDelay);
        writer.LJI("preload_data_idle");
        writer.LJJIII(liveSubsPrivilegeDetailOptConfig2.preloadDataIdle);
        writer.LJFF();
    }
}
