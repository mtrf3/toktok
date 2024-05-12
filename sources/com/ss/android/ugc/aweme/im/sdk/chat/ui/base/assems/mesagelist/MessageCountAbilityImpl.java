package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.AbstractC1038245q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageCountAbilityImpl implements MessageCountAbility {
    public final AbstractC1038245q LJLIL;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageCountAbility
    public final int getItemCount() {
        return this.LJLIL.getItemCount();
    }

    public MessageCountAbilityImpl(AbstractC1038245q messageAdapter) {
        o.LJIIIZ(messageAdapter, "messageAdapter");
        this.LJLIL = messageAdapter;
    }
}
