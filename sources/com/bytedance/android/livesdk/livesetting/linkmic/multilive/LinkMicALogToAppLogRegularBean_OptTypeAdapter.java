package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicALogToAppLogRegularBean_OptTypeAdapter extends TypeAdapter<LinkMicALogToAppLogRegularBean> {
    public final Gson LIZ;

    public LinkMicALogToAppLogRegularBean_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicALogToAppLogRegularBean read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean = new LinkMicALogToAppLogRegularBean(null, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 47876975) {
                    if (hashCode != 1060492834) {
                        if (hashCode == 1286305040 && LJJ.equals("block_list")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                                o.LJI(LIZ);
                                linkMicALogToAppLogRegularBean.blockList = LIZ;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("tag_module_allow_list")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            linkMicALogToAppLogRegularBean.tagModuleAllowList = LIZ2;
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("level_allow_list")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                        o.LJI(LIZ3);
                        linkMicALogToAppLogRegularBean.levelAllowList = LIZ3;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return linkMicALogToAppLogRegularBean;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean) {
        LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean2 = linkMicALogToAppLogRegularBean;
        o.LJIIIZ(writer, "writer");
        if (linkMicALogToAppLogRegularBean2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("tag_module_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, linkMicALogToAppLogRegularBean2.tagModuleAllowList, String.class);
        writer.LJI("block_list");
        C65412Plo.LIZLLL(this.LIZ, writer, linkMicALogToAppLogRegularBean2.blockList, String.class);
        writer.LJI("level_allow_list");
        C65412Plo.LIZLLL(this.LIZ, writer, linkMicALogToAppLogRegularBean2.levelAllowList, String.class);
        writer.LJFF();
    }
}
