package X;

import Y.ACListenerS22S0301000_12;
import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SEu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71772SEu extends LinearLayout implements B1Z {
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLIL;
    public PaymentMethod LJLILLLLZI;
    public ElementDTO LJLJI;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> LJLJJI;
    public B1K LJLJJL;
    public final List<String> LJLJJLL;
    public PaymentMethod LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    public final void LIZIZ() {
        IDObjectS332S0100000_12 iDObjectS332S0100000_12 = new IDObjectS332S0100000_12(this, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS332S0100000_12.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof C71773SEv) && view != null) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C71773SEv c71773SEv = (C71773SEv) it2.next();
            if (c71773SEv.LIZIZ()) {
                c71773SEv.setChecked(false);
            }
        }
    }

    @Override // X.B1Z
    public List<PaymentElement> getValue() {
        Boolean bool;
        String str;
        String str2;
        IDObjectS332S0100000_12 iDObjectS332S0100000_12 = new IDObjectS332S0100000_12(this, 4);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS332S0100000_12.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if ((view instanceof C71773SEv) && view != null) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C71773SEv) next).LIZIZ()) {
                if (next != null) {
                    ElementDTO elementDTO = getElementDTO();
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
                    ElementDTO elementDTO3 = getElementDTO();
                    if (elementDTO3 != null) {
                        bool = elementDTO3.needEncryption;
                    }
                    return C47261Igj.LJJIJ(new PaymentElement(str, str2, null, bool, null, 16, null));
                }
            }
        }
        return C61878OQg.INSTANCE;
    }

    public final boolean getAutoSelect() {
        return this.LJLJLLL;
    }

    public final boolean getDefaultChoose() {
        return this.LJLJLJ;
    }

    @Override // X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJI;
    }

    public final InterfaceC88472Yns<PaymentMethod, C76800UCe> getOnSubPaymentCheckChanged() {
        return this.LJLJJI;
    }

    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLIL;
    }

    public final B1K getPaymentLogger() {
        return this.LJLJJL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71772SEu(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = C71774SEw.LJLIL;
        this.LJLJJI = C71775SEx.LJLIL;
        this.LJLJJLL = new ArrayList();
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
    }

    public final void setAutoSelect(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setDefaultChoose(boolean z) {
        this.LJLJLJ = z;
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJI = elementDTO;
    }

    public final void setOnSubPaymentCheckChanged(InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLIL = interfaceC88472Yns;
    }

    public final void setPaymentLogger(B1K b1k) {
        this.LJLJJL = b1k;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLILLLLZI = paymentMethod;
    }

    @Override // X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        PaymentMethod subPaymentMethod;
        Availability availability;
        String str;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        this.LJLJL = paymentMethod.LIZ;
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        IDObjectS332S0100000_12 iDObjectS332S0100000_12 = new IDObjectS332S0100000_12(this, 5);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS332S0100000_12.iterator();
        while (true) {
            IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
            if (!iDObjectS5S0101000_12.hasNext()) {
                break;
            }
            Object next = iDObjectS5S0101000_12.next();
            if (next instanceof C71773SEv) {
                arrayList.add(next);
            }
        }
        List list2 = paymentMethod.subPaymentMethods;
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        Object obj2 = null;
        boolean z = true;
        if (list2.size() > arrayList.size()) {
            C118234kV it2 = new C40517FvF(1, list2.size() - arrayList.size()).iterator();
            int i = 0;
            while (it2.LJLJI) {
                it2.nextInt();
                int i2 = i + 1;
                if (i >= 0) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    View c71773SEv = new C71773SEv(context);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.leftMargin = C79081V1x.LJII(60);
                    marginLayoutParams.topMargin = C79081V1x.LJII(6);
                    marginLayoutParams.bottomMargin = C79081V1x.LJII(6);
                    marginLayoutParams.setMarginStart(C79081V1x.LJII(44));
                    c71773SEv.setLayoutParams(marginLayoutParams);
                    c71773SEv.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0301000_12(c71773SEv, this, paymentMethod, i, 1)));
                    addView(c71773SEv);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else if (list2.size() < arrayList.size()) {
            removeViews(0, arrayList.size() - list2.size());
        }
        int i3 = 0;
        for (Object obj3 : list2) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                PaymentMethod subPaymentMethod2 = (PaymentMethod) obj3;
                View childAt = getChildAt(i3);
                o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.SubPaymentView");
                C71773SEv c71773SEv2 = (C71773SEv) childAt;
                o.LJIIIZ(subPaymentMethod2, "subPaymentMethod");
                c71773SEv2.LJLIL = subPaymentMethod2;
                String str2 = subPaymentMethod2.iconUrl;
                if (str2 != null) {
                    Context context2 = c71773SEv2.getContext();
                    o.LJIIIIZZ(context2, "context");
                    Drawable LJIIIIZZ = C79045V0n.LJIIIIZZ(R.attr.cv, context2);
                    W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str2);
                    LJIIIIZZ2.LJIILIIL = LJIIIIZZ;
                    LJIIIIZZ2.LJJIIJZLJL = (ImageView) c71773SEv2.LIZ(R.id.ex2);
                    C16880lQ.LLJJJ(LJIIIIZZ2);
                }
                ((TextView) c71773SEv2.LIZ(R.id.ly0)).setText(subPaymentMethod2.displayName);
                c71773SEv2.LIZJ();
                c71773SEv2.LIZLLL();
                c71773SEv2.setEnabled(z);
                c71773SEv2.LIZ(R.id.ex2).setAlpha(1.0f);
                ((TuxTextView) c71773SEv2.LIZ(R.id.ly0)).setTextColorRes(R.attr.go);
                ((TuxTextView) c71773SEv2.LIZ(R.id.lwg)).setTextColorRes(R.attr.eb);
                ((TuxTextView) c71773SEv2.LIZ(R.id.lwf)).setTextColorRes(R.attr.eb);
                Availability availability2 = subPaymentMethod2.availability;
                if (availability2 != null && o.LJ(availability2.isAvailable, Boolean.FALSE)) {
                    ((TuxTextView) c71773SEv2.LIZ(R.id.ly0)).setTextColorRes(R.attr.gp);
                    ((TuxTextView) c71773SEv2.LIZ(R.id.lwg)).setTextColorRes(R.attr.gp);
                    ((TuxTextView) c71773SEv2.LIZ(R.id.lwf)).setTextColorRes(R.attr.gp);
                    c71773SEv2.LIZ(R.id.ex2).setAlpha(0.3f);
                    c71773SEv2.setEnabled(false);
                }
                if (!((ArrayList) this.LJLJJLL).contains(subPaymentMethod2.LJFF())) {
                    boolean LIZIZ = C61841OOv.LIZIZ(this.LJLJL, subPaymentMethod2);
                    B1K b1k = this.LJLJJL;
                    if (b1k != null) {
                        String LJIIL = paymentMethod.LJIIL();
                        String LJIIL2 = subPaymentMethod2.LJIIL();
                        boolean LJJJZ = C78685UuP.LJJJZ(subPaymentMethod2.extraInfo);
                        Availability availability3 = subPaymentMethod2.availability;
                        if (availability3 != null) {
                            str = availability3.statusCode;
                        } else {
                            str = null;
                        }
                        b1k.LJIIZILJ(LJIIL, LJIIL2, i3, LJJJZ, str, Boolean.valueOf(LIZIZ), null, null);
                    }
                    ((ArrayList) this.LJLJJLL).add(subPaymentMethod2.LJFF());
                }
                i3 = i4;
                z = true;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (paymentMethod.LIZ != null) {
            this.LJLJLLL = !C61841OOv.LIZIZ(B1K.LJIILIIL, r1);
            this.LJLJLJ = false;
            LIZIZ();
            Iterator it3 = ((ArrayList) C40658FxW.LJJZZIII(new IDObjectS332S0100000_12(this, 6), C71773SEv.class)).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (C61841OOv.LIZIZ(((C71773SEv) next2).getSubPaymentMethod(), paymentMethod.LIZ)) {
                    obj2 = next2;
                    break;
                }
            }
            View view = (View) obj2;
            if (view != null) {
                view.performClick();
                return;
            }
            return;
        }
        LIZIZ();
        C71773SEv c71773SEv3 = (C71773SEv) ORZ.LJLLLLLL(0, C40658FxW.LJJZZIII(new IDObjectS332S0100000_12(this, 7), C71773SEv.class));
        if (c71773SEv3 != null && (subPaymentMethod = c71773SEv3.getSubPaymentMethod()) != null && (availability = subPaymentMethod.availability) != null && o.LJ(availability.isAvailable, Boolean.TRUE)) {
            this.LJLJLJ = z;
            this.LJLJLLL = z;
            c71773SEv3.performClick();
            return;
        }
        this.LJLJLLL = false;
    }
}
