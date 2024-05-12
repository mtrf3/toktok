package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTooltip_OptTypeAdapter extends TypeAdapter<LiveTooltip> {
    public LiveTooltip_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveTooltip read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveTooltip liveTooltip = new LiveTooltip();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -581842147) {
                    if (hashCode != -57570566) {
                        if (hashCode == 1384360852 && LJJ.equals("tooltip_activity_check")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveTooltip.tooltipActivityCheck = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("share_toolbar_behavior_delay")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTooltip.shareToolbarBehaviorDelay = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("tooltip_alog_control")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveTooltip.tooltipAlogControl = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveTooltip;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveTooltip liveTooltip) {
        LiveTooltip liveTooltip2 = liveTooltip;
        o.LJIIIZ(writer, "writer");
        if (liveTooltip2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("tooltip_alog_control");
        C79062V1e.LJFF(liveTooltip2.tooltipAlogControl, writer, "tooltip_activity_check");
        C79062V1e.LJFF(liveTooltip2.tooltipActivityCheck, writer, "share_toolbar_behavior_delay");
        C77339UWx.LJFF(liveTooltip2.shareToolbarBehaviorDelay, writer);
    }
}
