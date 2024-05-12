package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem;

import X.C213688a4;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C91633ih;
import X.C91793ix;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.InterfaceC93663ly;
import X.SYL;
import X.TBT;
import Y.IDrS41S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.ShareGroupCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.ContactListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.IndexCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ContactListAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public SYL LJLJI;

    public ContactListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C91633ih.class, "init_config"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 637), C91793ix.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL syl = (SYL) getContainerView().findViewById(R.id.bs5);
        o.LJIIIIZZ(syl, "containerView.contact_list");
        this.LJLJI = syl;
        syl.LLLF.LJZL(ContactListCell.class, IndexCell.class, ShareGroupCell.class);
        syl.setItemAnimator(null);
        syl.LJIIJJI(new IDrS41S0100000_1(this, 3));
        C8YN.LJII(this, this.LJLILLLLZI.getValue(), new TBT() { // from class: X.3iy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91843j2) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS183S0100000_1(this, 38), 4);
        C8VC.LJIIJ(this, C65352Pkq.LIZ(InterfaceC93663ly.class), new TBT() { // from class: X.3j0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RJ) obj).LIZIZ;
            }
        }, new TBT() { // from class: X.3iz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RJ) obj).LIZ;
            }
        }, new AqS183S0100000_1(this, 39));
    }
}
