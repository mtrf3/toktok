package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group;

import X.C40D;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatProtocolImpl implements GroupChatProtocol {
    public final GroupChatVM LJLIL;

    public GroupChatProtocolImpl(GroupChatVM groupChatVM) {
        o.LJIIIZ(groupChatVM, "groupChatVM");
        this.LJLIL = groupChatVM;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatProtocol
    public final void onActivityResult(int i, int i2, Intent intent) {
        GroupChatVM groupChatVM = this.LJLIL;
        groupChatVM.getClass();
        if (i == 16 && i2 == 2097) {
            groupChatVM.setState(C40D.LJLIL);
        }
    }
}
