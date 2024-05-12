package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftGuideClientAI_OptTypeAdapter extends TypeAdapter<GiftGuideClientAI> {
    public final Gson LIZ;

    public GiftGuideClientAI_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftGuideClientAI read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftGuideClientAI giftGuideClientAI = new GiftGuideClientAI(null, null, 0L, 0L, false, 0L, 0, 0, 0, 0, null, null, 4095, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2037415281:
                        if (!LJJ.equals("gift_combo_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.giftComboCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1994156400:
                        if (!LJJ.equals("polling_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.pollingDuration = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1097435739:
                        if (!LJJ.equals("frequency_control_business_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            giftGuideClientAI.frequencyControlBusinessName = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -478449772:
                        if (!LJJ.equals("massive_comment_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.massiveCommentCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -385684946:
                        if (!LJJ.equals("frequency_control_task_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.frequencyControlTaskDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -260047304:
                        if (!LJJ.equals("collect_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.enableCollect = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 42932283:
                        if (!LJJ.equals("trigger_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.triggerDuration = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 629885866:
                        if (!LJJ.equals("business_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            giftGuideClientAI.businessName = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 874469560:
                        if (!LJJ.equals("massive_gifts_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.massiveGiftCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1113163498:
                        if (!LJJ.equals("client_ai_task_timeout")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.taskTimeout = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1914333241:
                        if (!LJJ.equals("auto_trigger_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, AutoTriggerConfig.class);
                            o.LJI(LIZIZ);
                            giftGuideClientAI.autoTriggerConfigMap = LIZIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2123749585:
                        if (!LJJ.equals("native_trigger_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftGuideClientAI.nativeTriggerConfig = (NativeTriggerConfig) C64.LIZ(this.LIZ, NativeTriggerConfig.class, reader, "gson.getAdapter(NativeTr…:class.java).read(reader)");
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
        return giftGuideClientAI;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftGuideClientAI giftGuideClientAI) {
        GiftGuideClientAI giftGuideClientAI2 = giftGuideClientAI;
        o.LJIIIZ(writer, "writer");
        if (giftGuideClientAI2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("frequency_control_business_name");
        writer.LJJ(giftGuideClientAI2.frequencyControlBusinessName);
        writer.LJI("business_name");
        writer.LJJ(giftGuideClientAI2.businessName);
        writer.LJI("frequency_control_task_delay");
        writer.LJIJ(giftGuideClientAI2.frequencyControlTaskDelay);
        writer.LJI("polling_duration");
        writer.LJIJ(giftGuideClientAI2.pollingDuration);
        writer.LJI("collect_enable");
        writer.LJJIII(giftGuideClientAI2.enableCollect);
        writer.LJI("trigger_duration");
        writer.LJIJ(giftGuideClientAI2.triggerDuration);
        writer.LJI("massive_comment_count");
        C79062V1e.LJFF(giftGuideClientAI2.massiveCommentCount, writer, "massive_gifts_count");
        C79062V1e.LJFF(giftGuideClientAI2.massiveGiftCount, writer, "gift_combo_count");
        C79062V1e.LJFF(giftGuideClientAI2.giftComboCount, writer, "client_ai_task_timeout");
        C79062V1e.LJFF(giftGuideClientAI2.taskTimeout, writer, "auto_trigger_config");
        C65412Plo.LJ(this.LIZ, writer, giftGuideClientAI2.autoTriggerConfigMap, AutoTriggerConfig.class);
        writer.LJI("native_trigger_config");
        this.LIZ.LJIIJ(NativeTriggerConfig.class).write(writer, giftGuideClientAI2.nativeTriggerConfig);
        writer.LJFF();
    }
}
