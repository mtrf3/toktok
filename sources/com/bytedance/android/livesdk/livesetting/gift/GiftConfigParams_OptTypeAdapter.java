package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GiftConfigParams_OptTypeAdapter extends TypeAdapter<GiftConfigParams> {
    public final Gson LIZ;

    public GiftConfigParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftConfigParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftConfigParams giftConfigParams = new GiftConfigParams();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1691060630:
                        if (!LJJ.equals("self_side")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfigParams._selfSide = (GiftConfig) C64.LIZ(this.LIZ, GiftConfig.class, reader, "gson.getAdapter(GiftConf…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1546118485:
                        if (!LJJ.equals("other_queue_size_stairs")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, MsgStair.class);
                            o.LJI(LIZ);
                            giftConfigParams._otherQueueStairs = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1544274783:
                        if (!LJJ.equals("anchor_side")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfigParams._anchorSide = (GiftConfig) C64.LIZ(this.LIZ, GiftConfig.class, reader, "gson.getAdapter(GiftConf…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -182255322:
                        if (!LJJ.equals("other_side")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfigParams._otherSide = (GiftConfig) C64.LIZ(this.LIZ, GiftConfig.class, reader, "gson.getAdapter(GiftConf…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 808497534:
                        if (!LJJ.equals("enable_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftConfigParams._enableConfig = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2104906727:
                        if (!LJJ.equals("self_queue_size_stairs")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, MsgStair.class);
                            o.LJI(LIZ2);
                            giftConfigParams._selfQueueStairs = LIZ2;
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
        return giftConfigParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftConfigParams giftConfigParams) {
        GiftConfigParams giftConfigParams2 = giftConfigParams;
        o.LJIIIZ(writer, "writer");
        if (giftConfigParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_config");
        writer.LJJIII(giftConfigParams2._enableConfig);
        writer.LJI("self_side");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(GiftConfig.class);
        LJIIJ.write(writer, giftConfigParams2._selfSide);
        writer.LJI("anchor_side");
        LJIIJ.write(writer, giftConfigParams2._anchorSide);
        writer.LJI("other_side");
        LJIIJ.write(writer, giftConfigParams2._otherSide);
        writer.LJI("self_queue_size_stairs");
        C65412Plo.LIZLLL(this.LIZ, writer, giftConfigParams2._selfQueueStairs, MsgStair.class);
        writer.LJI("other_queue_size_stairs");
        C65412Plo.LIZLLL(this.LIZ, writer, giftConfigParams2._otherQueueStairs, MsgStair.class);
        writer.LJFF();
    }
}
