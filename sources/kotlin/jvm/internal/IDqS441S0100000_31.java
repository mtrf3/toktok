package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C09290Yb;
import X.C16880lQ;
import X.C212428Vi;
import X.C21660t8;
import X.C223338pd;
import X.C26021AJd;
import X.C26045AKb;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C91671ZyN;
import X.C91787a0F;
import X.C91925a2T;
import X.C91930a2Y;
import X.C92033a4D;
import X.C92058a4c;
import X.C92059a4d;
import X.C92061a4f;
import X.C92063a4h;
import X.C92065a4j;
import X.C92101a5J;
import X.C92287a8J;
import X.C92630aDq;
import X.EnumC91916a2K;
import X.EnumC92072a4q;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC35811ar;
import X.InterfaceC88473Ynt;
import X.InterfaceC91961a33;
import Y.IDCListenerS138S0100000_31;
import Y.IDRunnableS89S0100000_31;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.ProgressFragment;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* loaded from: classes20.dex */
public class IDqS441S0100000_31 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS441S0100000_31(InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar<Integer> interfaceC35811ar2) {
        super(3);
        this.$t = interfaceC35811ar2;
        this.l0 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(C26021AJd c26021AJd, int i) {
        super(3);
        this.$t = i;
        this.l0 = c26021AJd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(CheckoutViewModel checkoutViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = checkoutViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(BillHomeAssem billHomeAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = billHomeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(ProgressFragment progressFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = progressFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(PhoneNumberAssem phoneNumberAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = phoneNumberAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(PinChangeViewAssem pinChangeViewAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pinChangeViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(PinForgotViewAssem pinForgotViewAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS441S0100000_31(PinVerifyViewAssem pinVerifyViewAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pinVerifyViewAssem;
    }

    public final void invoke$0(UIAssem selectSubscribe, String amount, String currency) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(amount, "amount");
        o.LJIIIZ(currency, "currency");
        String string = selectSubscribe.getContainerView().getContext().getString(R.string.joo);
        o.LJIIIIZZ(string, "containerView.context.ge…ment_amount_hint_minimum)");
        C26021AJd c26021AJd = (C26021AJd) this.l0;
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{C91925a2T.LIZ(amount, currency)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c26021AJd.LJFF(LLLZ);
    }

    public static final Object invoke$0(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        UIAssem selectSubscribe = (UIAssem) obj;
        EnumC91916a2K status = (EnumC91916a2K) obj2;
        String str = (String) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        int i = C91787a0F.LIZ[status.ordinal()];
        View view6 = null;
        if (i != 1) {
            if (i != 2) {
                View containerView = selectSubscribe.getContainerView();
                if (containerView != null) {
                    view5 = containerView.findViewById(R.id.cq);
                } else {
                    view5 = null;
                }
                view5.setVisibility(0);
                View containerView2 = selectSubscribe.getContainerView();
                if (containerView2 != null) {
                    view6 = containerView2.findViewById(R.id.cr);
                }
                ((C73305Spp) view6).setVisibility(8);
            } else {
                ((BillHomeAssem) iDqS441S0100000_31.l0).C3();
                View containerView3 = selectSubscribe.getContainerView();
                if (containerView3 != null) {
                    view3 = containerView3.findViewById(R.id.cr);
                } else {
                    view3 = null;
                }
                C73306Spq c73306Spq = new C73306Spq();
                C91930a2Y.LIZIZ(c73306Spq, str, new IDqS422S0100000_31((BillHomeAssem) iDqS441S0100000_31.l0, 39));
                ((C73305Spp) view3).setStatus(c73306Spq);
                View containerView4 = selectSubscribe.getContainerView();
                if (containerView4 != null) {
                    view4 = containerView4.findViewById(R.id.cr);
                } else {
                    view4 = null;
                }
                ((C73305Spp) view4).setVisibility(0);
                View containerView5 = selectSubscribe.getContainerView();
                if (containerView5 != null) {
                    view6 = containerView5.findViewById(R.id.cq);
                }
                view6.setVisibility(8);
            }
        } else {
            ((BillHomeAssem) iDqS441S0100000_31.l0).C3();
            View containerView6 = selectSubscribe.getContainerView();
            if (containerView6 != null) {
                view = containerView6.findViewById(R.id.cq);
            } else {
                view = null;
            }
            view.setVisibility(8);
            View containerView7 = selectSubscribe.getContainerView();
            if (containerView7 != null) {
                view2 = containerView7.findViewById(R.id.cr);
            } else {
                view2 = null;
            }
            ((C73305Spp) view2).LJFF();
            View containerView8 = selectSubscribe.getContainerView();
            if (containerView8 != null) {
                view6 = containerView8.findViewById(R.id.cr);
            }
            ((C73305Spp) view6).setVisibility(0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        String statusInternal = (String) obj;
        o.LJIIIZ(statusInternal, "statusInternal");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        ((ProgressFragment) iDqS441S0100000_31.l0).Al(statusInternal, (String) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        View view;
        View view2;
        UIAssem selectSubscribe = (UIAssem) obj;
        EnumC91916a2K enumC91916a2K = (EnumC91916a2K) obj2;
        String str = (String) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (enumC91916a2K != null) {
            PinChangeViewAssem pinChangeViewAssem = (PinChangeViewAssem) iDqS441S0100000_31.l0;
            int i = C92063a4h.LIZ[enumC91916a2K.ordinal()];
            View view3 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        View containerView = selectSubscribe.getContainerView();
                        if (containerView != null) {
                            view2 = containerView.findViewById(R.id.gi);
                        } else {
                            view2 = null;
                        }
                        ((C73305Spp) view2).setVisibility(0);
                        View containerView2 = selectSubscribe.getContainerView();
                        if (containerView2 != null) {
                            view3 = containerView2.findViewById(R.id.gi);
                        }
                        C73306Spq c73306Spq = new C73306Spq();
                        C91930a2Y.LIZIZ(c73306Spq, str, new IDqS422S0100000_31(pinChangeViewAssem, 113));
                        ((C73305Spp) view3).setStatus(c73306Spq);
                    }
                } else {
                    ((TuxTextView) pinChangeViewAssem._$_findCachedViewById(R.id.gj)).LJJJ(32.0f);
                    pinChangeViewAssem._$_findCachedViewById(R.id.gj).setVisibility(0);
                    pinChangeViewAssem._$_findCachedViewById(R.id.gd).setVisibility(0);
                    pinChangeViewAssem._$_findCachedViewById(R.id.gb).setVisibility(0);
                    pinChangeViewAssem._$_findCachedViewById(R.id.fu).setVisibility(0);
                    ((TextView) pinChangeViewAssem._$_findCachedViewById(R.id.gj)).setText(R.string.jrp);
                    ((TextView) pinChangeViewAssem._$_findCachedViewById(R.id.gd)).setText(R.string.jrk);
                    ((C92630aDq) pinChangeViewAssem._$_findCachedViewById(R.id.gb)).setInputCallback(new C92287a8J(pinChangeViewAssem));
                    ((TextView) pinChangeViewAssem._$_findCachedViewById(R.id.fu)).setText(R.string.jrc);
                    C16880lQ.LJJJJI((TuxTextView) pinChangeViewAssem._$_findCachedViewById(R.id.fu), new IDCListenerS138S0100000_31(pinChangeViewAssem, 14));
                    pinChangeViewAssem._$_findCachedViewById(R.id.gb).post(new IDRunnableS89S0100000_31(pinChangeViewAssem, 5));
                    pinChangeViewAssem.LJLJJL = System.currentTimeMillis();
                    C92058a4c.LJFF(pinChangeViewAssem.LJLJJLL, "bnpl_pin_change", pinChangeViewAssem.A3().LJLILLLLZI);
                    View containerView3 = selectSubscribe.getContainerView();
                    if (containerView3 != null) {
                        view3 = containerView3.findViewById(R.id.gi);
                    }
                    ((C73305Spp) view3).setVisibility(8);
                }
            } else {
                View containerView4 = selectSubscribe.getContainerView();
                if (containerView4 != null) {
                    view = containerView4.findViewById(R.id.gi);
                } else {
                    view = null;
                }
                ((C73305Spp) view).setVisibility(0);
                View containerView5 = selectSubscribe.getContainerView();
                if (containerView5 != null) {
                    view3 = containerView5.findViewById(R.id.gi);
                }
                ((C73305Spp) view3).LJFF();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        View view;
        View view2;
        UIAssem selectSubscribe = (UIAssem) obj;
        EnumC91916a2K enumC91916a2K = (EnumC91916a2K) obj2;
        String str = (String) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (enumC91916a2K != null) {
            PinForgotViewAssem pinForgotViewAssem = (PinForgotViewAssem) iDqS441S0100000_31.l0;
            int i = C92065a4j.LIZ[enumC91916a2K.ordinal()];
            View view3 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        View containerView = selectSubscribe.getContainerView();
                        if (containerView != null) {
                            view2 = containerView.findViewById(R.id.gi);
                        } else {
                            view2 = null;
                        }
                        ((C73305Spp) view2).setVisibility(0);
                        View containerView2 = selectSubscribe.getContainerView();
                        if (containerView2 != null) {
                            view3 = containerView2.findViewById(R.id.gi);
                        }
                        C73306Spq c73306Spq = new C73306Spq();
                        C91930a2Y.LIZIZ(c73306Spq, str, new IDqS422S0100000_31(pinForgotViewAssem, 115));
                        ((C73305Spp) view3).setStatus(c73306Spq);
                    }
                } else {
                    View containerView3 = selectSubscribe.getContainerView();
                    if (containerView3 != null) {
                        view3 = containerView3.findViewById(R.id.gi);
                    }
                    ((C73305Spp) view3).setVisibility(8);
                }
            } else {
                View containerView4 = selectSubscribe.getContainerView();
                if (containerView4 != null) {
                    view = containerView4.findViewById(R.id.gi);
                } else {
                    view = null;
                }
                ((C73305Spp) view).setVisibility(0);
                View containerView5 = selectSubscribe.getContainerView();
                if (containerView5 != null) {
                    view3 = containerView5.findViewById(R.id.gi);
                }
                ((C73305Spp) view3).LJFF();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        UIAssem selectSubscribe = (UIAssem) obj;
        EnumC91916a2K enumC91916a2K = (EnumC91916a2K) obj2;
        String str = (String) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (enumC91916a2K != null) {
            PinVerifyViewAssem pinVerifyViewAssem = (PinVerifyViewAssem) iDqS441S0100000_31.l0;
            int i = C92101a5J.LIZ[enumC91916a2K.ordinal()];
            View view6 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        View containerView = selectSubscribe.getContainerView();
                        if (containerView != null) {
                            view4 = containerView.findViewById(R.id.gb);
                        } else {
                            view4 = null;
                        }
                        ((C92630aDq) view4).LJLJJLL = true;
                        View containerView2 = selectSubscribe.getContainerView();
                        if (containerView2 != null) {
                            view5 = containerView2.findViewById(R.id.gb);
                        } else {
                            view5 = null;
                        }
                        ((TextView) view5).setText("");
                        View containerView3 = selectSubscribe.getContainerView();
                        if (containerView3 != null) {
                            view6 = containerView3.findViewById(R.id.gc);
                        }
                        ((C223338pd) view6).setVisibility(8);
                        Fragment LIZLLL = C212428Vi.LIZLLL(selectSubscribe);
                        if (LIZLLL != null) {
                            C26045AKb c26045AKb = new C26045AKb(LIZLLL);
                            c26045AKb.LJIIIZ(str);
                            c26045AKb.LJIIJ();
                        }
                        C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinVerifyViewAssem.LJLJJI, "bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "current_pin", "UNKNOWN ERROR", "UNKNOWN ERROR");
                    }
                } else {
                    View containerView4 = selectSubscribe.getContainerView();
                    if (containerView4 != null) {
                        view3 = containerView4.findViewById(R.id.gc);
                    } else {
                        view3 = null;
                    }
                    ((C223338pd) view3).setVisibility(8);
                    View containerView5 = selectSubscribe.getContainerView();
                    if (containerView5 != null) {
                        view6 = containerView5.findViewById(R.id.gb);
                    }
                    ((C92630aDq) view6).LJLJJLL = true;
                }
            } else {
                View containerView6 = selectSubscribe.getContainerView();
                if (containerView6 != null) {
                    view = containerView6.findViewById(R.id.gc);
                } else {
                    view = null;
                }
                ((C223338pd) view).setVisibility(0);
                View containerView7 = selectSubscribe.getContainerView();
                if (containerView7 != null) {
                    view2 = containerView7.findViewById(R.id.gc);
                } else {
                    view2 = null;
                }
                ((C223338pd) view2).LIZIZ();
                View containerView8 = selectSubscribe.getContainerView();
                if (containerView8 != null) {
                    view6 = containerView8.findViewById(R.id.gb);
                }
                ((C92630aDq) view6).LJLJJLL = false;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        String str;
        Context context;
        String error = (String) obj;
        o.LJIIIZ(error, "error");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) iDqS441S0100000_31.l0;
        phoneNumberAssem.getClass();
        int hashCode = error.hashCode();
        if (hashCode != -1881380961) {
            if (hashCode != 2448401) {
                if (hashCode == 1980572282) {
                    str = "CANCEL";
                }
            } else if (error.equals("PASS") && (context = phoneNumberAssem.getContext()) != null) {
                EnumC92072a4q enumC92072a4q = EnumC92072a4q.REGISTER;
                C92059a4d.LIZ.getClass();
                C92033a4D.LIZIZ(context, enumC92072a4q, C92059a4d.LIZLLL, "bnpl_activate_otp", new IDqS418S0100000_31(phoneNumberAssem, 96));
            }
            return C76800UCe.LIZ;
        }
        str = "REJECT";
        error.equals(str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        String status = (String) obj;
        String str = (String) obj3;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        PinChangeViewAssem pinChangeViewAssem = (PinChangeViewAssem) iDqS441S0100000_31.l0;
        if (str == null) {
            str = "";
        }
        pinChangeViewAssem.E3(status, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS441S0100000_31 iDqS441S0100000_31, Object AnimatedVisibility, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        C21660t8.LIZ(((Number) ((InterfaceC35811ar) iDqS441S0100000_31.l0).getValue()).intValue() / 100.0f, 48, 8, C91671ZyN.LIZ(interfaceC24520xk).LIZ, 0L, interfaceC24520xk, C09290Yb.LJII(InterfaceC07790Sh.LJJJI));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        InterfaceC91961a33 method = (InterfaceC91961a33) obj;
        String str = (String) obj2;
        o.LJIIIZ(method, "method");
        CheckoutViewModel checkoutViewModel = (CheckoutViewModel) iDqS441S0100000_31.l0;
        if (str == null) {
            str = "";
        }
        checkoutViewModel.dispatch(new CheckoutAction.SelectPI(method, str, obj3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        InterfaceC91961a33 method = (InterfaceC91961a33) obj;
        String str = (String) obj2;
        o.LJIIIZ(method, "method");
        CheckoutViewModel checkoutViewModel = (CheckoutViewModel) iDqS441S0100000_31.l0;
        if (str == null) {
            str = "";
        }
        checkoutViewModel.dispatch(new CheckoutAction.SelectPI(method, str, obj3));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        iDqS441S0100000_31.invoke$0((UIAssem) obj, (String) obj2, (String) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        String status = (String) obj;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        ((ProgressFragment) iDqS441S0100000_31.l0).Al(status, (String) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS441S0100000_31 iDqS441S0100000_31, Object obj, Object obj2, Object obj3) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        UIAssem selectSubscribe = (UIAssem) obj;
        EnumC91916a2K enumC91916a2K = (EnumC91916a2K) obj2;
        String str = (String) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (enumC91916a2K != null) {
            PinChangeViewAssem pinChangeViewAssem = (PinChangeViewAssem) iDqS441S0100000_31.l0;
            int i = C92061a4f.LIZ[enumC91916a2K.ordinal()];
            View view6 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        View containerView = selectSubscribe.getContainerView();
                        if (containerView != null) {
                            view4 = containerView.findViewById(R.id.gc);
                        } else {
                            view4 = null;
                        }
                        ((C223338pd) view4).setVisibility(8);
                        Fragment LIZLLL = C212428Vi.LIZLLL(selectSubscribe);
                        if (LIZLLL != null) {
                            C26045AKb c26045AKb = new C26045AKb(LIZLLL);
                            c26045AKb.LJIIIZ(str);
                            c26045AKb.LJIIJ();
                        }
                        View containerView2 = selectSubscribe.getContainerView();
                        if (containerView2 != null) {
                            view5 = containerView2.findViewById(R.id.gb);
                        } else {
                            view5 = null;
                        }
                        ((C92630aDq) view5).LJLJJLL = true;
                        View containerView3 = selectSubscribe.getContainerView();
                        if (containerView3 != null) {
                            view6 = containerView3.findViewById(R.id.gb);
                        }
                        ((TextView) view6).setText("");
                        C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinChangeViewAssem.LJLJJL, "bnpl_pin_change", pinChangeViewAssem.A3().LJLILLLLZI, "current_pin", "UNKNOWN ERROR", "UNKNOWN ERROR");
                    }
                } else {
                    View containerView4 = selectSubscribe.getContainerView();
                    if (containerView4 != null) {
                        view3 = containerView4.findViewById(R.id.gc);
                    } else {
                        view3 = null;
                    }
                    ((C223338pd) view3).setVisibility(8);
                    View containerView5 = selectSubscribe.getContainerView();
                    if (containerView5 != null) {
                        view6 = containerView5.findViewById(R.id.gb);
                    }
                    ((C92630aDq) view6).LJLJJLL = true;
                }
            } else {
                View containerView6 = selectSubscribe.getContainerView();
                if (containerView6 != null) {
                    view = containerView6.findViewById(R.id.gc);
                } else {
                    view = null;
                }
                ((C223338pd) view).setVisibility(0);
                View containerView7 = selectSubscribe.getContainerView();
                if (containerView7 != null) {
                    view2 = containerView7.findViewById(R.id.gc);
                } else {
                    view2 = null;
                }
                ((C223338pd) view2).LIZIZ();
                View containerView8 = selectSubscribe.getContainerView();
                if (containerView8 != null) {
                    view6 = containerView8.findViewById(R.id.gb);
                }
                ((C92630aDq) view6).LJLJJLL = false;
            }
        }
        return C76800UCe.LIZ;
    }
}
