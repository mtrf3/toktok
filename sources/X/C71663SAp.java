package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.List;
import ujb.o;

/* renamed from: X.SAp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71663SAp implements InterfaceC71722SCw {
    public final CharSequence LIZ;
    public int LIZIZ = -1;

    @Override // X.InterfaceC71722SCw
    public final String[] LJ() {
        return new String[]{value().toString()};
    }

    @Override // X.InterfaceC71722SCw
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final CharSequence value() {
        return o.LJJJJZ(this.LIZ.toString(), " ", "", false);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardNumberInputElement(textValue=");
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

    public C71663SAp(CharSequence charSequence) {
        this.LIZ = charSequence;
    }

    @Override // X.InterfaceC71722SCw
    public final void LIZJ(int i) {
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC71722SCw
    public final List<PaymentElement> LIZLLL(ElementDTO e) {
        kotlin.jvm.internal.o.LJIIIZ(e, "e");
        String str = e.LIZ;
        if (str == null) {
            str = e.id;
        }
        PaymentElement copy$default = PaymentElement.copy$default(e.LIZ(), str, null, null, null, null, 30, null);
        copy$default.setParamValue(value().toString());
        return C47261Igj.LJJIJ(copy$default);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C71663SAp) && kotlin.jvm.internal.o.LJ(this.LIZ, ((C71663SAp) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
