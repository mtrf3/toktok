package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.assem;

import X.C101043xs;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C95573p3;
import X.C95683pE;
import X.C95943pe;
import X.C9BD;
import X.InterfaceC65350Pko;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatNavAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C214298b3 LJLJI;

    public GroupChatNavAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C95573p3.class, "GroupDetailData"), checkSupervisorPrepared());
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C95683pE.class, "GroupDetailDataSource"), checkSupervisorPrepared());
        C9BD c9bd = C9BD.LIZ;
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 459);
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 458), C95943pe.INSTANCE, aqS151S0100000_1);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof C101043xs)) {
            return;
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.3pV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLIL;
            }
        }, null, new AqS164S0200000_1(view, this, 1), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.3pW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLLLL;
            }
        }, null, new AqS183S0100000_1(this, 31), 6);
    }
}
