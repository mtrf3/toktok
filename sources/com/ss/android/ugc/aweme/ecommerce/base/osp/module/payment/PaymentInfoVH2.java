package com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment;

import X.AnonymousClass064;
import X.B1R;
import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C26338AVi;
import X.C26508Aam;
import X.C27949Ay1;
import X.C45804HyK;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C73156SnQ;
import X.C79081V1x;
import X.C7MY;
import X.ORY;
import X.ORZ;
import X.OUP;
import X.S3I;
import X.S3L;
import X.TBT;
import X.TBV;
import X.W5F;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BillingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentInfoVH2 extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public PaymentInfo LJLJI;
    public Boolean LJLJJI;
    public B1R LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final S3L LJLJLLL;
    public final AnonymousClass064 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel M() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, false);
        ((ViewGroup) this.LJLIL.findViewById(R.id.g14)).removeAllViews();
        C73156SnQ.LJIIIIZZ(this, M(), new TBT() { // from class: X.B06
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckPayment());
            }
        }, new AqS186S0100000_4(this, 38));
        C73156SnQ.LJIIIIZZ(this, M(), new TBV() { // from class: X.B05
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getUserPaymentInfo();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((OrderSubmitState) obj).setUserPaymentInfo((PaymentInfo) obj2);
            }
        }, new AqS186S0100000_4(this, 39));
    }

    public PaymentInfoVH2(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 27));
        S3I s3i = new S3I();
        s3i.LIZLLL = C79081V1x.LJII(2);
        this.LJLJLLL = new S3L(s3i);
        this.LJLL = new AnonymousClass064();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x02dc, code lost:
    
        if (r12.LJIILJJIL(r2) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2.onBind(java.lang.Object):void");
    }

    public final void L(List list, ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            OUP.LJJLIIIJ(viewGroup);
        }
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i <= 6) {
                        SmartImageView smartImageView = new SmartImageView(this.LJLIL.getContext());
                        smartImageView.setLayoutParams(new LinearLayout.LayoutParams(C17N.LJIILL(25.6d), C79081V1x.LJII(16)));
                        C26338AVi.LJI(smartImageView, null, null, Integer.valueOf(C79081V1x.LJII(4)), null, false, 27);
                        W5F LIZLLL = C70759Rpr.LIZLLL(obj);
                        LIZLLL.LJIILIIL = C7MY.LIZJ(this.LJLIL, "view.context", R.attr.cj);
                        LIZLLL.LJJIIJ = smartImageView;
                        C16880lQ.LLJJJ(LIZLLL);
                        smartImageView.setCircleOptions(this.LJLJLLL);
                        if (viewGroup != null) {
                            viewGroup.addView(smartImageView);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void N(PaymentMethod paymentMethod, BillingAddressData billingAddressData) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String[] strArr = new String[5];
        String str5 = null;
        if (billingAddressData != null) {
            str = billingAddressData.getBillingAddressLine();
        } else {
            str = null;
        }
        strArr[0] = str;
        if (billingAddressData != null) {
            str2 = billingAddressData.getBillingCity();
        } else {
            str2 = null;
        }
        strArr[1] = str2;
        if (billingAddressData != null) {
            str3 = billingAddressData.getBillingState();
        } else {
            str3 = null;
        }
        strArr[2] = str3;
        if (billingAddressData != null) {
            str4 = billingAddressData.getBillingCountryRegionCode();
        } else {
            str4 = null;
        }
        strArr[3] = str4;
        if (billingAddressData != null) {
            str5 = billingAddressData.getBillingPostalCode();
        }
        strArr[4] = str5;
        String LLD = ORZ.LLD(ORY.LJJIJLIJ(strArr), ", ", null, null, null, 62);
        if (LLD.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.g0z));
            return;
        }
        View findViewById = this.LJLIL.findViewById(R.id.g0z);
        o.LJIIIIZZ(findViewById, "view.llOSPBillingAddress");
        if (findViewById.getVisibility() == 8) {
            C27949Ay1.LIZ.LJIIJ(paymentMethod, M().fw0(false));
        }
        View findViewById2 = this.LJLIL.findViewById(R.id.g0z);
        o.LJIIIIZZ(findViewById2, "view.llOSPBillingAddress");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, paymentMethod, 2), findViewById2);
        View findViewById3 = this.LJLIL.findViewById(R.id.g0z);
        o.LJIIIIZZ(findViewById3, "view.llOSPBillingAddress");
        OUP.LJJLIIIJ(findViewById3);
        ((TextView) this.LJLIL.findViewById(R.id.lvk)).setText(LLD);
    }
}
