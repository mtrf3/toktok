package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BarrageGradeResConfig_OptTypeAdapter extends TypeAdapter<BarrageGradeResConfig> {
    public BarrageGradeResConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final BarrageGradeResConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BarrageGradeResConfig barrageGradeResConfig = new BarrageGradeResConfig(0, null, null, null, null, 0L, null, null, 255, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2104692050:
                        if (!LJJ.equals("barrage_beam")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            barrageGradeResConfig.beam = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1662941595:
                        if (!LJJ.equals("effect_format")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            barrageGradeResConfig.effectFormat = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1321694675:
                        if (!LJJ.equals("gecko_channel")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            barrageGradeResConfig.barrageChannel = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -852641555:
                        if (!LJJ.equals("barrage_background")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            barrageGradeResConfig.background = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 98615255:
                        if (!LJJ.equals("grade")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            barrageGradeResConfig.level = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 782319637:
                        if (!LJJ.equals("barrage_ribbon")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            barrageGradeResConfig.ribbon = LJJIIZI5;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1370914818:
                        if (!LJJ.equals("anim_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            barrageGradeResConfig.animDuration = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1601523424:
                        if (!LJJ.equals("barrage_webp_animation")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI6 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI6, "reader.nextString()");
                            barrageGradeResConfig.barrageWebp = LJJIIZI6;
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
        return barrageGradeResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BarrageGradeResConfig barrageGradeResConfig) {
        BarrageGradeResConfig barrageGradeResConfig2 = barrageGradeResConfig;
        o.LJIIIZ(writer, "writer");
        if (barrageGradeResConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("grade");
        C79062V1e.LJFF(barrageGradeResConfig2.level, writer, "barrage_background");
        writer.LJJ(barrageGradeResConfig2.background);
        writer.LJI("barrage_ribbon");
        writer.LJJ(barrageGradeResConfig2.ribbon);
        writer.LJI("barrage_beam");
        writer.LJJ(barrageGradeResConfig2.beam);
        writer.LJI("barrage_webp_animation");
        writer.LJJ(barrageGradeResConfig2.barrageWebp);
        writer.LJI("anim_duration");
        writer.LJIJ(barrageGradeResConfig2.animDuration);
        writer.LJI("effect_format");
        writer.LJJ(barrageGradeResConfig2.effectFormat);
        writer.LJI("gecko_channel");
        writer.LJJ(barrageGradeResConfig2.barrageChannel);
        writer.LJFF();
    }
}
