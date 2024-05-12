package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS39S0200000_4;
import Y.IDCListenerS376S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import ujb.o;

/* loaded from: classes13.dex */
public final class SD1 extends SD2 {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public B1K LJLJLLL;
    public boolean LJLL;
    public InterfaceC65784Pro<C76800UCe> LJLLI;
    public PaymentMethod LJLLILLLL;
    public ElementDTO LJLLJ;
    public List<PaymentMethod> LJLLL;
    public String LJLLLL;
    public SD0 LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> LL;
    public final S3L LLD;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LLF;
    public final java.util.Map<Integer, View> LLFF = new LinkedHashMap();

    @Override // X.SD2, X.C252989wM
    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LLFF;
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
        return R.layout.a1j;
    }

    @Override // X.SD2, X.B1Z
    public List<PaymentElement> getValue() {
        String str;
        String str2;
        ElementDTO elementDTO = getElementDTO();
        Boolean bool = null;
        if (elementDTO != null) {
            str = elementDTO.id;
        } else {
            str = null;
        }
        ElementDTO elementDTO2 = getElementDTO();
        if (elementDTO2 != null) {
            str2 = elementDTO2.paramName;
        } else {
            str2 = null;
        }
        String LJJJJZ = o.LJJJJZ(String.valueOf(((C19K) LIZIZ(R.id.eof)).getText()), " ", "", false);
        ElementDTO elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            bool = elementDTO3.needEncryption;
        }
        return C47261Igj.LJJIJ(new PaymentElement(str, str2, LJJJJZ, bool, null, 16, null));
    }

    @Override // X.SD2
    public C71731SDf getInputView() {
        C71731SDf inputWithIndicator = (C71731SDf) LIZIZ(R.id.eod);
        kotlin.jvm.internal.o.LJIIIIZZ(inputWithIndicator, "inputWithIndicator");
        return inputWithIndicator;
    }

    public static final List<String> getAllCardIcons() {
        return C61878OQg.INSTANCE;
    }

    public final S3L getCircleOption() {
        return this.LLD;
    }

    public final String getCurrentPaymentId() {
        return this.LJLLLL;
    }

    @Override // X.SD2, X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLLJ;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getFocusChange() {
        return this.LJLJJLL;
    }

    public final String getInputType() {
        return this.LJLJL;
    }

    public final String getLastOcrValue() {
        return this.LJLJLJ;
    }

    public final InterfaceC88472Yns<PaymentMethod, C76800UCe> getOnPaymentMethodIdentify() {
        return this.LL;
    }

    @Override // X.SD2
    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LLF;
    }

    public final List<PaymentMethod> getPaymentList() {
        return this.LJLLL;
    }

    public final B1K getPaymentLogger() {
        return this.LJLJLLL;
    }

    @Override // X.SD2
    public PaymentMethod getPaymentMethod() {
        return this.LJLLILLLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getRequestOcr() {
        return this.LJLLI;
    }

    public final boolean getTextHasFocus() {
        return this.LJLL;
    }

    public SD1(Context context) {
        super(context, null, 0);
        this.LJLJJLL = C34398Dek.LJLIL;
        this.LJLJL = "";
        this.LJLLI = C71726SDa.LJLIL;
        this.LJLZ = (int) KL2.LIZJ(context, 4.0f);
        this.LJZ = (int) KL2.LIZJ(context, 6.0f);
        this.LJZI = (int) KL2.LIZJ(context, 25.0f);
        this.LJZL = (int) KL2.LIZJ(context, 16.0f);
        this.LL = SDW.LJLIL;
        S3I s3i = new S3I();
        s3i.LIZLLL = KL2.LIZJ(context, 2.0f);
        this.LLD = new S3L(s3i);
        this.LLF = SDP.LJLIL;
    }

    public final void LJFF(String str) {
        PaymentMethod paymentMethod;
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            List<PaymentMethod> list = this.LJLLL;
            String str2 = null;
            if (list != null) {
                Iterator<PaymentMethod> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        paymentMethod = it.next();
                        if (kotlin.jvm.internal.o.LJ(paymentMethod.id, str)) {
                            break;
                        }
                    } else {
                        paymentMethod = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod2 = paymentMethod;
                if (paymentMethod2 != null) {
                    str2 = paymentMethod2.iconUrl;
                }
            }
            LJI(this, C47261Igj.LJJIJ(str2));
            return;
        }
        LJI(this, C61878OQg.INSTANCE);
    }

    public final void setCurrentPaymentId(String str) {
        this.LJLLLL = str;
    }

    public final void setDelimiterVisible(boolean z) {
        int i;
        View LIZIZ = LIZIZ(R.id.c6p);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZIZ.setVisibility(i);
    }

    @Override // X.SD2
    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLLJ = elementDTO;
    }

    public final void setFocusChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJLL = interfaceC88472Yns;
    }

    public final void setInputType(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.LJLJL = str;
    }

    public final void setLastOcrValue(String str) {
        this.LJLJLJ = str;
    }

    public final void setOnPaymentMethodIdentify(InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LL = interfaceC88472Yns;
    }

    @Override // X.SD2, X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LLF = interfaceC88472Yns;
    }

    public final void setPaymentList(List<PaymentMethod> list) {
        this.LJLLL = list;
    }

    public final void setPaymentLogger(B1K b1k) {
        this.LJLJLLL = b1k;
    }

    @Override // X.SD2
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLLILLLL = paymentMethod;
    }

    public final void setRequestOcr(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLLI = interfaceC65784Pro;
    }

    public final void setTextHasFocus(boolean z) {
        this.LJLL = z;
    }

    public static void LJI(SD1 sd1, List list) {
        boolean z;
        int i;
        int i2;
        List list2 = list;
        sd1.getClass();
        if ((!list2.isEmpty()) && ((C71731SDf) sd1.LIZIZ(R.id.eod)).LIZ(R.id.eoe).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sd1.setDelimiterVisible(z);
        ViewGroup viewGroup = (ViewGroup) sd1.LIZIZ(R.id.jb7);
        viewGroup.removeAllViews();
        if (list2.size() > 6) {
            list2 = list2.subList(0, 6);
        }
        int size = list2.size();
        for (int childCount = viewGroup.getChildCount(); childCount < size; childCount++) {
            View smartImageView = new SmartImageView(sd1.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sd1.LJZI, sd1.LJZL);
            layoutParams.weight = 1.0f;
            smartImageView.setLayoutParams(layoutParams);
            smartImageView.setBackgroundResource(R.drawable.abg);
            viewGroup.addView(smartImageView);
        }
        int childCount2 = viewGroup.getChildCount();
        for (int size2 = list2.size(); size2 < childCount2; size2++) {
            View childAt = viewGroup.getChildAt(size2);
            if (childAt != null) {
                childAt.setVisibility(8);
            }
        }
        C118234kV it = C47261Igj.LJJ(list2).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            View childAt2 = viewGroup.getChildAt(nextInt);
            if (childAt2 != null && (childAt2 instanceof SmartImageView)) {
                if (nextInt != C47261Igj.LJJI(list2)) {
                    i = sd1.LJLZ;
                } else {
                    i = 0;
                }
                if (nextInt == 0) {
                    i2 = sd1.LJZ;
                } else {
                    i2 = 0;
                }
                C26338AVi.LJI(childAt2, Integer.valueOf(i2), null, Integer.valueOf(i), null, false, 26);
                Object obj = ListProtector.get(list2, nextInt);
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
                kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
                LJIIIIZZ.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
                LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
                LJIIIIZZ.LJJIIJZLJL = (ImageView) childAt2;
                C16880lQ.LLJJJ(LJIIIIZZ);
                smartImageView2.setCircleOptions(sd1.LLD);
            }
        }
        if (TextUtils.isEmpty(((C71731SDf) sd1.LIZIZ(R.id.eod)).getText())) {
            ((ViewGroup) sd1.LIZIZ(R.id.jb7)).removeAllViews();
        }
    }

    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int i;
        int i2;
        B1K b1k;
        PaymentElement paymentElement;
        String paramValue;
        Integer num;
        kotlin.jvm.internal.o.LJIIIZ(elementDTO, "elementDTO");
        kotlin.jvm.internal.o.LJIIIZ(paymentMethod, "paymentMethod");
        super.LIZ(elementDTO, paymentMethod, list, obj);
        Context context = getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            getInputView().LIZ(R.id.eof).setLayoutDirection(0);
            getInputView().LIZ(R.id.eof).setTextAlignment(6);
        }
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        this.LJLLL = paymentMethod.subPaymentMethods;
        EO3.LIZLLL("payment_method");
        ImageView iconScanning = (ImageView) LIZIZ(R.id.eae);
        kotlin.jvm.internal.o.LJIIIIZZ(iconScanning, "iconScanning");
        if (C52969Kqb.LIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        iconScanning.setVisibility(i);
        C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.ea2), new ACListenerS32S0100000_12(this, 16));
        SD0 sd0 = this.LJLLLLLL;
        if (sd0 != null) {
            ((TextView) LIZIZ(R.id.eof)).removeTextChangedListener(sd0);
        }
        View LIZIZ = LIZIZ(R.id.eof);
        Configuration configuration = elementDTO.configuration;
        if (configuration != null && (num = configuration.maxLength) != null) {
            i2 = num.intValue();
        } else {
            i2 = 19;
        }
        this.LJLLLLLL = new SD0(this, LIZIZ, i2);
        ((TextView) LIZIZ(R.id.eof)).addTextChangedListener(this.LJLLLLLL);
        ((C71731SDf) LIZIZ(R.id.eod)).setOnEditTextFocusChangeListener(new IDCListenerS376S0100000_12(this, 1));
        ((C71731SDf) LIZIZ(R.id.eod)).setOnIndicatorVisibleChangeListener(new AqS178S0100000_12(this, 25));
        if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list)) != null && (paramValue = paymentElement.getParamValue()) != null && paramValue.length() != 0) {
            ((C71731SDf) LIZIZ(R.id.eod)).setText(paramValue);
        }
        ((TextView) LIZIZ(R.id.eof)).setImeOptions(6);
        TuxIconView tuxIconView = (TuxIconView) LIZIZ(R.id.eae);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS39S0200000_4(this, paymentMethod, 4));
        if (tuxIconView.getVisibility() == 0 && (b1k = this.LJLJLLL) != null) {
            b1k.LIZLLL("card_number_ocr");
        }
    }
}
