package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.readstate;

import X.C17N;
import X.C212428Vi;
import X.C221108m2;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C89333ez;
import X.C8W0;
import X.C99033ud;
import X.InterfaceC99713vj;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;

/* loaded from: classes2.dex */
public final class ReadStateAssem extends C8W0 {
    public ReadStateViewModel LJLJI;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
    public final C5H3 LJLILLLLZI = C17N.LJJIJL(new AqS151S0100000_1(this, 425));
    public final C5H3 LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 423));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 424));

    @Override // X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LJLJJI.getValue();
        if (LIZLLL == null || chatRoomViewModel == null) {
            return;
        }
        InterfaceC99713vj interfaceC99713vj = chatRoomViewModel.LJLL;
        ReadStateViewModel readStateViewModel = (ReadStateViewModel) ViewModelProviders.of(LIZLLL).get(ReadStateViewModel.class);
        this.LJLJI = readStateViewModel;
        readStateViewModel.jv0(interfaceC99713vj.getConversationId(), interfaceC99713vj, (C99033ud) this.LJLILLLLZI.getValue());
        readStateViewModel.G8(LIZLLL);
        MessageListAbility messageListAbility = (MessageListAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MessageListAbility.class, null);
        if (messageListAbility != null) {
            messageListAbility.Ts0(readStateViewModel);
        }
        ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null);
        if (chatRoomEditTextAbility == null) {
            return;
        }
        chatRoomEditTextAbility.Uc0((TextWatcher) this.LJLJJL.getValue());
    }

    @Override // X.C8W0
    public final void onDestroy() {
        MessageListAbility messageListAbility;
        super.onDestroy();
        ReadStateViewModel readStateViewModel = this.LJLJI;
        if (readStateViewModel != null && (messageListAbility = (MessageListAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MessageListAbility.class, null)) != null) {
            messageListAbility.ou0(readStateViewModel);
        }
        ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null);
        if (chatRoomEditTextAbility != null) {
            chatRoomEditTextAbility.BN((TextWatcher) this.LJLJJL.getValue());
        }
    }
}
