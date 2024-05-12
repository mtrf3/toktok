package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.SBe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71678SBe implements SBC, SBP {
    public final PaymentMethod LJLIL;
    public final java.util.Map<String, ElementDTO> LJLILLLLZI;
    public String LJLJI;
    public final Object LJLJJI;
    public C117114ih LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71678SBe)) {
            return false;
        }
        C71678SBe c71678SBe = (C71678SBe) obj;
        return o.LJ(this.LJLIL, c71678SBe.LJLIL) && o.LJ(this.LJLILLLLZI, c71678SBe.LJLILLLLZI) && o.LJ(this.LJLJI, c71678SBe.LJLJI) && o.LJ(this.LJLJJI, c71678SBe.LJLJJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.SBC
    public final List<String> getIds() {
        java.util.Map<String, ElementDTO> map = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, ElementDTO>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().id);
        }
        return arrayList;
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C12400eC.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        String str = this.LJLJI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJLJJI.hashCode() + ((LIZ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("USRegionInputElementItem(ccdcPaymentMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", addressElementDTOMap=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", error=");
        LIZ.append(this.LJLJI);
        LIZ.append(", update=");
        return U26.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.SBP
    public final void LJLLLLLL(C117114ih c117114ih) {
        this.LJLJJL = c117114ih;
    }

    @Override // X.SBC
    public final void LLIIIJ(Object obj) {
        String str;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LJLJI = str;
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

    public C71678SBe(PaymentMethod paymentMethod, java.util.Map<String, ElementDTO> map, String str, Object update) {
        o.LJIIIZ(update, "update");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = map;
        this.LJLJI = str;
        this.LJLJJI = update;
        this.LJLJJL = new C117114ih(C79081V1x.LJII(16), 0, 0, 0, false, 0, true, 254);
    }
}
