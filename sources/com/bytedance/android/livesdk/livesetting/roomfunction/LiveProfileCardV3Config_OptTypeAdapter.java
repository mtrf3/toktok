package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveProfileCardV3Config_OptTypeAdapter extends TypeAdapter<LiveProfileCardV3Config> {
    public final Gson LIZ;

    public LiveProfileCardV3Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveProfileCardV3Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveProfileCardV3Config liveProfileCardV3Config = new LiveProfileCardV3Config(false, 0L, false, false, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1971446229:
                        if (!LJJ.equals("author_prefetch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveProfileCardV3Config.setEnableAuthorPrefetch(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1459432471:
                        if (!LJJ.equals("fetch_timeout_ms")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveProfileCardV3Config.setFetchTimeoutMs(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -444169996:
                        if (!LJJ.equals("fast_follow")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveProfileCardV3Config.setEnableFastFollow(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 497021082:
                        if (!LJJ.equals("fetch_then_show")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveProfileCardV3Config.setFetchThenShow(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
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
        return liveProfileCardV3Config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveProfileCardV3Config liveProfileCardV3Config) {
        LiveProfileCardV3Config liveProfileCardV3Config2 = liveProfileCardV3Config;
        o.LJIIIZ(writer, "writer");
        if (liveProfileCardV3Config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("fetch_then_show");
        writer.LJJIII(liveProfileCardV3Config2.getFetchThenShow());
        writer.LJI("fetch_timeout_ms");
        writer.LJIJ(liveProfileCardV3Config2.getFetchTimeoutMs());
        writer.LJI("author_prefetch");
        writer.LJJIII(liveProfileCardV3Config2.getEnableAuthorPrefetch());
        writer.LJI("fast_follow");
        writer.LJJIII(liveProfileCardV3Config2.getEnableFastFollow());
        writer.LJFF();
    }
}
