package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext;

import X.AbstractC90763hI;
import X.ActivityC45651qj;
import X.C101543yg;
import X.C105454Bx;
import X.C109934Td;
import X.C158066Ig;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C32V;
import X.C34B;
import X.C40328FsC;
import X.C47704Ins;
import X.C4B8;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78613UtF;
import X.C78926UyI;
import X.C89333ez;
import X.C8YN;
import X.C92813kb;
import X.C93073l1;
import X.C93093l3;
import X.C93103l4;
import X.C93133l7;
import X.C93163lA;
import X.C9BE;
import X.EnumC105154At;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.ORY;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.IDObjectS174S0100000_1;
import Y.IDTListenerS111S0100000_1;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMInputEditTextAssem extends UIContentAssem implements ChatRoomEditTextAbility, ChatRoomMentionInputAbility, InterfaceC55102Lju {
    public C109934Td LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C55749LuL LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1091089431 || hashCode == 464743730) {
            return this;
        }
        return null;
    }

    public IMInputEditTextAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 379), C93133l7.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MessageReplyVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 380), C93093l3.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(MessageDraftVM.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ3, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ3, 381), C93103l4.INSTANCE, null);
        this.LJLJJL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 378));
    }

    public final ChatRoomInputVM A3() {
        return (ChatRoomInputVM) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void YR() {
        Editable text;
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td == null || (text = c109934Td.getText()) == null) {
            return;
        }
        C101543yg c101543yg = C101543yg.LIZ;
        Context context = getContext();
        String conversationId = v3().LJLIL.getConversationId();
        AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, text, 21);
        c101543yg.getClass();
        C101543yg.LIZ(context, conversationId, aqS132S0200000_1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomMentionInputAbility
    public final C93163lA bC() {
        int i;
        Editable editableText;
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td != null) {
            i = c109934Td.getSelectionStart();
        } else {
            i = 0;
        }
        C109934Td c109934Td2 = this.LJLIL;
        if (c109934Td2 == null || (editableText = c109934Td2.getEditableText()) == null) {
            return null;
        }
        A3().getClass();
        return ChatRoomInputVM.gv0(i, editableText);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void hN() {
        withState((AssemViewModel) this.LJLJI.getValue(), new AqS167S0100000_1(this, 129));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void n9() {
        try {
            C109934Td c109934Td = this.LJLIL;
            if (c109934Td != null) {
                c109934Td.setText("");
            }
        } catch (Exception e) {
            C34B.LJ("IMInputEditTextAssem", e);
        }
    }

    public final C89333ez v3() {
        return (C89333ez) this.LJLJJL.getValue();
    }

    public final MessageDraftVM x3() {
        return (MessageDraftVM) this.LJLJJI.getValue();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void wT() {
        MessageDraftVM x3 = x3();
        AbstractC90763hI conversationModel = (AbstractC90763hI) this.LJLJJLL.getValue();
        x3.getClass();
        o.LJIIIZ(conversationModel, "conversationModel");
        XKX.LIZLLL(x3.getAssemVMScope(), C78613UtF.LIZJ, null, new C92813kb(conversationModel, x3, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final EditText getEditText() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void BN(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td != null) {
            c109934Td.removeTextChangedListener(watcher);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomMentionInputAbility
    public final void Cq(String uid) {
        Editable text;
        List LJJZZIII;
        Range range;
        o.LJIIIZ(uid, "uid");
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td != null && (text = c109934Td.getText()) != null) {
            Object[] spans = text.getSpans(0, text.length(), C93073l1.class);
            Object obj = null;
            if (spans != null && (LJJZZIII = ORY.LJJZZIII(spans)) != null) {
                Iterator it = LJJZZIII.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (o.LJ(((C93073l1) next).LIZIZ, uid)) {
                        obj = next;
                        break;
                    }
                }
                C93073l1 c93073l1 = (C93073l1) obj;
                if (c93073l1 != null && (range = c93073l1.LIZLLL) != null) {
                    text.delete(range.getFrom(), range.getTo());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void LLLZLZ(C105454Bx baseEmoji) {
        ActivityC45651qj LIZ;
        ChatRoomPanelAbility chatRoomPanelAbility;
        o.LJIIIZ(baseEmoji, "baseEmoji");
        int stickerType = baseEmoji.LIZJ.getStickerType();
        if ((stickerType != 2 && stickerType != 3 && stickerType != 10) || (LIZ = C212428Vi.LIZ(this)) == null || (chatRoomPanelAbility = (ChatRoomPanelAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), ChatRoomPanelAbility.class, null)) == null || chatRoomPanelAbility.Oj()) {
            C101543yg c101543yg = C101543yg.LIZ;
            Context context = getContext();
            String conversationId = v3().LJLIL.getConversationId();
            AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, baseEmoji, 20);
            c101543yg.getClass();
            C101543yg.LIZ(context, conversationId, aqS132S0200000_1);
            return;
        }
        C40328FsC.LIZLLL(LIZ, R.string.en0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void Uc0(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td != null) {
            c109934Td.addTextChangedListener(watcher);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void av0(String text) {
        C109934Td c109934Td;
        o.LJIIIZ(text, "text");
        if (text.length() != 0 && (c109934Td = this.LJLIL) != null) {
            int selectionStart = c109934Td.getSelectionStart();
            Editable text2 = c109934Td.getText();
            if (text2 != null) {
                text2.insert(selectionStart, text);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void dispatchKeyEvent(KeyEvent keyEvent) {
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td != null) {
            c109934Td.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C109934Td c109934Td;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof C109934Td) {
            c109934Td = (C109934Td) view;
        } else {
            c109934Td = null;
        }
        this.LJLIL = c109934Td;
        if (c109934Td != null) {
            c109934Td.setFilters(new InputFilter[]{new C158066Ig(c109934Td)});
        }
        C109934Td c109934Td2 = this.LJLIL;
        if (c109934Td2 != null) {
            c109934Td2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 75)));
        }
        C109934Td c109934Td3 = this.LJLIL;
        if (c109934Td3 != null) {
            c109934Td3.setOnTouchListener(new IDTListenerS111S0100000_1(this, 3));
        }
        C109934Td c109934Td4 = this.LJLIL;
        if (c109934Td4 != null) {
            c109934Td4.addTextChangedListener(new IDObjectS174S0100000_1(this, 1));
        }
        C109934Td c109934Td5 = this.LJLIL;
        if (c109934Td5 != null) {
            c109934Td5.setOnMentionDeleted(new AqS167S0100000_1(this, 128));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.3l5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C93053kz) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 21), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.3l6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92823kc) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 22), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.3l2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92823kc) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 20), 6);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void tr(EnumC105154At panel) {
        o.LJIIIZ(panel, "panel");
        A3().tr(panel);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility
    public final void T0(C32V sticker, C4B8 stickerEnterMethod) {
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(stickerEnterMethod, "stickerEnterMethod");
        C101543yg c101543yg = C101543yg.LIZ;
        Context context = getContext();
        String conversationId = v3().LJLIL.getConversationId();
        AqS105S0300000_1 aqS105S0300000_1 = new AqS105S0300000_1(this, sticker, stickerEnterMethod, 2);
        c101543yg.getClass();
        C101543yg.LIZ(context, conversationId, aqS105S0300000_1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomMentionInputAbility
    public final void qR(String uid, String name) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(name, "name");
        C109934Td c109934Td = this.LJLIL;
        if (c109934Td != null) {
            int selectionStart = c109934Td.getSelectionStart();
            Editable editable = c109934Td.getEditableText();
            ChatRoomInputVM A3 = A3();
            o.LJIIIIZZ(editable, "editable");
            A3.getClass();
            String str = ChatRoomInputVM.gv0(selectionStart, editable).LIZ;
            if (str == null) {
                str = "";
            }
            if (o.LJ(uid, CardStruct.IStatusCode.DEFAULT)) {
                Context context = getContext();
                if (context != null) {
                    name = context.getString(R.string.eow);
                } else {
                    return;
                }
            }
            if (name != null) {
                c109934Td.LJI(Integer.valueOf(R.attr.bw), name, uid, str);
            }
        }
    }
}
