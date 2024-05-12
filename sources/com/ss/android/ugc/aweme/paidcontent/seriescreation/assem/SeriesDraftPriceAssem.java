package com.ss.android.ugc.aweme.paidcontent.seriescreation.assem;

import X.AbstractC248869pi;
import X.C213688a4;
import X.C214298b3;
import X.C248829pe;
import X.C248839pf;
import X.C248849pg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesDraftPriceAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public LinearLayout LJLL;
    public TuxTextView LJLLI;
    public LinearLayout LJLLILLLL;
    public LinearLayout LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ajc;
    }

    public SeriesDraftPriceAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesDraftViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 611), C248849pg.INSTANCE, null);
    }

    public final SeriesDraftViewModel H3() {
        return (SeriesDraftViewModel) this.LJLJLLL.getValue();
    }

    public final void I3(AbstractC248869pi abstractC248869pi) {
        String str;
        if (abstractC248869pi instanceof C248829pe) {
            TuxTextView tuxTextView = this.LJLLI;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.LJLLILLLL;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.setVisibility(8);
            return;
        }
        if (!(abstractC248869pi instanceof C248839pf)) {
            return;
        }
        TuxTextView tuxTextView2 = this.LJLLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.LJLLJ;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.LJLLILLLL;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(0);
        }
        TuxTextView tuxTextView3 = this.LJLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText("$" + ((C248839pf) abstractC248869pi).LIZ.getPriceInUsd());
        }
        TuxTextView tuxTextView4 = this.LJLLLL;
        if (tuxTextView4 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        PricesResponse pricesResponse = H3().getState().LJLLLL;
        if (pricesResponse == null || (str = pricesResponse.getLocalCurrencySymbol()) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(((C248839pf) abstractC248869pi).LIZ.getPriceInLocalCurrency());
        tuxTextView4.setText(sb.toString());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        LinearLayout linearLayout;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        Integer valueOf = Integer.valueOf(R.id.i3z);
        LinearLayout linearLayout2 = (LinearLayout) containerView.findViewById(R.id.i3z);
        this.LJLL = linearLayout2;
        LinearLayout linearLayout3 = null;
        if (linearLayout2 != null) {
            tuxTextView = (TuxTextView) linearLayout2.findViewById(R.id.jm3);
        } else {
            tuxTextView = null;
        }
        this.LJLLI = tuxTextView;
        LinearLayout linearLayout4 = this.LJLL;
        if (linearLayout4 != null) {
            linearLayout = (LinearLayout) linearLayout4.findViewById(R.id.jmi);
        } else {
            linearLayout = null;
        }
        this.LJLLILLLL = linearLayout;
        LinearLayout linearLayout5 = this.LJLL;
        if (linearLayout5 != null) {
            tuxTextView2 = (TuxTextView) linearLayout5.findViewById(R.id.jmk);
        } else {
            tuxTextView2 = null;
        }
        this.LJLLL = tuxTextView2;
        LinearLayout linearLayout6 = this.LJLL;
        if (linearLayout6 != null) {
            tuxTextView3 = (TuxTextView) linearLayout6.findViewById(R.id.jmj);
        } else {
            tuxTextView3 = null;
        }
        this.LJLLLL = tuxTextView3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view2 = (View) linkedHashMap.get(valueOf);
        if (view2 == null) {
            View containerView2 = getContainerView();
            if (containerView2 != null && (view2 = containerView2.findViewById(R.id.i3z)) != null) {
                linkedHashMap.put(valueOf, view2);
            }
            this.LJLLJ = linearLayout3;
            C8YN.LJII(this, H3(), new TBT() { // from class: X.9ph
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C248629pK) obj).LJLLLL;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 332), 4);
            C8YN.LJII(this, H3(), new TBT() { // from class: X.9pj
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C248629pK) obj).LJLJJI;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 333), 4);
        }
        linearLayout3 = (LinearLayout) view2.findViewById(R.id.jkw);
        this.LJLLJ = linearLayout3;
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9ph
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLLLL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 332), 4);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9pj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 333), 4);
    }
}
