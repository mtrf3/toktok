package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems;

import X.C109774Sn;
import X.C214298b3;
import X.C47704Ins;
import X.C4TN;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageRequestNoticeAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;

    public MessageRequestNoticeAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageRequestViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 570), C4TN.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C109774Sn.class, "message_request_fragment_config"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJIIJ(this, this.LJLIL.getValue(), new TBT() { // from class: X.4TM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLJJL;
            }
        }, new TBT() { // from class: X.4TL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLIL;
            }
        }, null, new IDqS426S0100000_1(this, 6), 12);
    }
}
