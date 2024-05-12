package com.ss.android.ugc.aweme.comment.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class InviteCardControlInfo extends F9E {

    @InterfaceC65349Pkn("show_at_bottom")
    public final boolean showAtBottom;

    public static /* synthetic */ InviteCardControlInfo copy$default(InviteCardControlInfo inviteCardControlInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inviteCardControlInfo.showAtBottom;
        }
        return inviteCardControlInfo.copy(z);
    }

    public final InviteCardControlInfo copy(boolean z) {
        return new InviteCardControlInfo(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.showAtBottom)};
    }

    public InviteCardControlInfo(boolean z) {
        this.showAtBottom = z;
    }
}
