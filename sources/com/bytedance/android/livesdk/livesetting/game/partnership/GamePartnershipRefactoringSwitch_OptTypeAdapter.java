package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GamePartnershipRefactoringSwitch_OptTypeAdapter extends TypeAdapter<GamePartnershipRefactoringSwitch> {
    public final Gson LIZ;

    public GamePartnershipRefactoringSwitch_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GamePartnershipRefactoringSwitch read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GamePartnershipRefactoringSwitch gamePartnershipRefactoringSwitch = new GamePartnershipRefactoringSwitch(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "anchor_guide")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gamePartnershipRefactoringSwitch.anchorGuide = (PartnershipRefactoringSwitchAnchorGuide) C64.LIZ(this.LIZ, PartnershipRefactoringSwitchAnchorGuide.class, reader, "gson.getAdapter(Partners…:class.java).read(reader)");
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "audience_room")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    gamePartnershipRefactoringSwitch.audienceRoom = (PartnershipRefactoringSwitchAudienceRoom) C64.LIZ(this.LIZ, PartnershipRefactoringSwitchAudienceRoom.class, reader, "gson.getAdapter(Partners…:class.java).read(reader)");
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return gamePartnershipRefactoringSwitch;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GamePartnershipRefactoringSwitch gamePartnershipRefactoringSwitch) {
        GamePartnershipRefactoringSwitch gamePartnershipRefactoringSwitch2 = gamePartnershipRefactoringSwitch;
        o.LJIIIZ(writer, "writer");
        if (gamePartnershipRefactoringSwitch2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("anchor_guide");
        this.LIZ.LJIIJ(PartnershipRefactoringSwitchAnchorGuide.class).write(writer, gamePartnershipRefactoringSwitch2.anchorGuide);
        writer.LJI("audience_room");
        this.LIZ.LJIIJ(PartnershipRefactoringSwitchAudienceRoom.class).write(writer, gamePartnershipRefactoringSwitch2.audienceRoom);
        writer.LJFF();
    }
}
