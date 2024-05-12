package com.ss.android.ugc.aweme.qainvitation.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QAInvitationSettingsData {

    @InterfaceC65349Pkn("qa_invitation_limit")
    public final Integer invitationLimit;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QAInvitationSettingsData) && o.LJ(this.invitationLimit, ((QAInvitationSettingsData) obj).invitationLimit);
    }

    public final int hashCode() {
        Integer num = this.invitationLimit;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QAInvitationSettingsData(invitationLimit=");
        return s0.LIZJ(LIZ, this.invitationLimit, ')', LIZ);
    }

    public QAInvitationSettingsData(Integer num) {
        this.invitationLimit = num;
    }
}
