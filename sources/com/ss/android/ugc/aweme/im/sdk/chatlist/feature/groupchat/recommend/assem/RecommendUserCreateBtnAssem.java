package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87303bi;
import X.C87623cE;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendUserCreateBtnAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public RecommendUserCreateBtnAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C87303bi.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecommendUserListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 555), C87623cE.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 554));
    }

    public final SY4 v3() {
        return (SY4) this.LJLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16880lQ.LJJIZ(v3(), new ACListenerS21S0100000_1(this, 87));
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.3c5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C87453bx) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 34), 6);
    }
}
