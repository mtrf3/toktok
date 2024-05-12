package kotlin.jvm.internal;

import X.ARH;
import X.ARI;
import X.ARN;
import X.ASQ;
import X.ASX;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C55096Ljo;
import X.C76800UCe;
import X.C86V;
import X.C91657Zy9;
import X.C91928a2W;
import X.C92031a4B;
import X.C92058a4c;
import X.C92069a4n;
import X.C92102a5K;
import X.C92209a73;
import X.EnumC92073a4r;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes20.dex */
public class IDqS16S1100000_31 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String LJFF = C86V.LJFF(R.string.p0r);
        o.LJIIIIZZ(LJFF, "getString(R.string.poiprecise_inapp_cta_btntwo)");
        buttonGroup.LJFF(LJFF, new IDqS16S1100000_31((PinChangeViewAssem) iDqS16S1100000_31.l1, iDqS16S1100000_31.s0, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C92058a4c.LIZLLL("bnpl_pin_change", ((PinChangeViewAssem) iDqS16S1100000_31.l1).A3().LJLILLLLZI, "cancel", iDqS16S1100000_31.s0);
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinChangeViewAssem) iDqS16S1100000_31.l1);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJ(R.string.p0r, new IDqS16S1100000_31((OtpFragment) iDqS16S1100000_31.l1, iDqS16S1100000_31.s0, 9));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        Fragment LJIIIZ;
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C92058a4c.LIZLLL("bnpl_pin_use", ((PinVerifyViewAssem) iDqS16S1100000_31.l1).A3().LJLJI, "OK", iDqS16S1100000_31.s0);
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("REJECT", "bnpl_pin_use", null);
        }
        int i = C92102a5K.LIZ[((PinVerifyViewAssem) iDqS16S1100000_31.l1).A3().LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2 && (LJIIIZ = C55096Ljo.LJIIIZ((PinVerifyViewAssem) iDqS16S1100000_31.l1)) != null) {
                ASQ.LJ(LJIIIZ, ASX.LIZ);
            }
        } else {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinVerifyViewAssem) iDqS16S1100000_31.l1);
            if (LJIIIIZZ != null) {
                LJIIIIZZ.finish();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String LJFF = C86V.LJFF(R.string.p0r);
        o.LJIIIIZZ(LJFF, "getString(R.string.poiprecise_inapp_cta_btntwo)");
        buttonGroup.LJFF(LJFF, new IDqS16S1100000_31((PinVerifyViewAssem) iDqS16S1100000_31.l1, iDqS16S1100000_31.s0, 11));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C92058a4c.LIZLLL("bnpl_pin_change", ((PinChangeViewAssem) iDqS16S1100000_31.l1).A3().LJLILLLLZI, "OK", iDqS16S1100000_31.s0);
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinChangeViewAssem) iDqS16S1100000_31.l1);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJ(R.string.js_, new IDqS16S1100000_31((PinSetViewAssem) iDqS16S1100000_31.l1, iDqS16S1100000_31.s0, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        String str;
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        Bundle arguments = ((PinConfirmFragment) iDqS16S1100000_31.l1).getArguments();
        if (arguments == null || (str = arguments.getString("previous_page_id")) == null) {
            str = "";
        }
        C92058a4c.LIZLLL("bnpl_pin_set", str, "continue", iDqS16S1100000_31.s0);
        EditText bnpl_pin_input = (EditText) ((PinConfirmFragment) iDqS16S1100000_31.l1)._$_findCachedViewById(R.id.gb);
        o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
        C91928a2W.LIZ(bnpl_pin_input);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        String str;
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        Bundle arguments = ((PinConfirmFragment) iDqS16S1100000_31.l1).getArguments();
        if (arguments == null || (str = arguments.getString("previous_page_id")) == null) {
            str = "";
        }
        C92058a4c.LIZLLL("bnpl_pin_set", str, "discard_changes", iDqS16S1100000_31.s0);
        Intent intent = new Intent();
        intent.putExtra("KEY_PIN_CONFIRM_RESULT", new C92069a4n(EnumC92073a4r.CANCEL, null, null, 6, null));
        ActivityC45651qj mo49getActivity = ((PinConfirmFragment) iDqS16S1100000_31.l1).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setResult(102, intent);
        }
        ActivityC45651qj mo49getActivity2 = ((PinConfirmFragment) iDqS16S1100000_31.l1).mo49getActivity();
        if (mo49getActivity2 != null) {
            mo49getActivity2.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C92058a4c.LIZLLL("bnpl_pin_set", ((PinSetViewAssem) iDqS16S1100000_31.l1).A3().LJLJI, "change_passcode", iDqS16S1100000_31.s0);
        ((TextView) ((PinSetViewAssem) iDqS16S1100000_31.l1)._$_findCachedViewById(R.id.gb)).setText("");
        EditText bnpl_pin_input = (EditText) ((PinSetViewAssem) iDqS16S1100000_31.l1)._$_findCachedViewById(R.id.gb);
        o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
        C91928a2W.LIZ(bnpl_pin_input);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) iDqS16S1100000_31.l1).getString(R.string.jp9);
        o.LJIIIIZZ(string, "context.getString(R.string.pipo_common_got_it)");
        actionGroup.LJII(string, new IDqS8S1000000_31(iDqS16S1100000_31.s0, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS16S1100000_31 iDqS16S1100000_31, Object obj) {
        String str;
        C92209a73 state = (C92209a73) obj;
        o.LJIIIZ(state, "state");
        if (!state.LJLJI && (str = iDqS16S1100000_31.s0) != null) {
            Context context = ((BillHomeAssem) iDqS16S1100000_31.l1).getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            C91657Zy9.LIZJ(context, str, true, false, false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS16S1100000_31 iDqS16S1100000_31, Object it) {
        o.LJIIIZ(it, "it");
        ((OtpFragment) iDqS16S1100000_31.l1).wl("REJECT", iDqS16S1100000_31.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(OtpFragment otpFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = otpFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(PinChangeViewAssem pinChangeViewAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinChangeViewAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(PinConfirmFragment pinConfirmFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinConfirmFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(PinSetViewAssem pinSetViewAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinSetViewAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(PinVerifyViewAssem pinVerifyViewAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinVerifyViewAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S1100000_31(String str, BillHomeAssem billHomeAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = billHomeAssem;
    }
}
