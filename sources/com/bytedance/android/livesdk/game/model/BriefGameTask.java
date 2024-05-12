package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class BriefGameTask extends F9E {

    @InterfaceC65349Pkn("accepted_benefit_list")
    public List<BriefBenefitInfo> acceptedBenefitList;

    @InterfaceC65349Pkn("brief_game")
    public BriefGame briefGame;

    @InterfaceC65349Pkn("task")
    public PartnershipTask task;

    @InterfaceC65349Pkn("unaccepted_benefit_list")
    public List<BriefBenefitInfo> unacceptedBenefitList;

    @Override // X.F9E
    public final Object[] getObjects() {
        BriefGame briefGame = this.briefGame;
        PartnershipTask partnershipTask = this.task;
        return new Object[]{briefGame, briefGame, partnershipTask, partnershipTask};
    }
}
