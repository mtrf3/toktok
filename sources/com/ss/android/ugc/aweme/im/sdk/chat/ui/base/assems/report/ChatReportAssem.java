package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report;

import X.C1045848o;
import X.C1045948p;
import X.C16880lQ;
import X.C17N;
import X.C214298b3;
import X.C221108m2;
import X.C46Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C78926UyI;
import X.C89333ez;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.EnumC95013o9;
import X.InterfaceC65350Pko;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageSelectionAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report.ChatReportAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS6S0010000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatReportAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C73318Sq2 LJLJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.48l] */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        v3().setVisibility(0);
        v3().setSupportClickWhenDisable(true);
        C16880lQ.LJJIZ(v3(), new ACListenerS21S0100000_1(this, 79));
        v3();
        v3().setEnabled(true ^ ((ChatReportPageViewModel) this.LJLJJLL.getValue()).gv0().isEmpty());
        C8YN.LJII(this, (AssemViewModel) this.LJLJJLL.getValue(), new TBT() { // from class: X.48n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C1045448k) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 29), 6);
        MessageSelectionAbility messageSelectionAbility = (MessageSelectionAbility) this.LJLJL.getValue();
        if (messageSelectionAbility != 0) {
            messageSelectionAbility.G80(new C46Q() { // from class: X.48l
                @Override // X.C46Q
                public final void LIZ(int i, boolean z) {
                    List<IMMessage> list;
                    MessageListAbility messageListAbility = (MessageListAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(ChatReportAssem.this), MessageListAbility.class, null);
                    if (messageListAbility == null || (list = messageListAbility.Ph()) == null) {
                        list = C61878OQg.INSTANCE;
                    }
                    AssemViewModel assemViewModel = (AssemViewModel) ChatReportAssem.this.LJLJJLL.getValue();
                    C109544Rq msg = ((IMMessage) ListProtector.get(list, i)).getMessage();
                    o.LJIIIZ(msg, "msg");
                    java.util.Set LLJILLL = ORZ.LLJILLL(((C1045448k) assemViewModel.getState()).LJLIL);
                    boolean contains = LLJILLL.contains(msg);
                    if (z) {
                        if (!contains) {
                            LLJILLL.add(msg);
                            assemViewModel.setState(new AqS167S0100000_1(LLJILLL, (java.util.Set<String>) 455));
                            return;
                        }
                        return;
                    }
                    if (!contains) {
                        return;
                    }
                    LLJILLL.remove(msg);
                    assemViewModel.setState(new AqS167S0100000_1(LLJILLL, (java.util.Set<String>) 456));
                }
            });
        }
    }

    public ChatReportAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C17N.LJJIJL(new AqS151S0100000_1(this, 430));
        this.LJLJI = C17N.LJJIJL(new AqS151S0100000_1(this, 427));
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 426));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageListViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 431), C1045848o.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ChatReportPageViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 432), C1045948p.INSTANCE, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 429));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 428));
        this.LJLJLLL = new C73318Sq2();
    }

    public final SY4 v3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-confirmButton>(...)");
        return (SY4) value;
    }

    @Override // X.C8W0
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LJLJJI.getValue();
        if (chatRoomViewModel != null) {
            chatRoomViewModel.kv0(EnumC95013o9.DISABLED);
        }
        this.LJLJJL.getValue().setState(new AqS6S0010000_1(false, 9));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJLLL.LIZLLL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 132));
    }
}
