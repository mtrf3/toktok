package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group;

import X.C107094If;
import X.C214298b3;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78886Uxe;
import X.C78926UyI;
import X.C81253Gv;
import X.C8VV;
import X.C94793nn;
import X.C9BE;
import X.InterfaceC65350Pko;
import Y.IDLListenerS189S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatInputAssem extends ChatRoomInputBaseAssem {
    public final C214298b3 LJLLLL;
    public final String LJLLLLLL;
    public final IDLListenerS189S0100000_1 LJLZ;

    public GroupChatInputAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupChatInputVM.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 369), C107094If.INSTANCE, null);
        this.LJLLLLLL = "GroupChatInputAssem";
        this.LJLZ = new IDLListenerS189S0100000_1(this, 1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        if (C81253Gv.LIZ()) {
            getContainerView().getViewTreeObserver().removeOnGlobalLayoutListener(this.LJLZ);
        }
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
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 122));
        C78886Uxe.LJJIIJZLJL(this, new AqS167S0100000_1(this, 123));
        if (C94793nn.LIZ() && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.wT();
        }
    }
}
