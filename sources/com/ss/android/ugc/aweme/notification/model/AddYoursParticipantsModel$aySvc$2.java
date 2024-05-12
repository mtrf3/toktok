package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;

/* loaded from: classes10.dex */
public final class AddYoursParticipantsModel$aySvc$2 extends AbstractC65781Prl implements InterfaceC65784Pro<IAddYoursService> {
    public static final AddYoursParticipantsModel$aySvc$2 INSTANCE = new AddYoursParticipantsModel$aySvc$2();

    public AddYoursParticipantsModel$aySvc$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final IAddYoursService invoke() {
        return AddYoursServiceImpl.LJIJ();
    }
}
