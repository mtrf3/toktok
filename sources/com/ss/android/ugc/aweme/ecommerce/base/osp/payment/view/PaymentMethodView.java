package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view;

import X.AnonymousClass636;
import X.B1K;
import X.B1Z;
import X.B2G;
import X.C024607u;
import X.C118234kV;
import X.C16300kU;
import X.C16880lQ;
import X.C26227ARb;
import X.C26338AVi;
import X.C26706Ady;
import X.C28068Azw;
import X.C28098B1a;
import X.C32I;
import X.C3AW;
import X.C45804HyK;
import X.C47261Igj;
import X.C61878OQg;
import X.C62850Ola;
import X.C63044Ooi;
import X.C76800UCe;
import X.C77123UOp;
import X.C78685UuP;
import X.C79045V0n;
import X.EnumC72807Shn;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.KL2;
import X.OUP;
import X.S3I;
import X.S3L;
import X.SE6;
import X.UC0;
import X.W5F;
import X.W5U;
import Y.IDObjectS328S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.DefaultPaymentViewCcdcStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.DefaultPaymentViewStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class PaymentMethodView extends LinearLayout implements c {
    public static final C28098B1a Companion = new C28098B1a();
    public Map<Integer, View> _$_findViewCache;
    public final SE6 binding;
    public boolean checked;
    public final S3L circleOption;
    public final int dp16;
    public final int dp25;
    public final int dp4;
    public InterfaceC88471Ynr<? super PaymentMethod, ? super InterfaceC88472Yns<? super String, C76800UCe>, C76800UCe> getBindUrl;
    public final View header;
    public InterfaceC88472Yns<? super String, C76800UCe> onCheckedListener;
    public String paySource;
    public B1K paymentLogger;
    public PaymentMethod paymentMethod;
    public PaymentViewModel paymentViewModel;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> removeBindMethod;
    public HashMap<String, Object> trackParams;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodView(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
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

    private final List<String> getAllCardIcons() {
        List<PaymentMethod> list;
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod != null && (list = paymentMethod.subPaymentMethods) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().iconUrl;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    private final boolean isUsePromotionDescInEditStatus() {
        View findViewById = this.header.findViewById(R.id.kp1);
        o.LJIIIIZZ(findViewById, "header.sub_payment_method_name");
        if (findViewById.getVisibility() == 0) {
            return true;
        }
        View findViewById2 = this.header.findViewById(R.id.ea4);
        o.LJIIIIZZ(findViewById2, "header.iconEdit");
        if (findViewById2.getVisibility() == 0) {
            return true;
        }
        View findViewById3 = this.header.findViewById(R.id.ea6);
        o.LJIIIIZZ(findViewById3, "header.iconEditSEA");
        if (findViewById3.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0173, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019e, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ab, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setHeader() {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView.setHeader():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showLabel() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.paymentMethod
            r5 = 0
            if (r0 == 0) goto L60
            java.lang.String r3 = r0.explanationUrl
            if (r3 == 0) goto Lf
            int r0 = r3.length()
            if (r0 != 0) goto L5e
        Lf:
            r0 = 1
        L10:
            r2 = 2131368214(0x7f0a1916, float:1.8356372E38)
            if (r0 == 0) goto L39
            android.view.View r0 = r6._$_findCachedViewById(r2)
            X.C45804HyK.LJJIJIIJIL(r0)
        L1c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.paymentMethod
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentLabel r4 = r0.paymentLabel
            if (r4 == 0) goto L26
            java.lang.String r5 = r4.labelName
        L26:
            r3 = 2131377464(0x7f0a3d38, float:1.8375133E38)
            if (r5 == 0) goto La5
            java.lang.String r0 = r4.fontColor
            if (r0 == 0) goto La5
            java.lang.String r0 = r4.backgroundColor
            if (r0 == 0) goto La5
            r0 = 2131377475(0x7f0a3d43, float:1.8375155E38)
            goto L62
        L37:
            r4 = r5
            goto L26
        L39:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r6.paymentMethod
            if (r1 == 0) goto L44
            X.B1K r0 = r6.paymentLogger
            if (r0 == 0) goto L44
            r0.LJII(r1)
        L44:
            android.view.View r0 = r6._$_findCachedViewById(r2)
            X.C45804HyK.LJJLL(r0)
            android.view.View r2 = r6._$_findCachedViewById(r2)
            java.lang.String r0 = "icNotice"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            com.ss.android.ugc.aweme.utils.Au2S0S1100000_4 r1 = new com.ss.android.ugc.aweme.utils.Au2S0S1100000_4
            r0 = 2
            r1.<init>(r6, r3, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            goto L1c
        L5e:
            r0 = 0
            goto L10
        L60:
            r3 = r5
            goto Lf
        L62:
            android.view.View r0 = r6._$_findCachedViewById(r0)     // Catch: java.lang.Exception -> Lad
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> Lad
            X.C45804HyK.LJJLL(r0)     // Catch: java.lang.Exception -> Lad
            android.view.View r0 = r6._$_findCachedViewById(r3)     // Catch: java.lang.Exception -> Lad
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0     // Catch: java.lang.Exception -> Lad
            X.C45804HyK.LJJLL(r0)     // Catch: java.lang.Exception -> Lad
            r2 = 2131378733(0x7f0a422d, float:1.8377707E38)
            android.view.View r1 = r6._$_findCachedViewById(r2)     // Catch: java.lang.Exception -> Lad
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = r4.labelName     // Catch: java.lang.Exception -> Lad
            r1.setText(r0)     // Catch: java.lang.Exception -> Lad
            android.view.View r1 = r6._$_findCachedViewById(r3)     // Catch: java.lang.Exception -> Lad
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = r4.backgroundColor     // Catch: java.lang.Exception -> Lad
            int r0 = X.C30591Hz.LJJIIJZLJL(r0)     // Catch: java.lang.Exception -> Lad
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)     // Catch: java.lang.Exception -> Lad
            r1.setBackgroundTintList(r0)     // Catch: java.lang.Exception -> Lad
            android.view.View r1 = r6._$_findCachedViewById(r2)     // Catch: java.lang.Exception -> Lad
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = r4.fontColor     // Catch: java.lang.Exception -> Lad
            int r0 = X.C30591Hz.LJJIIJZLJL(r0)     // Catch: java.lang.Exception -> Lad
            r1.setTextColor(r0)     // Catch: java.lang.Exception -> Lad
            goto Lbc
        La5:
            android.view.View r0 = r6._$_findCachedViewById(r3)
            X.C45804HyK.LJJIJIIJIL(r0)
            goto Lbc
        Lad:
            r1 = move-exception
            android.view.View r0 = r6._$_findCachedViewById(r3)
            X.C45804HyK.LJJIJIIJIL(r0)
            java.lang.String r0 = r1.getMessage()
            X.C78983UzD.LJIILL(r0)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView.showLabel():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showPaymentTipStyleIfNeed() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r4.paymentMethod
            r2 = 2131378745(0x7f0a4239, float:1.8377731E38)
            if (r1 == 0) goto L7b
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip r3 = r1.paymentTip
            if (r3 == 0) goto L7b
            boolean r0 = r4.checked
            if (r0 != 0) goto L1d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r1.availability
            if (r0 == 0) goto L7b
            java.lang.Boolean r1 = r0.isAvailable
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L7b
        L1d:
            java.lang.String r0 = r3.tips
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L7b
            android.view.View r0 = r4.header
            android.view.View r0 = r0.findViewById(r2)
            X.C45804HyK.LJJLL(r0)
            android.view.View r0 = r4.header
            android.view.View r1 = r0.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.tips
            r1.setText(r0)
            java.lang.String r3 = r3.fontColor
            if (r3 == 0) goto L58
            boolean r0 = X.C78685UuP.LJJJZ(r3)
            if (r0 == 0) goto L58
            android.view.View r0 = r4.header
            android.view.View r1 = r0.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            r1.setTextColor(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L66
        L58:
            android.view.View r0 = r4.header
            android.view.View r1 = r0.findViewById(r2)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r0 = 2130968799(0x7f0400df, float:1.7546262E38)
            r1.setTextColorRes(r0)
        L66:
            r0 = 2131378688(0x7f0a4200, float:1.8377616E38)
            android.view.View r1 = r4._$_findCachedViewById(r0)
            java.lang.String r0 = "tvBindNote"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 8
            r1.setVisibility(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L84
        L7b:
            android.view.View r0 = r4.header
            android.view.View r0 = r0.findViewById(r2)
            X.C45804HyK.LJJIJIIJIL(r0)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView.showPaymentTipStyleIfNeed():void");
    }

    private final void showSubPaymentMethodIfNeed() {
        UnfoldStrategy unfoldStrategy;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2 = this.paymentMethod;
        String str = null;
        if (paymentMethod2 != null) {
            unfoldStrategy = paymentMethod2.unfoldStrategy;
        } else {
            unfoldStrategy = null;
        }
        if (unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE && paymentMethod2 != null && paymentMethod2.LIZ != null) {
            if (this.checked) {
                C45804HyK.LJJLL(this.header.findViewById(R.id.kp1));
                TextView textView = (TextView) this.header.findViewById(R.id.kp1);
                PaymentMethod paymentMethod3 = this.paymentMethod;
                if (paymentMethod3 != null && (paymentMethod = paymentMethod3.LIZ) != null) {
                    str = paymentMethod.displayName;
                }
                textView.setText(str);
                return;
            }
            C45804HyK.LJJIJIIJIL(this.header.findViewById(R.id.kp1));
            return;
        }
        C45804HyK.LJJIJIIJIL(this.header.findViewById(R.id.kp1));
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
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.kzy));
            if (z) {
                ((TextView) _$_findCachedViewById(R.id.d2k)).setMaxLines(2);
                return;
            } else {
                ((TextView) _$_findCachedViewById(R.id.d2k)).setMaxLines(1);
                return;
            }
        }
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.d2k));
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.kzy));
    }

    private final void updatePaymentDiscount() {
        String str = null;
        if (this.checked && !isUsePromotionDescInEditStatus()) {
            C28098B1a c28098B1a = Companion;
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

    public final List<PaymentElement> collectElementsValue() {
        List<PaymentElement> value;
        IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(this, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS328S0100000_4.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) it.next();
            if ((callback instanceof B1Z) && (value = ((B1Z) callback).getValue()) != null) {
                arrayList.add(value);
            }
        }
        return C32I.LJJLI(arrayList);
    }

    private final void endStyle() {
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.hjd));
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.j1x));
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.ea4));
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.dbs));
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.b_8));
    }

    private final void startStyle() {
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.hjd));
        View rightLayout = _$_findCachedViewById(R.id.j1x);
        o.LJIIIIZZ(rightLayout, "rightLayout");
        OUP.LJJ(rightLayout);
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.ea4));
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.dbs));
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.b_8));
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final S3L getCircleOption() {
        return this.circleOption;
    }

    public final InterfaceC88471Ynr<PaymentMethod, InterfaceC88472Yns<? super String, C76800UCe>, C76800UCe> getGetBindUrl() {
        return this.getBindUrl;
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

    public final InterfaceC88472Yns<PaymentMethod, C76800UCe> getRemoveBindMethod() {
        return this.removeBindMethod;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    private final void bindStyle(PaymentMethod paymentMethod) {
        String str;
        IPaymentViewStyle defaultPaymentViewStyle;
        String str2;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (o.LJ(str, "pm_pi_ccdc_all")) {
            defaultPaymentViewStyle = new DefaultPaymentViewCcdcStyle();
            str2 = "ccdc_all";
        } else {
            defaultPaymentViewStyle = new DefaultPaymentViewStyle();
            str2 = "";
        }
        SE6 se6 = this.binding;
        IPaymentViewStyle iPaymentViewStyle = (IPaymentViewStyle) UC0.LJIIJJI(this, "payment_method", null, str2, null, 10);
        if (iPaymentViewStyle != null) {
            defaultPaymentViewStyle = iPaymentViewStyle;
        }
        se6.LJIILLIIL(defaultPaymentViewStyle);
    }

    public final void setChecked(boolean z) {
        String str;
        this.checked = z;
        ((C63044Ooi) _$_findCachedViewById(R.id.iln)).setChecked(z);
        ((C63044Ooi) _$_findCachedViewById(R.id.b_8)).setChecked(z);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (o.LJ(str, "pm_pi_ccdc_all") && z) {
            showIcons$default(this, getAllCardIcons(), null, 2, null);
        } else {
            ((ViewGroup) _$_findCachedViewById(R.id.b5k)).removeAllViews();
        }
        showSubPaymentMethodIfNeed();
        showPaymentTipStyleIfNeed();
        updateExtraInfo();
        updatePaymentDiscount();
    }

    public final void setGetBindUrl(InterfaceC88471Ynr<? super PaymentMethod, ? super InterfaceC88472Yns<? super String, C76800UCe>, C76800UCe> interfaceC88471Ynr) {
        this.getBindUrl = interfaceC88471Ynr;
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
        bindStyle(paymentMethod);
        setHeader();
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.paymentViewModel = paymentViewModel;
    }

    public final void setRemoveBindMethod(InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns) {
        this.removeBindMethod = interfaceC88472Yns;
    }

    public final void setTrackParams(HashMap<String, Object> hashMap) {
        this.trackParams = hashMap;
    }

    private final void showIcons(List<String> list, ViewGroup viewGroup) {
        int i;
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.b5k));
        if (viewGroup == null) {
            viewGroup = (ViewGroup) _$_findCachedViewById(R.id.b5k);
        }
        viewGroup.removeAllViews();
        if (list.size() > 6) {
            list = list.subList(0, 6);
        }
        int size = list.size();
        for (int childCount = viewGroup.getChildCount(); childCount < size; childCount++) {
            View smartImageView = new SmartImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.dp25, this.dp16);
            layoutParams.weight = 1.0f;
            smartImageView.setLayoutParams(layoutParams);
            smartImageView.setBackgroundResource(R.drawable.abg);
            viewGroup.addView(smartImageView);
        }
        int childCount2 = viewGroup.getChildCount();
        for (int size2 = list.size(); size2 < childCount2; size2++) {
            View childAt = viewGroup.getChildAt(size2);
            if (childAt != null) {
                childAt.setVisibility(8);
            }
        }
        C118234kV it = C47261Igj.LJJ(list).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            View childAt2 = viewGroup.getChildAt(nextInt);
            if (childAt2 != null && (childAt2 instanceof SmartImageView)) {
                if (nextInt != C47261Igj.LJJI(list)) {
                    i = this.dp4;
                } else {
                    i = 0;
                }
                C26338AVi.LJI(childAt2, null, null, Integer.valueOf(i), null, false, 27);
                Object obj = ListProtector.get(list, nextInt);
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = " ";
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                SmartImageView smartImageView2 = (SmartImageView) childAt2;
                Context context = smartImageView2.getContext();
                o.LJIIIIZZ(context, "context");
                LJIIIIZZ.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
                LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
                LJIIIIZZ.LJJIIJZLJL = (ImageView) childAt2;
                C16880lQ.LLJJJ(LJIIIIZZ);
                smartImageView2.setCircleOptions(this.circleOption);
            }
        }
    }

    public final void displayDialog(DialogContent dialogContent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        Object obj;
        String str2;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LJII = false;
        String title = dialogContent.getTitle();
        if (title != null) {
            LIZ.LJFF(title);
        }
        LIZ.LIZIZ(dialogContent.getMessage());
        Boolean hasCloseButton = dialogContent.getHasCloseButton();
        if (hasCloseButton != null) {
            LIZ.LJIIIIZZ = hasCloseButton.booleanValue();
        }
        List<DialogButton> dialogButtons = dialogContent.getDialogButtons();
        if (dialogButtons != null) {
            Integer dialogType = dialogContent.getDialogType();
            if (dialogType == null || dialogType.intValue() != 1) {
                UC0.LIZJ(LIZ, new AqS50S0400000_4((List) dialogButtons, (List<DialogButton>) dialogContent, (DialogContent) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) this, (PaymentMethodView) 8));
            } else {
                C77123UOp.LJIILL(LIZ, new AqS108S0300000_4((List) dialogButtons, (List<DialogButton>) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) this, (PaymentMethodView) 10));
            }
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.LJIIL();
        } else {
            str = null;
        }
        HashMap<String, Object> hashMap = this.trackParams;
        if (hashMap != null) {
            obj = hashMap.get("previous_page");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        C28068Azw.LIZIZ(null, "account_security_guarantee", str, null, str2);
        LIZ.LJI().LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.dp4 = (int) KL2.LIZJ(context, 4.0f);
        this.dp25 = (int) KL2.LIZJ(context, 22.0f);
        this.dp16 = (int) KL2.LIZJ(context, 14.0f);
        S3I s3i = new S3I();
        s3i.LIZLLL = KL2.LIZJ(context, 2.0f);
        this.circleOption = new S3L(s3i);
        this.onCheckedListener = B2G.LJLIL;
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
        SE6 se6 = (SE6) C024607u.LIZ(C16880lQ.LLZIL(context), R.layout.a1u, this, true, ViewDataBinding.LIZIZ(null));
        o.LJIIIIZZ(se6, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = se6;
        View view = se6.LJLJJI;
        o.LJIIIIZZ(view, "binding.root");
        this.header = view;
        C16300kU.LJIILLIIL(_$_findCachedViewById(R.id.iln), null);
    }

    public /* synthetic */ PaymentMethodView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void showIcons$default(PaymentMethodView paymentMethodView, List list, ViewGroup viewGroup, int i, Object obj) {
        if ((i & 2) != 0) {
            viewGroup = null;
        }
        paymentMethodView.showIcons(list, viewGroup);
    }
}
