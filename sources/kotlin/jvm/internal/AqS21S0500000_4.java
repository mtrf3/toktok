package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C188727au;
import X.C25806AAw;
import X.C32I;
import X.C40328FsC;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C65767PrX;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC248679pP;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.ORZ;
import android.content.Context;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public class AqS21S0500000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS21S0500000_4 aqS21S0500000_4) {
        C65767PrX<Price> c65767PrX;
        List<Price> discountList;
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((SeriesDraftAdvanceVoucherPriceAssem) aqS21S0500000_4.l0);
        if (LJIIIIZZ != null) {
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) aqS21S0500000_4.l1;
            final SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem = (SeriesDraftAdvanceVoucherPriceAssem) aqS21S0500000_4.l0;
            Context context = (Context) aqS21S0500000_4.l2;
            final InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) aqS21S0500000_4.l3;
            InterfaceC35811ar interfaceC35811ar3 = (InterfaceC35811ar) aqS21S0500000_4.l4;
            PricesResponse pricesResponse = (PricesResponse) interfaceC35811ar.getValue();
            if (pricesResponse != null) {
                Price price = (Price) interfaceC35811ar2.getValue();
                if (price != null && (discountList = price.getDiscountList()) != null) {
                    c65767PrX = C65767PrX.copyOf((List) discountList);
                    o.LJIIIIZZ(c65767PrX, "copyOf(this ?: emptyList())");
                } else {
                    c65767PrX = null;
                }
                if (interfaceC35811ar2.getValue() == null) {
                    ActivityC45651qj LJIIIIZZ2 = C55096Ljo.LJIIIIZZ(seriesDraftAdvanceVoucherPriceAssem);
                    if (LJIIIIZZ2 != null) {
                        C40328FsC.LIZLLL(LJIIIIZZ2, R.string.qk6);
                    }
                } else if (c65767PrX == null || c65767PrX.isEmpty()) {
                    ActivityC45651qj LJIIIIZZ3 = C55096Ljo.LJIIIIZZ(seriesDraftAdvanceVoucherPriceAssem);
                    if (LJIIIIZZ3 != null) {
                        C40328FsC.LIZLLL(LJIIIIZZ3, R.string.qk5);
                    }
                } else {
                    seriesDraftAdvanceVoucherPriceAssem.H3().jv0(LJIIIIZZ, c65767PrX, (Price) interfaceC35811ar3.getValue(), pricesResponse.getLocalCurrencySymbol(), new InterfaceC248679pP() { // from class: X.9pc
                        @Override // X.InterfaceC248679pP
                        public final void LIZ(Price price2) {
                            String str;
                            SeriesDraftViewModel H3 = SeriesDraftAdvanceVoucherPriceAssem.this.H3();
                            H3.getClass();
                            H3.setState(new AqS170S0100000_4(price2, 39));
                            String priceInUsd = price2.getPriceInUsd();
                            Price value = interfaceC35811ar2.getValue();
                            if (value != null) {
                                str = value.getPriceInUsd();
                            } else {
                                str = null;
                            }
                            FMX.LJIIL("click_new_series_select_discount", JBR.LJIIIIZZ("discount_amount", priceInUsd, "collection_price", str).LIZ);
                            SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem2 = SeriesDraftAdvanceVoucherPriceAssem.this;
                            seriesDraftAdvanceVoucherPriceAssem2.getClass();
                            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C7VY(seriesDraftAdvanceVoucherPriceAssem2, null), 3);
                        }
                    }, context.getString(R.string.qmv), context.getString(R.string.qmu));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS21S0500000_4 aqS21S0500000_4) {
        C25806AAw c25806AAw = (C25806AAw) ((C5H3) aqS21S0500000_4.l1).getValue();
        String[] strArr = (String[]) AqS175S0200000_13.LIZ$0((InterfaceC35811ar) aqS21S0500000_4.l2).toArray(new String[0]);
        List list = (List) ((InterfaceC35811ar) aqS21S0500000_4.l3).getValue();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) aqS21S0500000_4.l2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ContentLanguage contentLanguage = (ContentLanguage) obj;
            Iterator<String> it = AqS175S0200000_13.LIZ$0(interfaceC35811ar).iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (o.LJ(contentLanguage.getLanguageCode(), next)) {
                        if (next != null) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ContentLanguage) it2.next()).getLocalName());
        }
        c25806AAw.LIZ(strArr, (String[]) arrayList2.toArray(new String[0]));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid());
        c188727au.LJIIIZ("enter_from", (String) ((DoNotTranslateSettingPage) aqS21S0500000_4.l0).LJLJJI.getValue());
        c188727au.LJIIIZ("enter_method", "translation_setting");
        c188727au.LJIIIZ("not_translate_langs", ORZ.LLD(AqS175S0200000_13.LIZ$0((InterfaceC35811ar) aqS21S0500000_4.l2), ",", null, null, null, 62));
        c188727au.LJIIIZ("prev_not_translate_langs", ORZ.LLD((Iterable) ((InterfaceC35811ar) aqS21S0500000_4.l4).getValue(), ",", null, null, null, 62));
        FMX.LJIIL("save_not_translate_langs", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS21S0500000_4(SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem, SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem2, InterfaceC35811ar<PricesResponse> interfaceC35811ar, Context context, InterfaceC35811ar<Price> interfaceC35811ar2, InterfaceC35811ar<Price> interfaceC35811ar3) {
        super(0);
        this.$t = interfaceC35811ar3;
        this.l0 = seriesDraftAdvanceVoucherPriceAssem;
        this.l1 = seriesDraftAdvanceVoucherPriceAssem2;
        this.l2 = interfaceC35811ar;
        this.l3 = context;
        this.l4 = interfaceC35811ar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S0500000_4(DoNotTranslateSettingPage doNotTranslateSettingPage, C62822Ol8 c62822Ol8, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, InterfaceC35811ar interfaceC35811ar3, int i) {
        super(0);
        this.$t = i;
        this.l0 = doNotTranslateSettingPage;
        this.l1 = c62822Ol8;
        this.l2 = interfaceC35811ar;
        this.l3 = interfaceC35811ar2;
        this.l4 = interfaceC35811ar3;
    }
}
