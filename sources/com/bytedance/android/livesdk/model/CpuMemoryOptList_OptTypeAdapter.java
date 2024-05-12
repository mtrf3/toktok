package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CpuMemoryOptList_OptTypeAdapter extends TypeAdapter<CpuMemoryOptList> {
    public final Gson LIZ;

    public CpuMemoryOptList_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CpuMemoryOptList read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CpuMemoryOptList cpuMemoryOptList = new CpuMemoryOptList();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "live_cpu_memory_opt_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Integer.TYPE);
                    o.LJI(LIZIZ);
                    cpuMemoryOptList.optList = LIZIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return cpuMemoryOptList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CpuMemoryOptList cpuMemoryOptList) {
        CpuMemoryOptList cpuMemoryOptList2 = cpuMemoryOptList;
        o.LJIIIZ(writer, "writer");
        if (cpuMemoryOptList2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_cpu_memory_opt_list");
        C65412Plo.LJ(this.LIZ, writer, cpuMemoryOptList2.optList, Integer.TYPE);
        writer.LJFF();
    }
}
