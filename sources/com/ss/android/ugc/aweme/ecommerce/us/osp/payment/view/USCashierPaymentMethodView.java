package com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view;

import X.AnonymousClass636;
import X.B1K;
import X.B2H;
import X.C16300kU;
import X.C16880lQ;
import X.C26706Ady;
import X.C28098B1a;
import X.C30591Hz;
import X.C45804HyK;
import X.C62850Ola;
import X.C63044Ooi;
import X.C70759Rpr;
import X.C76800UCe;
import X.C78685UuP;
import X.C78983UzD;
import X.C79045V0n;
import X.InterfaceC88472Yns;
import X.KL2;
import X.OUP;
import X.S3I;
import X.S3L;
import X.W5F;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentLabel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class USCashierPaymentMethodView extends LinearLayout implements c {
    public Map<Integer, View> _$_findViewCache;
    public boolean checked;
    public final View header;
    public InterfaceC88472Yns<? super String, C76800UCe> onCheckedListener;
    public String paySource;
    public B1K paymentLogger;
    public PaymentMethod paymentMethod;
    public PaymentViewModel paymentViewModel;
    public HashMap<String, Object> trackParams;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public USCashierPaymentMethodView(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public USCashierPaymentMethodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    private final void initPaymentMethod() {
        String str;
        String str2;
        PaymentMethod paymentMethod = this.paymentMethod;
        String str3 = null;
        if (paymentMethod != null) {
            str = paymentMethod.iconUrl;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = " ";
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(str);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
        LIZLLL.LJJIIJZLJL = (ImageView) this.header.findViewById(R.id.hjd);
        C16880lQ.LLJJJ(LIZLLL);
        SmartImageView smartImageView = (SmartImageView) this.header.findViewById(R.id.hjd);
        S3I s3i = new S3I();
        s3i.LIZLLL = KL2.LIZJ(getContext(), 2.0f);
        smartImageView.setCircleOptions(new S3L(s3i));
        this.header.findViewById(R.id.hjd).setAlpha(1.0f);
        TextView textView = (TextView) this.header.findViewById(R.id.hje);
        PaymentMethod paymentMethod2 = this.paymentMethod;
        if (paymentMethod2 != null) {
            str2 = paymentMethod2.displayName;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        ((TuxTextView) this.header.findViewById(R.id.hje)).setTextColorRes(R.attr.go);
        this.header.setEnabled(true);
        PaymentMethod paymentMethod3 = this.paymentMethod;
        if (paymentMethod3 != null) {
            str3 = paymentMethod3.id;
        }
        if (o.LJ(str3, "pm_pi_ccdc_all")) {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.iln));
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.evr));
        } else {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.iln));
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.evr));
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final void setHeader() {
        Availability availability;
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 57), this.header);
        initPaymentMethod();
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod != null && (availability = paymentMethod.availability) != null && o.LJ(Boolean.FALSE, availability.isAvailable)) {
            setUnavailable();
        }
        showNoticeInfo();
        showLabel();
        showEditIcon();
        showCcdcCartTip();
        updateExtraInfo();
        updatePaymentDiscount();
    }

    private final void setUnavailable() {
        ((TuxTextView) this.header.findViewById(R.id.hje)).setTextColorRes(R.attr.gp);
        this.header.findViewById(R.id.hjd).setAlpha(0.3f);
        this.header.setEnabled(false);
        ((C63044Ooi) this.header.findViewById(R.id.iln)).setEnabled(false);
    }

    private final void showEditIcon() {
        String str;
        PaymentMethod paymentMethod;
        String str2;
        PaymentMethod paymentMethod2;
        B1K b1k;
        PaymentMethod paymentMethod3;
        B1K b1k2;
        PaymentMethod paymentMethod4 = this.paymentMethod;
        if (paymentMethod4 != null) {
            str = paymentMethod4.id;
        } else {
            str = null;
        }
        if (!o.LJ(str, "pm_pi_ccdc_all") && (paymentMethod = this.paymentMethod) != null && (str2 = paymentMethod.id) != null && ujb.o.LJJJLIIL(str2, "pm_pi_ccdc_", false)) {
            View iconEdit = _$_findCachedViewById(R.id.ea4);
            o.LJIIIIZZ(iconEdit, "iconEdit");
            if (iconEdit.getVisibility() == 8 && (paymentMethod3 = this.paymentMethod) != null && (b1k2 = this.paymentLogger) != null) {
                b1k2.LJFF(paymentMethod3);
            }
            PaymentMethod paymentMethod5 = this.paymentMethod;
            if (paymentMethod5 != null && paymentMethod5.LIZIZ) {
                View iconEdit2 = _$_findCachedViewById(R.id.ea4);
                o.LJIIIIZZ(iconEdit2, "iconEdit");
                if (iconEdit2.getVisibility() == 8 && (paymentMethod2 = this.paymentMethod) != null && (b1k = this.paymentLogger) != null) {
                    b1k.LJFF(paymentMethod2);
                }
                C45804HyK.LJJLL(_$_findCachedViewById(R.id.ea4));
                return;
            }
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.ea4));
            return;
        }
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.ea4));
    }

    private final void showLabel() {
        PaymentLabel paymentLabel;
        PaymentMethod paymentMethod = this.paymentMethod;
        String str = null;
        if (paymentMethod != null) {
            paymentLabel = paymentMethod.paymentLabel;
            if (paymentLabel != null) {
                str = paymentLabel.labelName;
            }
        } else {
            paymentLabel = null;
        }
        if (str != null && paymentLabel.fontColor != null && paymentLabel.backgroundColor != null) {
            try {
                C45804HyK.LJJLL((LinearLayout) _$_findCachedViewById(R.id.icn));
                C45804HyK.LJJLL((CardView) _$_findCachedViewById(R.id.i4_));
                ((TuxTextView) _$_findCachedViewById(R.id.lwu)).setText(paymentLabel.labelName);
                ((CardView) _$_findCachedViewById(R.id.i4_)).setBackgroundTintList(ColorStateList.valueOf(C30591Hz.LJJIIJZLJL(paymentLabel.backgroundColor)));
                ((TuxTextView) _$_findCachedViewById(R.id.lwu)).setTextColor(C30591Hz.LJJIIJZLJL(paymentLabel.fontColor));
                return;
            } catch (Exception e) {
                C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.i4_));
                C78983UzD.LJIILL(e.getMessage());
                return;
            }
        }
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.i4_));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showNoticeInfo() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r4.paymentMethod
            if (r0 == 0) goto L43
            java.lang.String r3 = r0.explanationUrl
            if (r3 == 0) goto Le
            int r0 = r3.length()
            if (r0 != 0) goto L41
        Le:
            r0 = 1
        Lf:
            r2 = 2131368214(0x7f0a1916, float:1.8356372E38)
            if (r0 == 0) goto L1c
            android.view.View r0 = r4._$_findCachedViewById(r2)
            X.C45804HyK.LJJIJIIJIL(r0)
        L1b:
            return
        L1c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r4.paymentMethod
            if (r1 == 0) goto L27
            X.B1K r0 = r4.paymentLogger
            if (r0 == 0) goto L27
            r0.LJII(r1)
        L27:
            android.view.View r0 = r4._$_findCachedViewById(r2)
            X.C45804HyK.LJJLL(r0)
            android.view.View r2 = r4._$_findCachedViewById(r2)
            java.lang.String r0 = "icNotice"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            com.ss.android.ugc.aweme.utils.Au2S0S1100000_4 r1 = new com.ss.android.ugc.aweme.utils.Au2S0S1100000_4
            r0 = 3
            r1.<init>(r4, r3, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            goto L1b
        L41:
            r0 = 0
            goto Lf
        L43:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView.showNoticeInfo():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showPaymentTipStyleIfNeed() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r4.paymentMethod
            r3 = 2131378745(0x7f0a4239, float:1.8377731E38)
            if (r1 == 0) goto L71
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip r2 = r1.paymentTip
            if (r2 == 0) goto L71
            boolean r0 = r4.checked
            if (r0 != 0) goto L1d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r1.availability
            if (r0 == 0) goto L71
            java.lang.Boolean r1 = r0.isAvailable
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L71
        L1d:
            java.lang.String r0 = r2.tips
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L71
            android.view.View r0 = r4.header
            android.view.View r0 = r0.findViewById(r3)
            X.C45804HyK.LJJLL(r0)
            android.view.View r0 = r4.header
            android.view.View r1 = r0.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r2.tips
            r1.setText(r0)
            java.lang.String r2 = r2.fontColor
            if (r2 == 0) goto L5f
            boolean r0 = X.C78685UuP.LJJJZ(r2)
            if (r0 == 0) goto L5f
            android.view.View r0 = r4.header     // Catch: java.lang.Exception -> L55
            android.view.View r1 = r0.findViewById(r3)     // Catch: java.lang.Exception -> L55
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1     // Catch: java.lang.Exception -> L55
            int r0 = X.C30591Hz.LJJIIJZLJL(r2)     // Catch: java.lang.Exception -> L55
            r1.setTextColor(r0)     // Catch: java.lang.Exception -> L55
            goto L5b
        L55:
            r1 = move-exception
            java.lang.String r0 = "showPaymentTipStyleIfNeed parse color exception"
            X.C78983UzD.LJIJ(r1, r0)
        L5b:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L6d
        L5f:
            android.view.View r0 = r4.header
            android.view.View r1 = r0.findViewById(r3)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r0 = 2130968799(0x7f0400df, float:1.7546262E38)
            r1.setTextColorRes(r0)
        L6d:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L7a
        L71:
            android.view.View r0 = r4.header
            android.view.View r0 = r0.findViewById(r3)
            X.C45804HyK.LJJIJIIJIL(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView.showPaymentTipStyleIfNeed():void");
    }

    private final void updateExtraInfo() {
        String LJIIIIZZ;
        boolean z;
        if (this.checked && isUsePromotionDescInEditStatus()) {
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod != null) {
                LJIIIIZZ = paymentMethod.LJIIIZ();
            }
            LJIIIIZZ = null;
        } else {
            PaymentMethod paymentMethod2 = this.paymentMethod;
            if (paymentMethod2 != null) {
                LJIIIIZZ = paymentMethod2.LJIIIIZZ();
            }
            LJIIIIZZ = null;
        }
        if (LJIIIIZZ != null && C78685UuP.LJJJZ(LJIIIIZZ)) {
            z = true;
        } else {
            PaymentMethod paymentMethod3 = this.paymentMethod;
            if (paymentMethod3 != null) {
                LJIIIIZZ = paymentMethod3.extraInfo;
            } else {
                LJIIIIZZ = null;
            }
            z = false;
        }
        if (LJIIIIZZ != null && LJIIIIZZ.length() > 0) {
            ((TextView) _$_findCachedViewById(R.id.d2k)).setText(LJIIIIZZ);
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.d2k));
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.icn));
            if (z) {
                ((TextView) _$_findCachedViewById(R.id.d2k)).setMaxLines(2);
                return;
            } else {
                ((TextView) _$_findCachedViewById(R.id.d2k)).setMaxLines(1);
                return;
            }
        }
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.d2k));
    }

    private final void updatePaymentDiscount() {
        String str = null;
        if (this.checked && !isUsePromotionDescInEditStatus()) {
            C28098B1a c28098B1a = PaymentMethodView.Companion;
            PaymentMethod paymentMethod = this.paymentMethod;
            c28098B1a.getClass();
            str = C28098B1a.LIZ(paymentMethod);
        }
        if (str != null && str.length() > 0) {
            ((TextView) _$_findCachedViewById(R.id.hja)).setText(str);
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.hja));
        } else {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.hja));
        }
    }

    private final boolean isUsePromotionDescInEditStatus() {
        View iconEdit = _$_findCachedViewById(R.id.ea4);
        o.LJIIIIZZ(iconEdit, "iconEdit");
        if (iconEdit.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private final void showCcdcCartTip() {
        String str;
        TextView tvCcdcCardTip = (TextView) _$_findCachedViewById(R.id.lvq);
        o.LJIIIIZZ(tvCcdcCardTip, "tvCcdcCardTip");
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.ccdcCardTip;
        } else {
            str = null;
        }
        OUP.LJJLIIIJILLIZJL(tvCcdcCardTip, str);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnCheckedListener() {
        return this.onCheckedListener;
    }

    public final String getPaySource() {
        return this.paySource;
    }

    public final B1K getPaymentLogger() {
        return this.paymentLogger;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.paymentViewModel;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
        ((C63044Ooi) _$_findCachedViewById(R.id.iln)).setChecked(z);
        showPaymentTipStyleIfNeed();
        updateExtraInfo();
        updatePaymentDiscount();
    }

    public final void setOnCheckedListener(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.onCheckedListener = interfaceC88472Yns;
    }

    public final void setPaySource(String str) {
        this.paySource = str;
    }

    public final void setPaymentLogger(B1K b1k) {
        this.paymentLogger = b1k;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        setHeader();
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.paymentViewModel = paymentViewModel;
    }

    public final void setTrackParams(HashMap<String, Object> hashMap) {
        this.trackParams = hashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USCashierPaymentMethodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.onCheckedListener = B2H.LJLIL;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cr, context));
        View inflate = View.inflate(context, R.layout.a9h, this);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…ayment_method_view, this)");
        this.header = inflate;
        C16300kU.LJIILLIIL(_$_findCachedViewById(R.id.iln), null);
    }

    public /* synthetic */ USCashierPaymentMethodView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
