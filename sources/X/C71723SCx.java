package X;

import Y.ACListenerS32S0100000_12;
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

/* renamed from: X.SCx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71723SCx extends SD2 {
    public String LJLJJLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJL;
    public boolean LJLJLJ;
    public PaymentMethod LJLJLLL;
    public ElementDTO LJLL;
    public List<PaymentMethod> LJLLI;
    public String LJLLILLLL;
    public C71724SCy LJLLJ;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> LJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLLLLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public final S3L LL;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LLD;
    public final java.util.Map<Integer, View> LLF = new LinkedHashMap();

    @Override // X.SD2, X.C252989wM
    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LLF;
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
        return R.layout.a10;
    }

    public final View getOcrView() {
        C28121B1x.LIZ.getClass();
        if (!C28121B1x.LIZ()) {
            return LIZIZ(R.id.eae);
        }
        return LIZIZ(R.id.dbv);
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

    public final String getCurrentPaymentId() {
        return this.LJLLILLLL;
    }

    @Override // X.SD2, X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getFocusChange() {
        return this.LJLJL;
    }

    public final String getInputType() {
        return this.LJLJJLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnDelete() {
        return this.LJLLLLLL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnDeleteIconVisibleChange() {
        return this.LJLZ;
    }

    public final InterfaceC88472Yns<PaymentMethod, C76800UCe> getOnPaymentMethodIdentify() {
        return this.LJLLL;
    }

    @Override // X.SD2
    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LLD;
    }

    public final List<PaymentMethod> getPaymentList() {
        return this.LJLLI;
    }

    @Override // X.SD2
    public PaymentMethod getPaymentMethod() {
        return this.LJLJLLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getRequestOcr() {
        return this.LJLLLL;
    }

    public final boolean getTextHasFocus() {
        return this.LJLJLJ;
    }

    public C71723SCx(Context context) {
        super(context, null, 0);
        this.LJLJJLL = "";
        this.LJLJL = C34401Den.LJLIL;
        this.LJLLL = SDX.LJLIL;
        this.LJLLLL = C71728SDc.LJLIL;
        this.LJLLLLLL = C71727SDb.LJLIL;
        this.LJLZ = C34402Deo.LJLIL;
        this.LJZ = C79081V1x.LJII(4);
        this.LJZI = C79081V1x.LJII(25);
        this.LJZL = C79081V1x.LJII(16);
        S3I s3i = new S3I();
        s3i.LIZLLL = C79081V1x.LJII(2);
        this.LL = new S3L(s3i);
        this.LLD = SDR.LJLIL;
    }

    public final void LJFF(String str) {
        PaymentMethod paymentMethod;
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            List<PaymentMethod> list = this.LJLLI;
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
            LJI(C47261Igj.LJJIJ(str2));
            return;
        }
        LJI(C61878OQg.INSTANCE);
    }

    public final void LJI(List<String> list) {
        boolean z;
        int i;
        if ((!list.isEmpty()) && ((C71731SDf) LIZIZ(R.id.eod)).LIZ(R.id.eoe).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        setDelimiterVisible(z);
        C45804HyK.LJJLL(LIZIZ(R.id.jb7));
        ((ViewGroup) LIZIZ(R.id.jb7)).removeAllViews();
        if (list.size() > 7) {
            list = list.subList(0, 7);
        }
        int size = list.size();
        for (int childCount = ((ViewGroup) LIZIZ(R.id.jb7)).getChildCount(); childCount < size; childCount++) {
            ViewGroup viewGroup = (ViewGroup) LIZIZ(R.id.jb7);
            View smartImageView = new SmartImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJZI, this.LJZL);
            layoutParams.weight = 1.0f;
            smartImageView.setLayoutParams(layoutParams);
            smartImageView.setBackgroundResource(R.drawable.abg);
            viewGroup.addView(smartImageView);
        }
        int childCount2 = ((ViewGroup) LIZIZ(R.id.jb7)).getChildCount();
        for (int size2 = list.size(); size2 < childCount2; size2++) {
            View childAt = ((ViewGroup) LIZIZ(R.id.jb7)).getChildAt(size2);
            if (childAt != null) {
                childAt.setVisibility(8);
            }
        }
        C118234kV it = C47261Igj.LJJ(list).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            View childAt2 = ((ViewGroup) LIZIZ(R.id.jb7)).getChildAt(nextInt);
            if (childAt2 != null && (childAt2 instanceof SmartImageView)) {
                if (nextInt != C47261Igj.LJJI(list)) {
                    i = this.LJZ;
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
                kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
                LJIIIIZZ.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
                LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
                LJIIIIZZ.LJJIIJZLJL = (ImageView) childAt2;
                C16880lQ.LLJJJ(LJIIIIZZ);
                smartImageView2.setCircleOptions(this.LL);
            }
        }
        if (TextUtils.isEmpty(((C71731SDf) LIZIZ(R.id.eod)).getText())) {
            ((ViewGroup) LIZIZ(R.id.jb7)).removeAllViews();
            View scanWrapper = LIZIZ(R.id.jb7);
            kotlin.jvm.internal.o.LJIIIIZZ(scanWrapper, "scanWrapper");
            OUP.LJIJJLI(scanWrapper);
        }
    }

    public final void setCurrentPaymentId(String str) {
        this.LJLLILLLL = str;
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
        this.LJLL = elementDTO;
    }

    public final void setFocusChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJL = interfaceC88472Yns;
    }

    public final void setInputType(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.LJLJJLL = str;
    }

    public final void setOnDelete(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLLLLLL = interfaceC65784Pro;
    }

    public final void setOnDeleteIconVisibleChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLZ = interfaceC88472Yns;
    }

    public final void setOnPaymentMethodIdentify(InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLLL = interfaceC88472Yns;
    }

    @Override // X.SD2, X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LLD = interfaceC88472Yns;
    }

    public final void setPaymentList(List<PaymentMethod> list) {
        this.LJLLI = list;
    }

    @Override // X.SD2
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLJLLL = paymentMethod;
    }

    public final void setRequestOcr(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLLLL = interfaceC65784Pro;
    }

    public final void setTextHasFocus(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int i;
        int i2;
        PaymentElement paymentElement;
        String paramValue;
        Integer num;
        TuxIconView tuxIconView;
        kotlin.jvm.internal.o.LJIIIZ(paymentMethod, "paymentMethod");
        super.LIZ(elementDTO, paymentMethod, list, obj);
        if (C27500Aqm.LIZ()) {
            View ocrView = getOcrView();
            if ((ocrView instanceof TuxIconView) && (tuxIconView = (TuxIconView) ocrView) != null) {
                tuxIconView.setIconRes(R.raw.icon_camera);
            }
        }
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        this.LJLLI = paymentMethod.subPaymentMethods;
        EO3.LIZLLL("ccdc_card_info");
        View ocrView2 = getOcrView();
        if (ocrView2 != null) {
            if (C52969Kqb.LIZ()) {
                i = 0;
            } else {
                i = 8;
            }
            ocrView2.setVisibility(i);
        }
        ((TextView) LIZIZ(R.id.lw9)).setText(elementDTO.displayName);
        LIZIZ(R.id.ea2).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 173)));
        C71724SCy c71724SCy = this.LJLLJ;
        if (c71724SCy != null) {
            ((TextView) LIZIZ(R.id.eof)).removeTextChangedListener(c71724SCy);
        }
        View LIZIZ = LIZIZ(R.id.eof);
        Configuration configuration = elementDTO.configuration;
        if (configuration != null && (num = configuration.maxLength) != null) {
            i2 = num.intValue();
        } else {
            i2 = 19;
        }
        this.LJLLJ = new C71724SCy(this, LIZIZ, i2);
        ((TextView) LIZIZ(R.id.eof)).addTextChangedListener(this.LJLLJ);
        ((C71731SDf) LIZIZ(R.id.eod)).setOnEditTextFocusChangeListener(new IDCListenerS376S0100000_12(this, 5));
        ((C71731SDf) LIZIZ(R.id.eod)).setOnIndicatorVisibleChangeListener(new AqS178S0100000_12(this, 567));
        if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list)) != null && (paramValue = paymentElement.getParamValue()) != null && paramValue.length() != 0) {
            ((C71731SDf) LIZIZ(R.id.eod)).setText(paramValue);
        }
        ((TextView) LIZIZ(R.id.eof)).setImeOptions(6);
        View ocrView3 = getOcrView();
        if (ocrView3 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 174), ocrView3);
            if (ocrView3.getVisibility() == 0) {
                C28112B1o.LJ("card_number_ocr", null);
            }
        }
    }
}
