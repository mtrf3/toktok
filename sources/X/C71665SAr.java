package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SAr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71665SAr implements InterfaceC71722SCw {
    public final CharSequence LIZ;
    public int LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC71722SCw
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final List<String> value() {
        List LJLJJL = s.LJLJJL(this.LIZ, new String[]{"/"}, 0, 6);
        return C47261Igj.LJJIJIIJI(ORZ.LJLLLLLL(1, LJLJJL), ORZ.LJLLLLLL(0, LJLJJL));
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC71722SCw
    public final String[] LJ() {
        List<String> value = value();
        Object LJLLLLLL = ORZ.LJLLLLLL(0, value);
        Object obj = "";
        if (LJLLLLLL == null) {
            LJLLLLLL = "";
        }
        Object LJLLLLLL2 = ORZ.LJLLLLLL(1, value);
        if (LJLLLLLL2 != null) {
            obj = LJLLLLLL2;
        }
        return new String[]{LJLLLLLL, obj};
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DateInputElement(textValue=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC71722SCw
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC71722SCw
    public final CharSequence LIZIZ() {
        return this.LIZ;
    }

    public C71665SAr(CharSequence textValue) {
        o.LJIIIZ(textValue, "textValue");
        this.LIZ = textValue;
        this.LIZIZ = -1;
    }

    @Override // X.InterfaceC71722SCw
    public final void LIZJ(int i) {
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC71722SCw
    public final List<PaymentElement> LIZLLL(ElementDTO e) {
        ElementDTO elementDTO;
        ElementDTO elementDTO2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        Boolean bool2;
        ElementDTO elementDTO3;
        ElementDTO elementDTO4;
        o.LJIIIZ(e, "e");
        List<String> value = value();
        String str4 = (String) ORZ.LJLLLLLL(0, value);
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = (String) ORZ.LJLLLLLL(1, value);
        if (str6 != null) {
            str5 = str6;
        }
        List<ElementDTO> list = e.subElementDTOList;
        String str7 = null;
        if (list != null) {
            Iterator<ElementDTO> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    elementDTO4 = it.next();
                    if (ORZ.LJLJJI(elementDTO4.id, C71691SBr.LIZIZ)) {
                        break;
                    }
                } else {
                    elementDTO4 = null;
                    break;
                }
            }
            elementDTO = elementDTO4;
        } else {
            elementDTO = null;
        }
        List<ElementDTO> list2 = e.subElementDTOList;
        if (list2 != null) {
            Iterator<ElementDTO> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    elementDTO3 = it2.next();
                    if (ORZ.LJLJJI(elementDTO3.id, C71691SBr.LIZJ)) {
                        break;
                    }
                } else {
                    elementDTO3 = null;
                    break;
                }
            }
            elementDTO2 = elementDTO3;
        } else {
            elementDTO2 = null;
        }
        PaymentElement[] paymentElementArr = new PaymentElement[2];
        if (elementDTO != null) {
            str = elementDTO.id;
            str2 = elementDTO.paramName;
            bool = elementDTO.needEncryption;
        } else {
            str = null;
            str2 = null;
            bool = null;
        }
        paymentElementArr[0] = new PaymentElement(str, str2, str5, bool, null, 16, null);
        if (elementDTO2 != null) {
            str7 = elementDTO2.id;
            str3 = elementDTO2.paramName;
            bool2 = elementDTO2.needEncryption;
        } else {
            str3 = null;
            bool2 = null;
        }
        paymentElementArr[1] = new PaymentElement(str7, str3, str4, bool2, null, 16, null);
        return C47261Igj.LJJIJIIJI(paymentElementArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C71665SAr) && o.LJ(this.LIZ, ((C71665SAr) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
