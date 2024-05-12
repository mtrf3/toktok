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
public final class LiveQuizContainerOpt_OptTypeAdapter extends TypeAdapter<LiveQuizContainerOpt> {
    public final Gson LIZ;

    public LiveQuizContainerOpt_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveQuizContainerOpt read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveQuizContainerOpt liveQuizContainerOpt = new LiveQuizContainerOpt(false, null, null, null, false, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -100689769:
                        if (!LJJ.equals("preload_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveQuizContainerOpt.preloadSchema = reader.LJJIIZI();
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
                            liveQuizContainerOpt.preloadAllowList = LIZ;
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
                            liveQuizContainerOpt.reuseAllowList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1308176501:
                        if (!LJJ.equals("downgrade")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveQuizContainerOpt.downgrade = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1435758100:
                        if (!LJJ.equals("ignore_failed_preload")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveQuizContainerOpt.ignoreFailedPreload = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return liveQuizContainerOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveQuizContainerOpt liveQuizContainerOpt) {
        LiveQuizContainerOpt liveQuizContainerOpt2 = liveQuizContainerOpt;
        o.LJIIIZ(writer, "writer");
        if (liveQuizContainerOpt2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("downgrade");
        writer.LJJIII(liveQuizContainerOpt2.downgrade);
        writer.LJI("preload_schema");
        writer.LJJ(liveQuizContainerOpt2.preloadSchema);
        writer.LJI("reuse_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveQuizContainerOpt2.reuseAllowList, String.class);
        writer.LJI("preload_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveQuizContainerOpt2.preloadAllowList, String.class);
        writer.LJI("ignore_failed_preload");
        writer.LJJIII(liveQuizContainerOpt2.ignoreFailedPreload);
        writer.LJFF();
    }
}
