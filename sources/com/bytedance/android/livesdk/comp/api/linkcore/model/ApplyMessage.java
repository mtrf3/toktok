package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ApplyMessage extends F9E {
    public final LinkUser applicant;
    public final CustomLinkMessage customMessage;

    public static /* synthetic */ ApplyMessage copy$default(ApplyMessage applyMessage, LinkUser linkUser, CustomLinkMessage customLinkMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            linkUser = applyMessage.applicant;
        }
        if ((i & 2) != 0) {
            customLinkMessage = applyMessage.customMessage;
        }
        return applyMessage.copy(linkUser, customLinkMessage);
    }

    public final ApplyMessage copy(LinkUser applicant, CustomLinkMessage customMessage) {
        o.LJIIIZ(applicant, "applicant");
        o.LJIIIZ(customMessage, "customMessage");
        return new ApplyMessage(applicant, customMessage);
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

    public ApplyMessage(LinkUser applicant, CustomLinkMessage customMessage) {
        o.LJIIIZ(applicant, "applicant");
        o.LJIIIZ(customMessage, "customMessage");
        this.applicant = applicant;
        this.customMessage = customMessage;
    }
}
