package X;

import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;

/* renamed from: X.a9Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92356a9Q extends C92219a7D {
    public final InterfaceC88472Yns<String, C76800UCe> LJIIZILJ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIJ;

    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ() {
        return this.LJIJ;
    }

    public C92356a9Q(List list, Elements elements, InterfaceC88472Yns interfaceC88472Yns) {
        super(elements, (Integer) Collections.max(list), true, "", interfaceC88472Yns, null, null, 418);
        this.LJIIZILJ = new IDqS418S0100000_31(this, 48);
        this.LJIJ = new IDqS418S0100000_31(this, 46);
        C92186a6g c92186a6g = new C92186a6g(list);
        this.LJ = ORZ.LLIIIZ(C47261Igj.LJJIJ(c92186a6g), this.LJ);
    }
}
