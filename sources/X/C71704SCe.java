package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SCe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71704SCe implements InterfaceC71708SCi {
    public final ElementDTO LJLIL;
    public final PaymentMethod LJLILLLLZI;
    public final AbstractC38911fr LJLJI;
    public final int LJLJJI;
    public final C71706SCg LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC71708SCi
    public final List<PaymentElement> LJJLL() {
        InterfaceC71722SCw interfaceC71722SCw = this.LJLJJL.LIZ;
        if (interfaceC71722SCw != null) {
            return interfaceC71722SCw.LIZLLL(this.LJLIL);
        }
        return null;
    }

    public final int hashCode() {
        return ((((this.LJLJI.hashCode() + ((this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31)) * 31) + this.LJLJJI) * 31) + this.LJLJJL.LIZLLL;
    }

    @Override // X.InterfaceC71708SCi
    public final String x() {
        SAN san = SAN.LIZ;
        String str = this.LJLIL.id;
        san.getClass();
        return SAN.LIZJ(str);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NormalTextInputItem(elementDTO=");
        LIZ.append(this.LJLIL);
        LIZ.append(", paymentMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", adapter=");
        LIZ.append(this.LJLJI);
        LIZ.append(", inputType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", changeAble=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC71708SCi
    public final C71706SCg LLJLLL() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC71708SCi
    public final ElementDTO getElementDTO() {
        return this.LJLIL;
    }

    public final C71704SCe LIZIZ(C71706SCg c71706SCg) {
        this.LJLJJL.getClass();
        InterfaceC71722SCw interfaceC71722SCw = c71706SCg.LIZ;
        C71735SDj error = c71706SCg.LIZIZ;
        int i = c71706SCg.LIZJ;
        o.LJIIIZ(error, "error");
        C71706SCg c71706SCg2 = new C71706SCg(0);
        c71706SCg2.LIZ = interfaceC71722SCw;
        c71706SCg2.LIZIZ = error;
        c71706SCg2.LIZJ = i;
        return LIZ(this, c71706SCg2);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71704SCe)) {
            return false;
        }
        C71704SCe c71704SCe = (C71704SCe) obj;
        if (o.LJ(this.LJLIL, c71704SCe.LJLIL) && o.LJ(this.LJLILLLLZI, c71704SCe.LJLILLLLZI) && o.LJ(this.LJLJI, c71704SCe.LJLJI) && this.LJLJJI == c71704SCe.LJLJJI && o.LJ(this.LJLJJL, c71704SCe.LJLJJL)) {
            return true;
        }
        return false;
    }

    public static C71704SCe LIZ(C71704SCe c71704SCe, C71706SCg c71706SCg) {
        ElementDTO elementDTO = c71704SCe.LJLIL;
        PaymentMethod paymentMethod = c71704SCe.LJLILLLLZI;
        AbstractC38911fr adapter = c71704SCe.LJLJI;
        int i = c71704SCe.LJLJJI;
        c71704SCe.getClass();
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(adapter, "adapter");
        return new C71704SCe(elementDTO, paymentMethod, adapter, i, c71706SCg);
    }

    public C71704SCe(ElementDTO elementDTO, PaymentMethod paymentMethod, AbstractC38911fr adapter, int i, C71706SCg changeAble) {
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(changeAble, "changeAble");
        this.LJLIL = elementDTO;
        this.LJLILLLLZI = paymentMethod;
        this.LJLJI = adapter;
        this.LJLJJI = i;
        this.LJLJJL = changeAble;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C71704SCe(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r2, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3, X.AbstractC118814lR r4, int r5, int r6) {
        /*
            r1 = this;
            r0 = r6 & 4
            if (r0 == 0) goto L9
            X.SCj r4 = new X.SCj
            r4.<init>()
        L9:
            r0 = r6 & 8
            if (r0 == 0) goto Le
            r5 = 1
        Le:
            r0 = r6 & 16
            if (r0 == 0) goto L1c
            X.SCg r6 = new X.SCg
            r0 = 0
            r6.<init>(r0)
        L18:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L1c:
            r6 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71704SCe.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, X.4lR, int, int):void");
    }
}
