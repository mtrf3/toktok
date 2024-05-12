package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.C113734dF;
import X.C55096Ljo;
import X.C78886Uxe;
import X.C8VV;
import X.C94793nn;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleChatInputAssem extends ChatRoomInputBaseAssem {
    public SingleChatInputAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8W0
    public final void onPause() {
        ChatRoomEditTextAbility chatRoomEditTextAbility;
        super.onPause();
        if (C94793nn.LIZ() && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.hN();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ChatRoomEditTextAbility chatRoomEditTextAbility;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 135));
        C78886Uxe.LJJIIJZLJL(this, C113734dF.LJLIL);
        if (C94793nn.LIZ() && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.wT();
        }
    }
}
