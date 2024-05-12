package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicSDKForwardStreamProtectConf_OptTypeAdapter extends TypeAdapter<LinkMicSDKForwardStreamProtectConf> {
    public final Gson LIZ;

    public LinkMicSDKForwardStreamProtectConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicSDKForwardStreamProtectConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf = new LinkMicSDKForwardStreamProtectConf(false, false, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -616720892) {
                    if (hashCode != -190841442) {
                        if (hashCode == 1812682945 && LJJ.equals("enable_miss_push")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                linkMicSDKForwardStreamProtectConf.enableMissPush = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable_push_more")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicSDKForwardStreamProtectConf.enablePushMore = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("push_more_timer_interval")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        linkMicSDKForwardStreamProtectConf.pushMoreTimerInterval = reader.LJIJJ();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return linkMicSDKForwardStreamProtectConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf) {
        LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf2 = linkMicSDKForwardStreamProtectConf;
        o.LJIIIZ(writer, "writer");
        if (linkMicSDKForwardStreamProtectConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_miss_push");
        writer.LJJIII(linkMicSDKForwardStreamProtectConf2.enableMissPush);
        writer.LJI("enable_push_more");
        writer.LJJIII(linkMicSDKForwardStreamProtectConf2.enablePushMore);
        writer.LJI("push_more_timer_interval");
        writer.LJIJ(linkMicSDKForwardStreamProtectConf2.pushMoreTimerInterval);
        writer.LJFF();
    }
}
