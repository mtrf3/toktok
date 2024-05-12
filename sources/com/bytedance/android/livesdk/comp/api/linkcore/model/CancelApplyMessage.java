package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelApplyMessage extends F9E {
    public final LinkUser applicant;
    public final CustomLinkMessage customMessage;

    public static /* synthetic */ CancelApplyMessage copy$default(CancelApplyMessage cancelApplyMessage, LinkUser linkUser, CustomLinkMessage customLinkMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            linkUser = cancelApplyMessage.applicant;
        }
        if ((i & 2) != 0) {
            customLinkMessage = cancelApplyMessage.customMessage;
        }
        return cancelApplyMessage.copy(linkUser, customLinkMessage);
    }

    public final CancelApplyMessage copy(LinkUser applicant, CustomLinkMessage customMessage) {
        o.LJIIIZ(applicant, "applicant");
        o.LJIIIZ(customMessage, "customMessage");
        return new CancelApplyMessage(applicant, customMessage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.applicant, this.customMessage};
    }

    public final LinkUser getApplicant() {
        return this.applicant;
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public CancelApplyMessage(LinkUser applicant, CustomLinkMessage customMessage) {
        o.LJIIIZ(applicant, "applicant");
        o.LJIIIZ(customMessage, "customMessage");
        this.applicant = applicant;
        this.customMessage = customMessage;
    }
}
