package kotlin.jvm.internal;

import X.AI8;
import X.AIF;
import X.ASQ;
import X.ASX;
import X.AbstractC16010k1;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C07770Sf;
import X.C0SR;
import X.C110614Vt;
import X.C11860dK;
import X.C11890dN;
import X.C162476Zf;
import X.C16880lQ;
import X.C1M1;
import X.C1OH;
import X.C2068389v;
import X.C212428Vi;
import X.C252949wI;
import X.C26018AJa;
import X.C26048AKe;
import X.C26227ARb;
import X.C26338AVi;
import X.C32151Nz;
import X.C3AW;
import X.C42191l9;
import X.C55096Ljo;
import X.C61712OJw;
import X.C61713OJx;
import X.C72062SPy;
import X.C73306Spq;
import X.C76800UCe;
import X.C77123UOp;
import X.C79045V0n;
import X.C79081V1x;
import X.C86V;
import X.C8W0;
import X.C91671ZyN;
import X.C91730ZzK;
import X.C91783a0B;
import X.C91786a0E;
import X.C91790a0I;
import X.C91797a0P;
import X.C91813a0f;
import X.C91817a0j;
import X.C91834a10;
import X.C91891a1v;
import X.C91925a2T;
import X.C91928a2W;
import X.C91933a2b;
import X.C91934a2c;
import X.C92008a3o;
import X.C92031a4B;
import X.C92038a4I;
import X.C92058a4c;
import X.C92062a4g;
import X.C92068a4m;
import X.C92069a4n;
import X.C92071a4p;
import X.C92074a4s;
import X.C92100a5I;
import X.C92209a73;
import X.C92213a77;
import X.C92263a7v;
import X.C92290a8M;
import X.C92312a8i;
import X.C92630aDq;
import X.C92938aIo;
import X.C93077aL3;
import X.EnumC91907a2B;
import X.EnumC91909a2D;
import X.EnumC91916a2K;
import X.EnumC91918a2M;
import X.EnumC91920a2O;
import X.EnumC92073a4r;
import X.FMX;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.O6R;
import X.SY4;
import X.SY9;
import X.ViewOnClickListenerC91892a1w;
import X.X1D;
import Y.IDCListenerS138S0100000_31;
import Y.IDCListenerS85S0200000_31;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.g1;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailsAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentPoint;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.ss.android.ugc.aweme.bnpl.network.model.AlertMsg;
import com.ss.android.ugc.aweme.bnpl.network.model.StatusReason;
import com.ss.android.ugc.aweme.bnpl.utils.BillHomeArg;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes20.dex */
public class IDqS445S0100000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case 24:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(C26018AJa c26018AJa, int i) {
        super(2);
        this.$t = i;
        this.l0 = c26018AJa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS445S0100000_31(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(2);
        this.$t = interfaceC65784Pro2;
        this.l0 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(StoredMethods storedMethods, int i) {
        super(2);
        this.$t = i;
        this.l0 = storedMethods;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(DetailsAssem detailsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = detailsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(BillHomeAssem billHomeAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = billHomeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(RepaymentViewModel repaymentViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = repaymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(RepaymentRetAssem repaymentRetAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = repaymentRetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(LandingAssem landingAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = landingAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(PhoneNumberAssem phoneNumberAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = phoneNumberAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(BNPLEntryAssem bNPLEntryAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = bNPLEntryAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(PinChangeViewAssem pinChangeViewAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = pinChangeViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(PinForgotViewAssem pinForgotViewAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(PinConfirmViewAssem pinConfirmViewAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = pinConfirmViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(PinSetViewAssem pinSetViewAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = pinSetViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(PinVerifyViewAssem pinVerifyViewAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = pinVerifyViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS445S0100000_31(Object obj, int i) {
        super(2);
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.jl, interfaceC24520xk);
            C11890dN LIZIZ = C11860dK.LIZIZ(C91671ZyN.LIZ(interfaceC24520xk).LIZJ);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS445S0100000_31.l0;
            C0SR.LIZ(LJJIIZ, null, C07770Sf.LIZ(c1m1, g1.LIZ, new IDqS0S1210000_31(true, (String) null, (C1OH) new C42191l9(), interfaceC65784Pro, 0)), null, null, 0.0f, LIZIZ, interfaceC24520xk, 56, 56);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C91730ZzK.LIZJ((StoredMethods) iDqS445S0100000_31.l0, interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS445S0100000_31.l0;
            C92008a3o.LIZ(C07770Sf.LIZ(c1m1, g1.LIZ, new IDqS0S1210000_31(true, (String) null, (C1OH) new C42191l9(), interfaceC65784Pro, 3)), interfaceC24520xk, 0, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        String eventName = (String) obj;
        JSONObject params = (JSONObject) obj2;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        FMX.LJIILJJIL(eventName, params);
        String tag = ((RepaymentViewModel) iDqS445S0100000_31.l0).LJLIL;
        o.LJIIIIZZ(tag, "tag");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eventName: ");
        LIZ.append(eventName);
        LIZ.append(", params: ");
        LIZ.append(params);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        ((TextView) ((C26018AJa) iDqS445S0100000_31.l0).findViewById(R.id.cps)).setText(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        String str;
        String it = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        TuxTextView tuxTextView = (TuxTextView) iDqS445S0100000_31.l0;
        try {
            str = Currency.getInstance(it).getSymbol(C91925a2T.LIZIZ());
            o.LJIIIIZZ(str, "{\n            Currency.g…ol(getLocale())\n        }");
        } catch (Throwable th) {
            C16880lQ.LJLLJ(C91925a2T.class);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("failed to get currency symbol: ");
            LIZ.append(th);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            str = "";
        }
        tuxTextView.setText(str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C92038a4I.LIZ(iDqS445S0100000_31.l0, interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        View view;
        UIAssem selectSubscribe = (UIAssem) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.ev);
        } else {
            view = null;
        }
        ((C91797a0P) view).setOnScrollListener(new C92263a7v(booleanValue, (LandingAssem) iDqS445S0100000_31.l0, selectSubscribe));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C92038a4I.LIZ(iDqS445S0100000_31.l0, interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        long longValue = ((Number) obj).longValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((PinChangeViewAssem) iDqS445S0100000_31.l0).LJLJJLL = longValue;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        String str;
        View view;
        String str2;
        View view2;
        View view3;
        View view4;
        UIAssem selectSubscribe = (UIAssem) obj;
        C92074a4s c92074a4s = (C92074a4s) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92074a4s != null) {
            PinChangeViewAssem pinChangeViewAssem = (PinChangeViewAssem) iDqS445S0100000_31.l0;
            int i = C92062a4g.LIZ[c92074a4s.LIZ.ordinal()];
            String str3 = "";
            if (i != 1) {
                Object obj3 = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinChangeViewAssem.LJLJJL, "bnpl_pin_change", pinChangeViewAssem.A3().LJLILLLLZI, "current_pin", "UNKNOWN ERROR", "UNKNOWN ERROR");
                            View containerView = selectSubscribe.getContainerView();
                            if (containerView != null) {
                                view4 = containerView.findViewById(R.id.gb);
                            } else {
                                view4 = null;
                            }
                            ((C92630aDq) view4).LJLJJLL = true;
                            View containerView2 = selectSubscribe.getContainerView();
                            if (containerView2 != null) {
                                obj3 = containerView2.findViewById(R.id.gb);
                            }
                            ((TextView) obj3).setText("");
                        }
                    } else {
                        C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinChangeViewAssem.LJLJJL, "bnpl_pin_change", pinChangeViewAssem.A3().LJLILLLLZI, "current_pin", "REJECT", "REJECT");
                        View containerView3 = selectSubscribe.getContainerView();
                        if (containerView3 != null) {
                            view = containerView3.findViewById(R.id.fq);
                        } else {
                            view = null;
                        }
                        TextView textView = (TextView) view;
                        StatusReason statusReason = c92074a4s.LIZIZ;
                        if (statusReason != null) {
                            str2 = statusReason.reasonMsg;
                        } else {
                            str2 = null;
                        }
                        textView.setText(str2);
                        View containerView4 = selectSubscribe.getContainerView();
                        if (containerView4 != null) {
                            view2 = containerView4.findViewById(R.id.fq);
                        } else {
                            view2 = null;
                        }
                        view2.setVisibility(0);
                        View containerView5 = selectSubscribe.getContainerView();
                        if (containerView5 != null) {
                            view3 = containerView5.findViewById(R.id.gb);
                        } else {
                            view3 = null;
                        }
                        ((C92630aDq) view3).LJLJJLL = true;
                        View containerView6 = selectSubscribe.getContainerView();
                        if (containerView6 != null) {
                            obj3 = containerView6.findViewById(R.id.gb);
                        }
                        ((TextView) obj3).setText("");
                    }
                } else {
                    C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinChangeViewAssem.LJLJJL, "bnpl_pin_change", pinChangeViewAssem.A3().LJLILLLLZI, "current_pin", "REJECT", "REJECT");
                    AlertMsg alertMsg = c92074a4s.LIZJ;
                    if (alertMsg != null) {
                        str = alertMsg.title;
                    } else {
                        str = null;
                    }
                    String valueOf = String.valueOf(str);
                    AlertMsg alertMsg2 = c92074a4s.LIZJ;
                    if (alertMsg2 != null) {
                        obj3 = alertMsg2.content;
                    }
                    pinChangeViewAssem.F3(valueOf, String.valueOf(obj3), String.valueOf(c92074a4s.LJ));
                }
            } else {
                C92058a4c.LIZJ("bnpl_pin_change", pinChangeViewAssem.A3().LJLILLLLZI, "current_pin", System.currentTimeMillis(), System.currentTimeMillis() - pinChangeViewAssem.LJLJJL, null, 96);
                String str4 = c92074a4s.LIZLLL;
                if (str4 != null) {
                    str3 = str4;
                }
                KeyboardUtils.LIZIZ(pinChangeViewAssem._$_findCachedViewById(R.id.gb));
                ActivityC45651qj LIZ = C212428Vi.LIZ(pinChangeViewAssem);
                if (LIZ != null) {
                    C26048AKe c26048AKe = new C26048AKe(LIZ);
                    c26048AKe.LIZJ(R.raw.icon_tick);
                    c26048AKe.LIZIZ(1000L);
                    c26048AKe.LJI(C86V.LJFF(R.string.jrs));
                    c26048AKe.LIZLLL(-1);
                    c26048AKe.LJII();
                    pinChangeViewAssem.E3("PASS", str3);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        C92290a8M c92290a8M = (C92290a8M) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92290a8M != null) {
            ((PinChangeViewAssem) iDqS445S0100000_31.l0).F3(c92290a8M.LJLIL, c92290a8M.LJLILLLLZI, c92290a8M.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            ((BillHomeAssem) iDqS445S0100000_31.l0).x3().LJIILIIL(0, 0, "billHomeHelpTag");
        } else {
            ((BillHomeAssem) iDqS445S0100000_31.l0).x3().LJIIIIZZ("billHomeHelpTag");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        View view;
        UIAssem selectSubscribe = (UIAssem) obj;
        C92068a4m c92068a4m = (C92068a4m) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92068a4m != null) {
            ((PinChangeViewAssem) iDqS445S0100000_31.l0).LJLJJI = c92068a4m.LIZ;
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.gb);
            } else {
                view = null;
            }
            EditText bnpl_pin_input = (EditText) view;
            o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
            C91928a2W.LIZ(bnpl_pin_input);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        String str = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (str != null) {
            PinForgotViewAssem pinForgotViewAssem = (PinForgotViewAssem) iDqS445S0100000_31.l0;
            pinForgotViewAssem._$_findCachedViewById(R.id.fv).setVisibility(0);
            pinForgotViewAssem._$_findCachedViewById(R.id.fs).setVisibility(0);
            pinForgotViewAssem._$_findCachedViewById(R.id.fr).setVisibility(0);
            Context context = pinForgotViewAssem.getContext();
            if (context != null) {
                ((TuxTextView) pinForgotViewAssem._$_findCachedViewById(R.id.ga)).LJJJ(32.0f);
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.ga)).setText(R.string.jr5);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v.LIZ = R.raw.icon_headset;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                SY9 LIZ = c2068389v.LIZ(context);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.eg);
                c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                ((TuxIconView) pinForgotViewAssem._$_findCachedViewById(R.id.fx)).setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context)));
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.fz)).setText(R.string.jqy);
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.fy)).setText(R.string.jqx);
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v2.LIZ = R.raw.icon_lock_small;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                SY9 LIZ2 = c2068389v2.LIZ(context);
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                c110614Vt2.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eg);
                c110614Vt2.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                ((TuxIconView) pinForgotViewAssem._$_findCachedViewById(R.id.g1)).setImageDrawable(C26338AVi.LJIIJ(LIZ2, c110614Vt2.LIZ(context)));
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.g3)).setText(R.string.jr2);
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.g2)).setText(R.string.jr1);
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v3.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v3.LIZ = R.raw.icon_shield_tick;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                SY9 LIZ3 = c2068389v3.LIZ(context);
                C110614Vt c110614Vt3 = new C110614Vt();
                c110614Vt3.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                c110614Vt3.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                c110614Vt3.LIZIZ = Integer.valueOf(R.attr.eg);
                c110614Vt3.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                ((TuxIconView) pinForgotViewAssem._$_findCachedViewById(R.id.g5)).setImageDrawable(C26338AVi.LJIIJ(LIZ3, c110614Vt3.LIZ(context)));
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.g7)).setText(R.string.jr0);
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.g6)).setText(R.string.jqz);
                C2068389v c2068389v4 = new C2068389v();
                c2068389v4.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
                c2068389v4.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
                c2068389v4.LIZ = R.raw.icon_light_bulb_fill;
                c2068389v4.LJ = Integer.valueOf(R.attr.eg);
                ((TuxIconView) pinForgotViewAssem._$_findCachedViewById(R.id.g8)).setImageDrawable(c2068389v4.LIZ(context));
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.g_)).setText(C86V.LJFF(R.string.jr3));
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.g9)).setText(R.string.jr4);
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.fs)).setText(C86V.LJFF(R.string.jqv));
                pinForgotViewAssem._$_findCachedViewById(R.id.fs).getClass();
                C16880lQ.LJJIZ((SY4) pinForgotViewAssem._$_findCachedViewById(R.id.fs), new IDCListenerS85S0200000_31(pinForgotViewAssem, context, 8));
                ((TextView) pinForgotViewAssem._$_findCachedViewById(R.id.fr)).setText(C86V.LJFF(R.string.jqw));
                pinForgotViewAssem._$_findCachedViewById(R.id.fr).getClass();
                C16880lQ.LJJIZ((SY4) pinForgotViewAssem._$_findCachedViewById(R.id.fr), new IDCListenerS85S0200000_31(pinForgotViewAssem, context, 9));
                pinForgotViewAssem.LJLJJI = System.currentTimeMillis();
                C92058a4c.LJFF(pinForgotViewAssem.LJLJJL, "bnpl_pin_forgot", pinForgotViewAssem.v3().LJLIL);
            }
            String optString = new JSONObject(str).optString("ocs_url");
            o.LJIIIIZZ(optString, "JSONObject(verifyDetail).optString(\"ocs_url\")");
            pinForgotViewAssem.LJLJI = optString;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        UIAssem selectSubscribe = (UIAssem) obj;
        C92290a8M c92290a8M = (C92290a8M) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92290a8M != null) {
            PinForgotViewAssem pinForgotViewAssem = (PinForgotViewAssem) iDqS445S0100000_31.l0;
            C92058a4c.LJ("bnpl_pin_forgot", pinForgotViewAssem.v3().LJLIL, "{1,OK}", c92290a8M.LJLJI);
            Context context = selectSubscribe.getContext();
            if (context != null) {
                C26227ARb LIZ = C3AW.LIZ(context);
                LIZ.LJFF(c92290a8M.LJLIL);
                LIZ.LJII = false;
                LIZ.LIZIZ(c92290a8M.LJLILLLLZI);
                C77123UOp.LJIILL(LIZ, new IDqS30S0300000_31(pinForgotViewAssem, c92290a8M, selectSubscribe, 10));
                LIZ.LJI().LIZLLL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        long longValue = ((Number) obj).longValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((PinForgotViewAssem) iDqS445S0100000_31.l0).LJLJJL = longValue;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        IBinder iBinder;
        Window window;
        View decorView;
        C8W0 selectSubscribe = (C8W0) obj;
        C92069a4n c92069a4n = (C92069a4n) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92069a4n != null) {
            PinConfirmViewAssem pinConfirmViewAssem = (PinConfirmViewAssem) iDqS445S0100000_31.l0;
            ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
            if (LIZ != null) {
                if (c92069a4n.getStatus() == EnumC92073a4r.SUCCESS) {
                    InputMethodManager inputMethodManager = pinConfirmViewAssem.LJLJJL;
                    if (inputMethodManager != null) {
                        ActivityC45651qj LIZ2 = C212428Vi.LIZ(selectSubscribe);
                        if (LIZ2 != null && (window = LIZ2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            iBinder = decorView.getWindowToken();
                        } else {
                            iBinder = null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                    }
                    C26048AKe c26048AKe = new C26048AKe(LIZ);
                    c26048AKe.LIZIZ(1000L);
                    c26048AKe.LJI(C86V.LJFF(R.string.jrs));
                    c26048AKe.LIZJ(R.raw.icon_tick);
                    c26048AKe.LIZLLL(-1);
                    c26048AKe.LJII();
                }
                Intent intent = new Intent();
                intent.putExtra("KEY_PIN_CONFIRM_RESULT", c92069a4n);
                LIZ.setResult(102, intent);
                LIZ.finish();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        String str;
        UIAssem selectSubscribe = (UIAssem) obj;
        C92071a4p c92071a4p = (C92071a4p) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92071a4p != null) {
            PinSetViewAssem pinSetViewAssem = (PinSetViewAssem) iDqS445S0100000_31.l0;
            String str2 = pinSetViewAssem.A3().LJLJI;
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis() - pinSetViewAssem.LJLJJL;
            String str3 = null;
            if (!c92071a4p.LIZ) {
                str3 = c92071a4p.LIZIZ;
                str = c92071a4p.LIZIZ;
            } else {
                str = null;
            }
            C92058a4c.LIZIZ(currentTimeMillis, currentTimeMillis2, "bnpl_pin_set", str2, "set_pin_first", str3, str);
            if (c92071a4p.LIZ) {
                SmartRoute buildFragmentRoute = SmartRouter.buildFragmentRoute(C212428Vi.LIZLLL(selectSubscribe), "//verify_center/confirm_pin");
                buildFragmentRoute.withParam("KEY_FIRST_INPUT_PIN", pinSetViewAssem.LJLJJI);
                buildFragmentRoute.withParam("KEY_SET_MODE", pinSetViewAssem.A3().LJLIL);
                buildFragmentRoute.withParam("previous_page_id", pinSetViewAssem.A3().LJLJI);
                buildFragmentRoute.open(101, new C92312a8i(pinSetViewAssem, selectSubscribe));
            } else {
                String LJFF = C86V.LJFF(R.string.js9);
                o.LJIIIIZZ(LJFF, "getString(R.string.pipo_wallet_set_pin_easily)");
                String LJFF2 = C86V.LJFF(R.string.jsa);
                o.LJIIIIZZ(LJFF2, "getString(R.string.pipo_…t_pin_easily_description)");
                pinSetViewAssem.C3(LJFF, LJFF2, String.valueOf(c92071a4p.LIZIZ));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        View view;
        String str;
        View view2;
        View view3;
        String str2;
        View view4;
        View view5;
        View view6;
        UIAssem selectSubscribe = (UIAssem) obj;
        C92074a4s c92074a4s = (C92074a4s) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c92074a4s != null) {
            PinVerifyViewAssem pinVerifyViewAssem = (PinVerifyViewAssem) iDqS445S0100000_31.l0;
            int i = C92100a5I.LIZ[c92074a4s.LIZ.ordinal()];
            String str3 = "";
            if (i != 1) {
                Object obj3 = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinVerifyViewAssem.LJLJJI, "bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "current_pin", "UNKNOWN ERROR", "UNKNOWN ERROR");
                            View containerView = selectSubscribe.getContainerView();
                            if (containerView != null) {
                                view6 = containerView.findViewById(R.id.gb);
                            } else {
                                view6 = null;
                            }
                            ((C92630aDq) view6).LJLJJLL = true;
                            View containerView2 = selectSubscribe.getContainerView();
                            if (containerView2 != null) {
                                obj3 = containerView2.findViewById(R.id.gb);
                            }
                            ((TextView) obj3).setText("");
                        }
                    } else {
                        C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinVerifyViewAssem.LJLJJI, "bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "current_pin", "PENDING", "PENDING");
                        View containerView3 = selectSubscribe.getContainerView();
                        if (containerView3 != null) {
                            view2 = containerView3.findViewById(R.id.fu);
                        } else {
                            view2 = null;
                        }
                        view2.setVisibility(0);
                        View containerView4 = selectSubscribe.getContainerView();
                        if (containerView4 != null) {
                            view3 = containerView4.findViewById(R.id.fq);
                        } else {
                            view3 = null;
                        }
                        TextView textView = (TextView) view3;
                        StatusReason statusReason = c92074a4s.LIZIZ;
                        if (statusReason != null) {
                            str2 = statusReason.reasonMsg;
                        } else {
                            str2 = null;
                        }
                        textView.setText(str2);
                        View containerView5 = selectSubscribe.getContainerView();
                        if (containerView5 != null) {
                            view4 = containerView5.findViewById(R.id.fq);
                        } else {
                            view4 = null;
                        }
                        view4.setVisibility(0);
                        View containerView6 = selectSubscribe.getContainerView();
                        if (containerView6 != null) {
                            view5 = containerView6.findViewById(R.id.gb);
                        } else {
                            view5 = null;
                        }
                        ((C92630aDq) view5).LJLJJLL = true;
                        View containerView7 = selectSubscribe.getContainerView();
                        if (containerView7 != null) {
                            obj3 = containerView7.findViewById(R.id.gb);
                        }
                        ((TextView) obj3).setText("");
                    }
                } else {
                    View containerView8 = selectSubscribe.getContainerView();
                    if (containerView8 != null) {
                        view = containerView8.findViewById(R.id.fu);
                    } else {
                        view = null;
                    }
                    view.setVisibility(0);
                    C92058a4c.LIZIZ(System.currentTimeMillis(), System.currentTimeMillis() - pinVerifyViewAssem.LJLJJI, "bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "current_pin", "REJECT", "REJECT");
                    AlertMsg alertMsg = c92074a4s.LIZJ;
                    if (alertMsg != null) {
                        str = alertMsg.title;
                    } else {
                        str = null;
                    }
                    String valueOf = String.valueOf(str);
                    AlertMsg alertMsg2 = c92074a4s.LIZJ;
                    if (alertMsg2 != null) {
                        obj3 = alertMsg2.content;
                    }
                    String valueOf2 = String.valueOf(obj3);
                    String valueOf3 = String.valueOf(c92074a4s.LJ);
                    C92058a4c.LJ("bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "{1,OK}", valueOf3);
                    KeyboardUtils.LIZIZ(pinVerifyViewAssem._$_findCachedViewById(R.id.gb));
                    Context context = pinVerifyViewAssem.getContext();
                    if (context != null) {
                        C26227ARb LIZ = C3AW.LIZ(context);
                        LIZ.LJFF(valueOf);
                        LIZ.LIZIZ(valueOf2);
                        LIZ.LJII = false;
                        C77123UOp.LJIILL(LIZ, new IDqS16S1100000_31(pinVerifyViewAssem, valueOf3, 12));
                        LIZ.LJI().LIZLLL();
                    }
                }
            } else {
                C92058a4c.LIZJ("bnpl_pin_use", pinVerifyViewAssem.A3().LJLJI, "current_pin", System.currentTimeMillis(), System.currentTimeMillis() - pinVerifyViewAssem.LJLJJI, null, 96);
                String str4 = c92074a4s.LIZLLL;
                if (str4 != null) {
                    str3 = str4;
                }
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(pinVerifyViewAssem);
                if (LIZ2 != null) {
                    C26048AKe c26048AKe = new C26048AKe(LIZ2);
                    c26048AKe.LIZJ(R.raw.icon_tick);
                    c26048AKe.LIZLLL(-1);
                    c26048AKe.LIZIZ(1000L);
                    c26048AKe.LJI(LIZ2.getString(R.string.jrs));
                    c26048AKe.LJII();
                }
                Fragment LIZLLL = C212428Vi.LIZLLL(pinVerifyViewAssem);
                if (LIZLLL != null) {
                    InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZ;
                    if (interfaceC88473Ynt != null) {
                        interfaceC88473Ynt.invoke("PASS", "bnpl_pin_use", str3);
                    }
                    int i2 = C91813a0f.LIZ[pinVerifyViewAssem.A3().LJLILLLLZI.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            KeyboardUtils.LIZIZ(pinVerifyViewAssem._$_findCachedViewById(R.id.gb));
                            ASQ.LJ(LIZLLL, ASX.LIZ);
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        ActivityC45651qj LIZ3 = C212428Vi.LIZ(pinVerifyViewAssem);
                        if (LIZ3 != null) {
                            LIZ3.finish();
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS445S0100000_31 iDqS445S0100000_31, Object subscribe, Object obj) {
        int i;
        String string;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        AttributeSet attributeSet;
        String str;
        int i4;
        int i5;
        Boolean bool;
        int i6;
        View LJI;
        View LJI2;
        C92209a73 state = (C92209a73) obj;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(state, "state");
        if (state.LJLIL == EnumC91916a2K.SUCCESS) {
            BillHomeAssem billHomeAssem = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem.getClass();
            boolean z3 = true;
            if (state.LJLLL.length() > 0 && (LJI2 = billHomeAssem.x3().LJI("billHomeHelpTag")) != null) {
                C16880lQ.LJIIJ(new IDCListenerS138S0100000_31(billHomeAssem, 3), LJI2);
            }
            if (state.LJLLJ.length() > 0 && (LJI = billHomeAssem.x3().LJI("billHomeSettingTag")) != null) {
                C16880lQ.LJIIJ(new IDCListenerS85S0200000_31(billHomeAssem, state, 3), LJI);
            }
            View LJI3 = billHomeAssem.x3().LJI("billHomeBackTag");
            if (LJI3 != null) {
                C16880lQ.LJIIJ(new IDCListenerS138S0100000_31(billHomeAssem, 4), LJI3);
            }
            if (state.LJLJJI != EnumC91920a2O.USER_NORMAL && C91891a1v.LIZLLL < 50 && state.LJLIL != EnumC91916a2K.LOADING) {
                Iterator it = ((List) BillHomeAssem.LJLJJLL.getValue()).iterator();
                while (it.hasNext()) {
                    View LJI4 = billHomeAssem.x3().LJI(it.next());
                    if (LJI4 != null) {
                        ((TuxIconView) LJI4).setTintColorRes(R.attr.dj);
                    }
                }
                ActivityC45651qj LIZ = C212428Vi.LIZ(billHomeAssem);
                if (LIZ != null) {
                    C61713OJx LIZJ = C61712OJw.LIZJ(LIZ);
                    LIZJ.LIZ(true);
                    LIZJ.LIZIZ.LJIIJ(false);
                    LIZJ.LIZJ();
                }
            } else {
                billHomeAssem.C3();
            }
            BillHomeAssem billHomeAssem2 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem2.getClass();
            EnumC91920a2O enumC91920a2O = state.LJLJJI;
            EnumC91920a2O enumC91920a2O2 = EnumC91920a2O.USER_NORMAL;
            if (enumC91920a2O != enumC91920a2O2) {
                Context context = billHomeAssem2.getContext();
                if (context != null) {
                    bool = Boolean.valueOf(AnonymousClass636.LJIILJJIL(context));
                } else {
                    bool = null;
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    i6 = R.drawable.hy;
                } else {
                    i6 = R.drawable.hz;
                }
                Object value = billHomeAssem2.LJLJI.getValue();
                o.LJIIIIZZ(value, "<get-topBgImageView>(...)");
                ((ImageView) value).setImageResource(i6);
            } else {
                Object value2 = billHomeAssem2.LJLJI.getValue();
                o.LJIIIIZZ(value2, "<get-topBgImageView>(...)");
                ((ImageView) value2).setImageResource(R.drawable.hv);
            }
            BillHomeAssem billHomeAssem3 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem3.getClass();
            EnumC91918a2M enumC91918a2M = state.LJLJJL;
            EnumC91918a2M enumC91918a2M2 = EnumC91918a2M.BILL_USER_NEW;
            if (enumC91918a2M == enumC91918a2M2 && state.LJLJJI != EnumC91920a2O.USER_FREEZE) {
                i = R.string.jmw;
            } else {
                i = R.string.jp6;
            }
            ((TextView) billHomeAssem3._$_findCachedViewById(R.id.c5)).setText(billHomeAssem3.getContainerView().getContext().getString(i));
            BillHomeAssem billHomeAssem4 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem4.getClass();
            int i7 = C91786a0E.LIZ[state.LJLJJL.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            billHomeAssem4.v3(state);
                        }
                    } else {
                        ((TuxTextView) billHomeAssem4._$_findCachedViewById(R.id.e7)).LJJJ(44.0f);
                        ((TextView) billHomeAssem4._$_findCachedViewById(R.id.e7)).setText(billHomeAssem4.getContainerView().getContext().getString(R.string.jpk));
                        ((ImageView) billHomeAssem4._$_findCachedViewById(R.id.e8)).setVisibility(8);
                    }
                } else {
                    billHomeAssem4.v3(state);
                }
            } else if (state.LJLJJI == EnumC91920a2O.USER_FREEZE) {
                billHomeAssem4.v3(state);
            } else {
                String string2 = billHomeAssem4.getContainerView().getContext().getString(R.string.jmx);
                o.LJIIIIZZ(string2, "containerView.context.ge…ncard_welcome_desription)");
                ((TextView) billHomeAssem4._$_findCachedViewById(R.id.e7)).setText(string2);
                ((ImageView) billHomeAssem4._$_findCachedViewById(R.id.e8)).setVisibility(0);
                ((TuxTextView) billHomeAssem4._$_findCachedViewById(R.id.e7)).LJJJ(32.0f);
            }
            EnumC91920a2O enumC91920a2O3 = state.LJLJJI;
            EnumC91920a2O enumC91920a2O4 = EnumC91920a2O.USER_OVERDUE;
            if (enumC91920a2O3 == enumC91920a2O4) {
                ((TuxTextView) billHomeAssem4._$_findCachedViewById(R.id.e7)).setTextColorRes(R.attr.e7);
            } else {
                ((TuxTextView) billHomeAssem4._$_findCachedViewById(R.id.e7)).setTextColorRes(R.attr.go);
            }
            BillHomeAssem billHomeAssem5 = (BillHomeAssem) iDqS445S0100000_31.l0;
            Context context2 = billHomeAssem5.getContainerView().getContext();
            if (state.LJLJJI == enumC91920a2O4) {
                Object[] objArr = new Object[1];
                Integer num = state.LJLJLJ;
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 1;
                }
                objArr[0] = String.valueOf(i4);
                String string3 = context2.getString(R.string.jmv, objArr);
                o.LJIIIIZZ(string3, "context.getString(\n     …ring(),\n                )");
                SpannableString spannableString = new SpannableString(string3);
                Integer LJI5 = C79045V0n.LJI(R.attr.e7, context2);
                if (LJI5 != null) {
                    i5 = LJI5.intValue();
                } else {
                    i5 = 0;
                }
                spannableString.setSpan(new ForegroundColorSpan(i5), 0, string3.length(), 18);
                ((TextView) billHomeAssem5._$_findCachedViewById(R.id.cj)).setText(spannableString);
            } else {
                if (state.LJLJJL == enumC91918a2M2) {
                    string = billHomeAssem5.getContainerView().getContext().getString(R.string.jp8);
                    o.LJIIIIZZ(string, "containerView.context.ge…tring.pipo_common_due_on)");
                } else {
                    string = billHomeAssem5.getContainerView().getContext().getString(R.string.jp8);
                    o.LJIIIIZZ(string, "containerView.context.ge…tring.pipo_common_due_on)");
                }
                String LIZIZ = C91933a2b.LIZIZ(Long.valueOf(state.LJLJL));
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{LIZIZ}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                int length = (LLLZ.length() - LIZIZ.length()) - 1;
                SpannableString spannableString2 = new SpannableString(LLLZ);
                o.LJIIIIZZ(context2, "context");
                Integer LJI6 = C79045V0n.LJI(R.attr.gx, context2);
                if (LJI6 != null) {
                    i2 = LJI6.intValue();
                } else {
                    i2 = 0;
                }
                spannableString2.setSpan(new ForegroundColorSpan(i2), 0, length, 18);
                Integer LJI7 = C79045V0n.LJI(R.attr.go, context2);
                if (LJI7 != null) {
                    i3 = LJI7.intValue();
                } else {
                    i3 = 0;
                }
                spannableString2.setSpan(new ForegroundColorSpan(i3), length + 1, LLLZ.length(), 18);
                ((TextView) billHomeAssem5._$_findCachedViewById(R.id.cj)).setText(spannableString2);
            }
            BillHomeAssem billHomeAssem6 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem6.getClass();
            EnumC91920a2O enumC91920a2O5 = state.LJLJJI;
            if (enumC91920a2O5 == enumC91920a2O4) {
                billHomeAssem6._$_findCachedViewById(R.id.ea).setVisibility(8);
            } else {
                EnumC91918a2M enumC91918a2M3 = state.LJLJJL;
                if (enumC91918a2M3 == EnumC91918a2M.BILL_USER_NORMAL_UNREPAID || (enumC91920a2O5 == EnumC91920a2O.USER_FREEZE && enumC91918a2M3 != enumC91918a2M2)) {
                    billHomeAssem6._$_findCachedViewById(R.id.ea).setVisibility(0);
                    Context context3 = billHomeAssem6.getContainerView().getContext();
                    TextView textView = (TextView) billHomeAssem6._$_findCachedViewById(R.id.ea);
                    C72062SPy c72062SPy = new C72062SPy();
                    c72062SPy.LIZJ(R.string.jpa);
                    c72062SPy.LIZ = true;
                    c72062SPy.LIZIZ(51);
                    c72062SPy.LJ(0);
                    o.LJIIIIZZ(context3, "context");
                    textView.setText(c72062SPy.LIZ(context3));
                    C16880lQ.LJJJJI((TuxTextView) billHomeAssem6._$_findCachedViewById(R.id.ea), new ViewOnClickListenerC91892a1w(context3, state, billHomeAssem6));
                } else {
                    billHomeAssem6._$_findCachedViewById(R.id.ea).setVisibility(8);
                }
            }
            BillHomeAssem billHomeAssem7 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem7.getClass();
            EnumC91920a2O enumC91920a2O6 = state.LJLJJI;
            if (enumC91920a2O6 == enumC91920a2O4 || enumC91920a2O6 == EnumC91920a2O.USER_FREEZE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                billHomeAssem7._$_findCachedViewById(R.id.ch).setVisibility(8);
            } else {
                billHomeAssem7._$_findCachedViewById(R.id.ch).setVisibility(0);
                ((TextView) billHomeAssem7._$_findCachedViewById(R.id.hu)).setText(state.LJLL);
                ((TextView) billHomeAssem7._$_findCachedViewById(R.id.dp)).setText(state.LJLLI);
            }
            BillHomeAssem billHomeAssem8 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem8.getClass();
            Notice notice = state.LJLLILLLL;
            if (notice != null) {
                ((C91817a0j) billHomeAssem8._$_findCachedViewById(R.id.co)).LIZ(notice);
                billHomeAssem8._$_findCachedViewById(R.id.co).setVisibility(0);
            }
            if (state.LJLLILLLL == null) {
                billHomeAssem8._$_findCachedViewById(R.id.co).setVisibility(8);
            }
            BillHomeAssem billHomeAssem9 = (BillHomeAssem) iDqS445S0100000_31.l0;
            billHomeAssem9._$_findCachedViewById(R.id.cp).getClass();
            C16880lQ.LJJIZ((SY4) billHomeAssem9._$_findCachedViewById(R.id.cp), new IDCListenerS138S0100000_31(billHomeAssem9, 5));
            BillHomeAssem billHomeAssem10 = (BillHomeAssem) iDqS445S0100000_31.l0;
            Context context4 = billHomeAssem10.getContainerView().getContext();
            AI8 ai8 = (AI8) billHomeAssem10._$_findCachedViewById(R.id.e5);
            o.LJIIIIZZ(context4, "context");
            AIF aif = new AIF(context4, null);
            aif.LJIILJJIL(new IDCListenerS85S0200000_31(billHomeAssem10, context4, 4));
            ai8.setAccessory(aif);
            AI8 ai82 = (AI8) billHomeAssem10._$_findCachedViewById(R.id.e_);
            RepaymentPoint repaymentPoint = state.LJLZ;
            if (repaymentPoint != null && repaymentPoint.showRedDot) {
                z2 = true;
            } else {
                z2 = false;
            }
            ai82.setShowAlertBadge(z2);
            RepaymentPoint repaymentPoint2 = state.LJLZ;
            if (repaymentPoint2 != null && (str = repaymentPoint2.description) != null && str.length() > 0) {
                ((AI8) billHomeAssem10._$_findCachedViewById(R.id.e_)).setSubtitle(state.LJLZ.description);
                attributeSet = null;
            } else {
                attributeSet = null;
                ((AI8) billHomeAssem10._$_findCachedViewById(R.id.e_)).setSubtitle(null);
            }
            AI8 ai83 = (AI8) billHomeAssem10._$_findCachedViewById(R.id.e_);
            AIF aif2 = new AIF(context4, attributeSet);
            aif2.LJIILJJIL(new IDCListenerS85S0200000_31(billHomeAssem10, state, 5));
            ai83.setAccessory(aif2);
            AI8 ai84 = (AI8) billHomeAssem10._$_findCachedViewById(R.id.e9);
            AIF aif3 = new AIF(context4, attributeSet);
            aif3.LJIILJJIL(new IDCListenerS85S0200000_31(billHomeAssem10, state, 6));
            ai84.setAccessory(aif3);
            ((BillHomeAssem) iDqS445S0100000_31.l0).getClass();
            C91891a1v.LIZ = state.LJLLL;
            if (state.LJLJJI != enumC91920a2O2) {
                z3 = false;
            }
            C91891a1v.LJ = z3;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS445S0100000_31 iDqS445S0100000_31, Object selectSubscribe, Object obj) {
        EnumC91916a2K it = (EnumC91916a2K) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        int i = C91790a0I.LIZ[it.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Object value = ((RepaymentRetAssem) iDqS445S0100000_31.l0).LJLJI.getValue();
                    o.LJIIIIZZ(value, "<get-contentContainer>(...)");
                    ((View) value).setVisibility(0);
                    ((RepaymentRetAssem) iDqS445S0100000_31.l0).x3().setVisibility(8);
                }
            } else {
                Object value2 = ((RepaymentRetAssem) iDqS445S0100000_31.l0).LJLJI.getValue();
                o.LJIIIIZZ(value2, "<get-contentContainer>(...)");
                ((View) value2).setVisibility(8);
                ((RepaymentRetAssem) iDqS445S0100000_31.l0).x3().setVisibility(0);
                ((RepaymentRetAssem) iDqS445S0100000_31.l0).x3().setStatus((C73306Spq) ((RepaymentRetAssem) iDqS445S0100000_31.l0).LJLJJI.getValue());
            }
        } else {
            Object value3 = ((RepaymentRetAssem) iDqS445S0100000_31.l0).LJLJI.getValue();
            o.LJIIIIZZ(value3, "<get-contentContainer>(...)");
            ((View) value3).setVisibility(8);
            ((RepaymentRetAssem) iDqS445S0100000_31.l0).x3().setVisibility(0);
            ((RepaymentRetAssem) iDqS445S0100000_31.l0).x3().LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        View view;
        UIAssem selectSubscribe = (UIAssem) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.fg);
            } else {
                view = null;
            }
            ((C252949wI) view).LIZ();
            PhoneNumberVM v3 = ((PhoneNumberAssem) iDqS445S0100000_31.l0).v3();
            v3.getClass();
            v3.withState(new C92938aIo(v3, false));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.IDqS445S0100000_31 r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS445S0100000_31.invoke$6(kotlin.jvm.internal.IDqS445S0100000_31, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(IDqS445S0100000_31 iDqS445S0100000_31, Object subscribe, Object obj) {
        boolean z;
        int i;
        int i2;
        int i3;
        Integer LJI;
        Integer LJI2;
        C93077aL3 state = (C93077aL3) obj;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(state, "state");
        if (state.LJLIL == EnumC91916a2K.SUCCESS) {
            DetailsAssem detailsAssem = (DetailsAssem) iDqS445S0100000_31.l0;
            detailsAssem.getClass();
            int i4 = C91783a0B.LIZIZ[state.LJLJI.ordinal()];
            int i5 = 4;
            boolean z2 = true;
            int i6 = 0;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i7 = C91783a0B.LIZ[state.LJLILLLLZI.ordinal()];
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setTuxFont(12);
                                ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(detailsAssem.getContainerView().getContext().getString(R.string.jpj));
                                ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(8);
                            }
                        } else {
                            ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).LJJJ(32.0f);
                            ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(C91934a2c.LIZIZ(state.LJLL));
                            ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(0);
                        }
                    } else {
                        ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).LJJJ(32.0f);
                        ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(C91934a2c.LIZIZ(state.LJLL));
                        ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(0);
                    }
                    detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(0);
                    ((TextView) detailsAssem._$_findCachedViewById(R.id.c9)).setText(state.LJLJLJ);
                    detailsAssem._$_findCachedViewById(R.id.cb).setVisibility(8);
                }
            } else {
                int i8 = C91783a0B.LIZ[state.LJLILLLLZI.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(0);
                                ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setTuxFont(13);
                                ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(detailsAssem.getContainerView().getContext().getString(R.string.jpj));
                                detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(0);
                                ((TextView) detailsAssem._$_findCachedViewById(R.id.c9)).setText(state.LJLJLJ);
                                detailsAssem._$_findCachedViewById(R.id.cb).setVisibility(8);
                                ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(8);
                            }
                        } else {
                            detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(0);
                            ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setTuxFont(13);
                            ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(detailsAssem.getContainerView().getContext().getString(R.string.jpk));
                            detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(0);
                            ((TextView) detailsAssem._$_findCachedViewById(R.id.c9)).setText(state.LJLJLJ);
                            detailsAssem._$_findCachedViewById(R.id.cb).setVisibility(8);
                            ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(8);
                        }
                    } else {
                        ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setTuxFont(13);
                        ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).LJJJ(32.0f);
                        ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setTuxFont(13);
                        ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(C91934a2c.LIZIZ(state.LJLL));
                        detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(0);
                        ((TextView) detailsAssem._$_findCachedViewById(R.id.c9)).setText(state.LJLJLJ);
                        ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(0);
                        detailsAssem._$_findCachedViewById(R.id.cb).setVisibility(8);
                    }
                } else {
                    ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setTuxFont(13);
                    ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).LJJJ(32.0f);
                    ((TextView) detailsAssem._$_findCachedViewById(R.id.c2)).setText(C91934a2c.LIZIZ(state.LJLL));
                    detailsAssem._$_findCachedViewById(R.id.c8).setVisibility(8);
                    detailsAssem._$_findCachedViewById(R.id.cb).setVisibility(0);
                    ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(0);
                    ((TextView) detailsAssem._$_findCachedViewById(R.id.cc)).setText(detailsAssem.getContainerView().getContext().getString(R.string.jmv, String.valueOf(state.LJLLILLLL)));
                }
            }
            if (state.LJLILLLLZI == EnumC91909a2D.NO_NEED_TO_PAY) {
                ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(8);
            } else {
                ((ImageView) detailsAssem._$_findCachedViewById(R.id.c3)).setVisibility(0);
                ((TextView) detailsAssem._$_findCachedViewById(R.id.dk)).setText(C91934a2c.LIZIZ(state.LJLJLLL));
                ((TextView) detailsAssem._$_findCachedViewById(R.id.dq)).setText(C91934a2c.LIZIZ(state.LJLLI));
            }
            ((TuxTextView) detailsAssem._$_findCachedViewById(R.id.c2)).setMinTextSize(13.0f);
            DetailsAssem detailsAssem2 = (DetailsAssem) iDqS445S0100000_31.l0;
            Context context = detailsAssem2.getContainerView().getContext();
            if (state.LJLJI == EnumC91907a2B.UNBILLED || state.LJLILLLLZI == EnumC91909a2D.OVERDUE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                detailsAssem2._$_findCachedViewById(R.id.e0).setVisibility(8);
            } else {
                if (state.LJLILLLLZI != EnumC91909a2D.OVERDUE) {
                    z2 = false;
                }
                detailsAssem2._$_findCachedViewById(R.id.e0).setVisibility(0);
                if (z2) {
                    i = R.string.jnv;
                    i2 = R.attr.dj;
                    i3 = R.attr.e7;
                } else {
                    i = R.string.jpm;
                    i2 = R.attr.gv;
                    i3 = R.attr.cg;
                }
                if (context != null && (LJI2 = C79045V0n.LJI(i3, context)) != null) {
                    ((TuxTag) detailsAssem2._$_findCachedViewById(R.id.e0)).setTagBackgroundColor(LJI2.intValue());
                }
                ((TextView) detailsAssem2._$_findCachedViewById(R.id.e0)).setText(detailsAssem2.getContainerView().getContext().getString(i));
                if (context != null && (LJI = C79045V0n.LJI(i2, context)) != null) {
                    ((TuxTag) detailsAssem2._$_findCachedViewById(R.id.e0)).setTagTextColor(LJI.intValue());
                }
            }
            DetailsAssem detailsAssem3 = (DetailsAssem) iDqS445S0100000_31.l0;
            detailsAssem3._$_findCachedViewById(R.id.ce).getClass();
            View _$_findCachedViewById = detailsAssem3._$_findCachedViewById(R.id.cf);
            Boolean bool = state.LJLJL;
            Boolean bool2 = Boolean.TRUE;
            if (!o.LJ(bool, bool2)) {
                i6 = 8;
            }
            _$_findCachedViewById.setVisibility(i6);
            if (o.LJ(state.LJLJL, bool2)) {
                ViewGroup.LayoutParams layoutParams = detailsAssem3.C3().getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(86));
            }
            C16880lQ.LJJIZ((SY4) detailsAssem3._$_findCachedViewById(R.id.ce), new IDCListenerS138S0100000_31(detailsAssem3, 2));
            ((SY4) detailsAssem3._$_findCachedViewById(R.id.ce)).setLoading(state.LJLJJI);
            View _$_findCachedViewById2 = detailsAssem3._$_findCachedViewById(R.id.ca);
            if (!state.LJLJJI) {
                i5 = 8;
            }
            _$_findCachedViewById2.setVisibility(i5);
            DetailsAssem detailsAssem4 = (DetailsAssem) iDqS445S0100000_31.l0;
            String string = detailsAssem4.getContainerView().getContext().getString(R.string.jpd);
            o.LJIIIIZZ(string, "containerView.context.ge…etail_actionsheet_period)");
            TextView textView = (TextView) detailsAssem4._$_findCachedViewById(R.id.dv);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(string);
            LIZ.append(": ");
            LIZ.append(state.LJLLJ);
            textView.setText(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        BillRepaymentPrepareInfo billRepaymentPrepareInfo = (BillRepaymentPrepareInfo) obj;
        String str = (String) obj2;
        if (billRepaymentPrepareInfo == null) {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((DetailsAssem) iDqS445S0100000_31.l0);
            if (LJIIIIZZ != null) {
                C91834a10.LJI(LJIIIIZZ, str);
            }
        } else if (!billRepaymentPrepareInfo.canRepay) {
            Context context = ((DetailsAssem) iDqS445S0100000_31.l0).getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            C91834a10.LJFF(context, ((C92213a77) ((DetailsAssem) iDqS445S0100000_31.l0).LJLJL.getValue()).LJLJI);
        } else {
            Context context2 = ((DetailsAssem) iDqS445S0100000_31.l0).getContainerView().getContext();
            o.LJIIIIZZ(context2, "containerView.context");
            String str2 = billRepaymentPrepareInfo.dueAmount;
            String str3 = billRepaymentPrepareInfo.totalDueAmount;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            boolean LJ = o.LJ(billRepaymentPrepareInfo.userStatus, EnumC91920a2O.USER_OVERDUE.getValue());
            String str5 = billRepaymentPrepareInfo.suggestAmount;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = billRepaymentPrepareInfo.minAmount;
            if (str6 == null) {
                str6 = "";
            }
            long j = billRepaymentPrepareInfo.dueDate;
            String str7 = billRepaymentPrepareInfo.currency;
            String str8 = billRepaymentPrepareInfo.inProgressMsg;
            if (str8 == null) {
                str8 = "";
            }
            boolean z = billRepaymentPrepareInfo.inProgress;
            String str9 = billRepaymentPrepareInfo.inProgressSchema;
            if (str9 != null) {
                str4 = str9;
            }
            C91834a10.LIZ(context2, new RepaymentArg("bnpl_statement_details", str2, str3, LJ, str5, str6, str7, j, z, str8, str4));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS445S0100000_31 iDqS445S0100000_31, Object obj, Object obj2) {
        String str;
        BillRepaymentPrepareInfo billRepaymentPrepareInfo = (BillRepaymentPrepareInfo) obj;
        String str2 = (String) obj2;
        if (billRepaymentPrepareInfo == null) {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((BillHomeAssem) iDqS445S0100000_31.l0);
            if (LJIIIIZZ != null) {
                C91834a10.LJI(LJIIIIZZ, str2);
            }
        } else if (!billRepaymentPrepareInfo.canRepay) {
            ((BillHomeAssem) iDqS445S0100000_31.l0).A3().hv0(Boolean.FALSE, "make_repayment");
            Context context = ((BillHomeAssem) iDqS445S0100000_31.l0).getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            BillHomeArg billHomeArg = (BillHomeArg) ((BillHomeAssem) iDqS445S0100000_31.l0).LJLILLLLZI.getValue();
            if (billHomeArg != null) {
                str = billHomeArg.getPreviousPageId();
            } else {
                str = null;
            }
            C91834a10.LJFF(context, str);
        } else {
            ((BillHomeAssem) iDqS445S0100000_31.l0).A3().hv0(Boolean.TRUE, "make_repayment");
            Context context2 = ((BillHomeAssem) iDqS445S0100000_31.l0).getContainerView().getContext();
            o.LJIIIIZZ(context2, "containerView.context");
            String str3 = billRepaymentPrepareInfo.dueAmount;
            String str4 = billRepaymentPrepareInfo.totalDueAmount;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            boolean LJ = o.LJ(billRepaymentPrepareInfo.userStatus, EnumC91920a2O.USER_OVERDUE.getValue());
            String str6 = billRepaymentPrepareInfo.suggestAmount;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = billRepaymentPrepareInfo.minAmount;
            if (str7 == null) {
                str7 = "";
            }
            long j = billRepaymentPrepareInfo.dueDate;
            String str8 = billRepaymentPrepareInfo.currency;
            String str9 = billRepaymentPrepareInfo.inProgressMsg;
            if (str9 == null) {
                str9 = "";
            }
            boolean z = billRepaymentPrepareInfo.inProgress;
            String str10 = billRepaymentPrepareInfo.inProgressSchema;
            if (str10 != null) {
                str5 = str10;
            }
            C91834a10.LIZ(context2, new RepaymentArg("bnpl_account_home", str3, str4, LJ, str6, str7, str8, j, z, str9, str5));
        }
        return C76800UCe.LIZ;
    }
}
