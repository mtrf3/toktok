package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC06580Nq;
import X.AbstractC06620Nu;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C05P;
import X.C06480Ng;
import X.C0Z5;
import X.C1IC;
import X.C4LX;
import X.C68322mC;
import X.C76800UCe;
import X.C91682ZyY;
import X.C91684Zya;
import X.C91685Zyb;
import X.C91705Zyv;
import X.C91706Zyw;
import X.C91718Zz8;
import X.C91720ZzA;
import X.C91928a2W;
import X.C91941a2j;
import X.C92031a4B;
import X.C92058a4c;
import X.C92071a4p;
import X.C92143a5z;
import X.C92145a61;
import X.C92182a6c;
import X.C92209a73;
import X.C92213a77;
import X.C92227a7L;
import X.C92253a7l;
import X.C92268a80;
import X.C92270a82;
import X.C92272a84;
import X.C92283a8F;
import X.C92291a8N;
import X.C92292a8O;
import X.C92314a8k;
import X.C92317a8n;
import X.C92351a9L;
import X.C92403aAB;
import X.C92404aAC;
import X.C92406aAE;
import X.C92535aCJ;
import X.C92623aDj;
import X.C92645aE5;
import X.C92746aFi;
import X.C92784aGK;
import X.C92895aI7;
import X.C93076aL2;
import X.C93077aL3;
import X.C93097aLN;
import X.C93130aLu;
import X.EnumC91763Zzr;
import X.EnumC91916a2K;
import X.EnumC91974a3G;
import X.EnumC92023a43;
import X.EnumC92041a4L;
import X.EnumC92072a4q;
import X.EnumC92073a4r;
import X.InterfaceC1039145z;
import X.InterfaceC35811ar;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC91938a2g;
import X.OJ4;
import X.OJ6;
import X.XKX;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;
import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailsFragment;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinRule;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public class IDqS174S0200000_31 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            default:
                return null;
        }
    }

    public final Object invoke$0(int i) {
        return ((InterfaceC88472Yns) this.l0).invoke(ListProtector.get((List) this.l1, i));
    }

    public static final Object invoke$0(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        C91720ZzA LJFF;
        C91684Zya navOptions = (C91684Zya) obj;
        o.LJIIIZ(navOptions, "$this$navOptions");
        C92403aAB animBuilder = C92403aAB.LJLIL;
        o.LJIIIZ(animBuilder, "animBuilder");
        C91685Zyb c91685Zyb = new C91685Zyb();
        animBuilder.invoke(c91685Zyb);
        C91682ZyY c91682ZyY = navOptions.LIZ;
        c91682ZyY.LJI = c91685Zyb.LIZ;
        c91682ZyY.LJII = c91685Zyb.LIZIZ;
        c91682ZyY.LJIIIIZZ = c91685Zyb.LIZJ;
        c91682ZyY.LJIIIZ = c91685Zyb.LIZLLL;
        if ((((C91720ZzA) iDqS174S0200000_31.l0) instanceof C92143a5z) && (LJFF = ((C91706Zyw) iDqS174S0200000_31.l1).LJFF()) != null) {
            InterfaceC1039145z LIZJ = C91718Zz8.LIZJ(LJFF);
            C91720ZzA c91720ZzA = (C91720ZzA) iDqS174S0200000_31.l0;
            Iterator it = LIZJ.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (o.LJ(it.next(), c91720ZzA)) {
                        break;
                    }
                } else {
                    C92143a5z LJII = ((C91706Zyw) iDqS174S0200000_31.l1).LJII();
                    int i = ((C91720ZzA) OJ4.LJJJJLI(OJ6.LJJIZ(LJII.LJIIZILJ(LJII.LJLL, true), C92406aAE.LJLIL))).LJLJJLL;
                    C92404aAC popUpToBuilder = C92404aAC.LJLIL;
                    o.LJIIIZ(popUpToBuilder, "popUpToBuilder");
                    navOptions.LIZJ = i;
                    C91705Zyv c91705Zyv = new C91705Zyv();
                    popUpToBuilder.invoke(c91705Zyv);
                    navOptions.LIZLLL = c91705Zyv.LIZ;
                    break;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS174S0200000_31 iDqS174S0200000_31, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<List<District>, C76800UCe> interfaceC88472Yns = ((AddressViewModel) iDqS174S0200000_31.l0).LJLJL.get((EnumC91763Zzr) iDqS174S0200000_31.l1);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS174S0200000_31 iDqS174S0200000_31, Object districts) {
        o.LJIIIZ(districts, "districts");
        InterfaceC35811ar<List<District>> interfaceC35811ar = ((C92351a9L) iDqS174S0200000_31.l0).LJIJI.get((EnumC91763Zzr) iDqS174S0200000_31.l1);
        if (interfaceC35811ar != null) {
            interfaceC35811ar.setValue(districts);
        }
        InterfaceC35811ar<C91941a2j> interfaceC35811ar2 = ((C92351a9L) iDqS174S0200000_31.l0).LJIJJLI.get((EnumC91763Zzr) iDqS174S0200000_31.l1);
        if (interfaceC35811ar2 != null) {
            interfaceC35811ar2.setValue(((C92351a9L) iDqS174S0200000_31.l0).LJIILJJIL((EnumC91763Zzr) iDqS174S0200000_31.l1));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        ((CheckoutActivity) iDqS174S0200000_31.l0).LLFZ().dispatch(new CheckoutAction.ClosePage((CheckoutActivity) iDqS174S0200000_31.l1, ((Boolean) obj).booleanValue()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        C93077aL3 oldState = (C93077aL3) obj;
        o.LJIIIZ(oldState, "oldState");
        if (!oldState.LJLJJI) {
            ((DetailViewModel) iDqS174S0200000_31.l0).setState(C92645aE5.LJLIL);
            XKX.LIZLLL(((DetailViewModel) iDqS174S0200000_31.l0).getAssemVMScope(), null, null, new C93076aL2((DetailViewModel) iDqS174S0200000_31.l0, (InterfaceC88471Ynr) iDqS174S0200000_31.l1, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((IDqS418S0100000_31) ((C92182a6c) ((InterfaceC91938a2g) iDqS174S0200000_31.l0)).LJFF).invoke(Boolean.valueOf(booleanValue));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDqS174S0200000_31.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(booleanValue));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        C92209a73 oldState = (C92209a73) obj;
        o.LJIIIZ(oldState, "oldState");
        if (!oldState.LJLJI) {
            ((BillHomeViewModel) iDqS174S0200000_31.l0).setState(C92746aFi.LJLIL);
            XKX.LIZLLL(((BillHomeViewModel) iDqS174S0200000_31.l0).getAssemVMScope(), null, null, new C93097aLN((BillHomeViewModel) iDqS174S0200000_31.l0, (InterfaceC88471Ynr) iDqS174S0200000_31.l1, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        ((C92145a61) iDqS174S0200000_31.l0).LJIIJJI("error_page", C92784aGK.LJLIL);
        ((CheckoutViewModel) iDqS174S0200000_31.l1).setErrorPageRetryFun(new IDqS178S0200000_31((C92145a61) iDqS174S0200000_31.l0, (WebView) obj, 14));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        ((PIViewModel) iDqS174S0200000_31.l0).webviewErrorHandler((WebView) obj, (C92145a61) iDqS174S0200000_31.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS174S0200000_31 iDqS174S0200000_31, Object it) {
        o.LJIIIZ(it, "it");
        ((C92283a8F) iDqS174S0200000_31.l0).LJFF();
        C92283a8F c92283a8F = (C92283a8F) iDqS174S0200000_31.l0;
        c92283a8F.getClass();
        c92283a8F.LJIIIIZZ(EnumC92041a4L.Change);
        C91706Zyw.LJIIL((C91706Zyw) iDqS174S0200000_31.l1, "select_pi", null, 6);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS174S0200000_31 iDqS174S0200000_31, Object it) {
        o.LJIIIZ(it, "it");
        ((C92283a8F) iDqS174S0200000_31.l0).LJFF();
        C92283a8F c92283a8F = (C92283a8F) iDqS174S0200000_31.l0;
        c92283a8F.getClass();
        c92283a8F.LJIIIIZZ(EnumC92041a4L.Change);
        C91706Zyw.LJIIL((C91706Zyw) iDqS174S0200000_31.l1, "select_pi", null, 6);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        EnumC91974a3G enumC91974a3G;
        C92227a7L setState = (C92227a7L) obj;
        o.LJIIIZ(setState, "$this$setState");
        RepaymentViewModel repaymentViewModel = (RepaymentViewModel) iDqS174S0200000_31.l0;
        String suggestAmount = ((RepaymentArg) iDqS174S0200000_31.l1).getSuggestAmount();
        RepaymentArg repaymentArg = (RepaymentArg) iDqS174S0200000_31.l1;
        if (suggestAmount.length() == 0) {
            suggestAmount = repaymentArg.getAmountDue();
        }
        repaymentViewModel.jv0(suggestAmount);
        EnumC91916a2K enumC91916a2K = EnumC91916a2K.SUCCESS;
        String amountDue = ((RepaymentArg) iDqS174S0200000_31.l1).getAmountDue();
        String totalDue = ((RepaymentArg) iDqS174S0200000_31.l1).getTotalDue();
        boolean isOverdue = ((RepaymentArg) iDqS174S0200000_31.l1).isOverdue();
        String suggestAmount2 = ((RepaymentArg) iDqS174S0200000_31.l1).getSuggestAmount();
        String minAmount = ((RepaymentArg) iDqS174S0200000_31.l1).getMinAmount();
        String currency = ((RepaymentArg) iDqS174S0200000_31.l1).getCurrency();
        long dueTimestamp = ((RepaymentArg) iDqS174S0200000_31.l1).getDueTimestamp();
        boolean inProgress = ((RepaymentArg) iDqS174S0200000_31.l1).getInProgress();
        String inProgressMsg = ((RepaymentArg) iDqS174S0200000_31.l1).getInProgressMsg();
        String inProgressScheme = ((RepaymentArg) iDqS174S0200000_31.l1).getInProgressScheme();
        if (o.LJ(((RepaymentArg) iDqS174S0200000_31.l1).getMinAmount(), ((RepaymentArg) iDqS174S0200000_31.l1).getTotalDue())) {
            enumC91974a3G = EnumC91974a3G.UNMODIFIED;
        } else {
            enumC91974a3G = setState.LJLILLLLZI;
        }
        return C92227a7L.L(setState, enumC91916a2K, enumC91974a3G, amountDue, totalDue, isOverdue, suggestAmount2, minAmount, currency, dueTimestamp, inProgress, inProgressMsg, inProgressScheme, null, false, null, 61440);
    }

    public static final Object invoke$2(IDqS174S0200000_31 iDqS174S0200000_31, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        C05P c05p = (C05P) iDqS174S0200000_31.l0;
        if (c05p != null) {
            c05p.hide();
        }
        ((C0Z5) iDqS174S0200000_31.l1).LIZIZ(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        C92253a7l oldState = (C92253a7l) obj;
        o.LJIIIZ(oldState, "oldState");
        if (!oldState.LJLJI) {
            ((com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel) iDqS174S0200000_31.l0).setState(C92895aI7.LJLIL);
            XKX.LIZLLL(((com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel) iDqS174S0200000_31.l0).getAssemVMScope(), null, null, new C93130aLu((com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel) iDqS174S0200000_31.l0, (InterfaceC88471Ynr) iDqS174S0200000_31.l1, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        return iDqS174S0200000_31.invoke$0(((Number) obj).intValue());
    }

    public static final Object invoke$22(IDqS174S0200000_31 iDqS174S0200000_31, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        C05P c05p = (C05P) iDqS174S0200000_31.l0;
        if (c05p != null) {
            c05p.hide();
        }
        ((C0Z5) iDqS174S0200000_31.l1).LIZIZ(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(IDqS174S0200000_31 iDqS174S0200000_31, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        return new C92268a80((C92270a82) iDqS174S0200000_31.l0, (NavBackStackEntry) iDqS174S0200000_31.l1);
    }

    public static final Object invoke$24(IDqS174S0200000_31 iDqS174S0200000_31, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final List list = (List) iDqS174S0200000_31.l1;
        final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) iDqS174S0200000_31.l0;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.a9k
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner noName_0, Lifecycle.Event event) {
                List this_PopulateVisibleList = list;
                NavBackStackEntry entry = navBackStackEntry;
                o.LJIIIZ(this_PopulateVisibleList, "$this_PopulateVisibleList");
                o.LJIIIZ(entry, "$entry");
                o.LJIIIZ(noName_0, "$noName_0");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_START && !this_PopulateVisibleList.contains(entry)) {
                    this_PopulateVisibleList.add(entry);
                }
                if (event == Lifecycle.Event.ON_STOP) {
                    this_PopulateVisibleList.remove(entry);
                }
            }
        };
        navBackStackEntry.LJLJLJ.addObserver(lifecycleEventObserver);
        return new C92272a84((NavBackStackEntry) iDqS174S0200000_31.l0, lifecycleEventObserver);
    }

    public static final Object invoke$25(IDqS174S0200000_31 iDqS174S0200000_31, Object it) {
        o.LJIIIZ(it, "it");
        ((PhoneNumberVM) iDqS174S0200000_31.l0).setState(new IDqS418S0100000_31((EnumC92023a43) iDqS174S0200000_31.l1, 97));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(IDqS174S0200000_31 iDqS174S0200000_31, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        C05P c05p = (C05P) iDqS174S0200000_31.l0;
        if (c05p != null) {
            c05p.hide();
        }
        ((C0Z5) iDqS174S0200000_31.l1).LIZIZ(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(IDqS174S0200000_31 iDqS174S0200000_31, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        String errorCode = ((PinRule) iDqS174S0200000_31.l0).getErrorCode();
        PinSetViewModel pinSetViewModel = (PinSetViewModel) iDqS174S0200000_31.l1;
        int i = pinSetViewModel.LJLIL + 1;
        pinSetViewModel.LJLIL = i;
        return new C92314a8k(new C92071a4p(false, errorCode, i));
    }

    public static final Object invoke$28(IDqS174S0200000_31 iDqS174S0200000_31, Object AnimatedContent) {
        o.LJIIIZ(AnimatedContent, "$this$AnimatedContent");
        return C06480Ng.LIZJ((AbstractC06580Nq) ((InterfaceC88472Yns) iDqS174S0200000_31.l0).invoke(AnimatedContent), (AbstractC06620Nu) ((InterfaceC88472Yns) iDqS174S0200000_31.l1).invoke(AnimatedContent));
    }

    public static final Object invoke$29(IDqS174S0200000_31 iDqS174S0200000_31, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final List list = (List) iDqS174S0200000_31.l1;
        final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) iDqS174S0200000_31.l0;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.a9l
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner noName_0, Lifecycle.Event event) {
                List this_PopulateVisibleList = list;
                NavBackStackEntry entry = navBackStackEntry;
                o.LJIIIZ(this_PopulateVisibleList, "$this_PopulateVisibleList");
                o.LJIIIZ(entry, "$entry");
                o.LJIIIZ(noName_0, "$noName_0");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_START && !this_PopulateVisibleList.contains(entry)) {
                    this_PopulateVisibleList.add(entry);
                }
                if (event == Lifecycle.Event.ON_STOP) {
                    this_PopulateVisibleList.remove(entry);
                }
            }
        };
        navBackStackEntry.LJLJLJ.addObserver(lifecycleEventObserver);
        return new C92317a8n((NavBackStackEntry) iDqS174S0200000_31.l0, lifecycleEventObserver);
    }

    public static final Object invoke$3(IDqS174S0200000_31 iDqS174S0200000_31, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        C05P c05p = (C05P) iDqS174S0200000_31.l0;
        if (c05p != null) {
            c05p.hide();
        }
        ((C0Z5) iDqS174S0200000_31.l1).LIZ(1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((DetailsFragment) iDqS174S0200000_31.l0, new IDqS418S0100000_31((C92213a77) iDqS174S0200000_31.l1, 11));
        assemble.wv0((DetailsFragment) iDqS174S0200000_31.l0, C92535aCJ.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        String str;
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        EnumC92072a4q enumC92072a4q = (EnumC92072a4q) iDqS174S0200000_31.l0;
        Bundle arguments = ((PinChangeFragment) iDqS174S0200000_31.l1).getArguments();
        if (arguments == null || (str = arguments.getString("previous_page_id")) == null) {
            str = "";
        }
        hierarchyData.LIZ = new C92291a8N(enumC92072a4q, str);
        hierarchyData.LIZIZ = "KEY_CHANGE_DATA";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PinConfirmFragment pinConfirmFragment = (PinConfirmFragment) iDqS174S0200000_31.l0;
        assemble.mv0(pinConfirmFragment, new IDqS174S0200000_31(pinConfirmFragment, (EnumC92072a4q) iDqS174S0200000_31.l1, 7));
        assemble.wv0((PinConfirmFragment) iDqS174S0200000_31.l0, C92623aDj.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        String str;
        String string;
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        Bundle arguments = ((PinConfirmFragment) iDqS174S0200000_31.l0).getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("KEY_FIRST_INPUT_PIN")) == null) {
            str = "";
        }
        EnumC92072a4q enumC92072a4q = (EnumC92072a4q) iDqS174S0200000_31.l1;
        Bundle arguments2 = ((PinConfirmFragment) iDqS174S0200000_31.l0).getArguments();
        if (arguments2 != null && (string = arguments2.getString("previous_page_id")) != null) {
            str2 = string;
        }
        hierarchyData.LIZ = new C92292a8O(str, enumC92072a4q, str2);
        hierarchyData.LIZIZ = "KEY_CONFIRM_DATA";
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        String str;
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        PinSetRouteArg vl = ((PinSetFragment) iDqS174S0200000_31.l0).vl();
        if (vl == null || (str = vl.getPreviousPageId()) == null) {
            str = "";
        }
        C92058a4c.LIZLLL("bnpl_pin_set", str, "continue", (String) ((C68322mC) iDqS174S0200000_31.l1).element);
        EditText bnpl_pin_input = (EditText) ((PinSetFragment) iDqS174S0200000_31.l0)._$_findCachedViewById(R.id.gb);
        o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
        C91928a2W.LIZ(bnpl_pin_input);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(IDqS174S0200000_31 iDqS174S0200000_31, Object obj) {
        String str;
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        PinSetRouteArg vl = ((PinSetFragment) iDqS174S0200000_31.l0).vl();
        if (vl == null || (str = vl.getPreviousPageId()) == null) {
            str = "";
        }
        C92058a4c.LIZLLL("bnpl_pin_set", str, "discard_changes", (String) ((C68322mC) iDqS174S0200000_31.l1).element);
        InterfaceC88472Yns<? super EnumC92073a4r, C76800UCe> interfaceC88472Yns = C92031a4B.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(EnumC92073a4r.CANCEL);
        }
        ActivityC45651qj mo49getActivity = ((PinSetFragment) iDqS174S0200000_31.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(C05P c05p, C0Z5 c0z5, int i) {
        super(1);
        this.$t = i;
        this.l0 = c05p;
        this.l1 = c0z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C1IC<NavBackStackEntry>, ? extends AbstractC06580Nq> interfaceC88472Yns2, InterfaceC88472Yns<? super C1IC<NavBackStackEntry>, ? extends AbstractC06620Nu> interfaceC88472Yns3) {
        super(1);
        this.$t = interfaceC88472Yns3;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(InterfaceC88472Yns interfaceC88472Yns, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(C91720ZzA c91720ZzA, C91706Zyw c91706Zyw, int i) {
        super(1);
        this.$t = i;
        this.l0 = c91720ZzA;
        this.l1 = c91706Zyw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(InterfaceC91938a2g interfaceC91938a2g, InterfaceC91938a2g<?> interfaceC91938a2g2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = interfaceC91938a2g;
        this.l1 = interfaceC91938a2g2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(EnumC92072a4q enumC92072a4q, PinChangeFragment pinChangeFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC92072a4q;
        this.l1 = pinChangeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(C92145a61 c92145a61, CheckoutViewModel checkoutViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c92145a61;
        this.l1 = checkoutViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(C92270a82 c92270a82, NavBackStackEntry navBackStackEntry, int i) {
        super(1);
        this.$t = i;
        this.l0 = c92270a82;
        this.l1 = navBackStackEntry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(C92283a8F c92283a8F, C91706Zyw c91706Zyw, int i) {
        super(1);
        this.$t = i;
        this.l0 = c92283a8F;
        this.l1 = c91706Zyw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(C92351a9L c92351a9L, EnumC91763Zzr enumC91763Zzr, int i) {
        super(1);
        this.$t = i;
        this.l0 = c92351a9L;
        this.l1 = enumC91763Zzr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2, List<NavBackStackEntry> list) {
        super(1);
        this.$t = list;
        this.l0 = navBackStackEntry;
        this.l1 = navBackStackEntry2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(AddressViewModel addressViewModel, EnumC91763Zzr enumC91763Zzr, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressViewModel;
        this.l1 = enumC91763Zzr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(CheckoutActivity checkoutActivity, CheckoutActivity checkoutActivity2, int i) {
        super(1);
        this.$t = i;
        this.l0 = checkoutActivity;
        this.l1 = checkoutActivity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(PIViewModel pIViewModel, C92145a61 c92145a61, int i) {
        super(1);
        this.$t = i;
        this.l0 = pIViewModel;
        this.l1 = c92145a61;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(DetailViewModel detailViewModel, DetailViewModel detailViewModel2, InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe> interfaceC88471Ynr) {
        super(1);
        this.$t = interfaceC88471Ynr;
        this.l0 = detailViewModel;
        this.l1 = detailViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(DetailsFragment detailsFragment, C92213a77 c92213a77, int i) {
        super(1);
        this.$t = i;
        this.l0 = detailsFragment;
        this.l1 = c92213a77;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(BillHomeViewModel billHomeViewModel, BillHomeViewModel billHomeViewModel2, InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe> interfaceC88471Ynr) {
        super(1);
        this.$t = interfaceC88471Ynr;
        this.l0 = billHomeViewModel;
        this.l1 = billHomeViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(RepaymentViewModel repaymentViewModel, RepaymentArg repaymentArg, int i) {
        super(1);
        this.$t = i;
        this.l0 = repaymentViewModel;
        this.l1 = repaymentArg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel repaymentViewModel, com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel repaymentViewModel2, InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe> interfaceC88471Ynr) {
        super(1);
        this.$t = interfaceC88471Ynr;
        this.l0 = repaymentViewModel;
        this.l1 = repaymentViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(PhoneNumberVM phoneNumberVM, EnumC92023a43 enumC92023a43, int i) {
        super(1);
        this.$t = i;
        this.l0 = phoneNumberVM;
        this.l1 = enumC92023a43;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(PinRule pinRule, PinSetViewModel pinSetViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinRule;
        this.l1 = pinSetViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS174S0200000_31(PinConfirmFragment pinConfirmFragment, EnumC92072a4q enumC92072a4q, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinConfirmFragment;
        this.l1 = enumC92072a4q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS174S0200000_31(PinSetFragment pinSetFragment, PinSetFragment pinSetFragment2, C68322mC<String> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = pinSetFragment;
        this.l1 = pinSetFragment2;
    }
}
