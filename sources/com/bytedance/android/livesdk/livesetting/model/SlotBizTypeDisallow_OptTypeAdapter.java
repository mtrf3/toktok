package com.bytedance.android.livesdk.livesetting.model;

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
public final class SlotBizTypeDisallow_OptTypeAdapter extends TypeAdapter<SlotBizTypeDisallow> {
    public final Gson LIZ;

    public SlotBizTypeDisallow_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SlotBizTypeDisallow read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SlotBizTypeDisallow slotBizTypeDisallow = new SlotBizTypeDisallow(false, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -429835555) {
                    if (hashCode != 260817523) {
                        if (hashCode == 1444699111 && LJJ.equals("icon_slot_disallow_list")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                                o.LJI(LIZ);
                                slotBizTypeDisallow.setIconSlotDisallowList(LIZ);
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("frame_slot_disallow_list")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            slotBizTypeDisallow.setFrameSlotDisallowList(LIZ2);
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("disallow_all")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        slotBizTypeDisallow.setDisallowAll(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return slotBizTypeDisallow;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SlotBizTypeDisallow slotBizTypeDisallow) {
        SlotBizTypeDisallow slotBizTypeDisallow2 = slotBizTypeDisallow;
        o.LJIIIZ(writer, "writer");
        if (slotBizTypeDisallow2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("disallow_all");
        writer.LJJIII(slotBizTypeDisallow2.getDisallowAll());
        writer.LJI("icon_slot_disallow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, slotBizTypeDisallow2.getIconSlotDisallowList(), String.class);
        writer.LJI("frame_slot_disallow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, slotBizTypeDisallow2.getFrameSlotDisallowList(), String.class);
        writer.LJFF();
    }
}
