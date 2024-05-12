package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems;

import X.C109774Sn;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C4T0;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC97443s4;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageRequestEditBtnsAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public EnumC97443s4 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    public MessageRequestEditBtnsAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageRequestViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 562), C4T0.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C109774Sn.class, "message_request_fragment_config"), checkSupervisorPrepared());
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 560));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 561));
    }

    public final MessageRequestViewModel v3() {
        return (MessageRequestViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC97443s4 enumC97443s4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C109774Sn c109774Sn = (C109774Sn) this.LJLILLLLZI.getValue();
        if (c109774Sn == null || (enumC97443s4 = c109774Sn.LJLIL) == null) {
            enumC97443s4 = new C109774Sn(0).LJLIL;
        }
        this.LJLJI = enumC97443s4;
        C8YN.LJIIJ(this, v3(), new TBT() { // from class: X.4Sz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLJJL;
            }
        }, new TBT() { // from class: X.4Sy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLIL;
            }
        }, null, new IDqS426S0100000_1(this, 3), 12);
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-deleteBtn>(...)");
        C16880lQ.LJJJJI((TuxTextView) value, new ACListenerS21S0100000_1(this, 89));
        Object value2 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value2, "<get-markAsReadBtn>(...)");
        C16880lQ.LJJJJI((TuxTextView) value2, new ACListenerS21S0100000_1(this, 90));
    }
}
