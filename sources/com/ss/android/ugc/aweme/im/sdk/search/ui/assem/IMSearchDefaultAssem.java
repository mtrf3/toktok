package com.ss.android.ugc.aweme.im.sdk.search.ui.assem;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C33A;
import X.C53330KwQ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87873cd;
import X.C87883ce;
import X.C87893cf;
import X.C87923ci;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SYL;
import X.TBT;
import Y.IDrS41S0100000_1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchClearAllCell;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchCommonCell;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchRecentContactsCell;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchSeeMoreCell;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchTitleCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMSearchDefaultAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public IMSearchDefaultAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 661), C87873cd.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(IMSearchVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 662), C87883ce.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(C87893cf.LJLIL);
    }

    public final IMSearchDefaultVM v3() {
        return (IMSearchDefaultVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        C33A c33a = v3().LJLIL;
        if (c33a != null) {
            c33a.LIZIZ(true);
        }
        super.onCreate();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        ((RecyclerView) getContainerView().findViewById(R.id.jey)).setItemAnimator(null);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C33A c33a = v3().LJLIL;
        if (c33a != null) {
            c33a.LIZIZ(false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ((SYL) view.findViewById(R.id.jey)).LLLF.LJZL(IMSearchTitleCell.class, IMSearchCommonCell.class);
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZ() < 3) {
            ((SYL) view.findViewById(R.id.jey)).LLLF.LJZL(IMSearchRecentContactsCell.class);
        } else {
            ((SYL) view.findViewById(R.id.jey)).LLLF.LJZL(IMSearchSeeMoreCell.class, IMSearchClearAllCell.class);
        }
        ((RecyclerView) view.findViewById(R.id.jey)).setItemAnimator(null);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.3cZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C33P) obj).LJLIL);
            }
        }, C213688a4.LJ(), new AqS164S0200000_1(this, view, 7), 4);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.3cc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33P) obj).LJLJI;
            }
        }, C213688a4.LJ(), new AqS164S0200000_1(this, view, 8), 4);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.3cb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C33P) obj).LJLILLLLZI);
            }
        }, C213688a4.LJ(), new AqS164S0200000_1(this, view, 9), 4);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.3ca
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33P) obj).LJLJJI;
            }
        }, C213688a4.LJ(), C87923ci.LJLIL, 4);
        C8YN.LJII(this, this.LJLILLLLZI.getValue(), new TBT() { // from class: X.3cY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C86393aF) obj).LJLIL);
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 44), 4);
        ((RecyclerView) view.findViewById(R.id.jey)).LJIIJJI(new IDrS41S0100000_1(view, 5));
    }
}
