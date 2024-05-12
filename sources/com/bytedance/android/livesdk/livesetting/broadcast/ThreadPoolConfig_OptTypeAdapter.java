package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ThreadPoolConfig_OptTypeAdapter extends TypeAdapter<ThreadPoolConfig> {
    public ThreadPoolConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final ThreadPoolConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig(0, 0, 0L, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case 743350692:
                        if (!LJJ.equals("core_pool_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadPoolConfig.setCorePoolSize(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 796270585:
                        if (!LJJ.equals("keep_alive_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadPoolConfig.setKeepAliveTime(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1210596069:
                        if (!LJJ.equals("maximum_pool_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadPoolConfig.setMaximumPoolSize(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1346029625:
                        if (!LJJ.equals("thread_priority")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadPoolConfig.setThreadPriority(reader.LJIJI());
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
        return threadPoolConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ThreadPoolConfig threadPoolConfig) {
        ThreadPoolConfig threadPoolConfig2 = threadPoolConfig;
        o.LJIIIZ(writer, "writer");
        if (threadPoolConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("core_pool_size");
        writer.LJIJJ(Integer.valueOf(threadPoolConfig2.getCorePoolSize()));
        writer.LJI("maximum_pool_size");
        writer.LJIJJ(Integer.valueOf(threadPoolConfig2.getMaximumPoolSize()));
        writer.LJI("keep_alive_time");
        writer.LJIJ(threadPoolConfig2.getKeepAliveTime());
        writer.LJI("thread_priority");
        writer.LJIJJ(Integer.valueOf(threadPoolConfig2.getThreadPriority()));
        writer.LJFF();
    }
}
