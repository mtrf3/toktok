package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AddNotReceiveFirstFrameExpConf_OptTypeAdapter extends TypeAdapter<AddNotReceiveFirstFrameExpConf> {
    public final Gson LIZ;

    public AddNotReceiveFirstFrameExpConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AddNotReceiveFirstFrameExpConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf = new AddNotReceiveFirstFrameExpConf(false, 0L, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -2077031716) {
                    if (hashCode != -1298848381) {
                        if (hashCode == 325120893 && LJJ.equals("report_when_not_reach_frame_linked")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                addNotReceiveFirstFrameExpConf.reportWhenNotReachFrameLinked = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            addNotReceiveFirstFrameExpConf.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("time_out")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        addNotReceiveFirstFrameExpConf.timeOUt = reader.LJIJJ();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return addNotReceiveFirstFrameExpConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf) {
        AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf2 = addNotReceiveFirstFrameExpConf;
        o.LJIIIZ(writer, "writer");
        if (addNotReceiveFirstFrameExpConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(addNotReceiveFirstFrameExpConf2.enable);
        writer.LJI("time_out");
        writer.LJIJ(addNotReceiveFirstFrameExpConf2.timeOUt);
        writer.LJI("report_when_not_reach_frame_linked");
        writer.LJJIII(addNotReceiveFirstFrameExpConf2.reportWhenNotReachFrameLinked);
        writer.LJFF();
    }
}
