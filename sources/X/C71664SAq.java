package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SAq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71664SAq implements InterfaceC71722SCw {
    public final CharSequence LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC71722SCw
    public final String[] LJ() {
        return new String[]{this.LIZ.toString()};
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StringInputElement(textValue=");
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

    @Override // X.InterfaceC71722SCw
    public final Object value() {
        return this.LIZ;
    }

    public C71664SAq(CharSequence textValue) {
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
        o.LJIIIZ(e, "e");
        PaymentElement LIZ = e.LIZ();
        LIZ.setParamValue(this.LIZ.toString());
        return C47261Igj.LJJIJ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C71664SAq) && o.LJ(this.LIZ, ((C71664SAq) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
