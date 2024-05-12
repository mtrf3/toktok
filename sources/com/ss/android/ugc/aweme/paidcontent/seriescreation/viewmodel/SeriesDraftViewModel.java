package com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel;

import X.ASL;
import X.ActivityC45651qj;
import X.C152605yq;
import X.C1DG;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C248559pD;
import X.C248629pK;
import X.C248639pL;
import X.C248659pN;
import X.C248669pO;
import X.C249109q6;
import X.C253179wf;
import X.C32I;
import X.C62822Ol8;
import X.C65767PrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C7VX;
import X.C9KF;
import X.EnumC248719pT;
import X.InterfaceC248679pP;
import X.InterfaceC88472Yns;
import X.T16;
import X.X1D;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesPriceOptionsFragment;
import com.ss.android.ugc.aweme.service.IPaidContentCreationService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesDraftViewModel extends AssemViewModel<C248629pK> {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C248669pO.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C248659pN.LJLIL);
    public TuxSheet LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C248629pK defaultState() {
        return new C248629pK(0);
    }

    public final boolean gv0() {
        String str;
        C248629pK state = getState();
        if (o.LJ(state.LJLILLLLZI, state.LJLJLJ) && o.LJ(state.LJLJI, state.LJLJLLL)) {
            Price price = state.LJLJJI;
            String str2 = null;
            if (price != null) {
                str = price.getPriceInUsd();
            } else {
                str = null;
            }
            if (o.LJ(str, state.LJLL) && o.LJ(state.LJLJL, state.LJLLI)) {
                Price price2 = state.LJLJJL;
                if (price2 != null) {
                    str2 = price2.getPriceInUsd();
                }
                if (o.LJ(str2, state.LJLLILLLL) && !state.LJLLJ && !state.LJLLL) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void hv0() {
        EnumC248719pT enumC248719pT;
        String str;
        String str2;
        C248629pK state = getState();
        C248639pL.LIZ.storeBoolean("limited_time_discount_checkmark", state.LJLJJLL);
        if (state.LJLIL == null || (enumC248719pT = EnumC248719pT.EDIT) == null) {
            enumC248719pT = EnumC248719pT.CREATE;
        }
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-creationService>(...)");
        IPaidContentCreationService iPaidContentCreationService = (IPaidContentCreationService) value;
        String str3 = state.LJLIL;
        String str4 = state.LJLILLLLZI;
        String str5 = state.LJLJI;
        C248559pD c248559pD = state.LJLJL;
        String str6 = null;
        if (c248559pD != null) {
            str = c248559pD.LIZ;
        } else {
            str = null;
        }
        Price price = state.LJLJJI;
        if (price != null) {
            str2 = price.getPriceInUsd();
        } else {
            str2 = null;
        }
        Price price2 = state.LJLJJL;
        if (price2 != null) {
            str6 = price2.getPriceInUsd();
        }
        disposeOnClear(iPaidContentCreationService.LIZLLL(enumC248719pT, str3, str4, str5, str, str2, str6).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(this, 36)).LJJII(new AfS53S0200000_4(this, enumC248719pT, 9), new AfS56S0100000_4(this, 37)));
    }

    public final boolean iv0() {
        String str;
        Price price;
        List<Price> discountList;
        C248629pK state = getState();
        if (state.LJLILLLLZI == null || !(!ujb.o.LJJJJJL(r0)) || (str = state.LJLJI) == null || !(!ujb.o.LJJJJJL(str))) {
            return false;
        }
        if ((state.LJLJJLL && (price = state.LJLJJI) != null && (discountList = price.getDiscountList()) != null && (!discountList.isEmpty()) && state.LJLJJL == null) || !gv0()) {
            return false;
        }
        return true;
    }

    public final C76800UCe kv0(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        Price price = getState().LJLJJI;
        if (price == null) {
            if (interfaceC88472Yns == null) {
                return null;
            }
            interfaceC88472Yns.invoke(Integer.valueOf(R.string.qk6));
            return C76800UCe.LIZ;
        }
        List<Price> discountList = price.getDiscountList();
        if (discountList == null || discountList.isEmpty()) {
            if (interfaceC88472Yns == null) {
                return null;
            }
            interfaceC88472Yns.invoke(Integer.valueOf(R.string.qk5));
            return C76800UCe.LIZ;
        }
        setState(new AqS9S0010000_4(z, 1));
        return C76800UCe.LIZ;
    }

    public final void jv0(ActivityC45651qj activityC45651qj, C65767PrX<Price> c65767PrX, Price price, String str, final InterfaceC248679pP interfaceC248679pP, String str2, String str3) {
        String str4;
        String str5;
        String str6 = str2;
        if (c65767PrX != null && str != null) {
            Price price2 = null;
            if (C7VX.LIZ()) {
                ASL LIZ = C249109q6.LIZ(0);
                Iterator<Price> it = c65767PrX.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Price next = it.next();
                    String priceInUsd = next.getPriceInUsd();
                    if (price != null) {
                        str5 = price.getPriceInUsd();
                    } else {
                        str5 = null;
                    }
                    if (o.LJ(priceInUsd, str5)) {
                        price2 = next;
                        break;
                    }
                }
                InterfaceC248679pP interfaceC248679pP2 = new InterfaceC248679pP() { // from class: X.9pM
                    @Override // X.InterfaceC248679pP
                    public final void LIZ(Price price3) {
                        InterfaceC248679pP.this.LIZ(price3);
                        TuxSheet tuxSheet = this.LJLJI;
                        if (tuxSheet != null) {
                            tuxSheet.dismiss();
                        }
                    }
                };
                SeriesPriceOptionsFragment seriesPriceOptionsFragment = new SeriesPriceOptionsFragment();
                seriesPriceOptionsFragment.LJLIL = interfaceC248679pP2;
                Bundle bundle = new Bundle();
                bundle.putSerializable("prices", c65767PrX);
                bundle.putSerializable("selected_price", price2);
                bundle.putString("local_currency_symbol", str);
                bundle.putString("description_header", str3);
                bundle.putString("sheet_header", str6);
                seriesPriceOptionsFragment.setArguments(bundle);
                TuxSheet tuxSheet = LIZ.LIZ;
                tuxSheet.LJLLILLLL = seriesPriceOptionsFragment;
                C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "price_sheet");
                this.LJLJI = tuxSheet;
                return;
            }
            C152605yq c152605yq = new C152605yq();
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            if (str6 == null) {
                str6 = "";
            }
            c9kf.LIZJ = str6;
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS154S0100000_4(c152605yq, 613));
            c235119Kp.LIZIZ(LIZJ);
            c235119Kp.LIZLLL = true;
            TuxSingleSelectionSheet tuxSingleSelectionSheet = c152605yq.LIZ;
            tuxSingleSelectionSheet.LJLLI = c235119Kp;
            tuxSingleSelectionSheet.LJLLILLLL = 0;
            ArrayList arrayList = new ArrayList(C32I.LJJL(c65767PrX, 10));
            Iterator<Price> it2 = c65767PrX.iterator();
            while (it2.hasNext()) {
                Price next2 = it2.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('$');
                LIZ2.append(next2.getPriceInUsd());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('(');
                LIZ3.append(str);
                LIZ3.append(next2.getPriceInLocalCurrency());
                LIZ3.append(')');
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                String priceInUsd2 = next2.getPriceInUsd();
                Price price3 = getState().LJLJJI;
                if (price3 != null) {
                    str4 = price3.getPriceInUsd();
                } else {
                    str4 = null;
                }
                arrayList.add(new C253179wf(next2, LIZIZ, LIZIZ2, o.LJ(priceInUsd2, str4)));
            }
            c152605yq.LIZ.LJLLL = arrayList;
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 508);
            TuxSingleSelectionSheet tuxSingleSelectionSheet2 = c152605yq.LIZ;
            tuxSingleSelectionSheet2.LJLLLL = aqS170S0100000_4;
            FragmentManager it3 = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(it3, "it");
            tuxSingleSelectionSheet2.show(it3, "price_sheet");
        }
    }
}
