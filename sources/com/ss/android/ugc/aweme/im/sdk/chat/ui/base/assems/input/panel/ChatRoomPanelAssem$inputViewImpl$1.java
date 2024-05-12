package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel;

import X.C105134Ar;
import X.C105454Bx;
import X.C32V;
import X.C4B8;
import X.C4BT;
import X.C55096Ljo;
import X.InterfaceC105124Aq;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomPanelAssem$inputViewImpl$1 implements InterfaceC105124Aq {
    public final /* synthetic */ ChatRoomPanelAssem LJLIL;

    @Override // X.InterfaceC105124Aq
    public final /* synthetic */ boolean AQ() {
        throw null;
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        C105134Ar.LIZ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105134Ar.LIZIZ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    @Override // X.InterfaceC105124Aq
    public final void vb() {
    }

    @Override // X.InterfaceC105124Aq
    public final void LLLLLZIL() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LJLIL), ChatRoomEditTextAbility.class, null);
        if (chatRoomEditTextAbility != null) {
            chatRoomEditTextAbility.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // X.InterfaceC105124Aq
    public final int getPanelType() {
        C4BT c4bt = this.LJLIL.LJLIL;
        if (c4bt != null) {
            return c4bt.LJLILLLLZI;
        }
        return -1;
    }

    @Override // X.InterfaceC105124Aq
    public final void n9() {
        ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LJLIL), ChatRoomEditTextAbility.class, null);
        if (chatRoomEditTextAbility != null) {
            chatRoomEditTextAbility.n9();
        }
    }

    public ChatRoomPanelAssem$inputViewImpl$1(ChatRoomPanelAssem chatRoomPanelAssem) {
        this.LJLIL = chatRoomPanelAssem;
    }

    @Override // X.InterfaceC105124Aq
    public final void LLLZLZ(C105454Bx baseEmoji) {
        o.LJIIIZ(baseEmoji, "baseEmoji");
        ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LJLIL), ChatRoomEditTextAbility.class, null);
        if (chatRoomEditTextAbility != null) {
            chatRoomEditTextAbility.LLLZLZ(baseEmoji);
        }
    }

    @Override // X.InterfaceC105124Aq
    public final void i30(String str) {
        ChatRoomEditTextAbility chatRoomEditTextAbility;
        if (str != null && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LJLIL), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.av0(str);
        }
    }

    @Override // X.InterfaceC105124Aq
    public final void T0(C32V c32v, C4B8 stickerEnterMethod) {
        ChatRoomEditTextAbility chatRoomEditTextAbility;
        o.LJIIIZ(stickerEnterMethod, "stickerEnterMethod");
        if (c32v != null && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LJLIL), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.T0(c32v, stickerEnterMethod);
        }
    }
}
