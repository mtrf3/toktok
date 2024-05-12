package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C30593BzZ;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("game_partnership_refactoring_switch")
/* loaded from: classes6.dex */
public final class GameLivePartnershipApiOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final GamePartnershipRefactoringSwitch DEFAULT;
    public static final GameLivePartnershipApiOptSetting INSTANCE;
    public static final PartnershipRefactoringSwitchAnchorGuide anchorGuide;
    public static final boolean anchorGuideNewApi;
    public static final PartnershipRefactoringSwitchAudienceRoom audienceRoom;
    public static final boolean audienceRoomNewApi;
    public static final C5H3 config$delegate;

    static {
        boolean z;
        GameLivePartnershipApiOptSetting gameLivePartnershipApiOptSetting = new GameLivePartnershipApiOptSetting();
        INSTANCE = gameLivePartnershipApiOptSetting;
        DEFAULT = new GamePartnershipRefactoringSwitch(null, null, 3, null);
        config$delegate = C221108m2.LIZIZ(C30593BzZ.LJLIL);
        PartnershipRefactoringSwitchAnchorGuide partnershipRefactoringSwitchAnchorGuide = gameLivePartnershipApiOptSetting.getConfig().anchorGuide;
        anchorGuide = partnershipRefactoringSwitchAnchorGuide;
        PartnershipRefactoringSwitchAudienceRoom partnershipRefactoringSwitchAudienceRoom = gameLivePartnershipApiOptSetting.getConfig().audienceRoom;
        audienceRoom = partnershipRefactoringSwitchAudienceRoom;
        boolean z2 = true;
        if (partnershipRefactoringSwitchAudienceRoom.drops || partnershipRefactoringSwitchAudienceRoom.partnershipEntrance) {
            z = true;
        } else {
            z = false;
        }
        audienceRoomNewApi = z;
        if (!partnershipRefactoringSwitchAnchorGuide.gameLivePartnership && !partnershipRefactoringSwitchAnchorGuide.brandedContentToggle && !partnershipRefactoringSwitchAnchorGuide.event) {
            z2 = false;
        }
        anchorGuideNewApi = z2;
    }

    private final GamePartnershipRefactoringSwitch getConfig() {
        return (GamePartnershipRefactoringSwitch) config$delegate.getValue();
    }

    public final PartnershipRefactoringSwitchAnchorGuide getAnchorGuide() {
        return anchorGuide;
    }

    public final boolean getAnchorGuideNewApi() {
        return anchorGuideNewApi;
    }

    public final PartnershipRefactoringSwitchAudienceRoom getAudienceRoom() {
        return audienceRoom;
    }

    public final boolean getAudienceRoomNewApi() {
        return audienceRoomNewApi;
    }
}
