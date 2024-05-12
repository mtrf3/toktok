package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GamePartnershipRefactoringSwitch {

    @InterfaceC65349Pkn("anchor_guide")
    public PartnershipRefactoringSwitchAnchorGuide anchorGuide;

    @InterfaceC65349Pkn("audience_room")
    public PartnershipRefactoringSwitchAudienceRoom audienceRoom;

    /* JADX WARN: Multi-variable type inference failed */
    public GamePartnershipRefactoringSwitch() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public GamePartnershipRefactoringSwitch(PartnershipRefactoringSwitchAnchorGuide anchorGuide, PartnershipRefactoringSwitchAudienceRoom audienceRoom) {
        o.LJIIIZ(anchorGuide, "anchorGuide");
        o.LJIIIZ(audienceRoom, "audienceRoom");
        this.anchorGuide = anchorGuide;
        this.audienceRoom = audienceRoom;
    }

    public /* synthetic */ GamePartnershipRefactoringSwitch(PartnershipRefactoringSwitchAnchorGuide partnershipRefactoringSwitchAnchorGuide, PartnershipRefactoringSwitchAudienceRoom partnershipRefactoringSwitchAudienceRoom, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PartnershipRefactoringSwitchAnchorGuide(false, false, false, 7, null) : partnershipRefactoringSwitchAnchorGuide, (i & 2) != 0 ? new PartnershipRefactoringSwitchAudienceRoom(false, false, 3, null) : partnershipRefactoringSwitchAudienceRoom);
    }
}
