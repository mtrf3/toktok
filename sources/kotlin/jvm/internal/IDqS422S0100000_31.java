package kotlin.jvm.internal;

import X.ASQ;
import X.ASX;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C0Z5;
import X.C16880lQ;
import X.C39557Ffl;
import X.C47261Igj;
import X.C55096Ljo;
import X.C61447O9r;
import X.C61878OQg;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C77321UWf;
import X.C78613UtF;
import X.C7C3;
import X.C8W0;
import X.C91706Zyw;
import X.C91712Zz2;
import X.C91724ZzE;
import X.C91746Zza;
import X.C91834a10;
import X.C91941a2j;
import X.C91950a2s;
import X.C91956a2y;
import X.C92031a4B;
import X.C92047a4R;
import X.C92054a4Y;
import X.C92058a4c;
import X.C92105a5N;
import X.C92145a61;
import X.C92158a6E;
import X.C92228a7M;
import X.C92260a7s;
import X.C92267a7z;
import X.C92270a82;
import X.C92283a8F;
import X.C92324a8u;
import X.C92335a95;
import X.C92351a9L;
import X.C92357a9R;
import X.C92362a9W;
import X.C92363a9X;
import X.C92507aBr;
import X.C93122aLm;
import X.C93149aMD;
import X.C93152aMG;
import X.EnumC91763Zzr;
import X.EnumC91966a38;
import X.EnumC92042a4M;
import X.EnumC92043a4N;
import X.InterfaceC24760y8;
import X.InterfaceC35811ar;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC91758Zzm;
import X.ORZ;
import X.OSZ;
import X.PVC;
import X.X1D;
import X.XKX;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;
import com.bytedance.pipo.checkout.element.utils.CountryInfo;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailsAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailsFragment;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeFragment;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsListAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsTabFragment;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingFragment;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.ProgressFragment;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberFragment;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryAssem;
import com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyForgotFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes20.dex */
public class IDqS422S0100000_31 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$25();
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$26();
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$27();
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$28();
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            case C61447O9r.LJIIJ:
                return invoke$29();
            case 50:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$30();
            case 54:
                return invoke$31();
            case 55:
                return invoke$32();
            case 56:
                return invoke$33();
            case 57:
                return invoke$34();
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$35();
            case 60:
                return invoke$36();
            case 61:
                return invoke$37();
            case BaseNotice.CREATOR /* 62 */:
                return invoke$38();
            case 63:
                return invoke$39();
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                return invoke$120(this);
            default:
                return null;
        }
    }

    public final SavedStateViewModelFactory invoke$0() {
        Object LLLLL;
        Context context = ((NavBackStackEntry) this.l0).LJLIL;
        Application application = null;
        if (context == null) {
            LLLLL = null;
        } else {
            LLLLL = C16880lQ.LLLLL(context);
        }
        if (LLLLL instanceof Application) {
            application = (Application) LLLLL;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.l0;
        return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.LJLJI);
    }

    public final void invoke$1() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$10() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$11() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$12() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$13() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$14() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$15() {
        ((PIViewModel) this.l0).changeBindVisibility(false);
    }

    public final void invoke$16() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$17() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$18() {
        ((PIViewModel) this.l0).changeBindVisibility(false);
    }

    public final void invoke$19() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$2() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$20() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$21() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$22() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$23() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final void invoke$24() {
        ((PIViewModel) this.l0).changeBindVisibility(true);
    }

    public final C7C3 invoke$27() {
        return ((C8W0) this.l0).getSupervisor().LIZJ();
    }

    public final void invoke$3() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final C7C3 invoke$35() {
        return ((C8W0) this.l0).getSupervisor().LIZJ();
    }

    public final C7C3 invoke$36() {
        return ((C8W0) this.l0).getSupervisor().LIZJ();
    }

    public final C7C3 invoke$37() {
        return ((C8W0) this.l0).getSupervisor().LIZJ();
    }

    public final C7C3 invoke$38() {
        return ((C8W0) this.l0).getSupervisor().LIZJ();
    }

    public final C7C3 invoke$39() {
        return ((C8W0) this.l0).getSupervisor().LIZJ();
    }

    public final void invoke$4() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(false);
    }

    public final void invoke$40() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$41() {
        ((C0Z5) this.l0).LIZIZ(false);
    }

    public final void invoke$42() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$43() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$44() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$45() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$46() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$47() {
        ((InterfaceC65784Pro) this.l0).invoke();
    }

    public final void invoke$5() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$6() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$7() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final void invoke$8() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(false);
    }

    public final void invoke$9() {
        ((CheckoutViewModel) this.l0).changeCheckoutVisibility(true);
    }

    public final String invoke$25() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$26() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$28() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$29() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$30() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$31() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$32() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$33() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$34() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(IDqS422S0100000_31 iDqS422S0100000_31) {
        if (((NavBackStackEntry) iDqS422S0100000_31.l0).LJLJLJ.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) iDqS422S0100000_31.l0;
            return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(navBackStackEntry, new C92335a95(navBackStackEntry)).get(NavBackStackEntry.SavedStateViewModel.class)).LJLIL;
        }
        "You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString();
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$4();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$100(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((StatementsListAssem) iDqS422S0100000_31.l0).A3().manualListRefresh();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$101(IDqS422S0100000_31 iDqS422S0100000_31) {
        if (((StatementsListAssem) iDqS422S0100000_31.l0).v3().getListItems().size() == 0) {
            ((StatementsListAssem) iDqS422S0100000_31.l0).v3().setVisibility(8);
            ((StatementsListAssem) iDqS422S0100000_31.l0).C3().setVisibility(0);
            ((StatementsListAssem) iDqS422S0100000_31.l0).C3().LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$102(IDqS422S0100000_31 iDqS422S0100000_31) {
        C91834a10.LIZLLL("get_help", (String) ((StatementsTabFragment) iDqS422S0100000_31.l0).LJLJJI.getValue());
        C91834a10.LJ(((StatementsTabFragment) iDqS422S0100000_31.l0).mo49getActivity(), "bnpl_all_statements");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$103(IDqS422S0100000_31 iDqS422S0100000_31) {
        C91834a10.LIZLLL("back", (String) ((StatementsTabFragment) iDqS422S0100000_31.l0).LJLJJI.getValue());
        ActivityC45651qj mo49getActivity = ((StatementsTabFragment) iDqS422S0100000_31.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$104(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((ProgressFragment) iDqS422S0100000_31.l0).Dl();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$105(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((LandingAssemVM) ((LandingFragment) iDqS422S0100000_31.l0).LJLIL.getValue()).onEventClick("back");
        ((LandingFragment) iDqS422S0100000_31.l0).requireActivity().finish();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$106(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92145a61 c92145a61 = new C92145a61((Context) iDqS422S0100000_31.l0);
        c92145a61.LJIJJ.LIZ(new C92267a7z());
        c92145a61.LJIJJ.LIZ(new C92270a82());
        return c92145a61;
    }

    public static final Object invoke$107(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((PhoneNumberVM) ((PhoneNumberFragment) iDqS422S0100000_31.l0).LJLILLLLZI.getValue()).onEventClick("back");
        ((PhoneNumberFragment) iDqS422S0100000_31.l0).requireActivity().finish();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$108(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$45();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$109(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$46();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$5();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$110(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$47();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$111(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((OtpFragment) iDqS422S0100000_31.l0).onEventClick("back");
        ((OtpFragment) iDqS422S0100000_31.l0).wl("CANCEL", null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$112(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinChangeViewAssem) iDqS422S0100000_31.l0).LJLJJL, "bnpl_pin_change", ((PinChangeViewAssem) iDqS422S0100000_31.l0).A3().LJLILLLLZI, "back");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinChangeViewAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$113(IDqS422S0100000_31 iDqS422S0100000_31) {
        PinChangeViewModel C3 = ((PinChangeViewAssem) iDqS422S0100000_31.l0).C3();
        XKX.LIZLLL(C3.getAssemVMScope(), null, null, new C93149aMD(C3, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$114(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinForgotViewAssem) iDqS422S0100000_31.l0).LJLJJI, "bnpl_pin_forgot", ((PinForgotViewAssem) iDqS422S0100000_31.l0).v3().LJLIL, "back");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinForgotViewAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$115(IDqS422S0100000_31 iDqS422S0100000_31) {
        PinForgotViewModel x3 = ((PinForgotViewAssem) iDqS422S0100000_31.l0).x3();
        XKX.LIZLLL(x3.getAssemVMScope(), null, null, new C93152aMG(x3, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$116(IDqS422S0100000_31 iDqS422S0100000_31) {
        String str = ((PinConfirmViewAssem) iDqS422S0100000_31.l0).A3().LJLJI;
        long currentTimeMillis = System.currentTimeMillis();
        ((PinConfirmViewAssem) iDqS422S0100000_31.l0).getClass();
        C92058a4c.LIZ(currentTimeMillis - 0, "bnpl_pin_set", str, "close");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinConfirmViewAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.onBackPressed();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$117(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinSetViewAssem) iDqS422S0100000_31.l0).LJLJJL, "bnpl_pin_set", ((PinSetViewAssem) iDqS422S0100000_31.l0).A3().LJLJI, "close");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinSetViewAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.onBackPressed();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$118(IDqS422S0100000_31 iDqS422S0100000_31) {
        ASQ.LJIIJ((PinVerifyForgotFragment) iDqS422S0100000_31.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$119(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinVerifyViewAssem) iDqS422S0100000_31.l0).LJLJJI, "bnpl_pin_use", ((PinVerifyViewAssem) iDqS422S0100000_31.l0).A3().LJLJI, "back");
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("CANCEL", "bnpl_pin_use", null);
        }
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinVerifyViewAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$6();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$120(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinVerifyViewAssem) iDqS422S0100000_31.l0).LJLJJI, "bnpl_pin_use", ((PinVerifyViewAssem) iDqS422S0100000_31.l0).A3().LJLJI, "back");
        Fragment LJIIIZ = C55096Ljo.LJIIIZ((PinVerifyViewAssem) iDqS422S0100000_31.l0);
        if (LJIIIZ != null) {
            ASQ.LJ(LJIIIZ, ASX.LIZ);
        }
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("CANCEL", "bnpl_pin_use", null);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$7();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$8();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$9();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$10();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$11();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$12();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$13();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((C91706Zyw) iDqS422S0100000_31.l0).getClass();
        C91706Zyw c91706Zyw = (C91706Zyw) iDqS422S0100000_31.l0;
        return new C91724ZzE(c91706Zyw.LIZ, c91706Zyw.LJIJJ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$14();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$15();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$16();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$17();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$18();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$19();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$20();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$21();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$22();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$23();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS422S0100000_31 iDqS422S0100000_31) {
        String str = ((C91712Zz2) iDqS422S0100000_31.l0).LJIIIIZZ;
        if (str == null) {
            return null;
        }
        return PatternProtector.compile(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$24();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((DetailsAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.dy);
    }

    public static final Object invoke$32(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((DetailsAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.cd);
    }

    public static final Object invoke$33(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((DetailsAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.c_);
    }

    public static final Object invoke$35(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((DetailsAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.cg);
    }

    public static final Object invoke$37(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((BillHomeAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.hs);
    }

    public static final Object invoke$38(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((BillHomeAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.eb);
    }

    public static final Object invoke$39(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((BillHomeAssem) iDqS422S0100000_31.l0).A3().gv0(true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS422S0100000_31 iDqS422S0100000_31) {
        String str = ((C91712Zz2) iDqS422S0100000_31.l0).LJFF;
        if (str == null) {
            return null;
        }
        return PatternProtector.compile(str, 2);
    }

    public static final Object invoke$41(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((RepaymentRetAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.cw);
    }

    public static final Object invoke$42(IDqS422S0100000_31 iDqS422S0100000_31) {
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJIIJ(c73306Spq, new IDqS422S0100000_31((RepaymentRetAssem) iDqS422S0100000_31.l0, 45));
        return c73306Spq;
    }

    public static final Object invoke$44(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((RepaymentRetAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.d8);
    }

    public static final Object invoke$45(IDqS422S0100000_31 iDqS422S0100000_31) {
        RepaymentViewModel repaymentViewModel = (RepaymentViewModel) ((RepaymentRetAssem) iDqS422S0100000_31.l0).LJLJJL.getValue();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(repaymentViewModel), C78613UtF.LIZJ, null, new C93122aLm(repaymentViewModel, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(IDqS422S0100000_31 iDqS422S0100000_31) {
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJIIJ(c73306Spq, new IDqS422S0100000_31((StatementsListAssem) iDqS422S0100000_31.l0, 52));
        return c73306Spq;
    }

    public static final Object invoke$47(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((StatementsListAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.hr);
    }

    public static final Object invoke$48(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((StatementsListAssem) iDqS422S0100000_31.l0).A3().manualListRefresh();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((StatementsListAssem) iDqS422S0100000_31.l0).getContainerView().findViewById(R.id.kf_);
    }

    public static final Object invoke$51(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((C92260a7s) ((StatementsViewModel) iDqS422S0100000_31.l0).LJLIL.getValue()).LJLIL;
    }

    public static final Object invoke$52(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((StatementsListAssem) iDqS422S0100000_31.l0).A3().manualListRefresh();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$58(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((BNPLEntryViewModel) ((BNPLEntryAssem) iDqS422S0100000_31.l0).LJLIL.getValue()).gv0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3.LJLLLL.get(r3.LJLJLLL.getValue()) != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.IDqS422S0100000_31 r3) {
        /*
            java.lang.Object r3 = r3.l0
            com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel r3 = (com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel) r3
            X.Zzv r1 = r3.LJLILLLLZI
            boolean r0 = r1 instanceof X.C92161a6H
            r2 = 0
            if (r0 == 0) goto L1f
            X.1jj<X.Zzr, com.bytedance.pipo.checkout.api.network.model.response.District> r1 = r3.LJLLLL
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r3.LJLJLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L1a
        L19:
            r2 = 1
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L1f:
            boolean r0 = r1 instanceof X.C92160a6G
            if (r0 == 0) goto L4b
            X.1jj<X.Zzr, com.bytedance.pipo.checkout.api.network.model.response.District> r1 = r3.LJLLLL
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2c
            goto L19
        L2c:
            X.2BC r0 = r1.LJLILLLLZI
            java.util.Iterator r1 = r0.iterator()
        L32:
            r0 = r1
            X.0O7 r0 = (X.C0O7) r0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L19
            r0 = r1
            X.1IH r0 = (X.C1IH) r0
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L1a
            goto L32
        L4b:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS422S0100000_31.invoke$6(kotlin.jvm.internal.IDqS422S0100000_31):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$64(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$40();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$65(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((C92363a9X) iDqS422S0100000_31.l0).LJIJJLI.invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$66(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((C92351a9L) iDqS422S0100000_31.l0).LJIIIZ(C47261Igj.LJJIJ(new OSZ("obj_id", EnumC91966a38.Address.getType())));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$67(IDqS422S0100000_31 iDqS422S0100000_31) {
        boolean z;
        Map<EnumC91763Zzr, InterfaceC35811ar<C91941a2j>> map = ((C92351a9L) iDqS422S0100000_31.l0).LJIJJLI;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<EnumC91763Zzr, InterfaceC35811ar<C91941a2j>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().getValue().LIZ) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return new C91941a2j("", z, 4);
    }

    public static final Object invoke$68(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((C92351a9L) iDqS422S0100000_31.l0).LJIILIIL = C92047a4R.LIZ();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$69(IDqS422S0100000_31 iDqS422S0100000_31) {
        boolean z = false;
        if (((Boolean) ((C92357a9R) iDqS422S0100000_31.l0).LJJII.getValue()).booleanValue() && ((CharSequence) ((C92357a9R) iDqS422S0100000_31.l0).LJII.getValue()).length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(IDqS422S0100000_31 iDqS422S0100000_31) {
        boolean z;
        if (ORZ.LLFF(((AddressViewModel) iDqS422S0100000_31.l0).LJLJJL) == ((AddressViewModel) iDqS422S0100000_31.l0).LJLJLLL.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$70(IDqS422S0100000_31 iDqS422S0100000_31) {
        if (((List) ((C92362a9W) iDqS422S0100000_31.l0).LJIJI.getValue()).isEmpty()) {
            return "";
        }
        return ListProtector.get((List) ((C92362a9W) iDqS422S0100000_31.l0).LJIJI.getValue(), ((Number) ((C92362a9W) iDqS422S0100000_31.l0).LJIL.getValue()).intValue());
    }

    public static final Object invoke$71(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((DetailsAssem) iDqS422S0100000_31.l0).A3().manualListRefresh();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$72(IDqS422S0100000_31 iDqS422S0100000_31) {
        if (((DetailsAssem) iDqS422S0100000_31.l0).v3().getListItems().size() == 0) {
            ((DetailsAssem) iDqS422S0100000_31.l0).C3().setVisibility(8);
            ((DetailsAssem) iDqS422S0100000_31.l0).E3().setVisibility(8);
            ((DetailsAssem) iDqS422S0100000_31.l0).F3().setVisibility(0);
            ((DetailsAssem) iDqS422S0100000_31.l0).F3().LJFF();
        } else {
            ((DetailsAssem) iDqS422S0100000_31.l0).C3().setVisibility(0);
            ((DetailsAssem) iDqS422S0100000_31.l0).E3().setVisibility(8);
            ((DetailsAssem) iDqS422S0100000_31.l0).F3().setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$73(IDqS422S0100000_31 iDqS422S0100000_31) {
        String str = (String) ((DetailsFragment) iDqS422S0100000_31.l0).LJLJI.getValue();
        if (str == null) {
            str = "";
        }
        C91834a10.LIZIZ("get_help", str);
        C91834a10.LJ(((DetailsFragment) iDqS422S0100000_31.l0).mo49getActivity(), "bnpl_statement_details");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$74(IDqS422S0100000_31 iDqS422S0100000_31) {
        String str = (String) ((DetailsFragment) iDqS422S0100000_31.l0).LJLJI.getValue();
        if (str == null) {
            str = "";
        }
        C91834a10.LIZIZ("back", str);
        ActivityC45651qj mo49getActivity = ((DetailsFragment) iDqS422S0100000_31.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$75(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$76(IDqS422S0100000_31 iDqS422S0100000_31) {
        return ((InterfaceC24760y8) iDqS422S0100000_31.l0).getValue();
    }

    public static final Object invoke$77(IDqS422S0100000_31 iDqS422S0100000_31) {
        String str;
        C92324a8u c92324a8u = C92105a5N.LIZ;
        if (c92324a8u == null) {
            str = null;
        } else {
            str = c92324a8u.LJLJJL;
        }
        ((InterfaceC88472Yns) iDqS422S0100000_31.l0).invoke(C91950a2s.LIZIZ(C91746Zza.LIZJ(str), C92054a4Y.LIZ("pipo_payin_pp", new String[0]), false, true, true, false, false, 128));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$78(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$41();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$79(IDqS422S0100000_31 iDqS422S0100000_31) {
        C92283a8F c92283a8F = (C92283a8F) iDqS422S0100000_31.l0;
        c92283a8F.getClass();
        c92283a8F.LJIIJ(EnumC92042a4M.ContinueToPay.getObjId(), EnumC92043a4N.QuitTransaction.getPopupId());
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$2();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$80(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC91758Zzm) iDqS422S0100000_31.l0).LIZLLL(C92507aBr.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$81(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$82(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$83(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$84(IDqS422S0100000_31 iDqS422S0100000_31) {
        ActivityC45651qj mo49getActivity = ((BillHomeFragment) iDqS422S0100000_31.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$85(IDqS422S0100000_31 iDqS422S0100000_31) {
        return Float.valueOf(((Number) ((InterfaceC24760y8) iDqS422S0100000_31.l0).getValue()).floatValue());
    }

    public static final Object invoke$86(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC88472Yns) iDqS422S0100000_31.l0).invoke(CheckoutAction.RetryCheckout.INSTANCE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$87(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((CheckoutViewModel) iDqS422S0100000_31.l0).retry();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$88(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$89(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((C91706Zyw) iDqS422S0100000_31.l0).LJIILJJIL();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$3();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$90(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$42();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$91(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((PIViewModel) iDqS422S0100000_31.l0).cashierRetry();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$92(IDqS422S0100000_31 iDqS422S0100000_31) {
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((RepaymentAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.onBackPressed();
        }
        ((RepaymentAssem) iDqS422S0100000_31.l0).v3().iv0("back");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$93(IDqS422S0100000_31 iDqS422S0100000_31) {
        List<CountryInfo> list;
        BufferedReader bufferedReader;
        try {
            InputStream open = ((Context) iDqS422S0100000_31.l0).getAssets().open("pipo_default_country.json");
            o.LJIIIIZZ(open, "context.assets.open(COUNTRY_INFO)");
            Reader inputStreamReader = new InputStreamReader(open, PVC.LIZ);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
            }
            try {
                String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                AnonymousClass636.LJFF(bufferedReader, null);
                Object LJII = new Gson().LJII(LJIILJJIL, new C92228a7M().getType());
                o.LJIIIIZZ(LJII, "{\n                val st…lassObject)\n            }");
                list = (List) LJII;
            } finally {
            }
        } catch (Throwable unused) {
            list = C61878OQg.INSTANCE;
        }
        C91956a2y.LIZ = list;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$94(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$95(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$43();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$96(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$97(IDqS422S0100000_31 iDqS422S0100000_31) {
        iDqS422S0100000_31.invoke$44();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$98(IDqS422S0100000_31 iDqS422S0100000_31) {
        ((InterfaceC65784Pro) iDqS422S0100000_31.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$99(IDqS422S0100000_31 iDqS422S0100000_31) {
        C91834a10.LIZJ(null, "close", ((RepaymentRetAssem) iDqS422S0100000_31.l0).v3().LJLILLLLZI);
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((RepaymentRetAssem) iDqS422S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.onBackPressed();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C0Z5 c0z5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS422S0100000_31(InterfaceC24760y8 interfaceC24760y8, InterfaceC24760y8<Integer> interfaceC24760y82) {
        super(0);
        this.$t = interfaceC24760y82;
        this.l0 = interfaceC24760y8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C8W0 c8w0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c8w0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(InterfaceC65350Pko interfaceC65350Pko, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65350Pko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS422S0100000_31(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.$t = interfaceC88472Yns2;
        this.l0 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C91706Zyw c91706Zyw, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91706Zyw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C91712Zz2 c91712Zz2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91712Zz2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C92158a6E c92158a6E, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92158a6E;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C92283a8F c92283a8F, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92283a8F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C92351a9L c92351a9L, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92351a9L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C92357a9R c92357a9R, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92357a9R;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C92362a9W c92362a9W, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92362a9W;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(C92363a9X c92363a9X, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92363a9X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(NavBackStackEntry navBackStackEntry, int i) {
        super(0);
        this.$t = i;
        this.l0 = navBackStackEntry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(AddressViewModel addressViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = addressViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(CheckoutViewModel checkoutViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = checkoutViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PIViewModel pIViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = pIViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(DetailsAssem detailsAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = detailsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(DetailsFragment detailsFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = detailsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(BillHomeAssem billHomeAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = billHomeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(BillHomeFragment billHomeFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = billHomeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(RepaymentAssem repaymentAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = repaymentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(RepaymentRetAssem repaymentRetAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = repaymentRetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(StatementsListAssem statementsListAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = statementsListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(StatementsTabFragment statementsTabFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = statementsTabFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(StatementsViewModel statementsViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = statementsViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(LandingFragment landingFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = landingFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(ProgressFragment progressFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = progressFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PhoneNumberFragment phoneNumberFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = phoneNumberFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(BNPLEntryAssem bNPLEntryAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = bNPLEntryAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(OtpFragment otpFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = otpFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PinChangeViewAssem pinChangeViewAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinChangeViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PinForgotViewAssem pinForgotViewAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PinConfirmViewAssem pinConfirmViewAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinConfirmViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PinSetViewAssem pinSetViewAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinSetViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PinVerifyForgotFragment pinVerifyForgotFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinVerifyForgotFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS422S0100000_31(PinVerifyViewAssem pinVerifyViewAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinVerifyViewAssem;
    }
}
