package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems;

import X.C109774Sn;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C98483tk;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageRequestDeleteAllBtnAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public MessageRequestDeleteAllBtnAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageRequestViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 559), C98483tk.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C109774Sn.class, "message_request_fragment_config"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 558));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJIIJ(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3tl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLJJL;
            }
        }, new TBT() { // from class: X.3tj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLIL;
            }
        }, null, new IDqS426S0100000_1(this, 2), 12);
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-deleteAllBtn>(...)");
        C16880lQ.LJJIZ((SY4) value, new ACListenerS21S0100000_1(this, 88));
    }
}
