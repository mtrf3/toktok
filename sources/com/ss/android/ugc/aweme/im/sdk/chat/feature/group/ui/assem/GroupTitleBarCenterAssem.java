package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.assem;

import X.C101023xq;
import X.C119574mf;
import X.C16880lQ;
import X.C17N;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C89333ez;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupTitleBarViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupTitleBarCenterAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;
    public final C214298b3 LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public C119574mf LJLLJ;
    public final C5H3 LJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8v;
    }

    public GroupTitleBarCenterAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupTitleBarViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 85), C101023xq.INSTANCE, null);
        this.LJLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 84));
    }

    public final GroupTitleBarViewModel H3() {
        return (GroupTitleBarViewModel) this.LJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.iv_avatar)");
        this.LJLLJ = (C119574mf) findViewById;
        View findViewById2 = view.findViewById(R.id.db3);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.first_title)");
        this.LJLLI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.jj0);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.second_hint)");
        this.LJLLILLLL = (TuxTextView) findViewById3;
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 135), view);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.3xr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C100973xl) obj).LJLJJI;
            }
        }, null, new AqS183S0100000_1(this, 68), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.3xo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C100973xl) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 69), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.3xm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C100973xl) obj).LJLJJL);
            }
        }, null, new AqS183S0100000_1(this, 70), 6);
    }
}
