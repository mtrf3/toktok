package kotlin.jvm.internal;

import X.AMD;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1R;
import X.C29S;
import X.C39557Ffl;
import X.C55096Ljo;
import X.C61878OQg;
import X.C65767PrX;
import X.C76800UCe;
import X.InterfaceC248679pP;
import X.InterfaceC35811ar;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC72022SOk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.viewmodel.FilterVideoKeywordsViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncServiceImpl;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public class AqS64S0400000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1();
            case 2:
                return invoke$2();
            case 3:
                return invoke$3();
            case 4:
                return invoke$4();
            case 5:
                return invoke$5();
            case 6:
                return invoke$6();
            case 7:
                return invoke$7();
            case 8:
                return invoke$8();
            case 9:
                return invoke$9();
            case 10:
                return invoke$10();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11();
            case 12:
                return invoke$12();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13();
            case 14:
                return invoke$14();
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$15();
            case 17:
                return invoke$16();
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$0() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(AddressEditViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 177));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditDetailViewModel invoke$1() {
        C29S c29s = (C29S) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(c29s, ((AMD) c29s).getViewModelFactory()).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l3).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        InterfaceC72022SOk create = r2.LJLJJI.create(AddressEditDetailViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 185));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DistrictPickerWrapperViewModel invoke$10() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(DistrictPickerWrapperViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 337));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FollowRelationTabViewModel invoke$11() {
        C29S c29s = (C29S) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(c29s, ((AMD) c29s).getViewModelFactory()).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l3).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        InterfaceC72022SOk create = r2.LJLJJI.create(FollowRelationTabViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 382));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final NotificationLiveViewModel invoke$12() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(NotificationLiveViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 402));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.user.repository.UserViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final UserViewModel invoke$13() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(UserViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 403));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PushSettingNotificationChoiceViewModel invoke$14() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(PushSettingNotificationChoiceViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 458));
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final MyProfileGuideViewModel invoke$15() {
        ViewModelProvider of;
        Object host = ((Widget) this.l0).getHost();
        if (host instanceof Fragment) {
            of = ViewModelProviders.of((Fragment) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else if (host instanceof ActivityC45651qj) {
            of = ViewModelProviders.of((ActivityC45651qj) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else {
            throw new IllegalStateException();
        }
        ?? r2 = (JediViewModel) of.get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(MyProfileGuideViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0((InterfaceC88472Yns) this.l3);
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AuthListViewModel invoke$16() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(AuthListViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 780));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$2() {
        C29S c29s = (C29S) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(c29s, ((AMD) c29s).getViewModelFactory()).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l3).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        InterfaceC72022SOk create = r2.LJLJJI.create(AddressListViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 211));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$3() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(AddressListViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 216));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DeliveryPanelViewModel invoke$4() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(DeliveryPanelViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 228));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressSelectViewModel invoke$5() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(AddressSelectViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 232));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$6() {
        C29S c29s = (C29S) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(c29s, ((AMD) c29s).getViewModelFactory()).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l3).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        InterfaceC72022SOk create = r2.LJLJJI.create(OrderSubmitViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 254));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$7() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(PaymentViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 274));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    public final SkuPanelViewModel invoke$8() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(SkuPanelViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 323));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DistrictPickerViewModel invoke$9() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(DistrictPickerViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS170S0100000_4(this, 336));
        return r2;
    }

    public static final Object invoke$15(AqS64S0400000_4 aqS64S0400000_4) {
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((SeriesDraftAdvanceVoucherPriceAssem) aqS64S0400000_4.l0);
        if (LJIIIIZZ != null) {
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) aqS64S0400000_4.l1;
            final SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem = (SeriesDraftAdvanceVoucherPriceAssem) aqS64S0400000_4.l0;
            Context context = (Context) aqS64S0400000_4.l2;
            InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) aqS64S0400000_4.l3;
            PricesResponse pricesResponse = (PricesResponse) interfaceC35811ar.getValue();
            if (pricesResponse != null) {
                SeriesDraftViewModel H3 = seriesDraftAdvanceVoucherPriceAssem.H3();
                List<Price> priceList = pricesResponse.getPriceList();
                if (priceList == null) {
                    priceList = C61878OQg.INSTANCE;
                }
                C65767PrX<Price> copyOf = C65767PrX.copyOf((List) priceList);
                o.LJIIIIZZ(copyOf, "copyOf(this ?: emptyList())");
                H3.jv0(LJIIIIZZ, copyOf, (Price) interfaceC35811ar2.getValue(), pricesResponse.getLocalCurrencySymbol(), new InterfaceC248679pP() { // from class: X.9pb
                    @Override // X.InterfaceC248679pP
                    public final void LIZ(Price price) {
                        SeriesDraftViewModel H32 = SeriesDraftAdvanceVoucherPriceAssem.this.H3();
                        H32.getClass();
                        H32.setState(new AqS170S0100000_4(price, 40));
                        SeriesDraftViewModel H33 = SeriesDraftAdvanceVoucherPriceAssem.this.H3();
                        H33.getClass();
                        H33.setState(new AqS170S0100000_4((Price) null, 39));
                        SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem2 = SeriesDraftAdvanceVoucherPriceAssem.this;
                        seriesDraftAdvanceVoucherPriceAssem2.getClass();
                        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C7VY(seriesDraftAdvanceVoucherPriceAssem2, null), 3);
                    }
                }, context.getString(R.string.qmt), null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS64S0400000_4 aqS64S0400000_4) {
        ProfileNameSyncServiceImpl profileNameSyncServiceImpl = (ProfileNameSyncServiceImpl) aqS64S0400000_4.l0;
        Fragment fragment = (Fragment) aqS64S0400000_4.l1;
        OSZ osz = (OSZ) aqS64S0400000_4.l2;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((InterfaceC65784Pro) aqS64S0400000_4.l3, (InterfaceC65784Pro<C76800UCe>) 1079);
        profileNameSyncServiceImpl.getClass();
        ProfileNameSyncServiceImpl.LJIIIIZZ(fragment, osz, 1500L, aqS154S0100000_4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS64S0400000_4 aqS64S0400000_4) {
        MutableLiveData<List<Keyword>> iv0 = ((FilterVideoKeywordsViewModel) aqS64S0400000_4.l0).iv0();
        List<Keyword> value = ((FilterVideoKeywordsViewModel) aqS64S0400000_4.l0).iv0().getValue();
        if (value != null) {
            Keyword keyword = (Keyword) aqS64S0400000_4.l2;
            ListProtector.set(value, value.indexOf(keyword), (Keyword) aqS64S0400000_4.l3);
        } else {
            value = null;
        }
        iv0.setValue(value);
        ((InterfaceC65784Pro) aqS64S0400000_4.l1).invoke();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AqS64S0400000_4 r8) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS64S0400000_4.invoke$20(kotlin.jvm.internal.AqS64S0400000_4):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0400000_4(C29S c29s, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65350Pko interfaceC65350Pko2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c29s;
        this.l1 = interfaceC65350Pko;
        this.l2 = interfaceC88471Ynr;
        this.l3 = interfaceC65350Pko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0400000_4(Fragment fragment, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65350Pko;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0400000_4(Widget widget, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = widget;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65350Pko;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0400000_4(FilterVideoKeywordsViewModel filterVideoKeywordsViewModel, AqS154S0100000_4 aqS154S0100000_4, Keyword keyword, Keyword keyword2, int i) {
        super(0);
        this.$t = i;
        this.l0 = filterVideoKeywordsViewModel;
        this.l1 = aqS154S0100000_4;
        this.l2 = keyword;
        this.l3 = keyword2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS64S0400000_4(PaymentMethod paymentMethod, PaymentMethod paymentMethod2, List<PaymentMethod> list, B1R b1r, PaymentInfoVH2 paymentInfoVH2) {
        super(0);
        this.$t = paymentInfoVH2;
        this.l0 = paymentMethod;
        this.l1 = paymentMethod2;
        this.l2 = list;
        this.l3 = b1r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS64S0400000_4(SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem, SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem2, InterfaceC35811ar<PricesResponse> interfaceC35811ar, Context context, InterfaceC35811ar<Price> interfaceC35811ar2) {
        super(0);
        this.$t = interfaceC35811ar2;
        this.l0 = seriesDraftAdvanceVoucherPriceAssem;
        this.l1 = seriesDraftAdvanceVoucherPriceAssem2;
        this.l2 = interfaceC35811ar;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0400000_4(ProfileNameSyncServiceImpl profileNameSyncServiceImpl, Fragment fragment, OSZ osz, AqS154S0100000_4 aqS154S0100000_4, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileNameSyncServiceImpl;
        this.l1 = fragment;
        this.l2 = osz;
        this.l3 = aqS154S0100000_4;
    }
}
