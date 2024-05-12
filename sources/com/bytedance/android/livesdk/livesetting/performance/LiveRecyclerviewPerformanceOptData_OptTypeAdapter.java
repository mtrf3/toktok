package com.bytedance.android.livesdk.livesetting.performance;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRecyclerviewPerformanceOptData_OptTypeAdapter extends TypeAdapter<LiveRecyclerviewPerformanceOptData> {
    public final Gson LIZ;

    public LiveRecyclerviewPerformanceOptData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRecyclerviewPerformanceOptData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData = new LiveRecyclerviewPerformanceOptData(false, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -88889502) {
                    if (hashCode != 106069776) {
                        if (hashCode == 919802631 && LJJ.equals("reuse_pool")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveRecyclerviewPerformanceOptData.reusePool = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("other")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecyclerviewPerformanceOptData.other = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("viewholder_layout_preload")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveRecyclerviewPerformanceOptData.viewHolderLayoutPreload = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveRecyclerviewPerformanceOptData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData) {
        LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData2 = liveRecyclerviewPerformanceOptData;
        o.LJIIIZ(writer, "writer");
        if (liveRecyclerviewPerformanceOptData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("viewholder_layout_preload");
        writer.LJJIII(liveRecyclerviewPerformanceOptData2.viewHolderLayoutPreload);
        writer.LJI("reuse_pool");
        writer.LJJIII(liveRecyclerviewPerformanceOptData2.reusePool);
        writer.LJI("other");
        writer.LJJIII(liveRecyclerviewPerformanceOptData2.other);
        writer.LJFF();
    }
}
