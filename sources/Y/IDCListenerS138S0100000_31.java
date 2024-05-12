package Y;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C16880lQ;
import X.C29S;
import X.C55096Ljo;
import X.C74090T5y;
import X.C76800UCe;
import X.C78613UtF;
import X.C86V;
import X.C91657Zy9;
import X.C91824a0q;
import X.C91834a10;
import X.C91924a2S;
import X.C92031a4B;
import X.C92033a4D;
import X.C92058a4c;
import X.C92069a4n;
import X.C92213a77;
import X.C92274a86;
import X.C92604aDQ;
import X.C92630aDq;
import X.C92937aIn;
import X.C93119aLj;
import X.C93136aM0;
import X.C93153aMH;
import X.EnumC92023a43;
import X.EnumC92072a4q;
import X.EnumC92073a4r;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.OSZ;
import X.SY4;
import X.XKX;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailsAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.ProgressFragment;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyForgotFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.StepUrlConfigs;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public class IDCListenerS138S0100000_31 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS138S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        Editable text = ((C92604aDQ) iDCListenerS138S0100000_31.l0).getText();
        if (text != null) {
            ((C92604aDQ) iDCListenerS138S0100000_31.l0).setSelection(text.length());
        }
        View.OnClickListener onClickListener = ((C92604aDQ) iDCListenerS138S0100000_31.l0).LLD;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void onClick$1(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        DetailViewModel A3 = ((DetailsAssem) iDCListenerS138S0100000_31.l0).A3();
        A3.getClass();
        String str = ((C92213a77) A3.LJLIL.getValue()).LJLJI;
        if (str == null) {
            str = "";
        }
        C91834a10.LIZIZ("amount_card", str);
        A3.withState(new IDqS418S0100000_31(A3, 60));
    }

    public static final void onClick$10(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        StepUrlConfigs urlConfigs;
        String customerService;
        ((ProgressFragment) iDCListenerS138S0100000_31.l0).onEventClick("customer_service");
        BNPLEntryData vl = ((ProgressFragment) iDCListenerS138S0100000_31.l0).vl();
        if (vl != null && (urlConfigs = vl.getUrlConfigs()) != null && (customerService = urlConfigs.getCustomerService()) != null) {
            ProgressFragment progressFragment = (ProgressFragment) iDCListenerS138S0100000_31.l0;
            Uri build = UriProtector.parse(customerService).buildUpon().appendQueryParameter("entrance", "bnpl_activation").appendQueryParameter("source", C91824a0q.LJFF).appendQueryParameter("previous_page_id", "bnpl_activate_step_progress").build();
            ActivityC45651qj requireActivity = progressFragment.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            String uri = build.toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            C91657Zy9.LIZJ(requireActivity, uri, true, false, false);
        }
    }

    public static final void onClick$11(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        ((LandingAssem) iDCListenerS138S0100000_31.l0).v3().onEventClick("activate");
        LandingAssemVM v3 = ((LandingAssem) iDCListenerS138S0100000_31.l0).v3();
        v3.getClass();
        v3.withState(new IDqS418S0100000_31(v3, 93));
    }

    public static final void onClick$12(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) iDCListenerS138S0100000_31.l0;
        if (phoneNumberAssem.LJLJJI || ((C74090T5y) phoneNumberAssem._$_findCachedViewById(R.id.ff)).getText().length() == 0) {
            return;
        }
        if (((PhoneNumberAssem) iDCListenerS138S0100000_31.l0).v3().getState().LJLIL == EnumC92023a43.EDIT) {
            ((PhoneNumberAssem) iDCListenerS138S0100000_31.l0).v3().LJLILLLLZI = ((C74090T5y) ((PhoneNumberAssem) iDCListenerS138S0100000_31.l0)._$_findCachedViewById(R.id.ff)).getText();
        }
        ((PhoneNumberAssem) iDCListenerS138S0100000_31.l0).v3().onEventClick("next");
        PhoneNumberVM v3 = ((PhoneNumberAssem) iDCListenerS138S0100000_31.l0).v3();
        v3.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_phone_number_fillin", "bnpl_activate_phone_number", ((C92274a86) v3.LJLIL.getValue()).LJLJI, C113554cx.LJJL(new OSZ("obj_id", "phone_number"), new OSZ("finish_timestamp", String.valueOf(currentTimeMillis)), new OSZ("duration", String.valueOf(currentTimeMillis - v3.LJLJJL))), 8);
        PhoneNumberVM v32 = ((PhoneNumberAssem) iDCListenerS138S0100000_31.l0).v3();
        v32.setState(C92937aIn.LJLIL);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(v32), C78613UtF.LIZJ, null, new C93136aM0(v32, null), 2);
    }

    public static final void onClick$13(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        ((OtpFragment) iDCListenerS138S0100000_31.l0).onEventClick("resend");
        ((OtpFragment) iDCListenerS138S0100000_31.l0).vl();
    }

    public static final void onClick$14(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinChangeViewAssem) iDCListenerS138S0100000_31.l0).LJLJJL, "bnpl_pin_change", ((PinChangeViewAssem) iDCListenerS138S0100000_31.l0).A3().LJLILLLLZI, "forgot_pin");
        Context context = ((PinChangeViewAssem) iDCListenerS138S0100000_31.l0).getContext();
        if (context != null) {
            PinChangeViewAssem pinChangeViewAssem = (PinChangeViewAssem) iDCListenerS138S0100000_31.l0;
            C92033a4D.LIZ(context, "bnpl_pin_change");
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(pinChangeViewAssem);
            if (LJIIIIZZ != null) {
                LJIIIIZZ.finish();
            }
        }
    }

    public static final void onClick$15(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        String str = ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).A3().LJLJI;
        long currentTimeMillis = System.currentTimeMillis();
        ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).getClass();
        C92058a4c.LIZ(currentTimeMillis - 0, "bnpl_pin_set", str, "next");
        ((C92630aDq) ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0)._$_findCachedViewById(R.id.gb)).LJLJJLL = false;
        if (!o.LJ(((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).A3().LJLIL, ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).LJLJJI)) {
            String str2 = ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).A3().LJLJI;
            long currentTimeMillis2 = System.currentTimeMillis();
            long currentTimeMillis3 = System.currentTimeMillis();
            ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).getClass();
            C92058a4c.LIZJ("bnpl_pin_set", str2, "confirm_pin_second", currentTimeMillis2, currentTimeMillis3 - 0, C86V.LJFF(R.string.js7), 32);
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0);
            if (LJIIIIZZ != null) {
                Intent intent = new Intent();
                intent.putExtra("KEY_PIN_CONFIRM_RESULT", new C92069a4n(EnumC92073a4r.ERROR, null, C86V.LJFF(R.string.js7), 2, null));
                LJIIIIZZ.setResult(102, intent);
                LJIIIIZZ.finish();
                return;
            }
            return;
        }
        String str3 = ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).A3().LJLJI;
        long currentTimeMillis4 = System.currentTimeMillis();
        long currentTimeMillis5 = System.currentTimeMillis();
        ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).getClass();
        C92058a4c.LIZJ("bnpl_pin_set", str3, "confirm_pin_second", currentTimeMillis4, currentTimeMillis5 - 0, null, 96);
        PinConfirmViewModel pinConfirmViewModel = (PinConfirmViewModel) ((PinConfirmViewAssem) iDCListenerS138S0100000_31.l0).LJLILLLLZI.getValue();
        PinConfirmViewAssem pinConfirmViewAssem = (PinConfirmViewAssem) iDCListenerS138S0100000_31.l0;
        String secondInputPin = pinConfirmViewAssem.LJLJJI;
        EnumC92072a4q setMode = pinConfirmViewAssem.A3().LJLILLLLZI;
        o.LJIIIZ(secondInputPin, "secondInputPin");
        o.LJIIIZ(setMode, "setMode");
        XKX.LIZLLL(pinConfirmViewModel.getAssemVMScope(), null, null, new C93153aMH(pinConfirmViewModel, secondInputPin, setMode, null), 3);
    }

    public static final void onClick$16(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("CANCEL", "bnpl_pin_use", null);
        }
        ASQ.LJ((PinVerifyForgotFragment) iDCListenerS138S0100000_31.l0, ASX.LIZ);
        Context requireContext = ((PinVerifyForgotFragment) iDCListenerS138S0100000_31.l0).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C92033a4D.LIZ(requireContext, "bnpl_pin_use");
    }

    public static final void onClick$17(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        ASQ.LJIIJ((PinVerifyForgotFragment) iDCListenerS138S0100000_31.l0);
    }

    public static final void onClick$18(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        Context context = ((PinVerifyViewAssem) iDCListenerS138S0100000_31.l0).getContext();
        if (context != null) {
            PinVerifyViewAssem pinVerifyViewAssem = (PinVerifyViewAssem) iDCListenerS138S0100000_31.l0;
            C92058a4c.LIZ(System.currentTimeMillis() - pinVerifyViewAssem.LJLJJI, "bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "forgot_pin");
            InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZ;
            if (interfaceC88473Ynt != null) {
                interfaceC88473Ynt.invoke("CANCEL", "bnpl_pin_use", null);
            }
            C92033a4D.LIZ(context, "bnpl_pin_use");
        }
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinVerifyViewAssem) iDCListenerS138S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
    }

    public static final void onClick$19(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinVerifyViewAssem) iDCListenerS138S0100000_31.l0).LJLJJI, "bnpl_pin_use", ((PinVerifyViewAssem) iDCListenerS138S0100000_31.l0).A3().LJLJI, "forgot_pin");
        KeyboardUtils.LIZIZ(((PinVerifyViewAssem) iDCListenerS138S0100000_31.l0)._$_findCachedViewById(R.id.gb));
        Fragment LJIIIZ = C55096Ljo.LJIIIZ((PinVerifyViewAssem) iDCListenerS138S0100000_31.l0);
        if (LJIIIZ != null) {
            ASQ.LJIILIIL(LJIIIZ, new PinVerifyForgotFragment(), true);
        }
    }

    public static final void onClick$2(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        DetailViewModel A3 = ((DetailsAssem) iDCListenerS138S0100000_31.l0).A3();
        IDqS445S0100000_31 iDqS445S0100000_31 = new IDqS445S0100000_31((DetailsAssem) iDCListenerS138S0100000_31.l0, 8);
        A3.getClass();
        String str = ((C92213a77) A3.LJLIL.getValue()).LJLJI;
        if (str == null) {
            str = "";
        }
        C91834a10.LIZIZ("repay", str);
        A3.withState(new IDqS174S0200000_31(A3, (DetailViewModel) iDqS445S0100000_31, (InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe>) 12));
    }

    public static final void onClick$3(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        C91834a10.LJ(C55096Ljo.LJIIIIZZ((BillHomeAssem) iDCListenerS138S0100000_31.l0), "bnpl_account_home");
        ((BillHomeAssem) iDCListenerS138S0100000_31.l0).A3().hv0(null, "get_help");
    }

    public static final void onClick$4(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((BillHomeAssem) iDCListenerS138S0100000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        ((BillHomeAssem) iDCListenerS138S0100000_31.l0).A3().hv0(null, "back");
    }

    public static final void onClick$5(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        BillHomeViewModel A3 = ((BillHomeAssem) iDCListenerS138S0100000_31.l0).A3();
        IDqS445S0100000_31 iDqS445S0100000_31 = new IDqS445S0100000_31((BillHomeAssem) iDCListenerS138S0100000_31.l0, 9);
        A3.getClass();
        A3.withState(new IDqS174S0200000_31(A3, (BillHomeViewModel) iDqS445S0100000_31, (InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe>) 14));
    }

    public static final void onClick$6(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        ((InterfaceC65784Pro) iDCListenerS138S0100000_31.l0).invoke();
    }

    public static final void onClick$7(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        InputMethodManager inputMethodManager;
        if (((SY4) ((RepaymentAssem) iDCListenerS138S0100000_31.l0)._$_findCachedViewById(R.id.cs)).LLI) {
            return;
        }
        ((RepaymentAssem) iDCListenerS138S0100000_31.l0).v3().iv0("continue");
        RepaymentViewModel v3 = ((RepaymentAssem) iDCListenerS138S0100000_31.l0).v3();
        v3.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_start_repayment_fillin", "bnpl_start_repayment", v3.LJLLILLLL, C113554cx.LJJL(new OSZ("obj_id", "repayment_amount_input"), new OSZ("repayment_amount", v3.LJLJI), new OSZ("click_timestamp", String.valueOf(v3.LJLL)), new OSZ("finish_timestamp", String.valueOf(currentTimeMillis)), new OSZ("duration", String.valueOf(currentTimeMillis - v3.LJLL))), 8);
        Object LLILL = C16880lQ.LLILL(((RepaymentAssem) iDCListenerS138S0100000_31.l0).getContainerView().getContext(), "input_method");
        if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
            inputMethodManager.hideSoftInputFromWindow(((RepaymentAssem) iDCListenerS138S0100000_31.l0).getContainerView().getWindowToken(), 0);
        }
        ((RepaymentAssem) iDCListenerS138S0100000_31.l0)._$_findCachedViewById(R.id.cx).findViewById(R.id.cps).clearFocus();
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((RepaymentAssem) iDCListenerS138S0100000_31.l0);
        if (LJIIIIZZ != null) {
            RepaymentViewModel v32 = ((RepaymentAssem) iDCListenerS138S0100000_31.l0).v3();
            v32.getClass();
            XKX.LIZLLL(v32.getAssemVMScope(), null, null, new C93119aLj(v32, (C29S) LJIIIIZZ, null), 3);
        }
    }

    public static final void onClick$8(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        Context context = ((RepaymentAssem) iDCListenerS138S0100000_31.l0).getContext();
        if (context != null) {
            RepaymentAssem repaymentAssem = (RepaymentAssem) iDCListenerS138S0100000_31.l0;
            repaymentAssem.withState(repaymentAssem.v3(), new IDqS418S0100000_31(context, 83));
        }
    }

    public static final void onClick$9(IDCListenerS138S0100000_31 iDCListenerS138S0100000_31, View view) {
        String verifyInfo;
        String verifyInfo2;
        ((ProgressFragment) iDCListenerS138S0100000_31.l0).onEventClick("continue");
        BNPLEntryData vl = ((ProgressFragment) iDCListenerS138S0100000_31.l0).vl();
        if (vl != null && (verifyInfo = vl.getVerifyInfo()) != null && verifyInfo.length() > 0) {
            BNPLEntryData vl2 = ((ProgressFragment) iDCListenerS138S0100000_31.l0).vl();
            if (vl2 != null && (verifyInfo2 = vl2.getVerifyInfo()) != null) {
                ProgressFragment progressFragment = (ProgressFragment) iDCListenerS138S0100000_31.l0;
                ActivityC45651qj requireActivity = progressFragment.requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                C92033a4D.LIZLLL(requireActivity, verifyInfo2, "bnpl_activate_step_progress", new IDqS441S0100000_31(progressFragment, 8));
                return;
            }
            return;
        }
        ((ProgressFragment) iDCListenerS138S0100000_31.l0).xl();
    }
}
