package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.AbstractC1038245q;
import X.AbstractC89473fD;
import X.InterfaceC1029942l;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageListAbilityImpl implements MessageListAbility {
    public final AbstractC1038245q LJLIL;
    public final MessageListAssem LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAbility
    public final List<IMMessage> Ph() {
        List<IMMessage> currentList = this.LJLIL.getCurrentList();
        o.LJIIIIZZ(currentList, "messageAdapter.currentList");
        return currentList;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAbility
    public final void Ts0(InterfaceC1029942l interfaceC1029942l) {
        this.LJLIL.LJLLLLLL(interfaceC1029942l);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAbility
    public final void W20(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
        this.LJLILLLLZI.M3(event);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAbility
    public final void ou0(InterfaceC1029942l interfaceC1029942l) {
        AbstractC1038245q abstractC1038245q = this.LJLIL;
        abstractC1038245q.getClass();
        abstractC1038245q.LJLJJI.remove(interfaceC1029942l);
    }

    public MessageListAbilityImpl(AbstractC1038245q messageAdapter, MessageListAssem messageListAssem) {
        o.LJIIIZ(messageAdapter, "messageAdapter");
        o.LJIIIZ(messageListAssem, "messageListAssem");
        this.LJLIL = messageAdapter;
        this.LJLILLLLZI = messageListAssem;
    }
}
