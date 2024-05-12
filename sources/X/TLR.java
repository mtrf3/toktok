package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TLR extends AbstractC65781Prl implements InterfaceC88472Yns<TLQ, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLR(boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LJLIL = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TLQ tlq) {
        TLQ it = tlq;
        o.LJIIIZ(it, "it");
        it.LIZ = this.LJLIL;
        it.LIZIZ = this.LJLILLLLZI;
        it.LJIIIIZZ = this.LJLJI;
        it.LJIIJ = new TLP(new AqS16S0010000_12(this.LJLJJL, 5), 7);
        it.LJIJ = this.LJLJJI;
        it.LJFF = !C52529KjV.LIZ();
        it.LIZJ = !InterfaceC44997HlJ.LJIILIIL.isDowngrade();
        if (C52529KjV.LIZ()) {
            it.LIZLLL = true;
            it.LJIIZILJ.LIZIZ = 0.0f;
        }
        it.LJIJI = C58B.LIZ();
        ArrayList arrayList = new ArrayList();
        String LJJI = ECommerceAnchorService.LJJJJI().LJJI();
        if (LJJI != null) {
            arrayList.add(LJJI);
        }
        it.LJIJJ = (String) ORZ.LJLLLL(arrayList);
        return C76800UCe.LIZ;
    }
}
