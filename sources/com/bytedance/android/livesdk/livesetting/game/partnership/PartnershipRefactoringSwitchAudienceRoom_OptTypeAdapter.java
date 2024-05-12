package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PartnershipRefactoringSwitchAudienceRoom_OptTypeAdapter extends TypeAdapter<PartnershipRefactoringSwitchAudienceRoom> {
    public final Gson LIZ;

    public PartnershipRefactoringSwitchAudienceRoom_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PartnershipRefactoringSwitchAudienceRoom read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PartnershipRefactoringSwitchAudienceRoom partnershipRefactoringSwitchAudienceRoom = new PartnershipRefactoringSwitchAudienceRoom(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "partnership_entrance")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    partnershipRefactoringSwitchAudienceRoom.partnershipEntrance = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "drops")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    partnershipRefactoringSwitchAudienceRoom.drops = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return partnershipRefactoringSwitchAudienceRoom;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PartnershipRefactoringSwitchAudienceRoom partnershipRefactoringSwitchAudienceRoom) {
        PartnershipRefactoringSwitchAudienceRoom partnershipRefactoringSwitchAudienceRoom2 = partnershipRefactoringSwitchAudienceRoom;
        o.LJIIIZ(writer, "writer");
        if (partnershipRefactoringSwitchAudienceRoom2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("partnership_entrance");
        writer.LJJIII(partnershipRefactoringSwitchAudienceRoom2.partnershipEntrance);
        writer.LJI("drops");
        writer.LJJIII(partnershipRefactoringSwitchAudienceRoom2.drops);
        writer.LJFF();
    }
}
