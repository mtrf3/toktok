package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CheckBattleInfoConfig_OptTypeAdapter extends TypeAdapter<CheckBattleInfoConfig> {
    public final Gson LIZ;

    public CheckBattleInfoConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CheckBattleInfoConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CheckBattleInfoConfig checkBattleInfoConfig = new CheckBattleInfoConfig(false, 0.0f, 0, 0, 0, 0, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1838563601:
                        if (!LJJ.equals("avg_settling_message_cost")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            checkBattleInfoConfig.avg_settling_message_cost = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -929001209:
                        if (!LJJ.equals("retry_duration_when_enter")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            checkBattleInfoConfig.retry_duration_when_enter = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 289356666:
                        if (!LJJ.equals("retry_count_when_enter")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            checkBattleInfoConfig.retry_count_when_enter = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 403958833:
                        if (!LJJ.equals("retry_count_when_finish")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            checkBattleInfoConfig.retry_count_when_finish = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1289570372:
                        if (!LJJ.equals("retry_duration_when_finish")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            checkBattleInfoConfig.retry_duration_when_finish = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1901962167:
                        if (!LJJ.equals("avg_settling_cost")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            checkBattleInfoConfig.avg_settling_cost = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return checkBattleInfoConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CheckBattleInfoConfig checkBattleInfoConfig) {
        CheckBattleInfoConfig checkBattleInfoConfig2 = checkBattleInfoConfig;
        o.LJIIIZ(writer, "writer");
        if (checkBattleInfoConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("avg_settling_cost");
        writer.LJJIII(checkBattleInfoConfig2.avg_settling_cost);
        writer.LJI("avg_settling_message_cost");
        C76965UIn.LIZIZ(checkBattleInfoConfig2.avg_settling_message_cost, writer, "retry_count_when_enter");
        C79062V1e.LJFF(checkBattleInfoConfig2.retry_count_when_enter, writer, "retry_count_when_finish");
        C79062V1e.LJFF(checkBattleInfoConfig2.retry_count_when_finish, writer, "retry_duration_when_enter");
        C79062V1e.LJFF(checkBattleInfoConfig2.retry_duration_when_enter, writer, "retry_duration_when_finish");
        C77339UWx.LJFF(checkBattleInfoConfig2.retry_duration_when_finish, writer);
    }
}
