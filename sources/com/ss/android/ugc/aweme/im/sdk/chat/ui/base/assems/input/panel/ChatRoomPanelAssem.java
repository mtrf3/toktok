package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel;

import X.AbstractC71812rp;
import X.C100013wD;
import X.C16880lQ;
import X.C16970lZ;
import X.C214298b3;
import X.C2K0;
import X.C36L;
import X.C42625Go9;
import X.C47261Igj;
import X.C47704Ins;
import X.C4B0;
import X.C4B1;
import X.C4BF;
import X.C4BT;
import X.C4BU;
import X.C4C8;
import X.C4D2;
import X.C55096Ljo;
import X.C55749LuL;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71432rD;
import X.C71442rE;
import X.C78866UxK;
import X.C78926UyI;
import X.C79004UzY;
import X.C80533Eb;
import X.C81273Gx;
import X.C84763XOl;
import X.C89333ez;
import X.C8YN;
import X.C9BE;
import X.EnumC105154At;
import X.InterfaceC1032943p;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.LFH;
import X.QD3;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS17S0101000_13;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.ActionBarAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.BackPressedProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS6S0010000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class ChatRoomPanelAssem extends UIContentAssem implements ChatRoomPanelAbility, BackPressedProtocol, InterfaceC55102Lju {
    public C4BT LJLIL;
    public C4BU LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C55749LuL LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final ChatRoomPanelAssem$inputViewImpl$1 LJLJL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1158195468) {
            return null;
        }
        return this;
    }

    public ChatRoomPanelAssem() {
        new LinkedHashMap();
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C4BF.class, null), checkSupervisorPrepared());
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 382), C4B0.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MessageReplyVM.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 383), C4B1.INSTANCE, null);
        this.LJLJL = new ChatRoomPanelAssem$inputViewImpl$1(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility
    public final void Fm() {
        C4BT c4bt = this.LJLIL;
        if (c4bt != null) {
            c4bt.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.BackPressedProtocol
    public final boolean LJJLIIIJLLLLLLLZ() {
        Integer num;
        C4BU c4bu = this.LJLILLLLZI;
        if (c4bu != null) {
            num = Integer.valueOf(c4bu.LJLILLLLZI);
        } else {
            num = null;
        }
        if (num == null) {
            return false;
        }
        C4BU c4bu2 = this.LJLILLLLZI;
        if (c4bu2 != null && c4bu2.LJLILLLLZI == -1) {
            return false;
        }
        x3().tr(EnumC105154At.NONE);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility
    public final boolean c30() {
        C4BT c4bt = this.LJLIL;
        if (c4bt != null) {
            return c4bt.LJLLI;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility
    public final void eZ() {
        C4BT c4bt = this.LJLIL;
        if (c4bt != null && c4bt.LJLILLLLZI == -2) {
            c4bt.LJ();
        }
    }

    public final C89333ez v3() {
        return (C89333ez) this.LJLJJI.getValue();
    }

    public final ChatRoomInputVM x3() {
        return (ChatRoomInputVM) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility
    public final boolean Oj() {
        if ((v3().LJLIL.isAuthorSupporterChat() && (C100013wD.LIZ & 4) == 4) || v3().LJLIL.isGroupChat()) {
            return true;
        }
        IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(C81273Gx.LIZLLL(v3().LJLIL.getConversationId())), C79004UzY.LJIILIIL(v3().LJLIL.getConversationId()));
        if ((LJIIJ == null || LJIIJ.getFollowStatus() == 2) && !C36L.LIZJ(LJIIJ)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C4BU c4bu = this.LJLILLLLZI;
        if (c4bu != null) {
            c4bu.LJIIJJI();
        }
        C4BT c4bt = this.LJLIL;
        if (c4bt != null) {
            c4bt.setOnPanelChangeListener(null);
            c4bt.setOnKeyBordChangedListener(null);
        }
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (((Number) C4D2.LIZ.getValue()).intValue() == 2) {
            C78866UxK.LJJLIIIIJ();
        }
    }

    public final void A3(C4BT c4bt) {
        C4BU c4bu;
        Activity LJIIIIZZ;
        View LIZLLL;
        View view = null;
        if (C16970lZ.LIZ(R.layout.b6v, getContext()) && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null && (LIZLLL = C16970lZ.LIZLLL(LJIIIIZZ, R.layout.b6v)) != null) {
            c4bu = new C4BU(this.LJLJL, ((C4BF) this.LJLJI.getValue()).LJLIL, this, c4bt, LIZLLL);
        } else {
            c4bu = new C4BU(this.LJLJL, ((C4BF) this.LJLJI.getValue()).LJLIL, this, c4bt);
        }
        this.LJLILLLLZI = c4bu;
        C16880lQ.LJIILLIIL(c4bu.LJII(), new ACListenerS21S0100000_1(this, 76));
        C4BU c4bu2 = this.LJLILLLLZI;
        if (c4bu2 != null) {
            c4bu2.LJIIIIZZ().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 77)));
        }
        C4BU c4bu3 = this.LJLILLLLZI;
        if (c4bu3 != null) {
            view = c4bu3.LJLIL;
        }
        c4bt.LIZ(view);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUseStickerSet(C71432rD event) {
        Long setId;
        C4BT c4bt;
        o.LJIIIZ(event, "event");
        if (this.LJLILLLLZI == null && (c4bt = this.LJLIL) != null) {
            A3(c4bt);
        }
        StickerSetInfo stickerSetInfo = event.LJLIL;
        if (stickerSetInfo != null && (setId = stickerSetInfo.getSetId()) != null) {
            long longValue = setId.longValue();
            C71442rE c71442rE = C71442rE.LJII;
            if (c71442rE.LJIIL(Long.valueOf(longValue)).LIZIZ == null) {
                AbstractC71812rp.LJIIJJI(c71442rE, C47261Igj.LJJIJ(Long.valueOf(longValue)), false, 2);
            }
        }
        ChatRoomInputVM x3 = x3();
        EnumC105154At panelType = EnumC105154At.EMOJI;
        StickerSetInfo stickerSetInfo2 = event.LJLIL;
        x3.getClass();
        o.LJIIIZ(panelType, "panelType");
        x3.setState(new AqS132S0200000_1(panelType, stickerSetInfo2, 87));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C4BT c4bt;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        final InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BackPressedProtocol.class, C47261Igj.LJJIJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, BackPressedProtocol.class, this);
                    }
                }
            });
        }
        EditText editText = null;
        if (view instanceof C4BT) {
            c4bt = (C4BT) view;
        } else {
            c4bt = null;
        }
        this.LJLIL = c4bt;
        if (c4bt != null) {
            ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null);
            if (chatRoomEditTextAbility != null) {
                editText = chatRoomEditTextAbility.getEditText();
            }
            c4bt.setEditText(editText);
            c4bt.setFixKeyboardHeight(v3().LJLILLLLZI);
            c4bt.setNeedBlockResetOnScreenOrientation(LFH.LIZIZ.LIZLLL().block().LJI());
            c4bt.setOnKeyBordChangedListener(new C4C8() { // from class: X.4Aw
                @Override // X.C4C8
                public final void LIZ(boolean z) {
                    ChatRoomInputVM x3 = ChatRoomPanelAssem.this.x3();
                    x3.getClass();
                    x3.setState(new AqS6S0010000_1(z, 7));
                }
            });
            c4bt.setOnPanelChangeListener(new InterfaceC1032943p() { // from class: X.3uy
                @Override // X.InterfaceC1032943p
                public final void LJIIL(View view2, int i, int i2, boolean z) {
                    boolean z2;
                    ChatRoomEditTextAbility chatRoomEditTextAbility2;
                    EditText editText2;
                    ChatRoomPanelAssem chatRoomPanelAssem = ChatRoomPanelAssem.this;
                    C4BU c4bu = chatRoomPanelAssem.LJLILLLLZI;
                    if (c4bu != null) {
                        c4bu.LJLILLLLZI = i2;
                    }
                    if (i2 == -1 && (chatRoomEditTextAbility2 = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(chatRoomPanelAssem), ChatRoomEditTextAbility.class, null)) != null && (editText2 = chatRoomEditTextAbility2.getEditText()) != null) {
                        editText2.clearFocus();
                    }
                    List LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(ChatRoomPanelAssem.this), MessageListProtocol.class);
                    if (LJIJ != null) {
                        Iterator it = ((ArrayList) LJIJ).iterator();
                        while (it.hasNext()) {
                            ((MessageListProtocol) it.next()).LJIIL(view2, i, i2, z);
                        }
                    }
                    ActionBarAbility actionBarAbility = (ActionBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(ChatRoomPanelAssem.this), ActionBarAbility.class, null);
                    boolean z3 = true;
                    if (actionBarAbility != null) {
                        if (i2 != -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        actionBarAbility.GC("keyboard_minimized", z2);
                    }
                    if (i2 != 1) {
                        C71512rL.LJII.getClass();
                        if (C71512rL.LJIIIIZZ && C91093hp.LJ() && i == 1) {
                            C91093hp.LJIIJ(false);
                            C2U8.LIZ(new C72092sH(false));
                        }
                        C4BU c4bu2 = ChatRoomPanelAssem.this.LJLILLLLZI;
                        if (c4bu2 != null) {
                            c4bu2.LJIILJJIL();
                        }
                        if (i == 1) {
                            C71512rL.LJIIIIZZ = false;
                        }
                    }
                    if (i == i2) {
                        return;
                    }
                    if (i == -2) {
                        ChatRoomPanelAssem chatRoomPanelAssem2 = ChatRoomPanelAssem.this;
                        chatRoomPanelAssem2.withState(chatRoomPanelAssem2.x3(), (AssemViewModel) ChatRoomPanelAssem.this.LJLJJLL.getValue(), new C98053t3(ChatRoomPanelAssem.this));
                    } else if (i2 == -2) {
                        ChatRoomPanelAssem chatRoomPanelAssem3 = ChatRoomPanelAssem.this;
                        chatRoomPanelAssem3.withState(chatRoomPanelAssem3.x3(), (AssemViewModel) ChatRoomPanelAssem.this.LJLJJLL.getValue(), new C98043t2(ChatRoomPanelAssem.this));
                    }
                    ChatRoomInputVM x3 = ChatRoomPanelAssem.this.x3();
                    if (i2 == -1) {
                        z3 = false;
                    }
                    x3.getClass();
                    x3.setState(new AqS6S0010000_1(z3, 8));
                }
            });
            if (v3().LJLIL.isTakoChat$im_base_release()) {
                c4bt.LJLLLLLL = true;
                c4bt.post(new ARunnableS17S0101000_13(2, c4bt, 11));
            }
        }
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4Ay
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105044Ai) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 23), 6);
    }
}
