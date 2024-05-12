package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem;

import X.C213688a4;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C93653lx;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.InterfaceC93663ly;
import X.SYL;
import X.TBT;
import Y.IDrS41S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.HintCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SearchResultListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchResultListAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public SYL LJLILLLLZI;

    public SearchResultListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 638), C93653lx.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL syl = (SYL) getContainerView().findViewById(R.id.izh);
        syl.LLLF.LJZL(SearchResultListCell.class, HintCell.class);
        syl.LJIIJJI(new IDrS41S0100000_1(this, 4));
        syl.setItemAnimator(null);
        this.LJLILLLLZI = syl;
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.3lw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91843j2) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS164S0200000_1(this, view, 5), 4);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC93663ly.class), new TBT() { // from class: X.3lv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RJ) obj).LIZIZ;
            }
        }, new AqS167S0100000_1(this, 171));
    }
}
