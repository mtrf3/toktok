package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PartnershipRefactoringSwitchAnchorGuide_OptTypeAdapter extends TypeAdapter<PartnershipRefactoringSwitchAnchorGuide> {
    public final Gson LIZ;

    public PartnershipRefactoringSwitchAnchorGuide_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PartnershipRefactoringSwitchAnchorGuide read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PartnershipRefactoringSwitchAnchorGuide partnershipRefactoringSwitchAnchorGuide = new PartnershipRefactoringSwitchAnchorGuide(false, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 96891546) {
                    if (hashCode != 864573662) {
                        if (hashCode == 1877097683 && LJJ.equals("branded_content_toggle")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                partnershipRefactoringSwitchAnchorGuide.brandedContentToggle = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("game_live_partnership")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            partnershipRefactoringSwitchAnchorGuide.gameLivePartnership = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("event")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        partnershipRefactoringSwitchAnchorGuide.event = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return partnershipRefactoringSwitchAnchorGuide;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PartnershipRefactoringSwitchAnchorGuide partnershipRefactoringSwitchAnchorGuide) {
        PartnershipRefactoringSwitchAnchorGuide partnershipRefactoringSwitchAnchorGuide2 = partnershipRefactoringSwitchAnchorGuide;
        o.LJIIIZ(writer, "writer");
        if (partnershipRefactoringSwitchAnchorGuide2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("game_live_partnership");
        writer.LJJIII(partnershipRefactoringSwitchAnchorGuide2.gameLivePartnership);
        writer.LJI("event");
        writer.LJJIII(partnershipRefactoringSwitchAnchorGuide2.event);
        writer.LJI("branded_content_toggle");
        writer.LJJIII(partnershipRefactoringSwitchAnchorGuide2.brandedContentToggle);
        writer.LJFF();
    }
}
