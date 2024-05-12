package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RandomLinkMicSetting_OptTypeAdapter extends TypeAdapter<RandomLinkMicSetting> {
    public final Gson LIZ;

    public RandomLinkMicSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RandomLinkMicSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RandomLinkMicSetting randomLinkMicSetting = new RandomLinkMicSetting();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2126283716:
                        if (!LJJ.equals("quickly_disconnected_ban_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            randomLinkMicSetting.banTime = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1169365480:
                        if (!LJJ.equals("random_linkmic_bubble_strategy")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            randomLinkMicSetting.bubbleStrategy = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -414612084:
                        if (!LJJ.equals("quickly_disconnected_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            randomLinkMicSetting.disconnectTime = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 23041080:
                        if (!LJJ.equals("quickly_disconnected_judge")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            randomLinkMicSetting.disconnectJudge = (RandomLinkMicSetting.DisconnectJudge) this.LIZ.LJIIJ(RandomLinkMicSetting.DisconnectJudge.class).read(reader);
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
        return randomLinkMicSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RandomLinkMicSetting randomLinkMicSetting) {
        RandomLinkMicSetting randomLinkMicSetting2 = randomLinkMicSetting;
        o.LJIIIZ(writer, "writer");
        if (randomLinkMicSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("quickly_disconnected_time");
        C79062V1e.LJFF(randomLinkMicSetting2.disconnectTime, writer, "quickly_disconnected_judge");
        this.LIZ.LJIIJ(RandomLinkMicSetting.DisconnectJudge.class).write(writer, randomLinkMicSetting2.disconnectJudge);
        writer.LJI("quickly_disconnected_ban_time");
        C79062V1e.LJFF(randomLinkMicSetting2.banTime, writer, "random_linkmic_bubble_strategy");
        C77339UWx.LJFF(randomLinkMicSetting2.bubbleStrategy, writer);
    }
}
