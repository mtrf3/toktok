package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C214298b3;
import X.C51025K0v;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C86452XwO;
import X.C86456XwS;
import X.C86457XwT;
import X.C8YN;
import X.C9BD;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;

/* loaded from: classes16.dex */
public class SearchRelatedSuggestionUiAssem extends UIContentAssem {
    public static WeakReference<View> LJLILLLLZI = new WeakReference<>(null);
    public final C214298b3 LJLIL;

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.XwR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C51009K0f) obj).LJLIL);
            }
        }, null, new AqS197S0100000_15(this, 60), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.XwU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C51009K0f) obj).LJLILLLLZI);
            }
        }, null, C51025K0v.LJLIL, 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.XwW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C51009K0f) obj).LJLJI);
            }
        }, null, C86456XwS.LJLIL, 6);
    }

    public SearchRelatedSuggestionUiAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchRelatedSuggestionVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS165S0100000_15(LIZ, 628), C86452XwO.INSTANCE, null);
    }

    public final SearchRelatedSuggestionVM v3() {
        return (SearchRelatedSuggestionVM) this.LJLIL.getValue();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C86457XwT.LIZLLL(v3().getState().LJLIL, v3());
        C86457XwT.LIZJ(v3().getState().LJLILLLLZI);
    }
}
