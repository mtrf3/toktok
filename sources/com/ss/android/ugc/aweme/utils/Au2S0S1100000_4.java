package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.B1K;
import X.B1R;
import X.B1S;
import X.B1T;
import X.B2M;
import X.C113554cx;
import X.C26018AJa;
import X.C26227ARb;
import X.C26802AfW;
import X.C26867AgZ;
import X.C27050AjW;
import X.C27498Aqk;
import X.C27949Ay1;
import X.C29S;
import X.C3AW;
import X.C40342FsQ;
import X.C40343FsR;
import X.C45804HyK;
import X.C51029K0z;
import X.C77125UOr;
import X.C85990Xow;
import X.InterfaceC65784Pro;
import X.OKG;
import X.OSZ;
import X.T5T;
import X.TAT;
import X.UC0;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary.OSPHybridBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.SparkNavigationFragment;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.subpage.USMessageEditDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.us.osp.subpage.USMessageEditPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S0S1100000_4 extends TAT {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        ActivityC45651qj activityC45651qj;
        if (view != null) {
            Context context = ((C27050AjW) au2S0S1100000_4.l1).getContext();
            o.LJIIIIZZ(context, "context");
            Object LJIILLIIL = C77125UOr.LJIILLIIL(context);
            if ((LJIILLIIL instanceof C29S) && (activityC45651qj = (ActivityC45651qj) LJIILLIIL) != null) {
                OSPHybridBottomSheetDialogFragment oSPHybridBottomSheetDialogFragment = new OSPHybridBottomSheetDialogFragment(((C27050AjW) au2S0S1100000_4.l1).getTitleText(), au2S0S1100000_4.s0);
                FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
                oSPHybridBottomSheetDialogFragment.show(supportFragmentManager, "");
            }
        }
    }

    public static final void LIZ$1(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        if (view != null) {
            ((PaymentFragment) au2S0S1100000_4.l1).clickBottomButton();
            PaymentFragment paymentFragment = (PaymentFragment) au2S0S1100000_4.l1;
            paymentFragment.withState(paymentFragment.getViewModel(), new AqS58S1100000_4((PaymentFragment) au2S0S1100000_4.l1, au2S0S1100000_4.s0, 6));
        }
    }

    public static final void LIZ$10(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S0S1100000_4.l1).invoke();
            String LIZ = C26867AgZ.LIZ("aweme://webview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_tc_page%2Findex.html%3Fis_full_screen%3D0%26__pia_manifest__%3D%257B%2522worker%2522%253Atrue%252C%2522page_name%2522%253A%2522index%2522%252C%2522public_path%2522%253A%2522https%253A%252F%252Flf16-gecko-source.tiktokcdn.com%252Fobj%252Fbyte-gurd-source-sg%252Ftiktok%252Ffe%252Flive%252Ffe_tiktok_ecommerce_tc_page%252F%2522%257D&use_forest=1&use_spark=1&height=73%25&gravity=bottom&transition_animation=bottom&show_mask=1&mask_bg_color=0000007F&radius=8&disable_bounces=1", C51029K0z.LJJIIZI(new OSZ("voucher_type_id", au2S0S1100000_4.s0)));
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            C26867AgZ.LIZIZ(context, LIZ, C113554cx.LJJJLIIL(), false).open();
        }
    }

    public static final void LIZ$2(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        String str;
        FragmentManager supportFragmentManager;
        String str2;
        B1K paymentLogger;
        if (view != null) {
            PaymentMethod paymentMethod = ((PaymentMethodView) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod != null && (paymentLogger = ((PaymentMethodView) au2S0S1100000_4.l1).getPaymentLogger()) != null) {
                paymentLogger.LJI(paymentMethod);
            }
            String LIZ = C85990Xow.LIZ();
            if (LIZ != null) {
                str = LIZ.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            if (o.LJ(str, "SA")) {
                C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                Context context = ((PaymentMethodView) au2S0S1100000_4.l1).getContext();
                o.LJIIIIZZ(context, "context");
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(au2S0S1100000_4.s0);
                OKG.LIZLLL(c40342FsQ, context, sparkContext);
                return;
            }
            Context context2 = ((PaymentMethodView) au2S0S1100000_4.l1).getContext();
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
                return;
            }
            Context context3 = ((PaymentMethodView) au2S0S1100000_4.l1).getContext();
            Object[] objArr = new Object[1];
            PaymentMethod paymentMethod2 = ((PaymentMethodView) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod2 == null || (str2 = paymentMethod2.displayName) == null) {
                str2 = "";
            }
            objArr[0] = str2;
            String string = context3.getString(R.string.f87, objArr);
            o.LJIIIIZZ(string, "context.getString(\n     …                        )");
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            String str3 = au2S0S1100000_4.s0;
            o.LJIIIZ(str3, "<set-?>");
            sparkNavigationFragment.LJLILLLLZI = str3;
            sparkNavigationFragment.LJLJI = string;
            C27498Aqk.LIZ(supportFragmentManager, sparkNavigationFragment, null);
        }
    }

    public static final void LIZ$3(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        FragmentManager supportFragmentManager;
        String str;
        B1K paymentLogger;
        if (view != null) {
            PaymentMethod paymentMethod = ((USCashierPaymentMethodView) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod != null && (paymentLogger = ((USCashierPaymentMethodView) au2S0S1100000_4.l1).getPaymentLogger()) != null) {
                paymentLogger.LJI(paymentMethod);
            }
            Context context = ((USCashierPaymentMethodView) au2S0S1100000_4.l1).getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                Context context2 = ((USCashierPaymentMethodView) au2S0S1100000_4.l1).getContext();
                Object[] objArr = new Object[1];
                PaymentMethod paymentMethod2 = ((USCashierPaymentMethodView) au2S0S1100000_4.l1).getPaymentMethod();
                if (paymentMethod2 == null || (str = paymentMethod2.displayName) == null) {
                    str = "";
                }
                objArr[0] = str;
                String string = context2.getString(R.string.f87, objArr);
                o.LJIIIIZZ(string, "context.getString(\n     …\"\",\n                    )");
                SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
                String str2 = au2S0S1100000_4.s0;
                o.LJIIIZ(str2, "<set-?>");
                sparkNavigationFragment.LJLILLLLZI = str2;
                sparkNavigationFragment.LJLJI = string;
                C27498Aqk.LIZ(supportFragmentManager, sparkNavigationFragment, null);
            }
        }
    }

    public static final void LIZ$4(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        String str;
        if (view != null) {
            C27949Ay1.LJIJ("save", "confirm", ((USMessageEditDialogFragment) au2S0S1100000_4.l1).getViewModel().fw0(false), "message", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435440);
            Editable text = ((C26018AJa) ((USMessageEditDialogFragment) au2S0S1100000_4.l1)._$_findCachedViewById(R.id.mvi)).getEditText().getText();
            if (text != null && (str = au2S0S1100000_4.s0) != null) {
                ((USMessageEditDialogFragment) au2S0S1100000_4.l1).getViewModel().Qw0(new C26802AfW(str, text.toString()));
            }
            ((USMessageEditDialogFragment) au2S0S1100000_4.l1).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$5(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        T5T editText;
        Editable text;
        String str;
        if (view != null) {
            C27949Ay1.LJIJ("save", "confirm", ((USMessageEditPanelFragment) au2S0S1100000_4.l1).getViewModel().fw0(false), "message", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435440);
            C26018AJa c26018AJa = ((USMessageEditPanelFragment) au2S0S1100000_4.l1).LJLJI;
            if (c26018AJa != null && (editText = c26018AJa.getEditText()) != null && (text = editText.getText()) != null && (str = au2S0S1100000_4.s0) != null) {
                ((USMessageEditPanelFragment) au2S0S1100000_4.l1).getViewModel().Qw0(new C26802AfW(str, text.toString()));
            }
            ((USMessageEditPanelFragment) au2S0S1100000_4.l1).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$6(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        FragmentManager supportFragmentManager;
        String str;
        if (view != null) {
            PaymentMethod paymentMethod = ((B1S) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod != null) {
                C27949Ay1.LJIIL(paymentMethod);
            }
            String upperCase = C85990Xow.LIZ().toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (o.LJ(upperCase, "SA")) {
                C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                Context context = ((B1S) au2S0S1100000_4.l1).getContext();
                o.LJIIIIZZ(context, "context");
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(au2S0S1100000_4.s0);
                OKG.LIZLLL(c40342FsQ, context, sparkContext);
                return;
            }
            Context context2 = ((B1S) au2S0S1100000_4.l1).getContext();
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
                return;
            }
            Context context3 = ((B1S) au2S0S1100000_4.l1).getContext();
            Object[] objArr = new Object[1];
            PaymentMethod paymentMethod2 = ((B1S) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod2 == null || (str = paymentMethod2.displayName) == null) {
                str = "";
            }
            objArr[0] = str;
            String string = context3.getString(R.string.f87, objArr);
            o.LJIIIIZZ(string, "context.getString(\n     …                        )");
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            String str2 = au2S0S1100000_4.s0;
            o.LJIIIZ(str2, "<set-?>");
            sparkNavigationFragment.LJLILLLLZI = str2;
            sparkNavigationFragment.LJLJI = string;
            C27498Aqk.LIZ(supportFragmentManager, sparkNavigationFragment, null);
        }
    }

    public static final void LIZ$7(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        FragmentManager supportFragmentManager;
        String str;
        if (view != null) {
            PaymentMethod paymentMethod = ((B1T) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod != null) {
                C27949Ay1.LJIIL(paymentMethod);
            }
            String upperCase = C85990Xow.LIZ().toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (o.LJ(upperCase, "SA")) {
                C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                Context context = ((B1T) au2S0S1100000_4.l1).getContext();
                o.LJIIIIZZ(context, "context");
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(au2S0S1100000_4.s0);
                OKG.LIZLLL(c40342FsQ, context, sparkContext);
                return;
            }
            Context context2 = ((B1T) au2S0S1100000_4.l1).getContext();
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
                return;
            }
            Context context3 = ((B1T) au2S0S1100000_4.l1).getContext();
            Object[] objArr = new Object[1];
            PaymentMethod paymentMethod2 = ((B1T) au2S0S1100000_4.l1).getPaymentMethod();
            if (paymentMethod2 == null || (str = paymentMethod2.displayName) == null) {
                str = "";
            }
            objArr[0] = str;
            String string = context3.getString(R.string.f87, objArr);
            o.LJIIIIZZ(string, "context.getString(\n     …                        )");
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            String str2 = au2S0S1100000_4.s0;
            o.LJIIIZ(str2, "<set-?>");
            sparkNavigationFragment.LJLILLLLZI = str2;
            sparkNavigationFragment.LJLJI = string;
            C27498Aqk.LIZ(supportFragmentManager, sparkNavigationFragment, null);
        }
    }

    public static final void LIZ$8(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        if (view != null) {
            ((B1R) au2S0S1100000_4.l1).getOnNoticeClickListener().invoke(au2S0S1100000_4.s0);
        }
    }

    public static final void LIZ$9(Au2S0S1100000_4 au2S0S1100000_4, View view) {
        if (view != null) {
            Context context = ((B1R) au2S0S1100000_4.l1).getContext();
            o.LJIIIIZZ(context, "context");
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LIZIZ(au2S0S1100000_4.s0);
            UC0.LIZJ(LIZ, B2M.LJLIL);
            LIZ.LJI().LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S1100000_4(Object obj, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
