package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRegionSelectSearchBarConfig;
import java.util.HashMap;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ahl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26941Ahl extends AbstractC65781Prl implements InterfaceC88471Ynr<AML, C26934Ahe, C76800UCe> {
    public final /* synthetic */ C26936Ahg LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26941Ahl(C26936Ahg c26936Ahg) {
        super(2);
        this.LJLIL = c26936Ahg;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AML aml, C26934Ahe c26934Ahe) {
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage;
        String str;
        Object obj;
        int i;
        int i2;
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage2;
        AML selectSubscribe = aml;
        C26934Ahe changePage = c26934Ahe;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(changePage, "changePage");
        int i3 = C26932Ahc.LIZ[changePage.LIZ.ordinal()];
        boolean z = true;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        for (int size = this.LJLIL.LJLIL.getChildFragmentManager().LJJJJLI().size(); 1 < size; size--) {
                            this.LJLIL.LJLIL.getChildFragmentManager().LJJLIIIJJI();
                        }
                    }
                } else {
                    this.LJLIL.LJLIL.getChildFragmentManager().LJJLIIIJJI();
                }
            } else if (C26744Aea.LIZ().enableSearchAddress == null) {
                C26936Ahg c26936Ahg = this.LJLIL;
                Parcelable parcelable = c26936Ahg.LJLILLLLZI.LJLJJLL;
                if ((parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable) != null) {
                    String str2 = null;
                    OrderSKUDTO orderSKUDTO = new OrderSKUDTO(enterParamForProductDetailPage.productId, enterParamForProductDetailPage.skuId, Integer.valueOf(enterParamForProductDetailPage.quantity), null, 0, null, null, null, null, enterParamForProductDetailPage.selectedLogisticTypeId, null, null, null, null, null, null, null, 130408, null);
                    AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(c26936Ahg, 1432);
                    AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(c26936Ahg, 1229);
                    AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(c26936Ahg, 1228);
                    Parcelable parcelable2 = c26936Ahg.LJLILLLLZI.LJLJJLL;
                    if ((parcelable2 instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (enterParamForProductDetailPage2 = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable2) != null) {
                        str = enterParamForProductDetailPage2.trackParams;
                    } else {
                        str = null;
                    }
                    HashMap<String, Object> LJII = C27739Aud.LJII(str);
                    if (LJII != null) {
                        obj = LJII.get("entrance_info");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("order_sku", orderSKUDTO);
                    bundle.putParcelableArrayList("current_selected_region_list", C47261Igj.LJII(new District(null, null, null, null, null, null, null, null, null, 511, null)));
                    DistrictFragment districtFragment = new DistrictFragment();
                    districtFragment.setArguments(bundle);
                    districtFragment.LJLJJL = str2;
                    districtFragment.LJLLLLLL = aqS170S0100000_4;
                    districtFragment.LJLZ = aqS154S0100000_4;
                    districtFragment.LJZ = aqS154S0100000_42;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[getStoreRegion]: currentStoreRegionInfo = ");
                    LIZ.append(C66260PzU.LIZ);
                    C26946Ahq.LIZ(X1D.LIZIZ(LIZ));
                    if (o.LJ(C66260PzU.LIZ.LJLILLLLZI, "us")) {
                        Bundle arguments = districtFragment.getArguments();
                        if (arguments != null) {
                            arguments.putString("location", "us");
                        }
                        Bundle arguments2 = districtFragment.getArguments();
                        if (arguments2 != null) {
                            arguments2.putString("previous_page", "logistics");
                        }
                    }
                    Boolean enableSearchBar = EcomRegionSelectSearchBarConfig.LIZ().getEnableSearchBar();
                    if (enableSearchBar != null && enableSearchBar.booleanValue()) {
                        Bundle arguments3 = districtFragment.getArguments();
                        if (arguments3 != null) {
                            arguments3.putBoolean("needSearchBox", true);
                        }
                        Bundle arguments4 = districtFragment.getArguments();
                        if (arguments4 != null) {
                            Integer getDistrictTypeForSearch = EcomRegionSelectSearchBarConfig.LIZ().getGetDistrictTypeForSearch();
                            if (getDistrictTypeForSearch != null) {
                                i2 = getDistrictTypeForSearch.intValue();
                            } else {
                                i2 = 2;
                            }
                            arguments4.putString("search_district_type", String.valueOf(i2));
                        }
                    }
                    Bundle arguments5 = districtFragment.getArguments();
                    if (arguments5 != null) {
                        Integer getDistrictTypeForList = EcomRegionSelectSearchBarConfig.LIZ().getGetDistrictTypeForList();
                        if (getDistrictTypeForList != null) {
                            i = getDistrictTypeForList.intValue();
                        } else {
                            i = 0;
                        }
                        arguments5.putString("district_type", String.valueOf(i));
                    }
                    Bundle arguments6 = districtFragment.getArguments();
                    if (arguments6 != null) {
                        arguments6.putString("previous_page", "logistics");
                    }
                    DeliveryPanelViewModel deliveryPanelViewModel = c26936Ahg.LJLILLLLZI;
                    AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(districtFragment, c26936Ahg, 52);
                    deliveryPanelViewModel.getClass();
                    deliveryPanelViewModel.LJLJLJ = aqS151S0200000_4;
                    if (!districtFragment.shouldDowngrade()) {
                        z = false;
                    }
                    c26936Ahg.LJII(districtFragment, z);
                }
            } else if (o.LJ(C26744Aea.LIZ().enableSearchAddress, Boolean.TRUE)) {
                AddressSelectFragment addressSelectFragment = new AddressSelectFragment();
                this.LJLIL.LJII(addressSelectFragment, addressSelectFragment.shouldDowngrade());
            } else {
                Context context = this.LJLIL.LJLIL.getContext();
                C26936Ahg c26936Ahg2 = this.LJLIL;
                AddressPageStarter.LIZ(context, c26936Ahg2.LJLIL, null, null, "logistics", false, c26936Ahg2.LJIIIIZZ(), null, null, null, false, 0, null, null, null, null, null, null, 262048);
            }
        } else if (C26744Aea.LIZ().enableSearchAddress != null && o.LJ(C26744Aea.LIZ().enableSearchAddress, Boolean.FALSE)) {
            String LJJIIZI = C79234V7u.LJJIIZI(this.LJLIL.LJLIL, null);
            C1A8.LJIJI(LJJIIZI, new AqS47S1200000_4(selectSubscribe, this.LJLIL, LJJIIZI, 32));
        } else {
            AddressSelectFragment addressSelectFragment2 = new AddressSelectFragment();
            this.LJLIL.LJII(addressSelectFragment2, addressSelectFragment2.shouldDowngrade());
        }
        return C76800UCe.LIZ;
    }
}
