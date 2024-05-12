package com.ss.android.ugc.aweme.im.sdk.search.ui.assem;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87903cg;
import X.C87913ch;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SYL;
import Y.IDrS41S0100000_1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchCommonCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMSearchResultAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public IMSearchResultAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 663), C87903cg.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(C87913ch.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ((SYL) view.findViewById(R.id.jh7)).LLLF.LJZL(IMSearchCommonCell.class);
        ((RecyclerView) view.findViewById(R.id.jh7)).setItemAnimator(null);
        C8YN.LJIILLIIL(this, this.LJLIL.getValue(), C213688a4.LJ(), new AqS164S0200000_1(this, view, 10), 2);
        ((RecyclerView) view.findViewById(R.id.jh7)).LJIIJJI(new IDrS41S0100000_1(view, 6));
    }
}
