package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79043V0l;
import X.C86451XwN;
import X.C8YN;
import X.C9BD;
import X.TBT;
import X.ViewOnLongClickListenerC86461XwX;
import Y.IDCListenerS112S0200000_15;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;

/* loaded from: classes16.dex */
public final class PhotoModeRelatedSearchUiAssem extends UIContentAssem {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.XwP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C51009K0f) obj).LJLIL);
            }
        }, null, new AqS197S0100000_15(this, 57), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.XwQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C51009K0f) obj).LJLILLLLZI);
            }
        }, null, new AqS197S0100000_15(this, 58), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.XwV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C51009K0f) obj).LJLJI);
            }
        }, null, new AqS197S0100000_15(this, 59), 6);
    }

    public PhotoModeRelatedSearchUiAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchRelatedSuggestionVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS165S0100000_15(LIZ, 627), C86451XwN.INSTANCE, null);
    }

    public final SearchRelatedSuggestionVM v3() {
        return (SearchRelatedSuggestionVM) this.LJLIL.getValue();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        A3(v3().getState().LJLIL, v3());
        boolean z = v3().getState().LJLILLLLZI;
        if (!isContainerViewAssigned()) {
            return;
        }
        if (z) {
            C79043V0l.LJIIJ(getContainerView());
        } else {
            getContainerView().setVisibility(0);
        }
    }

    public final void A3(boolean z, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        if (!isContainerViewAssigned()) {
            return;
        }
        if (z) {
            getContainerView().findViewById(R.id.fed).setOnLongClickListener(new IDCListenerS112S0200000_15(this, searchRelatedSuggestionVM, 0));
            getContainerView().findViewById(R.id.e__).setOnLongClickListener(new IDCListenerS112S0200000_15(this, searchRelatedSuggestionVM, 1));
            getContainerView().findViewById(R.id.e_a).setOnLongClickListener(new IDCListenerS112S0200000_15(this, searchRelatedSuggestionVM, 2));
            getContainerView().findViewById(R.id.fg4).setOnLongClickListener(new IDCListenerS112S0200000_15(this, searchRelatedSuggestionVM, 3));
            return;
        }
        getContainerView().findViewById(R.id.cec).setLongClickable(false);
        getContainerView().findViewById(R.id.fg4).setOnLongClickListener(ViewOnLongClickListenerC86461XwX.LJLIL);
        getContainerView().findViewById(R.id.fg4).setLongClickable(false);
    }

    public final void x3(View view, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        Context context = view.getContext();
        if (context != null) {
            if (isContainerViewAssigned()) {
                getContainerView().setAlpha(0.2f);
            }
            searchRelatedSuggestionVM.gv0(context, view);
        }
    }
}
