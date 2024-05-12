package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FansClubLottieConfig_OptTypeAdapter extends TypeAdapter<FansClubLottieConfig> {
    public FansClubLottieConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubLottieConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FansClubLottieConfig fansClubLottieConfig = new FansClubLottieConfig(null, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1871513438) {
                    if (hashCode != -1526739296) {
                        if (hashCode == 1204962460 && LJJ.equals("fans_club_entrance_finish_all_task_lottie_name")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                fansClubLottieConfig.finishAllTaskLottieName = reader.LJJIIZI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("fans_club_entrance_weak_guide_lottie_name")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubLottieConfig.weakGuideLottieName = reader.LJJIIZI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("fans_club_entrance_lottie_channel")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        fansClubLottieConfig.lottieChannel = reader.LJJIIZI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return fansClubLottieConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FansClubLottieConfig fansClubLottieConfig) {
        FansClubLottieConfig fansClubLottieConfig2 = fansClubLottieConfig;
        o.LJIIIZ(writer, "writer");
        if (fansClubLottieConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("fans_club_entrance_lottie_channel");
        writer.LJJ(fansClubLottieConfig2.lottieChannel);
        writer.LJI("fans_club_entrance_weak_guide_lottie_name");
        writer.LJJ(fansClubLottieConfig2.weakGuideLottieName);
        writer.LJI("fans_club_entrance_finish_all_task_lottie_name");
        writer.LJJ(fansClubLottieConfig2.finishAllTaskLottieName);
        writer.LJFF();
    }
}
