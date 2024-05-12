package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems;

import X.C109774Sn;
import X.C109804Sq;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
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
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageRequestEmptyAssem extends UIContentAssem {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public EnumC97443s4 LJLJJI;
    public MessageRequestsActivity LJLJJL;
    public final Map<EnumC97443s4, Boolean> LJLJJLL;

    public MessageRequestEmptyAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 563));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageRequestViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 564), C109804Sq.INSTANCE, null);
        this.LJLJI = new C55749LuL(C47704Ins.LJ(this, C109774Sn.class, "message_request_fragment_config"), checkSupervisorPrepared());
        this.LJLJJLL = new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MessageRequestsActivity messageRequestsActivity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-divider>(...)");
        View view2 = (View) value;
        C109774Sn c109774Sn = (C109774Sn) this.LJLJI.getValue();
        int i = 0;
        if (c109774Sn == null || !c109774Sn.LJLJI) {
            i = 8;
        }
        view2.setVisibility(i);
        C109774Sn c109774Sn2 = (C109774Sn) this.LJLJI.getValue();
        EnumC97443s4 enumC97443s4 = null;
        if (c109774Sn2 != null) {
            enumC97443s4 = c109774Sn2.LJLIL;
        }
        this.LJLJJI = enumC97443s4;
        Context context = getContext();
        if ((context instanceof MessageRequestsActivity) && (messageRequestsActivity = (MessageRequestsActivity) context) != null) {
            this.LJLJJL = messageRequestsActivity;
            C8YN.LJIIJ(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.4Sp
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C4T8) obj).LJLJJL;
                }
            }, new TBT() { // from class: X.4So
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C4T8) obj).LJLIL;
                }
            }, null, new IDqS426S0100000_1(this, 4), 12);
            C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.4Sr
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C4T8) obj).LJLJJI;
                }
            }, null, new AqS183S0100000_1(this, 35), 6);
            return;
        }
        throw new IllegalStateException();
    }
}
