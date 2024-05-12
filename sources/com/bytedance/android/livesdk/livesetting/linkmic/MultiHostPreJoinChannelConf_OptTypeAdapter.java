package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiHostPreJoinChannelConf_OptTypeAdapter extends TypeAdapter<MultiHostPreJoinChannelConf> {
    public final Gson LIZ;

    public MultiHostPreJoinChannelConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiHostPreJoinChannelConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiHostPreJoinChannelConf multiHostPreJoinChannelConf = new MultiHostPreJoinChannelConf(false, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -576019683) {
                    if (hashCode != 1824029442) {
                        if (hashCode == 2100731595 && LJJ.equals("send_apply_enable")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                multiHostPreJoinChannelConf.sendApplyEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("send_invite_enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiHostPreJoinChannelConf.sendInviteEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("receive_invite_enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        multiHostPreJoinChannelConf.receiveInviteEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return multiHostPreJoinChannelConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiHostPreJoinChannelConf multiHostPreJoinChannelConf) {
        MultiHostPreJoinChannelConf multiHostPreJoinChannelConf2 = multiHostPreJoinChannelConf;
        o.LJIIIZ(writer, "writer");
        if (multiHostPreJoinChannelConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("send_invite_enable");
        writer.LJJIII(multiHostPreJoinChannelConf2.sendInviteEnable);
        writer.LJI("receive_invite_enable");
        writer.LJJIII(multiHostPreJoinChannelConf2.receiveInviteEnable);
        writer.LJI("send_apply_enable");
        writer.LJJIII(multiHostPreJoinChannelConf2.sendApplyEnable);
        writer.LJFF();
    }
}
