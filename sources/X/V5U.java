package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5U extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC10220ag, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ A4T LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<List<A4Y>> LJLJL;
    public final /* synthetic */ V7H LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5U(boolean z, A4T a4t, boolean z2, boolean z3, C1OH c1oh, int i, InterfaceC35811ar interfaceC35811ar, V7H v7h, boolean z4) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = a4t;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = c1oh;
        this.LJLJJLL = i;
        this.LJLJL = interfaceC35811ar;
        this.LJLJLJ = v7h;
        this.LJLJLLL = z4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC10220ag interfaceC10220ag) {
        InterfaceC10220ag LazyColumn = interfaceC10220ag;
        o.LJIIIZ(LazyColumn, "$this$LazyColumn");
        LazyColumn.LIZ(null, null, C1DJ.LJFF(new V5T(this.LJLJJI, this.LJLILLLLZI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ), 1005617699, true));
        LazyColumn.LIZ(null, null, V7F.LIZ);
        if (this.LJLIL && this.LJLILLLLZI.getCanReview()) {
            LazyColumn.LIZ(null, null, C1DJ.LJFF(new V6Y(this.LJLJLJ, this.LJLJJLL), 1359123966, true));
        }
        List LJFF = V5R.LJFF(this.LJLILLLLZI.getCollectionId(), this.LJLILLLLZI.getList(), this.LJLJL.getValue());
        LazyColumn.LIZIZ(LJFF.size(), null, new AqS167S0100000_1(LJFF, (List<VoucherInfoNew>) 274), C1DJ.LJFF(new V6H(LJFF, this.LJLJLJ, this.LJLJJLL), -1091073711, true));
        LazyColumn.LIZ(null, null, C1DJ.LJFF(new V5V(this.LJLJLLL, this.LJLILLLLZI, this.LJLJJLL), -2080448165, true));
        if (this.LJLJI && (!this.LJLILLLLZI.getList().isEmpty())) {
            LazyColumn.LIZ(null, null, V7F.LIZIZ);
        }
        return C76800UCe.LIZ;
    }
}
