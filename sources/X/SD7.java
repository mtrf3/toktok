package X;

import Y.ACListenerS46S0200000_12;
import Y.ACListenerS46S1100000_12;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class SD7 extends SD2 {
    public PaymentMethod LJLJJLL;
    public ElementDTO LJLJL;
    public List<Region> LJLJLJ;
    public InterfaceC88472Yns<? super B0F, C76800UCe> LJLJLLL;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLL;
    public final java.util.Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // X.SD2, X.C252989wM
    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLI;
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

    @Override // X.C252989wM
    public int getContentViewLayoutId() {
        return R.layout.a1m;
    }

    @Override // X.SD2
    public C71731SDf getInputView() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[SYNTHETIC] */
    @Override // X.SD2, X.B1Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> getValue() {
        /*
            r13 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r13.LJLJLJ
            X.FvF r1 = X.C47261Igj.LJJ(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            X.4kV r1 = r1.iterator()
        L15:
            boolean r0 = r1.LJLJI
            if (r0 == 0) goto Lae
            int r4 = r1.nextInt()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r13.LJLJLJ
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r6 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r6
            r9 = 0
            if (r4 != 0) goto Lab
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r13.getElementDTO()
            if (r0 == 0) goto La9
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.subElementDTOList
            if (r0 == 0) goto La9
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            if (r0 == 0) goto La9
            java.lang.String r3 = r0.id
        L3c:
            java.lang.String r0 = "eg_ccdc_global_billing_address_country_regin"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto Lab
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r0 = r6.geoNameId
            java.lang.String r0 = X.C26826Afu.LIZ(r0)
            r5.append(r0)
            r3 = 44
            r5.append(r3)
            java.lang.String r0 = r6.name
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r6.geoNameId
            r5.append(r0)
            java.lang.String r8 = X.X1D.LIZIZ(r5)
        L67:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r5 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r13.getElementDTO()
            if (r0 == 0) goto La7
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.subElementDTOList
            if (r0 == 0) goto La7
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            if (r0 == 0) goto La7
            java.lang.String r6 = r0.id
        L7d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r13.getElementDTO()
            if (r0 == 0) goto La5
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.subElementDTOList
            if (r0 == 0) goto La5
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            if (r0 == 0) goto La5
            java.lang.String r7 = r0.paramName
        L91:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r13.getElementDTO()
            if (r0 == 0) goto L99
            java.lang.Boolean r9 = r0.needEncryption
        L99:
            r10 = 0
            r11 = 16
            r12 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.add(r5)
            goto L15
        La5:
            r7 = r9
            goto L91
        La7:
            r6 = r9
            goto L7d
        La9:
            r3 = r9
            goto L3c
        Lab:
            java.lang.String r8 = r6.name
            goto L67
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SD7.getValue():java.util.List");
    }

    public final void LJFF() {
        ((TextView) LIZIZ(R.id.l3h)).setText(ORZ.LLD(ORZ.LLIILII(this.LJLJLJ), ", ", null, null, SDH.LJLIL, 30));
    }

    @Override // X.SD2, X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJL;
    }

    public final InterfaceC88472Yns<B0F, C76800UCe> getOnRegionPanelStatus() {
        return this.LJLJLLL;
    }

    @Override // X.SD2
    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLL;
    }

    @Override // X.SD2
    public PaymentMethod getPaymentMethod() {
        return this.LJLJJLL;
    }

    public final List<Region> getRegionList() {
        return this.LJLJLJ;
    }

    public SD7(Context context) {
        super(context, null, 0);
        this.LJLJLJ = C61878OQg.INSTANCE;
        this.LJLJLLL = SDV.LJLIL;
        this.LJLL = SDO.LJLIL;
    }

    @Override // X.SD2
    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJL = elementDTO;
    }

    public final void setOnRegionPanelStatus(InterfaceC88472Yns<? super B0F, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLLL = interfaceC88472Yns;
    }

    @Override // X.SD2, X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLL = interfaceC88472Yns;
    }

    @Override // X.SD2
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLJJLL = paymentMethod;
    }

    public final void setRegionList(List<Region> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJLJ = list;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        Region region;
        List list2;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(paymentMethod, "paymentMethod");
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        String str4 = null;
        DefaultConstructorMarker defaultConstructorMarker = 0;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (PaymentElement paymentElement : list) {
                if (o.LJ(paymentElement.getElement(), "eg_ccdc_global_billing_address_country_regin")) {
                    String paramValue = paymentElement.getParamValue();
                    if (paramValue != null) {
                        list2 = s.LJLJJL(paramValue, new String[]{","}, 0, 6);
                    } else {
                        list2 = defaultConstructorMarker;
                    }
                    if (list2 != null) {
                        str = (String) ORZ.LJLLLLLL(1, list2);
                        str2 = (String) ORZ.LJLLLLLL(2, list2);
                        str3 = (String) ORZ.LJLLLLLL(0, list2);
                    } else {
                        str = defaultConstructorMarker;
                        str2 = defaultConstructorMarker;
                        str3 = defaultConstructorMarker;
                    }
                    region = new Region(str, str2, str3, defaultConstructorMarker, defaultConstructorMarker, defaultConstructorMarker, 56, defaultConstructorMarker);
                } else {
                    String str5 = defaultConstructorMarker;
                    String str6 = defaultConstructorMarker;
                    defaultConstructorMarker = defaultConstructorMarker;
                    region = new Region(paymentElement.getParamValue(), str5, str6, defaultConstructorMarker, defaultConstructorMarker, defaultConstructorMarker, 62, defaultConstructorMarker);
                }
                arrayList.add(region);
                defaultConstructorMarker = defaultConstructorMarker;
            }
            this.LJLJLJ = arrayList;
            str4 = defaultConstructorMarker;
        }
        LJFF();
        String str7 = elementDTO.notificationUrl;
        String str8 = str4;
        if (C78857UxB.LJJJIL(str7)) {
            str8 = str7;
        }
        if (str8 != null) {
            LIZIZ(R.id.c6p).setVisibility(0);
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.e_q), new ACListenerS46S1100000_12(this, str8, 3));
        } else {
            LIZIZ(R.id.c6p).setVisibility(8);
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(8);
        }
        ((TextView) LIZIZ(R.id.l3h)).setHint(elementDTO.placeholderDisplayName);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, elementDTO, 6)));
    }
}
