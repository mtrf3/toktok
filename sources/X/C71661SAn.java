package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.SAn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71661SAn extends F9E implements SBC, SBP {
    public final PaymentMethod LJLIL;
    public final java.util.Map<String, ElementDTO> LJLILLLLZI;
    public C117114ih LJLJI = new C117114ih(C79081V1x.LJII(16), 0, 0, 0, false, 0, true, 254);
    public String LJLJJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
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

    @Override // X.SBP
    public final void LJLLLLLL(C117114ih c117114ih) {
        this.LJLJI = c117114ih;
    }

    @Override // X.SBC
    public final void LLIIIJ(Object obj) {
        String str;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LJLJJI = str;
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

    public C71661SAn(PaymentMethod paymentMethod, java.util.Map<String, ElementDTO> map) {
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = map;
    }
}
