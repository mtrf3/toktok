package com.ss.android.ugc.aweme.commercialize.advideo;

import X.V0N;

/* loaded from: classes8.dex */
public enum InvitationStatus {
    INVITATION_STATUS_PENDING(0),
    INVITATION_STATUS_ACCEPT(1),
    INVITATION_STATUS_DENY(2);

    public final int LJLIL;

    public static InvitationStatus valueOf(String str) {
        return (InvitationStatus) V0N.LJJJ(InvitationStatus.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    InvitationStatus(int i) {
        this.LJLIL = i;
    }
}
