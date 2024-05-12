package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VipFeedbackStruct_OptTypeAdapter extends TypeAdapter<VipFeedbackStruct> {
    public final Gson LIZ;

    public VipFeedbackStruct_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final VipFeedbackStruct read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        VipFeedbackStruct vipFeedbackStruct = new VipFeedbackStruct(false, null, null, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1609594047:
                        if (!LJJ.equals("enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            vipFeedbackStruct.enabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1430187120:
                        if (!LJJ.equals("gift_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            vipFeedbackStruct.giftSchema = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1088865735:
                        if (!LJJ.equals("recharge_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            vipFeedbackStruct.rechargeSchema = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1903528054:
                        if (!LJJ.equals("withdraw_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            vipFeedbackStruct.withdrawSchema = LJJIIZI3;
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
        return vipFeedbackStruct;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, VipFeedbackStruct vipFeedbackStruct) {
        VipFeedbackStruct vipFeedbackStruct2 = vipFeedbackStruct;
        o.LJIIIZ(writer, "writer");
        if (vipFeedbackStruct2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enabled");
        writer.LJJIII(vipFeedbackStruct2.enabled);
        writer.LJI("gift_schema");
        writer.LJJ(vipFeedbackStruct2.giftSchema);
        writer.LJI("withdraw_schema");
        writer.LJJ(vipFeedbackStruct2.withdrawSchema);
        writer.LJI("recharge_schema");
        writer.LJJ(vipFeedbackStruct2.rechargeSchema);
        writer.LJFF();
    }
}
