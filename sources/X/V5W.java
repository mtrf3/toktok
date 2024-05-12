package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5W extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC10220ag, C76800UCe> {
    public final /* synthetic */ List<V7Q> LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ List<V7Q> LJLJI;
    public final /* synthetic */ InterfaceC07790Sh LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ float LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJLJ;
    public final /* synthetic */ List<String> LJLJLLL;
    public final /* synthetic */ V7U LJLL;
    public final /* synthetic */ int LJLLI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLLILLLL;
    public final /* synthetic */ int LJLLJ;
    public final /* synthetic */ float LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V5W(List<V7Q> list, Integer num, List<V7Q> list2, InterfaceC07790Sh interfaceC07790Sh, float f, boolean z, float f2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, List<String> list3, V7U v7u, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i2, float f3) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = num;
        this.LJLJI = list2;
        this.LJLJJI = interfaceC07790Sh;
        this.LJLJJL = f;
        this.LJLJJLL = z;
        this.LJLJL = f2;
        this.LJLJLJ = interfaceC88472Yns;
        this.LJLJLLL = list3;
        this.LJLL = v7u;
        this.LJLLI = i;
        this.LJLLILLLL = interfaceC65784Pro;
        this.LJLLJ = i2;
        this.LJLLL = f3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC10220ag interfaceC10220ag) {
        InterfaceC10220ag LazyColumn = interfaceC10220ag;
        o.LJIIIZ(LazyColumn, "$this$LazyColumn");
        List<V7Q> list = this.LJLIL;
        LazyColumn.LIZIZ(list.size(), null, new AqS167S0100000_1(list, (List<VoucherInfoNew>) 466), C1DJ.LJFF(new V5Y(list, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, list, this.LJLJI, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI), -1091073711, true));
        Integer num = this.LJLILLLLZI;
        if (num != null && num.intValue() < this.LJLJI.size()) {
            LazyColumn.LIZ(null, null, C1DJ.LJFF(new V57(this.LJLJJI, this.LJLJJL, this.LJLLILLLL, this.LJLLJ, this.LJLJJLL, this.LJLJL), -1484934226, true));
        }
        LazyColumn.LIZ(null, null, C1DJ.LJFF(new V58(this.LJLJJI, this.LJLLL), -1908782295, true));
        return C76800UCe.LIZ;
    }
}
