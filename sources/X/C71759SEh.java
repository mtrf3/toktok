package X;

import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.SEh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71759SEh extends LinearLayout implements B1Z {
    public static final /* synthetic */ int LJLLJ = 0;
    public PaymentMethod LJLIL;
    public ElementDTO LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLJJL;
    public B1K LJLJJLL;
    public InterfaceC88472Yns<? super B0F, C76800UCe> LJLJL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJLJ;
    public Address LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.kww);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.kww);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final TuxIconView getIconView() {
        return (TuxIconView) this.LJLLI.getValue();
    }

    @Override // X.B1Z
    public List<PaymentElement> getValue() {
        List<PaymentElement> value;
        IDObjectS332S0100000_12 iDObjectS332S0100000_12 = new IDObjectS332S0100000_12(this, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS332S0100000_12.iterator();
        while (true) {
            IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
            if (iDObjectS5S0101000_12.hasNext()) {
                KeyEvent.Callback callback = (View) iDObjectS5S0101000_12.next();
                if ((callback instanceof B1Z) && (value = ((B1Z) callback).getValue()) != null) {
                    arrayList.add(value);
                }
            } else {
                return C32I.LJJLI(arrayList);
            }
        }
    }

    @Override // X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLILLLLZI;
    }

    public final B1K getLogger() {
        return this.LJLJJLL;
    }

    public final InterfaceC88472Yns<B0F, C76800UCe> getOnRegionPanelStatus() {
        return this.LJLJL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnUseShippingAddressChange() {
        return this.LJLJLJ;
    }

    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLJJL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LJLIL;
    }

    public final Address getShippingAddress() {
        return this.LJLJLLL;
    }

    public final boolean getUseShippingAddress() {
        return this.LJLL;
    }

    public C71759SEh(Context context) {
        super(context, null, 0);
        this.LJLJI = (int) KL2.LIZJ(context, 14.0f);
        this.LJLJJI = (int) KL2.LIZJ(context, 4.0f);
        this.LJLJJL = C71760SEi.LJLIL;
        this.LJLJL = C71761SEj.LJLIL;
        this.LJLJLJ = C34397Dej.LJLIL;
        this.LJLL = true;
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0200000_4(context, this, 2));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        View.inflate(context, R.layout.xg, this);
        View switchLine = LIZIZ(R.id.kww);
        o.LJIIIIZZ(switchLine, "switchLine");
        C26338AVi.LJI(switchLine, null, 0, null, null, false, 29);
        C16300kU.LJIILLIIL(LIZIZ(R.id.kww), null);
    }

    public final void setAllElementsVisible(boolean z) {
        int i;
        Iterator it = new IDObjectS332S0100000_12(this, 1).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof B1Z) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLILLLLZI = elementDTO;
    }

    public final void setLogger(B1K b1k) {
        this.LJLJJLL = b1k;
    }

    public final void setOnRegionPanelStatus(InterfaceC88472Yns<? super B0F, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJL = interfaceC88472Yns;
    }

    public final void setOnUseShippingAddressChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLJ = interfaceC88472Yns;
    }

    @Override // X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJL = interfaceC88472Yns;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLIL = paymentMethod;
    }

    public final void setShippingAddress(Address address) {
        this.LJLJLLL = address;
    }

    public final void setUseShippingAddress(boolean z) {
        this.LJLL = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x00a4, code lost:
    
        if (r8 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a A[EDGE_INSN: B:30:0x017a->B:31:0x017a BREAK  A[LOOP:0: B:21:0x008f->B:28:0x008f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0185  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.B1Z] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.B1Z] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // X.B1Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r21, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r22, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71759SEh.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.List, java.lang.Object):void");
    }
}
