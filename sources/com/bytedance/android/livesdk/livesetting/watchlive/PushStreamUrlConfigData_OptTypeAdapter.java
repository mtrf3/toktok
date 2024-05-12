package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PushStreamUrlConfigData_OptTypeAdapter extends TypeAdapter<PushStreamUrlConfigData> {
    public PushStreamUrlConfigData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final PushStreamUrlConfigData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PushStreamUrlConfigData pushStreamUrlConfigData = new PushStreamUrlConfigData();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "cache_size")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    pushStreamUrlConfigData.cacheSize = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "expire_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    pushStreamUrlConfigData.expireTime = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return pushStreamUrlConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PushStreamUrlConfigData pushStreamUrlConfigData) {
        PushStreamUrlConfigData pushStreamUrlConfigData2 = pushStreamUrlConfigData;
        o.LJIIIZ(writer, "writer");
        if (pushStreamUrlConfigData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("cache_size");
        C79062V1e.LJFF(pushStreamUrlConfigData2.cacheSize, writer, "expire_time");
        C77339UWx.LJFF(pushStreamUrlConfigData2.expireTime, writer);
    }
}
